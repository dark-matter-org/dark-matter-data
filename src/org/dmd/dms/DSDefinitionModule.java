//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dms;

import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcObject;
import org.dmd.dmc.types.DefinitionName;
import org.dmd.dms.generated.dmw.DSDefinitionModuleDMW;
import org.dmd.dms.generated.dmw.DSDefinitionModuleIterableDMW;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.codegen.MemberManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

/**
 * The DSDefinitionModule is used to describe the base characteristics of a set
 * of Domain Specific Definitions (DSDs).
 */
public class DSDefinitionModule extends DSDefinitionModuleDMW {
	
	TreeMap<DefinitionName,DSDefinitionModule>	ddmDependencies;
	
	public DSDefinitionModule(){
		
	}
	
	public DSDefinitionModule(DmcObject obj){
		super(obj);
	}
	
	public DSDefinitionModule (DmcObject obj, ClassDefinition cd){
		super(obj,cd);
	}
	
	/**
	 * @return the set of module types on which this module may depend.
	 */
	public Iterator<DSDefinitionModule> getDDMDependencies(){
		if (ddmDependencies == null){
			ddmDependencies = new TreeMap<DefinitionName, DSDefinitionModule>();
			determineDDMDependencies(this, ddmDependencies);
		}
		return(ddmDependencies.values().iterator());
	}
	
	/**
	 * This method will recurse over the set of module type dependencies via the refersToDefsFromDSD
	 * attribute to build a complete set of module types to which a module may refer.
	 * @param module the module at the current level
	 * @param dep the complete set of dependencies
	 */
	void determineDDMDependencies(DSDefinitionModule module, TreeMap<DefinitionName, DSDefinitionModule> dep){
		dep.put(module.getName(), module);
		
		if (module.getRefersToDefsFromDSDSize() > 0){
			DSDefinitionModuleIterableDMW it = module.getRefersToDefsFromDSD();
			while(it.hasNext()){
				DSDefinitionModule ddm = it.next();
				if (dep.get(ddm.getName()) == null)
					determineDDMDependencies(ddm, dep);
			}
		}
	}
	
	/**
	 * @return the full package name of the generated.dsd package associated with this module.
	 */
	public String getGeneratedDsdPackage(){
		ClassDefinition dsd = (ClassDefinition) this.getBaseDefinition();

		// Note: only the DMW iterator import will give us the base generated directory for DMW classes
		int genindex = dsd.getDmwIteratorImport().indexOf("generated");
		String frontPart = dsd.getDmwIteratorImport().substring(0, genindex);
		
		return(frontPart + "generated.dsd");
	}
	
	public String getGlobalInterfaceImport(){
		return(getGeneratedDsdPackage() + "." + getName() + "GlobalInterface");
	}
	
	/**
	 * @return the full package name of the generated.dsd package associated with this module.
	 */
	public String getGeneratedDmoPackage(){
		ClassDefinition dsd = (ClassDefinition) this.getBaseDefinition();

		// Note: only the DMW iterator import will give us the base generated directory for DMW classes
		int genindex = dsd.getDmoImport().indexOf("generated");
		String frontPart = dsd.getDmoImport().substring(0, genindex);
		
		return(frontPart + "generated.dsd");
	}
	
	public String getDMOGlobalInterfaceImport(){
		return(getGeneratedDmoPackage() + "." + getName() + "GlobalInterface");
	}
	
	public String getGlobalInterfaceName(){
		return(getName() + "GlobalInterface");
	}
	
	public String getDefinitionsInterfaceImport(){
		return(getGeneratedDsdPackage() + "." + getName() + "DefinitionsIF");
	}
	
	public String getDefinitionsInterfaceName(){
		return(getName() + "DefinitionsIF");
	}
	
	public String getGeneratorInterfaceImport(){
		return(getGeneratedDsdPackage() + "." + getName() + "GeneratorInterface");
	}
	
	public String getGeneratorInterfaceName(){
		return(getName() + "GeneratorInterface");
	}
	
	public String getScopedInterfaceImport(){
		return(getGeneratedDsdPackage() + "." + getName() + "ScopedInterface");
	}
	
	public String getScopedInterfaceName(){
		return(getName() + "ScopedInterface");
	}
	
	public String getDefinitionManagerImport(){
		return(getGeneratedDsdPackage() + "." + getName() + "DefinitionManager");
	}
	
	public String getModuleImport(){
		return(getGeneratedDsdPackage() + "." + getName());
	}
	
	public String getDefinitionManagerName(){
		return(getName() + "DefinitionManager");
	}
	
	public String getDefinitionParserImport(){
		return(getGeneratedDsdPackage() + "." + getName() + "Parser");
	}
	
	public String getDefinitionParserName(){
		return(getName() + "Parser");
	}
	
	public void getScopedInterfaceMembers(MemberManager members, String module){
		ClassDefinition dsd = (ClassDefinition) getBaseDefinition();
		
//		out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
//		out.write("    DmcDefinitionSet<" + dsd.getName() + "> " + dsd.getName() + "Defs;\n");
		
		members.addMember("DmcDefinitionSet<" + dsd.getName() + "> ", dsd.getName() + "Defs", "new " + "DmcDefinitionSet<" + dsd.getName() + ">(\"" + module + "-allDefinitions\",\"" + dsd.getName() + "\")", "All definitions associated with this module");
		
		TreeMap<DefinitionName,ClassDefinition> allDerived = dsd.getAllDerived();
		for(ClassDefinition cd : allDerived.values()){
//			out.write("    DmcDefinitionSet<" + cd.getName() + "> " + cd.getName() + "Defs;\n");			
			members.addMember("DmcDefinitionSet<" + cd.getName() + "> ", cd.getName() + "Defs", "new " + "DmcDefinitionSet<" + cd.getName() + ">(\"" + module + "-" + cd.getName() + "Defs\", \"" + cd.getName() + "\")", "All " + cd.getName() + " definitions");
		}
		
	}
	
	/**
	 * Populates the ImportManager with the definitions for just this DSD module.
	 * @param imports the place to store the imports.
	 * @param scoped indicates if the imports are for the scoped interface (which doesn't include the
	 * module itself) or for the global interface
	 */
	public void getImportsForInterface(ImportManager imports, boolean scoped){
		ClassDefinition dsd = (ClassDefinition) this.getBaseDefinition();
		
		imports.addImport(dsd.getDmeImport(), "A definition from the " + this.getName() + " Module");
		imports.addImport("java.util.Iterator", "To allow access to our definitions");
		imports.addImport("org.dmd.dmc.types.DotName", "To support the find method for definitions");
		imports.addImport("org.dmd.util.exceptions.ResultException", "To support definition deletions");
		
		TreeMap<DefinitionName,ClassDefinition> allDerived = dsd.getAllDerived();
		for(ClassDefinition cd : allDerived.values()){
			if (scoped){
				// If the class has the same name as this module definition, it's the 
				// internally generated class to represent the module and we don't want
				// that in the case of the scoped interface.
				if (cd.getName().getNameString().equals(getName().getNameString()))
					continue;
			}
			imports.addImport(cd.getDmeImport(), "A definition from the " + this.getName() + " Module");
		}
	}
	
	/**
	 * Populates the ImportManager with the definitions for just this DSD module.
	 * @param imports the place to store the imports.
	 * @param scoped indicates if the imports are for the scoped interface (which doesn't include the
	 * module itself) or for the global interface
	 */
	public void getDMOImportsForInterface(ImportManager imports, boolean scoped){
		ClassDefinition dsd = (ClassDefinition) this.getBaseDefinition();
		
		imports.addImport(dsd.getDmoImport(), "A definition from the " + this.getName() + " Module");
		imports.addImport("java.util.Iterator", "To allow access to our definitions");
		imports.addImport("org.dmd.dmc.types.DotName", "To support the find method for definitions");
		
		TreeMap<DefinitionName,ClassDefinition> allDerived = dsd.getAllDerived();
		for(ClassDefinition cd : allDerived.values()){
			if (scoped){
				// If the class has the same name as this module definition, it's the 
				// internally generated class to represent the module and we don't want
				// that in the case of the scoped interface.
				if (cd.getName().getNameString().equals(getName().getNameString()))
					continue;
			}
			
			imports.addImport(cd.getDmoImport(), "A definition from the " + this.getName() + " Module");
		}
	}
	
	/**
	 * @param scoped flag to indicate if the imports are for the global interface (implemented
	 * by global definition managers) or the scoped interface (which is implemented by a module
	 * to manage its own definitions)
	 * @return the methods to be implemented on definitions interface for this module.
	 */
	public String getInterfaceMethods(boolean scoped){
		ClassDefinition dsd = (ClassDefinition) this.getBaseDefinition();
		StringBuffer sb = new StringBuffer();
		
		// We don't advertise adding to the base definition set
//		sb.append("    public void add" + dsd.getName() + "(" + dsd.getName() +" def);\n");
		sb.append("    public int get" + dsd.getName() + "Count();\n");
		sb.append("    public " + dsd.getName() + " get" + dsd.getName() + "(DotName name);\n");
		sb.append("    public Iterator<" + dsd.getName() + "> getAll" + dsd.getName() + "();\n\n");

		TreeMap<DefinitionName,ClassDefinition> allDerived = dsd.getAllDerived();
		for(ClassDefinition cd : allDerived.values()){
			if (scoped){
				// If the class has the same name as this module definition, it's the 
				// internally generated class to represent the module and we don't want
				// that in the case of the scoped interface.
				if (cd.getName().getNameString().equals(getName().getNameString()))
					continue;
			}
			sb.append("    public void add" + cd.getName() + "(" + cd.getName() +" def);\n");
			sb.append("    public void delete" + cd.getName() + "(" + cd.getName() +" def);\n");
			sb.append("    public int get" + cd.getName() + "Count();\n");
			sb.append("    public " + cd.getName() + " get" + cd.getName() + "(DotName name);\n");
			sb.append("    public Iterator<" + cd.getName() + "> getAll" + cd.getName() + "();\n");
			sb.append("    public " + cd.getName() + " get" + cd.getName() + "Definition(String name) throws DmcNameClashException, DmcValueException;\n\n");

			sb.append("    public Iterator<" + cd.getName() + "> get" + cd.getName() + "DefinitionsByName(String name) throws DmcValueException;\n\n");
			sb.append("    public int get" + cd.getName() + "DefinitionCountByName(String name) throws DmcValueException;\n\n");
		}
		
		return(sb.toString());
	}

	/**
	 * @param scoped flag to indicate if the imports are for the global interface (implemented
	 * by global definition managers) or the scoped interface (which is implemented by a module
	 * to manage its own definitions)
	 * @return the methods to be implemented on definitions interface for this module.
	 */
	public String getDMOInterfaceMethods(boolean scoped){
		ClassDefinition dsd = (ClassDefinition) this.getBaseDefinition();
		StringBuffer sb = new StringBuffer();
		
		// We don't advertise adding to the base definition set
//		sb.append("    public void add" + dsd.getName() + "(" + dsd.getName() +" def);\n");
		sb.append("    public int get" + dsd.getName() + "Count();\n");
		sb.append("    public " + dsd.getName() + "DMO get" + dsd.getName() + "(DotName name);\n");
		sb.append("    public Iterator<" + dsd.getName() + "DMO> getAll" + dsd.getName() + "();\n\n");

		TreeMap<DefinitionName,ClassDefinition> allDerived = dsd.getAllDerived();
		for(ClassDefinition cd : allDerived.values()){
			if (scoped){
				// If the class has the same name as this module definition, it's the 
				// internally generated class to represent the module and we don't want
				// that in the case of the scoped interface.
				if (cd.getName().getNameString().equals(getName().getNameString()))
					continue;
			}
			sb.append("    public void add" + cd.getName() + "(" + cd.getName() +"DMO def);\n");
			sb.append("    public int get" + cd.getName() + "Count();\n");
			sb.append("    public " + cd.getName() + "DMO get" + cd.getName() + "(DotName name);\n");
			sb.append("    public Iterator<" + cd.getName() + "DMO> getAll" + cd.getName() + "();\n");
			sb.append("    public " + cd.getName() + "DMO get" + cd.getName() + "Definition(String name) throws DmcNameClashException, DmcValueException;\n\n");
		}
		
		return(sb.toString());
	}

	/**
	 * @return the implementations of the definitions interface for this module.
	 */
	public String getInterfaceMethodsImplementations(boolean scoped){
		ClassDefinition dsd = (ClassDefinition) this.getBaseDefinition();
		StringBuffer sb = new StringBuffer();
		
		sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    // " + DebugInfo.getWhereWeWereCalledFrom() + "\n");
		sb.append("    /**\n");
		sb.append("     * All definitions are added to the base definition collection.\n");
		sb.append("     */\n");
		sb.append("    void add" + dsd.getName() + "(" + dsd.getName() + " def){\n");
		sb.append("        " + dsd.getName() + "Defs.add(def);\n");
		sb.append("    }\n\n");
		
		sb.append("    void delete" + dsd.getName() + "(" + dsd.getName() + " def){\n");
		sb.append("        try {\n");
		sb.append("            " + dsd.getName() + "Defs.delete(def);\n");
		sb.append("        } catch (ResultException e) {\n");
		sb.append("            throw(new IllegalStateException(e));\n");
		sb.append("        }\n");
		sb.append("    }\n\n");
		
		sb.append("    public int get" + dsd.getName() + "Count(){\n");
		sb.append("        return(" + dsd.getName() + "Defs.size());\n");
		sb.append("    }\n\n");
		
		sb.append("    public " + dsd.getName() + " get" + dsd.getName() + "(DotName name){\n");
		sb.append("        return(" + dsd.getName() + "Defs.getDefinition(name));\n");
		sb.append("    }\n\n");
		
		sb.append("    public Iterator<" + dsd.getName() + "> getAll" + dsd.getName() + "(){\n");
		sb.append("        return(" + dsd.getName() + "Defs.values().iterator());\n");
		sb.append("    }\n\n");

		TreeMap<DefinitionName,ClassDefinition> allDerived = dsd.getAllDerived();
		for(ClassDefinition cd : allDerived.values()){
			if (scoped){
				// If the class has the same name as this module definition, it's the 
				// internally generated class to represent the module and we don't want
				// that in the case of the scoped interface.
				if (cd.getName().getNameString().equals(getName().getNameString()))
					continue;
			}
			sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public void add" + cd.getName() + "(" + cd.getName() + " def){\n");
			sb.append("        " + cd.getName() + "Defs.add(def);\n");
			getBaseClassAddCall(cd.getDerivedFrom(), sb);
			sb.append("    }\n\n");
			
			sb.append("    public void delete" + cd.getName() + "(" + cd.getName() + " def){\n");
			sb.append("        try{\n");
			sb.append("            " + cd.getName() + "Defs.delete(def);\n");
			sb.append("        } catch (ResultException e) {\n");
			sb.append("            throw(new IllegalStateException(e));\n");
			sb.append("        }\n");
			getBaseClassDeleteCall(cd.getDerivedFrom(), sb);
			sb.append("    }\n\n");
			
			sb.append("    public int get" + cd.getName() + "Count(){\n");
			sb.append("        return(" + cd.getName() + "Defs.size());\n");
			sb.append("    }\n\n");
			
			sb.append("    public " + cd.getName() + " get" + cd.getName() + "(DotName name){\n");
			sb.append("        return(" + cd.getName() + "Defs.getDefinition(name));\n");
			sb.append("    }\n\n");
			
			sb.append("    public Iterator<" + cd.getName() + "> getAll" + cd.getName() + "(){\n");
			sb.append("        return(" + cd.getName() + "Defs.values().iterator());\n");
			sb.append("    }\n\n");
			
			sb.append("    public " + cd.getName() + " get" + cd.getName() + "Definition(String name) throws DmcNameClashException, DmcValueException{\n");
			sb.append("        return(" + cd.getName() + "Defs.getDefinition(name));\n");
			sb.append("    }\n\n");
			
			
			sb.append("    public Iterator<" + cd.getName() + "> get" + cd.getName() + "DefinitionsByName(String name) throws DmcValueException{\n");
			sb.append("        return(" + cd.getName() + "Defs.getDefinitionsByName(name));\n");
			sb.append("    }\n\n");

			sb.append("    public int get" + cd.getName() + "DefinitionCountByName(String name) throws DmcValueException{\n");
			sb.append("        return(" + cd.getName() + "Defs.getDefinitionCountByName(name));\n");
			sb.append("    }\n\n");

		}
		
		return(sb.toString());
	}
	
	/**
	 * @return the implementations of the definitions interface for this module.
	 */
	public String getDMOInterfaceMethodsImplementations(boolean scoped){
		ClassDefinition dsd = (ClassDefinition) this.getBaseDefinition();
		StringBuffer sb = new StringBuffer();
		
		sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    // " + DebugInfo.getWhereWeWereCalledFrom() + "\n");
		sb.append("    /**\n");
		sb.append("     * All definitions are added to the base definition collection.\n");
		sb.append("     */\n");
		sb.append("    void add" + dsd.getName() + "(" + dsd.getName() + "DMO def){\n");
		sb.append("        " + dsd.getName() + "Defs.add(def);\n");
//		if (!scoped){
//			// We only add this hook for the overall definition manager so that we have access
//			// to a single definition set with all definitions
//			sb.append("        allDefinitions.add(def);\n");
//		}
		sb.append("    }\n\n");
		
		sb.append("    public int get" + dsd.getName() + "Count(){\n");
		sb.append("        return(" + dsd.getName() + "Defs.size());\n");
		sb.append("    }\n\n");
		
		sb.append("    public " + dsd.getName() + "DMO get" + dsd.getName() + "(DotName name){\n");
		sb.append("        return(" + dsd.getName() + "Defs.getDefinition(name));\n");
		sb.append("    }\n\n");
		
		sb.append("    public Iterator<" + dsd.getName() + "DMO> getAll" + dsd.getName() + "(){\n");
		sb.append("        return(" + dsd.getName() + "Defs.values().iterator());\n");
		sb.append("    }\n\n");

		TreeMap<DefinitionName,ClassDefinition> allDerived = dsd.getAllDerived();
		for(ClassDefinition cd : allDerived.values()){
			if (scoped){
				// If the class has the same name as this module definition, it's the 
				// internally generated class to represent the module and we don't want
				// that in the case of the scoped interface.
				if (cd.getName().getNameString().equals(getName().getNameString()))
					continue;
			}
			sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public void add" + cd.getName() + "(" + cd.getName() + "DMO def){\n");
			sb.append("        " + cd.getName() + "Defs.add(def);\n");
			getBaseClassAddCall(cd.getDerivedFrom(), sb);
//			sb.append("        add" + dsd.getName() + "(def);\n");
			sb.append("    }\n\n");
			
			sb.append("    public int get" + cd.getName() + "Count(){\n");
			sb.append("        return(" + cd.getName() + "Defs.size());\n");
			sb.append("    }\n\n");
			
			sb.append("    public " + cd.getName() + "DMO get" + cd.getName() + "(DotName name){\n");
			sb.append("        return(" + cd.getName() + "Defs.getDefinition(name));\n");
			sb.append("    }\n\n");
			
			sb.append("    public Iterator<" + cd.getName() + "DMO> getAll" + cd.getName() + "(){\n");
			sb.append("        return(" + cd.getName() + "Defs.values().iterator());\n");
			sb.append("    }\n\n");
			
			sb.append("    public " + cd.getName() + "DMO get" + cd.getName() + "Definition(String name) throws DmcNameClashException, DmcValueException{\n");
			sb.append("        return(" + cd.getName() + "Defs.getDefinition(name));\n");
			sb.append("    }\n\n");
		}
		
		return(sb.toString());
	}
	
	/**
	 * If we have a base class, we add this definition to its index as well. This allows us
	 * to access all instances of any particular class type, even if it's abstract.
	 * @param cd
	 * @param sb
	 */
	void getBaseClassAddCall(ClassDefinition cd, StringBuffer sb){
		if (cd == null)
			return;
		
		sb.append("        add" + cd.getName() + "(def);\n");
	}
	
	/**
	 * If we have a base class, we add this definition to its index as well. This allows us
	 * to access all instances of any particular class type, even if it's abstract.
	 * @param cd
	 * @param sb
	 */
	void getBaseClassDeleteCall(ClassDefinition cd, StringBuffer sb){
		if (cd == null)
			return;
		
		sb.append("        delete" + cd.getName() + "(def);\n");
	}



}

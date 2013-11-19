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

import org.dmd.dmc.DmcObject;
import org.dmd.dms.generated.dmw.DSDefinitionModuleDMW;
import org.dmd.util.codegen.ImportManager;

/**
 * The DSDefinitionModule is used to describe the base characteristics of a set
 * of Domain Specific Definitions (DSDs).
 */
public class DSDefinitionModule extends DSDefinitionModuleDMW {
	
	public DSDefinitionModule(){
		
	}
	
	protected DSDefinitionModule(DmcObject obj){
		super(obj);
	}
	
	protected DSDefinitionModule (DmcObject obj, ClassDefinition cd){
		super(obj,cd);
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
	
	public String getGlobalInterfaceName(){
		return(getName() + "GlobalInterface");
	}
	
	public String getScopedInterfaceImport(){
		return(getGeneratedDsdPackage() + "." + getName() + "ScopedInterface");
	}
	
	public String getScopedInterfaceName(){
		return(getName() + "ScopedInterface");
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
		
		for(ClassDefinition cd : dsd.getDerivedClasses()){
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
		sb.append("    public Iterator<" + dsd.getName() + "> getAll" + dsd.getName() + "();\n\n");

		for(ClassDefinition cd : dsd.getDerivedClasses()){
			if (scoped){
				// If the class has the same name as this module definition, it's the 
				// internally generated class to represent the module and we don't want
				// that in the case of the scoped interface.
				if (cd.getName().getNameString().equals(getName().getNameString()))
					continue;
			}
			sb.append("    public void add" + cd.getName() + "(" + cd.getName() +" def);\n");
			sb.append("    public int get" + cd.getName() + "Count();\n");
			sb.append("    public Iterator<" + cd.getName() + "> getAll" + cd.getName() + "();\n\n");
		}
		
		return(sb.toString());
	}

	/**
	 * @return the implementations of the definitions interface for this module.
	 */
	public String getInterfaceMethodsImplementations(){
		ClassDefinition dsd = (ClassDefinition) this.getBaseDefinition();
		StringBuffer sb = new StringBuffer();
		
		sb.append("    public void add" + dsd.getName() + "(" + dsd.getName() +" def);\n");
		sb.append("    public int get" + dsd.getName() + "Count();\n");
		sb.append("    public Iterator<" + dsd.getName() + "> getAll" + dsd.getName() + "();\n\n");

		for(ClassDefinition cd : dsd.getDerivedClasses()){
			sb.append("    public void add" + cd.getName() + "(" + cd.getName() +" def);\n");
			sb.append("    public int get" + cd.getName() + "Count();\n");
			sb.append("    public Iterator<" + cd.getName() + "> getAll" + cd.getName() + "();\n\n");
		}
		
		return(sb.toString());
	}



}

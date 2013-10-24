	//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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
package org.dmd.mvw.gxt.dmw.generators;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.types.StringName;
import org.dmd.dmg.generated.dmo.DmgConfigDMO;
import org.dmd.dmg.generators.BaseDMWGeneratorNewest;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.WrapperTypeEnum;
import org.dmd.dms.util.GenUtility;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;

public class GxtDMWGenerator extends BaseDMWGeneratorNewest {

	// The set of all classes for which we want wrappers in this context
	TreeMap<String,ClassDefinition>	allClasses;
	
	ImportManager					imports;

	public GxtDMWGenerator(){
//		sformatter = new SchemaFormatter();
		
		genContext				= "gxt";
		genSuffix				= "GXT";
		baseWrapperImport 		= "org.dmd.mvw.client.gxt.dmw.GxtWrapper";
		namedWrapperImport		= "org.dmd.mvw.client.gxt.dmw.GxtNamedObjectWrapper";
		hierarchicWrapperImport	= "org.dmd.mvw.client.gxt.dmw.GxtHierarchicObjectWrapper";
		
		useWrappedObjectRefs 	= false;
		fullJavaEnvironment		= false;
	}
	
	
	////////////////////////////////////////////////////////////////////////////////
	// DarkMatterGeneratorIF implementation

	@Override
	public void gatherUserInput(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm) {
		// Nothing for now
	}

	@Override
	public void generateCode(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm) throws IOException, ResultException {
		gendir = loc.getConfigParentDirectory() + File.separator + "generated";
		
		// These will be created as required
		dmwdir = gendir + File.separator + "gxt";
//		auxwdir = gendir + File.separator + "auxw";
		
		schema = sm;
		
		
		createIfRequired(gendir);
		
		createWrappers(config, loc, f, sm);
		
		createAutoWrapper(config, loc, f, sm);
		
		createAutoWrapperNEW(config, loc, f, sm);
		
	}
	
	boolean needSetMethod(ClassDefinition cd){
		boolean needIt = false;
		TreeMap<StringName,AttributeDefinition> attributes = cd.getAllAttributesAtThisLevel();
		for(AttributeDefinition ad: attributes.values()){
			if (ad.getValueType() == ValueTypeEnum.SINGLE){
				needIt = true;
				break;
			}
		}
		
		return(needIt);
	}
	
	@Override
	/**
	 * In order to overload the set operator, we need some additional imports.
	 * @param config
	 * @param loc
	 * @param f
	 * @param sm
	 * @param cd
	 * @param imports
	 * @throws IOException
	 */
	public void getAdditionalWrapperImports(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm, ClassDefinition cd, ImportManager imports) throws IOException {
		if (!needSetMethod(cd))
			return;
		
		imports.addImport("org.dmd.dms.generated.enums.ValueTypeEnum", "To allow overload of GxtWrapper.set()");
	}
	
	@Override
	/**
	 * We generate a static mapping for our attributes so that we can map to the correct set method in the
	 * overridden set() method.
	 * @param config
	 * @param loc
	 * @param f
	 * @param sm
	 * @param cd
	 * @param out
	 * @throws IOException
	 */
	public void dumpAdditionalWrapperDefinitions(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm, ClassDefinition cd, BufferedWriter out) throws IOException {
		if (!needSetMethod(cd))
			return;

		TreeMap<StringName,AttributeDefinition> attributes = cd.getAllAttributesAtThisLevel();
		
		out.write("\n");
		for(AttributeDefinition ad: attributes.values()){
			if (ad.getValueType() == ValueTypeEnum.SINGLE){
				out.write("    static final int " + ad.getName() + "ID = " + ad.getDmdID()+ ";\n");
			}
		}
		out.write("\n");
	}
	
	@Override
	/**
	 * At this level, we do nothing. Derived classes can overload this to insert additional behaviour
	 * in individual class wrappers.
	 * @param config
	 * @param loc
	 * @param f
	 * @param sm
	 * @param cd
	 * @param out
	 * @throws IOException
	 */
	public void dumpAdditionalWrapperFunctions(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm, ClassDefinition cd, BufferedWriter out) throws IOException {
		if (!needSetMethod(cd))
			return;
		
		// In order to support cell editting, we overload the com.extjs.gxt.ui.client.data.BaseModel.set() method
		// to handle setting single value attributes.
		
		// Need an additional hook to add required imports to the generated wrapper and also additional properties
		// and static definitions.
		
		out.write("    @Override\n");
		out.write("    public <X> X set(String property, X value) {\n");
		out.write("        DmcAttributeInfo ai = core.getAttributeInfo(property);\n");
		out.write("\n");
		out.write("        if (ai == null)\n");
		out.write("            throw(new IllegalStateException(\"Unknown attribute: \" + property + \" for class: \" + core.getConstructionClassName()));\n");
		out.write("\n");
		out.write("        if (ai.valueType != ValueTypeEnum.SINGLE)\n");
		out.write("            throw(new IllegalStateException(\"The set() method only supports single-valued attributes. This attribute is multi-valued: \" + property));\n");
		out.write("\n");
		out.write("         @SuppressWarnings(\"unchecked\")\n");
		out.write("         X oldValue = (X) get(property);\n");
		out.write("\n");
		out.write("         try {\n");
		out.write("             switch(ai.id){\n");
		
		out.write("\n");
		
		TreeMap<StringName,AttributeDefinition> attributes = cd.getAllAttributesAtThisLevel();
		for(AttributeDefinition ad: attributes.values()){
			if (ad.getValueType() == ValueTypeEnum.SINGLE){
				String capped = GenUtility.capTheName(ad.getName().getNameString());
				out.write("             case " + ad.getName() + "ID:\n");
				out.write("                 ((" + cd.getName() + "DMO) core).set" + capped + "(value);\n");
				out.write("                 break;\n");
			}
		}
		out.write("\n");
		
		
		out.write("             }\n");
		out.write("        } catch (DmcValueException e) {\n");
		out.write("             throw(new IllegalStateException(e));\n");
		out.write("        }\n");
		out.write("\n");
		out.write("        notifyPropertyChanged(property, value, oldValue);\n");
		out.write("        return(oldValue);\n");
		out.write("    }\n");
		
	}
	
	///////////////////////////////////////////////////////////////////////////
	// Initial auto wrapper implementation
	
	void createAutoWrapper(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm) throws IOException{
		
		SchemaDefinition sd = sm.isSchema(config.getSchemaToLoad());

		init(sd, sm);

		String fn = GenUtility.capTheName(sd.getName().getNameString()) + "GxtWrapperUtil";
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(gendir, fn + ".java");
        
        out.write("package " + sd.getDmwPackage(genContext) + ".generated;\n\n");
        
        out.write(imports.getFormattedImports());
        out.write("\n");
        
        out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public class " + fn + " {\n\n");
        
        out.write(getClassConstants());
        out.write("\n");
        
        out.write("    static public GxtWrapper wrapIt(DmcObject obj){\n\n");
        
        out.write("        GxtWrapper rc = null;\n\n");
        
        out.write("        switch(obj.getConstructionClassInfo().id){\n");
        out.write(getClassCaseStatements());
        out.write("        }\n");
        out.write("\n");
        out.write("        return(rc);\n");
        
        out.write("    }\n\n");
        
        out.write("}\n\n");
        
        out.close();

	}
	
	void init(SchemaDefinition sd, SchemaManager schema){
		allClasses 	= new TreeMap<String, ClassDefinition>();
		imports 	= new ImportManager();
		
		imports.addImport("org.dmd.dmc.DmcObject", "The object we wrap");
		imports.addImport("org.dmd.mvw.client.gxt.dmw.GxtWrapper", "The wrapper we return");

		Iterator<String> dependsOn = sd.getDependsOn();
		if (dependsOn != null){
			while(dependsOn.hasNext()){
				boolean needImport = false;
				SchemaDefinition dep = schema.isSchema(dependsOn.next());
				for(ClassDefinition cd: dep.getClassDefList()){
					if (!cd.generateWrapper(genContext))
						continue;
					if (cd.getClassType() == ClassTypeEnum.ABSTRACT)
						continue;
					
					if (cd.getDmwWrapperType(genContext) == WrapperTypeEnum.EXTENDED){
						String importloc = dep.getDmwPackage(genContext);
						
						if (cd.getSubpackage() != null)
							importloc = dep.getDmwPackage(genContext) + ".extended." + cd.getSubpackage() + ".*";
						imports.addImport(importloc, "Extended wrappers from the " + dep.getName() + " schema");
						
					}
					else
						needImport = true;
					
					allClasses.put(cd.getName().getNameString(),cd);
				}
				
				if (needImport){
					imports.addImport(dep.getDmwPackage(genContext) + ".generated." + genContext + ".*", "Access to the wrappers for the " + dep.getName() + " schema");
					imports.addImport(dep.getSchemaPackage() + ".generated.dmo.*", "Access to the DMOs for the " + dep.getName() + " schema");

				}
			}
		}
		
		boolean needImport = false;
		for(ClassDefinition cd: sd.getClassDefList()){
			if (!cd.generateWrapper(genContext))
				continue;
			if (cd.getClassType() == ClassTypeEnum.ABSTRACT)
				continue;
			
			if (cd.getDmwWrapperType(genContext) == WrapperTypeEnum.EXTENDED){
				String importloc = sd.getDmwPackage(genContext);
				
				if (cd.getSubpackage() != null)
					importloc = sd.getDmwPackage(genContext) + ".extended." + cd.getSubpackage() + ".*";
				imports.addImport(importloc, "Extended wrappers from the " + sd.getName() + " schema");
				
			}
			else
				needImport = true;

			allClasses.put(cd.getName().getNameString(),cd);
		}
		if (needImport){
			imports.addImport(sd.getDmwPackage(genContext) + ".generated." + genContext + ".*", "Access to the wrappers for the " + sd.getName() + " schema");
			imports.addImport(sd.getSchemaPackage() + ".generated.dmo.*", "Access to the DMOs for the " + sd.getName() + " schema");
		}
	}

	///////////////////////////////////////////////////////////////////////////
	
	void createAutoWrapperNEW(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm) throws IOException{
		
		SchemaDefinition sd = sm.isSchema(config.getSchemaToLoad());

		initNEW(sd, sm);

		String fn = GenUtility.capTheName(sd.getName().getNameString()) + "GxtWrapperFactory";
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(gendir, fn + ".java");
        
        out.write("package " + sd.getDmwPackage(genContext) + ".generated;\n\n");
        
        out.write(imports.getFormattedImports());
        out.write("\n");
        
        out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public class " + fn + " implements GxtWrapperFactoryIF {\n\n");
        
        out.write(getClassConstants() + "\n\n");
        
        out.write("    static " + fn + " instance;\n\n");
        
        out.write("    private " + fn + "(){\n\n");
        out.write("    }\n\n");
        
        out.write("    static public " + fn + " instance(){\n");
        out.write("        if (instance == null)\n");
        out.write("            instance = new " + fn + "();\n");
        out.write("        return(instance);\n");
        out.write("    }\n\n");
        
        out.write("    public GxtWrapper wrapObject(DmcObject obj){\n\n");
        
        out.write("        GxtWrapper rc = null;\n\n");
        
        out.write("        switch(obj.getConstructionClassInfo().id){\n");
        out.write(getClassCaseStatements());
        out.write("        }\n");
        out.write("\n");
        out.write("        return(rc);\n");
        
        out.write("    }\n\n");
        
        out.write("}\n\n");
        
        out.close();

	}
	
	void initNEW(SchemaDefinition sd, SchemaManager schema){
		allClasses 	= new TreeMap<String, ClassDefinition>();
		imports 	= new ImportManager();
		
		imports.addImport("org.dmd.dmc.DmcObject", "The object we wrap");
		imports.addImport("org.dmd.mvw.client.gxt.dmw.GxtWrapper", "The wrapper we return");
		imports.addImport("org.dmd.mvw.client.gxt.dmw.GxtWrapperFactoryIF", "The standard wrapper util interface");

//		Iterator<String> dependsOn = sd.getDependsOn();
//		if (dependsOn != null){
//			while(dependsOn.hasNext()){
//				boolean needImport = false;
//				SchemaDefinition dep = schema.isSchema(dependsOn.next());
//				for(ClassDefinition cd: dep.getClassDefList()){
//					if (!cd.generateWrapper(genContext))
//						continue;
//					if (cd.getClassType() == ClassTypeEnum.ABSTRACT)
//						continue;
//					
//					if (cd.getDmwWrapperType(genContext) == WrapperTypeEnum.EXTENDED){
//						String importloc = dep.getDmwPackage(genContext);
//						
//						if (cd.getSubpackage() != null)
//							importloc = dep.getDmwPackage(genContext) + ".extended." + cd.getSubpackage() + ".*";
//						imports.addImport(importloc, "Extended wrappers from the " + dep.getName() + " schema");
//						
//					}
//					else
//						needImport = true;
//					
//					allClasses.put(cd.getName().getNameString(),cd);
//				}
//				
//				if (needImport){
//					imports.addImport(dep.getDmwPackage(genContext) + ".generated." + genContext + ".*", "Access to the wrappers for the " + dep.getName() + " schema");
//					imports.addImport(dep.getSchemaPackage() + ".generated.dmo.*", "Access to the DMOs for the " + dep.getName() + " schema");
//
//				}
//			}
//		}
		
		boolean needImport = false;
		for(ClassDefinition cd: sd.getClassDefList()){
			if (!cd.generateWrapper(genContext))
				continue;
			if (cd.getClassType() == ClassTypeEnum.ABSTRACT)
				continue;
			
			if (cd.getDmwWrapperType(genContext) == WrapperTypeEnum.EXTENDED){
				String importloc = sd.getDmwPackage(genContext);
				
				if (cd.getSubpackage() != null)
					importloc = sd.getDmwPackage(genContext) + ".extended." + cd.getSubpackage() + ".*";
				imports.addImport(importloc, "Extended wrappers from the " + sd.getName() + " schema");
				
			}
			else
				needImport = true;

			allClasses.put(cd.getName().getNameString(),cd);
		}
		if (needImport){
			imports.addImport(sd.getDmwPackage(genContext) + ".generated." + genContext + ".*", "Access to the wrappers for the " + sd.getName() + " schema");
			imports.addImport(sd.getSchemaPackage() + ".generated.dmo.*", "Access to the DMOs for the " + sd.getName() + " schema");
		}
	}

	
	///////////////////////////////////////////////////////////////////////////
	
	String getClassConstants(){
		StringBuilder sb = new StringBuilder();
			
		for(ClassDefinition cd: allClasses.values()){
			sb.append("    static final int " + cd.getName() + "ID = " + cd.getDmdID() + ";\n");
		}
		
		return(sb.toString());
	}
	
	String getClassCaseStatements(){
		StringBuilder sb = new StringBuilder();
		
		for(ClassDefinition cd: allClasses.values()){
			String wrapper = cd.getName() + genSuffix;
			String dmocast = cd.getName() + "DMO";
			
			if (cd.getClassType() == ClassTypeEnum.AUXILIARY)
				continue;
			
			sb.append("        case " + cd.getName() + "ID:\n");
			if (cd.getDmwWrapperType(genContext) == WrapperTypeEnum.EXTENDED)
				sb.append("            rc = new " + cd.getName() + "((" + dmocast + ")obj);\n");
			else
				sb.append("            rc = new " + wrapper + "((" + dmocast + ")obj);\n");
			sb.append("            break;\n");
		}
		
		return(sb.toString());
	}
	
	@Override
	protected void dumpAUX(ClassDefinition cd, String outdir) throws IOException {
	
	}
	

}

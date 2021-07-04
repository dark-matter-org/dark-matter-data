package org.dmd.dmg.generators;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.dmd.dmc.DmcNameClashException;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmg.generated.dmo.DmgConfigDMO;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.ComplexTypeDefinition;
import org.dmd.dms.DSDefinitionModule;
import org.dmd.dms.EnumDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.dms.generated.enums.WrapperTypeEnum;
import org.dmd.dms.util.GenUtility;
import org.dmd.util.UtilityOptions;
import org.dmd.util.codegen.InitializationInterfaceManager;
import org.dmd.util.codegen.ImplementsManager;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.codegen.Manipulator;
import org.dmd.util.codegen.MemberManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;

public class DMWGenerator extends BaseDMWGenerator {
	
	DSDArtifactFormatter dsdFormatter;

	public DMWGenerator(){
		genContext				= "dmw";
		genSuffix				= "DMW";
		baseWrapperImport 		= "org.dmd.dmw.DmwWrapper";
		namedWrapperImport		= "org.dmd.dmw.DmwNamedObjectWrapper";
		hierarchicWrapperImport	= "org.dmd.dmw.DmwHierarchicObjectWrapper";
		fullJavaEnvironment		= true;
		dsdFormatter			= new DSDArtifactFormatter();
	}
	
	@Override
	public void generateCode(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm) throws IOException, ResultException, DmcNameClashException, DmcValueException {
		gendir 		= loc.getConfigParentDirectory() + File.separator + "generated";
		extendedDir	= loc.getConfigParentDirectory() + File.separator + "extended";
		
		dmwdir = gendir + File.separator + "dmw";
//		auxwdir = gendir + File.separator + "dmw";
		
		createIfRequired(gendir);

		schema = sm;
		
		createTypeIterables(config, loc, f, sm);
		
		createWrappers(config, loc, f, sm);
		
		createExtendedWrapperClasses(config, loc, f, sm);
		
		sformatter.setFileHeader(fileHeader);
		sformatter.setProgressStream(progress);
		SchemaDefinition sd = sm.isSchema(config.getSchemaToLoad());
		sformatter.dumpSchema(gendir, config.getGenPackage(), sd, sm);
		
		dsdFormatter.setFileHeader(fileHeader);
		dsdFormatter.setProgressStream(progress);
		dsdFormatter.generateCode(config, loc, f, sd, sm);
	}

	////////////////////////////////////////////////////////////////////////////////
	// Our functionality

	void createTypeIterables(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm) throws IOException, ResultException {
		SchemaDefinition sd = sm.isSchema(config.getSchemaToLoad());
		
		if (!UtilityOptions.instance().quietProgress())
			sd.dumpInfo();
		
		Iterator<ClassDefinition>	classes = sd.getClassDefList();
		if (classes != null){
			createIfRequired(dmwdir);
			
			// We only generate the iterators for unnamed classes. Named classes will have their
			// Iterable generated along with the types because internal types are generated for them
			while(classes.hasNext()){
				ClassDefinition cd = classes.next();
				
				if (cd.getClassType() == ClassTypeEnum.AUXILIARY)
					continue;
				
				if (cd.getIsNamedBy() == null){
					String dmwImport = cd.getDmwImport();
					if (cd.getUseWrapperType() == WrapperTypeEnum.EXTENDED)
						dmwImport = cd.getDmeImport();
					
					GenUtility.dumpObjectIterable(dmwdir, sd.getDmwPackage(), cd.getDmoImport(), cd.getName().getNameString(), dmwImport, "", fileHeader, progress);
				}
			}
			
		}
		
		Iterator<TypeDefinition> types = sd.getTypeDefList();
		if (types != null){
			while(types.hasNext()){
				TypeDefinition td = types.next();
				String genericArgs = td.getGenericArgs();
				if (genericArgs == null)
					genericArgs = "";
				
				GenUtility.dumpIterable(dmwdir, sd.getDmwPackage(), td.getPrimitiveType(), td.getName().getNameString(), genericArgs, fileHeader, progress);
			}
		}
		
		Iterator<EnumDefinition>	enums = sd.getEnumDefList();
		if (enums != null){
			while(enums.hasNext()){
				EnumDefinition ed = enums.next();
				
				String enumPrimitive = sd.getSchemaPackage() + ".generated.enums." + ed.getName().getNameString();
				
				GenUtility.dumpIterable(dmwdir, sd.getDmwPackage(), enumPrimitive, ed.getName().getNameString(), "", fileHeader, progress);
			}
		}
		
		Iterator<ComplexTypeDefinition>	ctypes = sd.getComplexTypeDefList();
		if (ctypes != null){
			while(ctypes.hasNext()){
				ComplexTypeDefinition ctd = ctypes.next();
				DebugInfo.debug("Generating Iterator for: " + ctd.getName().getNameString());
				
				String primitive = sd.getSchemaPackage() + ".generated.types." + ctd.getName().getNameString();
				GenUtility.dumpIterable(dmwdir, sd.getDmwPackage(), primitive, ctd.getName().getNameString(), "", fileHeader, progress);
				
			}
		}
		
	}

	@Override
	protected void createCloneItMethod(BufferedWriter out, DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm, ClassDefinition cd)  throws IOException {
		if (cd.getClassType() == ClassTypeEnum.STRUCTURAL){
			if (cd.getDmwWrapperType(genContext) ==  WrapperTypeEnum.EXTENDED){
				out.write("    public " + cd.getName() + " cloneIt() {\n");
		        out.write("        " + cd.getName() + " rc = new " + cd.getName() + "();\n");
		        out.write("        rc.setDmcObject(getDMO().cloneIt());\n");
		        out.write("        return(rc);\n");
		        out.write("    }\n\n");
			}
			else{
				out.write("    public " + cd.getName() + genSuffix + " cloneIt() {\n");
		        out.write("        " + cd.getName() + genSuffix + " rc = new " + cd.getName() + genSuffix + "();\n");
		        out.write("        rc.setDmcObject(getDMO().cloneIt());\n");
		        out.write("        return(rc);\n");
		        out.write("    }\n\n");
			}
		}
	}
	
	@Override
	public void getAdditionalWrapperImports(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm, ClassDefinition cd, ImportManager imports) throws IOException {
		if (cd.getDsdModuleDefinition() != null){
			// We have a domain specific definition module, so, we're going
			// to add the capability to manage the various definitions associated
			// with it.
			DSDefinitionModule dsdm = cd.getDsdModuleDefinition();
			
			imports.addImport(dsdm.getScopedInterfaceImport(), "Required to manage module definition");
			imports.addImport("org.dmd.dmc.definitions.DmcDefinitionSet", "Our base to provide definition set storage");
			
			// We also add the imports for the sets of definition that we're going to manage
			dsdm.getImportsForInterface(imports, true);
		}
		
		if (cd.getPartOfDefinitionModule() != null){
			if (cd.getClassType() == ClassTypeEnum.STRUCTURAL){
				AttributeDefinition attr = cd.getPartOfDefinitionModule().getDefinedInModuleAttribute();
				TypeDefinition td = attr.getType();
				imports.addImport(td.getOriginalClass().getDmtREFImport(), "Required to access defined in module name");
			}
		}
	}
	
	@Override
	public void getAdditionalWrapperInterfaces(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm, ClassDefinition cd, ImplementsManager implManager) throws IOException {
		if (cd.getDsdModuleDefinition() != null){
			DSDefinitionModule dsdm = cd.getDsdModuleDefinition();
			
			// Add the implements scoped interface 
			implManager.addImplements(dsdm.getScopedInterfaceName());
		}
	}
	
	@Override
	public void dumpAdditionalWrapperDefinitions(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm, ClassDefinition cd, BufferedWriter out) throws IOException {
		if (cd.getDsdModuleDefinition() != null){
			DSDefinitionModule dsdm = cd.getDsdModuleDefinition();
			
			MemberManager members = new MemberManager();
			dsdm.getScopedInterfaceMembers(members,dsdm.getName().getNameString());
			
			out.write(members.getFormattedMembers() + "\n");
		}		
	}

	public void dumpAdditionalWrapperFunctions(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm, ClassDefinition cd, BufferedWriter out) throws IOException {
		if (cd.getDsdModuleDefinition() != null){
			DSDefinitionModule dsdm = cd.getDsdModuleDefinition();
			
			out.write(dsdm.getInterfaceMethodsImplementations(true));
		}
		if (cd.getPartOfDefinitionModule() != null){
			// Any class that's part of a definition module has to have a standard
			// method to get the string name of the module from which it was loaded.
			// This abstract method is defined in DSDefinition. 
			// Here we overload this method on strucutural classes
			if (cd.getClassType() == ClassTypeEnum.STRUCTURAL){
				if (cd.getDsdModuleDefinition() != null){
					out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
					out.write("    /**\n");
					out.write("     * This method indicates the name of the module from which this definition was loaded.\n");
					out.write("     * And, since this is a module, it's just the name of the module.\n");
					out.write("     */\n");
					out.write("    @Override\n");
					out.write("    public String getNameOfModuleWhereThisCameFrom(){\n");
					out.write("        return(getName().getNameString());\n");
					out.write("    }\n\n");					
				}
				else {
					AttributeDefinition attr = cd.getPartOfDefinitionModule().getDefinedInModuleAttribute();
					String attrNamePart = Manipulator.capFirstChar(attr.getName().getNameString());
					out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
					out.write("    /**\n");
					out.write("     * This method indicates the name of the module from which this definition was loaded.\n");
					out.write("     */\n");
					out.write("    @Override\n");
					out.write("    public String getNameOfModuleWhereThisCameFrom(){\n");
					out.write("        " + cd.getPartOfDefinitionModule().getName() + "REF ref = ((" + cd.getName() + "DMO) core).get" + attrNamePart + "();\n");
					out.write("        return(ref.getName().getNameString());\n");
					out.write("    }\n\n");
				}
			}
//			DebugInfo.debug(cd.toOIF());
		}
	}

	@Override
	public void dumpExtendedClass(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm, ClassDefinition cd) throws IOException {		
		String subfolder = "";
		String outdir = extendedDir;
		
		// The extended class has to go to a subfolder if we have a subpackage
		if (cd.getSubpackage() != null){
			subfolder = cd.getSubpackage().replaceAll("\\.", "/");
			DebugInfo.debug("Subfolder = " + subfolder);
			outdir = extendedDir + "/" + subfolder;
		}
		
		createIfRequired(outdir);
		
		String outfn = outdir + "/" + cd.getName().getNameString() + ".java";
		File file =  new File(outfn);
		if (file.exists()){
			// We never overwrite the extended file if it already exists!
			return;
		}
		
		// NOTE: WE DON'T USE THE FileUpdateManager WHEN WRITING THESE FILES - otherwise, we wind up
		// with problems of removing files that were previously dumped to the output directory, which
		// is not what we want. The FileUpdateManager is only used for directories where all content 
		// is generated.
		BufferedWriter 	out = new BufferedWriter(new FileWriter(outfn));
		
		String abstractClass = "";
		
		if (cd.getClassType() == ClassTypeEnum.ABSTRACT)
			abstractClass = "abstract ";
		
		ImportManager imports = new ImportManager();
		imports.addImport(cd.getDmwPackage(genContext) + ".generated." + genContext + "." + cd.getName() + genSuffix, "The wrapper we're extending");
		imports.addImport(cd.getDmoImport(), "The wrapper we're extending");
		imports.addImport("org.dmd.dms.ClassDefinition", "Used in derived constructors");
		imports.addImport("org.dmd.util.exceptions.ResultException", "To report errors from validation");
		
		String defAccess = cd.getPartOfDefinitionModule().getModuleClassName() + InitializationInterfaceManager.DEF_INT_SUFFIX;
		
		imports.addImport(config.getGenPackage() + ".generated.dsd." + defAccess , "Definitions access");
		
		if (cd.getDsdModuleDefinition() != null)
			imports.addImport("java.util.Iterator", "To iterate definitions");

		
		int lastDot = cd.getDmeImport().lastIndexOf(".");
		
		out.write("package " + cd.getDmeImport().substring(0, lastDot) + ";\n\n");
		
		out.write(imports.getFormattedImports() + "\n");
		
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		out.write(abstractClass + "public class " + cd.getName() + " extends " + cd.getName() + genSuffix + " {\n\n");
		
		out.write("    private boolean initialized;\n\n");

		out.write("    public " + cd.getName() + "(){\n");
		out.write("        super();\n");
		out.write("    }\n\n");
		
		out.write("    public " + cd.getName() + "(" + cd.getName() + "DMO dmo, ClassDefinition cd){\n");
		out.write("        super(dmo,cd);\n");
		out.write("    }\n\n");
		
		out.write("    public void " +  InitializationInterfaceManager.INITIALIZE + "(" + defAccess + " definitions) throws ResultException {\n");
		out.write("        if (!initialized){\n");
		out.write("            // Add any required initialization or validation checks\n");
		out.write("            // If you fail validation, throw a ResultException that includes a clear\n");
		out.write("            // error description and location - uncomment the following example:\n");
		out.write("//            ResultException ex = new ResultException(\"Error description\");\n");
		out.write("//            ex.moreMessages(\"Additional error information\");\n");
		out.write("//            ex.setLocationInfo(getFile(), getLineNumber());\n");
		out.write("//            throw(ex);\n");
		out.write("            initialized = true;\n");
		out.write("        }\n");
		out.write("    }\n\n");
		
		if (cd.getDsdModuleDefinition() != null){
			// This is the module definition class, so we're going to overload the toJSON() method
			// so that we can dump the entire module in JSON.			
			String baseDefName = cd.getDsdModuleDefinition().getBaseDefinition().getName().getNameString(); 
			
			out.write("    /**\n");
			out.write("     * @return the module in JSON format.\n");
			out.write("     */\n");
			out.write("    @Override\n");
			out.write("    public String toJSON() {\n");
			out.write("        StringBuffer sb = new StringBuffer();\n");
			out.write("        \n");
			out.write("        core.toJSON(sb, 0, \"\");\n");
			out.write("        \n");
			out.write("        if (get" + baseDefName + "Count() > 0) {\n");
			out.write("            // Remove the final }\\n\n");
			out.write("            sb.deleteCharAt(sb.length()-1);\n");
			out.write("            sb.deleteCharAt(sb.length()-1);\n");
			out.write("            \n");
			out.write("            sb.append(\",\\n\");\n");
			out.write("            sb.append(\"    \\\"definitions\\\": [\\n\");\n");
			out.write("            \n");
			out.write("            Iterator<" + baseDefName + "> it = getAll" + baseDefName + "();\n");
			out.write("            while(it.hasNext()) {\n");
			out.write("                " + baseDefName + " def = it.next();                \n");
			out.write("                def.getDMO().toJSON(sb, 0, \"      \");\n");
			out.write("                \n");
			out.write("                if (it.hasNext())\n");
			out.write("                    sb.append(\",\\n\");\n");
			out.write("            }\n");
			out.write("            sb.append(\"\\n    ]\\n\");\n");
			out.write("            \n");
			out.write("            sb.append(\"}\");\n");
			out.write("        }\n");
			out.write("        \n");
			out.write("        return(sb.toString());\n");
			out.write("    }\n");

			
		}
		
		out.write("}\n\n");
		
        out.close();
		
	}

}

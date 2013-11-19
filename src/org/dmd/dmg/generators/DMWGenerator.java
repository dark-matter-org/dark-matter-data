package org.dmd.dmg.generators;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.dmd.dmg.generated.dmo.DmgConfigDMO;
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
import org.dmd.util.codegen.ImplementsManager;
import org.dmd.util.codegen.ImportManager;
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
	public void generateCode(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm) throws IOException, ResultException {
		gendir = loc.getConfigParentDirectory() + File.separator + "generated";
		dmwdir = gendir + File.separator + "dmw";
//		auxwdir = gendir + File.separator + "dmw";
		
		createIfRequired(gendir);

		schema = sm;
		
		createTypeIterables(config, loc, f, sm);
		
		createWrappers(config, loc, f, sm);
		
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
			dsdm.getScopedInterfaceMembers(members);
			
			out.write(members.getFormattedMembers() + "\n");
		}		
	}

	public void dumpAdditionalWrapperFunctions(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm, ClassDefinition cd, BufferedWriter out) throws IOException {
		if (cd.getDsdModuleDefinition() != null){
			DSDefinitionModule dsdm = cd.getDsdModuleDefinition();
			
			out.write(dsdm.getInterfaceMethodsImplementations(true));
		}		
	}

}

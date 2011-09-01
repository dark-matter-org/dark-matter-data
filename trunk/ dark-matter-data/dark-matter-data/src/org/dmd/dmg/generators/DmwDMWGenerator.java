package org.dmd.dmg.generators;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.dmd.dmg.generated.dmo.DmgConfigDMO;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.EnumDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.dms.generated.enums.WrapperTypeEnum;
import org.dmd.dms.util.GenUtility;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;

public class DmwDMWGenerator extends BaseDMWGeneratorNew {

	public DmwDMWGenerator(){
		genContext				= "dmw";
		genSuffix				= "DMW";
		baseWrapperImport 		= "org.dmd.dmw.DmwWrapper";
		namedWrapperImport		= "org.dmd.dmw.DmwNamedObjectWrapper";
		hierarchicWrapperImport	= "org.dmd.dmw.DmwHierarchicObjectWrapper";	
		
		useWrappedObjectRefs 	= true;
		fullJavaEnvironment		= true;
	}
	
	@Override
	public void generateCode(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm) throws IOException, ResultException {
		gendir = loc.getConfigParentDirectory() + File.separator + "generated";
		dmwdir = gendir + File.separator + "dmw";
		auxwdir = gendir + File.separator + "auxw";
		
		schema = sm;
		
		createTypeIterables(config, loc, f, sm);
		
		createWrappers(config, loc, f, sm);
		
		sformatter.setFileHeader(fileHeader);
		sformatter.setProgressStream(progress);
		SchemaDefinition sd = sm.isSchema(config.getSchemaToLoad());
		sformatter.dumpSchema(gendir, config.getGenPackage(), sd, sm);
	}

	////////////////////////////////////////////////////////////////////////////////
	// Our functionality
	

	void createTypeIterables(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm) throws IOException, ResultException {
		SchemaDefinition sd = sm.isSchema(config.getSchemaToLoad());
		
		sd.dumpInfo();
		
		Iterator<ClassDefinition>	classes = sd.getClassDefList();
		if (classes != null){
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
	}

}
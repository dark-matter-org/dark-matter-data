package org.dmd.dms.tools.generation.meta;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.TreeMap;

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.feedback.DMParsingFeedback;
import org.dmd.core.util.DMUncheckedObject;
import org.dmd.core.util.NamedStringArray;
import org.dmd.util.artifact.FileUpdateManager;
import org.dmd.util.parsing.DMUncheckedObjectHandlerIF;
import org.dmd.util.parsing.DMUncheckedObjectManager;
import org.dmd.util.parsing.DMUncheckedObjectParser;
import org.dmd.util.runtime.DebugInfo;

public class MetaGen implements DMUncheckedObjectHandlerIF {
	
	final static String SCHEMA_DEFINITION 	= "SchemaDefinition";
	final static String DEF_FILES			= "defFiles";
	private final static int META_BASE_ID = 0;

	private final static int META_ID_RANGE = 200;
	
	// org/dmd/dms/shared
	String	sharedDir;
	String	sharedPackage			= "org.dmd.dms.shared";
	String	sharedGenTypesPackage	= "org.dmd.dms.shared.generated.types";
	
	// org/dmd/dms/shared/generated
	String	sharedGenDir;
	
	// org/dmd/dms/shared/generated/rulesdmo
	String	sharedGenRulesDir;
	
	// org/dmd/dms/shared/generated/enums
	String	enumDir;
	String	sharedGenEnumsPackage	= "org.dmd.dms.shared.generated.enums";
	
	// org/dmd/dms/shared/generated/enums
	String	typeDir;
	
	// org/dmd/dms/shared/generated/enums
	String	adapterDir;
	
	// org/dmd/dms/shared/generated/dmo
	String	dmoDir;
	
	// org/dmd/dms/server/generated/dmw
	String	dmwDir;
	
	// org/dmd/dms/server/generated/dsd
	String	dsdDir;
	
	// org/dmd/dms/server/generated
	String 	serverGenDir;
	
	// org/dmd/dms/server/extended
	String	serverExtDir;
	
	// org/dmd/dms/shared/dmconfig
	String	dmconfigDir;
	
	// Our parser of unchecked DMOs
	DMUncheckedObjectParser				ucoParser;
	
	// Our manager of unchecked DMOs
	DMUncheckedObjectManager			ucoManager;
	
	// Handle to the type definitions manitained by the ucoManager
	TreeMap<String,DMUncheckedObject>	ucoTypeDefs;
	TreeMap<String,DMUncheckedObject>	ucoClassDefs;
	TreeMap<String,DMUncheckedObject>	ucoAttributeDefs;
	TreeMap<String,DMUncheckedObject>	ucoModuleDefs;
	TreeMap<String,DMUncheckedObject>	ucoRuleCategoryDefs;
	
	//  The schema module definition
	DMUncheckedObject					ucoModule;
	
	DMUncheckedObject					metaSchema;
	
	MetaDSDHelper						dsdHelper;

	StringBuffer LGPL = new StringBuffer();

	/**
	 * 
	 * @param baseDir
	 * @param partOne generates the DMOs and DMWs if true, otherwise, generates the DSD stuff
	 * @throws DMFeedbackSet
	 * @throws IOException
	 */
	public void generate(String baseDir) throws DMFeedbackSet, IOException {
		System.out.println("Base directory: " + baseDir);
		
		sharedDir 			= baseDir + "/shared";
		dmconfigDir 		= baseDir + "/shared/dmconfig";
		sharedGenDir 		= baseDir + "/shared/generated";
		sharedGenRulesDir	= baseDir + "/shared/generated/rulesdmo";
		dmoDir 				= baseDir + "/shared/generated/dmo";
		enumDir 			= baseDir + "/shared/generated/enums";
		typeDir 			= baseDir + "/shared/generated/types";
		adapterDir 			= baseDir + "/shared/generated/types/adapters";
		serverGenDir 		= baseDir + "/server/generated";
		dmwDir 				= baseDir + "/server/generated/dmw";
		dsdDir 				= baseDir + "/server/generated/dsd";
		serverExtDir 		= baseDir + "/server/extended";
		
		readHeader();
		
		ucoManager = new DMUncheckedObjectManager("name");
		
		ucoParser = new DMUncheckedObjectParser(this);
		
		ucoParser.parseFile(dmconfigDir + "/meta.dms", false);
		
		if (metaSchema == null){
			throw(new DMFeedbackSet("The meta schema SchemaDefinition wasn't found!"));
		}
		
		NamedStringArray defFiles = metaSchema.get(DEF_FILES);
		for(String fn: defFiles){
			ucoParser.parseFile(dmconfigDir + "/" + fn);
		}

		createDir(sharedGenDir);
		createDir(sharedGenRulesDir);
		createDir(dmoDir);
		createDir(enumDir);
		createDir(typeDir);
		createDir(adapterDir);
		createDir(serverGenDir);
		createDir(dmwDir);
		createDir(dsdDir);
		createDir(serverExtDir);
		
		FileUpdateManager.instance().generationStarting();
		FileUpdateManager.instance().reportProgress(System.out);
		FileUpdateManager.instance().reportErrors(System.err);
		FileUpdateManager.instance().deleteFiles(false);
		
		// We now have all of the base meta definitions. For the sake of convenience,
		// we initialize handles to some of the collections of objects maintained by
		// the ucoManager
		
		// We create the module class before we grab the classes
		createDmsModuleClass();
		dsdHelper = new MetaDSDHelper(ucoManager,ucoModule);
		dsdHelper.generateGlobalInterface(dsdDir, LGPL.toString());
		dsdHelper.generateScopedInterface(dsdDir, LGPL.toString());
		dsdHelper.generateDefinitionManager(dsdDir, LGPL.toString());
		dsdHelper.generateGeneratorInterface(dsdDir, LGPL.toString());
		dsdHelper.generateParser(dsdDir, LGPL.toString());
		dsdHelper.generateParsingCoordinator(dsdDir,LGPL.toString());
		dsdHelper.generateBaseUtility(dsdDir,LGPL.toString());
		
		ArrayList<ClassInfo> allDerived = dsdHelper.getAllDerived("DmsDefinition");
		
		for(ClassInfo ci: allDerived){
			DebugInfo.debug(ci.toString());
		}
		
		ucoTypeDefs 			= ucoManager.getObjects("TypeDefinition");
		ucoClassDefs 			= ucoManager.getObjects("ClassDefinition");
		ucoAttributeDefs 		= ucoManager.getObjects("AttributeDefinition");
		ucoRuleCategoryDefs 	= ucoManager.getObjects("RuleCategory");
		
		// Create the TypeDefinitions to represent things that can be referred to as types
		// when defining attributes
		createInternalReferenceTypesForClasses();
//		createInternalTypesForEnums();
		createInternaReferenceTypesForEnums();
		createInternalTypesForComplexTypes();
		setDesignatedNameAndFilterAttributesOnTypes();
		
		dumpDMOs();

		dumpTypes();
		
		DerivedTypeFormatter.dumpDerivedTypes(ucoManager, typeDir, LGPL.toString());
		
		dumpEnums();
		
		dumpComplexTypes();
		
		dumpCompactSchema();
		
		DmwFormatter.dumpDMWClasses(ucoManager, dsdHelper, dmwDir, LGPL.toString());
		
		DmwFormatter.dumpTypeIterables(dmwDir, LGPL.toString());
		
//		MetaSchemaFormatter.dumpMetaSchemaAG(ucoManager, serverGenDir, LGPL.toString());
		
		MetaSchemaFormatterNew.dumpMetaSchemaAG(ucoManager, ucoModule, serverGenDir, LGPL.toString());
		
		MetaRuleFormatter.dumpRuleCategoryInterfaces(ucoRuleCategoryDefs, sharedGenRulesDir, LGPL.toString());

	}
	
	/**
	 * The DmsModule specification is used as the basis for the creation of the DmsModule
	 * class. This is the replacement for the SchemaDefinition used prior to release 4.0.
	 * @throws DMFeedbackSet 
	 */
	private void createDmsModuleClass() throws DMFeedbackSet{
		if (ucoManager.getObjects("DSDefinitionModule").size() > 1)
			throw(new DMFeedbackSet("More than one DSDefinitionModule specified!"));

		ucoModule = ucoManager.getObjects("DSDefinitionModule").get("DmsModule");
		DMUncheckedObject	cd = new DMUncheckedObject();
		
		cd.addToClasses("ClassDefinition");
		cd.addValue("name", 				"DmsModule");
		cd.addValue("classType", 			"STRUCTURAL");
		cd.addValue("dmdID", 				ucoModule.getSV("dmdID"));
		cd.addValue("isNamedBy", 			"name");
		cd.addValue("internallyGenerated", 	"true");
		cd.addValue("dsdModuleDefinition", 	"DmsModule");
		cd.addValue("derivedFrom", 			ucoModule.getSV("baseDefinition"));
        // The name of a domain specific definition module is schema.dsdmodulename.DSDefinitionModule
        // For the associated class, it will be schema.dsdmodulename.ClassDefinition
		cd.addValue("dotName", 				"meta.DmsModule.ClassDefinition");
		
		cd.addValue("javaClass", "org.dmd.dms.server.extended.DmsModule");
		cd.addValue("dmoImport", "org.dmd.dms.shared.generated.dmo.DmsModuleDMO");
		
		
		cd.addValue("file", 				ucoModule.getFile());
		cd.addValue("lineNumber", 			ucoModule.getLineNumber() + "");
//		cd.addValue("definedIn", 			"meta");
		cd.addValue("useWrapperType", 		"EXTENDED");
		
		cd.addValue("must", 				"name");
		cd.addValue("may", 					"description");
		cd.addValue("may", 					"defFiles");
		
		NamedStringArray values = null;
		
		values = ucoModule.get("must");
		if (values!= null){
			for(String value: values)
				cd.addValue("must", value);
		}
		
		values = ucoModule.get("may");
		if (values!= null){
			for(String value: values)
				cd.addValue("may", value);
		}
		
		// The DMUncheckedObjectManager is very simple and can't deal with the ambiguity
		// of having two things with the same name of different construction classes,
		// so we remove the module.
		ucoManager.deleteObject(ucoModule);
		ucoManager.add(cd);
	}
	
	/**
	 * Naming and filter attributes are special in that their associated types must know
	 * the attribute container to create when NameContainer or FilterContainers are used.
	 * See the TypeDefinition documentation for further details.
	 */
	private void setDesignatedNameAndFilterAttributesOnTypes() {
		for(DMUncheckedObject attr: ucoAttributeDefs.values()){
			String name 						= attr.getSV("name");
			String designatedNameAttribute 		= attr.getSV("designatedNameAttribute");
			String designatedFilterAttribute 	= attr.getSV("designatedFilterAttribute");
			if (designatedNameAttribute != null) {
				String type = attr.getSV("type");

				DMUncheckedObject typeDef = ucoTypeDefs.get(type);

				typeDef.addValue("nameAttributeDef", name);
			}
			if (designatedFilterAttribute != null) {
				String type = attr.getSV("type");

				DMUncheckedObject typeDef = ucoTypeDefs.get(type);

				typeDef.addValue("filterAttributeDef", name);
			}
		}
	}

	private void dumpCompactSchema() throws IOException, DMFeedbackSet {
		CompactSchemaFormatter csf = new CompactSchemaFormatter(System.out);
		
		csf.dumpSchema("meta", "org.dmd.dms.shared", ucoClassDefs, ucoAttributeDefs, ucoTypeDefs, dmoDir, META_BASE_ID, META_ID_RANGE);
	}

	/**
	 * ClassDefinitions come in two broad categories, ones that defined named objects
	 * and ones that defined unnamed objects. Named objects are ones that can be 
	 * persisted and manipulated as separate entities via various protocols or APIs.
	 * Unnamed objects can be stored as separate values within another object, but can't
	 * be manipulated outside of the context of the object that contains them.
	 * </p.
	 * We only create REF (reference) types for named objects.
	 * @throws DMFeedbackSet
	 */
	void createInternalReferenceTypesForClasses() throws DMFeedbackSet {
		for(DMUncheckedObject classDef: ucoManager.getObjects("ClassDefinition").values()){
			String 				cn 			= classDef.getSV("name");
			String 				isNamedBy 	= classDef.getSV("isNamedBy");
			String 				tn 			= null;
			DMUncheckedObject 	typeDef 	= null;

			if (isNamedBy != null) {
				tn = cn + "REF";
				typeDef = new DMUncheckedObject("TypeDefinition");
				typeDef.addValue("name", cn + "REF");
				typeDef.addValue("dotName", 			"meta." + cn + "REF.TypeDefinition");
				typeDef.addValue("typeClassName",		sharedGenTypesPackage + ".DmcType" + cn + "REF");
				typeDef.addValue("wrapperClassName",	classDef.getSV("javaClass"));
				typeDef.addValue("internallyGenerated", "true");
				typeDef.addValue("isRefType", 			"true");
				typeDef.addValue("description", 		"This is an internally generated type to allow references to " + cn + " objects.");
				typeDef.addValue("originalClass", 		cn);

				checkForDuplicateType("ClassDefinition", tn);

				ucoTypeDefs.put(tn, typeDef);
//				origOrderTypes.add(tn);
			}
		}
	}
	
//	void createInternalTypesForEnums() throws DMFeedbackSet{
//		for(DMUncheckedObject enumDef: ucoManager.getObjects("EnumDefinition").values()){
//			String tn = enumDef.getSV("name");
//
//			DMUncheckedObject typeDef = new DMUncheckedObject("TypeDefinition");
//			typeDef.addValue("name", 				tn);
//			typeDef.addValue("internallyGenerated", "true");
//			typeDef.addValue("dotName", 			"meta." + tn + ".TypeDefinition");
//			typeDef.addValue("enumName", 			tn);
//			typeDef.addValue("description",			"This is an internally generated type for the " + tn + " enumeration.");
//			typeDef.addValue("typeClassName",		sharedGenTypesPackage + ".DmcType" + tn);
//			typeDef.addValue("primitiveType", 		sharedGenEnumsPackage + "." + tn);
//			typeDef.addValue("isEnumType", 			"true");
////			typeDef.addValue("definedInDmsModule", 	"meta");
//			
//			String nrv = enumDef.getSV("nullReturnValue");
//			if (nrv != null)
//				typeDef.addValue("nullReturnValue", nrv);
//			
//			if (tn.equals("WrapperTypeEnum")){
//        		DebugInfo.debug("ADDING WRAPPER TYPE ENUM: \n\n");
//			}
//			
//			ucoTypeDefs.put("tn", typeDef);
//			ucoManager.add(typeDef, false);
//		}
//	}
	
	void createInternaReferenceTypesForEnums() throws DMFeedbackSet{
		for(DMUncheckedObject enumDef: ucoManager.getObjects("EnumDefinition").values()){
			String cn = enumDef.getSV("name");
//			String tn = cn + "REF";
			String tn = cn;

			DMUncheckedObject typeDef = new DMUncheckedObject("TypeDefinition");
			typeDef.addValue("name", 				tn);
			typeDef.addValue("dotName", 			"meta." + tn + ".TypeDefinition");
			typeDef.addValue("enumName", 			cn);
			typeDef.addValue("typeClassName",		sharedGenTypesPackage + ".DmcType" + cn);
			typeDef.addValue("primitiveType", 		sharedGenEnumsPackage + "." + cn);
			typeDef.addValue("internallyGenerated", "true");
			// Need to know if it's an enum type so that we can set values properly later
			typeDef.addValue("isEnumType", 			"true");
			typeDef.addValue("description",			"This is an internally generated type to allow references to " + cn + " objects.");

			checkForDuplicateType("EnumDefinition", cn);

			ucoManager.add(typeDef, false);
		}
	}
		
	/**
	 * For each ComplexTypeDefinition we create the corresponding TypeDefinition.
	 * @throws ResultException
	 */
	void createInternalTypesForComplexTypes() throws DMFeedbackSet {
		for(DMUncheckedObject ctdef: ucoManager.getObjects("ComplexTypeDefinition").values()){
			String cn = ctdef.getSV("name");
			String tn = cn;

			DMUncheckedObject typeDef = new DMUncheckedObject("TypeDefinition");
			
			typeDef.addValue("name", 				cn);
			typeDef.addValue("dotName", 			"meta." + cn + ".TypeDefinition");
			typeDef.addValue("typeClassName",		sharedGenTypesPackage + ".DmcType" + cn);
			typeDef.addValue("primitiveType", 		sharedGenTypesPackage + "." + cn);
			typeDef.addValue("internallyGenerated", "true");
			typeDef.addValue("description",			"This is an internally generated type to represent complex type " + cn + ".");

			checkForDuplicateType("ComplexTypeDefinition", tn);
		
			ucoTypeDefs.put(tn, typeDef);
			
//			origOrderTypes.add(tn);
		}

	}

	/**
	 * Checks that we don't already have a type of the name.
	 * @param baseDefinition the base definition from which we're creating the new internal type.
	 * @param tn the type name
	 * @throws DMFeedbackSet
	 */
	void checkForDuplicateType(String baseDefinition, String tn) throws DMFeedbackSet{
		DMUncheckedObject existing = ucoTypeDefs.get(tn);
		if (existing != null){
			// We have a clashing type name
			throw(new DMFeedbackSet(baseDefinition + ": " + tn + " clashes with TypeDefinition:\n" + existing.toOIF()));
		}
	}

	void dumpDMOs() throws DMFeedbackSet, IOException {
		for(DMUncheckedObject cdef: ucoManager.getObjects("ClassDefinition").values()){
			DmoFormatter.formatDMOForClass(ucoManager, dmoDir, cdef, LGPL.toString());
		}
	}
	
	void dumpTypes() throws IOException, DMFeedbackSet {
		for(DMUncheckedObject cdef: ucoManager.getObjects("ClassDefinition").values()){
			TypeFormatter.dumpTypeHelpersClass(typeDir, cdef, LGPL.toString());
		}
		for(DMUncheckedObject enumdef: ucoManager.getObjects("EnumDefinition").values()){
			TypeFormatter.dumpEnumTypeHelper(typeDir, enumdef, LGPL.toString());
		}

	}
	
	void dumpEnums() throws IOException, DMFeedbackSet {
		for(DMUncheckedObject enumdef: ucoManager.getObjects("EnumDefinition").values()){
			EnumFormatter.dumpEnumClass(enumDir, enumdef, "");
		}
	}
	
	void dumpComplexTypes() throws IOException, DMFeedbackSet {
		for(DMUncheckedObject ctdef: ucoManager.getObjects("ComplexTypeDefinition").values()){
			System.out.println("CT: " + ctdef.getSV("name"));
			ComplexTypeFormatter.dumpComplexType(typeDir, ctdef, this);
		}
	}
	
	///////////////////////////////////////////////////////////////////////////
	// DMUncheckedObjectHandlerIF

	@Override
	public void handleObject(DMUncheckedObject uco, String infile, int lineNumber) throws DMFeedbackSet {
		
//		System.out.println(uco.toOIF());
		
		ucoManager.add(uco);
		
		uco.addValue("dotName", "meta." + uco.getSV("name") + "." + uco.getConstructionClass());
		
		if (uco.getConstructionClass().equals(SCHEMA_DEFINITION)){
			if (metaSchema != null){
				DMParsingFeedback pf = new DMParsingFeedback("Multiple SchemaDefinitions found.", infile, lineNumber);
				throw(new DMFeedbackSet(pf));
			}
			metaSchema = uco;
		}
		
	}
	
	void createDir(String dir) {
		File folder = new File(dir);
		
		if (!folder.exists()){
			if (!folder.mkdirs()){
				throw(new IllegalStateException("Couldn't create directory: " + dir));
			}
		}
		
	}
	
	/**
	 * Reads the LGPL header.
	 * @throws IOException
	 */
	void readHeader() throws IOException {
		// Read the license header
		LineNumberReader in = new LineNumberReader(new FileReader(dmconfigDir + "/LGPL.txt"));
		String str;
		while ((str = in.readLine()) != null) {
			LGPL.append(str + "\n");
		}
		in.close();
	}


}

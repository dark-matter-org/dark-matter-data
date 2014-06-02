package org.dmd.dms.tools.dmogen;

import java.io.IOException;
import java.util.Iterator;

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.dms.server.extended.ClassDefinition;
import org.dmd.dms.server.extended.ComplexTypeDefinition;
import org.dmd.dms.server.extended.DmsDefinition;
import org.dmd.dms.server.extended.DmsModule;
import org.dmd.dms.server.extended.EnumDefinition;
import org.dmd.dms.server.extended.ExtendedReferenceTypeDefinition;
import org.dmd.dms.server.extended.TypeDefinition;
import org.dmd.dms.server.generated.dsd.DmsModuleDefinitionManager;
import org.dmd.dms.server.generated.dsd.DmsModuleGenUtility;
import org.dmd.dms.shared.generated.enums.ClassTypeEnum;
import org.dmd.dms.shared.generated.enums.WrapperTypeEnum;
import org.dmd.dms.shared.types.DotName;
import org.dmd.util.parsing.ConfigLocation;
import org.dmd.util.runtime.DebugInfo;

public class DMOGen extends DmsModuleGenUtility {
	
	final static String DMO 	= "DMO";
	final static String TPREFIX = "DmcType";
	final static String DMW 	= "DMW";
	final static String DMWIT 	= "IterableDMW";
	final static String REF 	= "REF";
	
	final static String DOT 	= ".";
	
	String dmoPackage;
	String dmwPackage;
	String extPackage;
	String typesPackage;
	String enumsPackage;
	
	@Override
	public void initialize() throws DMFeedbackSet {
		
	}

	@Override
	public void parsingComplete(DmsModule module, ConfigLocation location, DmsModuleDefinitionManager definitions) throws DMFeedbackSet {
		DebugInfo.debug("");
		
		dmoPackage 		= module.getSchemaPackage() + "generated.dmo";
		dmwPackage 		= module.getDmwPackage() + "generated.dmw";
		extPackage 		= module.getDmwPackage() + "extended";
		typesPackage	= module.getSchemaPackage() + "generated.types";
		enumsPackage	= module.getSchemaPackage() + "generated.enums";
		
		setInternalClassAttributes(module, definitions);
		createInternalTypesForClasses(module, definitions);
		createInternalTypesForEnums(module, definitions);
		createInternalTypesForComplexTypes(module, definitions);
		createInternalTypesForExtendedReferenceTypes(module, definitions);
	}
	
	@Override
	public void objectResolutionComplete(DmsModule module, ConfigLocation location, DmsModuleDefinitionManager definitions) throws DMFeedbackSet {
		// TODO Auto-generated method stub
		DebugInfo.debug("");
		
	}

	@Override
	public void generate(DmsModule module, ConfigLocation location, DmsModuleDefinitionManager definitions) throws IOException {
		// TODO Auto-generated method stub
		DebugInfo.debug("");
		
	}

	@Override
	public void generate(DmsModuleDefinitionManager definitions) throws IOException {
		// TODO Auto-generated method stub
		DebugInfo.debug("");
		
	}

	@Override
	public void displayHelp() {
		// TODO Auto-generated method stub
		DebugInfo.debug("");
		
	}
	
	///////////////////////////////////////////////////////////////////////////
	
	/**
	 * ClassDefinitions have a variety of attributes that get set internally and
	 * are used to facilitate the code generation process; that's what we do here.
	 * @param module the module being read
	 * @param definitions the overall set of definitions
	 * @throws DMFeedbackSet 
	 */
	private void setInternalClassAttributes(DmsModule module, DmsModuleDefinitionManager definitions) throws DMFeedbackSet {
		Iterator<ClassDefinition> classIT = module.getAllClassDefinition();
		while(classIT.hasNext()){
			ClassDefinition def = classIT.next();
			
			def.setDmoImport(dmoPackage + DOT + def.getName() + DMO);
			def.setDmoClass(def.getName() + DMO);
			
			def.setDmwImport(dmwPackage + DOT + def.getName() + DMW);
			def.setDmwClass(def.getName() + DMW);
			
			def.setDmwIteratorImport(dmwPackage + DOT + def.getName() + DMWIT);
			def.setDmwIteratorClass(def.getName() + DMWIT);
			
			def.setDmtImport(typesPackage + DOT + TPREFIX + def.getName() + REF);
			def.setDmtClass(def.getName() + REF);
			def.setDmtREFImport(typesPackage + DOT + def.getName() + REF);
			
	        if (def.getUseWrapperType() == WrapperTypeEnum.EXTENDED){
	        	if (def.getSubpackage() == null)
	            	def.setDmeImport(extPackage + DOT + def.getName());        		
	        	else
	            	def.setDmeImport(extPackage + DOT + def.getSubpackage() + DOT + def.getName());
	            def.setDmeClass(def.getName());
	        }
	        else{
	        	// TODO: think this was originally put in because an error in
	        	// rule checking and was thus an internal error - this shouldn't
	        	// be needed any more.
	            def.setDmeImport("THE WRAPPER FOR " + def.getName() + " ISN'T EXTENDED - YOU'VE GOT A CODE GENERATION ERROR! DWEEB!");        		
	            def.setDmeClass("THE WRAPPER FOR " + def.getName() + " ISN'T EXTENDED - YOU'VE GOT A CODE GENERATION ERROR! DWEEB!");
	        }

	        // And now, set the java class that will be used with the DmwObjectFactory
	        if (def.getJavaClass() == null){
	        	if (def.getUseWrapperType() == WrapperTypeEnum.BASE)
	        		def.setJavaClass(def.getDmwImport());
	        	else if (def.getUseWrapperType() == WrapperTypeEnum.EXTENDED){
	        		def.setJavaClass(def.getDmeImport());
	        	}
	        }
		}
	}

	private void createInternalTypesForClasses(DmsModule module, DmsModuleDefinitionManager definitions) throws DMFeedbackSet {
		Iterator<ClassDefinition> classIT = module.getAllClassDefinition();
		while(classIT.hasNext()){
			ClassDefinition def = classIT.next();
			
			// We don't generate REF types for auxiliary classes, this is
			// because we can't refer to auxiliary by name - they are simply
			// used to augment existing objects.
			if (def.getClassType() == ClassTypeEnum.AUXILIARY)
				continue;

			// Common aspects for types
	        TypeDefinition td  = new TypeDefinition();
	        td.setInternallyGenerated(true);
	        td.setName(def.getName());
			td.setDotName(getTypeDotName(def));
			td.setTypeClassName(getTypeClassName(def) + REF);
			td.setPrimitiveType(dmoPackage + DOT + def.getName());
			td.setDefinedInDmsModule(module);
	        td.addDescription("This is an internally generated type to allow references to " + def.getName() + " values.");

	        // Class specific aspects
	        td.setOriginalClass(def);
	        
	        // Set the class's internally generated type so that we can resolve references to the class used as a type
	        def.setInternalTypeRef(td);
	        
			// Add the definition to the module and the global definition manager
			module.addTypeDefinition(td);
			definitions.addTypeDefinition(td);

		}
	}
	
	private void createInternalTypesForEnums(DmsModule module, DmsModuleDefinitionManager definitions) throws DMFeedbackSet {
		// Create the internal types to represent enumerations
		Iterator<EnumDefinition>	enumIT = module.getAllEnumDefinition();
		while(enumIT.hasNext()){
			EnumDefinition def = enumIT.next();
			
			// Common aspects for types
	        TypeDefinition td  = new TypeDefinition();
	        td.setInternallyGenerated(true);
	        td.setName(def.getName());
			td.setDotName(getTypeDotName(def));
			td.setTypeClassName(getTypeClassName(def));
			td.setPrimitiveType(enumsPackage + DOT + def.getName());
			td.setDefinedInDmsModule(module);
	        td.addDescription("This is an internally generated type to allow references to " + def.getName() + " values.");
			
	        // Enum specific aspects
			td.setIsEnumType(true);
			td.setEnumName(def.getName());

			if (def.getNullReturnValue() != null)
				td.setNullReturnValue(def.getNullReturnValue());
			
			// Add the definition to the module and the global definition manager
			module.addTypeDefinition(td);
			definitions.addTypeDefinition(td);
		}		
	}
	
	private void createInternalTypesForComplexTypes(DmsModule module, DmsModuleDefinitionManager definitions) throws DMFeedbackSet {
		Iterator<ComplexTypeDefinition> complexIT = module.getAllComplexTypeDefinition();
		while(complexIT.hasNext()){
			ComplexTypeDefinition def = complexIT.next();
			
			if (def instanceof ExtendedReferenceTypeDefinition)
				continue;
		
			// Common aspects for types
	        TypeDefinition td  = new TypeDefinition();
	        td.setInternallyGenerated(true);
	        td.setName(def.getName());
			td.setDotName(getTypeDotName(def));
			td.setTypeClassName(getTypeClassName(def));
			td.setPrimitiveType(typesPackage + DOT + def.getName());
			td.setDefinedInDmsModule(module);
	        td.addDescription("This is an internally generated type to represent complex type " + def.getName() + " values.");
		}		
	}
	
	private void createInternalTypesForExtendedReferenceTypes(DmsModule module, DmsModuleDefinitionManager definitions) throws DMFeedbackSet {
		Iterator<ExtendedReferenceTypeDefinition> refIT = definitions.getAllExtendedReferenceTypeDefinition();
		while(refIT.hasNext()){
			ExtendedReferenceTypeDefinition def = refIT.next();
			
			// Common aspects for types
	        TypeDefinition td  = new TypeDefinition();
	        td.setInternallyGenerated(true);
	        td.setName(def.getName());
			td.setDotName(getTypeDotName(def));
			td.setTypeClassName(getTypeClassName(def));
			td.setPrimitiveType(typesPackage + DOT + def.getName());
			td.setDefinedInDmsModule(module);
	        td.addDescription("This is an internally generated type to represent extended reference type " + def.getName() + " values.");
			
	        // Extended reference specific aspects
	        
	        // NOTE: At this stage, the extendedReferenceClass attribute hasn't been resolved,
	        // so we're setting the original class based on the name of the extendedReferenceClass
	        // This will get resolved in the next step of the process.
	        td.getDMO().setOriginalClass(def.getDMO().getExtendedReferenceClass().cloneMe());
	        
		}
	}
	
	DotName getTypeDotName(DmsDefinition def) throws DMFeedbackSet{
		return(new DotName(def.getDefinedInDmsModule().getName() + DOT + def.getName() + "TypeDefinition"));
	}
	
	String getTypeClassName(DmsDefinition def){
		return(typesPackage + ".DmcType" + def.getName());
	}



}

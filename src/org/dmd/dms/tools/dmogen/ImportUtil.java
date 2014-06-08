package org.dmd.dms.tools.dmogen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

import org.dmd.core.feedback.DMFeedback;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.dms.server.extended.ActionDefinition;
import org.dmd.dms.server.extended.AttributeDefinition;
import org.dmd.dms.server.extended.ClassDefinition;
import org.dmd.dms.server.extended.TypeDefinition;
import org.dmd.dms.shared.generated.enums.ClassTypeEnum;
import org.dmd.dms.shared.generated.enums.ValueTypeEnum;
import org.dmd.dms.shared.types.BooleanVar;
import org.dmd.dms.shared.types.DefinitionName;
import org.dmd.util.artifact.java.ImportManager;


public class ImportUtil {

//	/**
//	 * This method cycles through the class derivation hierarchy and the types required by all
//	 * attributes associated with this class to determine the appropriate set of import statements
//	 * required for the DMO.
//	 * @param cd
//	 * @return
//	 * @throws DMFeedbackSet  
//	 */
//	static void getImports(ImportManager imports, DmsDefinition def, Iterator<AttributeDefinition> must, Iterator<AttributeDefinition> may, ArrayList<AttributeDefinition> allAttr, BooleanVar anySVAttributes, BooleanVar anyMVAttributes) throws DMFeedbackSet {
//		ClassDefinition	cd 				= null;
//		boolean			anyAttributes	= false;
//		TreeMap<DefinitionName,TypeDefinition>	types = new TreeMap<DefinitionName,TypeDefinition>();
//		TreeSet<String>	genericImports	= new TreeSet<String>();
//		
//		anyMVAttributes.set(false);
//		anySVAttributes.set(false);
////		allAttr 		= new ArrayList<AttributeDefinition>();
//		
//		if (def instanceof ClassDefinition){
//			cd = (ClassDefinition) def;
//			imports.imports.addImport("java.io.Serializable", "Always required");
//			
//			if (cd.getDerivedFrom() == null)
//				imports.imports.addImport("org.dmd.core.DmcObject", "This is a base class not derived from anything else");
//				
//		}
//		
//		if (may != null){
//			anyAttributes = true;
//			while(may.hasNext()){
//				AttributeDefinition ad = may.next();
//				TypeDefinition td = ad.getType();
//				types.put(td.getName(), td);
//				
//				switch(ad.getValueType()){
//				case SINGLE:
//					anySVAttributes.set(true);
//					break;
//				case MULTI:
//				case HASHMAPPED:
//				case TREEMAPPED:
//				case HASHSET:
//				case TREESET:
//					anyMVAttributes.set(true);
//					imports.imports.addImport("java.util.*", "We have multi-valued attributes of some type");
//					break;
//				}
//
//				if (ad.getGenericArgsImport() != null)
//					genericImports.add(ad.getGenericArgsImport());
//				
//				allAttr.add(ad);
//			}
//		}
//		
//		if (must != null){
//			anyAttributes = true;
//			while(must.hasNext()){
//				AttributeDefinition ad = must.next();
//				TypeDefinition td = ad.getType();
//				types.put(td.getName(), td);
//				
//				switch(ad.getValueType()){
//				case SINGLE:
//					anySVAttributes.set(true);
//					break;
//				case MULTI:
//				case HASHMAPPED:
//				case TREEMAPPED:
//				case HASHSET:
//				case TREESET:
//					anyMVAttributes.set(true);
//					imports.imports.addImport("java.util.*", "We have multi-valued attributes of some type");
//					break;
//				}
//
//				if (ad.getGenericArgsImport() != null)
//					genericImports.add(ad.getGenericArgsImport());
//				
//				allAttr.add(ad);
//			}
//		}
//		
//		
//		if (anyAttributes){
//			imports.imports.addImport("org.dmd.core.DmcAttribute", "Because we have attributes");
//			imports.imports.addImport("org.dmd.core.feedback.DMFeedbackSet", "Because we have attributes");
//			imports.imports.addImport("org.dmd.core.schema.DmcAttributeInfo", "Because we have attributes");
//			imports.imports.addImport("org.dmd.dms.shared.generated.enums.ValueTypeEnum", "Because we have attributes");
//		}
//		
//		for(String s: genericImports){
//			imports.imports.addImport(s, "To support type generics");
//		}
//
//		// If the class is auxiliary, we need the DmcTypeString to manipulate the ocl attribute
//		if (cd != null){
//			if (cd.getClassType() == ClassTypeEnum.AUXILIARY){
//				types.put(new DefinitionName("String"), MetaDmsModule._String);
//			}
//		}
//
//		Iterator<TypeDefinition> t = types.values().iterator();
//		while(t.hasNext()){
//			TypeDefinition td = t.next();
//
//			if (cd != null){
//				if ( (td.getPrimitiveType() != null) && (cd.getClassType() != ClassTypeEnum.AUXILIARY) ){
//					
//					if (td.getInternallyGenerated() && td.getIsRefType()){
//						// We have an internally generated reference type, only import if
//						// the definition is from a different schema, otherwise, we're
//						// already in the same package and don't need to import it
//						if (cd.getDefinedInDmsModule() != td.getDefinedInDmsModule()){
//							imports.imports.addImport(td.getPrimitiveType(), "Primitive type");
//						}
//					}
//					else{
//						imports.imports.addImport(td.getPrimitiveType(), "Primitive type");
//					}
//				}
//			}
//			
//			if (td.getIsRefType()){
//				if (td.getOriginalClass().getDmtImport() == null)
//					DebugInfo.debug("HERE");
//				imports.imports.addImport(td.getOriginalClass().getDmtImport(), "Because it's a REF type");
//			}
//			else{
//				imports.imports.addImport(td.getTypeClassName(), "Unnamed object reference");
//			}
//			
//			if (td.getHelperClassName() != null){
//				imports.imports.addImport(td.getHelperClassName(), "The helper class");
//			}
//		}
//		
//	}
	
	
	static public void getImports(ImportManager imports, ActionDefinition ad, ArrayList<AttributeDefinition> allAttr, BooleanVar anySVAttributes, BooleanVar anyMVAttributes) throws DMFeedbackSet{
//		attributeInfo = new StringBuffer();
		getImports(imports,(ClassDefinition)null,ad,ad.getMayParm(),ad.getMustParm(),allAttr,anySVAttributes,anyMVAttributes);
	}
	
	static public void getImports(ImportManager imports, ClassDefinition cd, Iterator<AttributeDefinition> may, Iterator<AttributeDefinition> must, ArrayList<AttributeDefinition> allAttr, BooleanVar anySVAttributes, BooleanVar anyMVAttributes) throws DMFeedbackSet{
		getImports(imports,cd,null,may,must,allAttr,anySVAttributes,anyMVAttributes);
	}
		
	/**
	 * This method cycles through the class derivation hierarchy and the types required by all
	 * attributes associated with this class to determine the appropriate set of import statements
	 * required for the DMO.
	 * @param cd
	 * @param anyMVAttributes 
	 * @param anySVAttributes 
	 * @return
	 * @throws DMFeedbackSet 
	 * @throws ResultException 
	 */
	static void getImports(ImportManager imports, ClassDefinition cd, ActionDefinition act, Iterator<AttributeDefinition> may, Iterator<AttributeDefinition> must, ArrayList<AttributeDefinition> allAttr, BooleanVar anySVAttributes, BooleanVar anyMVAttributes) throws DMFeedbackSet{
		boolean									anyAttributes	= false;
		boolean									anyAttributesAtThisLevel = false;
		TreeMap<DefinitionName,TypeDefinition>	types 			= new TreeMap<DefinitionName,TypeDefinition>();
		TreeMap<String,TypeAndAttr>				typeAndAttr 	= new TreeMap<String,TypeAndAttr>();
		TreeSet<String>							genericImports	= new TreeSet<String>();
		
		anyMVAttributes.set(false);
		anySVAttributes.set(false);
		
		if (may != null){
			while(may.hasNext()){
				AttributeDefinition ad = may.next();
				anyAttributes = true;
				
				TypeDefinition td = ad.getType();
				types.put(td.getName(), td);
				
				TypeAndAttr ta = new TypeAndAttr(td,ad.getValueType(),ad.getIndexSize());
				typeAndAttr.put(ta.name, ta);
				
				switch(ad.getValueType()){
				case SINGLE:
					anySVAttributes.set(true);;
					break;
				case MULTI:
					if (ad.getIndexSize() == null){
						anyMVAttributes.set(true);
					}
					else{
						if (td.getIsRefType() == false)
							anyMVAttributes.set(true);
					}
					break;
				case HASHMAPPED:
				case TREEMAPPED:
				case HASHSET:
				case TREESET:
					anyMVAttributes.set(true);
					break;
				}
				
				if (ad.getGenericArgsImport() != null)
					genericImports.add(ad.getGenericArgsImport());
				
				if ((cd != null) && (cd.getClassType() == ClassTypeEnum.AUXILIARY))
					imports.addImport(ad.getDefinedInDmsModule().getCompactSchemaImport(), "Attribute from " + ad.getDefinedInDmsModule().getName() + " schema");
					
				if ((cd != null) && (ad.getDefinedInDmsModule() != cd.getDefinedInDmsModule()))
					imports.addImport(ad.getDefinedInDmsModule().getCompactSchemaImport(), "Attribute from " + ad.getDefinedInDmsModule().getName() + " schema");
					
				if ((act != null) && (ad.getDefinedInDmsModule() != act.getDefinedInDmsModule()))
					imports.addImport(ad.getDefinedInDmsModule().getCompactSchemaImport(), "Attribute from " + ad.getDefinedInDmsModule().getName() + " schema");
					
				allAttr.add(ad);
			}
		}
		
		if (must != null){
			while(must.hasNext()){
				AttributeDefinition ad = must.next();
				anyAttributes = true;
				
				TypeDefinition td = ad.getType();
				types.put(td.getName(), td);
				
				TypeAndAttr ta = new TypeAndAttr(td,ad.getValueType(),ad.getIndexSize());
				typeAndAttr.put(ta.name, ta);
				
				switch(ad.getValueType()){
				case SINGLE:
					anySVAttributes.set(true);
					break;
				case MULTI:
					// We don't need java.util with indexed multi-values
					if (ad.getIndexSize() == null){
						anyMVAttributes.set(true);
					}
					else{
						if (td.getIsRefType() == false)
							anyMVAttributes.set(true);
					}
					break;
				case HASHMAPPED:
				case TREEMAPPED:
				case HASHSET:
				case TREESET:
					anyMVAttributes.set(true);
					break;
				}
								
				if (ad.getGenericArgsImport() != null)
					genericImports.add(ad.getGenericArgsImport());

				if ((cd != null) && (cd.getClassType() == ClassTypeEnum.AUXILIARY))
					imports.addImport(ad.getDefinedInDmsModule().getCompactSchemaImport(), "Attribute from " + ad.getDefinedInDmsModule().getName() + " schema");

				if ((cd != null) && (ad.getDefinedInDmsModule() != cd.getDefinedInDmsModule()))
					imports.addImport(ad.getDefinedInDmsModule().getCompactSchemaImport(), "Attribute from " + ad.getDefinedInDmsModule().getName() + " schema");
					
				if ((act != null) && (ad.getDefinedInDmsModule() != act.getDefinedInDmsModule()))
					imports.addImport(ad.getDefinedInDmsModule().getCompactSchemaImport(), "Attribute from " + ad.getDefinedInDmsModule().getName() + " schema");
					
				allAttr.add(ad);
			}
		}
		
		
		anyAttributesAtThisLevel = anyAttributes;
		
		if ( (cd != null) && (cd.getFullAttrMap().size() > 0) )
			anyAttributes = true;
		
		if (anyMVAttributes.booleanValue())
			imports.addImport("java.util.*", "Always required if we have any MV attributes");
			
		if ( (cd != null) && (cd.getClassType() != ClassTypeEnum.AUXILIARY))
			imports.addImport("java.io.Serializable", "Always required");
			
		if ( (cd != null) && (cd.getClassType() != ClassTypeEnum.ABSTRACT) && (cd.getClassType() != ClassTypeEnum.AUXILIARY)){
			imports.addImport("org.dmd.dms.shared.generated.types.DmcTypeModifierMV", "Required for MODREC constructor");
			imports.addImport("org.dmd.dms.shared.generated.dmo.MetaCompactSchema", "Required for MODREC constructor");
			imports.addImport("org.dmd.core.schema.DmcSliceInfo", "Required for object slicing");
		}
			
		if (anyAttributesAtThisLevel){
			imports.addImport("org.dmd.core.DmcAttribute", "Any attributes");
			imports.addImport("org.dmd.core.feedback.DMFeedbackSet", "Any attributes");
		}
		
		for(String s: genericImports){
			imports.addImport(s, "Generic args import");
		}

		for(TypeAndAttr ta: typeAndAttr.values()){
			
			TypeDefinition td = ta.td;
			
			if ( (td.getPrimitiveType() != null) && (cd != null) && (cd.getClassType() != ClassTypeEnum.AUXILIARY) ){
				if ( !(td.getInternallyGenerated() && td.getIsRefType())){
//					// We have an internally generated reference type, only import if
//					// the definition is from a different schema, otherwise, we're
//					// already in the same package and don't need to import it
//					if (cd.getDefinedInDmsModule() != td.getDefinedInDmsModule()){
//						// NOTE: GetRequest has an unneeded ClassDefinitionDMO import because of this
//						// need to figure out the right criteria
//						
////						imports.addImport(td.getPrimitiveType(), "Primitive type and !auxiliary - internally generated reference type");
//					}
//				}
//				else{
					imports.addImport(td.getPrimitiveType(), "Primitive type and !auxiliary class");
				}
			}
			
			if ( (td.getPrimitiveType() != null) && (act != null) ){
				if ( !(td.getInternallyGenerated() && td.getIsRefType())){
//					// We have an internally generated reference type, only import if
//					// the definition is from a different schema, otherwise, we're
//					// already in the same package and don't need to import it
//					if (act.getDefinedInDmsModule() != td.getDefinedInDmsModule()){
//						// NOTE: GetRequest has an unneeded ClassDefinitionDMO import because of this
//						// need to figure out the right criteria
//						
////						imports.addImport(td.getPrimitiveType(), "Primitive type and !auxiliary - internally generated reference type");
//					}
//				}
//				else{
					imports.addImport(td.getPrimitiveType(), "Primitive type and !auxiliary class");
				}
			}

			
			if (td.getAltType() != null){
				if (td.getAltTypeImport() != null)
					imports.addImport(td.getAltTypeImport(), "Alternative type for " + td.getName() + " values");
			}
			
			
			if (td.getIsRefType() && !td.getIsExtendedRefType()){
				imports.addImport(ta.getImport(), "Reference type");
				
				if (ta.valueType == ValueTypeEnum.TREEMAPPED){
					if (td.getOriginalClass().getIsNamedBy() != null)
						imports.addImport(td.getOriginalClass().getIsNamedBy().getType().getPrimitiveType(),"Name attribute type");
				}
				
				imports.addImport(td.getOriginalClass().getDmoImport(), "Type specific set/add");
				
//				if (td.getOriginalClass().getInternalTypeRef().getHelperClassName() != null){
				if (td.getHelperClassName() != null){
//					imports.addImport(td.getOriginalClass().getInternalTypeRef().getHelperClassName(), "Reference type helper class");
					imports.addImport(td.getHelperClassName(), "Reference type helper class");
					
					if ( (cd != null) && (cd.getClassType() != ClassTypeEnum.AUXILIARY))
						imports.addImport("org.dmd.core.DmcOmni", "Lazy resolution");
										
				}
			}
			else{
				if (td.getIsExtendedRefType())
					imports.addImport(td.getPrimitiveType(), "Extended reference type");

				imports.addImport(ta.getImport(), "Required type");
			}
			
			if (td.getIsExtendedRefType())
				imports.addImport("org.dmd.core.DmcOmni", "Lazy resolution");
			
			if (td.getHelperClassName() != null){
				imports.addImport(td.getHelperClassName(), "Helper class");
			}
			
			if (td.getKeyImport() != null){
				imports.addImport(td.getKeyImport(), "Key class");
			}
		}
		
		if (cd != null){
			if (cd.getDerivedFrom() == null){
				if (cd.getClassType() == ClassTypeEnum.AUXILIARY){
					imports.addImport("org.dmd.core.DmcObject", "Auxiliary class");
					imports.addImport("org.dmd.core.schema.DmcAttributeInfo", "Auxiliary class");
				}
				else{
					imports.addImport("org.dmd.core.DmcObject", "Structural class");
				}
			}
			else{
				imports.addImport(cd.getDerivedFrom().getDmoImport(), "Base class");
			}
			
			if (cd.getIsNamedBy() != null){
				AttributeDefinition isNamedBy = cd.getIsNamedBy();
				String nameAttributeType = isNamedBy.getType().getPrimitiveType();
				
				if (nameAttributeType == null){
					DMFeedback dmf = new DMFeedback("Naming attribute for class " + cd.getName() + " must be a complex type.", isNamedBy.getFile(), isNamedBy.getLineNumber());
					dmf.addToMessage("Check the type of attribute " + isNamedBy.getName().getNameString());
					throw(new DMFeedbackSet(dmf));
				}
				
				imports.addImport(nameAttributeType, "Naming attribute type");
				
				if (isNamedBy.getType().getIsHierarchicName())
					imports.addImport("org.dmd.core.interface.DmcHierarchicNamedObjectIF", "Named object");
				
				imports.addImport("org.dmd.core.interface.DmcNamedObjectIF", "Named object");
				imports.addImport("org.dmd.core.DmcAttribute", "Named object");
			}
		}

	}


}

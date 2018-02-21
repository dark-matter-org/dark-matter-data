package org.dmd.dmv.shared;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcCompactSchemaIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcUniqueNameResolverIF;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmc.rules.DmcRuleManager;
import org.dmd.dmc.rules.RuleCollection;
import org.dmd.dmc.util.DmcUncheckedObject;
import org.dmd.dmc.util.UcoDataStoreIF;
import org.dmd.dmc.util.UcoFeedbackIF;
import org.dmd.dms.generated.dmo.MetaDMSAG;
import org.dmd.dms.generated.rulesdmo.AttributeValidationRuleCollection;
import org.dmd.dms.generated.rulesdmo.AttributeValidationWithResolverRuleCollection;
import org.dmd.dms.generated.rulesdmo.InitializationRuleCollection;
import org.dmd.dms.generated.rulesdmo.ObjectValidationRuleCollection;
import org.dmd.dms.generated.rulesdmo.UCOAttributeAuditRuleCollection;
import org.dmd.dms.generated.rulesdmo.UCOAttributeNormalizationRuleCollection;
import org.dmd.dms.generated.rulesdmo.UCOMappingRuleCollection;
import org.dmd.dms.generated.rulesdmo.UCOObjectAuditRuleCollection;
import org.dmd.dms.generated.rulesdmo.UCOObjectNormalizationRuleCollection;
import org.dmd.dms.generated.rulesdmo.UCOValidationRuleCollection;
import org.dmd.dmv.shared.generated.dmo.DmvDMSAG;

/**
 * The DmvRuleManager class provides a basis for the management and execution of rules
 * that conform to various RunCategory definitions. At this level, we manage only those
 * categories of rules defined in the meta schema or in the Dark Matter Validation (DMV)
 * schema.
 * <p>
 * As you add new RuleCategory definitions, you'll have to derive from this class and
 * add support to trigger those categories of rules.
 */
public class DmvRuleManager extends DmcRuleManager {
	
	AttributeValidationRuleCollection				attributeValidators;
	
	ObjectValidationRuleCollection					objectValidators;
	
	AttributeValidationWithResolverRuleCollection	attributeValidatorsWithResolver;
	
//	AttributeModifierValidationRuleCollection	attrModValidators;
	
//	ObjectModifierValidationRuleCollection		objModValidators;
	
	InitializationRuleCollection					initializers;
	
	UCOValidationRuleCollection						ucoObjectvalidators;
	
	UCOAttributeNormalizationRuleCollection			ucoAttributeNormalizers;
	
	UCOObjectNormalizationRuleCollection			ucoObjectNormalizers;
	
	UCOMappingRuleCollection						ucoMappers;
	
	UCOAttributeAuditRuleCollection					ucoAttributeAuditors;
	
	UCOObjectAuditRuleCollection					ucoObjectAuditors;
	
	
	ArrayList<RuleCollection<?>>					ruleCollections;
	TreeMap<String,DmcCompactSchemaIF>				loadedSchemas;

	public DmvRuleManager() {
		ruleCollections = new ArrayList<RuleCollection<?>>();
		loadedSchemas	= new TreeMap<String, DmcCompactSchemaIF>();
		
		attributeValidators = new AttributeValidationRuleCollection();
		ruleCollections.add(attributeValidators);
		
		attributeValidatorsWithResolver = new AttributeValidationWithResolverRuleCollection();
		ruleCollections.add(attributeValidatorsWithResolver);
		
		objectValidators	= new ObjectValidationRuleCollection();
		ruleCollections.add(objectValidators);
		
//		attrModValidators	= new AttributeModifierValidationRuleCollection();
//		ruleCollections.add(attrModValidators);
//		
//		objModValidators	= new ObjectModifierValidationRuleCollection();
//		ruleCollections.add(objModValidators);
		
		initializers		= new InitializationRuleCollection();
		ruleCollections.add(initializers);
		
		ucoObjectvalidators	= new UCOValidationRuleCollection();
		ruleCollections.add(ucoObjectvalidators);
				
		ucoAttributeNormalizers	= new UCOAttributeNormalizationRuleCollection();
		ruleCollections.add(ucoAttributeNormalizers);
		
		ucoObjectNormalizers = new UCOObjectNormalizationRuleCollection();
		ruleCollections.add(ucoObjectNormalizers);
				
		ucoMappers	= new UCOMappingRuleCollection();
		ruleCollections.add(ucoMappers);
				
		ucoAttributeAuditors	= new UCOAttributeAuditRuleCollection();
		ruleCollections.add(ucoAttributeAuditors);
		
		ucoObjectAuditors = new UCOObjectAuditRuleCollection();
		ruleCollections.add(ucoObjectAuditors);
				
		loadRules(MetaDMSAG.instance());
		
		// We have to load the DmcOmni with the DMV schema before we attempt
		// to load the rules because we depend on it to find DmcClassInfo
		DmcOmni.instance().addCompactSchema(DmvDMSAG.instance());
		
		loadRules(DmvDMSAG.instance());
	}
	
	public void loadRules(DmcCompactSchemaIF schema){
		if (loadedSchemas.get(schema.getSchemaName()) == null){
			for(RuleCollection<?> collection: ruleCollections){
				collection.addRules(schema.getRules());
			}
			loadedSchemas.put(schema.getSchemaName(), schema);
		}
	}
	
	/**
	 * Executes the attribute validation rules for the specified object.
	 * @param obj the object whose attributes need checking.
	 * @throws DmcRuleExceptionSet
	 */
	public void executeAttributeValidation(DmcObject obj) throws DmcRuleExceptionSet {
		DmcRuleExceptionSet rc = null;
		
		Iterator<DmcAttribute<?>> attrs = obj.getAttributeIterator();
		while(attrs.hasNext()){
			try {
				attributeValidators.execute(obj, attrs.next());
			} catch (DmcRuleExceptionSet e) {
				if (rc == null)
					rc = e;
				else
					rc.add(e);
				
				if (rc.immediateHalt())
					break;
			}
		}
		
		if (rc != null)
			throw(rc);
	}
	
	/**
	 * Executes the attribute validation rules with name resolver for the specified object.
	 * @param obj the object whose attributes need checking.
	 * @throws DmcRuleExceptionSet
	 */
	public void executeAttributeValidationWithResolver(DmcObject obj, DmcUniqueNameResolverIF resolver) throws DmcRuleExceptionSet {
		DmcRuleExceptionSet rc = null;
		
		Iterator<DmcAttribute<?>> attrs = obj.getAttributeIterator();
		while(attrs.hasNext()){
			try {
				attributeValidatorsWithResolver.execute(obj, attrs.next(), resolver);
			} catch (DmcRuleExceptionSet e) {
				if (rc == null)
					rc = e;
				else
					rc.add(e);
				
				if (rc.immediateHalt())
					break;
			}
		}
		
		if (rc != null)
			throw(rc);
	}
	
	public void executeObjectValidation(DmcObject obj) throws DmcRuleExceptionSet {
		objectValidators.execute(obj);
	}
	
//	public void executeAttrModValidation(DmcObject obj, DmcTypeModifierMV mods) throws DmcRuleExceptionSet {
//		DmcRuleExceptionSet rc = null;
//		
//		Iterator<Modifier> modifiers = mods.getMV();
//		while(modifiers.hasNext()){
//			try {
//				attrModValidators.execute(obj, modifiers.next());
//			} catch (DmcRuleExceptionSet e) {
//				if (rc == null)
//					rc = e;
//				else
//					rc.add(e);
//				
//				if (rc.immediateHalt())
//					break;
//			}
//		}
//		
//		if (rc != null)
//			throw(rc);
//	}
//	
//	public void executeObjModValidators(DmcObject obj, DmcTypeModifierMV mods) throws DmcRuleExceptionSet {
//		objModValidators.execute(obj, mods);
//	}
	
	public void executeInitializers(DmcObject obj) throws DmcRuleExceptionSet{
		initializers.execute(obj);
	}
	
	public void executeUCOValidators(DmcUncheckedObject uco) throws DmcRuleExceptionSet{
		ucoObjectvalidators.execute(uco);
	}
	
	public void executeUCOAttributeNormalizers(DmcUncheckedObject uco, String attributeName, UcoDataStoreIF in, UcoFeedbackIF listener) throws DmcRuleExceptionSet{
		ucoAttributeNormalizers.execute(uco,attributeName,in,listener);
	}
	
	public void executeUCOObjectNormalizers(DmcUncheckedObject uco, UcoDataStoreIF in, UcoFeedbackIF listener) throws DmcRuleExceptionSet{
		ucoObjectNormalizers.execute(uco,in,listener);
	}
	
	public void executeUCOMappers(DmcUncheckedObject uco, UcoDataStoreIF in, UcoDataStoreIF out, UcoFeedbackIF listener) throws DmcRuleExceptionSet{
		ucoMappers.execute(uco,in,out,listener);
	}
	
	public void executeUCOAttributeAuditors(DmcUncheckedObject uco, String attributeName, UcoDataStoreIF in, UcoDataStoreIF out, UcoFeedbackIF listener) throws DmcRuleExceptionSet{
		ucoAttributeAuditors.execute(uco,attributeName,in,out,listener);
	}
	
	public void executeUCOObjectAuditors(DmcUncheckedObject uco, String attributeName, UcoDataStoreIF in, UcoDataStoreIF out, UcoFeedbackIF listener) throws DmcRuleExceptionSet{
		ucoObjectAuditors.execute(uco,in,out,listener);
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		
		for(RuleCollection<?> rc: ruleCollections){
			sb.append(rc.toString());
		}
		return(sb.toString());
	}
}

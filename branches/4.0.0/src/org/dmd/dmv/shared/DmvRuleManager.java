package org.dmd.dmv.shared;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.core.DmcAttribute;
import org.dmd.core.DmcObject;
import org.dmd.core.DmcOmni;
import org.dmd.core.interfaces.DmcUniqueNameResolverIF;
import org.dmd.core.rules.DmcRuleExceptionSet;
import org.dmd.core.rules.DmcRuleManager;
import org.dmd.core.rules.RuleCollection;
import org.dmd.core.schema.DmcCompactSchemaIF;
import org.dmd.core.util.DMUncheckedObject;
import org.dmd.dms.shared.generated.dmo.MetaDMSAG;
import org.dmd.dms.shared.generated.rulesdmo.AttributeValidationRuleCollection;
import org.dmd.dms.shared.generated.rulesdmo.AttributeValidationWithResolverRuleCollection;
import org.dmd.dms.shared.generated.rulesdmo.InitializationRuleCollection;
import org.dmd.dms.shared.generated.rulesdmo.ObjectValidationRuleCollection;
import org.dmd.dms.shared.generated.rulesdmo.UCOValidationRuleCollection;
import org.dmd.util.runtime.DebugInfo;


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
	
	InitializationRuleCollection					initializers;
	
	UCOValidationRuleCollection						ucoObjectvalidators;
	
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
		
		initializers		= new InitializationRuleCollection();
		ruleCollections.add(initializers);
		
		ucoObjectvalidators	= new UCOValidationRuleCollection();
		ruleCollections.add(ucoObjectvalidators);
				
		loadRules(MetaDMSAG.instance());
		
		// We have to load the DmcOmni with the DMV schema before we attempt
		// to load the rules because we depend on it to find DmcClassInfo
		
		System.err.println("Loading rules from DMV disabled!\n\n" + DebugInfo.getCurrentStack());
		
//		DmcOmni.instance().addCompactSchema(DmvDMSAG.instance());
//		
//		loadRules(DmvDMSAG.instance());
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
	
	
	public void executeInitializers(DmcObject obj) throws DmcRuleExceptionSet{
		initializers.execute(obj);
	}
	
	public void executeUCOValidators(DMUncheckedObject uco) throws DmcRuleExceptionSet{
		ucoObjectvalidators.execute(uco);
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		
		for(RuleCollection<?> rc: ruleCollections){
			sb.append(rc.toString());
		}
		return(sb.toString());
	}
}

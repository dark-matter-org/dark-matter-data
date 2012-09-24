package org.dmd.dmv.shared;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcCompactSchemaIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmc.rules.DmcRuleManager;
import org.dmd.dmc.rules.RuleCollection;
import org.dmd.dmc.types.Modifier;
import org.dmd.dmc.util.DmcUncheckedObject;
import org.dmd.dms.generated.dmo.MetaDMSAG;
import org.dmd.dms.generated.rulesdmo.AttributeModifierValidationRuleCollection;
import org.dmd.dms.generated.rulesdmo.AttributeValidationRuleCollection;
import org.dmd.dms.generated.rulesdmo.InitializationRuleCollection;
import org.dmd.dms.generated.rulesdmo.ObjectModifierValidationRuleCollection;
import org.dmd.dms.generated.rulesdmo.ObjectValidationRuleCollection;
import org.dmd.dms.generated.rulesdmo.UCOValidationRuleCollection;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
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
	
	AttributeValidationRuleCollection			attributeValidators;
	
	ObjectValidationRuleCollection				objectValidators;
	
	AttributeModifierValidationRuleCollection	attrModValidators;
	
	ObjectModifierValidationRuleCollection		objModValidators;
	
	InitializationRuleCollection				initializers;
	
	UCOValidationRuleCollection					ucoObjectvalidators;
	
	
	ArrayList<RuleCollection<?>>				ruleCollections;
	TreeMap<String,DmcCompactSchemaIF>			loadedSchemas;

	public DmvRuleManager() {
		ruleCollections = new ArrayList<RuleCollection<?>>();
		loadedSchemas	= new TreeMap<String, DmcCompactSchemaIF>();
		
		attributeValidators = new AttributeValidationRuleCollection();
		ruleCollections.add(attributeValidators);
		
		objectValidators	= new ObjectValidationRuleCollection();
		ruleCollections.add(objectValidators);
		
		attrModValidators	= new AttributeModifierValidationRuleCollection();
		ruleCollections.add(attrModValidators);
		
		objModValidators	= new ObjectModifierValidationRuleCollection();
		ruleCollections.add(objModValidators);
		
		initializers		= new InitializationRuleCollection();
		ruleCollections.add(initializers);
		
		ucoObjectvalidators	= new UCOValidationRuleCollection();
		ruleCollections.add(ucoObjectvalidators);
				
		loadRules(MetaDMSAG.instance());
		
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
	
	public void executeObjectValidation(DmcObject obj) throws DmcRuleExceptionSet {
		objectValidators.execute(obj);
	}
	
	public void executeAttrModValidation(DmcObject obj, DmcTypeModifierMV mods) throws DmcRuleExceptionSet {
		DmcRuleExceptionSet rc = null;
		
		Iterator<Modifier> modifiers = mods.getMV();
		while(modifiers.hasNext()){
			try {
				attrModValidators.execute(obj, modifiers.next());
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
	
	public void executeObjModValidators(DmcObject obj, DmcTypeModifierMV mods) throws DmcRuleExceptionSet {
		objModValidators.execute(obj, mods);
	}
	
	public void executeInitializers(DmcObject obj) throws DmcRuleExceptionSet{
		initializers.execute(obj);
	}
	
	public void executeUCOValidators(DmcUncheckedObject uco) throws DmcRuleExceptionSet{
		ucoObjectvalidators.execute(uco);
	}
}

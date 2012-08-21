package org.dmd.dmv.shared;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.rules.DmcRuleException;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmc.rules.DmcRuleManager;
import org.dmd.dmc.rules.RuleIF;
import org.dmd.dmc.types.Modifier;
import org.dmd.dms.generated.dmo.MetaDMSAG;
import org.dmd.dms.generated.types.DmcTypeModifierMV;
import org.dmd.dms.shared.interfaces.AttributeValidationIF;
import org.dmd.dms.shared.interfaces.InitializationIF;
import org.dmd.dms.shared.interfaces.ModifierValidationIF;
import org.dmd.dms.shared.interfaces.ObjectValidationIF;
import org.dmd.dms.shared.interfaces.UCOValidationIF;
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

	TreeMap<String,ArrayList<AttributeValidationIF>>	attributeValidators;
	
	TreeMap<String,ArrayList<ObjectValidationIF>>		objectValidators;
	
	TreeMap<String,ArrayList<ModifierValidationIF>>		modifierValidators;
	
	TreeMap<String,ArrayList<InitializationIF>>			initializers;
	
	TreeMap<String,ArrayList<UCOValidationIF>>			ucoValidators;
	
	public DmvRuleManager() {
		attributeValidators = new TreeMap<String, ArrayList<AttributeValidationIF>>();
		objectValidators 	= new TreeMap<String, ArrayList<ObjectValidationIF>>();
		modifierValidators 	= new TreeMap<String, ArrayList<ModifierValidationIF>>();
		initializers 		= new TreeMap<String, ArrayList<InitializationIF>>();
		ucoValidators 		= new TreeMap<String, ArrayList<UCOValidationIF>>();
		
		loadRules(MetaDMSAG.instance().getRules());
		
		loadRules(DmvDMSAG.instance().getRules());
	}
	
	void loadRules(Iterator<RuleIF> rules){
		if (rules == null)
			return;
		
		while(rules.hasNext()){
			RuleIF rule = rules.next();
			if (rule instanceof AttributeValidationIF){
				
			}
			if (rule instanceof ObjectValidationIF){
				
			}
			if (rule instanceof ModifierValidationIF){
				
			}
			if (rule instanceof InitializationIF){
				
			}
			if (rule instanceof UCOValidationIF){
				
			}
		}
	}
	
	public void applyAttributeValidation(DmcObject obj) throws DmcRuleExceptionSet {
		DmcRuleExceptionSet rc = null;
		
		for(DmcAttribute<?> attr : obj.getAttributes().values()){
			ArrayList<AttributeValidationIF> rules = attributeValidators.get(attr.getName());
			if (rules != null){
				for(AttributeValidationIF rule : rules){
					try {
						rule.validate(attr);
					} catch (DmcRuleExceptionSet e) {
						if (rc == null)
							rc = e;
						else{
							for(DmcRuleException ex: e.geExceptions()){
								rc.add(ex);
							}
						}
					}
				}
			}
		}
		
		if (rc != null)
			throw(rc);
	}
	
	public void applyModifierValidation(DmcObject obj, DmcTypeModifierMV mods) throws DmcRuleExceptionSet {
		DmcRuleExceptionSet rc = null;
		
		for(int i=0; i< mods.getMVSize(); i++){
			Modifier mod = mods.getMVnth(i);
			
			ArrayList<ModifierValidationIF> rules = modifierValidators.get(mod.getAttributeName());
			if (rules != null){
				for(ModifierValidationIF rule : rules){
					try {
						rule.validate(obj,mods,mod);
					} catch (DmcRuleExceptionSet e) {
						if (rc == null)
							rc = e;
						else{
							for(DmcRuleException ex: e.geExceptions()){
								rc.add(ex);
							}
						}
					}
				}
			}
		}
		
		if (rc != null)
			throw(rc);
	}
	
	public void applyObjectValidation(DmcObject obj) throws DmcRuleExceptionSet{
		DmcRuleExceptionSet rc = null;
		
		ArrayList<ObjectValidationIF> rules = objectValidators.get(obj.getConstructionClassName());
		if (rules != null){
			for(ObjectValidationIF rule : rules){
				try {
					rule.validate(obj);
				} catch (DmcRuleExceptionSet e) {
					if (rc == null)
						rc = e;
					else{
						for(DmcRuleException ex: e.geExceptions()){
							rc.add(ex);
						}
					}
				}
			}
		}
		
		if (rc != null)
			throw(rc);
	}
	
	public void applyInitialization(DmcObject obj){
		ArrayList<InitializationIF> rules = initializers.get(obj.getConstructionClassName());
		if (rules != null){
			for(InitializationIF rule : rules){
				rule.initialize(obj);
			}
		}
		
	}
}

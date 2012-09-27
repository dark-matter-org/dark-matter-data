package org.dmd.dmv.shared;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcCompactSchemaIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcOmni;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.rules.DmcRuleExceptionSet;
import org.dmd.dmc.rules.DmcRuleManager;
import org.dmd.dmc.rules.DynamicInitIF;
import org.dmd.dmc.rules.RuleCollection;
import org.dmd.dmc.rules.RuleIF;
import org.dmd.dmc.rules.SourceInfo;
import org.dmd.dmc.util.DmcUncheckedObject;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.RuleDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.generated.dmo.RuleDataDMO;
import org.dmd.dms.generated.rulesdmo.AttributeValidationRuleCollection;
import org.dmd.dms.generated.rulesdmo.ObjectValidationRuleCollection;
import org.dmd.dms.util.DmoObjectFactory;
import org.dmd.util.ConsoleRuleTracer;

/**
 * The DmvDynamicRuleManager class is used to dynamically instantiate and initialize rules
 * that are then used to check the validity of rules. 
 */
public class DmvDynamicRuleManager extends DmcRuleManager {
	
	AttributeValidationRuleCollection			attributeValidators;
	
	ObjectValidationRuleCollection				objectValidators;
		
	ArrayList<RuleCollection<?>>				ruleCollections;
	TreeMap<String,DmcCompactSchemaIF>			loadedSchemas;

	public DmvDynamicRuleManager() {
		ruleCollections = new ArrayList<RuleCollection<?>>();
		loadedSchemas	= new TreeMap<String, DmcCompactSchemaIF>();
		
		attributeValidators = new AttributeValidationRuleCollection();
		ruleCollections.add(attributeValidators);
		
		objectValidators	= new ObjectValidationRuleCollection();
		ruleCollections.add(objectValidators);
	}
	
	public void loadRules(DmcCompactSchemaIF schema){
		if (loadedSchemas.get(schema.getSchemaName()) == null){
			for(RuleCollection<?> collection: ruleCollections){
				collection.addRules(schema.getRules());
			}
			loadedSchemas.put(schema.getSchemaName(), schema);
		}
	}
	
	void addThisRule(RuleIF rule){
		for(RuleCollection<?> collection: ruleCollections){
			collection.addRule(rule);
		}
	}
	
	public void loadAndCheckRules(SchemaManager sm, SchemaDefinition sd) throws DmcRuleExceptionSet {
		DmcRuleExceptionSet		rc 			= null;
	    DmoObjectFactory 		dmofactory 	= new DmoObjectFactory(sm);
	    ArrayList<RuleDataDMO>	allRuleData = new ArrayList<RuleDataDMO>();
	    ArrayList<RuleIF>		allRules 	= new ArrayList<RuleIF>();
	    
		Iterator<SchemaDefinition> schemas = sm.getSchemas();
		if (schemas != null){
			while(schemas.hasNext()){
				SchemaDefinition curr = schemas.next();
				
		        Iterator<DmcUncheckedObject> ucoIT = curr.getParsedRules();
		        if (ucoIT != null){
					while(ucoIT.hasNext()){
						DmcUncheckedObject 	uco = ucoIT.next();
						ClassDefinition 	ruleDataCD 	= sm.cdef(uco.getConstructionClass());
						RuleDefinition		ruleDEF		= ruleDataCD.getRuleDefinition();
						RuleDataDMO 		ruledata	= null;
						
						try{
							ruledata = (RuleDataDMO) dmofactory.createObject(uco);
//							DebugInfo.debug("Parsed and instantiated:\n\n" + ruledata.toOIF());
						}
						catch(Exception ex){
							System.err.println(ex.toString());
						}
						
						try{
							ruledata.resolveReferences(sm);
						}
						catch(DmcValueExceptionSet ex){
							System.err.println(ex.toString() + "\nFile: " + ruledata.getFile() + "  Line: " + ruledata.getLineNumber());
						}
							
						try{
							DynamicInitIF rule = (DynamicInitIF) ruleDEF.newRuleInstance();
							rule.setRuleData(ruledata);
							
							allRuleData.add(ruledata);
							
//							addThisRule((RuleIF) rule);
							allRules.add((RuleIF) rule);
						}
						catch(Exception ex){
							System.err.println(ex.toString());
						}
					}
		        }
			}
			
			DmcOmni.instance().reset();
			schemas = sm.getSchemas();
			while(schemas.hasNext()){
				SchemaDefinition curr = schemas.next();
				DmcOmni.instance().addCompactSchema(curr.getCompactSchema());
			}
			
			// We add the rules after we've reinitialized the DmcOmni so that we can resolve
			// applyToClass information.
			for(RuleIF rule: allRules)
				addThisRule(rule);
			
			DmcOmni.instance().ruleTracer(new ConsoleRuleTracer());
			DmcOmni.instance().ruleTracing(true);
			
			for(RuleDataDMO rule: allRuleData){
				SourceInfo source = new SourceInfo(rule.getFile(), rule.getLineNumber()+"", rule);
				
				try {
					this.executeAttributeValidation(rule);
					
					this.executeObjectValidation(rule);
				} catch (DmcRuleExceptionSet e) {
					e.source(source);
					if (rc == null)
						rc = e;
					else
						rc.add(e);
//					System.err.println(e.toString());
				}
			}
			
//			DebugInfo.debug(this.toString());
		}
		
		if (rc != null)
			throw(rc);
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
		
	public String toString(){
		StringBuffer sb = new StringBuffer();
		
		for(RuleCollection<?> rc: ruleCollections){
			sb.append(rc.toString());
		}
		return(sb.toString());
	}
}

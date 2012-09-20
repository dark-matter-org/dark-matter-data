package org.dmd.dms.generated.rulesdmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.RuleFormatter.dumpRuleCategoryInterfaces(RuleFormatter.java:288)
import java.util.ArrayList;                                   // Storage for the rules - (RuleFormatter.java:271)
import java.util.TreeMap;                                     // Storage for the rules - (RuleFormatter.java:272)
import org.dmd.dmc.DmcObject;                                 // Required for obj - (RuleFormatter.java:217)
import org.dmd.dmc.rules.ClassRuleCollection;                 // Class rule - (RuleFormatter.java:281)
import org.dmd.dmc.rules.DmcRuleExceptionSet;                 // Rule type - (RuleFormatter.java:206)
import org.dmd.dmc.rules.RuleIF;                              // All rules implement this - (RuleFormatter.java:207)
import org.dmd.dmc.rules.RuleKey;                             // Generic rule key - (RuleFormatter.java:273)
import org.dmd.dmc.types.Modifier;                            // Required for mod - (RuleFormatter.java:217)
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for mods - (RuleFormatter.java:217)
public class ModifierValidationRuleCollection extends ClassRuleCollection<ModifierValidationIF> {

    public ModifierValidationRuleCollection(){
        globalRules = new ArrayList<ModifierValidationIF>();
        rules = new TreeMap<RuleKey,ArrayList<ModifierValidationIF>>();
    }

    @Override
    public void addRule(RuleIF r){

        if (r instanceof ModifierValidationIF){
            ModifierValidationIF rule = (ModifierValidationIF)r;
            if (rule.getApplyToClass() == null){
                globalRules.add(rule);
            }
            else{
            	ArrayList<ModifierValidationIF> classRules = rules.get(rule.getKey());
            	if (classRules == null)
            		classRules = new ArrayList<ModifierValidationIF>();
            	classRules.add(rule);
            }
        }
    }

    /**
     * @param obj The object being modified
,      * @param mods The set of modifications being performed
,      * @param mod The particular modification being validated
     */
    public void execute(DmcObject obj, DmcTypeModifierMV mods, Modifier mod) throws DmcRuleExceptionSet {
    }

}


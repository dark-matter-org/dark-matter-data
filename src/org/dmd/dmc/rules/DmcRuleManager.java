package org.dmd.dmc.rules;

/**
 * The DmcRuleManager is used to manage a collection rules associated with Dark Matter Object (DMOs).
 * Rules are simply pieces of business logic that can be applied to objects in a consistent manner
 * throughout their life cycle. The business logic is often driven by parameters required by the
 * particular rule instance and these parameters can also be defined via schema.
 * <p/>
 * Rules share a variety of criteria that allow the rule manager to apply them as required:
 * <ul>
 * <li>
 * operational context - rules come in two broad types, those that are suitable for use in a
 * plain DMO environment (which is consistent with the restricted JRE environment associated
 * with GWT) and those that make use of a full Java environment with no restrictions
 * </li>
 * <li>
 * category - a rule may belong to one or more rule categories as defined by RuleCategory
 * definitions in your schema. A rule category implies that a rule implements a particular
 * call interface.
 * </li>
 * <li>
 * type - rules are applied at either the attribute level or the class level
 * </li>
 * <li>
 * scope - a rule may be applied globally, on a per class basis or across a set of classes
 * </li>
 * </ul>
 */
public class DmcRuleManager {

	
}

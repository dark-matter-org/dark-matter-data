//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dmv.server.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:697)
import java.util.*;                                                  // If not auxiliary
import org.dmd.dmc.*;                                                // If any attributes
import org.dmd.dms.*;                                                // Always 2
import org.dmd.dmv.server.extended.AttributeRule;                    // Derived class
import org.dmd.dmv.shared.generated.dmo.IntegerRangeRuleDMO;         // Class not auxiliary or abstract

/**
 * null
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:342)
 */
abstract public class IntegerRangeRuleDMW extends AttributeRule {

    private IntegerRangeRuleDMO mycore;

    public IntegerRangeRuleDMW() {
        super(new IntegerRangeRuleDMO(), org.dmd.dmv.server.generated.DmvSchemaAG._IntegerRangeRule);
        mycore = (IntegerRangeRuleDMO) core;
        mycore.setContainer(this);
    }

    public IntegerRangeRuleDMW(IntegerRangeRuleDMO obj) {
        super(obj, org.dmd.dmv.server.generated.DmvSchemaAG._IntegerRangeRule);
        mycore = (IntegerRangeRuleDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (IntegerRangeRuleDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected IntegerRangeRuleDMW(IntegerRangeRuleDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (IntegerRangeRuleDMO) core;
    }

    @Override
    protected ArrayList<?> getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmv.server.extended.IntegerRangeRule>());
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:818)
    public String getRuleTitle(){
        return(mycore.getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:857)
    public void setRuleTitle(Object value) throws DmcValueException {
        mycore.setRuleTitle(value);
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:866)
    public void setRuleTitle(String value){
        mycore.setRuleTitle(value);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:880)
    public void remRuleTitle(){
        mycore.remRuleTitle();
    }


}

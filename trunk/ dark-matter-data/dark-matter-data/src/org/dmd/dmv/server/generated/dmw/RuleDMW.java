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

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:925)
import org.dmd.dmc.*;                                    // If any attributes
import org.dmd.dmc.types.StringName;                     // Primitive type
import org.dmd.dms.*;                                    // Always 2
import org.dmd.dmv.server.extended.Rule;                 // Required for getModificationRecorder()
import org.dmd.dmv.shared.generated.dmo.RuleDMO;         // Abstract class
import org.dmd.dmw.DmwNamedObjectWrapper;                // Named object wrapper

/**
 * A Rule is meant to represent an object that defines the validation logic
 * to be applied to Dark Matter Object as a whole or to its attributes.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:348)
 */
abstract public class RuleDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    protected RuleDMW() {
        super();
    }

    abstract public Rule getModificationRecorder();

    public RuleDMO getDMO() {
        return((RuleDMO) core);
    }

    protected RuleDMW(RuleDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:953)
    public StringName getObjectName(){
        return(((RuleDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((RuleDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof RuleDMW){
            return( getObjectName().equals( ((RuleDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1090)
    public StringName getName(){
        return(((RuleDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1137)
    public void setName(Object value) throws DmcValueException {
        ((RuleDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1146)
    public void setName(StringName value){
        ((RuleDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1172)
    public void remName(){
        ((RuleDMO) core).remName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1090)
    public String getRuleTitle(){
        return(((RuleDMO) core).getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1137)
    public void setRuleTitle(Object value) throws DmcValueException {
        ((RuleDMO) core).setRuleTitle(value);
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1146)
    public void setRuleTitle(String value){
        ((RuleDMO) core).setRuleTitle(value);
    }

    /**
     * Removes the ruleTitle attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1172)
    public void remRuleTitle(){
        ((RuleDMO) core).remRuleTitle();
    }


}

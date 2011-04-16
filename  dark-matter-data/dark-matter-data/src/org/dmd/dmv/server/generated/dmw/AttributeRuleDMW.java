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

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:847)
import org.dmd.dmc.*;                                              // If any attributes
import org.dmd.dms.*;                                              // Always 2
import org.dmd.dms.generated.dmw.AttributeDefinitionDMW;           // Is reference type aux
import org.dmd.dms.generated.types.AttributeDefinitionREF;         // To support getMVCopy() for REFs
import org.dmd.dmv.server.extended.Rule;                           // Derived class
import org.dmd.dmv.shared.generated.dmo.AttributeRuleDMO;          // Abstract class

/**
 * The AttributeRule is the simplest rule that operates on a single attribute.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class AttributeRuleDMW extends Rule {

    private AttributeRuleDMO mycore;

    protected AttributeRuleDMW() {
        super();
    }

    public AttributeRuleDMO getDMO() {
        return(mycore);
    }

    protected AttributeRuleDMW(AttributeRuleDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (AttributeRuleDMO) core;
    }

    /**
     * @return A AttributeDefinitionDMW object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:983)
    public AttributeDefinitionDMW getApplyToAttribute(){
        AttributeDefinitionREF ref = mycore.getApplyToAttribute();
        if (ref == null)
            return(null);
        
        return((AttributeDefinitionDMW)ref.getObject().getContainer());
    }

    /**
     * Sets the applyToAttribute to the specified value.
     * @param value A value compatible with AttributeDefinitionREF
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1028)
    public void setApplyToAttribute(AttributeDefinitionDMW value) {
        mycore.setApplyToAttribute(value.getDMO());
    }

    /**
     * Removes the applyToAttribute attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1086)
    public void remApplyToAttribute(){
        mycore.remApplyToAttribute();
    }


}

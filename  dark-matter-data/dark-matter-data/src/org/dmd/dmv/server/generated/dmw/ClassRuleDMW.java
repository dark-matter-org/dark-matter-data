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

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:882)
import org.dmd.dmc.*;                                          // If any attributes
import org.dmd.dms.*;                                          // Always 2
import org.dmd.dms.generated.dmw.ClassDefinitionDMW;           // Is reference type aux
import org.dmd.dms.generated.types.ClassDefinitionREF;         // To support getMVCopy() for REFs
import org.dmd.dmv.server.extended.Rule;                       // Derived class
import org.dmd.dmv.shared.generated.dmo.ClassRuleDMO;          // Abstract class

/**
 * The ClassRule is a rule that applies to an entire object and its
 * collection of attributes.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class ClassRuleDMW extends Rule {

    protected ClassRuleDMW() {
        super();
    }

    abstract public ClassRuleDMW getModificationRecorder();

    public ClassRuleDMO getDMO() {
        return((ClassRuleDMO) core);
    }

    protected ClassRuleDMW(ClassRuleDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return A ClassDefinitionDMW object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1026)
    public ClassDefinitionDMW getApplyToClass(){
        ClassDefinitionREF ref = ((ClassRuleDMO) core).getApplyToClass();
        if (ref == null)
            return(null);
        
        return((ClassDefinitionDMW)ref.getObject().getContainer());
    }

    /**
     * Sets the applyToClass to the specified value.
     * @param value A value compatible with ClassDefinitionREF
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1071)
    public void setApplyToClass(ClassDefinitionDMW value) {
        ((ClassRuleDMO) core).setApplyToClass(value.getDMO());
    }

    /**
     * Removes the applyToClass attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1129)
    public void remApplyToClass(){
        ((ClassRuleDMO) core).remApplyToClass();
    }


}

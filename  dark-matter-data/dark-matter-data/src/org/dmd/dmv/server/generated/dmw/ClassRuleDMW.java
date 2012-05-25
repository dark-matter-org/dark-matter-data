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

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import org.dmd.dmc.*;                                          // If any attributes - (BaseDMWGeneratorNewest.java:887)
import org.dmd.dms.*;                                          // Always 2 - (BaseDMWGeneratorNewest.java:872)
import org.dmd.dms.generated.dmw.ClassDefinitionDMW;           // Is reference type - (BaseDMWGeneratorNewest.java:906)
import org.dmd.dms.generated.types.ClassDefinitionREF;         // Is reference type REF - (BaseDMWGeneratorNewest.java:914)
import org.dmd.dmv.server.extended.ClassRule;                  // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:880)
import org.dmd.dmv.server.extended.Rule;                       // Derived class - (BaseDMWGeneratorNewest.java:1043)
import org.dmd.dmv.shared.generated.dmo.ClassRuleDMO;          // Abstract class - (BaseDMWGeneratorNewest.java:1025)


/**
 * The ClassRule is a rule that applies to an entire object and its
 * collection of attributes.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
abstract public class ClassRuleDMW extends Rule {

    protected ClassRuleDMW() {
        super();
    }

    abstract public ClassRule getModificationRecorder();

    public ClassRuleDMO getDMO() {
        return((ClassRuleDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected ClassRuleDMW(ClassRuleDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return A ClassDefinitionDMW object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1225)
    public ClassDefinitionDMW getApplyToClass(){
        ClassDefinitionREF ref = ((ClassRuleDMO) core).getApplyToClass();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((ClassDefinitionDMW)ref.getObject().getContainer());
    }

    /**
     * Sets the applyToClass to the specified value.
     * @param value A value compatible with ClassDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1310)
    public void setApplyToClass(ClassDefinitionDMW value) {
        ((ClassRuleDMO) core).setApplyToClass(value.getDMO());
    }

    /**
     * Sets the applyToClass to the specified value.
     * @param value A value compatible with ClassDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1319)
    public void setApplyToClass(Object value) throws DmcValueException {
        ((ClassRuleDMO) core).setApplyToClass(value);
    }

    /**
     * Removes the applyToClass attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1401)
    public void remApplyToClass(){
        ((ClassRuleDMO) core).remApplyToClass();
    }


}

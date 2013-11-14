//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
package org.dmd.dmt.dsd.dsdc.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:365)
import org.dmd.dmc.*;                                                  // If any attributes - (BaseDMWGeneratorNewest.java:979)
import org.dmd.dmc.definitions.DmcDefinitionIF;                        // The object is a domain specific definition - (BaseDMWGeneratorNewest.java:334)
import org.dmd.dmc.types.DefinitionName;                               // Is named by - (BaseDMWGeneratorNewest.java:958)
import org.dmd.dms.ClassDefinition;                                    // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:963)
import org.dmd.dms.generated.dmo.MetaDMSAG;                            // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:968)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                  // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:967)
import org.dmd.dmt.dsd.dsdc.server.extended.CConceptBase;              // Derived class - (BaseDMWGeneratorNewest.java:1140)
import org.dmd.dmt.dsd.dsdc.server.extended.CConceptX;                 // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:972)
import org.dmd.dmt.dsd.dsdc.shared.generated.dmo.CConceptXDMO;         // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1144)


/**
 * null
 * <P>
 * Generated from the dsdC schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:391)
 */
abstract public class CConceptXDMW extends CConceptBase implements DmcNamedObjectIF, DmcDefinitionIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:470)
    public CConceptXDMW() {
        super(new CConceptXDMO(), org.dmd.dmt.dsd.dsdc.server.generated.DsdCSchemaAG._CConceptX);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:476)
    public CConceptXDMW(DmcTypeModifierMV mods) {
        super(new CConceptXDMO(mods), org.dmd.dmt.dsd.dsdc.server.generated.DsdCSchemaAG._CConceptX);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:518)
    public CConceptX getModificationRecorder(){
        CConceptX rc = new CConceptX();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:539)
    public CConceptXDMW(CConceptXDMO obj) {
        super(obj, org.dmd.dmt.dsd.dsdc.server.generated.DsdCSchemaAG._CConceptX);
    }

    public CConceptX cloneIt() {
        CConceptX rc = new CConceptX();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public CConceptXDMO getDMO() {
        return((CConceptXDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:554)
    protected CConceptXDMW(CConceptXDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1189)
    public DefinitionName getObjectName(){
        return(((CConceptXDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((CConceptXDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof CConceptXDMW){
            return( getObjectName().equals( ((CConceptXDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public DefinitionName getName(){
        return(((CConceptXDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1476)
    public void setName(Object value) throws DmcValueException {
        ((CConceptXDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1485)
    public void setName(DefinitionName value){
        ((CConceptXDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1511)
    public void remName(){
        ((CConceptXDMO) core).remName();
    }


}

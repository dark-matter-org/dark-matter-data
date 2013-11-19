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
package org.dmd.dmt.dsd.dsda.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:365)
import org.dmd.dmc.*;                                                  // If any attributes - (BaseDMWGenerator.java:979)
import org.dmd.dmc.definitions.DmcDefinitionIF;                        // The object is a domain specific definition - (BaseDMWGenerator.java:334)
import org.dmd.dmc.types.DefinitionName;                               // Is named by - (BaseDMWGenerator.java:958)
import org.dmd.dms.ClassDefinition;                                    // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:963)
import org.dmd.dms.generated.dmo.MetaDMSAG;                            // Required for MODREC constructor - (BaseDMWGenerator.java:968)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                  // Required for MODREC constructor - (BaseDMWGenerator.java:967)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptBase;              // Derived class - (BaseDMWGenerator.java:1140)
import org.dmd.dmt.dsd.dsda.server.extended.AConceptX;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:972)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.AConceptXDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1144)



/**
 * null
 * <P>
 * Generated from the dsdA schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:391)
 */
abstract public class AConceptXDMW extends AConceptBase implements DmcNamedObjectIF, DmcDefinitionIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:470)
    public AConceptXDMW() {
        super(new AConceptXDMO(), org.dmd.dmt.dsd.dsda.server.generated.DsdASchemaAG._AConceptX);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:476)
    public AConceptXDMW(DmcTypeModifierMV mods) {
        super(new AConceptXDMO(mods), org.dmd.dmt.dsd.dsda.server.generated.DsdASchemaAG._AConceptX);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:518)
    public AConceptX getModificationRecorder(){
        AConceptX rc = new AConceptX();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:539)
    public AConceptXDMW(AConceptXDMO obj) {
        super(obj, org.dmd.dmt.dsd.dsda.server.generated.DsdASchemaAG._AConceptX);
    }

    public AConceptX cloneIt() {
        AConceptX rc = new AConceptX();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public AConceptXDMO getDMO() {
        return((AConceptXDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:554)
    protected AConceptXDMW(AConceptXDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1189)
    public DefinitionName getObjectName(){
        return(((AConceptXDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((AConceptXDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof AConceptXDMW){
            return( getObjectName().equals( ((AConceptXDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1366)
    public DefinitionName getName(){
        return(((AConceptXDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1476)
    public void setName(Object value) throws DmcValueException {
        ((AConceptXDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1485)
    public void setName(DefinitionName value){
        ((AConceptXDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1511)
    public void remName(){
        ((AConceptXDMO) core).remName();
    }


}

//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                                   // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.types.DefinitionName;                                // Is named by - (BaseDMWGenerator.java:939)
import org.dmd.dms.ClassDefinition;                                     // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                             // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmt.server.extended.ObjWithRefs;                         // Derived class - (BaseDMWGenerator.java:1138)
import org.dmd.dmt.server.extended.ObjWithRefsDerivedA;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDerivedADMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)



/**
 * Used to test restricting object references in derived classes.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
abstract public class ObjWithRefsDerivedADMW extends ObjWithRefs implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public ObjWithRefsDerivedADMW() {
        super(new ObjWithRefsDerivedADMO(), org.dmd.dmt.server.generated.DmtSchemaAG._ObjWithRefsDerivedA);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public ObjWithRefsDerivedADMW(DmcTypeModifierMV mods) {
        super(new ObjWithRefsDerivedADMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._ObjWithRefsDerivedA);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:625)
    public ObjWithRefsDerivedA getModificationRecorder(){
        ObjWithRefsDerivedA rc = new ObjWithRefsDerivedA();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public ObjWithRefsDerivedADMW(ObjWithRefsDerivedADMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._ObjWithRefsDerivedA);
    }

    public ObjWithRefsDerivedA cloneIt() {
        ObjWithRefsDerivedA rc = new ObjWithRefsDerivedA();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public ObjWithRefsDerivedADMO getDMO() {
        return((ObjWithRefsDerivedADMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected ObjWithRefsDerivedADMW(ObjWithRefsDerivedADMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1187)
    public DefinitionName getObjectName(){
        return(((ObjWithRefsDerivedADMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((ObjWithRefsDerivedADMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ObjWithRefsDerivedADMW){
            return( getObjectName().equals( ((ObjWithRefsDerivedADMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public DefinitionName getName(){
        return(((ObjWithRefsDerivedADMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setName(Object value) throws DmcValueException {
        ((ObjWithRefsDerivedADMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setName(DefinitionName value){
        ((ObjWithRefsDerivedADMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remName(){
        ((ObjWithRefsDerivedADMO) core).remName();
    }


}

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
package org.dmd.dmr.server.base.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                                     // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.types.FullyQualifiedName;                              // Is named by - (BaseDMWGenerator.java:939)
import org.dmd.dmr.server.base.extended.HierarchicObject;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.dmr.shared.base.generated.dmo.HierarchicObjectDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1142)
import org.dmd.dms.ClassDefinition;                                       // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                               // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                     // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.dmw.DmwNamedObjectWrapper;                                 // Named object wrapper - (BaseDMWGenerator.java:1132)



/**
 * A HierarchicObject is meant to represent any object that can\n be
 * identified with a Fully Qualified Name (FQN) and exists in a containment\n
 * relationship with other objects. The exact implementation of a
 * HierarchicObject\n is application specific.
 * <P>
 * Generated from the dmrbase schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
public class HierarchicObjectDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public HierarchicObjectDMW() {
        super(new HierarchicObjectDMO(), org.dmd.dmr.server.base.generated.DmrbaseSchemaAG._HierarchicObject);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public HierarchicObjectDMW(DmcTypeModifierMV mods) {
        super(new HierarchicObjectDMO(mods), org.dmd.dmr.server.base.generated.DmrbaseSchemaAG._HierarchicObject);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:625)
    public HierarchicObject getModificationRecorder(){
        HierarchicObject rc = new HierarchicObject();
        rc.setFQN(getFQN());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public HierarchicObjectDMW(HierarchicObjectDMO obj) {
        super(obj, org.dmd.dmr.server.base.generated.DmrbaseSchemaAG._HierarchicObject);
    }

    public HierarchicObject cloneIt() {
        HierarchicObject rc = new HierarchicObject();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public HierarchicObjectDMO getDMO() {
        return((HierarchicObjectDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected HierarchicObjectDMW(HierarchicObjectDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1187)
    public FullyQualifiedName getObjectName(){
        return(((HierarchicObjectDMO) core).getFQN());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((HierarchicObjectDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof HierarchicObjectDMW){
            return( getObjectName().equals( ((HierarchicObjectDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public FullyQualifiedName getFQN(){
        return(((HierarchicObjectDMO) core).getFQN());
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeFullyQualifiedName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setFQN(Object value) throws DmcValueException {
        ((HierarchicObjectDMO) core).setFQN(value);
    }

    /**
     * Sets FQN to the specified value.
     * @param value FullyQualifiedName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setFQN(FullyQualifiedName value){
        ((HierarchicObjectDMO) core).setFQN(value);
    }

    /**
     * Removes the FQN attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remFQN(){
        ((HierarchicObjectDMO) core).remFQN();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public String getFile(){
        return(((HierarchicObjectDMO) core).getFile());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setFile(Object value) throws DmcValueException {
        ((HierarchicObjectDMO) core).setFile(value);
    }

    /**
     * Sets file to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setFile(String value){
        ((HierarchicObjectDMO) core).setFile(value);
    }

    /**
     * Removes the file attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remFile(){
        ((HierarchicObjectDMO) core).remFile();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public Integer getLineNumber(){
        return(((HierarchicObjectDMO) core).getLineNumber());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1475)
    public void setLineNumber(Object value) throws DmcValueException {
        ((HierarchicObjectDMO) core).setLineNumber(value);
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1484)
    public void setLineNumber(Integer value){
        ((HierarchicObjectDMO) core).setLineNumber(value);
    }

    /**
     * Removes the lineNumber attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1510)
    public void remLineNumber(){
        ((HierarchicObjectDMO) core).remLineNumber();
    }


}

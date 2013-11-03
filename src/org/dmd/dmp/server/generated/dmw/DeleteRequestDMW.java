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
package org.dmd.dmp.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:351)
import java.util.ArrayList;                                        // To support getMVCopy() - (BaseDMWGeneratorNewest.java:1050)
import java.util.Iterator;                                         // Support copy of MV objects - (BaseDMWGeneratorNewest.java:2109)
import org.dmd.dmc.*;                                              // If any attributes - (BaseDMWGeneratorNewest.java:956)
import org.dmd.dmc.DmcObjectName;                                  // Alternative type for NameContainer values - (BaseDMWGeneratorNewest.java:1027)
import org.dmd.dmc.types.NameContainer;                            // Primitive type - (BaseDMWGeneratorNewest.java:1019)
import org.dmd.dmp.server.extended.DeleteRequest;                  // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:949)
import org.dmd.dmp.server.extended.Request;                        // Derived class - (BaseDMWGeneratorNewest.java:1117)
import org.dmd.dmp.shared.generated.dmo.DeleteRequestDMO;          // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:1121)
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;                  // Attribute targets from the dmp schema - (BaseDMWGeneratorNewest.java:771)
import org.dmd.dmp.shared.generated.enums.ScopeEnum;               // Primitive type - (BaseDMWGeneratorNewest.java:1019)
import org.dmd.dms.ClassDefinition;                                // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:940)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:945)
import org.dmd.dms.generated.dmw.NameContainerIterableDMW;         // For multi-valued NameContainer - (BaseDMWGeneratorNewest.java:1972)
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:944)


/**
 * The DeleteRequest allows you to delete one or more objects. If no scope is
 * specified,\n the scope is assumed to be BASE i.e. just the specific object
 * indicated by the targets. The behaviour\n of this request is
 * implementation specific.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:368)
 */
abstract public class DeleteRequestDMW extends Request {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:447)
    public DeleteRequestDMW() {
        super(new DeleteRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._DeleteRequest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:453)
    public DeleteRequestDMW(DmcTypeModifierMV mods) {
        super(new DeleteRequestDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._DeleteRequest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:474)
    public DeleteRequest getModificationRecorder(){
        DeleteRequest rc = new DeleteRequest();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:516)
    public DeleteRequestDMW(DeleteRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._DeleteRequest);
    }

    public DeleteRequest cloneIt() {
        DeleteRequest rc = new DeleteRequest();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public DeleteRequestDMO getDMO() {
        return((DeleteRequestDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:531)
    protected DeleteRequestDMW(DeleteRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1343)
    public ScopeEnum getScope(){
        return(((DeleteRequestDMO) core).getScope());
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1453)
    public void setScope(Object value) throws DmcValueException {
        ((DeleteRequestDMO) core).setScope(value);
    }

    /**
     * Sets scope to the specified value.
     * @param value ScopeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1462)
    public void setScope(ScopeEnum value){
        ((DeleteRequestDMO) core).setScope(value);
    }

    /**
     * Removes the scope attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1488)
    public void remScope(){
        ((DeleteRequestDMO) core).remScope();
    }

    /**
     * @return The number of NameContainer items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1540)
    public int getTargetsSize(){
        return(((DeleteRequestDMO) core).getTargetsSize());
    }

    /**
     * @return true if there are no NameContainerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1548)
    public boolean getTargetsIsEmpty(){
        if (((DeleteRequestDMO) core).getTargetsSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any NameContainerDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1558)
    public boolean getTargetsHasValue(){
        if (((DeleteRequestDMO) core).getTargetsSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of NameContainer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:1976)
    public NameContainerIterableDMW getTargetsIterable(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__targets);
        if (attr == null)
            return(NameContainerIterableDMW.emptyList);
        
        return(new NameContainerIterableDMW(((DeleteRequestDMO) core).getTargets()));
    }

    /**
     * Adds another targets value.
     * @param value A value compatible with NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2002)
    public void addTargets(Object value) throws DmcValueException {
        ((DeleteRequestDMO) core).addTargets(value);
    }

    /**
     * Adds another targets value.
     * @param value A value compatible with NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2012)
    public void addTargets(NameContainer value){
        ((DeleteRequestDMO) core).addTargets(value);
    }

    /**
     * Adds another DmcObjectName value.
     * @param value A value compatible with DmcObjectName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2045)
    public void addTargets(DmcObjectName value){
        ((DeleteRequestDMO) core).addTargets(value);
    }

    /**
     * Returns true if the collection contains the targets value.
     * @param value A value compatible with NameContainer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2069)
    public boolean targetsContains(NameContainer value){
        return(((DeleteRequestDMO) core).targetsContains(value));
    }

    /**
     * Returns true if the collection contains the DmcObjectName value.
     * @param value A value compatible with DmcObjectName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2080)
    public boolean targetsContains(DmcObjectName value){
        return(((DeleteRequestDMO) core).targetsContains(value));
    }

    /**
     * @return A COPY of the collection of NameContainer objects.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2113)
    @SuppressWarnings("unchecked")
    public ArrayList<NameContainer> getTargetsCopy(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__targets);
        if (attr == null)
            return(new ArrayList<NameContainer>());
        
        ArrayList<NameContainer> rc = new ArrayList<NameContainer>(attr.getMVSize());
        
        Iterator<NameContainer> it = (Iterator<NameContainer>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a targets value.
     * @param value The NameContainer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2140)
    public void delTargets(Object value) throws DmcValueException {
        ((DeleteRequestDMO) core).delTargets(value);
    }

    /**
     * Deletes a targets value.
     * @param value The NameContainer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2149)
    public void delTargets(NameContainer value){
        ((DeleteRequestDMO) core).delTargets(value);
    }

    /**
     * Removes the targets attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatMV(BaseDMWGeneratorNewest.java:2161)
    public void remTargets(){
        ((DeleteRequestDMO) core).remTargets();
    }


}

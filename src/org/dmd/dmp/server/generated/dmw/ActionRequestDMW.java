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
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:365)
import java.util.ArrayList;                                       // To support getMVCopy() - (BaseDMWGenerator.java:1073)
import java.util.Iterator;                                        // Support copy of MV objects - (BaseDMWGenerator.java:2132)
import org.dmd.dmc.*;                                             // If any attributes - (BaseDMWGenerator.java:979)
import org.dmd.dmc.DmcObject;                                     // Primitive type - (BaseDMWGenerator.java:1042)
import org.dmd.dmc.types.FullyQualifiedName;                      // Primitive type - (BaseDMWGenerator.java:1042)
import org.dmd.dmp.server.extended.ActionRequest;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:972)
import org.dmd.dmp.server.extended.Request;                       // Derived class - (BaseDMWGenerator.java:1140)
import org.dmd.dmp.shared.generated.dmo.ActionRequestDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1144)
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;                 // Attribute objectList from the dmp schema - (BaseDMWGenerator.java:794)
import org.dmd.dmp.shared.generated.enums.ScopeEnum;              // Primitive type - (BaseDMWGenerator.java:1042)
import org.dmd.dms.ClassDefinition;                               // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:963)
import org.dmd.dms.generated.dmo.MetaDMSAG;                       // Required for MODREC constructor - (BaseDMWGenerator.java:968)
import org.dmd.dms.generated.dmw.DmcObjectIterableDMW;            // For multi-valued DmcObject - (BaseDMWGenerator.java:1995)
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor - (BaseDMWGenerator.java:967)



/**
 * The ActionRequest is used to trigger behaviour on one or more objects.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:391)
 */
abstract public class ActionRequestDMW extends Request  {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:470)
    public ActionRequestDMW() {
        super(new ActionRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._ActionRequest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:476)
    public ActionRequestDMW(DmcTypeModifierMV mods) {
        super(new ActionRequestDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._ActionRequest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:497)
    public ActionRequest getModificationRecorder(){
        ActionRequest rc = new ActionRequest();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:539)
    public ActionRequestDMW(ActionRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._ActionRequest);
    }

    public ActionRequestDMO getDMO() {
        return((ActionRequestDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:554)
    protected ActionRequestDMW(ActionRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1366)
    public FullyQualifiedName getFQN(){
        return(((ActionRequestDMO) core).getFQN());
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeFullyQualifiedName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1476)
    public void setFQN(Object value) throws DmcValueException {
        ((ActionRequestDMO) core).setFQN(value);
    }

    /**
     * Sets FQN to the specified value.
     * @param value FullyQualifiedName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1485)
    public void setFQN(FullyQualifiedName value){
        ((ActionRequestDMO) core).setFQN(value);
    }

    /**
     * Removes the FQN attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1511)
    public void remFQN(){
        ((ActionRequestDMO) core).remFQN();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1366)
    public String getActionName(){
        return(((ActionRequestDMO) core).getActionName());
    }

    /**
     * Sets actionName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1476)
    public void setActionName(Object value) throws DmcValueException {
        ((ActionRequestDMO) core).setActionName(value);
    }

    /**
     * Sets actionName to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1485)
    public void setActionName(String value){
        ((ActionRequestDMO) core).setActionName(value);
    }

    /**
     * Removes the actionName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1511)
    public void remActionName(){
        ((ActionRequestDMO) core).remActionName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1366)
    public DmcObject getActionTrigger(){
        return(((ActionRequestDMO) core).getActionTrigger());
    }

    /**
     * Sets actionTrigger to the specified value.
     * @param value A value compatible with DmcTypeDmcObject
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1476)
    public void setActionTrigger(Object value) throws DmcValueException {
        ((ActionRequestDMO) core).setActionTrigger(value);
    }

    /**
     * Sets actionTrigger to the specified value.
     * @param value DmcObject
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1485)
    public void setActionTrigger(DmcObject value){
        ((ActionRequestDMO) core).setActionTrigger(value);
    }

    /**
     * Removes the actionTrigger attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1511)
    public void remActionTrigger(){
        ((ActionRequestDMO) core).remActionTrigger();
    }

    /**
     * @return The number of DmcObject items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1563)
    public int getObjectListSize(){
        return(((ActionRequestDMO) core).getObjectListSize());
    }

    /**
     * @return true if there are no DmcObjectDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1571)
    public boolean getObjectListIsEmpty(){
        if (((ActionRequestDMO) core).getObjectListSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any DmcObjectDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1581)
    public boolean getObjectListHasValue(){
        if (((ActionRequestDMO) core).getObjectListSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of DmcObject objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1999)
    public DmcObjectIterableDMW getObjectListIterable(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__objectList);
        if (attr == null)
            return(DmcObjectIterableDMW.emptyList);
        
        return(new DmcObjectIterableDMW(((ActionRequestDMO) core).getObjectList()));
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2025)
    public void addObjectList(Object value) throws DmcValueException {
        ((ActionRequestDMO) core).addObjectList(value);
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2035)
    public void addObjectList(DmcObject value){
        ((ActionRequestDMO) core).addObjectList(value);
    }

    /**
     * Returns true if the collection contains the objectList value.
     * @param value A value compatible with DmcObject
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2092)
    public boolean objectListContains(DmcObject value){
        return(((ActionRequestDMO) core).objectListContains(value));
    }

    /**
     * @return A COPY of the collection of DmcObject objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2136)
    @SuppressWarnings("unchecked")
    public ArrayList<DmcObject> getObjectListCopy(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__objectList);
        if (attr == null)
            return(new ArrayList<DmcObject>());
        
        ArrayList<DmcObject> rc = new ArrayList<DmcObject>(attr.getMVSize());
        
        Iterator<DmcObject> it = (Iterator<DmcObject>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a objectList value.
     * @param value The DmcObject to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2163)
    public void delObjectList(Object value) throws DmcValueException {
        ((ActionRequestDMO) core).delObjectList(value);
    }

    /**
     * Deletes a objectList value.
     * @param value The DmcObject to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2172)
    public void delObjectList(DmcObject value){
        ((ActionRequestDMO) core).delObjectList(value);
    }

    /**
     * Removes the objectList attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2184)
    public void remObjectList(){
        ((ActionRequestDMO) core).remObjectList();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1366)
    public ScopeEnum getScope(){
        return(((ActionRequestDMO) core).getScope());
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1476)
    public void setScope(Object value) throws DmcValueException {
        ((ActionRequestDMO) core).setScope(value);
    }

    /**
     * Sets scope to the specified value.
     * @param value ScopeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1485)
    public void setScope(ScopeEnum value){
        ((ActionRequestDMO) core).setScope(value);
    }

    /**
     * Removes the scope attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1511)
    public void remScope(){
        ((ActionRequestDMO) core).remScope();
    }


}

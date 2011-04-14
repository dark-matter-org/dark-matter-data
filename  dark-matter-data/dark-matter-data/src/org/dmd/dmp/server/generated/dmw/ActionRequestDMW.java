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

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:838)
import java.util.ArrayList;                                       // To support getMVCopy()
import java.util.Iterator;                                        // To support getMVCopy()
import org.dmd.dmc.*;                                             // If any attributes
import org.dmd.dmc.DmcObject;                                     // For multi-valued containsDmcObject
import org.dmd.dmc.types.FullyQualifiedName;                      // Primitive type
import org.dmd.dmc.types.IntegerName;                             // Primitive type
import org.dmd.dmp.server.extended.ActionRequest;                 // Required for getModificationRecorder()
import org.dmd.dmp.server.extended.Request;                       // Derived class
import org.dmd.dmp.shared.generated.dmo.ActionRequestDMO;         // Class not auxiliary or abstract
import org.dmd.dmp.shared.generated.enums.ScopeEnum;              // Primitive type
import org.dmd.dms.*;                                             // Always 2
import org.dmd.dms.generated.dmw.DmcObjectIterableDMW;            // For multi-valued DmcObject
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor

/**
 * The ActionRequest is used to trigger behaviour on one or more objects.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:343)
 */
abstract public class ActionRequestDMW extends Request implements DmcNamedObjectIF {

    private ActionRequestDMO mycore;

    public ActionRequestDMW() {
        super(new ActionRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._ActionRequest);
        mycore = (ActionRequestDMO) core;
        mycore.setContainer(this);
    }

    public ActionRequestDMW(DmcTypeModifierMV mods) {
        super(new ActionRequestDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._ActionRequest);
        mycore = (ActionRequestDMO) core;
        mycore.setContainer(this);
    }

    public ActionRequest getModificationRecorder(){
        ActionRequest rc = new ActionRequest();
        rc.setDmcObject(new ActionRequestDMO(new DmcTypeModifierMV()));
        rc.setRequestID(getRequestID());
        return(rc);
    }

    public ActionRequestDMW(ActionRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._ActionRequest);
        mycore = (ActionRequestDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (ActionRequestDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    public ActionRequestDMO getDMO() {
        return(mycore);
    }

    protected ActionRequestDMW(ActionRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (ActionRequestDMO) core;
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:864)
    public IntegerName getObjectName(){
        return(mycore.getRequestID());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ActionRequestDMW){
            return( getObjectName().equals( ((ActionRequestDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public ScopeEnum getScope(){
        return(mycore.getScope());
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnum
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setScope(Object value) throws DmcValueException {
        mycore.setScope(value);
    }

    /**
     * Sets scope to the specified value.
     * @param value ScopeEnum
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setScope(ScopeEnum value){
        mycore.setScope(value);
    }

    /**
     * Removes the scope attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remScope(){
        mycore.remScope();
    }

    /**
     * @return The number of DmcObjectDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1110)
    public int getObjectListSize(){
        DmcAttribute<?> attr = mycore.get(ActionRequestDMO.__objectList);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no DmcObjectDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1122)
    public boolean getObjectListIsEmpty(){
        DmcAttribute<?> attr = mycore.get(ActionRequestDMO.__objectList);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any DmcObjectDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1134)
    public boolean getObjectListHasValue(){
        DmcAttribute<?> attr = mycore.get(ActionRequestDMO.__objectList);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of DmcObject objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
    public DmcObjectIterableDMW getObjectListIterable(){
        DmcAttribute<?> attr = mycore.get(ActionRequestDMO.__objectList);
        if (attr == null)
            return(DmcObjectIterableDMW.emptyList);
        
        return(new DmcObjectIterableDMW(mycore.getObjectList()));
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1261)
    public void addObjectList(Object value) throws DmcValueException {
        mycore.addObjectList(value);
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1270)
    public void addObjectList(DmcObject value){
        mycore.addObjectList(value);
    }

    /**
     * Returns true if the collection contains the objectList value.
     * @param value A value compatible with DmcObject
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1282)
    public boolean objectListContains(DmcObject value){
        return(mycore.objectListContains(value));
    }

    /**
     * @return A COPY of the collection of DmcObject objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1310)
    @SuppressWarnings("unchecked")
    public ArrayList<DmcObject> getObjectListCopy(){
        DmcAttribute<?> attr = mycore.get(ActionRequestDMO.__objectList);
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
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1337)
    public void delObjectList(Object value) throws DmcValueException {
        mycore.delObjectList(value);
    }

    /**
     * Removes the objectList attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1349)
    public void remObjectList(){
        mycore.remObjectList();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public DmcObject getActionTrigger(){
        return(mycore.getActionTrigger());
    }

    /**
     * Sets actionTrigger to the specified value.
     * @param value A value compatible with DmcTypeDmcObject
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setActionTrigger(Object value) throws DmcValueException {
        mycore.setActionTrigger(value);
    }

    /**
     * Sets actionTrigger to the specified value.
     * @param value DmcObject
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setActionTrigger(DmcObject value){
        mycore.setActionTrigger(value);
    }

    /**
     * Removes the actionTrigger attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remActionTrigger(){
        mycore.remActionTrigger();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public IntegerName getRequestID(){
        return(mycore.getRequestID());
    }

    /**
     * Sets requestID to the specified value.
     * @param value A value compatible with DmcTypeIntegerName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setRequestID(Object value) throws DmcValueException {
        mycore.setRequestID(value);
    }

    /**
     * Sets requestID to the specified value.
     * @param value IntegerName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setRequestID(IntegerName value){
        mycore.setRequestID(value);
    }

    /**
     * Removes the requestID attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remRequestID(){
        mycore.remRequestID();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public FullyQualifiedName getFQN(){
        return(mycore.getFQN());
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeFullyQualifiedName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setFQN(Object value) throws DmcValueException {
        mycore.setFQN(value);
    }

    /**
     * Sets FQN to the specified value.
     * @param value FullyQualifiedName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setFQN(FullyQualifiedName value){
        mycore.setFQN(value);
    }

    /**
     * Removes the FQN attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remFQN(){
        mycore.remFQN();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:989)
    public String getActionName(){
        return(mycore.getActionName());
    }

    /**
     * Sets actionName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setActionName(Object value) throws DmcValueException {
        mycore.setActionName(value);
    }

    /**
     * Sets actionName to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setActionName(String value){
        mycore.setActionName(value);
    }

    /**
     * Removes the actionName attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remActionName(){
        mycore.remActionName();
    }


}

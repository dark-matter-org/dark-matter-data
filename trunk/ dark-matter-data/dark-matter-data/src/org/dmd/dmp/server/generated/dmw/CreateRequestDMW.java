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

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:925)
import java.util.ArrayList;                                       // To support getMVCopy()
import java.util.Iterator;                                        // To support getMVCopy()
import org.dmd.dmc.*;                                             // If any attributes
import org.dmd.dmc.DmcObject;                                     // Primitive type
import org.dmd.dmc.types.FullyQualifiedName;                      // Primitive type
import org.dmd.dmp.server.extended.CreateRequest;                 // Required for getModificationRecorder()
import org.dmd.dmp.server.extended.Request;                       // Derived class
import org.dmd.dmp.shared.generated.dmo.CreateRequestDMO;         // Class not auxiliary or abstract
import org.dmd.dms.*;                                             // Always 2
import org.dmd.dms.generated.dmw.IntegerIterableDMW;              // For multi-valued Integer
import org.dmd.dms.generated.types.DmcTypeModifierMV;             // Required for MODREC constructor

/**
 * The CreateRequest allows you to create a new object. If the parentName is
 * specified, the object will be created beneath that parent object.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:348)
 */
abstract public class CreateRequestDMW extends Request {

    public CreateRequestDMW() {
        super(new CreateRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._CreateRequest);
    }

    public CreateRequestDMW(DmcTypeModifierMV mods) {
        super(new CreateRequestDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._CreateRequest);
    }

    public CreateRequest getModificationRecorder(){
        CreateRequest rc = new CreateRequest();
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public CreateRequestDMW(CreateRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._CreateRequest);
    }

    public CreateRequestDMO getDMO() {
        return((CreateRequestDMO) core);
    }

    protected CreateRequestDMW(CreateRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1090)
    public FullyQualifiedName getFQN(){
        return(((CreateRequestDMO) core).getFQN());
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeFullyQualifiedName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1137)
    public void setFQN(Object value) throws DmcValueException {
        ((CreateRequestDMO) core).setFQN(value);
    }

    /**
     * Sets FQN to the specified value.
     * @param value FullyQualifiedName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1146)
    public void setFQN(FullyQualifiedName value){
        ((CreateRequestDMO) core).setFQN(value);
    }

    /**
     * Removes the FQN attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1172)
    public void remFQN(){
        ((CreateRequestDMO) core).remFQN();
    }

    /**
     * @return The number of Integer items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1224)
    public int getRequestIDSize(){
        DmcAttribute<?> attr = core.get(CreateRequestDMO.__requestID);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no IntegerDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1236)
    public boolean getRequestIDIsEmpty(){
        DmcAttribute<?> attr = core.get(CreateRequestDMO.__requestID);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any IntegerDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1248)
    public boolean getRequestIDHasValue(){
        DmcAttribute<?> attr = core.get(CreateRequestDMO.__requestID);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of Integer objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1360)
    public IntegerIterableDMW getRequestIDIterable(){
        DmcAttribute<?> attr = core.get(CreateRequestDMO.__requestID);
        if (attr == null)
            return(IntegerIterableDMW.emptyList);
        
        return(new IntegerIterableDMW(((CreateRequestDMO) core).getRequestID()));
    }

    /**
     * Adds another requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1376)
    public void addRequestID(Object value) throws DmcValueException {
        ((CreateRequestDMO) core).addRequestID(value);
    }

    /**
     * Adds another requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1385)
    public void addRequestID(Integer value){
        ((CreateRequestDMO) core).addRequestID(value);
    }

    /**
     * Returns true if the collection contains the requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1409)
    public boolean requestIDContains(Integer value){
        return(((CreateRequestDMO) core).requestIDContains(value));
    }

    /**
     * @return A COPY of the collection of Integer objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1449)
    @SuppressWarnings("unchecked")
    public ArrayList<Integer> getRequestIDCopy(){
        DmcAttribute<?> attr = core.get(CreateRequestDMO.__requestID);
        if (attr == null)
            return(new ArrayList<Integer>());
        
        ArrayList<Integer> rc = new ArrayList<Integer>(attr.getMVSize());
        
        Iterator<Integer> it = (Iterator<Integer>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a requestID value.
     * @param value The Integer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1476)
    public void delRequestID(Object value) throws DmcValueException {
        ((CreateRequestDMO) core).delRequestID(value);
    }

    /**
     * Deletes a requestID value.
     * @param value The Integer to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1485)
    public void delRequestID(Integer value){
        ((CreateRequestDMO) core).delRequestID(value);
    }

    /**
     * Removes the requestID attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1497)
    public void remRequestID(){
        ((CreateRequestDMO) core).remRequestID();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1090)
    public DmcObject getNewObject(){
        return(((CreateRequestDMO) core).getNewObject());
    }

    /**
     * Sets newObject to the specified value.
     * @param value A value compatible with DmcTypeDmcObject
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1137)
    public void setNewObject(Object value) throws DmcValueException {
        ((CreateRequestDMO) core).setNewObject(value);
    }

    /**
     * Sets newObject to the specified value.
     * @param value DmcObject
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1146)
    public void setNewObject(DmcObject value){
        ((CreateRequestDMO) core).setNewObject(value);
    }

    /**
     * Removes the newObject attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1172)
    public void remNewObject(){
        ((CreateRequestDMO) core).remNewObject();
    }


}

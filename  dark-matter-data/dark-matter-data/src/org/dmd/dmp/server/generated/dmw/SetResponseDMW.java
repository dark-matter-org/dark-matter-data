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
import java.util.ArrayList;                                     // To support getMVCopy()
import java.util.Iterator;                                      // To support getMVCopy()
import org.dmd.dmc.*;                                           // If any attributes
import org.dmd.dmc.DmcObject;                                   // For multi-valued containsDmcObject
import org.dmd.dmc.types.IntegerName;                           // Primitive type
import org.dmd.dmp.server.extended.Response;                    // Derived class
import org.dmd.dmp.server.extended.SetResponse;                 // Required for getModificationRecorder()
import org.dmd.dmp.shared.generated.dmo.SetResponseDMO;         // Class not auxiliary or abstract
import org.dmd.dms.*;                                           // Always 2
import org.dmd.dms.generated.dmw.DmcObjectIterableDMW;          // For multi-valued DmcObject
import org.dmd.dms.generated.types.DmcTypeModifierMV;           // Required for MODREC constructor

/**
 * The SetResponse returns the results of a particular SetRequest. The
 * objectList will contain the objects with the previously specified edits.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:343)
 */
abstract public class SetResponseDMW extends Response implements DmcNamedObjectIF {

    private SetResponseDMO mycore;

    public SetResponseDMW() {
        super(new SetResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._SetResponse);
        mycore = (SetResponseDMO) core;
        mycore.setContainer(this);
    }

    public SetResponseDMW(DmcTypeModifierMV mods) {
        super(new SetResponseDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._SetResponse);
        mycore = (SetResponseDMO) core;
        mycore.setContainer(this);
    }

    public SetResponse getModificationRecorder(){
        SetResponse rc = new SetResponse();
        rc.setDmcObject(new SetResponseDMO(new DmcTypeModifierMV()));
        rc.setRequestID(getRequestID());
        return(rc);
    }

    public SetResponseDMW(SetResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._SetResponse);
        mycore = (SetResponseDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (SetResponseDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    public SetResponseDMO getDMO() {
        return(mycore);
    }

    protected SetResponseDMW(SetResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (SetResponseDMO) core;
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:864)
    public IntegerName getObjectName(){
        return(mycore.getRequestID());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof SetResponseDMW){
            return( getObjectName().equals( ((SetResponseDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of DmcObjectDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1110)
    public int getObjectListSize(){
        DmcAttribute<?> attr = mycore.get(SetResponseDMO.__objectList);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no DmcObjectDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1122)
    public boolean getObjectListIsEmpty(){
        DmcAttribute<?> attr = mycore.get(SetResponseDMO.__objectList);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any DmcObjectDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1134)
    public boolean getObjectListHasValue(){
        DmcAttribute<?> attr = mycore.get(SetResponseDMO.__objectList);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of DmcObject objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1245)
    public DmcObjectIterableDMW getObjectListIterable(){
        DmcAttribute<?> attr = mycore.get(SetResponseDMO.__objectList);
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
        DmcAttribute<?> attr = mycore.get(SetResponseDMO.__objectList);
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
    public Long getTimeMS(){
        return(mycore.getTimeMS());
    }

    /**
     * Sets timeMS to the specified value.
     * @param value A value compatible with DmcTypeLong
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1036)
    public void setTimeMS(Object value) throws DmcValueException {
        mycore.setTimeMS(value);
    }

    /**
     * Sets timeMS to the specified value.
     * @param value Long
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1045)
    public void setTimeMS(Long value){
        mycore.setTimeMS(value);
    }

    /**
     * Removes the timeMS attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1060)
    public void remTimeMS(){
        mycore.remTimeMS();
    }


}

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

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:741)
import org.dmd.dmc.*;                                           // If any attributes
import org.dmd.dmc.types.IntegerName;                           // Primitive type
import org.dmd.dmp.server.extended.Response;                    // Derived class
import org.dmd.dmp.shared.generated.dmo.GetResponseDMO;         // Class not auxiliary or abstract
import org.dmd.dms.*;                                           // Always 2
import org.dmd.dms.generated.dmw.DmcObjectIterableDMW;          // For multi-valued DmcObject

/**
 * The GetResponse returns a set of objects. The form of this response will
 * depend on the readableResponse and responseFormat values that may have
 * been sent with the original Get request. GetResponses
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:342)
 */
abstract public class GetResponseDMW extends Response implements DmcNamedObjectIF {

    private GetResponseDMO mycore;

    public GetResponseDMW() {
        super(new GetResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._GetResponse);
        mycore = (GetResponseDMO) core;
        mycore.setContainer(this);
    }

    public GetResponseDMW(GetResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._GetResponse);
        mycore = (GetResponseDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (GetResponseDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    public GetResponseDMO getDMO() {
        return(mycore);
    }

    protected GetResponseDMW(GetResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (GetResponseDMO) core;
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:767)
    public IntegerName getObjectName(){
        return(mycore.getRequestID());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof GetResponseDMW){
            return( getObjectName().equals( ((GetResponseDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of DmcObjectDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:985)
    public int getObjectListSize(){
        DmcAttribute<?> attr = mycore.get(GetResponseDMO.__objectList);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no DmcObjectDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:997)
    public boolean getObjectListIsEmpty(){
        DmcAttribute<?> attr = mycore.get(GetResponseDMO.__objectList);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any DmcObjectDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1009)
    public boolean getObjectListHasValue(){
        DmcAttribute<?> attr = mycore.get(GetResponseDMO.__objectList);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of DmcObject objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1081)
    public DmcObjectIterableDMW getObjectListIterable(){
        DmcAttribute<?> attr = mycore.get(GetResponseDMO.__objectList);
        if (attr == null)
            return(DmcObjectIterableDMW.emptyList);
        
        return(new DmcObjectIterableDMW(mycore.getObjectList()));
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1097)
    public void addObjectList(Object value) throws DmcValueException {
        mycore.addObjectList(value);
    }

    /**
     * Deletes a objectList value.
     * @param value The DmcObject to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1109)
    public void delObjectList(Object value) throws DmcValueException {
        mycore.delObjectList(value);
    }

    /**
     * Removes the objectList attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1121)
    public void remObjectList(){
        mycore.remObjectList();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:871)
    public IntegerName getRequestID(){
        return(mycore.getRequestID());
    }

    /**
     * Sets requestID to the specified value.
     * @param value A value compatible with DmcTypeIntegerName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:911)
    public void setRequestID(Object value) throws DmcValueException {
        mycore.setRequestID(value);
    }

    /**
     * Sets requestID to the specified value.
     * @param value IntegerName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:920)
    public void setRequestID(IntegerName value){
        mycore.setRequestID(value);
    }

    /**
     * Removes the requestID attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:935)
    public void remRequestID(){
        mycore.remRequestID();
    }


}

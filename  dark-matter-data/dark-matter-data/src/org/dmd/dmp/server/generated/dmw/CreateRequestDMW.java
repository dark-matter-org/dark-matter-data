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

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:715)
import java.util.*;                                               // If not auxiliary
import org.dmd.dmc.*;                                             // If any attributes
import org.dmd.dmc.DmcObject;                                     // Primitive type
import org.dmd.dmc.types.IntegerName;                             // Primitive type
import org.dmd.dmc.types.StringName;                              // Primitive type
import org.dmd.dmp.server.extended.Request;                       // Derived class
import org.dmd.dmp.shared.generated.dmo.CreateRequestDMO;         // Class not auxiliary or abstract
import org.dmd.dms.*;                                             // Always 2

/**
 * The CreateRequest allows you to create a new object. If the parentFQN is
 * specified, the object will be created beneath that parent object.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:339)
 */
abstract public class CreateRequestDMW extends Request implements DmcNamedObjectIF {

    private CreateRequestDMO mycore;

    public CreateRequestDMW() {
        super(new CreateRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._CreateRequest);
        mycore = (CreateRequestDMO) core;
        mycore.setContainer(this);
    }

    public CreateRequestDMW(CreateRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._CreateRequest);
        mycore = (CreateRequestDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (CreateRequestDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected CreateRequestDMW(CreateRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (CreateRequestDMO) core;
    }

    @Override
    protected ArrayList<?> getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmp.server.extended.CreateRequest>());
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:741)
    public IntegerName getObjectName(){
        return(mycore.getRequestID());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof CreateRequestDMW){
            return( getObjectName().equals( ((CreateRequestDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:844)
    public StringName getParentFQN(){
        return(mycore.getParentFQN());
    }

    /**
     * Sets parentFQN to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:873)
    public void setParentFQN(Object value) throws DmcValueException {
        mycore.setParentFQN(value);
    }

    /**
     * Sets parentFQN to the specified value.
     * @param value StringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:882)
    public void setParentFQN(StringName value){
        mycore.setParentFQN(value);
    }

    /**
     * Removes the parentFQN attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:897)
    public void remParentFQN(){
        mycore.remParentFQN();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:844)
    public IntegerName getRequestID(){
        return(mycore.getRequestID());
    }

    /**
     * Sets requestID to the specified value.
     * @param value A value compatible with DmcTypeIntegerName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:873)
    public void setRequestID(Object value) throws DmcValueException {
        mycore.setRequestID(value);
    }

    /**
     * Sets requestID to the specified value.
     * @param value IntegerName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:882)
    public void setRequestID(IntegerName value){
        mycore.setRequestID(value);
    }

    /**
     * Removes the requestID attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:897)
    public void remRequestID(){
        mycore.remRequestID();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:844)
    public DmcObject getNewObject(){
        return(mycore.getNewObject());
    }

    /**
     * Sets newObject to the specified value.
     * @param value A value compatible with DmcTypeDmcObject
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:873)
    public void setNewObject(Object value) throws DmcValueException {
        mycore.setNewObject(value);
    }

    /**
     * Sets newObject to the specified value.
     * @param value DmcObject
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:882)
    public void setNewObject(DmcObject value){
        mycore.setNewObject(value);
    }

    /**
     * Removes the newObject attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:897)
    public void remNewObject(){
        mycore.remNewObject();
    }


}

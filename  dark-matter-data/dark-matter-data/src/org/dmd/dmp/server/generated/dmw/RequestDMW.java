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

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:835)
import org.dmd.dmc.*;                                                 // If any attributes
import org.dmd.dmc.types.IntegerName;                                 // Primitive type
import org.dmd.dmp.server.extended.DMPMessage;                        // Derived class
import org.dmd.dmp.server.extended.Request;                           // Required for getModificationRecorder()
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                   // Abstract class
import org.dmd.dmp.shared.generated.enums.ResponseFormatEnum;         // Primitive type
import org.dmd.dms.*;                                                 // Always 2

/**
 * The request class provides a common base for all request messages.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:343)
 */
abstract public class RequestDMW extends DMPMessage implements DmcNamedObjectIF {

    private RequestDMO mycore;

    protected RequestDMW() {
        super();
    }

    public RequestDMO getDMO() {
        return(mycore);
    }

    protected RequestDMW(RequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (RequestDMO) core;
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:861)
    public IntegerName getObjectName(){
        return(mycore.getRequestID());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof RequestDMW){
            return( getObjectName().equals( ((RequestDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:986)
    public String getSessionID(){
        return(mycore.getSessionID());
    }

    /**
     * Sets sessionID to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1033)
    public void setSessionID(Object value) throws DmcValueException {
        mycore.setSessionID(value);
    }

    /**
     * Sets sessionID to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1042)
    public void setSessionID(String value){
        mycore.setSessionID(value);
    }

    /**
     * Removes the sessionID attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1057)
    public void remSessionID(){
        mycore.remSessionID();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:986)
    public Boolean isReadableFormat(){
        return(mycore.isReadableFormat());
    }

    /**
     * Sets readableFormat to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1033)
    public void setReadableFormat(Object value) throws DmcValueException {
        mycore.setReadableFormat(value);
    }

    /**
     * Sets readableFormat to the specified value.
     * @param value Boolean
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1042)
    public void setReadableFormat(Boolean value){
        mycore.setReadableFormat(value);
    }

    /**
     * Removes the readableFormat attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1057)
    public void remReadableFormat(){
        mycore.remReadableFormat();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:986)
    public ResponseFormatEnum getResponseFormat(){
        return(mycore.getResponseFormat());
    }

    /**
     * Sets responseFormat to the specified value.
     * @param value A value compatible with DmcTypeResponseFormatEnum
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1033)
    public void setResponseFormat(Object value) throws DmcValueException {
        mycore.setResponseFormat(value);
    }

    /**
     * Sets responseFormat to the specified value.
     * @param value ResponseFormatEnum
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1042)
    public void setResponseFormat(ResponseFormatEnum value){
        mycore.setResponseFormat(value);
    }

    /**
     * Removes the responseFormat attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1057)
    public void remResponseFormat(){
        mycore.remResponseFormat();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:986)
    public IntegerName getRequestID(){
        return(mycore.getRequestID());
    }

    /**
     * Sets requestID to the specified value.
     * @param value A value compatible with DmcTypeIntegerName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1033)
    public void setRequestID(Object value) throws DmcValueException {
        mycore.setRequestID(value);
    }

    /**
     * Sets requestID to the specified value.
     * @param value IntegerName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1042)
    public void setRequestID(IntegerName value){
        mycore.setRequestID(value);
    }

    /**
     * Removes the requestID attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1057)
    public void remRequestID(){
        mycore.remRequestID();
    }


}

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

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:886)
import org.dmd.dmc.*;                                                 // If any attributes
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
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
abstract public class RequestDMW extends DMPMessage {

    protected RequestDMW() {
        super();
    }

    abstract public Request getModificationRecorder();

    public RequestDMO getDMO() {
        return((RequestDMO) core);
    }

    protected RequestDMW(RequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public Integer getHandlerID(){
        return(((RequestDMO) core).getHandlerID());
    }

    /**
     * Sets handlerID to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setHandlerID(Object value) throws DmcValueException {
        ((RequestDMO) core).setHandlerID(value);
    }

    /**
     * Sets handlerID to the specified value.
     * @param value Integer
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setHandlerID(Integer value){
        ((RequestDMO) core).setHandlerID(value);
    }

    /**
     * Removes the handlerID attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remHandlerID(){
        ((RequestDMO) core).remHandlerID();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public String getSessionID(){
        return(((RequestDMO) core).getSessionID());
    }

    /**
     * Sets sessionID to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setSessionID(Object value) throws DmcValueException {
        ((RequestDMO) core).setSessionID(value);
    }

    /**
     * Sets sessionID to the specified value.
     * @param value String
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setSessionID(String value){
        ((RequestDMO) core).setSessionID(value);
    }

    /**
     * Removes the sessionID attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remSessionID(){
        ((RequestDMO) core).remSessionID();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public Boolean isReadableFormat(){
        return(((RequestDMO) core).isReadableFormat());
    }

    /**
     * Sets readableFormat to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setReadableFormat(Object value) throws DmcValueException {
        ((RequestDMO) core).setReadableFormat(value);
    }

    /**
     * Sets readableFormat to the specified value.
     * @param value Boolean
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setReadableFormat(Boolean value){
        ((RequestDMO) core).setReadableFormat(value);
    }

    /**
     * Removes the readableFormat attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remReadableFormat(){
        ((RequestDMO) core).remReadableFormat();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public ResponseFormatEnum getResponseFormat(){
        return(((RequestDMO) core).getResponseFormat());
    }

    /**
     * Sets responseFormat to the specified value.
     * @param value A value compatible with DmcTypeResponseFormatEnum
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setResponseFormat(Object value) throws DmcValueException {
        ((RequestDMO) core).setResponseFormat(value);
    }

    /**
     * Sets responseFormat to the specified value.
     * @param value ResponseFormatEnum
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setResponseFormat(ResponseFormatEnum value){
        ((RequestDMO) core).setResponseFormat(value);
    }

    /**
     * Removes the responseFormat attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remResponseFormat(){
        ((RequestDMO) core).remResponseFormat();
    }


}

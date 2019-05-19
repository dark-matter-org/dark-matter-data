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
package org.dmd.dmp.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                                 // If any attributes - (BaseDMWGenerator.java:975)
import org.dmd.dmp.server.extended.DMPMessage;                        // Derived class - (BaseDMWGenerator.java:1136)
import org.dmd.dmp.server.extended.Request;                           // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                   // Abstract class - (BaseDMWGenerator.java:1118)
import org.dmd.dmp.shared.generated.enums.ResponseFormatEnum;         // Primitive type - (BaseDMWGenerator.java:1038)
import org.dmd.dms.ClassDefinition;                                   // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)



/**
 * The request class provides a common base for all request messages.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
abstract public class RequestDMW extends DMPMessage {

    protected RequestDMW() {
        super();
    }

    abstract public Request getModificationRecorder();

    public RequestDMO getDMO() {
        return((RequestDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected RequestDMW(RequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1362)
    public Integer getHandlerID(){
        return(((RequestDMO) core).getHandlerID());
    }

    /**
     * Sets handlerID to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1472)
    public void setHandlerID(Object value) throws DmcValueException {
        ((RequestDMO) core).setHandlerID(value);
    }

    /**
     * Sets handlerID to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1481)
    public void setHandlerID(Integer value){
        ((RequestDMO) core).setHandlerID(value);
    }

    /**
     * Removes the handlerID attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1507)
    public void remHandlerID(){
        ((RequestDMO) core).remHandlerID();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1362)
    public Boolean isNotifyOriginator(){
        return(((RequestDMO) core).isNotifyOriginator());
    }

    /**
     * Sets notifyOriginator to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1472)
    public void setNotifyOriginator(Object value) throws DmcValueException {
        ((RequestDMO) core).setNotifyOriginator(value);
    }

    /**
     * Sets notifyOriginator to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1481)
    public void setNotifyOriginator(Boolean value){
        ((RequestDMO) core).setNotifyOriginator(value);
    }

    /**
     * Removes the notifyOriginator attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1507)
    public void remNotifyOriginator(){
        ((RequestDMO) core).remNotifyOriginator();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1362)
    public Integer getOriginatorID(){
        return(((RequestDMO) core).getOriginatorID());
    }

    /**
     * Sets originatorID to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1472)
    public void setOriginatorID(Object value) throws DmcValueException {
        ((RequestDMO) core).setOriginatorID(value);
    }

    /**
     * Sets originatorID to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1481)
    public void setOriginatorID(Integer value){
        ((RequestDMO) core).setOriginatorID(value);
    }

    /**
     * Removes the originatorID attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1507)
    public void remOriginatorID(){
        ((RequestDMO) core).remOriginatorID();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1362)
    public Boolean isReadableFormat(){
        return(((RequestDMO) core).isReadableFormat());
    }

    /**
     * Sets readableFormat to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1472)
    public void setReadableFormat(Object value) throws DmcValueException {
        ((RequestDMO) core).setReadableFormat(value);
    }

    /**
     * Sets readableFormat to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1481)
    public void setReadableFormat(Boolean value){
        ((RequestDMO) core).setReadableFormat(value);
    }

    /**
     * Removes the readableFormat attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1507)
    public void remReadableFormat(){
        ((RequestDMO) core).remReadableFormat();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1362)
    public ResponseFormatEnum getResponseFormat(){
        return(((RequestDMO) core).getResponseFormat());
    }

    /**
     * Sets responseFormat to the specified value.
     * @param value A value compatible with DmcTypeResponseFormatEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1472)
    public void setResponseFormat(Object value) throws DmcValueException {
        ((RequestDMO) core).setResponseFormat(value);
    }

    /**
     * Sets responseFormat to the specified value.
     * @param value ResponseFormatEnum
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1481)
    public void setResponseFormat(ResponseFormatEnum value){
        ((RequestDMO) core).setResponseFormat(value);
    }

    /**
     * Removes the responseFormat attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1507)
    public void remResponseFormat(){
        ((RequestDMO) core).remResponseFormat();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1362)
    public String getSessionID(){
        return(((RequestDMO) core).getSessionID());
    }

    /**
     * Sets sessionID to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1472)
    public void setSessionID(Object value) throws DmcValueException {
        ((RequestDMO) core).setSessionID(value);
    }

    /**
     * Sets sessionID to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1481)
    public void setSessionID(String value){
        ((RequestDMO) core).setSessionID(value);
    }

    /**
     * Removes the sessionID attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1507)
    public void remSessionID(){
        ((RequestDMO) core).remSessionID();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1362)
    public Integer getTimeoutSeconds(){
        return(((RequestDMO) core).getTimeoutSeconds());
    }

    /**
     * Sets timeoutSeconds to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1472)
    public void setTimeoutSeconds(Object value) throws DmcValueException {
        ((RequestDMO) core).setTimeoutSeconds(value);
    }

    /**
     * Sets timeoutSeconds to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1481)
    public void setTimeoutSeconds(Integer value){
        ((RequestDMO) core).setTimeoutSeconds(value);
    }

    /**
     * Removes the timeoutSeconds attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1507)
    public void remTimeoutSeconds(){
        ((RequestDMO) core).remTimeoutSeconds();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1362)
    public String getUserName(){
        return(((RequestDMO) core).getUserName());
    }

    /**
     * Sets userName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1472)
    public void setUserName(Object value) throws DmcValueException {
        ((RequestDMO) core).setUserName(value);
    }

    /**
     * Sets userName to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1481)
    public void setUserName(String value){
        ((RequestDMO) core).setUserName(value);
    }

    /**
     * Removes the userName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1507)
    public void remUserName(){
        ((RequestDMO) core).remUserName();
    }


}

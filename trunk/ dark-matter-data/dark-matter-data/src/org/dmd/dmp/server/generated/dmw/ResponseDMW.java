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

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:722)
import org.dmd.dmc.*;                                                   // If any attributes
import org.dmd.dmc.types.IntegerName;                                   // Primitive type
import org.dmd.dmp.server.extended.DMPMessage;                          // Derived class
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                    // Class not auxiliary or abstract
import org.dmd.dmp.shared.generated.enums.ResponseCategoryEnum;         // Primitive type
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;             // Primitive type
import org.dmd.dms.*;                                                   // Always 2

/**
 * The Response class serves as a common base for all response messages. It
 * used to be that the Response was abstract, but because we could receive a
 * completely unknown request (for instance via a JSON/XML interface), we had
 * to have the ability to return a generic error response.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:339)
 */
abstract public class ResponseDMW extends DMPMessage implements DmcNamedObjectIF {

    private ResponseDMO mycore;

    public ResponseDMW() {
        super(new ResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._Response);
        mycore = (ResponseDMO) core;
        mycore.setContainer(this);
    }

    public ResponseDMW(ResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._Response);
        mycore = (ResponseDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (ResponseDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    public ResponseDMO getDMO() {
        return(mycore);
    }

    protected ResponseDMW(ResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (ResponseDMO) core;
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:748)
    public IntegerName getObjectName(){
        return(mycore.getRequestID());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof ResponseDMW){
            return( getObjectName().equals( ((ResponseDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:851)
    public String getResponseText(){
        return(mycore.getResponseText());
    }

    /**
     * Sets responseText to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:880)
    public void setResponseText(Object value) throws DmcValueException {
        mycore.setResponseText(value);
    }

    /**
     * Sets responseText to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:889)
    public void setResponseText(String value){
        mycore.setResponseText(value);
    }

    /**
     * Removes the responseText attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:904)
    public void remResponseText(){
        mycore.remResponseText();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:851)
    public ResponseCategoryEnum getResponseCategory(){
        return(mycore.getResponseCategory());
    }

    /**
     * Sets responseCategory to the specified value.
     * @param value A value compatible with DmcTypeResponseCategoryEnum
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:880)
    public void setResponseCategory(Object value) throws DmcValueException {
        mycore.setResponseCategory(value);
    }

    /**
     * Sets responseCategory to the specified value.
     * @param value ResponseCategoryEnum
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:889)
    public void setResponseCategory(ResponseCategoryEnum value){
        mycore.setResponseCategory(value);
    }

    /**
     * Removes the responseCategory attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:904)
    public void remResponseCategory(){
        mycore.remResponseCategory();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:851)
    public IntegerName getRequestID(){
        return(mycore.getRequestID());
    }

    /**
     * Sets requestID to the specified value.
     * @param value A value compatible with DmcTypeIntegerName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:880)
    public void setRequestID(Object value) throws DmcValueException {
        mycore.setRequestID(value);
    }

    /**
     * Sets requestID to the specified value.
     * @param value IntegerName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:889)
    public void setRequestID(IntegerName value){
        mycore.setRequestID(value);
    }

    /**
     * Removes the requestID attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:904)
    public void remRequestID(){
        mycore.remRequestID();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:851)
    public Boolean getLastResponse(){
        return(mycore.getLastResponse());
    }

    /**
     * Sets lastResponse to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:880)
    public void setLastResponse(Object value) throws DmcValueException {
        mycore.setLastResponse(value);
    }

    /**
     * Sets lastResponse to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:889)
    public void setLastResponse(Boolean value){
        mycore.setLastResponse(value);
    }

    /**
     * Removes the lastResponse attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:904)
    public void remLastResponse(){
        mycore.remLastResponse();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:851)
    public ResponseTypeEnum getResponseType(){
        return(mycore.getResponseType());
    }

    /**
     * Sets responseType to the specified value.
     * @param value A value compatible with DmcTypeResponseTypeEnum
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:880)
    public void setResponseType(Object value) throws DmcValueException {
        mycore.setResponseType(value);
    }

    /**
     * Sets responseType to the specified value.
     * @param value ResponseTypeEnum
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:889)
    public void setResponseType(ResponseTypeEnum value){
        mycore.setResponseType(value);
    }

    /**
     * Removes the responseType attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:904)
    public void remResponseType(){
        mycore.remResponseType();
    }


}

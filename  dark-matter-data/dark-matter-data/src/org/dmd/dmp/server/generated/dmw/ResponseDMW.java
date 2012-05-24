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
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:349)
import org.dmd.dmc.*;                                                   // If any attributes - (BaseDMWGeneratorNewest.java:808)
import org.dmd.dmp.server.extended.DMPMessage;                          // Derived class - (BaseDMWGeneratorNewest.java:943)
import org.dmd.dmp.server.extended.Response;                            // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:801)
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                    // Class not auxiliary or abstract - (BaseDMWGeneratorNewest.java:947)
import org.dmd.dmp.shared.generated.enums.ResponseCategoryEnum;         // Primitive type - (BaseDMWGeneratorNewest.java:864)
import org.dmd.dmp.shared.generated.enums.ResponseTypeEnum;             // Primitive type - (BaseDMWGeneratorNewest.java:864)
import org.dmd.dms.*;                                                   // Always 2 - (BaseDMWGeneratorNewest.java:793)
import org.dmd.dms.generated.dmo.MetaDMSAG;                             // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:797)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor - (BaseDMWGeneratorNewest.java:796)


/**
 * The Response class serves as a common base for all response messages. It
 * used to be that the Response was abstract, but because we could receive a
 * completely unknown request (for instance via a JSON/XML interface), we had
 * to have the ability to return a generic error response.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:366)
 */
abstract public class ResponseDMW extends DMPMessage {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:443)
    public ResponseDMW() {
        super(new ResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._Response);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:449)
    public ResponseDMW(DmcTypeModifierMV mods) {
        super(new ResponseDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._Response);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:470)
    public Response getModificationRecorder(){
        Response rc = new Response();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:512)
    public ResponseDMW(ResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._Response);
    }

    public ResponseDMO getDMO() {
        return((ResponseDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:527)
    protected ResponseDMW(ResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1165)
    public Integer getHandlerID(){
        return(((ResponseDMO) core).getHandlerID());
    }

    /**
     * Sets handlerID to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1257)
    public void setHandlerID(Object value) throws DmcValueException {
        ((ResponseDMO) core).setHandlerID(value);
    }

    /**
     * Sets handlerID to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1266)
    public void setHandlerID(Integer value){
        ((ResponseDMO) core).setHandlerID(value);
    }

    /**
     * Removes the handlerID attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public void remHandlerID(){
        ((ResponseDMO) core).remHandlerID();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1165)
    public String getResponseText(){
        return(((ResponseDMO) core).getResponseText());
    }

    /**
     * Sets responseText to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1257)
    public void setResponseText(Object value) throws DmcValueException {
        ((ResponseDMO) core).setResponseText(value);
    }

    /**
     * Sets responseText to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1266)
    public void setResponseText(String value){
        ((ResponseDMO) core).setResponseText(value);
    }

    /**
     * Removes the responseText attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public void remResponseText(){
        ((ResponseDMO) core).remResponseText();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1165)
    public ResponseCategoryEnum getResponseCategory(){
        return(((ResponseDMO) core).getResponseCategory());
    }

    /**
     * Sets responseCategory to the specified value.
     * @param value A value compatible with DmcTypeResponseCategoryEnum
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1257)
    public void setResponseCategory(Object value) throws DmcValueException {
        ((ResponseDMO) core).setResponseCategory(value);
    }

    /**
     * Sets responseCategory to the specified value.
     * @param value ResponseCategoryEnum
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1266)
    public void setResponseCategory(ResponseCategoryEnum value){
        ((ResponseDMO) core).setResponseCategory(value);
    }

    /**
     * Removes the responseCategory attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public void remResponseCategory(){
        ((ResponseDMO) core).remResponseCategory();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1165)
    public Boolean isLastResponse(){
        return(((ResponseDMO) core).isLastResponse());
    }

    /**
     * Sets lastResponse to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1257)
    public void setLastResponse(Object value) throws DmcValueException {
        ((ResponseDMO) core).setLastResponse(value);
    }

    /**
     * Sets lastResponse to the specified value.
     * @param value Boolean
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1266)
    public void setLastResponse(Boolean value){
        ((ResponseDMO) core).setLastResponse(value);
    }

    /**
     * Removes the lastResponse attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public void remLastResponse(){
        ((ResponseDMO) core).remLastResponse();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1165)
    public ResponseTypeEnum getResponseType(){
        return(((ResponseDMO) core).getResponseType());
    }

    /**
     * Sets responseType to the specified value.
     * @param value A value compatible with DmcTypeResponseTypeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1257)
    public void setResponseType(Object value) throws DmcValueException {
        ((ResponseDMO) core).setResponseType(value);
    }

    /**
     * Sets responseType to the specified value.
     * @param value ResponseTypeEnum
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1266)
    public void setResponseType(ResponseTypeEnum value){
        ((ResponseDMO) core).setResponseType(value);
    }

    /**
     * Removes the responseType attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1292)
    public void remResponseType(){
        ((ResponseDMO) core).remResponseType();
    }


}

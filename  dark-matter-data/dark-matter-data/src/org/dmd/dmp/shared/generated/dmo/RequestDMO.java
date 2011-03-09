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
package org.dmd.dmp.shared.generated.dmo;

import java.util.*;

import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
// import 3.2 Boolean
import org.dmd.dmc.types.DmcTypeBoolean;
// import 2
import org.dmd.dmp.shared.generated.enums.ResponseFormatEnum;
// import 3.2 ResponseFormatEnum
import org.dmd.dmp.shared.generated.types.DmcTypeResponseFormatEnum;
// import 3.2 String
import org.dmd.dmc.types.DmcTypeString;

// import 6
import org.dmd.dmp.shared.generated.dmo.DMPMessageDMO;

@SuppressWarnings("serial")
/**
 * The request class provides a common base for all request messages.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:654)
 */
abstract public class RequestDMO  extends DMPMessageDMO  {

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __readableFormat = new DmcAttributeInfo("readableFormat",517,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"IntegerName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __responseFormat = new DmcAttributeInfo("responseFormat",516,"ResponseFormatEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __sessionID = new DmcAttributeInfo("sessionID",502,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__readableFormat.id,__readableFormat);
        _ImAp.put(__requestID.id,__requestID);
        _ImAp.put(__responseFormat.id,__responseFormat);
        _ImAp.put(__sessionID.id,__sessionID);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__readableFormat.name,__readableFormat);
        _SmAp.put(__requestID.name,__requestID);
        _SmAp.put(__responseFormat.name,__responseFormat);
        _SmAp.put(__sessionID.name,__sessionID);
    }

    public RequestDMO() {
        super("Request",_ImAp,_SmAp);
    }

    protected RequestDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public RequestDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public RequestDMO(RequestDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    public String getSessionID(){
        DmcTypeString attr = (DmcTypeString) get(__sessionID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sessionID to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setSessionID(Object value) throws DmcValueException {
        DmcAttribute attr = get(__sessionID);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__sessionID,attr);
    }

    /**
     * Removes the sessionID attribute value.
     */
    public void remSessionID(){
         rem(__sessionID);
    }

    public Boolean getReadableFormat(){
        DmcTypeBoolean attr = (DmcTypeBoolean) get(__readableFormat);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets readableFormat to the specified value.
     * @param value A value compatible with DmcTypeBoolean
     */
    @SuppressWarnings("unchecked")
    public void setReadableFormat(Object value) throws DmcValueException {
        DmcAttribute attr = get(__readableFormat);
        if (attr == null)
            attr = new DmcTypeBoolean();
        
        attr.set(value);
        set(__readableFormat,attr);
    }

    /**
     * Removes the readableFormat attribute value.
     */
    public void remReadableFormat(){
         rem(__readableFormat);
    }

    public ResponseFormatEnum getResponseFormat(){
        DmcTypeResponseFormatEnum attr = (DmcTypeResponseFormatEnum) get(__responseFormat);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets responseFormat to the specified value.
     * @param value A value compatible with DmcTypeResponseFormatEnum
     */
    @SuppressWarnings("unchecked")
    public void setResponseFormat(Object value) throws DmcValueException {
        DmcAttribute attr = get(__responseFormat);
        if (attr == null)
            attr = new DmcTypeResponseFormatEnum();
        
        attr.set(value);
        set(__responseFormat,attr);
    }

    /**
     * Removes the responseFormat attribute value.
     */
    public void remResponseFormat(){
         rem(__responseFormat);
    }




}

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

// Generated from:  org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:281)
import java.io.Serializable;                                  // Always required
import java.util.*;                                           // Always required
import org.dmd.dmc.DmcAttribute;                              // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                          // Always required
import org.dmd.dmc.DmcSliceInfo;                              // Required for object slicing
import org.dmd.dmc.DmcValueException;                         // Any attributes
import org.dmd.dmp.shared.generated.dmo.RequestDMO;           // Base class
import org.dmd.dms.generated.enums.DataTypeEnum;              // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;             // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringSV;           // Required type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The LogoutRequest allows you to disconnect from your current session.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:136)
 */
@SuppressWarnings("serial")
public class LogoutRequestDMO  extends RequestDMO  implements Serializable  {

    public final static String constructionClassName = "LogoutRequest";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __handlerID = new DmcAttributeInfo("handlerID",531,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __originatorID = new DmcAttributeInfo("originatorID",526,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __readableFormat = new DmcAttributeInfo("readableFormat",517,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"Integer",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __responseFormat = new DmcAttributeInfo("responseFormat",516,"ResponseFormatEnum",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __sessionID = new DmcAttributeInfo("sessionID",502,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __timeMS = new DmcAttributeInfo("timeMS",518,"Long",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __userName = new DmcAttributeInfo("userName",400,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__handlerID.id,__handlerID);
        _ImAp.put(__originatorID.id,__originatorID);
        _ImAp.put(__readableFormat.id,__readableFormat);
        _ImAp.put(__requestID.id,__requestID);
        _ImAp.put(__responseFormat.id,__responseFormat);
        _ImAp.put(__sessionID.id,__sessionID);
        _ImAp.put(__timeMS.id,__timeMS);
        _ImAp.put(__userName.id,__userName);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__handlerID.name,__handlerID);
        _SmAp.put(__originatorID.name,__originatorID);
        _SmAp.put(__readableFormat.name,__readableFormat);
        _SmAp.put(__requestID.name,__requestID);
        _SmAp.put(__responseFormat.name,__responseFormat);
        _SmAp.put(__sessionID.name,__sessionID);
        _SmAp.put(__timeMS.name,__timeMS);
        _SmAp.put(__userName.name,__userName);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public LogoutRequestDMO() {
        super("LogoutRequest");
    }

    protected LogoutRequestDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public LogoutRequestDMO getNew(){
        LogoutRequestDMO rc = new LogoutRequestDMO();
        return(rc);
    }

    @Override
    public LogoutRequestDMO getSlice(DmcSliceInfo info){
        LogoutRequestDMO rc = new LogoutRequestDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public LogoutRequestDMO(DmcTypeModifierMV mods) {
        super("LogoutRequest");
        modrec(true);
        setModifier(mods);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public String getUserName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__userName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets userName to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setUserName(String value) {
        DmcAttribute<?> attr = get(__userName);
        if (attr == null)
            attr = new DmcTypeStringSV(__userName);
        
        try{
            attr.set(value);
            set(__userName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets userName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setUserName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__userName);
        if (attr == null)
            attr = new DmcTypeStringSV(__userName);
        
        attr.set(value);
        set(__userName,attr);
    }

    /**
     * Removes the userName attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remUserName(){
         rem(__userName);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public String getSessionID(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__sessionID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sessionID to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setSessionID(String value) {
        DmcAttribute<?> attr = get(__sessionID);
        if (attr == null)
            attr = new DmcTypeStringSV(__sessionID);
        
        try{
            attr.set(value);
            set(__sessionID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets sessionID to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setSessionID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__sessionID);
        if (attr == null)
            attr = new DmcTypeStringSV(__sessionID);
        
        attr.set(value);
        set(__sessionID,attr);
    }

    /**
     * Removes the sessionID attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remSessionID(){
         rem(__sessionID);
    }




}

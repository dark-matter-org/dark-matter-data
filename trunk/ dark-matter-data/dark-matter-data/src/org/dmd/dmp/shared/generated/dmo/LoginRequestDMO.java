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

// Generated from:  org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:270)
import java.io.Serializable;                                     // Always required
import java.util.*;                                              // Always required
import org.dmd.dmc.DmcAttribute;                                 // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                             // Always required
import org.dmd.dmc.DmcNamedObjectIF;                             // Named object
import org.dmd.dmc.DmcValueException;                            // Any attributes
import org.dmd.dmc.types.IntegerName;                            // Naming attribute type
import org.dmd.dmp.shared.generated.dmo.RequestDMO;              // Base class
import org.dmd.dms.generated.enums.ValueTypeEnum;                // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeIntegerNameSV;         // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;            // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringSV;              // Required type

/**
 * The LoginRequest allows you to connect to connect to something and pass
 * along credentials.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:129)
 */
@SuppressWarnings("serial")
public class LoginRequestDMO  extends RequestDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "LoginRequest";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __password = new DmcAttributeInfo("password",401,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __readableFormat = new DmcAttributeInfo("readableFormat",517,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"IntegerName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __responseFormat = new DmcAttributeInfo("responseFormat",516,"ResponseFormatEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __sessionID = new DmcAttributeInfo("sessionID",502,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __timeMS = new DmcAttributeInfo("timeMS",518,"Long",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __userName = new DmcAttributeInfo("userName",400,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__password.id,__password);
        _ImAp.put(__readableFormat.id,__readableFormat);
        _ImAp.put(__requestID.id,__requestID);
        _ImAp.put(__responseFormat.id,__responseFormat);
        _ImAp.put(__sessionID.id,__sessionID);
        _ImAp.put(__timeMS.id,__timeMS);
        _ImAp.put(__userName.id,__userName);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__password.name,__password);
        _SmAp.put(__readableFormat.name,__readableFormat);
        _SmAp.put(__requestID.name,__requestID);
        _SmAp.put(__responseFormat.name,__responseFormat);
        _SmAp.put(__sessionID.name,__sessionID);
        _SmAp.put(__timeMS.name,__timeMS);
        _SmAp.put(__userName.name,__userName);
    }

    public LoginRequestDMO() {
        super("LoginRequest");
    }

    protected LoginRequestDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public LoginRequestDMO getNew(){
        LoginRequestDMO rc = new LoginRequestDMO();
        return(rc);
    }

    public LoginRequestDMO(DmcTypeModifierMV mods) {
        super("LoginRequest");
        modrec(true);
        setModifier(mods);
    }

    public LoginRequestDMO getModificationRecorder(){
        LoginRequestDMO rc = new LoginRequestDMO(new DmcTypeModifierMV());
        rc.setRequestID(getRequestID());
        return(rc);
    }

    //  org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:669)
    public IntegerName getObjectName(){
        DmcAttribute<?> name = get(__requestID);
        if (name != null)
            return((IntegerName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__requestID);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof LoginRequestDMO){
            return( getObjectName().equals( ((LoginRequestDMO) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:558)
    public IntegerName getRequestID(){
        DmcTypeIntegerNameSV attr = (DmcTypeIntegerNameSV) get(__requestID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets requestID to the specified value.
     * @param value IntegerName
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:595)
    public void setRequestID(IntegerName value) {
        DmcAttribute<?> attr = get(__requestID);
        if (attr == null)
            attr = new DmcTypeIntegerNameSV(__requestID);
        
        try{
            attr.set(value);
            set(__requestID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets requestID to the specified value.
     * @param value A value compatible with DmcTypeIntegerNameSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
    public void setRequestID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__requestID);
        if (attr == null)
            attr = new DmcTypeIntegerNameSV(__requestID);
        
        attr.set(value);
        set(__requestID,attr);
    }

    /**
     * Removes the requestID attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:637)
    public void remRequestID(){
         rem(__requestID);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:558)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:595)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:637)
    public void remUserName(){
         rem(__userName);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:558)
    public String getPassword(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__password);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets password to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:595)
    public void setPassword(String value) {
        DmcAttribute<?> attr = get(__password);
        if (attr == null)
            attr = new DmcTypeStringSV(__password);
        
        try{
            attr.set(value);
            set(__password,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets password to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
    public void setPassword(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__password);
        if (attr == null)
            attr = new DmcTypeStringSV(__password);
        
        attr.set(value);
        set(__password,attr);
    }

    /**
     * Removes the password attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:637)
    public void remPassword(){
         rem(__password);
    }




}

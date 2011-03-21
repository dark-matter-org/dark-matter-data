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

// Generated from: org.dmd.dms.util.DmoFormatter.formatImports(DmoFormatter.java:713)
import java.util.*;                                          // Always required
import org.dmd.dmc.DmcAttribute;                             // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                         // Always required
import org.dmd.dmc.DmcValueException;                        // Any attributes
import org.dmd.dmc.types.DmcTypeString;                      // Required type
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;         // Base class
import org.dmd.dms.generated.enums.ValueTypeEnum;            // Required if we have any attributes

/**
 * The LoginResponse is returned after a Login request is received. If the
 * login is successful, a session ID will be assigned and a request root will
 * be given. All subsequent requests must contain the session ID and all
 * requests will be checked to ensure that they pertain to objects at or
 * below the request root.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:139)
 */
@SuppressWarnings("serial")
public class LoginResponseDMO  extends ResponseDMO  {

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __lastResponse = new DmcAttributeInfo("lastResponse",510,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"IntegerName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __requestRoot = new DmcAttributeInfo("requestRoot",503,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __responseCategory = new DmcAttributeInfo("responseCategory",505,"ResponseCategoryEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __responseText = new DmcAttributeInfo("responseText",506,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __responseType = new DmcAttributeInfo("responseType",504,"ResponseTypeEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __sessionID = new DmcAttributeInfo("sessionID",502,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __userFQN = new DmcAttributeInfo("userFQN",524,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__lastResponse.id,__lastResponse);
        _ImAp.put(__requestID.id,__requestID);
        _ImAp.put(__requestRoot.id,__requestRoot);
        _ImAp.put(__responseCategory.id,__responseCategory);
        _ImAp.put(__responseText.id,__responseText);
        _ImAp.put(__responseType.id,__responseType);
        _ImAp.put(__sessionID.id,__sessionID);
        _ImAp.put(__userFQN.id,__userFQN);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__lastResponse.name,__lastResponse);
        _SmAp.put(__requestID.name,__requestID);
        _SmAp.put(__requestRoot.name,__requestRoot);
        _SmAp.put(__responseCategory.name,__responseCategory);
        _SmAp.put(__responseText.name,__responseText);
        _SmAp.put(__responseType.name,__responseType);
        _SmAp.put(__sessionID.name,__sessionID);
        _SmAp.put(__userFQN.name,__userFQN);
    }

    public LoginResponseDMO() {
        super("LoginResponse",_ImAp,_SmAp);
    }

    protected LoginResponseDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public LoginResponseDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public LoginResponseDMO(LoginResponseDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public LoginResponseDMO getOneOfMe() {
        LoginResponseDMO rc = new LoginResponseDMO(this.getConstructionClassName());
        return(rc);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:355)
    public String getSessionID(){
        DmcTypeString attr = (DmcTypeString) get(__sessionID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sessionID to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:373)
    public void setSessionID(String value) {
        DmcAttribute<?> attr = get(__sessionID);
        if (attr == null)
            attr = new DmcTypeString(__sessionID);
        
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
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:397)
    public void setSessionID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__sessionID);
        if (attr == null)
            attr = new DmcTypeString(__sessionID);
        
        attr.set(value);
        set(__sessionID,attr);
    }

    /**
     * Removes the sessionID attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:412)
    public void remSessionID(){
         rem(__sessionID);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:355)
    public String getRequestRoot(){
        DmcTypeString attr = (DmcTypeString) get(__requestRoot);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets requestRoot to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:373)
    public void setRequestRoot(String value) {
        DmcAttribute<?> attr = get(__requestRoot);
        if (attr == null)
            attr = new DmcTypeString(__requestRoot);
        
        try{
            attr.set(value);
            set(__requestRoot,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets requestRoot to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:397)
    public void setRequestRoot(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__requestRoot);
        if (attr == null)
            attr = new DmcTypeString(__requestRoot);
        
        attr.set(value);
        set(__requestRoot,attr);
    }

    /**
     * Removes the requestRoot attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:412)
    public void remRequestRoot(){
         rem(__requestRoot);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:355)
    public String getUserFQN(){
        DmcTypeString attr = (DmcTypeString) get(__userFQN);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets userFQN to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:373)
    public void setUserFQN(String value) {
        DmcAttribute<?> attr = get(__userFQN);
        if (attr == null)
            attr = new DmcTypeString(__userFQN);
        
        try{
            attr.set(value);
            set(__userFQN,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets userFQN to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:397)
    public void setUserFQN(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__userFQN);
        if (attr == null)
            attr = new DmcTypeString(__userFQN);
        
        attr.set(value);
        set(__userFQN,attr);
    }

    /**
     * Removes the userFQN attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:412)
    public void remUserFQN(){
         rem(__userFQN);
    }




}

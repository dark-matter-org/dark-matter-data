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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:368)
import java.io.Serializable;                                  // Always required - (GenUtility.java:197)
import java.util.*;                                           // Always required if we have any MV attributes - (GenUtility.java:193)
import org.dmd.dmc.DmcAttribute;                              // Any attributes - (GenUtility.java:213)
import org.dmd.dmc.DmcSliceInfo;                              // Required for object slicing - (GenUtility.java:202)
import org.dmd.dmc.DmcValueException;                         // Any attributes - (GenUtility.java:214)
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;          // Base class - (GenUtility.java:328)
import org.dmd.dms.generated.dmo.MetaDMSAG;                   // Required for MODREC constructor - (GenUtility.java:201)
import org.dmd.dms.generated.types.DmcTypeIntegerSV;          // Required type - (GenUtility.java:301)
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor - (GenUtility.java:200)
import org.dmd.dms.generated.types.DmcTypeStringSV;           // Required type - (GenUtility.java:301)

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The LoginResponse is returned after a Login request is received. If the
 * login is successful, a session ID will be assigned and a request root will
 * be given. All subsequent requests must contain the session ID and all
 * requests will be checked to ensure that they pertain to objects at or
 * below the request root. <p/> The response may also have an originatorID
 * that is a unique identifier assigned by the  server. In some systems, this
 * identifier will be stamped on all incoming requests and passed through to
 * the events that are generated as a result of those requests. In this way,
 * a client can tell whether the events it receives came from its own
 * requests or from requests made by other clients.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class LoginResponseDMO  extends ResponseDMO  implements Serializable  {

    public final static String constructionClassName = "LoginResponse";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public LoginResponseDMO() {
        super("LoginResponse");
    }

    protected LoginResponseDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public LoginResponseDMO getNew(){
        LoginResponseDMO rc = new LoginResponseDMO();
        return(rc);
    }

    @Override
    public LoginResponseDMO getSlice(DmcSliceInfo info){
        LoginResponseDMO rc = new LoginResponseDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public LoginResponseDMO(DmcTypeModifierMV mods) {
        super("LoginResponse");
        modrec(true);
        setModifier(mods);
    }

    public LoginResponseDMO getModificationRecorder(){
        LoginResponseDMO rc = new LoginResponseDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:748)
    public String getSessionID(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmpDMSAG.__sessionID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sessionID to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:788)
    public void setSessionID(String value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__sessionID);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__sessionID);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__sessionID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets sessionID to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:841)
    public void setSessionID(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmpDMSAG.__sessionID);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__sessionID);
        
        attr.set(value);
        set(DmpDMSAG.__sessionID,attr);
    }

    /**
     * Removes the sessionID attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:861)
    public void remSessionID(){
         rem(DmpDMSAG.__sessionID);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:748)
    public Integer getOriginatorID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(DmpDMSAG.__originatorID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets originatorID to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:788)
    public void setOriginatorID(Integer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__originatorID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmpDMSAG.__originatorID);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__originatorID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets originatorID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:841)
    public void setOriginatorID(Object value) throws DmcValueException {
        DmcTypeIntegerSV attr  = (DmcTypeIntegerSV) get(DmpDMSAG.__originatorID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmpDMSAG.__originatorID);
        
        attr.set(value);
        set(DmpDMSAG.__originatorID,attr);
    }

    /**
     * Removes the originatorID attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:861)
    public void remOriginatorID(){
         rem(DmpDMSAG.__originatorID);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:748)
    public String getRequestRoot(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmpDMSAG.__requestRoot);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets requestRoot to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:788)
    public void setRequestRoot(String value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__requestRoot);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__requestRoot);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__requestRoot,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets requestRoot to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:841)
    public void setRequestRoot(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmpDMSAG.__requestRoot);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__requestRoot);
        
        attr.set(value);
        set(DmpDMSAG.__requestRoot,attr);
    }

    /**
     * Removes the requestRoot attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:861)
    public void remRequestRoot(){
         rem(DmpDMSAG.__requestRoot);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:748)
    public String getUserFQN(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmpDMSAG.__userFQN);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets userFQN to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:788)
    public void setUserFQN(String value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__userFQN);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__userFQN);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__userFQN,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets userFQN to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:841)
    public void setUserFQN(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmpDMSAG.__userFQN);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__userFQN);
        
        attr.set(value);
        set(DmpDMSAG.__userFQN,attr);
    }

    /**
     * Removes the userFQN attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:861)
    public void remUserFQN(){
         rem(DmpDMSAG.__userFQN);
    }




}

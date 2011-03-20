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

// Generated from: org.dmd.dms.util.DmoFormatter.formatImports(DmoFormatter.java:707)
import java.util.*;                                         // Always required
import org.dmd.dmc.DmcAttribute;                            // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                        // Always required
import org.dmd.dmc.DmcValueException;                       // Any attributes
import org.dmd.dmc.types.DmcTypeString;                     // Required type
import org.dmd.dmp.shared.generated.dmo.RequestDMO;         // Base class
import org.dmd.dms.generated.enums.ValueTypeEnum;           // Always required

/**
 * The LoginRequest allows you to connect to connect to something and pass
 * along credentials.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:140)
 */
@SuppressWarnings("serial")
public class LoginRequestDMO  extends RequestDMO  {

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __password = new DmcAttributeInfo("password",401,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __readableFormat = new DmcAttributeInfo("readableFormat",517,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"IntegerName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __responseFormat = new DmcAttributeInfo("responseFormat",516,"ResponseFormatEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __sessionID = new DmcAttributeInfo("sessionID",502,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __userName = new DmcAttributeInfo("userName",400,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__password.id,__password);
        _ImAp.put(__readableFormat.id,__readableFormat);
        _ImAp.put(__requestID.id,__requestID);
        _ImAp.put(__responseFormat.id,__responseFormat);
        _ImAp.put(__sessionID.id,__sessionID);
        _ImAp.put(__userName.id,__userName);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__password.name,__password);
        _SmAp.put(__readableFormat.name,__readableFormat);
        _SmAp.put(__requestID.name,__requestID);
        _SmAp.put(__responseFormat.name,__responseFormat);
        _SmAp.put(__sessionID.name,__sessionID);
        _SmAp.put(__userName.name,__userName);
    }

    public LoginRequestDMO() {
        super("LoginRequest",_ImAp,_SmAp);
    }

    protected LoginRequestDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public LoginRequestDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public LoginRequestDMO(LoginRequestDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public LoginRequestDMO getOneOfMe() {
        LoginRequestDMO rc = new LoginRequestDMO(this.getConstructionClassName());
        return(rc);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:322)
    public String getUserName(){
        DmcTypeString attr = (DmcTypeString) get(__userName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets userName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:345)
    public void setUserName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__userName);
        if (attr == null)
            attr = new DmcTypeString(__userName);
        
        attr.set(value);
        set(__userName,attr);
    }

    /**
     * Removes the userName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:360)
    public void remUserName(){
         rem(__userName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:322)
    public String getPassword(){
        DmcTypeString attr = (DmcTypeString) get(__password);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets password to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:345)
    public void setPassword(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__password);
        if (attr == null)
            attr = new DmcTypeString(__password);
        
        attr.set(value);
        set(__password,attr);
    }

    /**
     * Removes the password attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:360)
    public void remPassword(){
         rem(__password);
    }




}
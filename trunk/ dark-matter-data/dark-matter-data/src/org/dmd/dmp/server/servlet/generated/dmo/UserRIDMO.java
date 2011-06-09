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
package org.dmd.dmp.server.servlet.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:282)
import java.io.Serializable;                                  // Always required
import java.util.*;                                           // Always required
import org.dmd.dmc.DmcAttribute;                              // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                          // Always required
import org.dmd.dmc.DmcNamedObjectIF;                          // Named object
import org.dmd.dmc.DmcObject;                                 // Structural class
import org.dmd.dmc.DmcSliceInfo;                              // Required for object slicing
import org.dmd.dmc.DmcValueException;                         // Any attributes
import org.dmd.dmc.types.DotName;                             // Naming attribute type
import org.dmd.dms.generated.enums.DataTypeEnum;              // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;             // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeDotNameSV;          // Required type
import org.dmd.dms.generated.types.DmcTypeIntegerSV;          // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringSV;           // Required type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The UserRI class provides a user representation for use with the 
 * Reference Implementation (RI).
 * <P>
 * Generated from the dmp.server schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:132)
 */
@SuppressWarnings("serial")
public class UserRIDMO  extends DmcObject  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "UserRI";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __dotName = new DmcAttributeInfo("dotName",107,"DotName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __idRI = new DmcAttributeInfo("idRI",705,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __password = new DmcAttributeInfo("password",401,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __userName = new DmcAttributeInfo("userName",400,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__dotName.id,__dotName);
        _ImAp.put(__idRI.id,__idRI);
        _ImAp.put(__password.id,__password);
        _ImAp.put(__userName.id,__userName);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__dotName.name,__dotName);
        _SmAp.put(__idRI.name,__idRI);
        _SmAp.put(__password.name,__password);
        _SmAp.put(__userName.name,__userName);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public UserRIDMO() {
        super("UserRI");
    }

    protected UserRIDMO(String oc) {
        super(oc);
    }

    @Override
    public boolean supportsBackrefTracking(){
        return(false);
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
    public UserRIDMO getNew(){
        UserRIDMO rc = new UserRIDMO();
        return(rc);
    }

    @Override
    public UserRIDMO getSlice(DmcSliceInfo info){
        UserRIDMO rc = new UserRIDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public UserRIDMO(DmcTypeModifierMV mods) {
        super("UserRI");
        modrec(true);
        setModifier(mods);
    }

    public UserRIDMO getModificationRecorder(){
        UserRIDMO rc = new UserRIDMO();
        rc.setDotName(getDotName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:733)
    public DotName getObjectName(){
        DmcAttribute<?> name = get(__dotName);
        if (name != null)
            return((DotName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__dotName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof UserRIDMO){
            return( getObjectName().equals( ((UserRIDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:584)
    public DotName getDotName(){
        DmcTypeDotNameSV attr = (DmcTypeDotNameSV) get(__dotName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dotName to the specified value.
     * @param value DotName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:621)
    public void setDotName(DotName value) {
        DmcAttribute<?> attr = get(__dotName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(__dotName);
        
        try{
            attr.set(value);
            set(__dotName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:669)
    public void setDotName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__dotName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(__dotName);
        
        attr.set(value);
        set(__dotName,attr);
    }

    /**
     * Removes the dotName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:684)
    public void remDotName(){
         rem(__dotName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:584)
    public Integer getIdRI(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(__idRI);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets idRI to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:621)
    public void setIdRI(Integer value) {
        DmcAttribute<?> attr = get(__idRI);
        if (attr == null)
            attr = new DmcTypeIntegerSV(__idRI);
        
        try{
            attr.set(value);
            set(__idRI,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets idRI to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:669)
    public void setIdRI(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__idRI);
        if (attr == null)
            attr = new DmcTypeIntegerSV(__idRI);
        
        attr.set(value);
        set(__idRI,attr);
    }

    /**
     * Removes the idRI attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:684)
    public void remIdRI(){
         rem(__idRI);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:584)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:621)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:669)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:684)
    public void remUserName(){
         rem(__userName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:584)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:621)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:669)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:684)
    public void remPassword(){
         rem(__password);
    }




}

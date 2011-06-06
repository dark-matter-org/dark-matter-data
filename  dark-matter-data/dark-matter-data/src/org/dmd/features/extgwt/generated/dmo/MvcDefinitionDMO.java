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
package org.dmd.features.extgwt.generated.dmo;

// Generated from:  org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:282)
import java.io.Serializable;                                                  // Always required
import java.util.*;                                                           // Always required
import org.dmd.dmc.DmcAttribute;                                              // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                          // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                          // Named object
import org.dmd.dmc.DmcObject;                                                 // Structural class
import org.dmd.dmc.DmcOmni;                                                   // Lazy resolution
import org.dmd.dmc.DmcValueException;                                         // Any attributes
import org.dmd.dmc.types.StringName;                                          // Naming attribute type
import org.dmd.dms.generated.enums.DataTypeEnum;                              // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;                             // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                          // Required type
import org.dmd.dms.generated.types.DmcTypeStringNameSV;                       // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                           // Required type
import org.dmd.features.extgwt.generated.dmo.MvcConfigDMO;                    // Type specific set/add
import org.dmd.features.extgwt.generated.types.DmcTypeMvcConfigREFSV;         // Reference type
import org.dmd.features.extgwt.generated.types.MvcConfigREF;                  // Helper class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The MvcDefinition class provide a common base for all MVC definition
 * classes.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:132)
 */
@SuppressWarnings("serial")
abstract public class MvcDefinitionDMO  extends DmcObject  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "MvcDefinition";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __definedInMVCConfig = new DmcAttributeInfo("definedInMVCConfig",616,"MvcConfig",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__definedInMVCConfig.id,__definedInMVCConfig);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__name.id,__name);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__definedInMVCConfig.name,__definedInMVCConfig);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__name.name,__name);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public MvcDefinitionDMO() {
        super("MvcDefinition");
    }

    protected MvcDefinitionDMO(String oc) {
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

    //  org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:733)
    public StringName getObjectName(){
        DmcAttribute<?> name = get(__name);
        if (name != null)
            return((StringName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__name);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcDefinitionDMO){
            return( getObjectName().equals( ((MvcDefinitionDMO) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:584)
    public String getFile(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__file);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets file to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:621)
    public void setFile(String value) {
        DmcAttribute<?> attr = get(__file);
        if (attr == null)
            attr = new DmcTypeStringSV(__file);
        
        try{
            attr.set(value);
            set(__file,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:669)
    public void setFile(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__file);
        if (attr == null)
            attr = new DmcTypeStringSV(__file);
        
        attr.set(value);
        set(__file,attr);
    }

    /**
     * Removes the file attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:684)
    public void remFile(){
         rem(__file);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:584)
    public Integer getLineNumber(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(__lineNumber);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value Integer
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:621)
    public void setLineNumber(Integer value) {
        DmcAttribute<?> attr = get(__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(__lineNumber);
        
        try{
            attr.set(value);
            set(__lineNumber,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:669)
    public void setLineNumber(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(__lineNumber);
        
        attr.set(value);
        set(__lineNumber,attr);
    }

    /**
     * Removes the lineNumber attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:684)
    public void remLineNumber(){
         rem(__lineNumber);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:584)
    public String getDescription(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:621)
    public void setDescription(String value) {
        DmcAttribute<?> attr = get(__description);
        if (attr == null)
            attr = new DmcTypeStringSV(__description);
        
        try{
            attr.set(value);
            set(__description,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:669)
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__description);
        if (attr == null)
            attr = new DmcTypeStringSV(__description);
        
        attr.set(value);
        set(__description,attr);
    }

    /**
     * Removes the description attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:684)
    public void remDescription(){
         rem(__description);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:584)
    public StringName getName(){
        DmcTypeStringNameSV attr = (DmcTypeStringNameSV) get(__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:621)
    public void setName(StringName value) {
        DmcAttribute<?> attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__name);
        
        try{
            attr.set(value);
            set(__name,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:669)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__name);
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:684)
    public void remName(){
         rem(__name);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:514)
    public MvcConfigREF getDefinedInMVCConfig(){
        DmcTypeMvcConfigREFSV attr = (DmcTypeMvcConfigREFSV) get(__definedInMVCConfig);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getSV());
    }

    /**
     * Returns the reference to MvcConfig without attempting lazy resolution (if turned on).
     */
    public MvcConfigREF getDefinedInMVCConfigREF(){
        DmcTypeMvcConfigREFSV attr = (DmcTypeMvcConfigREFSV) get(__definedInMVCConfig);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets definedInMVCConfig to the specified value.
     * @param value MvcConfigDMO
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:567)
    public void setDefinedInMVCConfig(MvcConfigDMO value) {
        DmcAttribute<?> attr = get(__definedInMVCConfig);
        if (attr == null)
            attr = new DmcTypeMvcConfigREFSV(__definedInMVCConfig);
        
        try{
            attr.set(value);
            set(__definedInMVCConfig,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets definedInMVCConfig to the specified value.
     * @param value A value compatible with DmcTypeMvcConfigREFSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:669)
    public void setDefinedInMVCConfig(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__definedInMVCConfig);
        if (attr == null)
            attr = new DmcTypeMvcConfigREFSV(__definedInMVCConfig);
        
        attr.set(value);
        set(__definedInMVCConfig,attr);
    }

    /**
     * Removes the definedInMVCConfig attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:684)
    public void remDefinedInMVCConfig(){
         rem(__definedInMVCConfig);
    }




}

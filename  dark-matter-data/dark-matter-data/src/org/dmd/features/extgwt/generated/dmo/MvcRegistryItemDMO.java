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

// Generated from:  org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:273)
import java.io.Serializable;                                           // Always required
import java.util.*;                                                    // Always required
import org.dmd.dmc.DmcAttribute;                                       // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                   // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                   // Named object
import org.dmd.dmc.DmcValueException;                                  // Any attributes
import org.dmd.dmc.types.StringName;                                   // Naming attribute type
import org.dmd.dms.generated.enums.ValueTypeEnum;                      // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeModifierMV;                  // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringNameSV;                // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                    // Required type
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;         // Base class

/**
 * The MvcRegistryItem defines something that's stored in the Registry.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:127)
 */
@SuppressWarnings("serial")
public class MvcRegistryItemDMO  extends MvcDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "MvcRegistryItem";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __definedInMVCConfig = new DmcAttributeInfo("definedInMVCConfig",616,"MvcConfig",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __userDataCollection = new DmcAttributeInfo("userDataCollection",620,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __userDataGenericSpec = new DmcAttributeInfo("userDataGenericSpec",621,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __userDataType = new DmcAttributeInfo("userDataType",608,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__definedInMVCConfig.id,__definedInMVCConfig);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__name.id,__name);
        _ImAp.put(__userDataCollection.id,__userDataCollection);
        _ImAp.put(__userDataGenericSpec.id,__userDataGenericSpec);
        _ImAp.put(__userDataType.id,__userDataType);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__definedInMVCConfig.name,__definedInMVCConfig);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__name.name,__name);
        _SmAp.put(__userDataCollection.name,__userDataCollection);
        _SmAp.put(__userDataGenericSpec.name,__userDataGenericSpec);
        _SmAp.put(__userDataType.name,__userDataType);
    }

    public MvcRegistryItemDMO() {
        super("MvcRegistryItem");
    }

    protected MvcRegistryItemDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public MvcRegistryItemDMO getNew(){
        MvcRegistryItemDMO rc = new MvcRegistryItemDMO();
        return(rc);
    }

    public MvcRegistryItemDMO(DmcTypeModifierMV mods) {
        super("MvcRegistryItem");
        modrec(true);
        setModifier(mods);
    }

    public MvcRegistryItemDMO getModificationRecorder(){
        MvcRegistryItemDMO rc = new MvcRegistryItemDMO(new DmcTypeModifierMV());
        rc.setName(getName());
        return(rc);
    }

    //  org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:667)
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
        if (obj instanceof MvcRegistryItemDMO){
            return( getObjectName().equals( ((MvcRegistryItemDMO) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:561)
    public String getUserDataCollection(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__userDataCollection);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets userDataCollection to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:598)
    public void setUserDataCollection(String value) {
        DmcAttribute<?> attr = get(__userDataCollection);
        if (attr == null)
            attr = new DmcTypeStringSV(__userDataCollection);
        
        try{
            attr.set(value);
            set(__userDataCollection,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets userDataCollection to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:625)
    public void setUserDataCollection(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__userDataCollection);
        if (attr == null)
            attr = new DmcTypeStringSV(__userDataCollection);
        
        attr.set(value);
        set(__userDataCollection,attr);
    }

    /**
     * Removes the userDataCollection attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:640)
    public void remUserDataCollection(){
         rem(__userDataCollection);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:561)
    public String getUserDataGenericSpec(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__userDataGenericSpec);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets userDataGenericSpec to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:598)
    public void setUserDataGenericSpec(String value) {
        DmcAttribute<?> attr = get(__userDataGenericSpec);
        if (attr == null)
            attr = new DmcTypeStringSV(__userDataGenericSpec);
        
        try{
            attr.set(value);
            set(__userDataGenericSpec,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets userDataGenericSpec to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:625)
    public void setUserDataGenericSpec(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__userDataGenericSpec);
        if (attr == null)
            attr = new DmcTypeStringSV(__userDataGenericSpec);
        
        attr.set(value);
        set(__userDataGenericSpec,attr);
    }

    /**
     * Removes the userDataGenericSpec attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:640)
    public void remUserDataGenericSpec(){
         rem(__userDataGenericSpec);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:561)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:598)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:625)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:640)
    public void remDescription(){
         rem(__description);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:561)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:598)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:625)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:640)
    public void remName(){
         rem(__name);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:561)
    public String getUserDataType(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__userDataType);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets userDataType to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:598)
    public void setUserDataType(String value) {
        DmcAttribute<?> attr = get(__userDataType);
        if (attr == null)
            attr = new DmcTypeStringSV(__userDataType);
        
        try{
            attr.set(value);
            set(__userDataType,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets userDataType to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:625)
    public void setUserDataType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__userDataType);
        if (attr == null)
            attr = new DmcTypeStringSV(__userDataType);
        
        attr.set(value);
        set(__userDataType,attr);
    }

    /**
     * Removes the userDataType attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:640)
    public void remUserDataType(){
         rem(__userDataType);
    }




}

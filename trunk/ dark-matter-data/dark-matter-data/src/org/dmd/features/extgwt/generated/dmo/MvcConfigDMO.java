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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:273)
import java.io.Serializable;                                                  // Always required
import java.util.*;                                                           // Always required
import org.dmd.dmc.DmcAttribute;                                              // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                          // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                          // Named object
import org.dmd.dmc.DmcOmni;                                                   // Lazy resolution
import org.dmd.dmc.DmcValueException;                                         // Any attributes
import org.dmd.dmc.types.StringName;                                          // Naming attribute type
import org.dmd.dms.generated.enums.ValueTypeEnum;                             // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeModifierMV;                         // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringMV;                           // Required type
import org.dmd.dms.generated.types.DmcTypeStringNameSV;                       // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                           // Required type
import org.dmd.features.extgwt.generated.dmo.MvcConfigDMO;                    // Type specific set/add
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;                // Base class
import org.dmd.features.extgwt.generated.types.DmcTypeMvcConfigREFMV;         // Reference type
import org.dmd.features.extgwt.generated.types.MvcConfigREF;                  // Helper class

/**
 * The MvcConfig class is stored in a file with a .mvc suffix and used to
 * define the set of files that hold the definitions of MvcEvents,
 * MvcControllers and MvcViews. Based on the definition of these objects, we
 * can generate base classes for the com.extjs.gxt.ui.client.mvc.Controller
 * and com.extjs.gxt.ui.client.mvc.View that provide some common code
 * required by these classes.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:127)
 */
@SuppressWarnings("serial")
public class MvcConfigDMO  extends MvcDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "MvcConfig";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __definedInMVCConfig = new DmcAttributeInfo("definedInMVCConfig",616,"MvcConfig",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __dependsOn = new DmcAttributeInfo("dependsOn",66,"String",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __dependsOnMVC = new DmcAttributeInfo("dependsOnMVC",600,"MvcConfig",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __genPackage = new DmcAttributeInfo("genPackage",203,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__definedInMVCConfig.id,__definedInMVCConfig);
        _ImAp.put(__dependsOn.id,__dependsOn);
        _ImAp.put(__dependsOnMVC.id,__dependsOnMVC);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__genPackage.id,__genPackage);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__name.id,__name);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__definedInMVCConfig.name,__definedInMVCConfig);
        _SmAp.put(__dependsOn.name,__dependsOn);
        _SmAp.put(__dependsOnMVC.name,__dependsOnMVC);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__genPackage.name,__genPackage);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__name.name,__name);
    }

    public MvcConfigDMO() {
        super("MvcConfig");
    }

    protected MvcConfigDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public MvcConfigDMO getNew(){
        MvcConfigDMO rc = new MvcConfigDMO();
        return(rc);
    }

    public MvcConfigDMO(DmcTypeModifierMV mods) {
        super("MvcConfig");
        modrec(true);
        setModifier(mods);
    }

    public MvcConfigDMO getModificationRecorder(){
        MvcConfigDMO rc = new MvcConfigDMO(new DmcTypeModifierMV());
        rc.setName(getName());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:667)
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
        if (obj instanceof MvcConfigDMO){
            return( getObjectName().equals( ((MvcConfigDMO) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return An Iterator of MvcConfigDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:702)
    public Iterator<MvcConfigREF> getDependsOnMVC(){
        DmcTypeMvcConfigREFMV attr = (DmcTypeMvcConfigREFMV) get(__dependsOnMVC);
        if (attr == null)
            return( ((List<MvcConfigREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<MvcConfigREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * Adds another dependsOnMVC to the specified value.
     * @param value MvcConfig
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:723)
    public DmcAttribute<?> addDependsOnMVC(MvcConfigDMO value) {
        DmcAttribute<?> attr = get(__dependsOnMVC);
        if (attr == null)
            attr = new DmcTypeMvcConfigREFMV(__dependsOnMVC);
        
        try{
            setLastValue(attr.add(value));
            add(__dependsOnMVC,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another dependsOnMVC value.
     * @param value A value compatible with MvcConfig
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:793)
    public DmcAttribute<?> addDependsOnMVC(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__dependsOnMVC);
        if (attr == null)
            attr = new DmcTypeMvcConfigREFMV(__dependsOnMVC);
        
        setLastValue(attr.add(value));
        add(__dependsOnMVC,attr);
        return(attr);
    }

    /**
     * Returns the number of values in dependsOnMVC
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:810)
    public int getDependsOnMVCSize(){
        DmcAttribute<?> attr = get(__dependsOnMVC);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a dependsOnMVC value.
     * @param value The MvcConfig to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:840)
    public DmcAttribute<?> delDependsOnMVC(Object value) throws DmcValueException {
        DmcAttribute<?> attr = del(__dependsOnMVC, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the dependsOnMVC attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:870)
    public void remDependsOnMVC(){
         rem(__dependsOnMVC);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:745)
    public Iterator<String> getDependsOn(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(__dependsOn);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * Adds another dependsOn to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:758)
    public DmcAttribute<?> addDependsOn(String value) {
        DmcAttribute<?> attr = get(__dependsOn);
        if (attr == null)
            attr = new DmcTypeStringMV(__dependsOn);
        
        try{
            setLastValue(attr.add(value));
            add(__dependsOn,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:778)
    public boolean dependsOnContains(String value) {
        DmcAttribute<?> attr = get(__dependsOn);
        return(attr.contains(value));
    }

    /**
     * Adds another dependsOn value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:793)
    public DmcAttribute<?> addDependsOn(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__dependsOn);
        if (attr == null)
            attr = new DmcTypeStringMV(__dependsOn);
        
        setLastValue(attr.add(value));
        add(__dependsOn,attr);
        return(attr);
    }

    /**
     * Returns the number of values in dependsOn
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:810)
    public int getDependsOnSize(){
        DmcAttribute<?> attr = get(__dependsOn);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a dependsOn value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:852)
    public DmcAttribute<?> delDependsOn(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__dependsOn);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(__dependsOn), value);
        else
            attr = del(__dependsOn, value);
        
        return(attr);
    }

    /**
     * Removes the dependsOn attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:870)
    public void remDependsOn(){
         rem(__dependsOn);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:561)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:598)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:625)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:640)
    public void remName(){
         rem(__name);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:561)
    public String getGenPackage(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__genPackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets genPackage to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:598)
    public void setGenPackage(String value) {
        DmcAttribute<?> attr = get(__genPackage);
        if (attr == null)
            attr = new DmcTypeStringSV(__genPackage);
        
        try{
            attr.set(value);
            set(__genPackage,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets genPackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:625)
    public void setGenPackage(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__genPackage);
        if (attr == null)
            attr = new DmcTypeStringSV(__genPackage);
        
        attr.set(value);
        set(__genPackage,attr);
    }

    /**
     * Removes the genPackage attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:640)
    public void remGenPackage(){
         rem(__genPackage);
    }




}

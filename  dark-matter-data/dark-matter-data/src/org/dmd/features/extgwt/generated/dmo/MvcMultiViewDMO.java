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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:281)
import java.io.Serializable;                                     // Always required
import java.util.*;                                              // Always required
import org.dmd.dmc.DmcAttribute;                                 // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                             // Always required
import org.dmd.dmc.DmcNamedObjectIF;                             // Named object
import org.dmd.dmc.DmcSliceInfo;                                 // Required for object slicing
import org.dmd.dmc.DmcValueException;                            // Any attributes
import org.dmd.dmc.types.StringName;                             // Naming attribute type
import org.dmd.dms.generated.enums.DataTypeEnum;                 // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;                // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeModifierMV;            // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringNameSV;          // Required type
import org.dmd.features.extgwt.generated.dmo.MvcViewDMO;         // Base class

/**
 * The MvcMultiView provides the same functionality as an MvcView, but is
 * intended to allow for the concept of a controller controlling several
 * views of the same type. For instance, if you several views of different
 * objects, you would want to be able have a different instance of the view
 * for each object.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:128)
 */
@SuppressWarnings("serial")
public class MvcMultiViewDMO  extends MvcViewDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "MvcMultiView";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __createsRegistryItem = new DmcAttributeInfo("createsRegistryItem",611,"MvcRegistryItem",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __definedInMVCConfig = new DmcAttributeInfo("definedInMVCConfig",616,"MvcConfig",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __dispatchesEvent = new DmcAttributeInfo("dispatchesEvent",603,"MvcEvent",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __firesEvent = new DmcAttributeInfo("firesEvent",619,"MvcEvent",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __handlesEvent = new DmcAttributeInfo("handlesEvent",602,"MvcEvent",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __handlesServerEvent = new DmcAttributeInfo("handlesServerEvent",610,"MvcServerEvent",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __usesRegistryItem = new DmcAttributeInfo("usesRegistryItem",612,"MvcRegistryItem",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__createsRegistryItem.id,__createsRegistryItem);
        _ImAp.put(__definedInMVCConfig.id,__definedInMVCConfig);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__dispatchesEvent.id,__dispatchesEvent);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__firesEvent.id,__firesEvent);
        _ImAp.put(__handlesEvent.id,__handlesEvent);
        _ImAp.put(__handlesServerEvent.id,__handlesServerEvent);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__name.id,__name);
        _ImAp.put(__usesRegistryItem.id,__usesRegistryItem);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__createsRegistryItem.name,__createsRegistryItem);
        _SmAp.put(__definedInMVCConfig.name,__definedInMVCConfig);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__dispatchesEvent.name,__dispatchesEvent);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__firesEvent.name,__firesEvent);
        _SmAp.put(__handlesEvent.name,__handlesEvent);
        _SmAp.put(__handlesServerEvent.name,__handlesServerEvent);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__name.name,__name);
        _SmAp.put(__usesRegistryItem.name,__usesRegistryItem);
    }

    public MvcMultiViewDMO() {
        super("MvcMultiView");
    }

    protected MvcMultiViewDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public MvcMultiViewDMO getNew(){
        MvcMultiViewDMO rc = new MvcMultiViewDMO();
        return(rc);
    }

    @Override
    public MvcMultiViewDMO getSlice(DmcSliceInfo info){
        MvcMultiViewDMO rc = new MvcMultiViewDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public MvcMultiViewDMO(DmcTypeModifierMV mods) {
        super("MvcMultiView");
        modrec(true);
        setModifier(mods);
    }

    public MvcMultiViewDMO getModificationRecorder(){
        MvcMultiViewDMO rc = new MvcMultiViewDMO(new DmcTypeModifierMV());
        rc.setName(getName());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:679)
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
        if (obj instanceof MvcMultiViewDMO){
            return( getObjectName().equals( ((MvcMultiViewDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remName(){
         rem(__name);
    }




}

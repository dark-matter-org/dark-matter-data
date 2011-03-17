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

// Generated from: org.dmd.dms.util.DmoFormatter.formatImports(DmoFormatter.java:707)
import java.util.*;                                              // Always required
import org.dmd.dmc.DmcAttribute;                                 // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                             // Always required
import org.dmd.dmc.DmcNamedObjectIF;                             // Named object
import org.dmd.dmc.DmcValueException;                            // Any attributes
import org.dmd.dmc.types.DmcTypeStringName;                      // Required type
import org.dmd.dmc.types.StringName;                             // Naming attribute type
import org.dmd.dms.generated.enums.ValueTypeEnum;                // Always required
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
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:140)
 */
@SuppressWarnings("serial")
public class MvcMultiViewDMO  extends MvcViewDMO  implements DmcNamedObjectIF  {

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __createsRegistryItem = new DmcAttributeInfo("createsRegistryItem",611,"MvcRegistryItem",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __definedInMVCConfig = new DmcAttributeInfo("definedInMVCConfig",616,"MvcConfig",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __dispatchesEvent = new DmcAttributeInfo("dispatchesEvent",603,"MvcEvent",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __firesEvent = new DmcAttributeInfo("firesEvent",619,"MvcEvent",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __handlesEvent = new DmcAttributeInfo("handlesEvent",602,"MvcEvent",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __handlesServerEvent = new DmcAttributeInfo("handlesServerEvent",610,"MvcServerEvent",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __usesRegistryItem = new DmcAttributeInfo("usesRegistryItem",612,"MvcRegistryItem",ValueTypeEnum.MULTI,false);

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
        super("MvcMultiView",_ImAp,_SmAp);
    }

    protected MvcMultiViewDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public MvcMultiViewDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public MvcMultiViewDMO(MvcMultiViewDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public MvcMultiViewDMO getOneOfMe() {
        MvcMultiViewDMO rc = new MvcMultiViewDMO(this.getConstructionClassName());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:783)
    public StringName getObjectName(){
        DmcAttribute<?> name = get(__name);
        if (name != null)
            return((StringName)name.getSV());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcMultiViewDMO){
            return( getObjectName().equals( ((MvcMultiViewDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:322)
    public StringName getName(){
        DmcTypeStringName attr = (DmcTypeStringName) get(__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:345)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringName(__name);
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:360)
    public void remName(){
         rem(__name);
    }




}
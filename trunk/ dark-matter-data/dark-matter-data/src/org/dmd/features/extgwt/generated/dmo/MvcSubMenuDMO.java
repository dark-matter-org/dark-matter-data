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

// Generated from: org.dmd.dms.util.DmoFormatter.formatImports(DmoFormatter.java:690)
import java.util.*;                                                       // Always required
import org.dmd.dmc.DmcAttribute;                                          // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                      // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                      // Named object
import org.dmd.dmc.DmcValueException;                                     // Any attributes
import org.dmd.dmc.types.DmcTypeInteger;                                  // Required type
import org.dmd.dmc.types.DmcTypeString;                                   // Required type
import org.dmd.dmc.types.DmcTypeStringName;                               // Required type
import org.dmd.dmc.types.StringName;                                      // Naming attribute type
import org.dmd.dms.generated.enums.ValueTypeEnum;                         // Always required
import org.dmd.features.extgwt.generated.dmo.MvcMenuDMO;                  // Base class
import org.dmd.features.extgwt.generated.types.DmcTypeMvcMenuREF;         // Reference type
import org.dmd.features.extgwt.generated.types.MvcMenuREF;                // Helper class

@SuppressWarnings("serial")
/**
 * null
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:137)
 */
public class MvcSubMenuDMO  extends MvcMenuDMO  implements DmcNamedObjectIF  {

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __addToMenu = new DmcAttributeInfo("addToMenu",623,"MvcMenu",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __associatedController = new DmcAttributeInfo("associatedController",631,"MvcController",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __customRender = new DmcAttributeInfo("customRender",634,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __definedInMVCConfig = new DmcAttributeInfo("definedInMVCConfig",616,"MvcConfig",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __displayLabel = new DmcAttributeInfo("displayLabel",633,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __menuOrder = new DmcAttributeInfo("menuOrder",625,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__addToMenu.id,__addToMenu);
        _ImAp.put(__associatedController.id,__associatedController);
        _ImAp.put(__customRender.id,__customRender);
        _ImAp.put(__definedInMVCConfig.id,__definedInMVCConfig);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__displayLabel.id,__displayLabel);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__menuOrder.id,__menuOrder);
        _ImAp.put(__name.id,__name);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__addToMenu.name,__addToMenu);
        _SmAp.put(__associatedController.name,__associatedController);
        _SmAp.put(__customRender.name,__customRender);
        _SmAp.put(__definedInMVCConfig.name,__definedInMVCConfig);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__displayLabel.name,__displayLabel);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__menuOrder.name,__menuOrder);
        _SmAp.put(__name.name,__name);
    }

    public MvcSubMenuDMO() {
        super("MvcSubMenu",_ImAp,_SmAp);
    }

    protected MvcSubMenuDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public MvcSubMenuDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public MvcSubMenuDMO(MvcSubMenuDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public MvcSubMenuDMO getOneOfMe() {
        MvcSubMenuDMO rc = new MvcSubMenuDMO(this.getConstructionClassName());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:767)
    public StringName getObjectName(){
        DmcAttribute<?> name = get(__name);
        if (name != null)
            return((StringName)name.getSV());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcSubMenuDMO){
            return( getObjectName().equals( ((MvcSubMenuDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:322)
    public String getDisplayLabel(){
        DmcTypeString attr = (DmcTypeString) get(__displayLabel);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets displayLabel to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:345)
    public void setDisplayLabel(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__displayLabel);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__displayLabel,attr);
    }

    /**
     * Removes the displayLabel attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:360)
    public void remDisplayLabel(){
         rem(__displayLabel);
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
            attr = new DmcTypeStringName();
        
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

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:301)
    public MvcMenuREF getAddToMenu(){
        DmcTypeMvcMenuREF attr = (DmcTypeMvcMenuREF) get(__addToMenu);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets addToMenu to the specified value.
     * @param value A value compatible with DmcTypeMvcMenuREF
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:345)
    public void setAddToMenu(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__addToMenu);
        if (attr == null)
            attr = new DmcTypeMvcMenuREF();
        
        attr.set(value);
        set(__addToMenu,attr);
    }

    /**
     * Removes the addToMenu attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:360)
    public void remAddToMenu(){
         rem(__addToMenu);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:322)
    public Integer getMenuOrder(){
        DmcTypeInteger attr = (DmcTypeInteger) get(__menuOrder);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:345)
    public void setMenuOrder(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__menuOrder);
        if (attr == null)
            attr = new DmcTypeInteger();
        
        attr.set(value);
        set(__menuOrder,attr);
    }

    /**
     * Removes the menuOrder attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:360)
    public void remMenuOrder(){
         rem(__menuOrder);
    }




}

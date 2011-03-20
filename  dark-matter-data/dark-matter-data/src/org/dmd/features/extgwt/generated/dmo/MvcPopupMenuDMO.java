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
import org.dmd.dmc.types.DmcTypeString;                          // Required type
import org.dmd.dmc.types.DmcTypeStringName;                      // Required type
import org.dmd.dmc.types.StringName;                             // Naming attribute type
import org.dmd.dms.generated.enums.ValueTypeEnum;                // Always required
import org.dmd.features.extgwt.generated.dmo.MvcMenuDMO;         // Base class

/**
 * The MvcPopupMenu class is meant to allow for the definition of menus that
 * can be popped up on a variety components, for instance tree nodes and
 * table rows. Although implemented as standard
 * com.extjs.gxt.ui.client.widget.menu.Menu instances, the display of popup
 * menus is controlled by the MenuController infrastructure.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:140)
 */
@SuppressWarnings("serial")
public class MvcPopupMenuDMO  extends MvcMenuDMO  implements DmcNamedObjectIF  {

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __associatedController = new DmcAttributeInfo("associatedController",631,"MvcController",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __customRender = new DmcAttributeInfo("customRender",634,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __definedInMVCConfig = new DmcAttributeInfo("definedInMVCConfig",616,"MvcConfig",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __useForModelClass = new DmcAttributeInfo("useForModelClass",632,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__associatedController.id,__associatedController);
        _ImAp.put(__customRender.id,__customRender);
        _ImAp.put(__definedInMVCConfig.id,__definedInMVCConfig);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__name.id,__name);
        _ImAp.put(__useForModelClass.id,__useForModelClass);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__associatedController.name,__associatedController);
        _SmAp.put(__customRender.name,__customRender);
        _SmAp.put(__definedInMVCConfig.name,__definedInMVCConfig);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__name.name,__name);
        _SmAp.put(__useForModelClass.name,__useForModelClass);
    }

    public MvcPopupMenuDMO() {
        super("MvcPopupMenu",_ImAp,_SmAp);
    }

    protected MvcPopupMenuDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public MvcPopupMenuDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public MvcPopupMenuDMO(MvcPopupMenuDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public MvcPopupMenuDMO getOneOfMe() {
        MvcPopupMenuDMO rc = new MvcPopupMenuDMO(this.getConstructionClassName());
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
        if (obj instanceof MvcPopupMenuDMO){
            return( getObjectName().equals( ((MvcPopupMenuDMO) obj).getObjectName()) );
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

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:322)
    public String getUseForModelClass(){
        DmcTypeString attr = (DmcTypeString) get(__useForModelClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets useForModelClass to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:345)
    public void setUseForModelClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__useForModelClass);
        if (attr == null)
            attr = new DmcTypeString(__useForModelClass);
        
        attr.set(value);
        set(__useForModelClass,attr);
    }

    /**
     * Removes the useForModelClass attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:360)
    public void remUseForModelClass(){
         rem(__useForModelClass);
    }




}
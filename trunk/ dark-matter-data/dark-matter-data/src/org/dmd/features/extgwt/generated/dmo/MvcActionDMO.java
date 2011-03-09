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

import java.util.*;

import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dms.generated.enums.ModifyTypeEnum;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dmc.types.Modification;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
// import 3.1 MvcController
import org.dmd.features.extgwt.generated.types.DmcTypeMvcControllerREF;
import org.dmd.features.extgwt.generated.types.MvcControllerREF;
// import 4
import org.dmd.features.extgwt.generated.types.MvcControllerREF;
// import 3.1 MvcEvent
import org.dmd.features.extgwt.generated.types.DmcTypeMvcEventREF;
import org.dmd.features.extgwt.generated.types.MvcEventREF;
// import 4
import org.dmd.features.extgwt.generated.types.MvcEventREF;
// import 2
import org.dmd.dmc.types.StringName;
// import 3.2 StringName
import org.dmd.dmc.types.DmcTypeStringName;

// import 6
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;
// import 7
import org.dmd.dmc.DmcNamedObjectIF;

@SuppressWarnings("serial")
/**
 * The MvcAction class allows for the definition of behaviour that can be
 * associated with menus, buttons and other UI components. Actions are
 * associated with controllers so that they can be informed of events in
 * which they're interested, since only controllers can register for events.
 * Actions may be defined and used by  menu items defined in other
 * Controllers.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:654)
 */
public class MvcActionDMO  extends MvcDefinitionDMO  implements DmcNamedObjectIF  {

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __associatedController = new DmcAttributeInfo("associatedController",631,"MvcController",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __definedInMVCConfig = new DmcAttributeInfo("definedInMVCConfig",616,"MvcConfig",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __handlesEvent = new DmcAttributeInfo("handlesEvent",602,"MvcEvent",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__associatedController.id,__associatedController);
        _ImAp.put(__definedInMVCConfig.id,__definedInMVCConfig);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__handlesEvent.id,__handlesEvent);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__name.id,__name);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__associatedController.name,__associatedController);
        _SmAp.put(__definedInMVCConfig.name,__definedInMVCConfig);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__handlesEvent.name,__handlesEvent);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__name.name,__name);
    }

    public MvcActionDMO() {
        super("MvcAction",_ImAp,_SmAp);
    }

    protected MvcActionDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public MvcActionDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public MvcActionDMO(MvcActionDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public MvcActionDMO getOneOfMe() {
        MvcActionDMO rc = new MvcActionDMO(this.getConstructionClassName());
        return(rc);
    }

    @SuppressWarnings("unchecked")
    public StringName getObjectName(){
        DmcAttribute name = get(__name);
        if (name != null)
            return((StringName)name.getSV());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcActionDMO){
            return( getObjectName().equals( ((MvcActionDMO) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    public Iterator<MvcEventREF> getHandlesEvent(){
        DmcTypeMvcEventREF attr = (DmcTypeMvcEventREF) get(__handlesEvent);
        if (attr == null)
            return(Collections.<MvcEventREF> emptyList().iterator());

        return(attr.getMV());
    }

    /**
     * Adds another handlesEvent value.
     * @param value A value compatible with MvcEvent
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addHandlesEvent(Object value) throws DmcValueException {
        DmcAttribute attr = get(__handlesEvent);
        if (attr == null)
            attr = new DmcTypeMvcEventREF();
        
        attr.add(value);
        add(__handlesEvent,attr);
        return(attr);
    }

    /**
     * Deletes a handlesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delHandlesEvent(Object value) throws DmcValueException {
        DmcAttribute attr = del(__handlesEvent, ((DmcNamedObjectIF)value).getObjectName());
        if (attr == null){
            DmcTypeModifier mods = getModifier();
            if (mods != null){
                attr = new DmcTypeMvcEventREF();
                attr.setName(__handlesEvent.name);
                attr.add(((DmcNamedObjectIF)value).getObjectName());
                mods.add(new Modification(ModifyTypeEnum.DEL, attr));
            }
        }
        return(attr);
    }

    /**
     * Removes the handlesEvent attribute value.
     */
    public void remHandlesEvent(){
         rem(__handlesEvent);
    }

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
    @SuppressWarnings("unchecked")
    public void setName(Object value) throws DmcValueException {
        DmcAttribute attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringName();
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    public void remName(){
         rem(__name);
    }

    public MvcControllerREF getAssociatedController(){
        DmcTypeMvcControllerREF attr = (DmcTypeMvcControllerREF) get(__associatedController);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets associatedController to the specified value.
     * @param value A value compatible with DmcTypeMvcControllerREF
     */
    @SuppressWarnings("unchecked")
    public void setAssociatedController(Object value) throws DmcValueException {
        DmcAttribute attr = get(__associatedController);
        if (attr == null)
            attr = new DmcTypeMvcControllerREF();
        
        attr.set(value);
        set(__associatedController,attr);
    }

    /**
     * Removes the associatedController attribute value.
     */
    public void remAssociatedController(){
         rem(__associatedController);
    }




}

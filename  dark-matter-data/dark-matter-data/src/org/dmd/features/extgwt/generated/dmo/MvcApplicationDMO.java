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
 * The MvcApplication class allows for the definition of an application that
 * makes uses of the ExtGWT MVC framework.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:654)
 */
public class MvcApplicationDMO  extends MvcDefinitionDMO  implements DmcNamedObjectIF  {

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __controllers = new DmcAttributeInfo("controllers",607,"MvcController",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __definedInMVCConfig = new DmcAttributeInfo("definedInMVCConfig",616,"MvcConfig",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __definesEvent = new DmcAttributeInfo("definesEvent",601,"MvcEvent",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __startEvents = new DmcAttributeInfo("startEvents",622,"MvcEvent",ValueTypeEnum.MULTI,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__controllers.id,__controllers);
        _ImAp.put(__definedInMVCConfig.id,__definedInMVCConfig);
        _ImAp.put(__definesEvent.id,__definesEvent);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__name.id,__name);
        _ImAp.put(__startEvents.id,__startEvents);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__controllers.name,__controllers);
        _SmAp.put(__definedInMVCConfig.name,__definedInMVCConfig);
        _SmAp.put(__definesEvent.name,__definesEvent);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__name.name,__name);
        _SmAp.put(__startEvents.name,__startEvents);
    }

    public MvcApplicationDMO() {
        super("MvcApplication",_ImAp,_SmAp);
    }

    protected MvcApplicationDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public MvcApplicationDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public MvcApplicationDMO(MvcApplicationDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public MvcApplicationDMO getOneOfMe() {
        MvcApplicationDMO rc = new MvcApplicationDMO(this.getConstructionClassName());
        return(rc);
    }

    @SuppressWarnings("unchecked")
    public String getObjectName(){
        DmcAttribute name = get(__name);
        if (name != null)
            return(name.getString());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcApplicationDMO){
            return( getObjectName().equals( ((MvcApplicationDMO) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    public Iterator<MvcEventREF> getDefinesEvent(){
        DmcTypeMvcEventREF attr = (DmcTypeMvcEventREF) get(__definesEvent);
        if (attr == null)
            return(Collections.<MvcEventREF> emptyList().iterator());

        return(attr.getMV());
    }

    /**
     * Adds another definesEvent value.
     * @param value A value compatible with MvcEvent
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addDefinesEvent(Object value) throws DmcValueException {
        DmcAttribute attr = get(__definesEvent);
        if (attr == null)
            attr = new DmcTypeMvcEventREF();
        
        attr.add(value);
        add(__definesEvent,attr);
        return(attr);
    }

    /**
     * Deletes a definesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delDefinesEvent(Object value) throws DmcValueException {
        DmcAttribute attr = del(__definesEvent, ((DmcNamedObjectIF)value).getObjectName());
        if (attr == null){
            DmcTypeModifier mods = getModifier();
            if (mods != null){
                attr = new DmcTypeMvcEventREF();
                attr.setName(__definesEvent.name);
                attr.add(((DmcNamedObjectIF)value).getObjectName());
                mods.add(new Modification(ModifyTypeEnum.DEL, attr));
            }
        }
        return(attr);
    }

    /**
     * Removes the definesEvent attribute value.
     */
    public void remDefinesEvent(){
         rem(__definesEvent);
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

    /**
     * @return An Iterator of MvcControllerDMO objects.
     */
    public Iterator<MvcControllerREF> getControllers(){
        DmcTypeMvcControllerREF attr = (DmcTypeMvcControllerREF) get(__controllers);
        if (attr == null)
            return(Collections.<MvcControllerREF> emptyList().iterator());

        return(attr.getMV());
    }

    /**
     * Adds another controllers value.
     * @param value A value compatible with MvcController
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addControllers(Object value) throws DmcValueException {
        DmcAttribute attr = get(__controllers);
        if (attr == null)
            attr = new DmcTypeMvcControllerREF();
        
        attr.add(value);
        add(__controllers,attr);
        return(attr);
    }

    /**
     * Deletes a controllers value.
     * @param value The MvcController to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delControllers(Object value) throws DmcValueException {
        DmcAttribute attr = del(__controllers, ((DmcNamedObjectIF)value).getObjectName());
        if (attr == null){
            DmcTypeModifier mods = getModifier();
            if (mods != null){
                attr = new DmcTypeMvcControllerREF();
                attr.setName(__controllers.name);
                attr.add(((DmcNamedObjectIF)value).getObjectName());
                mods.add(new Modification(ModifyTypeEnum.DEL, attr));
            }
        }
        return(attr);
    }

    /**
     * Removes the controllers attribute value.
     */
    public void remControllers(){
         rem(__controllers);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    public Iterator<MvcEventREF> getStartEvents(){
        DmcTypeMvcEventREF attr = (DmcTypeMvcEventREF) get(__startEvents);
        if (attr == null)
            return(Collections.<MvcEventREF> emptyList().iterator());

        return(attr.getMV());
    }

    /**
     * Adds another startEvents value.
     * @param value A value compatible with MvcEvent
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addStartEvents(Object value) throws DmcValueException {
        DmcAttribute attr = get(__startEvents);
        if (attr == null)
            attr = new DmcTypeMvcEventREF();
        
        attr.add(value);
        add(__startEvents,attr);
        return(attr);
    }

    /**
     * Deletes a startEvents value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delStartEvents(Object value) throws DmcValueException {
        DmcAttribute attr = del(__startEvents, ((DmcNamedObjectIF)value).getObjectName());
        if (attr == null){
            DmcTypeModifier mods = getModifier();
            if (mods != null){
                attr = new DmcTypeMvcEventREF();
                attr.setName(__startEvents.name);
                attr.add(((DmcNamedObjectIF)value).getObjectName());
                mods.add(new Modification(ModifyTypeEnum.DEL, attr));
            }
        }
        return(attr);
    }

    /**
     * Removes the startEvents attribute value.
     */
    public void remStartEvents(){
         rem(__startEvents);
    }




}

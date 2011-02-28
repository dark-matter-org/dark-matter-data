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

import org.dmd.dms.generated.enums.ModifyTypeEnum;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dmc.types.Modification;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
// import 3 MvcController
import org.dmd.features.extgwt.generated.types.DmcTypeMvcControllerREF;
import org.dmd.features.extgwt.generated.types.MvcControllerREF;
// import 4
import org.dmd.features.extgwt.generated.types.MvcControllerREF;
// import 3 MvcEvent
import org.dmd.features.extgwt.generated.types.DmcTypeMvcEventREF;
import org.dmd.features.extgwt.generated.types.MvcEventREF;
// import 4
import org.dmd.features.extgwt.generated.types.MvcEventREF;
// import 3 String
import org.dmd.dmc.types.DmcTypeString;

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
 * Generated from:  org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:537)
 */
public class MvcApplicationDMO  extends MvcDefinitionDMO  implements DmcNamedObjectIF  {

    public final static String _definesEvent = "definesEvent";
    public final static String _name = "name";
    public final static String _controllers = "controllers";
    public final static String _startEvents = "startEvents";

    public MvcApplicationDMO() {
        super("MvcApplication");
    }

    protected MvcApplicationDMO(String oc) {
        super(oc);
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
        DmcAttribute name = get(_name);
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
        DmcTypeMvcEventREF attr = (DmcTypeMvcEventREF) get(_definesEvent);
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
        DmcAttribute attr = get(_definesEvent);
        if (attr == null)
            attr = new DmcTypeMvcEventREF();
        
        attr.add(value);
        add(_definesEvent,attr);
        return(attr);
    }

    /**
     * Deletes a definesEvent value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delDefinesEvent(Object value) throws DmcValueException {
        DmcAttribute attr = del(_definesEvent, ((DmcNamedObjectIF)value).getObjectName());
        if (attr == null){
            DmcTypeModifier mods = getModifier();
            if (mods != null){
                attr = new DmcTypeMvcEventREF();
                attr.setName(_definesEvent);
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
         rem(_definesEvent);
    }

    public String getName(){
        DmcTypeString attr = (DmcTypeString) get(_name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setName(Object value) throws DmcValueException {
        DmcAttribute attr = get(_name);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    public void remName(){
         rem(_name);
    }

    /**
     * @return An Iterator of MvcControllerDMO objects.
     */
    public Iterator<MvcControllerREF> getControllers(){
        DmcTypeMvcControllerREF attr = (DmcTypeMvcControllerREF) get(_controllers);
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
        DmcAttribute attr = get(_controllers);
        if (attr == null)
            attr = new DmcTypeMvcControllerREF();
        
        attr.add(value);
        add(_controllers,attr);
        return(attr);
    }

    /**
     * Deletes a controllers value.
     * @param value The MvcController to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delControllers(Object value) throws DmcValueException {
        DmcAttribute attr = del(_controllers, ((DmcNamedObjectIF)value).getObjectName());
        if (attr == null){
            DmcTypeModifier mods = getModifier();
            if (mods != null){
                attr = new DmcTypeMvcControllerREF();
                attr.setName(_controllers);
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
         rem(_controllers);
    }

    /**
     * @return An Iterator of MvcEventDMO objects.
     */
    public Iterator<MvcEventREF> getStartEvents(){
        DmcTypeMvcEventREF attr = (DmcTypeMvcEventREF) get(_startEvents);
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
        DmcAttribute attr = get(_startEvents);
        if (attr == null)
            attr = new DmcTypeMvcEventREF();
        
        attr.add(value);
        add(_startEvents,attr);
        return(attr);
    }

    /**
     * Deletes a startEvents value.
     * @param value The MvcEvent to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delStartEvents(Object value) throws DmcValueException {
        DmcAttribute attr = del(_startEvents, ((DmcNamedObjectIF)value).getObjectName());
        if (attr == null){
            DmcTypeModifier mods = getModifier();
            if (mods != null){
                attr = new DmcTypeMvcEventREF();
                attr.setName(_startEvents);
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
         rem(_startEvents);
    }




}

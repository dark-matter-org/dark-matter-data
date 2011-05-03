//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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
package org.dmd.dms.generated.dmo;

import java.io.Serializable;

import java.util.*;

import org.dmd.dmc.*;
import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dms.generated.types.*;
import org.dmd.dms.generated.enums.*;

/**
 * The DmwWrapper class is the basis for all server-side objects that wrapper
 * Dark Matter Obects and extend them with behaviour
 * @author Auto Generated
 * Generated from:  org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1146)
 */
@SuppressWarnings("serial")
public class DmwWrapperDMO extends DmcObject implements Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;

    public final static DmcAttributeInfo __objectClass = new DmcAttributeInfo("objectClass",1,"ClassDefinition",ValueTypeEnum.MULTI,true);


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__objectClass.id,__objectClass);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__objectClass.name,__objectClass);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String ,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }


    public DmwWrapperDMO(){
        super("DmwWrapper");
    }

    public DmwWrapperDMO(String oc){
        super(oc);
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

    @Override
    public DmwWrapperDMO getNew(){
        DmwWrapperDMO rc = new DmwWrapperDMO();
        return(rc);
    }

    @Override
    public DmwWrapperDMO getSlice(DmcSliceInfo info){
        DmwWrapperDMO rc = new DmwWrapperDMO();
        populateSlice(rc,info);
        return(rc);
    }

    /**
     * Used to indicate the classes that an object instance supports.
     * @return An Iterator of ClassDefinitionDMO objects.
     */
    //  org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1623)
    public Iterator<ClassDefinitionREF> getObjectClass(){
        DmcTypeClassDefinitionREFMV attr = (DmcTypeClassDefinitionREFMV) get(__objectClass);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another objectClass value.
     * @param value A value compatible with DmcTypeClassDefinitionREFMV
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1673)
    public DmcAttribute addObjectClass(Object value) throws DmcValueException {
        DmcAttribute attr = get(__objectClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFMV(__objectClass);
        
        attr.add(value);
        add(__objectClass,attr);
        return(attr);
    }


}

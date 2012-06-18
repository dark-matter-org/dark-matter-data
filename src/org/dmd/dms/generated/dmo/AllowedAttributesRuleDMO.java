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

import org.dmd.dmc.types.*;
import org.dmd.dmc.*;
import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dms.generated.types.*;

/**
 * null
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1281)
 */
@SuppressWarnings("serial")
public class AllowedAttributesRuleDMO extends DmcObject implements Serializable {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(MetaDMSAG.__schemaExtension.id,MetaDMSAG.__schemaExtension);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaDMSAG.__schemaExtension.name,MetaDMSAG.__schemaExtension);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String ,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }


    public AllowedAttributesRuleDMO(){
        super("AllowedAttributesRule");
    }

    public AllowedAttributesRuleDMO(String oc){
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
    public AllowedAttributesRuleDMO getNew(){
        AllowedAttributesRuleDMO rc = new AllowedAttributesRuleDMO();
        return(rc);
    }

    @Override
    public AllowedAttributesRuleDMO getSlice(DmcSliceInfo info){
        AllowedAttributesRuleDMO rc = new AllowedAttributesRuleDMO();
        populateSlice(rc,info);
        return(rc);
    }

    /**
     * The fully qualified name of a class that extends the schema management
     * capabilities of the SchemaManager. the class must have a zero arg
     * constructor and implement the SchemaExtensionIF.
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1765)
    public Iterator<String> getSchemaExtension(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__schemaExtension);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another schemaExtension value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1810)
    public DmcAttribute<?> addSchemaExtension(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__schemaExtension);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__schemaExtension);
        
        attr.add(value);
        add(MetaDMSAG.__schemaExtension,attr);
        return(attr);
    }


}

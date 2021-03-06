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
package org.dmd.map.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.map.generated.enums.*;

/**
 * This is the generated DmcAttribute derivative for values of type MapZoomEnum
 * <P>
 * Generated from the map schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpEnumType(DmoTypeFormatter.java:291)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeMapZoomEnum extends DmcAttribute<MapZoomEnum> implements Serializable {

    public DmcTypeMapZoomEnum(){
    }

    public DmcTypeMapZoomEnum(DmcAttributeInfo ai){
        super(ai);
    }

    protected MapZoomEnum typeCheck(Object value) throws DmcValueException {
        MapZoomEnum rc = null;

        if (value instanceof MapZoomEnum){
            rc = (MapZoomEnum)value;
        }
        else if (value instanceof String){
            rc = MapZoomEnum.get((String)value);
        }
        else if (value instanceof Integer){
            rc = MapZoomEnum.get((Integer)value);
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with MapZoomEnum expected."));
        }

        if (rc == null){
            throw(new DmcValueException("Value: " + value.toString() + " is not a valid MapZoomEnum value."));
        }

        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public MapZoomEnum cloneValue(MapZoomEnum val){
        return(val);
    }

    /**
     * Writes a MapZoomEnum.
     */
    public void serializeValue(DmcOutputStreamIF dos, MapZoomEnum value) throws Exception {
        dos.writeShort(value.intValue());
    }

    /**
     * Reads a MapZoomEnum.
     */
    public MapZoomEnum deserializeValue(DmcInputStreamIF dis) throws Exception {
        return(MapZoomEnum.get(dis.readShort()));
    }

}

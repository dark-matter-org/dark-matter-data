//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
package org.dmd.dms.shared.generated.types;

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.meta.TypeFormatter.dumpEnumTypeHelper(TypeFormatter.java:316)
import java.io.Serializable;                                        // Marker for serializable - (TypeFormatter.java:306)
import org.dmd.core.DmcAttribute;                                   // Because we extend this - (TypeFormatter.java:310)
import org.dmd.core.feedback.DMFeedbackSet;                         // To facilitate error handling - (TypeFormatter.java:312)
import org.dmd.core.interfaces.DmcInputStreamIF;                    // To support serialization - (TypeFormatter.java:308)
import org.dmd.core.interfaces.DmcOutputStreamIF;                   // To support serialization - (TypeFormatter.java:307)
import org.dmd.core.schema.DmcAttributeInfo;                        // Required by DmcAttribute  - (TypeFormatter.java:311)
import org.dmd.dms.shared.generated.enums.OriginalTypeEnum;         // The enum we're wrapping - (TypeFormatter.java:314)


@SuppressWarnings("serial")
/**
 * The DmcTypeOriginalTypeEnum class.
 * This code was auto-generated by the createmeta utility and shouldn't be alterred
 * manually.
 * Generated from: org.dmd.dms.tools.generation.meta.TypeFormatter.dumpEnumTypeHelper(TypeFormatter.java:324)
 */
abstract public class DmcTypeOriginalTypeEnum extends DmcAttribute<OriginalTypeEnum> implements Serializable {

    /**
     * Default constructor.
     */
    public DmcTypeOriginalTypeEnum(){
    }

    /**
     * Default constructor.
     */
    public DmcTypeOriginalTypeEnum(DmcAttributeInfo ai){
        super(ai);
    }

    protected OriginalTypeEnum typeCheck(Object value) throws DMFeedbackSet {
        OriginalTypeEnum rc = null;

        if (value instanceof OriginalTypeEnum){
            rc = (OriginalTypeEnum)value;
        }
        else if (value instanceof String){
            rc = OriginalTypeEnum.get((String)value);
            if (rc == null){
                throw(new DMFeedbackSet("Value: " + value.toString() + " is not a valid OriginalTypeEnum value."));
            }
        }
        else if (value instanceof Integer){
            rc = OriginalTypeEnum.get((Integer)value);
            if (rc == null){
                throw(new DMFeedbackSet("Value: " + value.toString() + " is not a valid OriginalTypeEnum value."));
            }
        }
        else{
            throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with OriginalTypeEnum expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public OriginalTypeEnum cloneValue(OriginalTypeEnum val){
        OriginalTypeEnum rc = val;
        return(rc);
    }

    /**
     * Writes a OriginalTypeEnum.
     */
    @Override
    public void serializeValue(DmcOutputStreamIF dos, OriginalTypeEnum value) throws Exception {
        dos.writeShort(value.intValue());
    }

    /**
     * Reads a OriginalTypeEnum.
     */
    @Override
    public OriginalTypeEnum deserializeValue(DmcInputStreamIF dis) throws Exception {
        return(OriginalTypeEnum.get(dis.readShort()));
    }



}

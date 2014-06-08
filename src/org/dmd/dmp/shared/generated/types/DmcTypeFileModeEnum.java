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
package org.dmd.dmp.shared.generated.types;

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.dmogen.DmoTypeFormatter.dumpEnumType(DmoTypeFormatter.java:274)
import java.io.Serializable;                              // Standard marker interface - (DmoTypeFormatter.java:266)
import org.dmd.core.DmcAttribute;                         // What we derive from - (DmoTypeFormatter.java:269)
import org.dmd.core.feedback.DMFeedbackSet;               // To handle errors - (DmoTypeFormatter.java:271)
import org.dmd.core.interfaces.DmcInputStreamIF;          // To support deserialization - (DmoTypeFormatter.java:267)
import org.dmd.core.interfaces.DmcOutputStreamIF;         // To support serialization - (DmoTypeFormatter.java:268)
import org.dmd.core.schema.DmcAttributeInfo;              // To allow construction - (DmoTypeFormatter.java:270)
import org.dmd.dmp.shared.generated.enums.*;              // Access to base enum - (DmoTypeFormatter.java:272)



/**
 * This is the generated DmcAttribute derivative for values of type FileModeEnum
 * <P>
 * Generated from the dmp schema at version null
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.tools.dmogen.DmoTypeFormatter.dumpEnumType(DmoTypeFormatter.java:282)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeFileModeEnum extends DmcAttribute<FileModeEnum> implements Serializable {

    public DmcTypeFileModeEnum(){
    }

    public DmcTypeFileModeEnum(DmcAttributeInfo ai){
        super(ai);
    }

    protected FileModeEnum typeCheck(Object value) throws DMFeedbackSet {
        FileModeEnum rc = null;

        if (value instanceof FileModeEnum){
            rc = (FileModeEnum)value;
        }
        else if (value instanceof String){
            rc = FileModeEnum.get((String)value);
        }
        else if (value instanceof Integer){
            rc = FileModeEnum.get((Integer)value);
        }
        else{
            throw(new DMFeedbackSet("Object of class: " + value.getClass().getName() + " passed where object compatible with FileModeEnum expected."));
        }

        if (rc == null){
            throw(new DMFeedbackSet("Value: " + value.toString() + " is not a valid FileModeEnum value."));
        }

        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public FileModeEnum cloneValue(FileModeEnum val){
        return(val);
    }

    /**
     * Writes a FileModeEnum.
     */
    public void serializeValue(DmcOutputStreamIF dos, FileModeEnum value) throws Exception {
        dos.writeShort(value.intValue());
    }

    /**
     * Reads a FileModeEnum.
     */
    public FileModeEnum deserializeValue(DmcInputStreamIF dis) throws Exception {
        return(FileModeEnum.get(dis.readShort()));
    }

}

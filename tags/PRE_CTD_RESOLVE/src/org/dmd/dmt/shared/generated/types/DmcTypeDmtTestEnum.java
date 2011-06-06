package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import org.dmd.dmc.DmcInputStreamIF;
import org.dmd.dmc.DmcOutputStreamIF;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.enums.*;

/**
 * This is the generated DmcAttribute derivative for values of type DmtTestEnum
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpEnumType(DmoTypeFormatter.java:235)
 */
@SuppressWarnings("serial")
abstract public class DmcTypeDmtTestEnum extends DmcAttribute<DmtTestEnum> implements Serializable {

    public DmcTypeDmtTestEnum(){
    }

    public DmcTypeDmtTestEnum(DmcAttributeInfo ai){
        super(ai);
    }

    protected DmtTestEnum typeCheck(Object value) throws DmcValueException {
        DmtTestEnum rc = null;

        if (value instanceof DmtTestEnum){
            rc = (DmtTestEnum)value;
        }
        else if (value instanceof String){
            rc = DmtTestEnum.get((String)value);
            if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid DmtTestEnum value."));
            }
        }
        else if (value instanceof Integer){
            rc = DmtTestEnum.get((Integer)value);
            if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid DmtTestEnum value."));
            }
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with DmtTestEnum expected."));
        }
        return(rc);
    }

    /**
     * Returns a clone of a value associated with this type.
     */
    public DmtTestEnum cloneValue(DmtTestEnum val){
        return(val);
    }

    /**
     * Writes a DmtTestEnum.
     */
    public void serializeValue(DmcOutputStreamIF dos, DmtTestEnum value) throws Exception {
        dos.writeShort(value.intValue());
    }

    /**
     * Reads a DmtTestEnum.
     */
    public DmtTestEnum deserializeValue(DmcInputStreamIF dis) throws Exception {
        return(DmtTestEnum.get(dis.readShort()));
    }

}
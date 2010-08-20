package org.dmd.dmp.generated.types;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmp.generated.enums.*;

/**
 * This is the generated DmcAttribute derivative for values of type FileModeEnum
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoTypeFormatter.dumpEnumType(DmoTypeFormatter.java:67)
 */
@SuppressWarnings("serial")
public class DmcTypeFileModeEnum extends DmcAttribute<FileModeEnum> {

    public DmcTypeFileModeEnum(){
    }

    protected FileModeEnum typeCheck(Object value) throws DmcValueException {
        FileModeEnum rc = null;

        if (value instanceof FileModeEnum){
            rc = (FileModeEnum)value;
        }
        else if (value instanceof String){
            rc = FileModeEnum.get((String)value);
            if (rc == null){
                throw(new DmcValueException("Value: " + value.toString() + " is not a valid FileModeEnum value."));
            }
        }
        else{
            throw(new DmcValueException("Object of class: " + value.getClass().getName() + " passed where object compatible with FileModeEnum expected."));
        }
        return(rc);
    }

    public String getString(){
        if (sv == null){
            StringBuffer sb = new StringBuffer();
            for (FileModeEnum t : mv){
                sb.append(t + ", ");
            }
            return(sb.toString());
        }
        else
            return(sv.toString());

    }


}

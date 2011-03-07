package org.dmd.dmt.shared.generated.auxw;

import java.util.*;

import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
// import 3 String
import org.dmd.dmc.types.DmcTypeString;

// import 5
import org.dmd.dmc.DmcObject;

/**
 * The TestBasicAuxiliary class allows us to test basic auxiliary class
 * functionality.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:652)
 */
public class TestBasicAuxiliaryDMO  {

    public final static String _auxClass = "TestBasicAuxiliary";
    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __svAuxString = new DmcAttributeInfo("svAuxString",519,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__svAuxString.id,__svAuxString);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__svAuxString.name,__svAuxString);
    }

    /**
     * This method will check to see if the object has any of our attributes.
     * If not, our aux class is automatically removed from the object.
     */
    static private void removeAuxIfRequired(DmcObject core){
        boolean anyLeft = false;

        if (core.get(__svAuxString) != null)
            anyLeft = true;

        if (!anyLeft)
            core.removeAux(_auxClass);
    }

    /**
     * This method will check to see if the object has our aux class.
     * If not, we add our aux class the object.
     */
    static private void addAuxIfRequired(DmcObject core) throws DmcValueException {
        if (!core.hasAux(_auxClass))
            core.addAux(_auxClass);
    }

    /**
     * Determines if the specified class is in our ocl.
     */
    static public boolean hasAux(DmcObject core) throws DmcValueException {
        if (core == null)
            return(false);
        return(core.hasAux(_auxClass));
    }

    @SuppressWarnings("unchecked")
    static private DmcAttribute get(DmcObject core, DmcAttributeInfo ai){
        if (core == null)
            return(null);
        return(core.get(ai));
    }

    @SuppressWarnings("unchecked")
    static private DmcAttribute set(DmcObject core, DmcAttributeInfo ai, DmcAttribute attr) throws DmcValueException {
        if (core == null)
            return(null);
        addAuxIfRequired(core);
        return(core.set(ai,attr));
    }

    /**
     * Removes the svAuxString attribute from the object.
     */
    @SuppressWarnings("unchecked")
    static public DmcAttribute remSvAuxString(DmcObject core){
        if (core == null)
            return(null);
        DmcAttribute rc = core.rem(__svAuxString);
        removeAuxIfRequired(core);
        return(rc);
    }

    static public String getSvAuxString(DmcObject core){
        DmcTypeString attr = (DmcTypeString) get(core, __svAuxString);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svAuxString to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    static public void setSvAuxString(DmcObject core, Object value) throws DmcValueException {
        DmcAttribute attr = get(core, __svAuxString);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(core, __svAuxString,attr);
    }




}

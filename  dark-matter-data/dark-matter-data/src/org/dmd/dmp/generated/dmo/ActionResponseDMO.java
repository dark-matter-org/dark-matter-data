package org.dmd.dmp.generated.dmo;

import java.util.*;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.types.DmcTypeDmcObject;
import org.dmd.dmc.types.DmcTypeLong;

import org.dmd.dmp.generated.dmo.ResponseDMO;

@SuppressWarnings("serial")
/**
 * The ActionResponse returns the results of a particular ActionRequest.
 * Exactly what is returned will depend on the efActionDef.
 * 
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:182)
 */
public class ActionResponseDMO  extends ResponseDMO  {

    public final static String _objectList = "objectList";
    public final static String _timeMS = "timeMS";

    public ActionResponseDMO() {
    }

    /**
     * @returns An Iterator of DmcObject objects.
     */
    public Iterator<DmcObject> getObjectList(){
        DmcTypeDmcObject attr = (DmcTypeDmcObject) attributes.get(_objectList);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     */
    @SuppressWarnings("unchecked")
    public void addObjectList(Object value) throws DmcValueException {
        DmcAttribute attr = attributes.get(_objectList);
        if (attr == null)
            attr = new DmcTypeDmcObject();
        
        attr.add(value);
        add(_objectList,attr);
    }

    /**
     * Deletes a objectList value.
     * @param value The DmcObject to be deleted from set of attribute values.
     */
    public void delObjectList(Object value){
        try{
            del(_objectList, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public Long getTimeMS(){
        DmcTypeLong attr = (DmcTypeLong) attributes.get(_timeMS);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets timeMS to the specified value.
     * @param value A value compatible with DmcTypeLong
     */
    @SuppressWarnings("unchecked")
    public void setTimeMS(Object value) throws DmcValueException {
        DmcAttribute attr = attributes.get(_timeMS);
        if (attr == null)
            attr = new DmcTypeLong();
        
        attr.set(value);
        set(_timeMS,attr);
    }




}

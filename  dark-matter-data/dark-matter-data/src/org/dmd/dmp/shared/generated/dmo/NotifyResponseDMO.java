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
package org.dmd.dmp.shared.generated.dmo;

// Generated from:  org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:272)
import java.io.Serializable;                                  // Always required
import java.util.*;                                           // Always required
import org.dmd.dmc.DmcAttribute;                              // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                          // Always required
import org.dmd.dmc.DmcValueException;                         // Any attributes
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;          // Base class
import org.dmd.dms.generated.enums.ValueTypeEnum;             // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeIntegerMV;          // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor

/**
 * null
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:127)
 */
@SuppressWarnings("serial")
public class NotifyResponseDMO  extends ResponseDMO  implements Serializable  {

    public final static String constructionClassName = "NotifyResponse";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __handlerID = new DmcAttributeInfo("handlerID",532,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __lastResponse = new DmcAttributeInfo("lastResponse",510,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"Integer",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __responseCategory = new DmcAttributeInfo("responseCategory",505,"ResponseCategoryEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __responseText = new DmcAttributeInfo("responseText",506,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __responseType = new DmcAttributeInfo("responseType",504,"ResponseTypeEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __timeMS = new DmcAttributeInfo("timeMS",518,"Long",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__handlerID.id,__handlerID);
        _ImAp.put(__lastResponse.id,__lastResponse);
        _ImAp.put(__requestID.id,__requestID);
        _ImAp.put(__responseCategory.id,__responseCategory);
        _ImAp.put(__responseText.id,__responseText);
        _ImAp.put(__responseType.id,__responseType);
        _ImAp.put(__timeMS.id,__timeMS);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__handlerID.name,__handlerID);
        _SmAp.put(__lastResponse.name,__lastResponse);
        _SmAp.put(__requestID.name,__requestID);
        _SmAp.put(__responseCategory.name,__responseCategory);
        _SmAp.put(__responseText.name,__responseText);
        _SmAp.put(__responseType.name,__responseType);
        _SmAp.put(__timeMS.name,__timeMS);
    }

    public NotifyResponseDMO() {
        super("NotifyResponse");
    }

    protected NotifyResponseDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public NotifyResponseDMO getNew(){
        NotifyResponseDMO rc = new NotifyResponseDMO();
        return(rc);
    }

    public NotifyResponseDMO(DmcTypeModifierMV mods) {
        super("NotifyResponse");
        modrec(true);
        setModifier(mods);
    }

    /**
     * @return An Iterator of Integer objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:772)
    public Iterator<Integer> getRequestID(){
        DmcTypeIntegerMV attr = (DmcTypeIntegerMV) get(__requestID);
        if (attr == null)
            return( ((List<Integer>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * Adds another requestID to the specified value.
     * @param value Integer
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:785)
    public DmcAttribute<?> addRequestID(Integer value) {
        DmcAttribute<?> attr = get(__requestID);
        if (attr == null)
            attr = new DmcTypeIntegerMV(__requestID);
        
        try{
            setLastValue(attr.add(value));
            add(__requestID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Integer.
     * @param value Integer
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:805)
    public boolean requestIDContains(Integer value) {
        DmcAttribute<?> attr = get(__requestID);
        return(attr.contains(value));
    }

    /**
     * Adds another requestID value.
     * @param value A value compatible with Integer
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:820)
    public DmcAttribute<?> addRequestID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__requestID);
        if (attr == null)
            attr = new DmcTypeIntegerMV(__requestID);
        
        setLastValue(attr.add(value));
        add(__requestID,attr);
        return(attr);
    }

    /**
     * Returns the number of values in requestID
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:837)
    public int getRequestIDSize(){
        DmcAttribute<?> attr = get(__requestID);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a requestID value.
     * @param value The Integer to be deleted from set of attribute values.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:879)
    public DmcAttribute<?> delRequestID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__requestID);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeIntegerMV(__requestID), value);
        else
            attr = del(__requestID, value);
        
        return(attr);
    }

    /**
     * Removes the requestID attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:897)
    public void remRequestID(){
         rem(__requestID);
    }




}

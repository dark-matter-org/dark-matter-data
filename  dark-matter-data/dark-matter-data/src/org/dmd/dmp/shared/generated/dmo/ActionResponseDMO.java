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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:287)
import java.io.Serializable;                                   // Always required
import java.util.*;                                            // Always required
import org.dmd.dmc.DmcAttribute;                               // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                           // Always required
import org.dmd.dmc.DmcObject;                                  // Primitive type and !auxiliary class
import org.dmd.dmc.DmcSliceInfo;                               // Required for object slicing
import org.dmd.dmc.DmcValueException;                          // Any attributes
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;           // Base class
import org.dmd.dms.generated.enums.DataTypeEnum;               // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;              // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeDmcObjectMV;         // Required type
import org.dmd.dms.generated.types.DmcTypeLongSV;              // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;          // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringSV;            // Required type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The ActionResponse returns the results of a particular ActionRequest.
 * Exactly what is returned will depend on the efActionDef.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:132)
 */
@SuppressWarnings("serial")
public class ActionResponseDMO  extends ResponseDMO  implements Serializable  {

    public final static String constructionClassName = "ActionResponse";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __actionName = new DmcAttributeInfo("actionName",515,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __handlerID = new DmcAttributeInfo("handlerID",531,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __lastResponse = new DmcAttributeInfo("lastResponse",510,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __objectList = new DmcAttributeInfo("objectList",512,"DmcObject",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"Integer",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __responseCategory = new DmcAttributeInfo("responseCategory",505,"ResponseCategoryEnum",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __responseText = new DmcAttributeInfo("responseText",506,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __responseType = new DmcAttributeInfo("responseType",504,"ResponseTypeEnum",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __timeMS = new DmcAttributeInfo("timeMS",518,"Long",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__actionName.id,__actionName);
        _ImAp.put(__handlerID.id,__handlerID);
        _ImAp.put(__lastResponse.id,__lastResponse);
        _ImAp.put(__objectList.id,__objectList);
        _ImAp.put(__requestID.id,__requestID);
        _ImAp.put(__responseCategory.id,__responseCategory);
        _ImAp.put(__responseText.id,__responseText);
        _ImAp.put(__responseType.id,__responseType);
        _ImAp.put(__timeMS.id,__timeMS);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__actionName.name,__actionName);
        _SmAp.put(__handlerID.name,__handlerID);
        _SmAp.put(__lastResponse.name,__lastResponse);
        _SmAp.put(__objectList.name,__objectList);
        _SmAp.put(__requestID.name,__requestID);
        _SmAp.put(__responseCategory.name,__responseCategory);
        _SmAp.put(__responseText.name,__responseText);
        _SmAp.put(__responseType.name,__responseType);
        _SmAp.put(__timeMS.name,__timeMS);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public ActionResponseDMO() {
        super("ActionResponse");
    }

    protected ActionResponseDMO(String oc) {
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
    public ActionResponseDMO getNew(){
        ActionResponseDMO rc = new ActionResponseDMO();
        return(rc);
    }

    @Override
    public ActionResponseDMO getSlice(DmcSliceInfo info){
        ActionResponseDMO rc = new ActionResponseDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ActionResponseDMO(DmcTypeModifierMV mods) {
        super("ActionResponse");
        modrec(true);
        setModifier(mods);
    }

    /**
     * @return An Iterator of DmcObject objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:824)
    public Iterator<DmcObject> getObjectList(){
        DmcTypeDmcObjectMV attr = (DmcTypeDmcObjectMV) get(__objectList);
        if (attr == null)
            return( ((List<DmcObject>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth DmcObject value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:836)
    public DmcObject getNthObjectList(int i){
        DmcTypeDmcObjectMV attr = (DmcTypeDmcObjectMV) get(__objectList);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another objectList to the specified value.
     * @param value DmcObject
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:849)
    public DmcAttribute<?> addObjectList(DmcObject value) {
        DmcAttribute<?> attr = get(__objectList);
        if (attr == null)
            attr = new DmcTypeDmcObjectMV(__objectList);
        
        try{
            setLastValue(attr.add(value));
            add(__objectList,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified DmcObject.
     * @param value DmcObject
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:891)
    public boolean objectListContains(DmcObject value) {
        DmcAttribute<?> attr = get(__objectList);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:923)
    public DmcAttribute<?> addObjectList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__objectList);
        if (attr == null)
            attr = new DmcTypeDmcObjectMV(__objectList);
        
        setLastValue(attr.add(value));
        add(__objectList,attr);
        return(attr);
    }

    /**
     * Returns the number of values in objectList
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:940)
    public int getObjectListSize(){
        DmcAttribute<?> attr = get(__objectList);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a objectList value.
     * @param value The DmcObject to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:982)
    public DmcAttribute<?> delObjectList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__objectList);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDmcObjectMV(__objectList), value);
        else
            attr = del(__objectList, value);
        
        return(attr);
    }

    /**
     * Deletes a objectList from the specified value.
     * @param value DmcObject
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:998)
    public DmcAttribute<?> delObjectList(DmcObject value) {
        DmcAttribute<?> attr = get(__objectList);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDmcObjectMV(__objectList), value);
        else
            attr = del(__objectList, value);
        
        return(attr);
    }

    /**
     * Removes the objectList attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1017)
    public void remObjectList(){
         rem(__objectList);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:605)
    public Long getTimeMS(){
        DmcTypeLongSV attr = (DmcTypeLongSV) get(__timeMS);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets timeMS to the specified value.
     * @param value Long
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public void setTimeMS(Long value) {
        DmcAttribute<?> attr = get(__timeMS);
        if (attr == null)
            attr = new DmcTypeLongSV(__timeMS);
        
        try{
            attr.set(value);
            set(__timeMS,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets timeMS to the specified value.
     * @param value A value compatible with DmcTypeLongSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:690)
    public void setTimeMS(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__timeMS);
        if (attr == null)
            attr = new DmcTypeLongSV(__timeMS);
        
        attr.set(value);
        set(__timeMS,attr);
    }

    /**
     * Removes the timeMS attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:705)
    public void remTimeMS(){
         rem(__timeMS);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:605)
    public String getActionName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__actionName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets actionName to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public void setActionName(String value) {
        DmcAttribute<?> attr = get(__actionName);
        if (attr == null)
            attr = new DmcTypeStringSV(__actionName);
        
        try{
            attr.set(value);
            set(__actionName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets actionName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:690)
    public void setActionName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__actionName);
        if (attr == null)
            attr = new DmcTypeStringSV(__actionName);
        
        attr.set(value);
        set(__actionName,attr);
    }

    /**
     * Removes the actionName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:705)
    public void remActionName(){
         rem(__actionName);
    }




}

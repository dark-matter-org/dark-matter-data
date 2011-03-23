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

// Generated from: org.dmd.dms.util.DmoFormatter.formatImports(DmoFormatter.java:725)
import java.util.*;                                          // Always required
import org.dmd.dmc.DmcAttribute;                             // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                         // Always required
import org.dmd.dmc.DmcNamedObjectIF;                         // Named object
import org.dmd.dmc.DmcObject;                                // Primitive type and !auxiliary class
import org.dmd.dmc.DmcValueException;                        // Any attributes
import org.dmd.dmc.types.DmcTypeDmcObject;                   // Required type
import org.dmd.dmc.types.DmcTypeIntegerName;                 // Required type
import org.dmd.dmc.types.DmcTypeLong;                        // Required type
import org.dmd.dmc.types.DmcTypeString;                      // Required type
import org.dmd.dmc.types.IntegerName;                        // Naming attribute type
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;         // Base class
import org.dmd.dms.generated.enums.ValueTypeEnum;            // Required if we have any attributes

/**
 * The ActionResponse returns the results of a particular ActionRequest.
 * Exactly what is returned will depend on the efActionDef.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:140)
 */
@SuppressWarnings("serial")
public class ActionResponseDMO  extends ResponseDMO  implements DmcNamedObjectIF  {

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __actionName = new DmcAttributeInfo("actionName",515,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __lastResponse = new DmcAttributeInfo("lastResponse",510,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __objectList = new DmcAttributeInfo("objectList",512,"DmcObject",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"IntegerName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __responseCategory = new DmcAttributeInfo("responseCategory",505,"ResponseCategoryEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __responseText = new DmcAttributeInfo("responseText",506,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __responseType = new DmcAttributeInfo("responseType",504,"ResponseTypeEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __timeMS = new DmcAttributeInfo("timeMS",518,"Long",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__actionName.id,__actionName);
        _ImAp.put(__lastResponse.id,__lastResponse);
        _ImAp.put(__objectList.id,__objectList);
        _ImAp.put(__requestID.id,__requestID);
        _ImAp.put(__responseCategory.id,__responseCategory);
        _ImAp.put(__responseText.id,__responseText);
        _ImAp.put(__responseType.id,__responseType);
        _ImAp.put(__timeMS.id,__timeMS);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__actionName.name,__actionName);
        _SmAp.put(__lastResponse.name,__lastResponse);
        _SmAp.put(__objectList.name,__objectList);
        _SmAp.put(__requestID.name,__requestID);
        _SmAp.put(__responseCategory.name,__responseCategory);
        _SmAp.put(__responseText.name,__responseText);
        _SmAp.put(__responseType.name,__responseType);
        _SmAp.put(__timeMS.name,__timeMS);
    }

    public ActionResponseDMO() {
        super("ActionResponse",_ImAp,_SmAp);
    }

    protected ActionResponseDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public ActionResponseDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public ActionResponseDMO(ActionResponseDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public ActionResponseDMO getOneOfMe() {
        ActionResponseDMO rc = new ActionResponseDMO(this.getConstructionClassName());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:801)
    public IntegerName getObjectName(){
        DmcAttribute<?> name = get(__requestID);
        if (name != null)
            return((IntegerName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__requestID);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof ActionResponseDMO){
            return( getObjectName().equals( ((ActionResponseDMO) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return An Iterator of DmcObject objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:552)
    public Iterator<DmcObject> getObjectList(){
        DmcTypeDmcObject attr = (DmcTypeDmcObject) get(__objectList);
        if (attr == null)
            return( ((List<DmcObject>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * Adds another objectList to the specified value.
     * @param value DmcObject
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:567)
    public DmcAttribute<?> addObjectList(DmcObject value) {
        DmcAttribute<?> attr = get(__objectList);
        if (attr == null)
            attr = new DmcTypeDmcObject(__objectList);
        
        try{
            attr.add(value);
            add(__objectList,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:593)
    public DmcAttribute<?> addObjectList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__objectList);
        if (attr == null)
            attr = new DmcTypeDmcObject(__objectList);
        
        attr.add(value);
        add(__objectList,attr);
        return(attr);
    }

    /**
     * Deletes a objectList value.
     * @param value The DmcObject to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:660)
    public DmcAttribute<?> delObjectList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = del(__objectList, value);
        return(attr);
    }

    /**
     * Removes the objectList attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:682)
    public void remObjectList(){
         rem(__objectList);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:388)
    public IntegerName getRequestID(){
        DmcTypeIntegerName attr = (DmcTypeIntegerName) get(__requestID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets requestID to the specified value.
     * @param value IntegerName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:421)
    public void setRequestID(IntegerName value) {
        DmcAttribute<?> attr = get(__requestID);
        if (attr == null)
            attr = new DmcTypeIntegerName(__requestID);
        
        try{
            attr.set(value);
            set(__requestID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets requestID to the specified value.
     * @param value A value compatible with DmcTypeIntegerName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:448)
    public void setRequestID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__requestID);
        if (attr == null)
            attr = new DmcTypeIntegerName(__requestID);
        
        attr.set(value);
        set(__requestID,attr);
    }

    /**
     * Removes the requestID attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:463)
    public void remRequestID(){
         rem(__requestID);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:388)
    public Long getTimeMS(){
        DmcTypeLong attr = (DmcTypeLong) get(__timeMS);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets timeMS to the specified value.
     * @param value Long
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:421)
    public void setTimeMS(Long value) {
        DmcAttribute<?> attr = get(__timeMS);
        if (attr == null)
            attr = new DmcTypeLong(__timeMS);
        
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
     * @param value A value compatible with DmcTypeLong
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:448)
    public void setTimeMS(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__timeMS);
        if (attr == null)
            attr = new DmcTypeLong(__timeMS);
        
        attr.set(value);
        set(__timeMS,attr);
    }

    /**
     * Removes the timeMS attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:463)
    public void remTimeMS(){
         rem(__timeMS);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:388)
    public String getActionName(){
        DmcTypeString attr = (DmcTypeString) get(__actionName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets actionName to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:421)
    public void setActionName(String value) {
        DmcAttribute<?> attr = get(__actionName);
        if (attr == null)
            attr = new DmcTypeString(__actionName);
        
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
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:448)
    public void setActionName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__actionName);
        if (attr == null)
            attr = new DmcTypeString(__actionName);
        
        attr.set(value);
        set(__actionName,attr);
    }

    /**
     * Removes the actionName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:463)
    public void remActionName(){
         rem(__actionName);
    }




}

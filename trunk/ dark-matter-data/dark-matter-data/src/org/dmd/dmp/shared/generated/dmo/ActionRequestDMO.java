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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:277)
import java.io.Serializable;                                            // Always required
import java.util.*;                                                     // Always required
import org.dmd.dmc.DmcAttribute;                                        // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                    // Always required
import org.dmd.dmc.DmcObject;                                           // Primitive type and !auxiliary class
import org.dmd.dmc.DmcValueException;                                   // Any attributes
import org.dmd.dmc.types.FullyQualifiedName;                            // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                     // Base class
import org.dmd.dmp.shared.generated.enums.ScopeEnum;                    // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.types.DmcTypeScopeEnumSV;           // Required type
import org.dmd.dms.generated.enums.ValueTypeEnum;                       // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeDmcObjectMV;                  // Required type
import org.dmd.dms.generated.types.DmcTypeDmcObjectSV;                  // Required type
import org.dmd.dms.generated.types.DmcTypeFullyQualifiedNameSV;         // Required type
import org.dmd.dms.generated.types.DmcTypeIntegerMV;                    // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringSV;                     // Required type

/**
 * The ActionRequest is used to trigger behaviour on one or more objects.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:127)
 */
@SuppressWarnings("serial")
public class ActionRequestDMO  extends RequestDMO  implements Serializable  {

    public final static String constructionClassName = "ActionRequest";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __FQN = new DmcAttributeInfo("FQN",84,"FullyQualifiedName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __actionName = new DmcAttributeInfo("actionName",515,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __actionTrigger = new DmcAttributeInfo("actionTrigger",525,"DmcObject",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __handlerID = new DmcAttributeInfo("handlerID",531,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __objectList = new DmcAttributeInfo("objectList",512,"DmcObject",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __readableFormat = new DmcAttributeInfo("readableFormat",517,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"Integer",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __responseFormat = new DmcAttributeInfo("responseFormat",516,"ResponseFormatEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __scope = new DmcAttributeInfo("scope",511,"ScopeEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __sessionID = new DmcAttributeInfo("sessionID",502,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __timeMS = new DmcAttributeInfo("timeMS",518,"Long",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__FQN.id,__FQN);
        _ImAp.put(__actionName.id,__actionName);
        _ImAp.put(__actionTrigger.id,__actionTrigger);
        _ImAp.put(__handlerID.id,__handlerID);
        _ImAp.put(__objectList.id,__objectList);
        _ImAp.put(__readableFormat.id,__readableFormat);
        _ImAp.put(__requestID.id,__requestID);
        _ImAp.put(__responseFormat.id,__responseFormat);
        _ImAp.put(__scope.id,__scope);
        _ImAp.put(__sessionID.id,__sessionID);
        _ImAp.put(__timeMS.id,__timeMS);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__FQN.name,__FQN);
        _SmAp.put(__actionName.name,__actionName);
        _SmAp.put(__actionTrigger.name,__actionTrigger);
        _SmAp.put(__handlerID.name,__handlerID);
        _SmAp.put(__objectList.name,__objectList);
        _SmAp.put(__readableFormat.name,__readableFormat);
        _SmAp.put(__requestID.name,__requestID);
        _SmAp.put(__responseFormat.name,__responseFormat);
        _SmAp.put(__scope.name,__scope);
        _SmAp.put(__sessionID.name,__sessionID);
        _SmAp.put(__timeMS.name,__timeMS);
    }

    public ActionRequestDMO() {
        super("ActionRequest");
    }

    protected ActionRequestDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public ActionRequestDMO getNew(){
        ActionRequestDMO rc = new ActionRequestDMO();
        return(rc);
    }

    public ActionRequestDMO(DmcTypeModifierMV mods) {
        super("ActionRequest");
        modrec(true);
        setModifier(mods);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:579)
    public ScopeEnum getScope(){
        DmcTypeScopeEnumSV attr = (DmcTypeScopeEnumSV) get(__scope);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets scope to the specified value.
     * @param value ScopeEnum
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:616)
    public void setScope(ScopeEnum value) {
        DmcAttribute<?> attr = get(__scope);
        if (attr == null)
            attr = new DmcTypeScopeEnumSV(__scope);
        
        try{
            attr.set(value);
            set(__scope,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnumSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:664)
    public void setScope(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__scope);
        if (attr == null)
            attr = new DmcTypeScopeEnumSV(__scope);
        
        attr.set(value);
        set(__scope,attr);
    }

    /**
     * Removes the scope attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:679)
    public void remScope(){
         rem(__scope);
    }

    /**
     * @return An Iterator of DmcObject objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:798)
    public Iterator<DmcObject> getObjectList(){
        DmcTypeDmcObjectMV attr = (DmcTypeDmcObjectMV) get(__objectList);
        if (attr == null)
            return( ((List<DmcObject>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth DmcObject value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:810)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:823)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:865)
    public boolean objectListContains(DmcObject value) {
        DmcAttribute<?> attr = get(__objectList);
        return(attr.contains(value));
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:880)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:897)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:939)
    public DmcAttribute<?> delObjectList(Object value) throws DmcValueException {
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:957)
    public void remObjectList(){
         rem(__objectList);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:579)
    public DmcObject getActionTrigger(){
        DmcTypeDmcObjectSV attr = (DmcTypeDmcObjectSV) get(__actionTrigger);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets actionTrigger to the specified value.
     * @param value DmcObject
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:616)
    public void setActionTrigger(DmcObject value) {
        DmcAttribute<?> attr = get(__actionTrigger);
        if (attr == null)
            attr = new DmcTypeDmcObjectSV(__actionTrigger);
        
        try{
            attr.set(value);
            set(__actionTrigger,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets actionTrigger to the specified value.
     * @param value A value compatible with DmcTypeDmcObjectSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:664)
    public void setActionTrigger(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__actionTrigger);
        if (attr == null)
            attr = new DmcTypeDmcObjectSV(__actionTrigger);
        
        attr.set(value);
        set(__actionTrigger,attr);
    }

    /**
     * Removes the actionTrigger attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:679)
    public void remActionTrigger(){
         rem(__actionTrigger);
    }

    /**
     * @return An Iterator of Integer objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:798)
    public Iterator<Integer> getRequestID(){
        DmcTypeIntegerMV attr = (DmcTypeIntegerMV) get(__requestID);
        if (attr == null)
            return( ((List<Integer>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Integer value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:810)
    public Integer getNthRequestID(int i){
        DmcTypeIntegerMV attr = (DmcTypeIntegerMV) get(__requestID);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another requestID to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:823)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:865)
    public boolean requestIDContains(Integer value) {
        DmcAttribute<?> attr = get(__requestID);
        return(attr.contains(value));
    }

    /**
     * Adds another requestID value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:880)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:897)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:939)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:957)
    public void remRequestID(){
         rem(__requestID);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:579)
    public FullyQualifiedName getFQN(){
        DmcTypeFullyQualifiedNameSV attr = (DmcTypeFullyQualifiedNameSV) get(__FQN);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets FQN to the specified value.
     * @param value FullyQualifiedName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:616)
    public void setFQN(FullyQualifiedName value) {
        DmcAttribute<?> attr = get(__FQN);
        if (attr == null)
            attr = new DmcTypeFullyQualifiedNameSV(__FQN);
        
        try{
            attr.set(value);
            set(__FQN,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeFullyQualifiedNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:664)
    public void setFQN(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__FQN);
        if (attr == null)
            attr = new DmcTypeFullyQualifiedNameSV(__FQN);
        
        attr.set(value);
        set(__FQN,attr);
    }

    /**
     * Removes the FQN attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:679)
    public void remFQN(){
         rem(__FQN);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:579)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:616)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:664)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:679)
    public void remActionName(){
         rem(__actionName);
    }




}

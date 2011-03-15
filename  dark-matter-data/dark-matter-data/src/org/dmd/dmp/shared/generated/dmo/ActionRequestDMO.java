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

// Generated from:  org.dmd.dms.util.DmoFormatter.formatImports(DmoFormatter.java:709)
import java.util.*;                                                 // Always required
import org.dmd.dmc.DmcAttribute;                                    // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                // Always required
import org.dmd.dmc.DmcObject;                                       // Primitive type and !auxiliary class
import org.dmd.dmc.DmcValueException;                               // Any attributes
import org.dmd.dmc.types.DmcTypeDmcObject;                          // Required type
import org.dmd.dmc.types.DmcTypeModifier;                           // Any MV attributes
import org.dmd.dmc.types.DmcTypeString;                             // Required type
import org.dmd.dmc.types.DmcTypeStringName;                         // Required type
import org.dmd.dmc.types.Modification;                              // Any MV attributes
import org.dmd.dmc.types.StringName;                                // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                 // Base class
import org.dmd.dmp.shared.generated.enums.ScopeEnum;                // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.types.DmcTypeScopeEnum;         // Required type
import org.dmd.dms.generated.enums.ModifyTypeEnum;                  // Any MV attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;                   // Always required

/**
 * The ActionRequest is used to trigger behaviour on one or more objects.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:140)
 */
@SuppressWarnings("serial")
public class ActionRequestDMO  extends RequestDMO  {

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __FQN = new DmcAttributeInfo("FQN",84,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __actionName = new DmcAttributeInfo("actionName",515,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __actionTrigger = new DmcAttributeInfo("actionTrigger",525,"DmcObject",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __objectList = new DmcAttributeInfo("objectList",512,"DmcObject",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __readableFormat = new DmcAttributeInfo("readableFormat",517,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"IntegerName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __responseFormat = new DmcAttributeInfo("responseFormat",516,"ResponseFormatEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __scope = new DmcAttributeInfo("scope",511,"ScopeEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __sessionID = new DmcAttributeInfo("sessionID",502,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__FQN.id,__FQN);
        _ImAp.put(__actionName.id,__actionName);
        _ImAp.put(__actionTrigger.id,__actionTrigger);
        _ImAp.put(__objectList.id,__objectList);
        _ImAp.put(__readableFormat.id,__readableFormat);
        _ImAp.put(__requestID.id,__requestID);
        _ImAp.put(__responseFormat.id,__responseFormat);
        _ImAp.put(__scope.id,__scope);
        _ImAp.put(__sessionID.id,__sessionID);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__FQN.name,__FQN);
        _SmAp.put(__actionName.name,__actionName);
        _SmAp.put(__actionTrigger.name,__actionTrigger);
        _SmAp.put(__objectList.name,__objectList);
        _SmAp.put(__readableFormat.name,__readableFormat);
        _SmAp.put(__requestID.name,__requestID);
        _SmAp.put(__responseFormat.name,__responseFormat);
        _SmAp.put(__scope.name,__scope);
        _SmAp.put(__sessionID.name,__sessionID);
    }

    public ActionRequestDMO() {
        super("ActionRequest",_ImAp,_SmAp);
    }

    protected ActionRequestDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public ActionRequestDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public ActionRequestDMO(ActionRequestDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public ActionRequestDMO getOneOfMe() {
        ActionRequestDMO rc = new ActionRequestDMO(this.getConstructionClassName());
        return(rc);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:322)
    public ScopeEnum getScope(){
        DmcTypeScopeEnum attr = (DmcTypeScopeEnum) get(__scope);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnum
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:345)
    public void setScope(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__scope);
        if (attr == null)
            attr = new DmcTypeScopeEnum();
        
        attr.set(value);
        set(__scope,attr);
    }

    /**
     * Removes the scope attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:360)
    public void remScope(){
         rem(__scope);
    }

    /**
     * @return An Iterator of DmcObject objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:432)
    public Iterator<DmcObject> getObjectList(){
        DmcTypeDmcObject attr = (DmcTypeDmcObject) get(__objectList);
        if (attr == null)
            return( ((List<DmcObject>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:452)
    public DmcAttribute<?> addObjectList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__objectList);
        if (attr == null)
            attr = new DmcTypeDmcObject();
        
        attr.add(value);
        add(__objectList,attr);
        return(attr);
    }

    /**
     * Deletes a objectList value.
     * @param value The DmcObject to be deleted from set of attribute values.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:518)
    public DmcAttribute<?> delObjectList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = del(__objectList, value);
        if (attr == null){
            DmcTypeModifier mods = getModifier();
            if (mods != null){
                attr = new DmcTypeDmcObject();
                attr.setName(__objectList.name);
                attr.add(value);
                mods.add(new Modification(ModifyTypeEnum.DEL, attr));
            }
        }
        return(attr);
    }

    /**
     * Removes the objectList attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:540)
    public void remObjectList(){
         rem(__objectList);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:322)
    public DmcObject getActionTrigger(){
        DmcTypeDmcObject attr = (DmcTypeDmcObject) get(__actionTrigger);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets actionTrigger to the specified value.
     * @param value A value compatible with DmcTypeDmcObject
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:345)
    public void setActionTrigger(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__actionTrigger);
        if (attr == null)
            attr = new DmcTypeDmcObject();
        
        attr.set(value);
        set(__actionTrigger,attr);
    }

    /**
     * Removes the actionTrigger attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:360)
    public void remActionTrigger(){
         rem(__actionTrigger);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:322)
    public StringName getFQN(){
        DmcTypeStringName attr = (DmcTypeStringName) get(__FQN);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:345)
    public void setFQN(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__FQN);
        if (attr == null)
            attr = new DmcTypeStringName();
        
        attr.set(value);
        set(__FQN,attr);
    }

    /**
     * Removes the FQN attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:360)
    public void remFQN(){
         rem(__FQN);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:322)
    public String getActionName(){
        DmcTypeString attr = (DmcTypeString) get(__actionName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets actionName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:345)
    public void setActionName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__actionName);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__actionName,attr);
    }

    /**
     * Removes the actionName attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:360)
    public void remActionName(){
         rem(__actionName);
    }




}

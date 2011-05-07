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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:281)
import java.io.Serializable;                                       // Always required
import java.util.*;                                                // Always required
import org.dmd.dmc.DmcAttribute;                                   // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                               // Always required
import org.dmd.dmc.DmcObjectName;                                  // Alternative type for NameContainer values
import org.dmd.dmc.DmcSliceInfo;                                   // Required for object slicing
import org.dmd.dmc.DmcValueException;                              // Any attributes
import org.dmd.dmc.types.Modifier;                                 // Primitive type and !auxiliary class
import org.dmd.dmc.types.NameContainer;                            // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                // Base class
import org.dmd.dms.generated.enums.DataTypeEnum;                   // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;                  // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required type
import org.dmd.dms.generated.types.DmcTypeNameContainerSV;         // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                // Required type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The SetRequest allows you to alter the attribute values associated with an
 * object. Like the get request, the set of attributes that can be
 * manipulated will depend on the object type that is specified.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:136)
 */
@SuppressWarnings("serial")
public class SetRequestDMO  extends RequestDMO  implements Serializable  {

    public final static String constructionClassName = "SetRequest";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __handlerID = new DmcAttributeInfo("handlerID",531,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __modify = new DmcAttributeInfo("modify",522,"Modifier",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __readableFormat = new DmcAttributeInfo("readableFormat",517,"Boolean",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"Integer",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __responseFormat = new DmcAttributeInfo("responseFormat",516,"ResponseFormatEnum",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __sessionID = new DmcAttributeInfo("sessionID",502,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __target = new DmcAttributeInfo("target",508,"NameContainer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __targetObjectClass = new DmcAttributeInfo("targetObjectClass",536,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __timeMS = new DmcAttributeInfo("timeMS",518,"Long",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__handlerID.id,__handlerID);
        _ImAp.put(__modify.id,__modify);
        _ImAp.put(__readableFormat.id,__readableFormat);
        _ImAp.put(__requestID.id,__requestID);
        _ImAp.put(__responseFormat.id,__responseFormat);
        _ImAp.put(__sessionID.id,__sessionID);
        _ImAp.put(__target.id,__target);
        _ImAp.put(__targetObjectClass.id,__targetObjectClass);
        _ImAp.put(__timeMS.id,__timeMS);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__handlerID.name,__handlerID);
        _SmAp.put(__modify.name,__modify);
        _SmAp.put(__readableFormat.name,__readableFormat);
        _SmAp.put(__requestID.name,__requestID);
        _SmAp.put(__responseFormat.name,__responseFormat);
        _SmAp.put(__sessionID.name,__sessionID);
        _SmAp.put(__target.name,__target);
        _SmAp.put(__targetObjectClass.name,__targetObjectClass);
        _SmAp.put(__timeMS.name,__timeMS);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public SetRequestDMO() {
        super("SetRequest");
    }

    protected SetRequestDMO(String oc) {
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
    public SetRequestDMO getNew(){
        SetRequestDMO rc = new SetRequestDMO();
        return(rc);
    }

    @Override
    public SetRequestDMO getSlice(DmcSliceInfo info){
        SetRequestDMO rc = new SetRequestDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public SetRequestDMO(DmcTypeModifierMV mods) {
        super("SetRequest");
        modrec(true);
        setModifier(mods);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public String getTargetObjectClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__targetObjectClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets targetObjectClass to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setTargetObjectClass(String value) {
        DmcAttribute<?> attr = get(__targetObjectClass);
        if (attr == null)
            attr = new DmcTypeStringSV(__targetObjectClass);
        
        try{
            attr.set(value);
            set(__targetObjectClass,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets targetObjectClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setTargetObjectClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__targetObjectClass);
        if (attr == null)
            attr = new DmcTypeStringSV(__targetObjectClass);
        
        attr.set(value);
        set(__targetObjectClass,attr);
    }

    /**
     * Removes the targetObjectClass attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remTargetObjectClass(){
         rem(__targetObjectClass);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public NameContainer getTarget(){
        DmcTypeNameContainerSV attr = (DmcTypeNameContainerSV) get(__target);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setTarget(NameContainer value) {
        DmcAttribute<?> attr = get(__target);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(__target);
        
        try{
            attr.set(value);
            set(__target,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:643)
    public void setTarget(DmcObjectName value) {
        DmcAttribute<?> attr = get(__target);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(__target);
        
        try{
            attr.set(value);
            set(__target,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The alternative type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets target to the specified value.
     * @param value A value compatible with DmcTypeNameContainerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setTarget(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__target);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(__target);
        
        attr.set(value);
        set(__target,attr);
    }

    /**
     * Removes the target attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remTarget(){
         rem(__target);
    }

    /**
     * @return An Iterator of Modifier objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:802)
    public Iterator<Modifier> getModify(){
        DmcTypeModifierMV attr = (DmcTypeModifierMV) get(__modify);
        if (attr == null)
            return( ((List<Modifier>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Modifier value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:814)
    public Modifier getNthModify(int i){
        DmcTypeModifierMV attr = (DmcTypeModifierMV) get(__modify);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another modify to the specified value.
     * @param value Modifier
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:827)
    public DmcAttribute<?> addModify(Modifier value) {
        DmcAttribute<?> attr = get(__modify);
        if (attr == null)
            attr = new DmcTypeModifierMV(__modify);
        
        try{
            setLastValue(attr.add(value));
            add(__modify,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Modifier.
     * @param value Modifier
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:869)
    public boolean modifyContains(Modifier value) {
        DmcAttribute<?> attr = get(__modify);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another modify value.
     * @param value A value compatible with Modifier
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addModify(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__modify);
        if (attr == null)
            attr = new DmcTypeModifierMV(__modify);
        
        setLastValue(attr.add(value));
        add(__modify,attr);
        return(attr);
    }

    /**
     * Returns the number of values in modify
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getModifySize(){
        DmcAttribute<?> attr = get(__modify);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a modify value.
     * @param value The Modifier to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:960)
    public DmcAttribute<?> delModify(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__modify);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeModifierMV(__modify), value);
        else
            attr = del(__modify, value);
        
        return(attr);
    }

    /**
     * Deletes a modify from the specified value.
     * @param value Modifier
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:976)
    public DmcAttribute<?> delModify(Modifier value) {
        DmcAttribute<?> attr = get(__modify);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeModifierMV(__modify), value);
        else
            attr = del(__modify, value);
        
        return(attr);
    }

    /**
     * Removes the modify attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remModify(){
         rem(__modify);
    }




}

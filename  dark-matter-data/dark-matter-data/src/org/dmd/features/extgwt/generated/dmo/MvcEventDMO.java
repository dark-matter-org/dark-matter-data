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
package org.dmd.features.extgwt.generated.dmo;

// Generated from:  org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:270)
import java.io.Serializable;                                           // Always required
import java.util.*;                                                    // Always required
import org.dmd.dmc.DmcAttribute;                                       // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                   // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                   // Named object
import org.dmd.dmc.DmcValueException;                                  // Any attributes
import org.dmd.dmc.types.StringName;                                   // Naming attribute type
import org.dmd.dms.generated.enums.ValueTypeEnum;                      // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                   // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                  // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringMV;                    // Required type
import org.dmd.dms.generated.types.DmcTypeStringNameSV;                // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                    // Required type
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;         // Base class

/**
 * The MvcEvent class allows for the definition of events that are  handled
 * or emitted by Views and Controllers. By providing a description, you help
 * to document your application.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:129)
 */
@SuppressWarnings("serial")
public class MvcEventDMO  extends MvcDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "MvcEvent";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __definedBy = new DmcAttributeInfo("definedBy",604,"String",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __definedInMVCConfig = new DmcAttributeInfo("definedInMVCConfig",616,"MvcConfig",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __emittedBy = new DmcAttributeInfo("emittedBy",605,"String",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __isHistoryEvent = new DmcAttributeInfo("isHistoryEvent",617,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __upperConstantName = new DmcAttributeInfo("upperConstantName",205,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __userDataCollection = new DmcAttributeInfo("userDataCollection",620,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __userDataGenericSpec = new DmcAttributeInfo("userDataGenericSpec",621,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __userDataType = new DmcAttributeInfo("userDataType",608,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__definedBy.id,__definedBy);
        _ImAp.put(__definedInMVCConfig.id,__definedInMVCConfig);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__emittedBy.id,__emittedBy);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__isHistoryEvent.id,__isHistoryEvent);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__name.id,__name);
        _ImAp.put(__upperConstantName.id,__upperConstantName);
        _ImAp.put(__userDataCollection.id,__userDataCollection);
        _ImAp.put(__userDataGenericSpec.id,__userDataGenericSpec);
        _ImAp.put(__userDataType.id,__userDataType);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__definedBy.name,__definedBy);
        _SmAp.put(__definedInMVCConfig.name,__definedInMVCConfig);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__emittedBy.name,__emittedBy);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__isHistoryEvent.name,__isHistoryEvent);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__name.name,__name);
        _SmAp.put(__upperConstantName.name,__upperConstantName);
        _SmAp.put(__userDataCollection.name,__userDataCollection);
        _SmAp.put(__userDataGenericSpec.name,__userDataGenericSpec);
        _SmAp.put(__userDataType.name,__userDataType);
    }

    public MvcEventDMO() {
        super("MvcEvent");
    }

    protected MvcEventDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public MvcEventDMO getNew(){
        MvcEventDMO rc = new MvcEventDMO();
        return(rc);
    }

    public MvcEventDMO(DmcTypeModifierMV mods) {
        super("MvcEvent");
        modrec(true);
        setModifier(mods);
    }

    public MvcEventDMO getModificationRecorder(){
        MvcEventDMO rc = new MvcEventDMO(new DmcTypeModifierMV());
        rc.setName(getName());
        return(rc);
    }

    //  org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:669)
    public StringName getObjectName(){
        DmcAttribute<?> name = get(__name);
        if (name != null)
            return((StringName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__name);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcEventDMO){
            return( getObjectName().equals( ((MvcEventDMO) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:558)
    public String getDescription(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:595)
    public void setDescription(String value) {
        DmcAttribute<?> attr = get(__description);
        if (attr == null)
            attr = new DmcTypeStringSV(__description);
        
        try{
            attr.set(value);
            set(__description,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__description);
        if (attr == null)
            attr = new DmcTypeStringSV(__description);
        
        attr.set(value);
        set(__description,attr);
    }

    /**
     * Removes the description attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:637)
    public void remDescription(){
         rem(__description);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:558)
    public String getUserDataType(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__userDataType);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets userDataType to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:595)
    public void setUserDataType(String value) {
        DmcAttribute<?> attr = get(__userDataType);
        if (attr == null)
            attr = new DmcTypeStringSV(__userDataType);
        
        try{
            attr.set(value);
            set(__userDataType,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets userDataType to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
    public void setUserDataType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__userDataType);
        if (attr == null)
            attr = new DmcTypeStringSV(__userDataType);
        
        attr.set(value);
        set(__userDataType,attr);
    }

    /**
     * Removes the userDataType attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:637)
    public void remUserDataType(){
         rem(__userDataType);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:558)
    public Boolean isIsHistoryEvent(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(__isHistoryEvent);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets isHistoryEvent to the specified value.
     * @param value Boolean
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:595)
    public void setIsHistoryEvent(Boolean value) {
        DmcAttribute<?> attr = get(__isHistoryEvent);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__isHistoryEvent);
        
        try{
            attr.set(value);
            set(__isHistoryEvent,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets isHistoryEvent to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
    public void setIsHistoryEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__isHistoryEvent);
        if (attr == null)
            attr = new DmcTypeBooleanSV(__isHistoryEvent);
        
        attr.set(value);
        set(__isHistoryEvent,attr);
    }

    /**
     * Removes the isHistoryEvent attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:637)
    public void remIsHistoryEvent(){
         rem(__isHistoryEvent);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:558)
    public String getUserDataCollection(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__userDataCollection);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets userDataCollection to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:595)
    public void setUserDataCollection(String value) {
        DmcAttribute<?> attr = get(__userDataCollection);
        if (attr == null)
            attr = new DmcTypeStringSV(__userDataCollection);
        
        try{
            attr.set(value);
            set(__userDataCollection,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets userDataCollection to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
    public void setUserDataCollection(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__userDataCollection);
        if (attr == null)
            attr = new DmcTypeStringSV(__userDataCollection);
        
        attr.set(value);
        set(__userDataCollection,attr);
    }

    /**
     * Removes the userDataCollection attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:637)
    public void remUserDataCollection(){
         rem(__userDataCollection);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:558)
    public String getUserDataGenericSpec(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__userDataGenericSpec);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets userDataGenericSpec to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:595)
    public void setUserDataGenericSpec(String value) {
        DmcAttribute<?> attr = get(__userDataGenericSpec);
        if (attr == null)
            attr = new DmcTypeStringSV(__userDataGenericSpec);
        
        try{
            attr.set(value);
            set(__userDataGenericSpec,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets userDataGenericSpec to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
    public void setUserDataGenericSpec(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__userDataGenericSpec);
        if (attr == null)
            attr = new DmcTypeStringSV(__userDataGenericSpec);
        
        attr.set(value);
        set(__userDataGenericSpec,attr);
    }

    /**
     * Removes the userDataGenericSpec attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:637)
    public void remUserDataGenericSpec(){
         rem(__userDataGenericSpec);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:742)
    public Iterator<String> getEmittedBy(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(__emittedBy);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * Adds another emittedBy to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:755)
    public DmcAttribute<?> addEmittedBy(String value) {
        DmcAttribute<?> attr = get(__emittedBy);
        if (attr == null)
            attr = new DmcTypeStringMV(__emittedBy);
        
        try{
            setLastValue(attr.add(value));
            add(__emittedBy,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:775)
    public boolean emittedByContains(String value) {
        DmcAttribute<?> attr = get(__emittedBy);
        return(attr.contains(value));
    }

    /**
     * Adds another emittedBy value.
     * @param value A value compatible with String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:790)
    public DmcAttribute<?> addEmittedBy(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__emittedBy);
        if (attr == null)
            attr = new DmcTypeStringMV(__emittedBy);
        
        setLastValue(attr.add(value));
        add(__emittedBy,attr);
        return(attr);
    }

    /**
     * Returns the number of values in emittedBy
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:807)
    public int getEmittedBySize(){
        DmcAttribute<?> attr = get(__emittedBy);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a emittedBy value.
     * @param value The String to be deleted from set of attribute values.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:849)
    public DmcAttribute<?> delEmittedBy(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__emittedBy);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(__emittedBy), value);
        else
            attr = del(__emittedBy, value);
        
        return(attr);
    }

    /**
     * Removes the emittedBy attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:867)
    public void remEmittedBy(){
         rem(__emittedBy);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:558)
    public String getUpperConstantName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__upperConstantName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets upperConstantName to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:595)
    public void setUpperConstantName(String value) {
        DmcAttribute<?> attr = get(__upperConstantName);
        if (attr == null)
            attr = new DmcTypeStringSV(__upperConstantName);
        
        try{
            attr.set(value);
            set(__upperConstantName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets upperConstantName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
    public void setUpperConstantName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__upperConstantName);
        if (attr == null)
            attr = new DmcTypeStringSV(__upperConstantName);
        
        attr.set(value);
        set(__upperConstantName,attr);
    }

    /**
     * Removes the upperConstantName attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:637)
    public void remUpperConstantName(){
         rem(__upperConstantName);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:558)
    public StringName getName(){
        DmcTypeStringNameSV attr = (DmcTypeStringNameSV) get(__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:595)
    public void setName(StringName value) {
        DmcAttribute<?> attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__name);
        
        try{
            attr.set(value);
            set(__name,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__name);
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:637)
    public void remName(){
         rem(__name);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:742)
    public Iterator<String> getDefinedBy(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(__definedBy);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * Adds another definedBy to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:755)
    public DmcAttribute<?> addDefinedBy(String value) {
        DmcAttribute<?> attr = get(__definedBy);
        if (attr == null)
            attr = new DmcTypeStringMV(__definedBy);
        
        try{
            setLastValue(attr.add(value));
            add(__definedBy,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:775)
    public boolean definedByContains(String value) {
        DmcAttribute<?> attr = get(__definedBy);
        return(attr.contains(value));
    }

    /**
     * Adds another definedBy value.
     * @param value A value compatible with String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:790)
    public DmcAttribute<?> addDefinedBy(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__definedBy);
        if (attr == null)
            attr = new DmcTypeStringMV(__definedBy);
        
        setLastValue(attr.add(value));
        add(__definedBy,attr);
        return(attr);
    }

    /**
     * Returns the number of values in definedBy
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:807)
    public int getDefinedBySize(){
        DmcAttribute<?> attr = get(__definedBy);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a definedBy value.
     * @param value The String to be deleted from set of attribute values.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:849)
    public DmcAttribute<?> delDefinedBy(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__definedBy);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(__definedBy), value);
        else
            attr = del(__definedBy, value);
        
        return(attr);
    }

    /**
     * Removes the definedBy attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:867)
    public void remDefinedBy(){
         rem(__definedBy);
    }




}

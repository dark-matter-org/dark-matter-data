//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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
package org.dmd.mvw.tools.mvwgenerator.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:323)
import java.io.Serializable;                                                  // Always required
import java.util.*;                                                           // Always required
import org.dmd.dmc.DmcAttribute;                                              // Any attributes
import org.dmd.dmc.DmcNamedObjectIF;                                          // Named object
import org.dmd.dmc.DmcSliceInfo;                                              // Required for object slicing
import org.dmd.dmc.DmcValueException;                                         // Any attributes
import org.dmd.dmc.types.CamelCaseName;                                       // Naming attribute type
import org.dmd.dms.generated.dmo.MetaDMSAG;                                   // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                          // Required type
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                    // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                         // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringSET;                          // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                           // Required type
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;         // Base class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The GxtEnumMapping class allows for generation of a set of static data
 * instances that represent the values from the specified enumeration (type).
 * NOTE: this mechanism is only  useful if you are using the Sencha's Gxt
 * widget set.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class GxtEnumMappingDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "GxtEnumMapping";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public GxtEnumMappingDMO() {
        super("GxtEnumMapping");
    }

    protected GxtEnumMappingDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public GxtEnumMappingDMO getNew(){
        GxtEnumMappingDMO rc = new GxtEnumMappingDMO();
        return(rc);
    }

    @Override
    public GxtEnumMappingDMO getSlice(DmcSliceInfo info){
        GxtEnumMappingDMO rc = new GxtEnumMappingDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public GxtEnumMappingDMO(DmcTypeModifierMV mods) {
        super("GxtEnumMapping");
        modrec(true);
        setModifier(mods);
    }

    public GxtEnumMappingDMO getModificationRecorder(){
        GxtEnumMappingDMO rc = new GxtEnumMappingDMO();
        rc.setMappingName(getMappingName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:736)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__mappingName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__mappingName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof GxtEnumMappingDMO){
            return( getObjectName().equals( ((GxtEnumMappingDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:644)
    public Boolean isUseNameAsLabel(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MvwDMSAG.__useNameAsLabel);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets useNameAsLabel to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:682)
    public void setUseNameAsLabel(Boolean value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__useNameAsLabel);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__useNameAsLabel);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__useNameAsLabel,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets useNameAsLabel to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:734)
    public void setUseNameAsLabel(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__useNameAsLabel);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__useNameAsLabel);
        
        attr.set(value);
        set(MvwDMSAG.__useNameAsLabel,attr);
    }

    /**
     * Removes the useNameAsLabel attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:749)
    public void remUseNameAsLabel(){
         rem(MvwDMSAG.__useNameAsLabel);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:947)
    public Iterator<String> getSkipEnumValue(){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(MvwDMSAG.__skipEnumValue);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:959)
    public String getNthSkipEnumValue(int i){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(MvwDMSAG.__skipEnumValue);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another skipEnumValue to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:973)
    public DmcAttribute<?> addSkipEnumValue(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__skipEnumValue);
        if (attr == null)
            attr = new DmcTypeStringSET(MvwDMSAG.__skipEnumValue);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__skipEnumValue,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1047)
    public boolean skipEnumValueContains(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__skipEnumValue);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another skipEnumValue value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1079)
    public DmcAttribute<?> addSkipEnumValue(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__skipEnumValue);
        if (attr == null)
            attr = new DmcTypeStringSET(MvwDMSAG.__skipEnumValue);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__skipEnumValue,attr);
        return(attr);
    }

    /**
     * Returns the number of values in skipEnumValue
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1096)
    public int getSkipEnumValueSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__skipEnumValue);
        if (attr == null){
            if (MvwDMSAG.__skipEnumValue.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__skipEnumValue.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a skipEnumValue value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1141)
    public DmcAttribute<?> delSkipEnumValue(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__skipEnumValue);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(MvwDMSAG.__skipEnumValue), value);
        else
            attr = del(MvwDMSAG.__skipEnumValue, value);
        
        return(attr);
    }

    /**
     * Deletes a skipEnumValue from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1157)
    public DmcAttribute<?> delSkipEnumValue(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__skipEnumValue);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(MvwDMSAG.__skipEnumValue), value);
        else
            attr = del(MvwDMSAG.__skipEnumValue, value);
        
        return(attr);
    }

    /**
     * Removes the skipEnumValue attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1176)
    public void remSkipEnumValue(){
         rem(MvwDMSAG.__skipEnumValue);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:644)
    public CamelCaseName getMappingName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__mappingName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets mappingName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:682)
    public void setMappingName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__mappingName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__mappingName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__mappingName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets mappingName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:734)
    public void setMappingName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__mappingName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__mappingName);
        
        attr.set(value);
        set(MvwDMSAG.__mappingName,attr);
    }

    /**
     * Removes the mappingName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:749)
    public void remMappingName(){
         rem(MvwDMSAG.__mappingName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:644)
    public String getEnumName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__enumName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets enumName to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:682)
    public void setEnumName(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__enumName);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__enumName);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__enumName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets enumName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:734)
    public void setEnumName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__enumName);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__enumName);
        
        attr.set(value);
        set(MetaDMSAG.__enumName,attr);
    }

    /**
     * Removes the enumName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:749)
    public void remEnumName(){
         rem(MetaDMSAG.__enumName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:644)
    public String getUnsetValue(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MvwDMSAG.__unsetValue);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets unsetValue to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:682)
    public void setUnsetValue(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__unsetValue);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__unsetValue);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__unsetValue,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets unsetValue to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:734)
    public void setUnsetValue(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__unsetValue);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__unsetValue);
        
        attr.set(value);
        set(MvwDMSAG.__unsetValue,attr);
    }

    /**
     * Removes the unsetValue attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:749)
    public void remUnsetValue(){
         rem(MvwDMSAG.__unsetValue);
    }




}

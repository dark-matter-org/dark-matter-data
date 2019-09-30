//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
package org.dmd.templates.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:408)
import java.io.Serializable;                                                 // Always required - (GenUtility.java:227)
import java.util.*;                                                          // Always required if we have any MV attributes - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                                             // Named object - (GenUtility.java:388)
import org.dmd.dmc.DmcNamedObjectIF;                                         // Named object - (GenUtility.java:387)
import org.dmd.dmc.DmcOmni;                                                  // Lazy resolution - (GenUtility.java:331)
import org.dmd.dmc.DmcSliceInfo;                                             // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                                        // Any attributes - (GenUtility.java:249)
import org.dmd.dmc.types.DefinitionName;                                     // Naming attribute type - (GenUtility.java:382)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                  // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                         // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV;                  // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                        // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dms.generated.types.DmcTypeStringSV;                          // Required type - (GenUtility.java:339)
import org.dmd.templates.shared.generated.dmo.ContainedElementDMO;           // Base class - (GenUtility.java:367)
import org.dmd.templates.shared.generated.dmo.SectionDMO;                    // Type specific set/add - (GenUtility.java:318)
import org.dmd.templates.shared.generated.types.Contains;                    // Primitive type - (GenUtility.java:282)
import org.dmd.templates.shared.generated.types.DmcTypeContainsMV;           // Required type - (GenUtility.java:339)
import org.dmd.templates.shared.generated.types.DmcTypeSectionREFSV;         // Reference type - (GenUtility.java:311)
import org.dmd.templates.shared.generated.types.DmcTypeValueMV;              // Required type - (GenUtility.java:339)
import org.dmd.templates.shared.generated.types.SectionREF;                  // Helper class - (GenUtility.java:346)
import org.dmd.templates.shared.generated.types.Value;                       // Primitive type - (GenUtility.java:282)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * A Section represents part of a textual artifact that you want to format.\n
 * The artifact could be an XHTML document, an XML document, a piece of code,
 * a form\n letter - whatever. The content of a Section may start with
 * another Section or static\n piece of text and, likewise, end with a
 * Section or static piece of text.\n <p>\n Sections can also contain other
 * (sub) Sections. \n <p>\n Sections can also have named values that can be
 * inserted into Templates. By specifying\n values, you define a set of
 * values that can be accessed and embedded within the associated\n
 * Template.\n <p>\n When a Section's format() method is called, it will dump
 * the contents in the following order:\n <ul>\n <li> any starts with
 * material </li>\n <li> the formatted contents of the associated Template
 * </li>\n <li> the formatted contents of any contained Sections </li>\n <li>
 * any ends with material </li>\n </ul>
 * <P>
 * Generated from the dmtdl schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class SectionDMO  extends ContainedElementDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "Section";


    static {
    }

    public SectionDMO() {
        super("Section");
    }

    protected SectionDMO(String oc) {
        super(oc);
    }

    @Override
    public SectionDMO getNew(){
        SectionDMO rc = new SectionDMO();
        return(rc);
    }

    @Override
    public SectionDMO getSlice(DmcSliceInfo info){
        SectionDMO rc = new SectionDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public SectionDMO(DmcTypeModifierMV mods) {
        super("Section");
        modrec(true);
        setModifier(mods);
    }

    public SectionDMO getModificationRecorder(){
        SectionDMO rc = new SectionDMO();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:752)
    public DefinitionName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        if (name != null)
            return((DefinitionName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:769)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public boolean equals(Object obj){
        if (obj instanceof SectionDMO){
            return( getObjectName().equals( ((SectionDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:784)
    public int hashCode(){
        DefinitionName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    /**
     * @return An Iterator of Contains objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1289)
    public Iterator<Contains> getContains(){
        DmcTypeContainsMV attr = (DmcTypeContainsMV) get(DmtdlDMSAG.__contains);
        if (attr == null)
            return( ((List<Contains>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Contains value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1301)
    public Contains getNthContains(int i){
        DmcTypeContainsMV attr = (DmcTypeContainsMV) get(DmtdlDMSAG.__contains);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another contains to the specified value.
     * @param value Contains
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1315)
    public DmcAttribute<?> addContains(Contains value) {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__contains);
        if (attr == null)
            attr = new DmcTypeContainsMV(DmtdlDMSAG.__contains);
        
        try{
            setLastValue(attr.add(value));
            add(DmtdlDMSAG.__contains,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Contains.
     * @param value Contains
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1390)
    public boolean containsContains(Contains value) {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__contains);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another contains value.
     * @param value A value compatible with Contains
     * @return the attribute instance
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1424)
    public DmcAttribute<?> addContains(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__contains);
        if (attr == null)
            attr = new DmcTypeContainsMV(DmtdlDMSAG.__contains);
        
        setLastValue(attr.add(value));
        add(DmtdlDMSAG.__contains,attr);
        return(attr);
    }

    /**
     * @return the number of values in contains
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1441)
    public int getContainsSize(){
        DmcAttribute<?> attr = get(DmtdlDMSAG.__contains);
        if (attr == null){
            if (DmtdlDMSAG.__contains.indexSize == 0)
                return(0);
            else
                return(DmtdlDMSAG.__contains.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a contains value.
     * @param value The Contains to be deleted from set of attribute values.
     * @return the deleted attribute instance     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1502)
    public DmcAttribute<?> delContains(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__contains);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeContainsMV(DmtdlDMSAG.__contains), value);
        else
            attr = del(DmtdlDMSAG.__contains, value);
        
        return(attr);
    }

    /**
     * Deletes a contains from the specified value.
     * @param value Contains
     * @return the deleted attribute instance     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1519)
    public DmcAttribute<?> delContains(Contains value) {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__contains);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeContainsMV(DmtdlDMSAG.__contains), value);
        else
            attr = del(DmtdlDMSAG.__contains, value);
        
        return(attr);
    }

    /**
     * Removes the contains attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1538)
    public void remContains(){
         rem(DmtdlDMSAG.__contains);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:678)
    /**
     * @return the SectionREF
     */
    public SectionREF getStartsWith(){
        DmcTypeSectionREFSV attr = (DmcTypeSectionREFSV) get(DmtdlDMSAG.__startsWith);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getSV());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:700)
    /**
     * @return the reference to Section without attempting lazy resolution (if turned on).
     */
    public SectionREF getStartsWithREF(){
        DmcTypeSectionREFSV attr = (DmcTypeSectionREFSV) get(DmtdlDMSAG.__startsWith);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:718)
    /**
     * Sets startsWith to the specified value.
     * @param value SectionDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:723)
    public void setStartsWith(SectionDMO value) {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__startsWith);
        if (attr == null)
            attr = new DmcTypeSectionREFSV(DmtdlDMSAG.__startsWith);
        else
            ((DmcTypeSectionREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(DmtdlDMSAG.__startsWith,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets startsWith to the specified value.
     * @param value A value compatible with DmcTypeSectionREFSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setStartsWith(Object value) throws DmcValueException {
        DmcTypeSectionREFSV attr  = (DmcTypeSectionREFSV) get(DmtdlDMSAG.__startsWith);
        if (attr == null)
            attr = new DmcTypeSectionREFSV(DmtdlDMSAG.__startsWith);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DmtdlDMSAG.__startsWith,attr);
    }

    /**
     * Removes the startsWith attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remStartsWith(){
         rem(DmtdlDMSAG.__startsWith);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:678)
    /**
     * @return the SectionREF
     */
    public SectionREF getEndsWith(){
        DmcTypeSectionREFSV attr = (DmcTypeSectionREFSV) get(DmtdlDMSAG.__endsWith);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getSV());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:700)
    /**
     * @return the reference to Section without attempting lazy resolution (if turned on).
     */
    public SectionREF getEndsWithREF(){
        DmcTypeSectionREFSV attr = (DmcTypeSectionREFSV) get(DmtdlDMSAG.__endsWith);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:718)
    /**
     * Sets endsWith to the specified value.
     * @param value SectionDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:723)
    public void setEndsWith(SectionDMO value) {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__endsWith);
        if (attr == null)
            attr = new DmcTypeSectionREFSV(DmtdlDMSAG.__endsWith);
        else
            ((DmcTypeSectionREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(DmtdlDMSAG.__endsWith,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets endsWith to the specified value.
     * @param value A value compatible with DmcTypeSectionREFSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setEndsWith(Object value) throws DmcValueException {
        DmcTypeSectionREFSV attr  = (DmcTypeSectionREFSV) get(DmtdlDMSAG.__endsWith);
        if (attr == null)
            attr = new DmcTypeSectionREFSV(DmtdlDMSAG.__endsWith);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DmtdlDMSAG.__endsWith,attr);
    }

    /**
     * Removes the endsWith attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remEndsWith(){
         rem(DmtdlDMSAG.__endsWith);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
    public String getStartsWithText(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmtdlDMSAG.__startsWithText);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets startsWithText to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
    public void setStartsWithText(String value) {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__startsWithText);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtdlDMSAG.__startsWithText);
        
        try{
            attr.set(value);
            set(DmtdlDMSAG.__startsWithText,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets startsWithText to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setStartsWithText(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmtdlDMSAG.__startsWithText);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtdlDMSAG.__startsWithText);
        
        attr.set(value);
        set(DmtdlDMSAG.__startsWithText,attr);
    }

    /**
     * Removes the startsWithText attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remStartsWithText(){
         rem(DmtdlDMSAG.__startsWithText);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
    public String getEndsWithText(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmtdlDMSAG.__endsWithText);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets endsWithText to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
    public void setEndsWithText(String value) {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__endsWithText);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtdlDMSAG.__endsWithText);
        
        try{
            attr.set(value);
            set(DmtdlDMSAG.__endsWithText,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets endsWithText to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setEndsWithText(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmtdlDMSAG.__endsWithText);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtdlDMSAG.__endsWithText);
        
        attr.set(value);
        set(DmtdlDMSAG.__endsWithText,attr);
    }

    /**
     * Removes the endsWithText attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remEndsWithText(){
         rem(DmtdlDMSAG.__endsWithText);
    }

    /**
     * @return An Iterator of Value objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1289)
    public Iterator<Value> getValue(){
        DmcTypeValueMV attr = (DmcTypeValueMV) get(DmtdlDMSAG.__value);
        if (attr == null)
            return( ((List<Value>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Value value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1301)
    public Value getNthValue(int i){
        DmcTypeValueMV attr = (DmcTypeValueMV) get(DmtdlDMSAG.__value);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another value to the specified value.
     * @param value Value
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1315)
    public DmcAttribute<?> addValue(Value value) {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__value);
        if (attr == null)
            attr = new DmcTypeValueMV(DmtdlDMSAG.__value);
        
        try{
            setLastValue(attr.add(value));
            add(DmtdlDMSAG.__value,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Value.
     * @param value Value
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1390)
    public boolean valueContains(Value value) {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__value);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another value value.
     * @param value A value compatible with Value
     * @return the attribute instance
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1424)
    public DmcAttribute<?> addValue(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__value);
        if (attr == null)
            attr = new DmcTypeValueMV(DmtdlDMSAG.__value);
        
        setLastValue(attr.add(value));
        add(DmtdlDMSAG.__value,attr);
        return(attr);
    }

    /**
     * @return the number of values in value
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1441)
    public int getValueSize(){
        DmcAttribute<?> attr = get(DmtdlDMSAG.__value);
        if (attr == null){
            if (DmtdlDMSAG.__value.indexSize == 0)
                return(0);
            else
                return(DmtdlDMSAG.__value.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a value value.
     * @param value The Value to be deleted from set of attribute values.
     * @return the deleted attribute instance     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1502)
    public DmcAttribute<?> delValue(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__value);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeValueMV(DmtdlDMSAG.__value), value);
        else
            attr = del(DmtdlDMSAG.__value, value);
        
        return(attr);
    }

    /**
     * Deletes a value from the specified value.
     * @param value Value
     * @return the deleted attribute instance     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1519)
    public DmcAttribute<?> delValue(Value value) {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__value);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeValueMV(DmtdlDMSAG.__value), value);
        else
            attr = del(DmtdlDMSAG.__value, value);
        
        return(attr);
    }

    /**
     * Removes the value attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1538)
    public void remValue(){
         rem(DmtdlDMSAG.__value);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
    public Boolean isHasTemplate(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(DmtdlDMSAG.__hasTemplate);
        if (attr == null)
            return(true);

        return(attr.getSV());
    }

    /**
     * Sets hasTemplate to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
    public void setHasTemplate(Boolean value) {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__hasTemplate);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmtdlDMSAG.__hasTemplate);
        
        try{
            attr.set(value);
            set(DmtdlDMSAG.__hasTemplate,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets hasTemplate to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setHasTemplate(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(DmtdlDMSAG.__hasTemplate);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmtdlDMSAG.__hasTemplate);
        
        attr.set(value);
        set(DmtdlDMSAG.__hasTemplate,attr);
    }

    /**
     * Removes the hasTemplate attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remHasTemplate(){
         rem(DmtdlDMSAG.__hasTemplate);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
    public Boolean isUsesTemplate(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(DmtdlDMSAG.__usesTemplate);
        if (attr == null)
            return(true);

        return(attr.getSV());
    }

    /**
     * Sets usesTemplate to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
    public void setUsesTemplate(Boolean value) {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__usesTemplate);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmtdlDMSAG.__usesTemplate);
        
        try{
            attr.set(value);
            set(DmtdlDMSAG.__usesTemplate,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets usesTemplate to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setUsesTemplate(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(DmtdlDMSAG.__usesTemplate);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmtdlDMSAG.__usesTemplate);
        
        attr.set(value);
        set(DmtdlDMSAG.__usesTemplate,attr);
    }

    /**
     * Removes the usesTemplate attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remUsesTemplate(){
         rem(DmtdlDMSAG.__usesTemplate);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
    public DefinitionName getName(){
        DmcTypeDefinitionNameSV attr = (DmcTypeDefinitionNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
    public void setName(DefinitionName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__name,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setName(Object value) throws DmcValueException {
        DmcTypeDefinitionNameSV attr  = (DmcTypeDefinitionNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remName(){
         rem(MetaDMSAG.__name);
    }




}

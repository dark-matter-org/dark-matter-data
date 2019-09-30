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
package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:408)
import java.io.Serializable;                                                        // Always required - (GenUtility.java:227)
import java.util.*;                                                                 // Always required if we have any MV attributes - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                                                    // Any attributes - (GenUtility.java:248)
import org.dmd.dmc.DmcObject;                                                       // Structural class - (GenUtility.java:362)
import org.dmd.dmc.DmcOmni;                                                         // Lazy resolution - (GenUtility.java:331)
import org.dmd.dmc.DmcSliceInfo;                                                    // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                                               // Any attributes - (GenUtility.java:249)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                         // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                                // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                               // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;                             // Type specific set/add - (GenUtility.java:318)
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;                    // Type specific set/add - (GenUtility.java:318)
import org.dmd.dmt.shared.generated.types.DmcTypeObjWithRefsREFMV;                  // Reference type - (GenUtility.java:311)
import org.dmd.dmt.shared.generated.types.DmcTypeTestBasicObjectFixedREFMV;         // Reference type - (GenUtility.java:311)
import org.dmd.dmt.shared.generated.types.DmcTypeTestBasicObjectFixedREFSV;         // Reference type - (GenUtility.java:311)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;                           // Helper class - (GenUtility.java:346)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * Used to test the DmcUncheckedOIFParser in the creation of
 * DmcUncheckedObjects within DmcUncheckedObjects.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class ParseTestDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "ParseTest";


    static {
    }

    public ParseTestDMO() {
        super("ParseTest");
    }

    protected ParseTestDMO(String oc) {
        super(oc);
    }

    @Override
    public ParseTestDMO getNew(){
        ParseTestDMO rc = new ParseTestDMO();
        return(rc);
    }

    @Override
    public ParseTestDMO getSlice(DmcSliceInfo info){
        ParseTestDMO rc = new ParseTestDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ParseTestDMO(DmcTypeModifierMV mods) {
        super("ParseTest");
        modrec(true);
        setModifier(mods);
    }

    public ParseTestDMO getModificationRecorder(){
        ParseTestDMO rc = new ParseTestDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:661)
    /**
     * @return the TestBasicObjectFixedDMO
     */
    public TestBasicObjectFixedDMO getSvUnnamedObj(){
        DmcTypeTestBasicObjectFixedREFSV attr = (DmcTypeTestBasicObjectFixedREFSV) get(DmtDMSAG.__svUnnamedObj);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:718)
    /**
     * Sets svUnnamedObj to the specified value.
     * @param value TestBasicObjectFixedDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:723)
    public void setSvUnnamedObj(TestBasicObjectFixedDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__svUnnamedObj);
        if (attr == null)
            attr = new DmcTypeTestBasicObjectFixedREFSV(DmtDMSAG.__svUnnamedObj);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__svUnnamedObj,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svUnnamedObj to the specified value.
     * @param value A value compatible with DmcTypeTestBasicObjectFixedREFSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setSvUnnamedObj(Object value) throws DmcValueException {
        DmcTypeTestBasicObjectFixedREFSV attr  = (DmcTypeTestBasicObjectFixedREFSV) get(DmtDMSAG.__svUnnamedObj);
        if (attr == null)
            attr = new DmcTypeTestBasicObjectFixedREFSV(DmtDMSAG.__svUnnamedObj);
        
        attr.set(value);
        set(DmtDMSAG.__svUnnamedObj,attr);
    }

    /**
     * Removes the svUnnamedObj attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remSvUnnamedObj(){
         rem(DmtDMSAG.__svUnnamedObj);
    }

    /**
     * @return An Iterator of TestBasicObjectFixedDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1134)
    public Iterator<TestBasicObjectFixedDMO> getMvUnnamedObj(){
        DmcTypeTestBasicObjectFixedREFMV attr = (DmcTypeTestBasicObjectFixedREFMV) get(DmtDMSAG.__mvUnnamedObj);
        if (attr == null)
            return( ((List<TestBasicObjectFixedDMO>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another mvUnnamedObj to the specified value.
     * @param value TestBasicObjectFixed
     * @return the attribute instance
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1181)
    public DmcAttribute<?> addMvUnnamedObj(TestBasicObjectFixedDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvUnnamedObj);
        if (attr == null)
            attr = new DmcTypeTestBasicObjectFixedREFMV(DmtDMSAG.__mvUnnamedObj);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__mvUnnamedObj,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another mvUnnamedObj value.
     * @param value A value compatible with TestBasicObjectFixed
     * @return the attribute instance
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1424)
    public DmcAttribute<?> addMvUnnamedObj(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvUnnamedObj);
        if (attr == null)
            attr = new DmcTypeTestBasicObjectFixedREFMV(DmtDMSAG.__mvUnnamedObj);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvUnnamedObj,attr);
        return(attr);
    }

    /**
     * @return the number of values in mvUnnamedObj
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1441)
    public int getMvUnnamedObjSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvUnnamedObj);
        if (attr == null){
            if (DmtDMSAG.__mvUnnamedObj.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvUnnamedObj.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvUnnamedObj value.
     * @param value The TestBasicObjectFixed to be deleted from set of attribute values.
     * @return the deleted attribute instance     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1464)
    public DmcAttribute<?> delMvUnnamedObj(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvUnnamedObj);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeTestBasicObjectFixedREFMV(DmtDMSAG.__mvUnnamedObj), value);
        else
            attr = del(DmtDMSAG.__mvUnnamedObj, value);
        
        return(attr);
    }

    /**
     * Removes the mvUnnamedObj attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1538)
    public void remMvUnnamedObj(){
         rem(DmtDMSAG.__mvUnnamedObj);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
    public Boolean isSvBoolean(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(DmtDMSAG.__svBoolean);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets svBoolean to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
    public void setSvBoolean(Boolean value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__svBoolean);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmtDMSAG.__svBoolean);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__svBoolean,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svBoolean to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setSvBoolean(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(DmtDMSAG.__svBoolean);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmtDMSAG.__svBoolean);
        
        attr.set(value);
        set(DmtDMSAG.__svBoolean,attr);
    }

    /**
     * Removes the svBoolean attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remSvBoolean(){
         rem(DmtDMSAG.__svBoolean);
    }

    /**
     * @return The nth ObjWithRefs value and attempt lazy resolution if it's on.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1215)
    public ObjWithRefsREF getNthMvIdxNamedObj(int i){
        DmcTypeObjWithRefsREFMV attr = (DmcTypeObjWithRefsREFMV) get(DmtDMSAG.__mvIdxNamedObj);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getMVnth(i));
    }

    /**
     * @return The nth ObjWithRefs value without attempting lazy resolution.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1234)
    public ObjWithRefsREF getNthMvIdxNamedObjREF(int i){
        DmcTypeObjWithRefsREFMV attr = (DmcTypeObjWithRefsREFMV) get(DmtDMSAG.__mvIdxNamedObj);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Sets the mvIdxNamedObj value at the specified index.
     * @param value ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1248)
    public DmcAttribute<?> setNthMvIdxNamedObj(int index, ObjWithRefsDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxNamedObj);
        if (attr == null){
            if (value == null){
                if (getModifier() == null)
                    throw(new IllegalStateException("Calling setNth() on a non-existent attribute with a null value makes no sense!"));
                else{
                    nthNullFromEmptyAttribute(DmtDMSAG.__mvIdxNamedObj, index);
                    return(null);
                }
            }
            else
                attr = new DmcTypeObjWithRefsREFMV(DmtDMSAG.__mvIdxNamedObj);
        }
        
        try{
            ObjWithRefsREF previous = (ObjWithRefsREF) attr.getMVnth(index);
            setLastValue(attr.setMVnth(index, value));
            nth(DmtDMSAG.__mvIdxNamedObj,index ,attr,previous);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific setNth() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another mvIdxNamedObj value.
     * @param value A value compatible with ObjWithRefs
     * @return the attribute instance
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1424)
    public DmcAttribute<?> addMvIdxNamedObj(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxNamedObj);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFMV(DmtDMSAG.__mvIdxNamedObj);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvIdxNamedObj,attr);
        return(attr);
    }

    /**
     * @return the number of values in mvIdxNamedObj
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1441)
    public int getMvIdxNamedObjSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxNamedObj);
        if (attr == null){
            if (DmtDMSAG.__mvIdxNamedObj.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvIdxNamedObj.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvIdxNamedObj value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     * @return the deleted attribute instance     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1482)
    public DmcAttribute<?> delMvIdxNamedObj(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxNamedObj);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeObjWithRefsREFMV(DmtDMSAG.__mvIdxNamedObj), value);
        else
            attr = del(DmtDMSAG.__mvIdxNamedObj, value);
        
        return(attr);
    }

    /**
     * Removes the mvIdxNamedObj attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1538)
    public void remMvIdxNamedObj(){
         rem(DmtDMSAG.__mvIdxNamedObj);
    }

    /**
     * @return The nth TestBasicObjectFixed value without attempting lazy resolution.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1202)
    public TestBasicObjectFixedDMO getNthMvIdxUnnamedObj(int i){
        DmcTypeTestBasicObjectFixedREFMV attr = (DmcTypeTestBasicObjectFixedREFMV) get(DmtDMSAG.__mvIdxUnnamedObj);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Sets the mvIdxUnnamedObj value at the specified index.
     * @param value TestBasicObjectFixed
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1248)
    public DmcAttribute<?> setNthMvIdxUnnamedObj(int index, TestBasicObjectFixedDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxUnnamedObj);
        if (attr == null){
            if (value == null){
                if (getModifier() == null)
                    throw(new IllegalStateException("Calling setNth() on a non-existent attribute with a null value makes no sense!"));
                else{
                    nthNullFromEmptyAttribute(DmtDMSAG.__mvIdxUnnamedObj, index);
                    return(null);
                }
            }
            else
                attr = new DmcTypeTestBasicObjectFixedREFMV(DmtDMSAG.__mvIdxUnnamedObj);
        }
        
        try{
            setLastValue(attr.setMVnth(index, value));
            nth(DmtDMSAG.__mvIdxUnnamedObj, index ,attr, null);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific setNth() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another mvIdxUnnamedObj value.
     * @param value A value compatible with TestBasicObjectFixed
     * @return the attribute instance
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1424)
    public DmcAttribute<?> addMvIdxUnnamedObj(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxUnnamedObj);
        if (attr == null)
            attr = new DmcTypeTestBasicObjectFixedREFMV(DmtDMSAG.__mvIdxUnnamedObj);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvIdxUnnamedObj,attr);
        return(attr);
    }

    /**
     * @return the number of values in mvIdxUnnamedObj
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1441)
    public int getMvIdxUnnamedObjSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxUnnamedObj);
        if (attr == null){
            if (DmtDMSAG.__mvIdxUnnamedObj.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvIdxUnnamedObj.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvIdxUnnamedObj value.
     * @param value The TestBasicObjectFixed to be deleted from set of attribute values.
     * @return the deleted attribute instance     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1464)
    public DmcAttribute<?> delMvIdxUnnamedObj(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxUnnamedObj);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeTestBasicObjectFixedREFMV(DmtDMSAG.__mvIdxUnnamedObj), value);
        else
            attr = del(DmtDMSAG.__mvIdxUnnamedObj, value);
        
        return(attr);
    }

    /**
     * Removes the mvIdxUnnamedObj attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1538)
    public void remMvIdxUnnamedObj(){
         rem(DmtDMSAG.__mvIdxUnnamedObj);
    }




}

package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:393)
import java.io.Serializable;                                             // Always required - (GenUtility.java:221)
import java.util.*;                                                      // Always required if we have any MV attributes - (GenUtility.java:216)
import org.dmd.dmc.DmcAttribute;                                         // Any attributes - (GenUtility.java:237)
import org.dmd.dmc.DmcObject;                                            // Structural class - (GenUtility.java:348)
import org.dmd.dmc.DmcOmni;                                              // Lazy resolution - (GenUtility.java:329)
import org.dmd.dmc.DmcSliceInfo;                                         // Required for object slicing - (GenUtility.java:226)
import org.dmd.dmc.DmcValueException;                                    // Any attributes - (GenUtility.java:238)
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor - (GenUtility.java:225)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dms.generated.types.DmcTypeStringMV;                      // Required type - (GenUtility.java:325)
import org.dmd.dmt.shared.generated.types.DmcTypeSomeRelationMV;         // Required type - (GenUtility.java:325)
import org.dmd.dmt.shared.generated.types.SomeRelation;                  // Extended reference type - (GenUtility.java:323)

/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class UsingIndexedAttributesDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "UsingIndexedAttributes";


    static {
    }

    public UsingIndexedAttributesDMO() {
        super("UsingIndexedAttributes");
    }

    protected UsingIndexedAttributesDMO(String oc) {
        super(oc);
    }

    @Override
    public UsingIndexedAttributesDMO getNew(){
        UsingIndexedAttributesDMO rc = new UsingIndexedAttributesDMO();
        return(rc);
    }

    @Override
    public UsingIndexedAttributesDMO getSlice(DmcSliceInfo info){
        UsingIndexedAttributesDMO rc = new UsingIndexedAttributesDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public UsingIndexedAttributesDMO(DmcTypeModifierMV mods) {
        super("UsingIndexedAttributes");
        modrec(true);
        setModifier(mods);
    }

    public UsingIndexedAttributesDMO getModificationRecorder(){
        UsingIndexedAttributesDMO rc = new UsingIndexedAttributesDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return The nth SomeRelation value and attempt lazy resolution if it's on.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1035)
    public SomeRelation getNthSomeRelationIndexed(int i){
        DmcTypeSomeRelationMV attr = (DmcTypeSomeRelationMV) get(DmtDMSAG.__someRelationIndexed);
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
     * @return The nth SomeRelation value without attempting lazy resolution.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1054)
    public SomeRelation getNthSomeRelationIndexedREF(int i){
        DmcTypeSomeRelationMV attr = (DmcTypeSomeRelationMV) get(DmtDMSAG.__someRelationIndexed);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Sets the someRelationIndexed value at the specified index.
     * @param value SomeRelation
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1068)
    public DmcAttribute<?> setNthSomeRelationIndexed(int index, SomeRelation value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__someRelationIndexed);
        if (attr == null){
            if (value == null){
                if (getModifier() == null)
                    throw(new IllegalStateException("Calling setNth() on a non-existent attribute with a null value makes no sense!"));
                else{
                    nthNullFromEmptyAttribute(DmtDMSAG.__someRelationIndexed, index);
                    return(null);
                }
            }
            else
                attr = new DmcTypeSomeRelationMV(DmtDMSAG.__someRelationIndexed);
        }
        
        try{
            SomeRelation previous = (SomeRelation) attr.getMVnth(index);
            setLastValue(attr.setMVnth(index, value));
            nth(DmtDMSAG.__someRelationIndexed,index ,attr,previous);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific setNth() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another someRelationIndexed value.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> addSomeRelationIndexed(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__someRelationIndexed);
        if (attr == null)
            attr = new DmcTypeSomeRelationMV(DmtDMSAG.__someRelationIndexed);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__someRelationIndexed,attr);
        return(attr);
    }

    /**
     * Returns the number of values in someRelationIndexed
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
    public int getSomeRelationIndexedSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__someRelationIndexed);
        if (attr == null){
            if (DmtDMSAG.__someRelationIndexed.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__someRelationIndexed.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a someRelationIndexed value.
     * @param value The SomeRelation to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1298)
    public DmcAttribute<?> delSomeRelationIndexed(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__someRelationIndexed);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeSomeRelationMV(DmtDMSAG.__someRelationIndexed), value);
        else
            attr = del(DmtDMSAG.__someRelationIndexed, value);
        
        return(attr);
    }

    /**
     * Removes the someRelationIndexed attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remSomeRelationIndexed(){
         rem(DmtDMSAG.__someRelationIndexed);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public Iterator<String> getIndexedString(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(DmtDMSAG.__indexedString);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1121)
    public String getNthIndexedString(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(DmtDMSAG.__indexedString);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Sets the value at the specified index.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1156)
    public DmcAttribute<?> setNthIndexedString(int index, String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__indexedString);
        if (attr == null){
            if (value == null){
                if (getModifier() == null)
                    throw(new IllegalStateException("Calling setNth() on a non-existent attribute with a null value makes no sense!"));
                else{
                    nthNullFromEmptyAttribute(DmtDMSAG.__indexedString, index);
                    return(null);
                }
            }
            else
                attr = new DmcTypeStringMV(DmtDMSAG.__indexedString);
        }
        
        try{
            String previous = (String) attr.getMVnth(index);
            setLastValue(attr.setMVnth(index, value));
            nth(DmtDMSAG.__indexedString,index ,attr,previous);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific setNth() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1210)
    public boolean indexedStringContains(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__indexedString);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another indexedString value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> addIndexedString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__indexedString);
        if (attr == null)
            attr = new DmcTypeStringMV(DmtDMSAG.__indexedString);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__indexedString,attr);
        return(attr);
    }

    /**
     * Returns the number of values in indexedString
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
    public int getIndexedStringSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__indexedString);
        if (attr == null){
            if (DmtDMSAG.__indexedString.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__indexedString.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a indexedString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> delIndexedString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__indexedString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(DmtDMSAG.__indexedString), value);
        else
            attr = del(DmtDMSAG.__indexedString, value);
        
        return(attr);
    }

    /**
     * Deletes a indexedString from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1333)
    public DmcAttribute<?> delIndexedString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__indexedString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(DmtDMSAG.__indexedString), value);
        else
            attr = del(DmtDMSAG.__indexedString, value);
        
        return(attr);
    }

    /**
     * Removes the indexedString attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remIndexedString(){
         rem(DmtDMSAG.__indexedString);
    }




}

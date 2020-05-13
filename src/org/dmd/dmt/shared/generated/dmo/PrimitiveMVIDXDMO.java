package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:408)
import java.io.Serializable;                                  // Always required - (GenUtility.java:227)
import java.util.*;                                           // Always required if we have any MV attributes - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                              // Any attributes - (GenUtility.java:248)
import org.dmd.dmc.DmcObject;                                 // Structural class - (GenUtility.java:362)
import org.dmd.dmc.DmcSliceInfo;                              // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                         // Any attributes - (GenUtility.java:249)
import org.dmd.dms.generated.dmo.MetaDMSAG;                   // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dms.generated.types.DmcTypeStringMV;           // Required type - (GenUtility.java:339)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class PrimitiveMVIDXDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "PrimitiveMVIDX";


    static {
    }

    public PrimitiveMVIDXDMO() {
        super("PrimitiveMVIDX");
    }

    protected PrimitiveMVIDXDMO(String oc) {
        super(oc);
    }

    @Override
    public PrimitiveMVIDXDMO getNew(){
        PrimitiveMVIDXDMO rc = new PrimitiveMVIDXDMO();
        return(rc);
    }

    @Override
    public PrimitiveMVIDXDMO getSlice(DmcSliceInfo info){
        PrimitiveMVIDXDMO rc = new PrimitiveMVIDXDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public PrimitiveMVIDXDMO(DmcTypeModifierMV mods) {
        super("PrimitiveMVIDX");
        modrec(true);
        setModifier(mods);
    }

    public PrimitiveMVIDXDMO getModificationRecorder(){
        PrimitiveMVIDXDMO rc = new PrimitiveMVIDXDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1289)
    public Iterator<String> getMvIdxString(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(DmtDMSAG.__mvIdxString);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @param i the index
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1302)
    public String getNthMvIdxString(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(DmtDMSAG.__mvIdxString);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Sets the value at the specified index.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1338)
    public DmcAttribute<?> setNthMvIdxString(int index, String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxString);
        if (attr == null){
            if (value == null){
                if (getModifier() == null)
                    throw(new IllegalStateException("Calling setNth() on a non-existent attribute with a null value makes no sense!"));
                else{
                    nthNullFromEmptyAttribute(DmtDMSAG.__mvIdxString, index);
                    return(null);
                }
            }
            else
                attr = new DmcTypeStringMV(DmtDMSAG.__mvIdxString);
        }
        
        try{
            String previous = (String) attr.getMVnth(index);
            setLastValue(attr.setMVnth(index, value));
            nth(DmtDMSAG.__mvIdxString,index ,attr,previous);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific setNth() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * @param value String
     * @return true if we contain a valued keyed by the specified String.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1392)
    public boolean mvIdxStringContains(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxString);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another mvIdxString value.
     * @param value A value compatible with String
     * @return the attribute instance
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1426)
    public DmcAttribute<?> addMvIdxString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxString);
        if (attr == null)
            attr = new DmcTypeStringMV(DmtDMSAG.__mvIdxString);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvIdxString,attr);
        return(attr);
    }

    /**
     * @return the number of values in mvIdxString
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1443)
    public int getMvIdxStringSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxString);
        if (attr == null){
            if (DmtDMSAG.__mvIdxString.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvIdxString.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvIdxString value.
     * @param value The String to be deleted from set of attribute values.
     * @return the deleted attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1505)
    public DmcAttribute<?> delMvIdxString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(DmtDMSAG.__mvIdxString), value);
        else
            attr = del(DmtDMSAG.__mvIdxString, value);
        
        return(attr);
    }

    /**
     * Deletes a mvIdxString from the specified value.
     * @param value String
     * @return the deleted attribute instance     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1522)
    public DmcAttribute<?> delMvIdxString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(DmtDMSAG.__mvIdxString), value);
        else
            attr = del(DmtDMSAG.__mvIdxString, value);
        
        return(attr);
    }

    /**
     * Removes the mvIdxString attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1541)
    public void remMvIdxString(){
         rem(DmtDMSAG.__mvIdxString);
    }




}

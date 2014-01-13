package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:396)
import java.io.Serializable;                                  // Always required - (GenUtility.java:224)
import java.util.*;                                           // Always required if we have any MV attributes - (GenUtility.java:221)
import org.dmd.dmc.DmcAttribute;                              // Any attributes - (GenUtility.java:240)
import org.dmd.dmc.DmcObject;                                 // Structural class - (GenUtility.java:351)
import org.dmd.dmc.DmcSliceInfo;                              // Required for object slicing - (GenUtility.java:229)
import org.dmd.dmc.DmcValueException;                         // Any attributes - (GenUtility.java:241)
import org.dmd.dms.generated.dmo.MetaDMSAG;                   // Required for MODREC constructor - (GenUtility.java:228)
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor - (GenUtility.java:227)
import org.dmd.dms.generated.types.DmcTypeStringSET;          // Required type - (GenUtility.java:328)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:677)
/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class PrimitiveTSDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "PrimitiveTS";


    static {
    }

    public PrimitiveTSDMO() {
        super("PrimitiveTS");
    }

    protected PrimitiveTSDMO(String oc) {
        super(oc);
    }

    @Override
    public PrimitiveTSDMO getNew(){
        PrimitiveTSDMO rc = new PrimitiveTSDMO();
        return(rc);
    }

    @Override
    public PrimitiveTSDMO getSlice(DmcSliceInfo info){
        PrimitiveTSDMO rc = new PrimitiveTSDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public PrimitiveTSDMO(DmcTypeModifierMV mods) {
        super("PrimitiveTS");
        modrec(true);
        setModifier(mods);
    }

    public PrimitiveTSDMO getModificationRecorder(){
        PrimitiveTSDMO rc = new PrimitiveTSDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1112)
    public Iterator<String> getTsString(){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(DmtDMSAG.__tsString);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1124)
    public String getNthTsString(int i){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(DmtDMSAG.__tsString);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another tsString to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1138)
    public DmcAttribute<?> addTsString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsString);
        if (attr == null)
            attr = new DmcTypeStringSET(DmtDMSAG.__tsString);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__tsString,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1213)
    public boolean tsStringContains(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsString);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another tsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1245)
    public DmcAttribute<?> addTsString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsString);
        if (attr == null)
            attr = new DmcTypeStringSET(DmtDMSAG.__tsString);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__tsString,attr);
        return(attr);
    }

    /**
     * Returns the number of values in tsString
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1262)
    public int getTsStringSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__tsString);
        if (attr == null){
            if (DmtDMSAG.__tsString.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__tsString.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a tsString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1320)
    public DmcAttribute<?> delTsString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(DmtDMSAG.__tsString), value);
        else
            attr = del(DmtDMSAG.__tsString, value);
        
        return(attr);
    }

    /**
     * Deletes a tsString from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1336)
    public DmcAttribute<?> delTsString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(DmtDMSAG.__tsString), value);
        else
            attr = del(DmtDMSAG.__tsString, value);
        
        return(attr);
    }

    /**
     * Removes the tsString attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1355)
    public void remTsString(){
         rem(DmtDMSAG.__tsString);
    }




}

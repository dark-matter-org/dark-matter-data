package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:391)
import java.io.Serializable;                                  // Always required - (GenUtility.java:220)
import java.util.*;                                           // Always required if we have any MV attributes - (GenUtility.java:215)
import org.dmd.dmc.DmcAttribute;                              // Any attributes - (GenUtility.java:236)
import org.dmd.dmc.DmcObject;                                 // Structural class - (GenUtility.java:347)
import org.dmd.dmc.DmcSliceInfo;                              // Required for object slicing - (GenUtility.java:225)
import org.dmd.dmc.DmcValueException;                         // Any attributes - (GenUtility.java:237)
import org.dmd.dms.generated.dmo.MetaDMSAG;                   // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor - (GenUtility.java:223)
import org.dmd.dms.generated.types.DmcTypeStringMV;           // Required type - (GenUtility.java:324)

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class PrimitiveMVDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "PrimitiveMV";


    static {
    }

    public PrimitiveMVDMO() {
        super("PrimitiveMV");
    }

    protected PrimitiveMVDMO(String oc) {
        super(oc);
    }

    @Override
    public PrimitiveMVDMO getNew(){
        PrimitiveMVDMO rc = new PrimitiveMVDMO();
        return(rc);
    }

    @Override
    public PrimitiveMVDMO getSlice(DmcSliceInfo info){
        PrimitiveMVDMO rc = new PrimitiveMVDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public PrimitiveMVDMO(DmcTypeModifierMV mods) {
        super("PrimitiveMV");
        modrec(true);
        setModifier(mods);
    }

    public PrimitiveMVDMO getModificationRecorder(){
        PrimitiveMVDMO rc = new PrimitiveMVDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1110)
    public Iterator<String> getMvString(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(DmtDMSAG.__mvString);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1122)
    public String getNthMvString(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(DmtDMSAG.__mvString);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another mvString to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1136)
    public DmcAttribute<?> addMvString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvString);
        if (attr == null)
            attr = new DmcTypeStringMV(DmtDMSAG.__mvString);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__mvString,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1211)
    public boolean mvStringContains(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvString);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1243)
    public DmcAttribute<?> addMvString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvString);
        if (attr == null)
            attr = new DmcTypeStringMV(DmtDMSAG.__mvString);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvString,attr);
        return(attr);
    }

    /**
     * Returns the number of values in mvString
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1260)
    public int getMvStringSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvString);
        if (attr == null){
            if (DmtDMSAG.__mvString.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvString.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1318)
    public DmcAttribute<?> delMvString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(DmtDMSAG.__mvString), value);
        else
            attr = del(DmtDMSAG.__mvString, value);
        
        return(attr);
    }

    /**
     * Deletes a mvString from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1334)
    public DmcAttribute<?> delMvString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(DmtDMSAG.__mvString), value);
        else
            attr = del(DmtDMSAG.__mvString, value);
        
        return(attr);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1353)
    public void remMvString(){
         rem(DmtDMSAG.__mvString);
    }




}

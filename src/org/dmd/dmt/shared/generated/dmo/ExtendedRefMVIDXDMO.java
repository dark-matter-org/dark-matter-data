package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:405)
import java.io.Serializable;                                             // Always required - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                                         // Any attributes - (GenUtility.java:245)
import org.dmd.dmc.DmcObject;                                            // Structural class - (GenUtility.java:359)
import org.dmd.dmc.DmcOmni;                                              // Lazy resolution - (GenUtility.java:340)
import org.dmd.dmc.DmcSliceInfo;                                         // Required for object slicing - (GenUtility.java:229)
import org.dmd.dmc.DmcValueException;                                    // Any attributes - (GenUtility.java:246)
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor - (GenUtility.java:228)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor - (GenUtility.java:227)
import org.dmd.dmt.shared.generated.types.DmcTypeSomeRelationMV;         // Required type - (GenUtility.java:336)
import org.dmd.dmt.shared.generated.types.SomeRelation;                  // Extended reference type - (GenUtility.java:334)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class ExtendedRefMVIDXDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "ExtendedRefMVIDX";


    static {
    }

    public ExtendedRefMVIDXDMO() {
        super("ExtendedRefMVIDX");
    }

    protected ExtendedRefMVIDXDMO(String oc) {
        super(oc);
    }

    @Override
    public ExtendedRefMVIDXDMO getNew(){
        ExtendedRefMVIDXDMO rc = new ExtendedRefMVIDXDMO();
        return(rc);
    }

    @Override
    public ExtendedRefMVIDXDMO getSlice(DmcSliceInfo info){
        ExtendedRefMVIDXDMO rc = new ExtendedRefMVIDXDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ExtendedRefMVIDXDMO(DmcTypeModifierMV mods) {
        super("ExtendedRefMVIDX");
        modrec(true);
        setModifier(mods);
    }

    public ExtendedRefMVIDXDMO getModificationRecorder(){
        ExtendedRefMVIDXDMO rc = new ExtendedRefMVIDXDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return The nth SomeRelation value and attempt lazy resolution if it's on.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1047)
    public SomeRelation getNthMvIdxExtendedRef(int i){
        DmcTypeSomeRelationMV attr = (DmcTypeSomeRelationMV) get(DmtDMSAG.__mvIdxExtendedRef);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1066)
    public SomeRelation getNthMvIdxExtendedRefREF(int i){
        DmcTypeSomeRelationMV attr = (DmcTypeSomeRelationMV) get(DmtDMSAG.__mvIdxExtendedRef);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Sets the mvIdxExtendedRef value at the specified index.
     * @param value SomeRelation
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1080)
    public DmcAttribute<?> setNthMvIdxExtendedRef(int index, SomeRelation value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxExtendedRef);
        if (attr == null){
            if (value == null){
                if (getModifier() == null)
                    throw(new IllegalStateException("Calling setNth() on a non-existent attribute with a null value makes no sense!"));
                else{
                    nthNullFromEmptyAttribute(DmtDMSAG.__mvIdxExtendedRef, index);
                    return(null);
                }
            }
            else
                attr = new DmcTypeSomeRelationMV(DmtDMSAG.__mvIdxExtendedRef);
        }
        
        try{
            SomeRelation previous = (SomeRelation) attr.getMVnth(index);
            setLastValue(attr.setMVnth(index, value));
            nth(DmtDMSAG.__mvIdxExtendedRef,index ,attr,previous);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific setNth() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another mvIdxExtendedRef value.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1254)
    public DmcAttribute<?> addMvIdxExtendedRef(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxExtendedRef);
        if (attr == null)
            attr = new DmcTypeSomeRelationMV(DmtDMSAG.__mvIdxExtendedRef);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvIdxExtendedRef,attr);
        return(attr);
    }

    /**
     * Returns the number of values in mvIdxExtendedRef
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1271)
    public int getMvIdxExtendedRefSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxExtendedRef);
        if (attr == null){
            if (DmtDMSAG.__mvIdxExtendedRef.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvIdxExtendedRef.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvIdxExtendedRef value.
     * @param value The SomeRelation to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1310)
    public DmcAttribute<?> delMvIdxExtendedRef(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxExtendedRef);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeSomeRelationMV(DmtDMSAG.__mvIdxExtendedRef), value);
        else
            attr = del(DmtDMSAG.__mvIdxExtendedRef, value);
        
        return(attr);
    }

    /**
     * Removes the mvIdxExtendedRef attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1364)
    public void remMvIdxExtendedRef(){
         rem(DmtDMSAG.__mvIdxExtendedRef);
    }




}

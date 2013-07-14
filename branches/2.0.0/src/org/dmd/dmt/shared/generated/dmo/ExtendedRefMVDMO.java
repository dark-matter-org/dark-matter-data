package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:391)
import java.io.Serializable;                                             // Always required - (GenUtility.java:220)
import java.util.*;                                                      // Always required if we have any MV attributes - (GenUtility.java:215)
import org.dmd.dmc.DmcAttribute;                                         // Any attributes - (GenUtility.java:236)
import org.dmd.dmc.DmcObject;                                            // Structural class - (GenUtility.java:347)
import org.dmd.dmc.DmcOmni;                                              // Lazy resolution - (GenUtility.java:328)
import org.dmd.dmc.DmcSliceInfo;                                         // Required for object slicing - (GenUtility.java:225)
import org.dmd.dmc.DmcValueException;                                    // Any attributes - (GenUtility.java:237)
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor - (GenUtility.java:223)
import org.dmd.dmt.shared.generated.types.DmcTypeSomeRelationMV;         // Required type - (GenUtility.java:324)
import org.dmd.dmt.shared.generated.types.SomeRelation;                  // Extended reference type - (GenUtility.java:322)

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class ExtendedRefMVDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "ExtendedRefMV";


    static {
    }

    public ExtendedRefMVDMO() {
        super("ExtendedRefMV");
    }

    protected ExtendedRefMVDMO(String oc) {
        super(oc);
    }

    @Override
    public ExtendedRefMVDMO getNew(){
        ExtendedRefMVDMO rc = new ExtendedRefMVDMO();
        return(rc);
    }

    @Override
    public ExtendedRefMVDMO getSlice(DmcSliceInfo info){
        ExtendedRefMVDMO rc = new ExtendedRefMVDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ExtendedRefMVDMO(DmcTypeModifierMV mods) {
        super("ExtendedRefMV");
        modrec(true);
        setModifier(mods);
    }

    public ExtendedRefMVDMO getModificationRecorder(){
        ExtendedRefMVDMO rc = new ExtendedRefMVDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return An Iterator of SomeRelationDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:960)
    public Iterator<SomeRelation> getMvExtendedRef(){
        DmcTypeSomeRelationMV attr = (DmcTypeSomeRelationMV) get(DmtDMSAG.__mvExtendedRef);
        if (attr == null)
            return( ((List<SomeRelation>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<SomeRelation>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of SomeRelationREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:980)
    public Iterator<SomeRelation> getMvExtendedRefREFs(){
        DmcTypeSomeRelationMV attr = (DmcTypeSomeRelationMV) get(DmtDMSAG.__mvExtendedRef);
        if (attr == null)
            return( ((List<SomeRelation>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another mvExtendedRef to the specified value.
     * @param value SomeRelation
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:994)
    public DmcAttribute<?> addMvExtendedRef(SomeRelation value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvExtendedRef);
        if (attr == null)
            attr = new DmcTypeSomeRelationMV(DmtDMSAG.__mvExtendedRef);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__mvExtendedRef,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another mvExtendedRef value.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public DmcAttribute<?> addMvExtendedRef(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvExtendedRef);
        if (attr == null)
            attr = new DmcTypeSomeRelationMV(DmtDMSAG.__mvExtendedRef);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvExtendedRef,attr);
        return(attr);
    }

    /**
     * Returns the number of values in mvExtendedRef
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1252)
    public int getMvExtendedRefSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvExtendedRef);
        if (attr == null){
            if (DmtDMSAG.__mvExtendedRef.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvExtendedRef.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvExtendedRef value.
     * @param value The SomeRelation to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1291)
    public DmcAttribute<?> delMvExtendedRef(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvExtendedRef);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeSomeRelationMV(DmtDMSAG.__mvExtendedRef), value);
        else
            attr = del(DmtDMSAG.__mvExtendedRef, value);
        
        return(attr);
    }

    /**
     * Removes the mvExtendedRef attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1345)
    public void remMvExtendedRef(){
         rem(DmtDMSAG.__mvExtendedRef);
    }




}
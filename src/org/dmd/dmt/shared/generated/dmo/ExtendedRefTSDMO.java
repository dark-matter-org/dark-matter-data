package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:408)
import java.io.Serializable;                                              // Always required - (GenUtility.java:227)
import java.util.*;                                                       // Always required if we have any MV attributes - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                                          // Any attributes - (GenUtility.java:248)
import org.dmd.dmc.DmcObject;                                             // Structural class - (GenUtility.java:362)
import org.dmd.dmc.DmcOmni;                                               // Lazy resolution - (GenUtility.java:343)
import org.dmd.dmc.DmcSliceInfo;                                          // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                                     // Any attributes - (GenUtility.java:249)
import org.dmd.dms.generated.dmo.MetaDMSAG;                               // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                     // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dmt.shared.generated.types.DmcTypeSomeRelationSET;         // Required type - (GenUtility.java:339)
import org.dmd.dmt.shared.generated.types.SomeRelation;                   // Extended reference type - (GenUtility.java:337)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class ExtendedRefTSDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "ExtendedRefTS";


    static {
    }

    public ExtendedRefTSDMO() {
        super("ExtendedRefTS");
    }

    protected ExtendedRefTSDMO(String oc) {
        super(oc);
    }

    @Override
    public ExtendedRefTSDMO getNew(){
        ExtendedRefTSDMO rc = new ExtendedRefTSDMO();
        return(rc);
    }

    @Override
    public ExtendedRefTSDMO getSlice(DmcSliceInfo info){
        ExtendedRefTSDMO rc = new ExtendedRefTSDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ExtendedRefTSDMO(DmcTypeModifierMV mods) {
        super("ExtendedRefTS");
        modrec(true);
        setModifier(mods);
    }

    public ExtendedRefTSDMO getModificationRecorder(){
        ExtendedRefTSDMO rc = new ExtendedRefTSDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return An Iterator of SomeRelationDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:982)
    public Iterator<SomeRelation> getTsExtendedRef(){
        DmcTypeSomeRelationSET attr = (DmcTypeSomeRelationSET) get(DmtDMSAG.__tsExtendedRef);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1002)
    public Iterator<SomeRelation> getTsExtendedRefREFs(){
        DmcTypeSomeRelationSET attr = (DmcTypeSomeRelationSET) get(DmtDMSAG.__tsExtendedRef);
        if (attr == null)
            return( ((List<SomeRelation>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another tsExtendedRef to the specified value.
     * @param value SomeRelation
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1016)
    public DmcAttribute<?> addTsExtendedRef(SomeRelation value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsExtendedRef);
        if (attr == null)
            attr = new DmcTypeSomeRelationSET(DmtDMSAG.__tsExtendedRef);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__tsExtendedRef,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another tsExtendedRef value.
     * @param value A value compatible with SomeRelation
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1257)
    public DmcAttribute<?> addTsExtendedRef(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsExtendedRef);
        if (attr == null)
            attr = new DmcTypeSomeRelationSET(DmtDMSAG.__tsExtendedRef);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__tsExtendedRef,attr);
        return(attr);
    }

    /**
     * Returns the number of values in tsExtendedRef
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1274)
    public int getTsExtendedRefSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__tsExtendedRef);
        if (attr == null){
            if (DmtDMSAG.__tsExtendedRef.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__tsExtendedRef.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a tsExtendedRef value.
     * @param value The SomeRelation to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1313)
    public DmcAttribute<?> delTsExtendedRef(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__tsExtendedRef);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeSomeRelationSET(DmtDMSAG.__tsExtendedRef), value);
        else
            attr = del(DmtDMSAG.__tsExtendedRef, value);
        
        return(attr);
    }

    /**
     * Removes the tsExtendedRef attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1367)
    public void remTsExtendedRef(){
         rem(DmtDMSAG.__tsExtendedRef);
    }




}

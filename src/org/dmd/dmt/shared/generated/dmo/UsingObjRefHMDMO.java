package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:396)
import java.io.Serializable;                                                // Always required - (GenUtility.java:224)
import java.util.*;                                                         // Always required if we have any MV attributes - (GenUtility.java:221)
import org.dmd.dmc.DmcAttribute;                                            // Any attributes - (GenUtility.java:240)
import org.dmd.dmc.DmcObject;                                               // Structural class - (GenUtility.java:351)
import org.dmd.dmc.DmcOmni;                                                 // Lazy resolution - (GenUtility.java:320)
import org.dmd.dmc.DmcSliceInfo;                                            // Required for object slicing - (GenUtility.java:229)
import org.dmd.dmc.DmcValueException;                                       // Any attributes - (GenUtility.java:241)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                 // Required for MODREC constructor - (GenUtility.java:228)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                       // Required for MODREC constructor - (GenUtility.java:227)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;                     // Type specific set/add - (GenUtility.java:307)
import org.dmd.dmt.shared.generated.types.DmcTypeObjWithRefsREFMAP;         // Reference type - (GenUtility.java:300)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;                   // Helper class - (GenUtility.java:335)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class UsingObjRefHMDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "UsingObjRefHM";


    static {
    }

    public UsingObjRefHMDMO() {
        super("UsingObjRefHM");
    }

    protected UsingObjRefHMDMO(String oc) {
        super(oc);
    }

    @Override
    public UsingObjRefHMDMO getNew(){
        UsingObjRefHMDMO rc = new UsingObjRefHMDMO();
        return(rc);
    }

    @Override
    public UsingObjRefHMDMO getSlice(DmcSliceInfo info){
        UsingObjRefHMDMO rc = new UsingObjRefHMDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public UsingObjRefHMDMO(DmcTypeModifierMV mods) {
        super("UsingObjRefHM");
        modrec(true);
        setModifier(mods);
    }

    public UsingObjRefHMDMO getModificationRecorder(){
        UsingObjRefHMDMO rc = new UsingObjRefHMDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return An Iterator of ObjWithRefsDMO objects.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1393)
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1405)
    public Iterator<ObjWithRefsREF> getObjRefHM(){
        DmcTypeObjWithRefsREFMAP attr = (DmcTypeObjWithRefsREFMAP) get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return( ((List<ObjWithRefsREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<ObjWithRefsREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of ObjWithRefsREFs without attempting lazy resolution (if it's turned on).
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1424)
    @SuppressWarnings("unchecked")
    public Iterator<ObjWithRefsREF> getObjRefHMREFs(){
        DmcTypeObjWithRefsREFMAP attr = (DmcTypeObjWithRefsREFMAP) get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return( ((List<ObjWithRefsREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * @param key The key of the value you want.
     * @return The ObjWithRefs associated with the specified key.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1458)
    public ObjWithRefsREF getObjRefHM(Object key){
        DmcTypeObjWithRefsREFMAP attr = (DmcTypeObjWithRefsREFMAP) get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(null);

        return(attr.getByKey(key));
    }

    /**
     * Adds another objRefHM value.
     * @param value A value compatible with ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1510)
    public DmcAttribute<?> addObjRefHM(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__objRefHM);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFMAP(DmtDMSAG.__objRefHM);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__objRefHM,attr);
        return(attr);
    }

    /**
     * Adds another objRefHM value.
     * @param value ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1526)
    public DmcAttribute<?> addObjRefHM(ObjWithRefsDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__objRefHM);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFMAP(DmtDMSAG.__objRefHM);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__objRefHM,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Deletes a objRefHM value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1585)
    public DmcAttribute<?> delObjRefHM(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__objRefHM);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeObjWithRefsREFMAP(DmtDMSAG.__objRefHM), value);
        else
            attr = del(DmtDMSAG.__objRefHM, value);
        
        return(attr);
    }

    /**
     * Deletes a objRefHM value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1603)
    public DmcAttribute<?> delObjRefHM(ObjWithRefsDMO value){
        DmcAttribute<?> attr = get(DmtDMSAG.__objRefHM);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeObjWithRefsREFMAP(DmtDMSAG.__objRefHM), value.getObjectName());
        else
            attr = del(DmtDMSAG.__objRefHM, value.getObjectName());
        
        return(attr);
    }

    /**
     * Removes the objRefHM attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1699)
    public void remObjRefHM(){
         rem(DmtDMSAG.__objRefHM);
    }




}

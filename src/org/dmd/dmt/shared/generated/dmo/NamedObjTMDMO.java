package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:391)
import java.io.Serializable;                                                // Always required - (GenUtility.java:220)
import java.util.*;                                                         // Always required if we have any MV attributes - (GenUtility.java:215)
import org.dmd.dmc.DmcAttribute;                                            // Any attributes - (GenUtility.java:236)
import org.dmd.dmc.DmcObject;                                               // Structural class - (GenUtility.java:347)
import org.dmd.dmc.DmcOmni;                                                 // Lazy resolution - (GenUtility.java:316)
import org.dmd.dmc.DmcSliceInfo;                                            // Required for object slicing - (GenUtility.java:225)
import org.dmd.dmc.DmcValueException;                                       // Any attributes - (GenUtility.java:237)
import org.dmd.dmc.types.StringName;                                        // Name attribute type - (GenUtility.java:300)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                 // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                       // Required for MODREC constructor - (GenUtility.java:223)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;                     // Type specific set/add - (GenUtility.java:303)
import org.dmd.dmt.shared.generated.types.DmcTypeObjWithRefsREFMAP;         // Reference type - (GenUtility.java:296)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;                   // Helper class - (GenUtility.java:331)

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class NamedObjTMDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "NamedObjTM";


    static {
    }

    public NamedObjTMDMO() {
        super("NamedObjTM");
    }

    protected NamedObjTMDMO(String oc) {
        super(oc);
    }

    @Override
    public NamedObjTMDMO getNew(){
        NamedObjTMDMO rc = new NamedObjTMDMO();
        return(rc);
    }

    @Override
    public NamedObjTMDMO getSlice(DmcSliceInfo info){
        NamedObjTMDMO rc = new NamedObjTMDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public NamedObjTMDMO(DmcTypeModifierMV mods) {
        super("NamedObjTM");
        modrec(true);
        setModifier(mods);
    }

    public NamedObjTMDMO getModificationRecorder(){
        NamedObjTMDMO rc = new NamedObjTMDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return An Iterator of ObjWithRefsDMO objects.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1391)
    @SuppressWarnings("unchecked")
    public Iterator<ObjWithRefsREF> getTmNamedObj(){
        DmcTypeObjWithRefsREFMAP attr = (DmcTypeObjWithRefsREFMAP) get(DmtDMSAG.__tmNamedObj);
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
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1421)
    @SuppressWarnings("unchecked")
    public Iterator<ObjWithRefsREF> getTmNamedObjREFs(){
        DmcTypeObjWithRefsREFMAP attr = (DmcTypeObjWithRefsREFMAP) get(DmtDMSAG.__tmNamedObj);
        if (attr == null)
            return( ((List<ObjWithRefsREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * @param key The key of the value you want.
     * @return The ObjWithRefs associated with the specified key.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1455)
    public ObjWithRefsREF getTmNamedObj(Object key){
        DmcTypeObjWithRefsREFMAP attr = (DmcTypeObjWithRefsREFMAP) get(DmtDMSAG.__tmNamedObj);
        if (attr == null)
            return(null);

        return(attr.getByKey(key));
    }

    /**
     * @return The first key of the map.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1489)
    public StringName getTmNamedObjFirstKey(){
        DmcTypeObjWithRefsREFMAP attr = (DmcTypeObjWithRefsREFMAP) get(DmtDMSAG.__tmNamedObj);
        if (attr == null)
            return(null);

        return(attr.firstKey());
    }

    /**
     * Adds another tmNamedObj value.
     * @param value A value compatible with ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1507)
    public DmcAttribute<?> addTmNamedObj(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__tmNamedObj);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFMAP(DmtDMSAG.__tmNamedObj);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__tmNamedObj,attr);
        return(attr);
    }

    /**
     * Adds another tmNamedObj value.
     * @param value ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1523)
    public DmcAttribute<?> addTmNamedObj(ObjWithRefsDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tmNamedObj);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFMAP(DmtDMSAG.__tmNamedObj);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__tmNamedObj,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Deletes a tmNamedObj value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    public DmcAttribute<?> delTmNamedObj(Object value) throws DmcValueException {
        return(del(DmtDMSAG.__tmNamedObj, value));
    }

    /**
     * Deletes a tmNamedObj value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    public DmcAttribute<?> delTmNamedObj(ObjWithRefsDMO value){
        return(del(DmtDMSAG.__tmNamedObj, value));
    }

    /**
     * Removes the tmNamedObj attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1678)
    public void remTmNamedObj(){
         rem(DmtDMSAG.__tmNamedObj);
    }




}
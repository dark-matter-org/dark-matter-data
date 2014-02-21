package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:396)
import java.io.Serializable;                                                // Always required - (GenUtility.java:224)
import java.util.*;                                                         // Always required if we have any MV attributes - (GenUtility.java:221)
import org.dmd.dmc.DmcAttribute;                                            // Any attributes - (GenUtility.java:240)
import org.dmd.dmc.DmcObject;                                               // Structural class - (GenUtility.java:351)
import org.dmd.dmc.DmcOmni;                                                 // Lazy resolution - (GenUtility.java:320)
import org.dmd.dmc.DmcSliceInfo;                                            // Required for object slicing - (GenUtility.java:229)
import org.dmd.dmc.DmcValueException;                                       // Any attributes - (GenUtility.java:241)
import org.dmd.dmc.types.DefinitionName;                                    // Name attribute type - (GenUtility.java:304)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                 // Required for MODREC constructor - (GenUtility.java:228)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                       // Required for MODREC constructor - (GenUtility.java:227)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;                     // Type specific set/add - (GenUtility.java:307)
import org.dmd.dmt.shared.generated.types.DmcTypeObjWithRefsREFMAP;         // Reference type - (GenUtility.java:300)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;                   // Helper class - (GenUtility.java:335)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:677)
/**
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
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1393)
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1405)
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
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1424)
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
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1458)
    public ObjWithRefsREF getTmNamedObj(Object key){
        DmcTypeObjWithRefsREFMAP attr = (DmcTypeObjWithRefsREFMAP) get(DmtDMSAG.__tmNamedObj);
        if (attr == null)
            return(null);

        return(attr.getByKey(key));
    }

    /**
     * @return The first key of the map.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1492)
    public DefinitionName getTmNamedObjFirstKey(){
        DmcTypeObjWithRefsREFMAP attr = (DmcTypeObjWithRefsREFMAP) get(DmtDMSAG.__tmNamedObj);
        if (attr == null)
            return(null);

        return(attr.firstKey());
    }

    /**
     * Adds another tmNamedObj value.
     * @param value A value compatible with ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1510)
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
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1526)
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
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1585)
    public DmcAttribute<?> delTmNamedObj(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__tmNamedObj);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeObjWithRefsREFMAP(DmtDMSAG.__tmNamedObj), value);
        else
            attr = del(DmtDMSAG.__tmNamedObj, value);
        
        return(attr);
    }

    /**
     * Deletes a tmNamedObj value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1603)
    public DmcAttribute<?> delTmNamedObj(ObjWithRefsDMO value){
        DmcAttribute<?> attr = get(DmtDMSAG.__tmNamedObj);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeObjWithRefsREFMAP(DmtDMSAG.__tmNamedObj), value.getObjectName());
        else
            attr = del(DmtDMSAG.__tmNamedObj, value.getObjectName());
        
        return(attr);
    }

    /**
     * Removes the tmNamedObj attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1699)
    public void remTmNamedObj(){
         rem(DmtDMSAG.__tmNamedObj);
    }




}
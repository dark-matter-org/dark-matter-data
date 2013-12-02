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
import org.dmd.dmt.shared.generated.types.DmcTypeObjWithRefsREFSET;         // Reference type - (GenUtility.java:300)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;                   // Helper class - (GenUtility.java:335)

/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class NamedObjTSDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "NamedObjTS";


    static {
    }

    public NamedObjTSDMO() {
        super("NamedObjTS");
    }

    protected NamedObjTSDMO(String oc) {
        super(oc);
    }

    @Override
    public NamedObjTSDMO getNew(){
        NamedObjTSDMO rc = new NamedObjTSDMO();
        return(rc);
    }

    @Override
    public NamedObjTSDMO getSlice(DmcSliceInfo info){
        NamedObjTSDMO rc = new NamedObjTSDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public NamedObjTSDMO(DmcTypeModifierMV mods) {
        super("NamedObjTS");
        modrec(true);
        setModifier(mods);
    }

    public NamedObjTSDMO getModificationRecorder(){
        NamedObjTSDMO rc = new NamedObjTSDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return An Iterator of ObjWithRefsDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:970)
    public Iterator<ObjWithRefsREF> getTsNamedObj(){
        DmcTypeObjWithRefsREFSET attr = (DmcTypeObjWithRefsREFSET) get(DmtDMSAG.__tsNamedObj);
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
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:990)
    public Iterator<ObjWithRefsREF> getTsNamedObjREFs(){
        DmcTypeObjWithRefsREFSET attr = (DmcTypeObjWithRefsREFSET) get(DmtDMSAG.__tsNamedObj);
        if (attr == null)
            return( ((List<ObjWithRefsREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another tsNamedObj to the specified value.
     * @param value ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1004)
    public DmcAttribute<?> addTsNamedObj(ObjWithRefsDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsNamedObj);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFSET(DmtDMSAG.__tsNamedObj);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__tsNamedObj,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another tsNamedObj value.
     * @param value A value compatible with ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1245)
    public DmcAttribute<?> addTsNamedObj(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsNamedObj);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFSET(DmtDMSAG.__tsNamedObj);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__tsNamedObj,attr);
        return(attr);
    }

    /**
     * Returns the number of values in tsNamedObj
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1262)
    public int getTsNamedObjSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__tsNamedObj);
        if (attr == null){
            if (DmtDMSAG.__tsNamedObj.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__tsNamedObj.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a tsNamedObj value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1301)
    public DmcAttribute<?> delTsNamedObj(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__tsNamedObj);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeObjWithRefsREFSET(DmtDMSAG.__tsNamedObj), value);
        else
            attr = del(DmtDMSAG.__tsNamedObj, value);
        
        return(attr);
    }

    /**
     * Removes the tsNamedObj attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1355)
    public void remTsNamedObj(){
         rem(DmtDMSAG.__tsNamedObj);
    }




}

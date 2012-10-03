package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:374)
import java.io.Serializable;                                                // Always required - (GenUtility.java:203)
import java.util.*;                                                         // Always required if we have any MV attributes - (GenUtility.java:198)
import org.dmd.dmc.DmcAttribute;                                            // Any attributes - (GenUtility.java:219)
import org.dmd.dmc.DmcObject;                                               // Structural class - (GenUtility.java:330)
import org.dmd.dmc.DmcOmni;                                                 // Lazy resolution - (GenUtility.java:299)
import org.dmd.dmc.DmcSliceInfo;                                            // Required for object slicing - (GenUtility.java:208)
import org.dmd.dmc.DmcValueException;                                       // Any attributes - (GenUtility.java:220)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                 // Required for MODREC constructor - (GenUtility.java:207)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                       // Required for MODREC constructor - (GenUtility.java:206)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;                     // Type specific set/add - (GenUtility.java:286)
import org.dmd.dmt.shared.generated.types.DmcTypeObjWithRefsREFSET;         // Reference type - (GenUtility.java:279)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;                   // Helper class - (GenUtility.java:314)

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class NamedObjHSDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "NamedObjHS";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public NamedObjHSDMO() {
        super("NamedObjHS");
    }

    protected NamedObjHSDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public NamedObjHSDMO getNew(){
        NamedObjHSDMO rc = new NamedObjHSDMO();
        return(rc);
    }

    @Override
    public NamedObjHSDMO getSlice(DmcSliceInfo info){
        NamedObjHSDMO rc = new NamedObjHSDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public NamedObjHSDMO(DmcTypeModifierMV mods) {
        super("NamedObjHS");
        modrec(true);
        setModifier(mods);
    }

    public NamedObjHSDMO getModificationRecorder(){
        NamedObjHSDMO rc = new NamedObjHSDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return An Iterator of ObjWithRefsDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:943)
    public Iterator<ObjWithRefsREF> getHsNamedObj(){
        DmcTypeObjWithRefsREFSET attr = (DmcTypeObjWithRefsREFSET) get(DmtDMSAG.__hsNamedObj);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:963)
    public Iterator<ObjWithRefsREF> getHsNamedObjREFs(){
        DmcTypeObjWithRefsREFSET attr = (DmcTypeObjWithRefsREFSET) get(DmtDMSAG.__hsNamedObj);
        if (attr == null)
            return( ((List<ObjWithRefsREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another hsNamedObj to the specified value.
     * @param value ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:977)
    public DmcAttribute<?> addHsNamedObj(ObjWithRefsDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsNamedObj);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFSET(DmtDMSAG.__hsNamedObj);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__hsNamedObj,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another hsNamedObj value.
     * @param value A value compatible with ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1218)
    public DmcAttribute<?> addHsNamedObj(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsNamedObj);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFSET(DmtDMSAG.__hsNamedObj);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__hsNamedObj,attr);
        return(attr);
    }

    /**
     * Returns the number of values in hsNamedObj
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public int getHsNamedObjSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__hsNamedObj);
        if (attr == null){
            if (DmtDMSAG.__hsNamedObj.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__hsNamedObj.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a hsNamedObj value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1274)
    public DmcAttribute<?> delHsNamedObj(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__hsNamedObj);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeObjWithRefsREFSET(DmtDMSAG.__hsNamedObj), value);
        else
            attr = del(DmtDMSAG.__hsNamedObj, value);
        
        return(attr);
    }

    /**
     * Removes the hsNamedObj attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1328)
    public void remHsNamedObj(){
         rem(DmtDMSAG.__hsNamedObj);
    }




}
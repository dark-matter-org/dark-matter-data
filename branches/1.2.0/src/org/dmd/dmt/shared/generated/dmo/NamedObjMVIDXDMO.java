package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:374)
import java.io.Serializable;                                               // Always required - (GenUtility.java:203)
import java.util.*;                                                        // Always required if we have any MV attributes - (GenUtility.java:198)
import org.dmd.dmc.DmcAttribute;                                           // Any attributes - (GenUtility.java:219)
import org.dmd.dmc.DmcObject;                                              // Structural class - (GenUtility.java:330)
import org.dmd.dmc.DmcOmni;                                                // Lazy resolution - (GenUtility.java:299)
import org.dmd.dmc.DmcSliceInfo;                                           // Required for object slicing - (GenUtility.java:208)
import org.dmd.dmc.DmcValueException;                                      // Any attributes - (GenUtility.java:220)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                // Required for MODREC constructor - (GenUtility.java:207)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                      // Required for MODREC constructor - (GenUtility.java:206)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;                    // Type specific set/add - (GenUtility.java:286)
import org.dmd.dmt.shared.generated.types.DmcTypeObjWithRefsREFMV;         // Reference type - (GenUtility.java:279)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;                  // Helper class - (GenUtility.java:314)

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
public class NamedObjMVIDXDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "NamedObjMVIDX";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public NamedObjMVIDXDMO() {
        super("NamedObjMVIDX");
    }

    protected NamedObjMVIDXDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public NamedObjMVIDXDMO getNew(){
        NamedObjMVIDXDMO rc = new NamedObjMVIDXDMO();
        return(rc);
    }

    @Override
    public NamedObjMVIDXDMO getSlice(DmcSliceInfo info){
        NamedObjMVIDXDMO rc = new NamedObjMVIDXDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public NamedObjMVIDXDMO(DmcTypeModifierMV mods) {
        super("NamedObjMVIDX");
        modrec(true);
        setModifier(mods);
    }

    public NamedObjMVIDXDMO getModificationRecorder(){
        NamedObjMVIDXDMO rc = new NamedObjMVIDXDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return The nth ObjWithRefs value and attempt lazy resolution if it's on.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1011)
    public ObjWithRefsREF getNthMvIdxNamedObj(int i){
        DmcTypeObjWithRefsREFMV attr = (DmcTypeObjWithRefsREFMV) get(DmtDMSAG.__mvIdxNamedObj);
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
     * @return The nth ObjWithRefs value without attempting lazy resolution.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1030)
    public ObjWithRefsREF getNthMvIdxNamedObjREF(int i){
        DmcTypeObjWithRefsREFMV attr = (DmcTypeObjWithRefsREFMV) get(DmtDMSAG.__mvIdxNamedObj);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Sets the mvIdxNamedObj value at the specified index.
     * @param value ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1044)
    public DmcAttribute<?> setNthMvIdxNamedObj(int index, ObjWithRefsDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxNamedObj);
        if (attr == null){
            if (value == null){
                if (getModifier() == null)
                    throw(new IllegalStateException("Calling setNth() on a non-existent attribute with a null value makes no sense!"));
                else{
                    nthNullFromEmptyAttribute(DmtDMSAG.__mvIdxNamedObj, index);
                    return(null);
                }
            }
            else
                attr = new DmcTypeObjWithRefsREFMV(DmtDMSAG.__mvIdxNamedObj);
        }
        
        try{
            ObjWithRefsREF previous = (ObjWithRefsREF) attr.getMVnth(index);
            setLastValue(attr.setMVnth(index, value));
            nth(DmtDMSAG.__mvIdxNamedObj,index ,attr,previous);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific setNth() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another mvIdxNamedObj value.
     * @param value A value compatible with ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1218)
    public DmcAttribute<?> addMvIdxNamedObj(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxNamedObj);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFMV(DmtDMSAG.__mvIdxNamedObj);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvIdxNamedObj,attr);
        return(attr);
    }

    /**
     * Returns the number of values in mvIdxNamedObj
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public int getMvIdxNamedObjSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxNamedObj);
        if (attr == null){
            if (DmtDMSAG.__mvIdxNamedObj.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvIdxNamedObj.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvIdxNamedObj value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1274)
    public DmcAttribute<?> delMvIdxNamedObj(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxNamedObj);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeObjWithRefsREFMV(DmtDMSAG.__mvIdxNamedObj), value);
        else
            attr = del(DmtDMSAG.__mvIdxNamedObj, value);
        
        return(attr);
    }

    /**
     * Removes the mvIdxNamedObj attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1328)
    public void remMvIdxNamedObj(){
         rem(DmtDMSAG.__mvIdxNamedObj);
    }




}

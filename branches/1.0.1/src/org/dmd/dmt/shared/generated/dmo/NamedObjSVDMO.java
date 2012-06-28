package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:368)
import java.io.Serializable;                                               // Always required - (GenUtility.java:197)
import java.util.*;                                                        // Always required if we have any MV attributes - (GenUtility.java:193)
import org.dmd.dmc.DmcAttribute;                                           // Any attributes - (GenUtility.java:213)
import org.dmd.dmc.DmcObject;                                              // Structural class - (GenUtility.java:324)
import org.dmd.dmc.DmcOmni;                                                // Lazy resolution - (GenUtility.java:293)
import org.dmd.dmc.DmcSliceInfo;                                           // Required for object slicing - (GenUtility.java:202)
import org.dmd.dmc.DmcValueException;                                      // Any attributes - (GenUtility.java:214)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                // Required for MODREC constructor - (GenUtility.java:201)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                      // Required for MODREC constructor - (GenUtility.java:200)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;                    // Type specific set/add - (GenUtility.java:280)
import org.dmd.dmt.shared.generated.types.DmcTypeObjWithRefsREFSV;         // Reference type - (GenUtility.java:273)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;                  // Helper class - (GenUtility.java:308)

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
public class NamedObjSVDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "NamedObjSV";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public NamedObjSVDMO() {
        super("NamedObjSV");
    }

    protected NamedObjSVDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public NamedObjSVDMO getNew(){
        NamedObjSVDMO rc = new NamedObjSVDMO();
        return(rc);
    }

    @Override
    public NamedObjSVDMO getSlice(DmcSliceInfo info){
        NamedObjSVDMO rc = new NamedObjSVDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public NamedObjSVDMO(DmcTypeModifierMV mods) {
        super("NamedObjSV");
        modrec(true);
        setModifier(mods);
    }

    public NamedObjSVDMO getModificationRecorder(){
        NamedObjSVDMO rc = new NamedObjSVDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
    public ObjWithRefsREF getSvNamedObj(){
        DmcTypeObjWithRefsREFSV attr = (DmcTypeObjWithRefsREFSV) get(DmtDMSAG.__svNamedObj);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getSV());
    }

    /**
     * Returns the reference to ObjWithRefs without attempting lazy resolution (if turned on).
     */
    public ObjWithRefsREF getSvNamedObjREF(){
        DmcTypeObjWithRefsREFSV attr = (DmcTypeObjWithRefsREFSV) get(DmtDMSAG.__svNamedObj);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svNamedObj to the specified value.
     * @param value ObjWithRefsDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:676)
    public void setSvNamedObj(ObjWithRefsDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__svNamedObj);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFSV(DmtDMSAG.__svNamedObj);
        else
            ((DmcTypeObjWithRefsREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(DmtDMSAG.__svNamedObj,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svNamedObj to the specified value.
     * @param value A value compatible with DmcTypeObjWithRefsREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
    public void setSvNamedObj(Object value) throws DmcValueException {
        DmcTypeObjWithRefsREFSV attr  = (DmcTypeObjWithRefsREFSV) get(DmtDMSAG.__svNamedObj);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFSV(DmtDMSAG.__svNamedObj);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DmtDMSAG.__svNamedObj,attr);
    }

    /**
     * Removes the svNamedObj attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remSvNamedObj(){
         rem(DmtDMSAG.__svNamedObj);
    }




}

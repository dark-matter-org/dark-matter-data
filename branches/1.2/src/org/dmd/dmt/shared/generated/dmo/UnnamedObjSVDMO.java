package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:368)
import java.io.Serializable;                                                        // Always required - (GenUtility.java:197)
import java.util.*;                                                                 // Always required if we have any MV attributes - (GenUtility.java:193)
import org.dmd.dmc.DmcAttribute;                                                    // Any attributes - (GenUtility.java:213)
import org.dmd.dmc.DmcObject;                                                       // Structural class - (GenUtility.java:324)
import org.dmd.dmc.DmcSliceInfo;                                                    // Required for object slicing - (GenUtility.java:202)
import org.dmd.dmc.DmcValueException;                                               // Any attributes - (GenUtility.java:214)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                         // Required for MODREC constructor - (GenUtility.java:201)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                               // Required for MODREC constructor - (GenUtility.java:200)
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;                    // Type specific set/add - (GenUtility.java:280)
import org.dmd.dmt.shared.generated.types.DmcTypeTestBasicObjectFixedREFSV;         // Reference type - (GenUtility.java:273)

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
public class UnnamedObjSVDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "UnnamedObjSV";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public UnnamedObjSVDMO() {
        super("UnnamedObjSV");
    }

    protected UnnamedObjSVDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public UnnamedObjSVDMO getNew(){
        UnnamedObjSVDMO rc = new UnnamedObjSVDMO();
        return(rc);
    }

    @Override
    public UnnamedObjSVDMO getSlice(DmcSliceInfo info){
        UnnamedObjSVDMO rc = new UnnamedObjSVDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public UnnamedObjSVDMO(DmcTypeModifierMV mods) {
        super("UnnamedObjSV");
        modrec(true);
        setModifier(mods);
    }

    public UnnamedObjSVDMO getModificationRecorder(){
        UnnamedObjSVDMO rc = new UnnamedObjSVDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
    public TestBasicObjectFixedDMO getSvUnnamedObj(){
        DmcTypeTestBasicObjectFixedREFSV attr = (DmcTypeTestBasicObjectFixedREFSV) get(DmtDMSAG.__svUnnamedObj);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svUnnamedObj to the specified value.
     * @param value TestBasicObjectFixedDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:676)
    public void setSvUnnamedObj(TestBasicObjectFixedDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__svUnnamedObj);
        if (attr == null)
            attr = new DmcTypeTestBasicObjectFixedREFSV(DmtDMSAG.__svUnnamedObj);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__svUnnamedObj,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svUnnamedObj to the specified value.
     * @param value A value compatible with DmcTypeTestBasicObjectFixedREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
    public void setSvUnnamedObj(Object value) throws DmcValueException {
        DmcTypeTestBasicObjectFixedREFSV attr  = (DmcTypeTestBasicObjectFixedREFSV) get(DmtDMSAG.__svUnnamedObj);
        if (attr == null)
            attr = new DmcTypeTestBasicObjectFixedREFSV(DmtDMSAG.__svUnnamedObj);
        
        attr.set(value);
        set(DmtDMSAG.__svUnnamedObj,attr);
    }

    /**
     * Removes the svUnnamedObj attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remSvUnnamedObj(){
         rem(DmtDMSAG.__svUnnamedObj);
    }




}

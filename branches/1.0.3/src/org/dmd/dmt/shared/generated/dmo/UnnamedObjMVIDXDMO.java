package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:372)
import java.io.Serializable;                                                        // Always required - (GenUtility.java:201)
import java.util.*;                                                                 // Always required if we have any MV attributes - (GenUtility.java:197)
import org.dmd.dmc.DmcAttribute;                                                    // Any attributes - (GenUtility.java:217)
import org.dmd.dmc.DmcObject;                                                       // Structural class - (GenUtility.java:328)
import org.dmd.dmc.DmcSliceInfo;                                                    // Required for object slicing - (GenUtility.java:206)
import org.dmd.dmc.DmcValueException;                                               // Any attributes - (GenUtility.java:218)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                         // Required for MODREC constructor - (GenUtility.java:205)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                               // Required for MODREC constructor - (GenUtility.java:204)
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;                    // Type specific set/add - (GenUtility.java:284)
import org.dmd.dmt.shared.generated.types.DmcTypeTestBasicObjectFixedREFMV;         // Reference type - (GenUtility.java:277)

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
public class UnnamedObjMVIDXDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "UnnamedObjMVIDX";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public UnnamedObjMVIDXDMO() {
        super("UnnamedObjMVIDX");
    }

    protected UnnamedObjMVIDXDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public UnnamedObjMVIDXDMO getNew(){
        UnnamedObjMVIDXDMO rc = new UnnamedObjMVIDXDMO();
        return(rc);
    }

    @Override
    public UnnamedObjMVIDXDMO getSlice(DmcSliceInfo info){
        UnnamedObjMVIDXDMO rc = new UnnamedObjMVIDXDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public UnnamedObjMVIDXDMO(DmcTypeModifierMV mods) {
        super("UnnamedObjMVIDX");
        modrec(true);
        setModifier(mods);
    }

    public UnnamedObjMVIDXDMO getModificationRecorder(){
        UnnamedObjMVIDXDMO rc = new UnnamedObjMVIDXDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return The nth TestBasicObjectFixed value without attempting lazy resolution.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:996)
    public TestBasicObjectFixedDMO getNthMvIdxUnnamedObj(int i){
        DmcTypeTestBasicObjectFixedREFMV attr = (DmcTypeTestBasicObjectFixedREFMV) get(DmtDMSAG.__mvIdxUnnamedObj);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Sets the mvIdxUnnamedObj value at the specified index.
     * @param value TestBasicObjectFixed
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1042)
    public DmcAttribute<?> setNthMvIdxUnnamedObj(int index, TestBasicObjectFixedDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxUnnamedObj);
        if (attr == null){
            if (value == null){
                if (getModifier() == null)
                    throw(new IllegalStateException("Calling setNth() on a non-existent attribute with a null value makes no sense!"));
                else{
                    nthNullFromEmptyAttribute(DmtDMSAG.__mvIdxUnnamedObj, index);
                    return(null);
                }
            }
            else
                attr = new DmcTypeTestBasicObjectFixedREFMV(DmtDMSAG.__mvIdxUnnamedObj);
        }
        
        try{
            setLastValue(attr.setMVnth(index, value));
            nth(DmtDMSAG.__mvIdxUnnamedObj, index ,attr, null);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific setNth() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another mvIdxUnnamedObj value.
     * @param value A value compatible with TestBasicObjectFixed
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1216)
    public DmcAttribute<?> addMvIdxUnnamedObj(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxUnnamedObj);
        if (attr == null)
            attr = new DmcTypeTestBasicObjectFixedREFMV(DmtDMSAG.__mvIdxUnnamedObj);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvIdxUnnamedObj,attr);
        return(attr);
    }

    /**
     * Returns the number of values in mvIdxUnnamedObj
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1233)
    public int getMvIdxUnnamedObjSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxUnnamedObj);
        if (attr == null){
            if (DmtDMSAG.__mvIdxUnnamedObj.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvIdxUnnamedObj.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvIdxUnnamedObj value.
     * @param value The TestBasicObjectFixed to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1255)
    public DmcAttribute<?> delMvIdxUnnamedObj(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxUnnamedObj);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeTestBasicObjectFixedREFMV(DmtDMSAG.__mvIdxUnnamedObj), value);
        else
            attr = del(DmtDMSAG.__mvIdxUnnamedObj, value);
        
        return(attr);
    }

    /**
     * Removes the mvIdxUnnamedObj attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1326)
    public void remMvIdxUnnamedObj(){
         rem(DmtDMSAG.__mvIdxUnnamedObj);
    }




}

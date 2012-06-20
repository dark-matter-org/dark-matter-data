package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:374)
import java.io.Serializable;                                                        // Always required - (GenUtility.java:203)
import java.util.*;                                                                 // Always required if we have any MV attributes - (GenUtility.java:198)
import org.dmd.dmc.DmcAttribute;                                                    // Any attributes - (GenUtility.java:219)
import org.dmd.dmc.DmcObject;                                                       // Structural class - (GenUtility.java:330)
import org.dmd.dmc.DmcSliceInfo;                                                    // Required for object slicing - (GenUtility.java:208)
import org.dmd.dmc.DmcValueException;                                               // Any attributes - (GenUtility.java:220)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                         // Required for MODREC constructor - (GenUtility.java:207)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                               // Required for MODREC constructor - (GenUtility.java:206)
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;                    // Type specific set/add - (GenUtility.java:286)
import org.dmd.dmt.shared.generated.types.DmcTypeTestBasicObjectFixedREFMV;         // Reference type - (GenUtility.java:279)

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
public class UnnamedObjMVDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "UnnamedObjMV";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public UnnamedObjMVDMO() {
        super("UnnamedObjMV");
    }

    protected UnnamedObjMVDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public UnnamedObjMVDMO getNew(){
        UnnamedObjMVDMO rc = new UnnamedObjMVDMO();
        return(rc);
    }

    @Override
    public UnnamedObjMVDMO getSlice(DmcSliceInfo info){
        UnnamedObjMVDMO rc = new UnnamedObjMVDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public UnnamedObjMVDMO(DmcTypeModifierMV mods) {
        super("UnnamedObjMV");
        modrec(true);
        setModifier(mods);
    }

    public UnnamedObjMVDMO getModificationRecorder(){
        UnnamedObjMVDMO rc = new UnnamedObjMVDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return An Iterator of TestBasicObjectFixedDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:931)
    public Iterator<TestBasicObjectFixedDMO> getMvUnnamedObj(){
        DmcTypeTestBasicObjectFixedREFMV attr = (DmcTypeTestBasicObjectFixedREFMV) get(DmtDMSAG.__mvUnnamedObj);
        if (attr == null)
            return( ((List<TestBasicObjectFixedDMO>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another mvUnnamedObj to the specified value.
     * @param value TestBasicObjectFixed
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:977)
    public DmcAttribute<?> addMvUnnamedObj(TestBasicObjectFixedDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvUnnamedObj);
        if (attr == null)
            attr = new DmcTypeTestBasicObjectFixedREFMV(DmtDMSAG.__mvUnnamedObj);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__mvUnnamedObj,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another mvUnnamedObj value.
     * @param value A value compatible with TestBasicObjectFixed
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1218)
    public DmcAttribute<?> addMvUnnamedObj(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvUnnamedObj);
        if (attr == null)
            attr = new DmcTypeTestBasicObjectFixedREFMV(DmtDMSAG.__mvUnnamedObj);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvUnnamedObj,attr);
        return(attr);
    }

    /**
     * Returns the number of values in mvUnnamedObj
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
    public int getMvUnnamedObjSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvUnnamedObj);
        if (attr == null){
            if (DmtDMSAG.__mvUnnamedObj.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvUnnamedObj.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvUnnamedObj value.
     * @param value The TestBasicObjectFixed to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1257)
    public DmcAttribute<?> delMvUnnamedObj(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvUnnamedObj);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeTestBasicObjectFixedREFMV(DmtDMSAG.__mvUnnamedObj), value);
        else
            attr = del(DmtDMSAG.__mvUnnamedObj, value);
        
        return(attr);
    }

    /**
     * Removes the mvUnnamedObj attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1328)
    public void remMvUnnamedObj(){
         rem(DmtDMSAG.__mvUnnamedObj);
    }




}

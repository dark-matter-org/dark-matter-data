package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:391)
import java.io.Serializable;                                                        // Always required - (GenUtility.java:220)
import java.util.*;                                                                 // Always required if we have any MV attributes - (GenUtility.java:215)
import org.dmd.dmc.DmcAttribute;                                                    // Any attributes - (GenUtility.java:236)
import org.dmd.dmc.DmcObject;                                                       // Structural class - (GenUtility.java:347)
import org.dmd.dmc.DmcSliceInfo;                                                    // Required for object slicing - (GenUtility.java:225)
import org.dmd.dmc.DmcValueException;                                               // Any attributes - (GenUtility.java:237)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                         // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                               // Required for MODREC constructor - (GenUtility.java:223)
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;                    // Type specific set/add - (GenUtility.java:303)
import org.dmd.dmt.shared.generated.types.DmcTypeTestBasicObjectFixedREFMV;         // Reference type - (GenUtility.java:296)

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


    static {
    }

    public UnnamedObjMVDMO() {
        super("UnnamedObjMV");
    }

    protected UnnamedObjMVDMO(String oc) {
        super(oc);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:948)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:994)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1235)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1252)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1274)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1345)
    public void remMvUnnamedObj(){
         rem(DmtDMSAG.__mvUnnamedObj);
    }




}
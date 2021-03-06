package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:408)
import java.io.Serializable;                                                         // Always required - (GenUtility.java:227)
import java.util.*;                                                                  // Always required if we have any MV attributes - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                                                     // Any attributes - (GenUtility.java:248)
import org.dmd.dmc.DmcObject;                                                        // Structural class - (GenUtility.java:362)
import org.dmd.dmc.DmcSliceInfo;                                                     // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                                                // Any attributes - (GenUtility.java:249)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                          // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;                     // Type specific set/add - (GenUtility.java:318)
import org.dmd.dmt.shared.generated.types.DmcTypeTestBasicObjectFixedREFSET;         // Reference type - (GenUtility.java:311)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class UnnamedObjHSDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "UnnamedObjHS";


    static {
    }

    public UnnamedObjHSDMO() {
        super("UnnamedObjHS");
    }

    protected UnnamedObjHSDMO(String oc) {
        super(oc);
    }

    @Override
    public UnnamedObjHSDMO getNew(){
        UnnamedObjHSDMO rc = new UnnamedObjHSDMO();
        return(rc);
    }

    @Override
    public UnnamedObjHSDMO getSlice(DmcSliceInfo info){
        UnnamedObjHSDMO rc = new UnnamedObjHSDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public UnnamedObjHSDMO(DmcTypeModifierMV mods) {
        super("UnnamedObjHS");
        modrec(true);
        setModifier(mods);
    }

    public UnnamedObjHSDMO getModificationRecorder(){
        UnnamedObjHSDMO rc = new UnnamedObjHSDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return An Iterator of TestBasicObjectFixedDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1134)
    public Iterator<TestBasicObjectFixedDMO> getHsUnnamedObj(){
        DmcTypeTestBasicObjectFixedREFSET attr = (DmcTypeTestBasicObjectFixedREFSET) get(DmtDMSAG.__hsUnnamedObj);
        if (attr == null)
            return( ((List<TestBasicObjectFixedDMO>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another hsUnnamedObj to the specified value.
     * @param value TestBasicObjectFixed
     * @return the attribute instance
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1181)
    public DmcAttribute<?> addHsUnnamedObj(TestBasicObjectFixedDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsUnnamedObj);
        if (attr == null)
            attr = new DmcTypeTestBasicObjectFixedREFSET(DmtDMSAG.__hsUnnamedObj);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__hsUnnamedObj,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another hsUnnamedObj value.
     * @param value A value compatible with TestBasicObjectFixed
     * @return the attribute instance
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1426)
    public DmcAttribute<?> addHsUnnamedObj(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsUnnamedObj);
        if (attr == null)
            attr = new DmcTypeTestBasicObjectFixedREFSET(DmtDMSAG.__hsUnnamedObj);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__hsUnnamedObj,attr);
        return(attr);
    }

    /**
     * @return the number of values in hsUnnamedObj
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1443)
    public int getHsUnnamedObjSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__hsUnnamedObj);
        if (attr == null){
            if (DmtDMSAG.__hsUnnamedObj.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__hsUnnamedObj.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a hsUnnamedObj value.
     * @param value The TestBasicObjectFixed to be deleted from set of attribute values.
     * @return the deleted attribute instance     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1466)
    public DmcAttribute<?> delHsUnnamedObj(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__hsUnnamedObj);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeTestBasicObjectFixedREFSET(DmtDMSAG.__hsUnnamedObj), value);
        else
            attr = del(DmtDMSAG.__hsUnnamedObj, value);
        
        return(attr);
    }

    /**
     * Removes the hsUnnamedObj attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1541)
    public void remHsUnnamedObj(){
         rem(DmtDMSAG.__hsUnnamedObj);
    }




}

package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:372)
import java.io.Serializable;                                  // Always required - (GenUtility.java:201)
import java.util.*;                                           // Always required if we have any MV attributes - (GenUtility.java:197)
import org.dmd.dmc.DmcAttribute;                              // Any attributes - (GenUtility.java:217)
import org.dmd.dmc.DmcObject;                                 // Structural class - (GenUtility.java:328)
import org.dmd.dmc.DmcSliceInfo;                              // Required for object slicing - (GenUtility.java:206)
import org.dmd.dmc.DmcValueException;                         // Any attributes - (GenUtility.java:218)
import org.dmd.dms.generated.dmo.MetaDMSAG;                   // Required for MODREC constructor - (GenUtility.java:205)
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor - (GenUtility.java:204)
import org.dmd.dms.generated.types.DmcTypeStringSET;          // Required type - (GenUtility.java:305)

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
public class PrimitiveHSDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "PrimitiveHS";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public PrimitiveHSDMO() {
        super("PrimitiveHS");
    }

    protected PrimitiveHSDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public PrimitiveHSDMO getNew(){
        PrimitiveHSDMO rc = new PrimitiveHSDMO();
        return(rc);
    }

    @Override
    public PrimitiveHSDMO getSlice(DmcSliceInfo info){
        PrimitiveHSDMO rc = new PrimitiveHSDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public PrimitiveHSDMO(DmcTypeModifierMV mods) {
        super("PrimitiveHS");
        modrec(true);
        setModifier(mods);
    }

    public PrimitiveHSDMO getModificationRecorder(){
        PrimitiveHSDMO rc = new PrimitiveHSDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1083)
    public Iterator<String> getHsString(){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(DmtDMSAG.__hsString);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1095)
    public String getNthHsString(int i){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(DmtDMSAG.__hsString);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another hsString to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public DmcAttribute<?> addHsString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsString);
        if (attr == null)
            attr = new DmcTypeStringSET(DmtDMSAG.__hsString);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__hsString,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1184)
    public boolean hsStringContains(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsString);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another hsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1216)
    public DmcAttribute<?> addHsString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsString);
        if (attr == null)
            attr = new DmcTypeStringSET(DmtDMSAG.__hsString);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__hsString,attr);
        return(attr);
    }

    /**
     * Returns the number of values in hsString
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1233)
    public int getHsStringSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__hsString);
        if (attr == null){
            if (DmtDMSAG.__hsString.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__hsString.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a hsString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1291)
    public DmcAttribute<?> delHsString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(DmtDMSAG.__hsString), value);
        else
            attr = del(DmtDMSAG.__hsString, value);
        
        return(attr);
    }

    /**
     * Deletes a hsString from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1307)
    public DmcAttribute<?> delHsString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(DmtDMSAG.__hsString), value);
        else
            attr = del(DmtDMSAG.__hsString, value);
        
        return(attr);
    }

    /**
     * Removes the hsString attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1326)
    public void remHsString(){
         rem(DmtDMSAG.__hsString);
    }




}
package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:320)
import java.io.Serializable;                                     // Always required
import java.util.*;                                              // Always required
import org.dmd.dmc.DmcAttribute;                                 // Any attributes
import org.dmd.dmc.DmcNamedObjectIF;                             // Named object
import org.dmd.dmc.DmcObject;                                    // Structural class
import org.dmd.dmc.DmcSliceInfo;                                 // Required for object slicing
import org.dmd.dmc.DmcValueException;                            // Any attributes
import org.dmd.dmc.types.IntegerName;                            // Naming attribute type
import org.dmd.dms.generated.dmo.MetaDMSAG;                      // Attribute from meta schema
import org.dmd.dms.generated.types.DmcTypeIntegerNameSV;         // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;            // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringSV;              // Required type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcClassInfo;
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
public class IntegerNamedObjectDMO  extends DmcObject  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "IntegerNamedObject";

    public final static DmcClassInfo classInfo = DmtDMSAG.__IntegerNamedObject;

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public IntegerNamedObjectDMO() {
        super("IntegerNamedObject");
    }

    protected IntegerNamedObjectDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public IntegerNamedObjectDMO getNew(){
        IntegerNamedObjectDMO rc = new IntegerNamedObjectDMO();
        return(rc);
    }

    @Override
    public IntegerNamedObjectDMO getSlice(DmcSliceInfo info){
        IntegerNamedObjectDMO rc = new IntegerNamedObjectDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public IntegerNamedObjectDMO(DmcTypeModifierMV mods) {
        super("IntegerNamedObject");
        modrec(true);
        setModifier(mods);
    }

    public IntegerNamedObjectDMO getModificationRecorder(){
        IntegerNamedObjectDMO rc = new IntegerNamedObjectDMO();
        rc.setIntegerName(getIntegerName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:735)
    public IntegerName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__integerName);
        if (name != null)
            return((IntegerName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__integerName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof IntegerNamedObjectDMO){
            return( getObjectName().equals( ((IntegerNamedObjectDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:641)
    public String getSvString(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmtDMSAG.__svString);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:679)
    public void setSvString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__svString);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtDMSAG.__svString);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__svString,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:731)
    public void setSvString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__svString);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtDMSAG.__svString);
        
        attr.set(value);
        set(DmtDMSAG.__svString,attr);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:746)
    public void remSvString(){
         rem(DmtDMSAG.__svString);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:641)
    public IntegerName getIntegerName(){
        DmcTypeIntegerNameSV attr = (DmcTypeIntegerNameSV) get(MetaDMSAG.__integerName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets integerName to the specified value.
     * @param value IntegerName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:679)
    public void setIntegerName(IntegerName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__integerName);
        if (attr == null)
            attr = new DmcTypeIntegerNameSV(MetaDMSAG.__integerName);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__integerName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets integerName to the specified value.
     * @param value A value compatible with DmcTypeIntegerNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:731)
    public void setIntegerName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__integerName);
        if (attr == null)
            attr = new DmcTypeIntegerNameSV(MetaDMSAG.__integerName);
        
        attr.set(value);
        set(MetaDMSAG.__integerName,attr);
    }

    /**
     * Removes the integerName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:746)
    public void remIntegerName(){
         rem(MetaDMSAG.__integerName);
    }




}

package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:396)
import java.io.Serializable;                                              // Always required - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                                          // Any attributes - (GenUtility.java:240)
import org.dmd.dmc.DmcObject;                                             // Structural class - (GenUtility.java:351)
import org.dmd.dmc.DmcObjectName;                                         // Alternative type for NameContainer values - (GenUtility.java:295)
import org.dmd.dmc.DmcSliceInfo;                                          // Required for object slicing - (GenUtility.java:229)
import org.dmd.dmc.DmcValueException;                                     // Any attributes - (GenUtility.java:241)
import org.dmd.dmc.types.NameContainer;                                   // Primitive type and !auxiliary class - (GenUtility.java:271)
import org.dmd.dms.generated.dmo.MetaDMSAG;                               // Required for MODREC constructor - (GenUtility.java:228)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                     // Required for MODREC constructor - (GenUtility.java:227)
import org.dmd.dms.generated.types.DmcTypeNameContainerSV;                // Required type - (GenUtility.java:328)
import org.dmd.dmt.shared.generated.types.DmcTypeDmtStringNameSV;         // Required type - (GenUtility.java:328)
import org.dmd.dmt.shared.types.DmtStringName;                            // Primitive type and !auxiliary class - (GenUtility.java:271)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class NameContainerTestDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "NameContainerTest";


    static {
    }

    public NameContainerTestDMO() {
        super("NameContainerTest");
    }

    protected NameContainerTestDMO(String oc) {
        super(oc);
    }

    @Override
    public NameContainerTestDMO getNew(){
        NameContainerTestDMO rc = new NameContainerTestDMO();
        return(rc);
    }

    @Override
    public NameContainerTestDMO getSlice(DmcSliceInfo info){
        NameContainerTestDMO rc = new NameContainerTestDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public NameContainerTestDMO(DmcTypeModifierMV mods) {
        super("NameContainerTest");
        modrec(true);
        setModifier(mods);
    }

    public NameContainerTestDMO getModificationRecorder(){
        NameContainerTestDMO rc = new NameContainerTestDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:784)
    public DmtStringName getAnotherDmtName(){
        DmcTypeDmtStringNameSV attr = (DmcTypeDmtStringNameSV) get(DmtDMSAG.__anotherDmtName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets anotherDmtName to the specified value.
     * @param value DmtStringName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:824)
    public void setAnotherDmtName(DmtStringName value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__anotherDmtName);
        if (attr == null)
            attr = new DmcTypeDmtStringNameSV(DmtDMSAG.__anotherDmtName);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__anotherDmtName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets anotherDmtName to the specified value.
     * @param value A value compatible with DmcTypeDmtStringNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setAnotherDmtName(Object value) throws DmcValueException {
        DmcTypeDmtStringNameSV attr  = (DmcTypeDmtStringNameSV) get(DmtDMSAG.__anotherDmtName);
        if (attr == null)
            attr = new DmcTypeDmtStringNameSV(DmtDMSAG.__anotherDmtName);
        
        attr.set(value);
        set(DmtDMSAG.__anotherDmtName,attr);
    }

    /**
     * Removes the anotherDmtName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remAnotherDmtName(){
         rem(DmtDMSAG.__anotherDmtName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:784)
    public DmtStringName getDmtStringName(){
        DmcTypeDmtStringNameSV attr = (DmcTypeDmtStringNameSV) get(DmtDMSAG.__dmtStringName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dmtStringName to the specified value.
     * @param value DmtStringName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:824)
    public void setDmtStringName(DmtStringName value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__dmtStringName);
        if (attr == null)
            attr = new DmcTypeDmtStringNameSV(DmtDMSAG.__dmtStringName);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__dmtStringName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets dmtStringName to the specified value.
     * @param value A value compatible with DmcTypeDmtStringNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setDmtStringName(Object value) throws DmcValueException {
        DmcTypeDmtStringNameSV attr  = (DmcTypeDmtStringNameSV) get(DmtDMSAG.__dmtStringName);
        if (attr == null)
            attr = new DmcTypeDmtStringNameSV(DmtDMSAG.__dmtStringName);
        
        attr.set(value);
        set(DmtDMSAG.__dmtStringName,attr);
    }

    /**
     * Removes the dmtStringName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remDmtStringName(){
         rem(DmtDMSAG.__dmtStringName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:784)
    public NameContainer getAnObjName(){
        DmcTypeNameContainerSV attr = (DmcTypeNameContainerSV) get(DmtDMSAG.__anObjName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets anObjName to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:824)
    public void setAnObjName(NameContainer value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__anObjName);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(DmtDMSAG.__anObjName);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__anObjName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets anObjName to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:850)
    public void setAnObjName(DmcObjectName value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__anObjName);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(DmtDMSAG.__anObjName);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__anObjName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The alternative type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets anObjName to the specified value.
     * @param value A value compatible with DmcTypeNameContainerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
    public void setAnObjName(Object value) throws DmcValueException {
        DmcTypeNameContainerSV attr  = (DmcTypeNameContainerSV) get(DmtDMSAG.__anObjName);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(DmtDMSAG.__anObjName);
        
        attr.set(value);
        set(DmtDMSAG.__anObjName,attr);
    }

    /**
     * Removes the anObjName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remAnObjName(){
         rem(DmtDMSAG.__anObjName);
    }




}

package org.dmd.dmt.dsd.dsda.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:393)
import java.io.Serializable;                                              // Always required - (GenUtility.java:221)
import org.dmd.dmc.DmcAttribute;                                          // Named object - (GenUtility.java:373)
import org.dmd.dmc.DmcNamedObjectIF;                                      // Named object - (GenUtility.java:372)
import org.dmd.dmc.DmcSliceInfo;                                          // Required for object slicing - (GenUtility.java:226)
import org.dmd.dmc.DmcValueException;                                     // Any attributes - (GenUtility.java:238)
import org.dmd.dmc.types.DefinitionName;                                  // Naming attribute type - (GenUtility.java:367)
import org.dmd.dms.generated.dmo.MetaDMSAG;                               // Required for MODREC constructor - (GenUtility.java:225)
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV;               // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                     // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.AConceptBaseDMO;         // Base class - (GenUtility.java:352)

/**
 * null
 * <P>
 * Generated from the dsdA schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class AConceptXDMO  extends AConceptBaseDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "AConceptX";


    static {
    }

    public AConceptXDMO() {
        super("AConceptX");
    }

    protected AConceptXDMO(String oc) {
        super(oc);
    }

    @Override
    public AConceptXDMO getNew(){
        AConceptXDMO rc = new AConceptXDMO();
        return(rc);
    }

    @Override
    public AConceptXDMO getSlice(DmcSliceInfo info){
        AConceptXDMO rc = new AConceptXDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public AConceptXDMO(DmcTypeModifierMV mods) {
        super("AConceptX");
        modrec(true);
        setModifier(mods);
    }

    public AConceptXDMO getModificationRecorder(){
        AConceptXDMO rc = new AConceptXDMO();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:750)
    public DefinitionName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        if (name != null)
            return((DefinitionName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:767)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:774)
    public boolean equals(Object obj){
        if (obj instanceof AConceptXDMO){
            return( getObjectName().equals( ((AConceptXDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:782)
    public int hashCode(){
        DefinitionName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
    public DefinitionName getName(){
        DmcTypeDefinitionNameSV attr = (DmcTypeDefinitionNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
    public void setName(DefinitionName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__name,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setName(Object value) throws DmcValueException {
        DmcTypeDefinitionNameSV attr  = (DmcTypeDefinitionNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remName(){
         rem(MetaDMSAG.__name);
    }




}

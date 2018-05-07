package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:408)
import java.io.Serializable;                                        // Always required - (GenUtility.java:227)
import org.dmd.dmc.DmcAttribute;                                    // Named object - (GenUtility.java:388)
import org.dmd.dmc.DmcNamedObjectIF;                                // Named object - (GenUtility.java:387)
import org.dmd.dmc.DmcSliceInfo;                                    // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                               // Any attributes - (GenUtility.java:249)
import org.dmd.dmc.types.DefinitionName;                            // Naming attribute type - (GenUtility.java:382)
import org.dmd.dms.generated.dmo.MetaDMSAG;                         // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV;         // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeModifierMV;               // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;             // Base class - (GenUtility.java:367)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * Used to test restricting object references in derived classes.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class ObjWithRefsDerivedADMO  extends ObjWithRefsDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "ObjWithRefsDerivedA";


    static {
    }

    public ObjWithRefsDerivedADMO() {
        super("ObjWithRefsDerivedA");
    }

    protected ObjWithRefsDerivedADMO(String oc) {
        super(oc);
    }

    @Override
    public ObjWithRefsDerivedADMO getNew(){
        ObjWithRefsDerivedADMO rc = new ObjWithRefsDerivedADMO();
        return(rc);
    }

    @Override
    public ObjWithRefsDerivedADMO getSlice(DmcSliceInfo info){
        ObjWithRefsDerivedADMO rc = new ObjWithRefsDerivedADMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ObjWithRefsDerivedADMO(DmcTypeModifierMV mods) {
        super("ObjWithRefsDerivedA");
        modrec(true);
        setModifier(mods);
    }

    public ObjWithRefsDerivedADMO getModificationRecorder(){
        ObjWithRefsDerivedADMO rc = new ObjWithRefsDerivedADMO();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:752)
    public DefinitionName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        if (name != null)
            return((DefinitionName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:769)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public boolean equals(Object obj){
        if (obj instanceof ObjWithRefsDerivedADMO){
            return( getObjectName().equals( ((ObjWithRefsDerivedADMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:784)
    public int hashCode(){
        DefinitionName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remName(){
         rem(MetaDMSAG.__name);
    }




}

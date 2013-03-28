package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:393)
import java.io.Serializable;                                             // Always required - (GenUtility.java:221)
import org.dmd.dmc.DmcAttribute;                                         // Any attributes - (GenUtility.java:237)
import org.dmd.dmc.DmcObject;                                            // Structural class - (GenUtility.java:348)
import org.dmd.dmc.DmcOmni;                                              // Lazy resolution - (GenUtility.java:329)
import org.dmd.dmc.DmcSliceInfo;                                         // Required for object slicing - (GenUtility.java:226)
import org.dmd.dmc.DmcValueException;                                    // Any attributes - (GenUtility.java:238)
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor - (GenUtility.java:225)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dmt.shared.generated.types.DmcTypeSomeRelationSV;         // Required type - (GenUtility.java:325)
import org.dmd.dmt.shared.generated.types.SomeRelation;                  // Extended reference type - (GenUtility.java:323)

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class ExtendedRefSVDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "ExtendedRefSV";


    static {
    }

    public ExtendedRefSVDMO() {
        super("ExtendedRefSV");
    }

    protected ExtendedRefSVDMO(String oc) {
        super(oc);
    }

    @Override
    public ExtendedRefSVDMO getNew(){
        ExtendedRefSVDMO rc = new ExtendedRefSVDMO();
        return(rc);
    }

    @Override
    public ExtendedRefSVDMO getSlice(DmcSliceInfo info){
        ExtendedRefSVDMO rc = new ExtendedRefSVDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ExtendedRefSVDMO(DmcTypeModifierMV mods) {
        super("ExtendedRefSV");
        modrec(true);
        setModifier(mods);
    }

    public ExtendedRefSVDMO getModificationRecorder(){
        ExtendedRefSVDMO rc = new ExtendedRefSVDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:731)
    /**
     * @return The SomeRelation, attempting lazy resolution (if it's turned on).
     */
    public SomeRelation getSvExtendedRef(){
        DmcTypeSomeRelationSV attr = (DmcTypeSomeRelationSV) get(DmtDMSAG.__svExtendedRef);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getSV());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:760)
    /**
     * @return The SomeRelation without attempting lazy resolution (if it's turned on).
     */
    public SomeRelation getSvExtendedRefREF(){
        DmcTypeSomeRelationSV attr = (DmcTypeSomeRelationSV) get(DmtDMSAG.__svExtendedRef);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svExtendedRef to the specified value.
     * @param value SomeRelation
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
    public void setSvExtendedRef(SomeRelation value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__svExtendedRef);
        if (attr == null)
            attr = new DmcTypeSomeRelationSV(DmtDMSAG.__svExtendedRef);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__svExtendedRef,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svExtendedRef to the specified value.
     * @param value A value compatible with DmcTypeSomeRelationSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setSvExtendedRef(Object value) throws DmcValueException {
        DmcTypeSomeRelationSV attr  = (DmcTypeSomeRelationSV) get(DmtDMSAG.__svExtendedRef);
        if (attr == null)
            attr = new DmcTypeSomeRelationSV(DmtDMSAG.__svExtendedRef);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DmtDMSAG.__svExtendedRef,attr);
    }

    /**
     * Removes the svExtendedRef attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remSvExtendedRef(){
         rem(DmtDMSAG.__svExtendedRef);
    }




}

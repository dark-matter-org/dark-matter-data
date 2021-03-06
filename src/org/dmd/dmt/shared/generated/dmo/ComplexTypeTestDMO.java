package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:408)
import java.io.Serializable;                                                          // Always required - (GenUtility.java:227)
import java.util.*;                                                                   // Always required if we have any MV attributes - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                                                      // Any attributes - (GenUtility.java:248)
import org.dmd.dmc.DmcObject;                                                         // Structural class - (GenUtility.java:362)
import org.dmd.dmc.DmcSliceInfo;                                                      // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                                                 // Any attributes - (GenUtility.java:249)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                           // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                 // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dmt.shared.generated.types.DmcTypeMenuElementTypeAndCommentMV;         // Required type - (GenUtility.java:339)
import org.dmd.dmt.shared.generated.types.DmcTypeMenuElementTypeAndCommentSV;         // Required type - (GenUtility.java:339)
import org.dmd.dmt.shared.generated.types.MenuElementTypeAndComment;                  // Primitive type - (GenUtility.java:282)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class ComplexTypeTestDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "ComplexTypeTest";


    static {
    }

    public ComplexTypeTestDMO() {
        super("ComplexTypeTest");
    }

    protected ComplexTypeTestDMO(String oc) {
        super(oc);
    }

    @Override
    public ComplexTypeTestDMO getNew(){
        ComplexTypeTestDMO rc = new ComplexTypeTestDMO();
        return(rc);
    }

    @Override
    public ComplexTypeTestDMO getSlice(DmcSliceInfo info){
        ComplexTypeTestDMO rc = new ComplexTypeTestDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ComplexTypeTestDMO(DmcTypeModifierMV mods) {
        super("ComplexTypeTest");
        modrec(true);
        setModifier(mods);
    }

    public ComplexTypeTestDMO getModificationRecorder(){
        ComplexTypeTestDMO rc = new ComplexTypeTestDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
    public MenuElementTypeAndComment getSvComplex(){
        DmcTypeMenuElementTypeAndCommentSV attr = (DmcTypeMenuElementTypeAndCommentSV) get(DmtDMSAG.__svComplex);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svComplex to the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
    public void setSvComplex(MenuElementTypeAndComment value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__svComplex);
        if (attr == null)
            attr = new DmcTypeMenuElementTypeAndCommentSV(DmtDMSAG.__svComplex);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__svComplex,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svComplex to the specified value.
     * @param value A value compatible with DmcTypeMenuElementTypeAndCommentSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setSvComplex(Object value) throws DmcValueException {
        DmcTypeMenuElementTypeAndCommentSV attr  = (DmcTypeMenuElementTypeAndCommentSV) get(DmtDMSAG.__svComplex);
        if (attr == null)
            attr = new DmcTypeMenuElementTypeAndCommentSV(DmtDMSAG.__svComplex);
        
        attr.set(value);
        set(DmtDMSAG.__svComplex,attr);
    }

    /**
     * Removes the svComplex attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remSvComplex(){
         rem(DmtDMSAG.__svComplex);
    }

    /**
     * @return An Iterator of MenuElementTypeAndComment objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1289)
    public Iterator<MenuElementTypeAndComment> getMvComplex(){
        DmcTypeMenuElementTypeAndCommentMV attr = (DmcTypeMenuElementTypeAndCommentMV) get(DmtDMSAG.__mvComplex);
        if (attr == null)
            return( ((List<MenuElementTypeAndComment>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @param i the index
     * @return The nth MenuElementTypeAndComment value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1302)
    public MenuElementTypeAndComment getNthMvComplex(int i){
        DmcTypeMenuElementTypeAndCommentMV attr = (DmcTypeMenuElementTypeAndCommentMV) get(DmtDMSAG.__mvComplex);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another mvComplex to the specified value.
     * @param value MenuElementTypeAndComment
     * @return the attribute instance
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> addMvComplex(MenuElementTypeAndComment value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvComplex);
        if (attr == null)
            attr = new DmcTypeMenuElementTypeAndCommentMV(DmtDMSAG.__mvComplex);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__mvComplex,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * @param value MenuElementTypeAndComment
     * @return true if we contain a valued keyed by the specified MenuElementTypeAndComment.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1392)
    public boolean mvComplexContains(MenuElementTypeAndComment value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvComplex);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another mvComplex value.
     * @param value A value compatible with MenuElementTypeAndComment
     * @return the attribute instance
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1426)
    public DmcAttribute<?> addMvComplex(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvComplex);
        if (attr == null)
            attr = new DmcTypeMenuElementTypeAndCommentMV(DmtDMSAG.__mvComplex);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvComplex,attr);
        return(attr);
    }

    /**
     * @return the number of values in mvComplex
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1443)
    public int getMvComplexSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvComplex);
        if (attr == null){
            if (DmtDMSAG.__mvComplex.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvComplex.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvComplex value.
     * @param value The MenuElementTypeAndComment to be deleted from set of attribute values.
     * @return the deleted attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1505)
    public DmcAttribute<?> delMvComplex(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvComplex);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeMenuElementTypeAndCommentMV(DmtDMSAG.__mvComplex), value);
        else
            attr = del(DmtDMSAG.__mvComplex, value);
        
        return(attr);
    }

    /**
     * Deletes a mvComplex from the specified value.
     * @param value MenuElementTypeAndComment
     * @return the deleted attribute instance     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1522)
    public DmcAttribute<?> delMvComplex(MenuElementTypeAndComment value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvComplex);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeMenuElementTypeAndCommentMV(DmtDMSAG.__mvComplex), value);
        else
            attr = del(DmtDMSAG.__mvComplex, value);
        
        return(attr);
    }

    /**
     * Removes the mvComplex attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1541)
    public void remMvComplex(){
         rem(DmtDMSAG.__mvComplex);
    }




}

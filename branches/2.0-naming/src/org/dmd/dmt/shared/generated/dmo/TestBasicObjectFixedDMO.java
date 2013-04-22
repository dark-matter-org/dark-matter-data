package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:393)
import java.io.Serializable;                                                             // Always required - (GenUtility.java:221)
import java.util.*;                                                                      // Always required if we have any MV attributes - (GenUtility.java:216)
import java.util.Date;                                                                   // Primitive type and !auxiliary class - (GenUtility.java:268)
import org.dmd.dmc.DmcAttribute;                                                         // Any attributes - (GenUtility.java:237)
import org.dmd.dmc.DmcObject;                                                            // Structural class - (GenUtility.java:348)
import org.dmd.dmc.DmcOmni;                                                              // Lazy resolution - (GenUtility.java:317)
import org.dmd.dmc.DmcSliceInfo;                                                         // Required for object slicing - (GenUtility.java:226)
import org.dmd.dmc.DmcValueException;                                                    // Any attributes - (GenUtility.java:238)
import org.dmd.dmc.types.IntegerToString;                                                // Primitive type and !auxiliary class - (GenUtility.java:268)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                              // Required for MODREC constructor - (GenUtility.java:225)
import org.dmd.dms.generated.types.DmcTypeBooleanMV;                                     // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                                     // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeDateMV;                                        // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeDateSET;                                       // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeDateSV;                                        // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeDoubleMV;                                      // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeDoubleSET;                                     // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeDoubleSV;                                      // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeFloatMV;                                       // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeFloatSET;                                      // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeFloatSV;                                       // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeIntegerMV;                                     // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeIntegerSET;                                    // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                                     // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeIntegerToStringMAP;                            // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeLongMV;                                        // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeLongSET;                                       // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeLongSV;                                        // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                    // Required for MODREC constructor - (GenUtility.java:224)
import org.dmd.dms.generated.types.DmcTypeStringMV;                                      // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeStringSET;                                     // Required type - (GenUtility.java:325)
import org.dmd.dms.generated.types.DmcTypeStringSV;                                      // Required type - (GenUtility.java:325)
import org.dmd.dmt.shared.generated.dmo.TestBasicNamedObjectFixedDMO;                    // Type specific set/add - (GenUtility.java:304)
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;                         // Type specific set/add - (GenUtility.java:304)
import org.dmd.dmt.shared.generated.enums.DmtTestEnum;                                   // Primitive type and !auxiliary class - (GenUtility.java:268)
import org.dmd.dmt.shared.generated.types.DmcTypeDmtTestEnumSET;                         // Required type - (GenUtility.java:325)
import org.dmd.dmt.shared.generated.types.DmcTypeTestBasicNamedObjectFixedREFSV;         // Reference type - (GenUtility.java:297)
import org.dmd.dmt.shared.generated.types.DmcTypeTestBasicObjectFixedREFMV;              // Reference type - (GenUtility.java:297)
import org.dmd.dmt.shared.generated.types.TestBasicNamedObjectFixedREF;                  // Helper class - (GenUtility.java:332)

/**
 * The TestBasicObjectFixed class provides a test bed for all types of
 * basic\n attribute values.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class TestBasicObjectFixedDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "TestBasicObjectFixed";


    static {
    }

    public TestBasicObjectFixedDMO() {
        super("TestBasicObjectFixed");
    }

    protected TestBasicObjectFixedDMO(String oc) {
        super(oc);
    }

    @Override
    public TestBasicObjectFixedDMO getNew(){
        TestBasicObjectFixedDMO rc = new TestBasicObjectFixedDMO();
        return(rc);
    }

    @Override
    public TestBasicObjectFixedDMO getSlice(DmcSliceInfo info){
        TestBasicObjectFixedDMO rc = new TestBasicObjectFixedDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public TestBasicObjectFixedDMO(DmcTypeModifierMV mods) {
        super("TestBasicObjectFixed");
        modrec(true);
        setModifier(mods);
    }

    public TestBasicObjectFixedDMO getModificationRecorder(){
        TestBasicObjectFixedDMO rc = new TestBasicObjectFixedDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
    public Boolean isSvBoolean(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(DmtDMSAG.__svBoolean);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets svBoolean to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
    public void setSvBoolean(Boolean value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__svBoolean);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmtDMSAG.__svBoolean);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__svBoolean,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svBoolean to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setSvBoolean(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(DmtDMSAG.__svBoolean);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmtDMSAG.__svBoolean);
        
        attr.set(value);
        set(DmtDMSAG.__svBoolean,attr);
    }

    /**
     * Removes the svBoolean attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remSvBoolean(){
         rem(DmtDMSAG.__svBoolean);
    }

    /**
     * @return An Iterator of Boolean objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public Iterator<Boolean> getMvBoolean(){
        DmcTypeBooleanMV attr = (DmcTypeBooleanMV) get(DmtDMSAG.__mvBoolean);
        if (attr == null)
            return( ((List<Boolean>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Boolean value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1121)
    public Boolean getNthMvBoolean(int i){
        DmcTypeBooleanMV attr = (DmcTypeBooleanMV) get(DmtDMSAG.__mvBoolean);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another mvBoolean to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1135)
    public DmcAttribute<?> addMvBoolean(Boolean value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvBoolean);
        if (attr == null)
            attr = new DmcTypeBooleanMV(DmtDMSAG.__mvBoolean);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__mvBoolean,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Boolean.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1210)
    public boolean mvBooleanContains(Boolean value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvBoolean);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another mvBoolean value.
     * @param value A value compatible with Boolean
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> addMvBoolean(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvBoolean);
        if (attr == null)
            attr = new DmcTypeBooleanMV(DmtDMSAG.__mvBoolean);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvBoolean,attr);
        return(attr);
    }

    /**
     * Returns the number of values in mvBoolean
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
    public int getMvBooleanSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvBoolean);
        if (attr == null){
            if (DmtDMSAG.__mvBoolean.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvBoolean.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvBoolean value.
     * @param value The Boolean to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> delMvBoolean(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvBoolean);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeBooleanMV(DmtDMSAG.__mvBoolean), value);
        else
            attr = del(DmtDMSAG.__mvBoolean, value);
        
        return(attr);
    }

    /**
     * Deletes a mvBoolean from the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1333)
    public DmcAttribute<?> delMvBoolean(Boolean value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvBoolean);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeBooleanMV(DmtDMSAG.__mvBoolean), value);
        else
            attr = del(DmtDMSAG.__mvBoolean, value);
        
        return(attr);
    }

    /**
     * Removes the mvBoolean attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remMvBoolean(){
         rem(DmtDMSAG.__mvBoolean);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
    public Date getSvDate(){
        DmcTypeDateSV attr = (DmcTypeDateSV) get(DmtDMSAG.__svDate);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svDate to the specified value.
     * @param value Date
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
    public void setSvDate(Date value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__svDate);
        if (attr == null)
            attr = new DmcTypeDateSV(DmtDMSAG.__svDate);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__svDate,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svDate to the specified value.
     * @param value A value compatible with DmcTypeDateSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setSvDate(Object value) throws DmcValueException {
        DmcTypeDateSV attr  = (DmcTypeDateSV) get(DmtDMSAG.__svDate);
        if (attr == null)
            attr = new DmcTypeDateSV(DmtDMSAG.__svDate);
        
        attr.set(value);
        set(DmtDMSAG.__svDate,attr);
    }

    /**
     * Removes the svDate attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remSvDate(){
         rem(DmtDMSAG.__svDate);
    }

    /**
     * @return An Iterator of Date objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public Iterator<Date> getMvDate(){
        DmcTypeDateMV attr = (DmcTypeDateMV) get(DmtDMSAG.__mvDate);
        if (attr == null)
            return( ((List<Date>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Date value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1121)
    public Date getNthMvDate(int i){
        DmcTypeDateMV attr = (DmcTypeDateMV) get(DmtDMSAG.__mvDate);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another mvDate to the specified value.
     * @param value Date
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1135)
    public DmcAttribute<?> addMvDate(Date value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvDate);
        if (attr == null)
            attr = new DmcTypeDateMV(DmtDMSAG.__mvDate);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__mvDate,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Date.
     * @param value Date
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1210)
    public boolean mvDateContains(Date value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvDate);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another mvDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> addMvDate(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvDate);
        if (attr == null)
            attr = new DmcTypeDateMV(DmtDMSAG.__mvDate);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvDate,attr);
        return(attr);
    }

    /**
     * Returns the number of values in mvDate
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
    public int getMvDateSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvDate);
        if (attr == null){
            if (DmtDMSAG.__mvDate.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvDate.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvDate value.
     * @param value The Date to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> delMvDate(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvDate);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDateMV(DmtDMSAG.__mvDate), value);
        else
            attr = del(DmtDMSAG.__mvDate, value);
        
        return(attr);
    }

    /**
     * Deletes a mvDate from the specified value.
     * @param value Date
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1333)
    public DmcAttribute<?> delMvDate(Date value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvDate);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDateMV(DmtDMSAG.__mvDate), value);
        else
            attr = del(DmtDMSAG.__mvDate, value);
        
        return(attr);
    }

    /**
     * Removes the mvDate attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remMvDate(){
         rem(DmtDMSAG.__mvDate);
    }

    /**
     * @return An Iterator of Date objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public Iterator<Date> getHsDate(){
        DmcTypeDateSET attr = (DmcTypeDateSET) get(DmtDMSAG.__hsDate);
        if (attr == null)
            return( ((List<Date>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Date value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1121)
    public Date getNthHsDate(int i){
        DmcTypeDateSET attr = (DmcTypeDateSET) get(DmtDMSAG.__hsDate);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another hsDate to the specified value.
     * @param value Date
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1135)
    public DmcAttribute<?> addHsDate(Date value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsDate);
        if (attr == null)
            attr = new DmcTypeDateSET(DmtDMSAG.__hsDate);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__hsDate,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Date.
     * @param value Date
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1210)
    public boolean hsDateContains(Date value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsDate);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another hsDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> addHsDate(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsDate);
        if (attr == null)
            attr = new DmcTypeDateSET(DmtDMSAG.__hsDate);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__hsDate,attr);
        return(attr);
    }

    /**
     * Returns the number of values in hsDate
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
    public int getHsDateSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__hsDate);
        if (attr == null){
            if (DmtDMSAG.__hsDate.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__hsDate.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a hsDate value.
     * @param value The Date to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> delHsDate(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsDate);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDateSET(DmtDMSAG.__hsDate), value);
        else
            attr = del(DmtDMSAG.__hsDate, value);
        
        return(attr);
    }

    /**
     * Deletes a hsDate from the specified value.
     * @param value Date
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1333)
    public DmcAttribute<?> delHsDate(Date value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsDate);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDateSET(DmtDMSAG.__hsDate), value);
        else
            attr = del(DmtDMSAG.__hsDate, value);
        
        return(attr);
    }

    /**
     * Removes the hsDate attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remHsDate(){
         rem(DmtDMSAG.__hsDate);
    }

    /**
     * @return An Iterator of Date objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public Iterator<Date> getTsDate(){
        DmcTypeDateSET attr = (DmcTypeDateSET) get(DmtDMSAG.__tsDate);
        if (attr == null)
            return( ((List<Date>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Date value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1121)
    public Date getNthTsDate(int i){
        DmcTypeDateSET attr = (DmcTypeDateSET) get(DmtDMSAG.__tsDate);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another tsDate to the specified value.
     * @param value Date
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1135)
    public DmcAttribute<?> addTsDate(Date value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsDate);
        if (attr == null)
            attr = new DmcTypeDateSET(DmtDMSAG.__tsDate);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__tsDate,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Date.
     * @param value Date
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1210)
    public boolean tsDateContains(Date value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsDate);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another tsDate value.
     * @param value A value compatible with Date
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> addTsDate(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsDate);
        if (attr == null)
            attr = new DmcTypeDateSET(DmtDMSAG.__tsDate);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__tsDate,attr);
        return(attr);
    }

    /**
     * Returns the number of values in tsDate
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
    public int getTsDateSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__tsDate);
        if (attr == null){
            if (DmtDMSAG.__tsDate.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__tsDate.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a tsDate value.
     * @param value The Date to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> delTsDate(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsDate);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDateSET(DmtDMSAG.__tsDate), value);
        else
            attr = del(DmtDMSAG.__tsDate, value);
        
        return(attr);
    }

    /**
     * Deletes a tsDate from the specified value.
     * @param value Date
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1333)
    public DmcAttribute<?> delTsDate(Date value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsDate);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDateSET(DmtDMSAG.__tsDate), value);
        else
            attr = del(DmtDMSAG.__tsDate, value);
        
        return(attr);
    }

    /**
     * Removes the tsDate attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remTsDate(){
         rem(DmtDMSAG.__tsDate);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
    public Double getSvDouble(){
        DmcTypeDoubleSV attr = (DmcTypeDoubleSV) get(DmtDMSAG.__svDouble);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svDouble to the specified value.
     * @param value Double
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
    public void setSvDouble(Double value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__svDouble);
        if (attr == null)
            attr = new DmcTypeDoubleSV(DmtDMSAG.__svDouble);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__svDouble,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svDouble to the specified value.
     * @param value A value compatible with DmcTypeDoubleSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setSvDouble(Object value) throws DmcValueException {
        DmcTypeDoubleSV attr  = (DmcTypeDoubleSV) get(DmtDMSAG.__svDouble);
        if (attr == null)
            attr = new DmcTypeDoubleSV(DmtDMSAG.__svDouble);
        
        attr.set(value);
        set(DmtDMSAG.__svDouble,attr);
    }

    /**
     * Removes the svDouble attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remSvDouble(){
         rem(DmtDMSAG.__svDouble);
    }

    /**
     * @return An Iterator of Double objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public Iterator<Double> getMvDouble(){
        DmcTypeDoubleMV attr = (DmcTypeDoubleMV) get(DmtDMSAG.__mvDouble);
        if (attr == null)
            return( ((List<Double>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Double value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1121)
    public Double getNthMvDouble(int i){
        DmcTypeDoubleMV attr = (DmcTypeDoubleMV) get(DmtDMSAG.__mvDouble);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another mvDouble to the specified value.
     * @param value Double
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1135)
    public DmcAttribute<?> addMvDouble(Double value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvDouble);
        if (attr == null)
            attr = new DmcTypeDoubleMV(DmtDMSAG.__mvDouble);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__mvDouble,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Double.
     * @param value Double
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1210)
    public boolean mvDoubleContains(Double value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvDouble);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another mvDouble value.
     * @param value A value compatible with Double
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> addMvDouble(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvDouble);
        if (attr == null)
            attr = new DmcTypeDoubleMV(DmtDMSAG.__mvDouble);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvDouble,attr);
        return(attr);
    }

    /**
     * Returns the number of values in mvDouble
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
    public int getMvDoubleSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvDouble);
        if (attr == null){
            if (DmtDMSAG.__mvDouble.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvDouble.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvDouble value.
     * @param value The Double to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> delMvDouble(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvDouble);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDoubleMV(DmtDMSAG.__mvDouble), value);
        else
            attr = del(DmtDMSAG.__mvDouble, value);
        
        return(attr);
    }

    /**
     * Deletes a mvDouble from the specified value.
     * @param value Double
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1333)
    public DmcAttribute<?> delMvDouble(Double value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvDouble);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDoubleMV(DmtDMSAG.__mvDouble), value);
        else
            attr = del(DmtDMSAG.__mvDouble, value);
        
        return(attr);
    }

    /**
     * Removes the mvDouble attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remMvDouble(){
         rem(DmtDMSAG.__mvDouble);
    }

    /**
     * @return An Iterator of Double objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public Iterator<Double> getHsDouble(){
        DmcTypeDoubleSET attr = (DmcTypeDoubleSET) get(DmtDMSAG.__hsDouble);
        if (attr == null)
            return( ((List<Double>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Double value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1121)
    public Double getNthHsDouble(int i){
        DmcTypeDoubleSET attr = (DmcTypeDoubleSET) get(DmtDMSAG.__hsDouble);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another hsDouble to the specified value.
     * @param value Double
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1135)
    public DmcAttribute<?> addHsDouble(Double value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsDouble);
        if (attr == null)
            attr = new DmcTypeDoubleSET(DmtDMSAG.__hsDouble);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__hsDouble,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Double.
     * @param value Double
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1210)
    public boolean hsDoubleContains(Double value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsDouble);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another hsDouble value.
     * @param value A value compatible with Double
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> addHsDouble(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsDouble);
        if (attr == null)
            attr = new DmcTypeDoubleSET(DmtDMSAG.__hsDouble);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__hsDouble,attr);
        return(attr);
    }

    /**
     * Returns the number of values in hsDouble
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
    public int getHsDoubleSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__hsDouble);
        if (attr == null){
            if (DmtDMSAG.__hsDouble.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__hsDouble.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a hsDouble value.
     * @param value The Double to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> delHsDouble(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsDouble);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDoubleSET(DmtDMSAG.__hsDouble), value);
        else
            attr = del(DmtDMSAG.__hsDouble, value);
        
        return(attr);
    }

    /**
     * Deletes a hsDouble from the specified value.
     * @param value Double
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1333)
    public DmcAttribute<?> delHsDouble(Double value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsDouble);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDoubleSET(DmtDMSAG.__hsDouble), value);
        else
            attr = del(DmtDMSAG.__hsDouble, value);
        
        return(attr);
    }

    /**
     * Removes the hsDouble attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remHsDouble(){
         rem(DmtDMSAG.__hsDouble);
    }

    /**
     * @return An Iterator of Double objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public Iterator<Double> getTsDouble(){
        DmcTypeDoubleSET attr = (DmcTypeDoubleSET) get(DmtDMSAG.__tsDouble);
        if (attr == null)
            return( ((List<Double>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Double value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1121)
    public Double getNthTsDouble(int i){
        DmcTypeDoubleSET attr = (DmcTypeDoubleSET) get(DmtDMSAG.__tsDouble);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another tsDouble to the specified value.
     * @param value Double
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1135)
    public DmcAttribute<?> addTsDouble(Double value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsDouble);
        if (attr == null)
            attr = new DmcTypeDoubleSET(DmtDMSAG.__tsDouble);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__tsDouble,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Double.
     * @param value Double
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1210)
    public boolean tsDoubleContains(Double value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsDouble);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another tsDouble value.
     * @param value A value compatible with Double
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> addTsDouble(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsDouble);
        if (attr == null)
            attr = new DmcTypeDoubleSET(DmtDMSAG.__tsDouble);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__tsDouble,attr);
        return(attr);
    }

    /**
     * Returns the number of values in tsDouble
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
    public int getTsDoubleSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__tsDouble);
        if (attr == null){
            if (DmtDMSAG.__tsDouble.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__tsDouble.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a tsDouble value.
     * @param value The Double to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> delTsDouble(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsDouble);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDoubleSET(DmtDMSAG.__tsDouble), value);
        else
            attr = del(DmtDMSAG.__tsDouble, value);
        
        return(attr);
    }

    /**
     * Deletes a tsDouble from the specified value.
     * @param value Double
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1333)
    public DmcAttribute<?> delTsDouble(Double value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsDouble);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDoubleSET(DmtDMSAG.__tsDouble), value);
        else
            attr = del(DmtDMSAG.__tsDouble, value);
        
        return(attr);
    }

    /**
     * Removes the tsDouble attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remTsDouble(){
         rem(DmtDMSAG.__tsDouble);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
    public Float getSvFloat(){
        DmcTypeFloatSV attr = (DmcTypeFloatSV) get(DmtDMSAG.__svFloat);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svFloat to the specified value.
     * @param value Float
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
    public void setSvFloat(Float value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__svFloat);
        if (attr == null)
            attr = new DmcTypeFloatSV(DmtDMSAG.__svFloat);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__svFloat,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svFloat to the specified value.
     * @param value A value compatible with DmcTypeFloatSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setSvFloat(Object value) throws DmcValueException {
        DmcTypeFloatSV attr  = (DmcTypeFloatSV) get(DmtDMSAG.__svFloat);
        if (attr == null)
            attr = new DmcTypeFloatSV(DmtDMSAG.__svFloat);
        
        attr.set(value);
        set(DmtDMSAG.__svFloat,attr);
    }

    /**
     * Removes the svFloat attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remSvFloat(){
         rem(DmtDMSAG.__svFloat);
    }

    /**
     * @return An Iterator of Float objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public Iterator<Float> getMvFloat(){
        DmcTypeFloatMV attr = (DmcTypeFloatMV) get(DmtDMSAG.__mvFloat);
        if (attr == null)
            return( ((List<Float>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Float value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1121)
    public Float getNthMvFloat(int i){
        DmcTypeFloatMV attr = (DmcTypeFloatMV) get(DmtDMSAG.__mvFloat);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another mvFloat to the specified value.
     * @param value Float
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1135)
    public DmcAttribute<?> addMvFloat(Float value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvFloat);
        if (attr == null)
            attr = new DmcTypeFloatMV(DmtDMSAG.__mvFloat);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__mvFloat,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Float.
     * @param value Float
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1210)
    public boolean mvFloatContains(Float value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvFloat);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another mvFloat value.
     * @param value A value compatible with Float
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> addMvFloat(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvFloat);
        if (attr == null)
            attr = new DmcTypeFloatMV(DmtDMSAG.__mvFloat);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvFloat,attr);
        return(attr);
    }

    /**
     * Returns the number of values in mvFloat
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
    public int getMvFloatSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvFloat);
        if (attr == null){
            if (DmtDMSAG.__mvFloat.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvFloat.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvFloat value.
     * @param value The Float to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> delMvFloat(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvFloat);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeFloatMV(DmtDMSAG.__mvFloat), value);
        else
            attr = del(DmtDMSAG.__mvFloat, value);
        
        return(attr);
    }

    /**
     * Deletes a mvFloat from the specified value.
     * @param value Float
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1333)
    public DmcAttribute<?> delMvFloat(Float value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvFloat);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeFloatMV(DmtDMSAG.__mvFloat), value);
        else
            attr = del(DmtDMSAG.__mvFloat, value);
        
        return(attr);
    }

    /**
     * Removes the mvFloat attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remMvFloat(){
         rem(DmtDMSAG.__mvFloat);
    }

    /**
     * @return An Iterator of Float objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public Iterator<Float> getHsFloat(){
        DmcTypeFloatSET attr = (DmcTypeFloatSET) get(DmtDMSAG.__hsFloat);
        if (attr == null)
            return( ((List<Float>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Float value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1121)
    public Float getNthHsFloat(int i){
        DmcTypeFloatSET attr = (DmcTypeFloatSET) get(DmtDMSAG.__hsFloat);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another hsFloat to the specified value.
     * @param value Float
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1135)
    public DmcAttribute<?> addHsFloat(Float value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsFloat);
        if (attr == null)
            attr = new DmcTypeFloatSET(DmtDMSAG.__hsFloat);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__hsFloat,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Float.
     * @param value Float
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1210)
    public boolean hsFloatContains(Float value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsFloat);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another hsFloat value.
     * @param value A value compatible with Float
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> addHsFloat(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsFloat);
        if (attr == null)
            attr = new DmcTypeFloatSET(DmtDMSAG.__hsFloat);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__hsFloat,attr);
        return(attr);
    }

    /**
     * Returns the number of values in hsFloat
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
    public int getHsFloatSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__hsFloat);
        if (attr == null){
            if (DmtDMSAG.__hsFloat.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__hsFloat.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a hsFloat value.
     * @param value The Float to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> delHsFloat(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsFloat);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeFloatSET(DmtDMSAG.__hsFloat), value);
        else
            attr = del(DmtDMSAG.__hsFloat, value);
        
        return(attr);
    }

    /**
     * Deletes a hsFloat from the specified value.
     * @param value Float
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1333)
    public DmcAttribute<?> delHsFloat(Float value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsFloat);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeFloatSET(DmtDMSAG.__hsFloat), value);
        else
            attr = del(DmtDMSAG.__hsFloat, value);
        
        return(attr);
    }

    /**
     * Removes the hsFloat attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remHsFloat(){
         rem(DmtDMSAG.__hsFloat);
    }

    /**
     * @return An Iterator of Float objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public Iterator<Float> getTsFloat(){
        DmcTypeFloatSET attr = (DmcTypeFloatSET) get(DmtDMSAG.__tsFloat);
        if (attr == null)
            return( ((List<Float>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Float value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1121)
    public Float getNthTsFloat(int i){
        DmcTypeFloatSET attr = (DmcTypeFloatSET) get(DmtDMSAG.__tsFloat);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another tsFloat to the specified value.
     * @param value Float
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1135)
    public DmcAttribute<?> addTsFloat(Float value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsFloat);
        if (attr == null)
            attr = new DmcTypeFloatSET(DmtDMSAG.__tsFloat);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__tsFloat,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Float.
     * @param value Float
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1210)
    public boolean tsFloatContains(Float value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsFloat);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another tsFloat value.
     * @param value A value compatible with Float
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> addTsFloat(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsFloat);
        if (attr == null)
            attr = new DmcTypeFloatSET(DmtDMSAG.__tsFloat);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__tsFloat,attr);
        return(attr);
    }

    /**
     * Returns the number of values in tsFloat
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
    public int getTsFloatSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__tsFloat);
        if (attr == null){
            if (DmtDMSAG.__tsFloat.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__tsFloat.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a tsFloat value.
     * @param value The Float to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> delTsFloat(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsFloat);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeFloatSET(DmtDMSAG.__tsFloat), value);
        else
            attr = del(DmtDMSAG.__tsFloat, value);
        
        return(attr);
    }

    /**
     * Deletes a tsFloat from the specified value.
     * @param value Float
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1333)
    public DmcAttribute<?> delTsFloat(Float value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsFloat);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeFloatSET(DmtDMSAG.__tsFloat), value);
        else
            attr = del(DmtDMSAG.__tsFloat, value);
        
        return(attr);
    }

    /**
     * Removes the tsFloat attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remTsFloat(){
         rem(DmtDMSAG.__tsFloat);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
    public Integer getSvInteger(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(DmtDMSAG.__svInteger);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svInteger to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
    public void setSvInteger(Integer value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__svInteger);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmtDMSAG.__svInteger);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__svInteger,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svInteger to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setSvInteger(Object value) throws DmcValueException {
        DmcTypeIntegerSV attr  = (DmcTypeIntegerSV) get(DmtDMSAG.__svInteger);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmtDMSAG.__svInteger);
        
        attr.set(value);
        set(DmtDMSAG.__svInteger,attr);
    }

    /**
     * Removes the svInteger attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remSvInteger(){
         rem(DmtDMSAG.__svInteger);
    }

    /**
     * @return An Iterator of Integer objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public Iterator<Integer> getMvInteger(){
        DmcTypeIntegerMV attr = (DmcTypeIntegerMV) get(DmtDMSAG.__mvInteger);
        if (attr == null)
            return( ((List<Integer>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Integer value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1121)
    public Integer getNthMvInteger(int i){
        DmcTypeIntegerMV attr = (DmcTypeIntegerMV) get(DmtDMSAG.__mvInteger);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another mvInteger to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1135)
    public DmcAttribute<?> addMvInteger(Integer value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvInteger);
        if (attr == null)
            attr = new DmcTypeIntegerMV(DmtDMSAG.__mvInteger);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__mvInteger,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Integer.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1210)
    public boolean mvIntegerContains(Integer value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvInteger);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another mvInteger value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> addMvInteger(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvInteger);
        if (attr == null)
            attr = new DmcTypeIntegerMV(DmtDMSAG.__mvInteger);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvInteger,attr);
        return(attr);
    }

    /**
     * Returns the number of values in mvInteger
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
    public int getMvIntegerSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvInteger);
        if (attr == null){
            if (DmtDMSAG.__mvInteger.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvInteger.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvInteger value.
     * @param value The Integer to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> delMvInteger(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvInteger);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeIntegerMV(DmtDMSAG.__mvInteger), value);
        else
            attr = del(DmtDMSAG.__mvInteger, value);
        
        return(attr);
    }

    /**
     * Deletes a mvInteger from the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1333)
    public DmcAttribute<?> delMvInteger(Integer value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvInteger);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeIntegerMV(DmtDMSAG.__mvInteger), value);
        else
            attr = del(DmtDMSAG.__mvInteger, value);
        
        return(attr);
    }

    /**
     * Removes the mvInteger attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remMvInteger(){
         rem(DmtDMSAG.__mvInteger);
    }

    /**
     * @return An Iterator of Integer objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public Iterator<Integer> getHsInteger(){
        DmcTypeIntegerSET attr = (DmcTypeIntegerSET) get(DmtDMSAG.__hsInteger);
        if (attr == null)
            return( ((List<Integer>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Integer value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1121)
    public Integer getNthHsInteger(int i){
        DmcTypeIntegerSET attr = (DmcTypeIntegerSET) get(DmtDMSAG.__hsInteger);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another hsInteger to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1135)
    public DmcAttribute<?> addHsInteger(Integer value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsInteger);
        if (attr == null)
            attr = new DmcTypeIntegerSET(DmtDMSAG.__hsInteger);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__hsInteger,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Integer.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1210)
    public boolean hsIntegerContains(Integer value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsInteger);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another hsInteger value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> addHsInteger(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsInteger);
        if (attr == null)
            attr = new DmcTypeIntegerSET(DmtDMSAG.__hsInteger);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__hsInteger,attr);
        return(attr);
    }

    /**
     * Returns the number of values in hsInteger
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
    public int getHsIntegerSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__hsInteger);
        if (attr == null){
            if (DmtDMSAG.__hsInteger.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__hsInteger.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a hsInteger value.
     * @param value The Integer to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> delHsInteger(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsInteger);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeIntegerSET(DmtDMSAG.__hsInteger), value);
        else
            attr = del(DmtDMSAG.__hsInteger, value);
        
        return(attr);
    }

    /**
     * Deletes a hsInteger from the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1333)
    public DmcAttribute<?> delHsInteger(Integer value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsInteger);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeIntegerSET(DmtDMSAG.__hsInteger), value);
        else
            attr = del(DmtDMSAG.__hsInteger, value);
        
        return(attr);
    }

    /**
     * Removes the hsInteger attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remHsInteger(){
         rem(DmtDMSAG.__hsInteger);
    }

    /**
     * @return An Iterator of Integer objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public Iterator<Integer> getTsInteger(){
        DmcTypeIntegerSET attr = (DmcTypeIntegerSET) get(DmtDMSAG.__tsInteger);
        if (attr == null)
            return( ((List<Integer>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Integer value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1121)
    public Integer getNthTsInteger(int i){
        DmcTypeIntegerSET attr = (DmcTypeIntegerSET) get(DmtDMSAG.__tsInteger);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another tsInteger to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1135)
    public DmcAttribute<?> addTsInteger(Integer value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsInteger);
        if (attr == null)
            attr = new DmcTypeIntegerSET(DmtDMSAG.__tsInteger);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__tsInteger,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Integer.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1210)
    public boolean tsIntegerContains(Integer value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsInteger);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another tsInteger value.
     * @param value A value compatible with Integer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> addTsInteger(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsInteger);
        if (attr == null)
            attr = new DmcTypeIntegerSET(DmtDMSAG.__tsInteger);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__tsInteger,attr);
        return(attr);
    }

    /**
     * Returns the number of values in tsInteger
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
    public int getTsIntegerSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__tsInteger);
        if (attr == null){
            if (DmtDMSAG.__tsInteger.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__tsInteger.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a tsInteger value.
     * @param value The Integer to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> delTsInteger(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsInteger);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeIntegerSET(DmtDMSAG.__tsInteger), value);
        else
            attr = del(DmtDMSAG.__tsInteger, value);
        
        return(attr);
    }

    /**
     * Deletes a tsInteger from the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1333)
    public DmcAttribute<?> delTsInteger(Integer value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsInteger);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeIntegerSET(DmtDMSAG.__tsInteger), value);
        else
            attr = del(DmtDMSAG.__tsInteger, value);
        
        return(attr);
    }

    /**
     * Removes the tsInteger attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remTsInteger(){
         rem(DmtDMSAG.__tsInteger);
    }

    /**
     * @return An Iterator of IntegerToString objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1437)
    public Iterator<IntegerToString> getIntToString(){
        DmcTypeIntegerToStringMAP attr = (DmcTypeIntegerToStringMAP) get(DmtDMSAG.__intToString);
        if (attr == null)
            return( ((List<IntegerToString>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @param key The key of the value you want.
     * @return The IntegerToString associated with the specified key.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1469)
    public IntegerToString getIntToString(Object key){
        DmcTypeIntegerToStringMAP attr = (DmcTypeIntegerToStringMAP) get(DmtDMSAG.__intToString);
        if (attr == null)
            return(null);

        return(attr.getByKey(key));
    }

    /**
     * Adds another intToString value.
     * @param value A value compatible with IntegerToString
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1507)
    public DmcAttribute<?> addIntToString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__intToString);
        if (attr == null)
            attr = new DmcTypeIntegerToStringMAP(DmtDMSAG.__intToString);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__intToString,attr);
        return(attr);
    }

    /**
     * Adds another intToString value.
     * @param value IntegerToString
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1544)
    public DmcAttribute<?> addIntToString(IntegerToString value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__intToString);
        if (attr == null)
            attr = new DmcTypeIntegerToStringMAP(DmtDMSAG.__intToString);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__intToString,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Deletes a intToString value.
     * @param key The key of the IntegerToString to be deleted from the map of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1624)
    public DmcAttribute<?> delIntToString(Object key){
        DmcAttribute<?> attr = get(DmtDMSAG.__intToString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeIntegerToStringMAP(DmtDMSAG.__intToString), key);
        if (attr == null)
            return(null);
        
        attr = del(DmtDMSAG.__intToString, key);
        
        return(attr);
    }

    /**
     * Deletes a intToString value.
     * @param key the Integer key value
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1642)
    public DmcAttribute<?> delIntToString(Integer key) {
        DmcAttribute<?> attr = get(DmtDMSAG.__intToString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeIntegerToStringMAP(DmtDMSAG.__intToString), key);
        if (attr == null)
            return(null);
        
        attr = del(DmtDMSAG.__intToString, key);
        
        return(attr);
    }

    /**
     * Removes the intToString attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1696)
    public void remIntToString(){
         rem(DmtDMSAG.__intToString);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
    public Long getSvLong(){
        DmcTypeLongSV attr = (DmcTypeLongSV) get(DmtDMSAG.__svLong);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svLong to the specified value.
     * @param value Long
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
    public void setSvLong(Long value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__svLong);
        if (attr == null)
            attr = new DmcTypeLongSV(DmtDMSAG.__svLong);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__svLong,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svLong to the specified value.
     * @param value A value compatible with DmcTypeLongSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setSvLong(Object value) throws DmcValueException {
        DmcTypeLongSV attr  = (DmcTypeLongSV) get(DmtDMSAG.__svLong);
        if (attr == null)
            attr = new DmcTypeLongSV(DmtDMSAG.__svLong);
        
        attr.set(value);
        set(DmtDMSAG.__svLong,attr);
    }

    /**
     * Removes the svLong attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remSvLong(){
         rem(DmtDMSAG.__svLong);
    }

    /**
     * @return An Iterator of Long objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public Iterator<Long> getMvLong(){
        DmcTypeLongMV attr = (DmcTypeLongMV) get(DmtDMSAG.__mvLong);
        if (attr == null)
            return( ((List<Long>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Long value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1121)
    public Long getNthMvLong(int i){
        DmcTypeLongMV attr = (DmcTypeLongMV) get(DmtDMSAG.__mvLong);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another mvLong to the specified value.
     * @param value Long
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1135)
    public DmcAttribute<?> addMvLong(Long value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvLong);
        if (attr == null)
            attr = new DmcTypeLongMV(DmtDMSAG.__mvLong);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__mvLong,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Long.
     * @param value Long
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1210)
    public boolean mvLongContains(Long value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvLong);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another mvLong value.
     * @param value A value compatible with Long
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> addMvLong(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvLong);
        if (attr == null)
            attr = new DmcTypeLongMV(DmtDMSAG.__mvLong);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvLong,attr);
        return(attr);
    }

    /**
     * Returns the number of values in mvLong
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
    public int getMvLongSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvLong);
        if (attr == null){
            if (DmtDMSAG.__mvLong.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvLong.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvLong value.
     * @param value The Long to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> delMvLong(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvLong);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeLongMV(DmtDMSAG.__mvLong), value);
        else
            attr = del(DmtDMSAG.__mvLong, value);
        
        return(attr);
    }

    /**
     * Deletes a mvLong from the specified value.
     * @param value Long
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1333)
    public DmcAttribute<?> delMvLong(Long value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvLong);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeLongMV(DmtDMSAG.__mvLong), value);
        else
            attr = del(DmtDMSAG.__mvLong, value);
        
        return(attr);
    }

    /**
     * Removes the mvLong attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remMvLong(){
         rem(DmtDMSAG.__mvLong);
    }

    /**
     * @return An Iterator of Long objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public Iterator<Long> getHsLong(){
        DmcTypeLongSET attr = (DmcTypeLongSET) get(DmtDMSAG.__hsLong);
        if (attr == null)
            return( ((List<Long>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Long value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1121)
    public Long getNthHsLong(int i){
        DmcTypeLongSET attr = (DmcTypeLongSET) get(DmtDMSAG.__hsLong);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another hsLong to the specified value.
     * @param value Long
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1135)
    public DmcAttribute<?> addHsLong(Long value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsLong);
        if (attr == null)
            attr = new DmcTypeLongSET(DmtDMSAG.__hsLong);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__hsLong,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Long.
     * @param value Long
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1210)
    public boolean hsLongContains(Long value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsLong);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another hsLong value.
     * @param value A value compatible with Long
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> addHsLong(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsLong);
        if (attr == null)
            attr = new DmcTypeLongSET(DmtDMSAG.__hsLong);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__hsLong,attr);
        return(attr);
    }

    /**
     * Returns the number of values in hsLong
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
    public int getHsLongSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__hsLong);
        if (attr == null){
            if (DmtDMSAG.__hsLong.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__hsLong.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a hsLong value.
     * @param value The Long to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> delHsLong(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsLong);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeLongSET(DmtDMSAG.__hsLong), value);
        else
            attr = del(DmtDMSAG.__hsLong, value);
        
        return(attr);
    }

    /**
     * Deletes a hsLong from the specified value.
     * @param value Long
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1333)
    public DmcAttribute<?> delHsLong(Long value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsLong);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeLongSET(DmtDMSAG.__hsLong), value);
        else
            attr = del(DmtDMSAG.__hsLong, value);
        
        return(attr);
    }

    /**
     * Removes the hsLong attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remHsLong(){
         rem(DmtDMSAG.__hsLong);
    }

    /**
     * @return An Iterator of Long objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public Iterator<Long> getTsLong(){
        DmcTypeLongSET attr = (DmcTypeLongSET) get(DmtDMSAG.__tsLong);
        if (attr == null)
            return( ((List<Long>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Long value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1121)
    public Long getNthTsLong(int i){
        DmcTypeLongSET attr = (DmcTypeLongSET) get(DmtDMSAG.__tsLong);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another tsLong to the specified value.
     * @param value Long
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1135)
    public DmcAttribute<?> addTsLong(Long value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsLong);
        if (attr == null)
            attr = new DmcTypeLongSET(DmtDMSAG.__tsLong);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__tsLong,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Long.
     * @param value Long
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1210)
    public boolean tsLongContains(Long value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsLong);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another tsLong value.
     * @param value A value compatible with Long
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> addTsLong(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsLong);
        if (attr == null)
            attr = new DmcTypeLongSET(DmtDMSAG.__tsLong);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__tsLong,attr);
        return(attr);
    }

    /**
     * Returns the number of values in tsLong
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
    public int getTsLongSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__tsLong);
        if (attr == null){
            if (DmtDMSAG.__tsLong.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__tsLong.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a tsLong value.
     * @param value The Long to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> delTsLong(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsLong);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeLongSET(DmtDMSAG.__tsLong), value);
        else
            attr = del(DmtDMSAG.__tsLong, value);
        
        return(attr);
    }

    /**
     * Deletes a tsLong from the specified value.
     * @param value Long
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1333)
    public DmcAttribute<?> delTsLong(Long value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsLong);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeLongSET(DmtDMSAG.__tsLong), value);
        else
            attr = del(DmtDMSAG.__tsLong, value);
        
        return(attr);
    }

    /**
     * Removes the tsLong attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remTsLong(){
         rem(DmtDMSAG.__tsLong);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setSvString(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmtDMSAG.__svString);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtDMSAG.__svString);
        
        attr.set(value);
        set(DmtDMSAG.__svString,attr);
    }

    /**
     * Removes the svString attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remSvString(){
         rem(DmtDMSAG.__svString);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public Iterator<String> getMvString(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(DmtDMSAG.__mvString);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1121)
    public String getNthMvString(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(DmtDMSAG.__mvString);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another mvString to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1135)
    public DmcAttribute<?> addMvString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvString);
        if (attr == null)
            attr = new DmcTypeStringMV(DmtDMSAG.__mvString);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__mvString,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1210)
    public boolean mvStringContains(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvString);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another mvString value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> addMvString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvString);
        if (attr == null)
            attr = new DmcTypeStringMV(DmtDMSAG.__mvString);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvString,attr);
        return(attr);
    }

    /**
     * Returns the number of values in mvString
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
    public int getMvStringSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvString);
        if (attr == null){
            if (DmtDMSAG.__mvString.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvString.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> delMvString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(DmtDMSAG.__mvString), value);
        else
            attr = del(DmtDMSAG.__mvString, value);
        
        return(attr);
    }

    /**
     * Deletes a mvString from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1333)
    public DmcAttribute<?> delMvString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(DmtDMSAG.__mvString), value);
        else
            attr = del(DmtDMSAG.__mvString, value);
        
        return(attr);
    }

    /**
     * Removes the mvString attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remMvString(){
         rem(DmtDMSAG.__mvString);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public Iterator<String> getHsString(){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(DmtDMSAG.__hsString);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1121)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1135)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1210)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1333)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remHsString(){
         rem(DmtDMSAG.__hsString);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public Iterator<String> getTsString(){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(DmtDMSAG.__tsString);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1121)
    public String getNthTsString(int i){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(DmtDMSAG.__tsString);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another tsString to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1135)
    public DmcAttribute<?> addTsString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsString);
        if (attr == null)
            attr = new DmcTypeStringSET(DmtDMSAG.__tsString);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__tsString,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1210)
    public boolean tsStringContains(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsString);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another tsString value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> addTsString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsString);
        if (attr == null)
            attr = new DmcTypeStringSET(DmtDMSAG.__tsString);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__tsString,attr);
        return(attr);
    }

    /**
     * Returns the number of values in tsString
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
    public int getTsStringSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__tsString);
        if (attr == null){
            if (DmtDMSAG.__tsString.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__tsString.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a tsString value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> delTsString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(DmtDMSAG.__tsString), value);
        else
            attr = del(DmtDMSAG.__tsString, value);
        
        return(attr);
    }

    /**
     * Deletes a tsString from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1333)
    public DmcAttribute<?> delTsString(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsString);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(DmtDMSAG.__tsString), value);
        else
            attr = del(DmtDMSAG.__tsString, value);
        
        return(attr);
    }

    /**
     * Removes the tsString attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remTsString(){
         rem(DmtDMSAG.__tsString);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:652)
    public TestBasicNamedObjectFixedREF getSvTestBasicNamedObjectFixed(){
        DmcTypeTestBasicNamedObjectFixedREFSV attr = (DmcTypeTestBasicNamedObjectFixedREFSV) get(DmtDMSAG.__svTestBasicNamedObjectFixed);
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

    /**
     * Returns the reference to TestBasicNamedObjectFixed without attempting lazy resolution (if turned on).
     */
    public TestBasicNamedObjectFixedREF getSvTestBasicNamedObjectFixedREF(){
        DmcTypeTestBasicNamedObjectFixedREFSV attr = (DmcTypeTestBasicNamedObjectFixedREFSV) get(DmtDMSAG.__svTestBasicNamedObjectFixed);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svTestBasicNamedObjectFixed to the specified value.
     * @param value TestBasicNamedObjectFixedDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:706)
    public void setSvTestBasicNamedObjectFixed(TestBasicNamedObjectFixedDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__svTestBasicNamedObjectFixed);
        if (attr == null)
            attr = new DmcTypeTestBasicNamedObjectFixedREFSV(DmtDMSAG.__svTestBasicNamedObjectFixed);
        else
            ((DmcTypeTestBasicNamedObjectFixedREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(DmtDMSAG.__svTestBasicNamedObjectFixed,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svTestBasicNamedObjectFixed to the specified value.
     * @param value A value compatible with DmcTypeTestBasicNamedObjectFixedREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setSvTestBasicNamedObjectFixed(Object value) throws DmcValueException {
        DmcTypeTestBasicNamedObjectFixedREFSV attr  = (DmcTypeTestBasicNamedObjectFixedREFSV) get(DmtDMSAG.__svTestBasicNamedObjectFixed);
        if (attr == null)
            attr = new DmcTypeTestBasicNamedObjectFixedREFSV(DmtDMSAG.__svTestBasicNamedObjectFixed);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DmtDMSAG.__svTestBasicNamedObjectFixed,attr);
    }

    /**
     * Removes the svTestBasicNamedObjectFixed attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remSvTestBasicNamedObjectFixed(){
         rem(DmtDMSAG.__svTestBasicNamedObjectFixed);
    }

    /**
     * @return An Iterator of DmtTestEnum objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public Iterator<DmtTestEnum> getHsTestEnum(){
        DmcTypeDmtTestEnumSET attr = (DmcTypeDmtTestEnumSET) get(DmtDMSAG.__hsTestEnum);
        if (attr == null)
            return( ((List<DmtTestEnum>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth DmtTestEnum value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1121)
    public DmtTestEnum getNthHsTestEnum(int i){
        DmcTypeDmtTestEnumSET attr = (DmcTypeDmtTestEnumSET) get(DmtDMSAG.__hsTestEnum);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another hsTestEnum to the specified value.
     * @param value DmtTestEnum
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1135)
    public DmcAttribute<?> addHsTestEnum(DmtTestEnum value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsTestEnum);
        if (attr == null)
            attr = new DmcTypeDmtTestEnumSET(DmtDMSAG.__hsTestEnum);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__hsTestEnum,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified DmtTestEnum.
     * @param value DmtTestEnum
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1210)
    public boolean hsTestEnumContains(DmtTestEnum value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsTestEnum);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another hsTestEnum value.
     * @param value A value compatible with DmtTestEnum
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> addHsTestEnum(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsTestEnum);
        if (attr == null)
            attr = new DmcTypeDmtTestEnumSET(DmtDMSAG.__hsTestEnum);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__hsTestEnum,attr);
        return(attr);
    }

    /**
     * Returns the number of values in hsTestEnum
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
    public int getHsTestEnumSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__hsTestEnum);
        if (attr == null){
            if (DmtDMSAG.__hsTestEnum.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__hsTestEnum.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a hsTestEnum value.
     * @param value The DmtTestEnum to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> delHsTestEnum(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsTestEnum);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDmtTestEnumSET(DmtDMSAG.__hsTestEnum), value);
        else
            attr = del(DmtDMSAG.__hsTestEnum, value);
        
        return(attr);
    }

    /**
     * Deletes a hsTestEnum from the specified value.
     * @param value DmtTestEnum
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1333)
    public DmcAttribute<?> delHsTestEnum(DmtTestEnum value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsTestEnum);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDmtTestEnumSET(DmtDMSAG.__hsTestEnum), value);
        else
            attr = del(DmtDMSAG.__hsTestEnum, value);
        
        return(attr);
    }

    /**
     * Removes the hsTestEnum attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remHsTestEnum(){
         rem(DmtDMSAG.__hsTestEnum);
    }

    /**
     * @return The nth TestBasicObjectFixed value without attempting lazy resolution.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1022)
    public TestBasicObjectFixedDMO getNthMvIdxUnnamedObj(int i){
        DmcTypeTestBasicObjectFixedREFMV attr = (DmcTypeTestBasicObjectFixedREFMV) get(DmtDMSAG.__mvIdxUnnamedObj);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Sets the mvIdxUnnamedObj value at the specified index.
     * @param value TestBasicObjectFixed
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1068)
    public DmcAttribute<?> setNthMvIdxUnnamedObj(int index, TestBasicObjectFixedDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxUnnamedObj);
        if (attr == null){
            if (value == null){
                if (getModifier() == null)
                    throw(new IllegalStateException("Calling setNth() on a non-existent attribute with a null value makes no sense!"));
                else{
                    nthNullFromEmptyAttribute(DmtDMSAG.__mvIdxUnnamedObj, index);
                    return(null);
                }
            }
            else
                attr = new DmcTypeTestBasicObjectFixedREFMV(DmtDMSAG.__mvIdxUnnamedObj);
        }
        
        try{
            setLastValue(attr.setMVnth(index, value));
            nth(DmtDMSAG.__mvIdxUnnamedObj, index ,attr, null);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific setNth() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another mvIdxUnnamedObj value.
     * @param value A value compatible with TestBasicObjectFixed
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1242)
    public DmcAttribute<?> addMvIdxUnnamedObj(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxUnnamedObj);
        if (attr == null)
            attr = new DmcTypeTestBasicObjectFixedREFMV(DmtDMSAG.__mvIdxUnnamedObj);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvIdxUnnamedObj,attr);
        return(attr);
    }

    /**
     * Returns the number of values in mvIdxUnnamedObj
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1259)
    public int getMvIdxUnnamedObjSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxUnnamedObj);
        if (attr == null){
            if (DmtDMSAG.__mvIdxUnnamedObj.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvIdxUnnamedObj.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvIdxUnnamedObj value.
     * @param value The TestBasicObjectFixed to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1281)
    public DmcAttribute<?> delMvIdxUnnamedObj(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvIdxUnnamedObj);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeTestBasicObjectFixedREFMV(DmtDMSAG.__mvIdxUnnamedObj), value);
        else
            attr = del(DmtDMSAG.__mvIdxUnnamedObj, value);
        
        return(attr);
    }

    /**
     * Removes the mvIdxUnnamedObj attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1352)
    public void remMvIdxUnnamedObj(){
         rem(DmtDMSAG.__mvIdxUnnamedObj);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:781)
    public String getUserName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmtDMSAG.__userName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets userName to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:821)
    public void setUserName(String value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__userName);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtDMSAG.__userName);
        
        try{
            attr.set(value);
            set(DmtDMSAG.__userName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets userName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:874)
    public void setUserName(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmtDMSAG.__userName);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtDMSAG.__userName);
        
        attr.set(value);
        set(DmtDMSAG.__userName,attr);
    }

    /**
     * Removes the userName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:894)
    public void remUserName(){
         rem(DmtDMSAG.__userName);
    }




}

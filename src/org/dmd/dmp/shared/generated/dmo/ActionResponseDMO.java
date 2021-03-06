//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010-2021 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dmp.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:408)
import java.io.Serializable;                                   // Always required - (GenUtility.java:227)
import java.util.*;                                            // Always required if we have any MV attributes - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                               // Any attributes - (GenUtility.java:248)
import org.dmd.dmc.DmcObject;                                  // Primitive type - (GenUtility.java:282)
import org.dmd.dmc.DmcSliceInfo;                               // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                          // Any attributes - (GenUtility.java:249)
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;           // Base class - (GenUtility.java:367)
import org.dmd.dms.generated.dmo.MetaDMSAG;                    // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.DmcTypeDmcObjectMV;         // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeIntegerSV;           // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeLongSV;              // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeModifierMV;          // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dms.generated.types.DmcTypeStringSV;            // Required type - (GenUtility.java:339)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * The ActionResponse returns the results of a particular ActionRequest.
 * Exactly what is\n returned will depend on the efActionDef.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class ActionResponseDMO  extends ResponseDMO  implements Serializable  {

    public final static String constructionClassName = "ActionResponse";


    static {
    }

    public ActionResponseDMO() {
        super("ActionResponse");
    }

    protected ActionResponseDMO(String oc) {
        super(oc);
    }

    @Override
    public ActionResponseDMO getNew(){
        ActionResponseDMO rc = new ActionResponseDMO();
        return(rc);
    }

    @Override
    public ActionResponseDMO getSlice(DmcSliceInfo info){
        ActionResponseDMO rc = new ActionResponseDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ActionResponseDMO(DmcTypeModifierMV mods) {
        super("ActionResponse");
        modrec(true);
        setModifier(mods);
    }

    public ActionResponseDMO getModificationRecorder(){
        ActionResponseDMO rc = new ActionResponseDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return An Iterator of DmcObject objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1289)
    public Iterator<DmcObject> getObjectList(){
        DmcTypeDmcObjectMV attr = (DmcTypeDmcObjectMV) get(DmpDMSAG.__objectList);
        if (attr == null)
            return( ((List<DmcObject>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @param i the index
     * @return The nth DmcObject value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1302)
    public DmcObject getNthObjectList(int i){
        DmcTypeDmcObjectMV attr = (DmcTypeDmcObjectMV) get(DmpDMSAG.__objectList);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another objectList to the specified value.
     * @param value DmcObject
     * @return the attribute instance
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> addObjectList(DmcObject value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__objectList);
        if (attr == null)
            attr = new DmcTypeDmcObjectMV(DmpDMSAG.__objectList);
        
        try{
            setLastValue(attr.add(value));
            add(DmpDMSAG.__objectList,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * @param value DmcObject
     * @return true if we contain a valued keyed by the specified DmcObject.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1392)
    public boolean objectListContains(DmcObject value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__objectList);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     * @return the attribute instance
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1426)
    public DmcAttribute<?> addObjectList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpDMSAG.__objectList);
        if (attr == null)
            attr = new DmcTypeDmcObjectMV(DmpDMSAG.__objectList);
        
        setLastValue(attr.add(value));
        add(DmpDMSAG.__objectList,attr);
        return(attr);
    }

    /**
     * @return the number of values in objectList
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1443)
    public int getObjectListSize(){
        DmcAttribute<?> attr = get(DmpDMSAG.__objectList);
        if (attr == null){
            if (DmpDMSAG.__objectList.indexSize == 0)
                return(0);
            else
                return(DmpDMSAG.__objectList.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a objectList value.
     * @param value The DmcObject to be deleted from set of attribute values.
     * @return the deleted attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1505)
    public DmcAttribute<?> delObjectList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpDMSAG.__objectList);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDmcObjectMV(DmpDMSAG.__objectList), value);
        else
            attr = del(DmpDMSAG.__objectList, value);
        
        return(attr);
    }

    /**
     * Deletes a objectList from the specified value.
     * @param value DmcObject
     * @return the deleted attribute instance     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1522)
    public DmcAttribute<?> delObjectList(DmcObject value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__objectList);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDmcObjectMV(DmpDMSAG.__objectList), value);
        else
            attr = del(DmpDMSAG.__objectList, value);
        
        return(attr);
    }

    /**
     * Removes the objectList attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1541)
    public void remObjectList(){
         rem(DmpDMSAG.__objectList);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
    public Integer getServerActionID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(DmpDMSAG.__serverActionID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets serverActionID to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
    public void setServerActionID(Integer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__serverActionID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmpDMSAG.__serverActionID);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__serverActionID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets serverActionID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setServerActionID(Object value) throws DmcValueException {
        DmcTypeIntegerSV attr  = (DmcTypeIntegerSV) get(DmpDMSAG.__serverActionID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmpDMSAG.__serverActionID);
        
        attr.set(value);
        set(DmpDMSAG.__serverActionID,attr);
    }

    /**
     * Removes the serverActionID attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remServerActionID(){
         rem(DmpDMSAG.__serverActionID);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
    public Long getTimeMS(){
        DmcTypeLongSV attr = (DmcTypeLongSV) get(DmpDMSAG.__timeMS);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets timeMS to the specified value.
     * @param value Long
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
    public void setTimeMS(Long value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__timeMS);
        if (attr == null)
            attr = new DmcTypeLongSV(DmpDMSAG.__timeMS);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__timeMS,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets timeMS to the specified value.
     * @param value A value compatible with DmcTypeLongSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setTimeMS(Object value) throws DmcValueException {
        DmcTypeLongSV attr  = (DmcTypeLongSV) get(DmpDMSAG.__timeMS);
        if (attr == null)
            attr = new DmcTypeLongSV(DmpDMSAG.__timeMS);
        
        attr.set(value);
        set(DmpDMSAG.__timeMS,attr);
    }

    /**
     * Removes the timeMS attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remTimeMS(){
         rem(DmpDMSAG.__timeMS);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
    public String getActionName(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmpDMSAG.__actionName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets actionName to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
    public void setActionName(String value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__actionName);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__actionName);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__actionName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets actionName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setActionName(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmpDMSAG.__actionName);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__actionName);
        
        attr.set(value);
        set(DmpDMSAG.__actionName,attr);
    }

    /**
     * Removes the actionName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remActionName(){
         rem(DmpDMSAG.__actionName);
    }




}

//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
import java.io.Serializable;                                       // Always required - (GenUtility.java:227)
import java.util.*;                                                // Always required if we have any MV attributes - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                                   // Any attributes - (GenUtility.java:248)
import org.dmd.dmc.DmcObject;                                      // Primitive type - (GenUtility.java:282)
import org.dmd.dmc.DmcObjectName;                                  // Alternative type for NameContainer values - (GenUtility.java:306)
import org.dmd.dmc.DmcSliceInfo;                                   // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                              // Any attributes - (GenUtility.java:249)
import org.dmd.dmc.types.NameContainer;                            // Primitive type - (GenUtility.java:282)
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                // Base class - (GenUtility.java:367)
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.DmcTypeDmcObjectSV;             // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeIntegerMV;               // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dms.generated.types.DmcTypeNameContainerSV;         // Required type - (GenUtility.java:339)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * The CreateRequest allows you to create a new object. If the parentName is
 * specified,\n the object will be created beneath that parent object.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class CreateRequestDMO  extends RequestDMO  implements Serializable  {

    public final static String constructionClassName = "CreateRequest";


    static {
    }

    public CreateRequestDMO() {
        super("CreateRequest");
    }

    protected CreateRequestDMO(String oc) {
        super(oc);
    }

    @Override
    public CreateRequestDMO getNew(){
        CreateRequestDMO rc = new CreateRequestDMO();
        return(rc);
    }

    @Override
    public CreateRequestDMO getSlice(DmcSliceInfo info){
        CreateRequestDMO rc = new CreateRequestDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public CreateRequestDMO(DmcTypeModifierMV mods) {
        super("CreateRequest");
        modrec(true);
        setModifier(mods);
    }

    public CreateRequestDMO getModificationRecorder(){
        CreateRequestDMO rc = new CreateRequestDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
    public NameContainer getParentName(){
        DmcTypeNameContainerSV attr = (DmcTypeNameContainerSV) get(DmpDMSAG.__parentName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets parentName to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
    public void setParentName(NameContainer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__parentName);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(DmpDMSAG.__parentName);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__parentName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets parentName to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void setParentName(DmcObjectName value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__parentName);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(DmpDMSAG.__parentName);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__parentName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The alternative type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets parentName to the specified value.
     * @param value A value compatible with DmcTypeNameContainerSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setParentName(Object value) throws DmcValueException {
        DmcTypeNameContainerSV attr  = (DmcTypeNameContainerSV) get(DmpDMSAG.__parentName);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(DmpDMSAG.__parentName);
        
        attr.set(value);
        set(DmpDMSAG.__parentName,attr);
    }

    /**
     * Removes the parentName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remParentName(){
         rem(DmpDMSAG.__parentName);
    }

    /**
     * @return An Iterator of Integer objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1289)
    public Iterator<Integer> getRequestID(){
        DmcTypeIntegerMV attr = (DmcTypeIntegerMV) get(DmpDMSAG.__requestID);
        if (attr == null)
            return( ((List<Integer>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @param i the index
     * @return The nth Integer value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1302)
    public Integer getNthRequestID(int i){
        DmcTypeIntegerMV attr = (DmcTypeIntegerMV) get(DmpDMSAG.__requestID);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another requestID to the specified value.
     * @param value Integer
     * @return the attribute instance
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> addRequestID(Integer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__requestID);
        if (attr == null)
            attr = new DmcTypeIntegerMV(DmpDMSAG.__requestID);
        
        try{
            setLastValue(attr.add(value));
            add(DmpDMSAG.__requestID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * @param value Integer
     * @return true if we contain a valued keyed by the specified Integer.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1392)
    public boolean requestIDContains(Integer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__requestID);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another requestID value.
     * @param value A value compatible with Integer
     * @return the attribute instance
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1426)
    public DmcAttribute<?> addRequestID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpDMSAG.__requestID);
        if (attr == null)
            attr = new DmcTypeIntegerMV(DmpDMSAG.__requestID);
        
        setLastValue(attr.add(value));
        add(DmpDMSAG.__requestID,attr);
        return(attr);
    }

    /**
     * @return the number of values in requestID
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1443)
    public int getRequestIDSize(){
        DmcAttribute<?> attr = get(DmpDMSAG.__requestID);
        if (attr == null){
            if (DmpDMSAG.__requestID.indexSize == 0)
                return(0);
            else
                return(DmpDMSAG.__requestID.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a requestID value.
     * @param value The Integer to be deleted from set of attribute values.
     * @return the deleted attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1505)
    public DmcAttribute<?> delRequestID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpDMSAG.__requestID);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeIntegerMV(DmpDMSAG.__requestID), value);
        else
            attr = del(DmpDMSAG.__requestID, value);
        
        return(attr);
    }

    /**
     * Deletes a requestID from the specified value.
     * @param value Integer
     * @return the deleted attribute instance     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1522)
    public DmcAttribute<?> delRequestID(Integer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__requestID);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeIntegerMV(DmpDMSAG.__requestID), value);
        else
            attr = del(DmpDMSAG.__requestID, value);
        
        return(attr);
    }

    /**
     * Removes the requestID attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1541)
    public void remRequestID(){
         rem(DmpDMSAG.__requestID);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
    public DmcObject getNewObject(){
        DmcTypeDmcObjectSV attr = (DmcTypeDmcObjectSV) get(DmpDMSAG.__newObject);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets newObject to the specified value.
     * @param value DmcObject
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
    public void setNewObject(DmcObject value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__newObject);
        if (attr == null)
            attr = new DmcTypeDmcObjectSV(DmpDMSAG.__newObject);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__newObject,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets newObject to the specified value.
     * @param value A value compatible with DmcTypeDmcObjectSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setNewObject(Object value) throws DmcValueException {
        DmcTypeDmcObjectSV attr  = (DmcTypeDmcObjectSV) get(DmpDMSAG.__newObject);
        if (attr == null)
            attr = new DmcTypeDmcObjectSV(DmpDMSAG.__newObject);
        
        attr.set(value);
        set(DmpDMSAG.__newObject,attr);
    }

    /**
     * Removes the newObject attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remNewObject(){
         rem(DmpDMSAG.__newObject);
    }




}

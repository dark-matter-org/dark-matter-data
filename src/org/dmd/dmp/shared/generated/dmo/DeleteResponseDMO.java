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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:396)
import java.io.Serializable;                                   // Always required - (GenUtility.java:224)
import java.util.*;                                            // Always required if we have any MV attributes - (GenUtility.java:221)
import org.dmd.dmc.DmcAttribute;                               // Any attributes - (GenUtility.java:240)
import org.dmd.dmc.DmcObject;                                  // Primitive type and !auxiliary class - (GenUtility.java:271)
import org.dmd.dmc.DmcSliceInfo;                               // Required for object slicing - (GenUtility.java:229)
import org.dmd.dmc.DmcValueException;                          // Any attributes - (GenUtility.java:241)
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;           // Base class - (GenUtility.java:355)
import org.dmd.dms.generated.dmo.MetaDMSAG;                    // Required for MODREC constructor - (GenUtility.java:228)
import org.dmd.dms.generated.types.DmcTypeDmcObjectMV;         // Required type - (GenUtility.java:328)
import org.dmd.dms.generated.types.DmcTypeModifierMV;          // Required for MODREC constructor - (GenUtility.java:227)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:677)
/**
 * The DeleteResponse returns the results of a particular DeleteRequest. The
 * objectList\n contents will be implementation specific e.g. if there were
 * problems with object deletion there\n may be error indications.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class DeleteResponseDMO  extends ResponseDMO  implements Serializable  {

    public final static String constructionClassName = "DeleteResponse";


    static {
    }

    public DeleteResponseDMO() {
        super("DeleteResponse");
    }

    protected DeleteResponseDMO(String oc) {
        super(oc);
    }

    @Override
    public DeleteResponseDMO getNew(){
        DeleteResponseDMO rc = new DeleteResponseDMO();
        return(rc);
    }

    @Override
    public DeleteResponseDMO getSlice(DmcSliceInfo info){
        DeleteResponseDMO rc = new DeleteResponseDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public DeleteResponseDMO(DmcTypeModifierMV mods) {
        super("DeleteResponse");
        modrec(true);
        setModifier(mods);
    }

    public DeleteResponseDMO getModificationRecorder(){
        DeleteResponseDMO rc = new DeleteResponseDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return An Iterator of DmcObject objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1112)
    public Iterator<DmcObject> getObjectList(){
        DmcTypeDmcObjectMV attr = (DmcTypeDmcObjectMV) get(DmpDMSAG.__objectList);
        if (attr == null)
            return( ((List<DmcObject>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth DmcObject value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1124)
    public DmcObject getNthObjectList(int i){
        DmcTypeDmcObjectMV attr = (DmcTypeDmcObjectMV) get(DmpDMSAG.__objectList);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another objectList to the specified value.
     * @param value DmcObject
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1138)
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
     * Returns true if we contain a valued keyed by the specified DmcObject.
     * @param value DmcObject
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1213)
    public boolean objectListContains(DmcObject value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__objectList);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1245)
    public DmcAttribute<?> addObjectList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpDMSAG.__objectList);
        if (attr == null)
            attr = new DmcTypeDmcObjectMV(DmpDMSAG.__objectList);
        
        setLastValue(attr.add(value));
        add(DmpDMSAG.__objectList,attr);
        return(attr);
    }

    /**
     * Returns the number of values in objectList
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1262)
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
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1320)
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
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1336)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1355)
    public void remObjectList(){
         rem(DmpDMSAG.__objectList);
    }




}

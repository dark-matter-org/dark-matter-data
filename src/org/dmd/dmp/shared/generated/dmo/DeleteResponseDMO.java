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

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.dmogen.DmoFormatter.dumpDMO(DmoFormatter.java:101)
import java.io.Serializable;                                          // Always required - (ImportUtil.java:300)
import java.util.*;                                                   // Always required if we have any MV attributes - (ImportUtil.java:297)
import org.dmd.core.DmcAttribute;                                     // Any attributes - (ImportUtil.java:309)
import org.dmd.core.DmcObject;                                        // Primitive type and !auxiliary class - (ImportUtil.java:334)
import org.dmd.core.feedback.DMFeedbackSet;                           // Any attributes - (ImportUtil.java:310)
import org.dmd.core.schema.DmcSliceInfo;                              // Required for object slicing - (ImportUtil.java:305)
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;                  // Base class - (ImportUtil.java:412)
import org.dmd.dms.shared.generated.dmo.MetaCompactSchema;            // Required for MODREC constructor - (ImportUtil.java:304)
import org.dmd.dms.shared.generated.types.DmcTypeDmcObjectMV;         // Required type - (ImportUtil.java:386)
import org.dmd.dms.shared.generated.types.DmcTypeModifierMV;          // Required for MODREC constructor - (ImportUtil.java:303)

// Generated from: org.dmd.dms.tools.dmogen.DmoFormatter.getClassHeader(DmoFormatter.java:360)
/**
 * The DeleteResponse returns the results of a particular DeleteRequest. The
 * objectList
 contents will be implementation specific e.g. if there were
 * problems with object deletion there
 may be error indications.
 * <P>
 * Generated from the dmp schema
 * <P>
 * This code was auto-generated by the dmogen utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.tools.dmogen.DmoFormatter.dumpDMO(DmoFormatter.java:103)
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
        rc.setModifier(new DmcTypeModifierMV(MetaCompactSchema.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return An Iterator of DmcObject objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:493)
    public Iterator<DmcObject> getObjectList(){
        DmcTypeDmcObjectMV attr = (DmcTypeDmcObjectMV) get(DmpCompactSchema.__objectList);
        if (attr == null)
            return( ((List<DmcObject>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth DmcObject value.
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:505)
    public DmcObject getNthObjectList(int i){
        DmcTypeDmcObjectMV attr = (DmcTypeDmcObjectMV) get(DmpCompactSchema.__objectList);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another objectList to the specified value.
     * @param value DmcObject
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:519)
    public DmcAttribute<?> addObjectList(DmcObject value) {
        DmcAttribute<?> attr = get(DmpCompactSchema.__objectList);
        if (attr == null)
            attr = new DmcTypeDmcObjectMV(DmpCompactSchema.__objectList);
        
        try{
            setLastValue(attr.add(value));
            add(DmpCompactSchema.__objectList,attr);
        }
        catch(DMFeedbackSet ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified DmcObject.
     * @param value DmcObject
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:594)
    public boolean objectListContains(DmcObject value) {
        DmcAttribute<?> attr = get(DmpCompactSchema.__objectList);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:626)
    public DmcAttribute<?> addObjectList(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(DmpCompactSchema.__objectList);
        if (attr == null)
            attr = new DmcTypeDmcObjectMV(DmpCompactSchema.__objectList);
        
        setLastValue(attr.add(value));
        add(DmpCompactSchema.__objectList,attr);
        return(attr);
    }

    /**
     * Returns the number of values in objectList
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:643)
    public int getObjectListSize(){
        DmcAttribute<?> attr = get(DmpCompactSchema.__objectList);
        if (attr == null){
            if (DmpCompactSchema.__objectList.indexSize == 0)
                return(0);
            else
                return(DmpCompactSchema.__objectList.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a objectList value.
     * @param value The DmcObject to be deleted from set of attribute values.
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:700)
    public DmcAttribute<?> delObjectList(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(DmpCompactSchema.__objectList);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDmcObjectMV(DmpCompactSchema.__objectList), value);
        else
            attr = del(DmpCompactSchema.__objectList, value);
        
        return(attr);
    }

    /**
     * Deletes a objectList from the specified value.
     * @param value DmcObject
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:716)
    public DmcAttribute<?> delObjectList(DmcObject value) {
        DmcAttribute<?> attr = get(DmpCompactSchema.__objectList);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDmcObjectMV(DmpCompactSchema.__objectList), value);
        else
            attr = del(DmpCompactSchema.__objectList, value);
        
        return(attr);
    }

    /**
     * Removes the objectList attribute value.
     */
    // org.dmd.dms.tools.dmogen.AccessFunctionFormatter.formatMV(AccessFunctionFormatter.java:735)
    public void remObjectList(){
         rem(DmpCompactSchema.__objectList);
    }




}

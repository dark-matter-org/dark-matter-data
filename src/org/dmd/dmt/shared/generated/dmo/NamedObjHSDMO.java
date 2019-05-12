//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
package org.dmd.dmt.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:408)
import java.io.Serializable;                                                // Always required - (GenUtility.java:227)
import java.util.*;                                                         // Always required if we have any MV attributes - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                                            // Any attributes - (GenUtility.java:248)
import org.dmd.dmc.DmcObject;                                               // Structural class - (GenUtility.java:362)
import org.dmd.dmc.DmcOmni;                                                 // Lazy resolution - (GenUtility.java:331)
import org.dmd.dmc.DmcSliceInfo;                                            // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                                       // Any attributes - (GenUtility.java:249)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                 // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                       // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;                     // Type specific set/add - (GenUtility.java:318)
import org.dmd.dmt.shared.generated.types.DmcTypeObjWithRefsREFSET;         // Reference type - (GenUtility.java:311)
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;                   // Helper class - (GenUtility.java:346)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class NamedObjHSDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "NamedObjHS";


    static {
    }

    public NamedObjHSDMO() {
        super("NamedObjHS");
    }

    protected NamedObjHSDMO(String oc) {
        super(oc);
    }

    @Override
    public NamedObjHSDMO getNew(){
        NamedObjHSDMO rc = new NamedObjHSDMO();
        return(rc);
    }

    @Override
    public NamedObjHSDMO getSlice(DmcSliceInfo info){
        NamedObjHSDMO rc = new NamedObjHSDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public NamedObjHSDMO(DmcTypeModifierMV mods) {
        super("NamedObjHS");
        modrec(true);
        setModifier(mods);
    }

    public NamedObjHSDMO getModificationRecorder(){
        NamedObjHSDMO rc = new NamedObjHSDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return An Iterator of ObjWithRefsDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1136)
    public Iterator<ObjWithRefsREF> getHsNamedObj(){
        DmcTypeObjWithRefsREFSET attr = (DmcTypeObjWithRefsREFSET) get(DmtDMSAG.__hsNamedObj);
        if (attr == null)
            return( ((List<ObjWithRefsREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<ObjWithRefsREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of ObjWithRefsREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1156)
    public Iterator<ObjWithRefsREF> getHsNamedObjREFs(){
        DmcTypeObjWithRefsREFSET attr = (DmcTypeObjWithRefsREFSET) get(DmtDMSAG.__hsNamedObj);
        if (attr == null)
            return( ((List<ObjWithRefsREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another hsNamedObj to the specified value.
     * @param value ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1170)
    public DmcAttribute<?> addHsNamedObj(ObjWithRefsDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsNamedObj);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFSET(DmtDMSAG.__hsNamedObj);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__hsNamedObj,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another hsNamedObj value.
     * @param value A value compatible with ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1411)
    public DmcAttribute<?> addHsNamedObj(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__hsNamedObj);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFSET(DmtDMSAG.__hsNamedObj);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__hsNamedObj,attr);
        return(attr);
    }

    /**
     * Returns the number of values in hsNamedObj
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1428)
    public int getHsNamedObjSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__hsNamedObj);
        if (attr == null){
            if (DmtDMSAG.__hsNamedObj.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__hsNamedObj.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a hsNamedObj value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1467)
    public DmcAttribute<?> delHsNamedObj(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__hsNamedObj);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeObjWithRefsREFSET(DmtDMSAG.__hsNamedObj), value);
        else
            attr = del(DmtDMSAG.__hsNamedObj, value);
        
        return(attr);
    }

    /**
     * Removes the hsNamedObj attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1521)
    public void remHsNamedObj(){
         rem(DmtDMSAG.__hsNamedObj);
    }




}

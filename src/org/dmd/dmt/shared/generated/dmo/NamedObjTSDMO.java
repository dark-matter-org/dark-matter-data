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
public class NamedObjTSDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "NamedObjTS";


    static {
    }

    public NamedObjTSDMO() {
        super("NamedObjTS");
    }

    protected NamedObjTSDMO(String oc) {
        super(oc);
    }

    @Override
    public NamedObjTSDMO getNew(){
        NamedObjTSDMO rc = new NamedObjTSDMO();
        return(rc);
    }

    @Override
    public NamedObjTSDMO getSlice(DmcSliceInfo info){
        NamedObjTSDMO rc = new NamedObjTSDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public NamedObjTSDMO(DmcTypeModifierMV mods) {
        super("NamedObjTS");
        modrec(true);
        setModifier(mods);
    }

    public NamedObjTSDMO getModificationRecorder(){
        NamedObjTSDMO rc = new NamedObjTSDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return An Iterator of ObjWithRefsDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1146)
    public Iterator<ObjWithRefsREF> getTsNamedObj(){
        DmcTypeObjWithRefsREFSET attr = (DmcTypeObjWithRefsREFSET) get(DmtDMSAG.__tsNamedObj);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1166)
    public Iterator<ObjWithRefsREF> getTsNamedObjREFs(){
        DmcTypeObjWithRefsREFSET attr = (DmcTypeObjWithRefsREFSET) get(DmtDMSAG.__tsNamedObj);
        if (attr == null)
            return( ((List<ObjWithRefsREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another tsNamedObj to the specified value.
     * @param value ObjWithRefs
     * @return the attribute instance
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1181)
    public DmcAttribute<?> addTsNamedObj(ObjWithRefsDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsNamedObj);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFSET(DmtDMSAG.__tsNamedObj);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__tsNamedObj,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another tsNamedObj value.
     * @param value A value compatible with ObjWithRefs
     * @return the attribute instance
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1424)
    public DmcAttribute<?> addTsNamedObj(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__tsNamedObj);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFSET(DmtDMSAG.__tsNamedObj);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__tsNamedObj,attr);
        return(attr);
    }

    /**
     * @return the number of values in tsNamedObj
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1441)
    public int getTsNamedObjSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__tsNamedObj);
        if (attr == null){
            if (DmtDMSAG.__tsNamedObj.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__tsNamedObj.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a tsNamedObj value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     * @return the deleted attribute instance     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1482)
    public DmcAttribute<?> delTsNamedObj(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__tsNamedObj);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeObjWithRefsREFSET(DmtDMSAG.__tsNamedObj), value);
        else
            attr = del(DmtDMSAG.__tsNamedObj, value);
        
        return(attr);
    }

    /**
     * Removes the tsNamedObj attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1538)
    public void remTsNamedObj(){
         rem(DmtDMSAG.__tsNamedObj);
    }




}

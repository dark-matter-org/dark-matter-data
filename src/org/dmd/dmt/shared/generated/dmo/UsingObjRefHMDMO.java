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
import org.dmd.dmt.shared.generated.types.DmcTypeObjWithRefsREFMAP;         // Reference type - (GenUtility.java:311)
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
public class UsingObjRefHMDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "UsingObjRefHM";


    static {
    }

    public UsingObjRefHMDMO() {
        super("UsingObjRefHM");
    }

    protected UsingObjRefHMDMO(String oc) {
        super(oc);
    }

    @Override
    public UsingObjRefHMDMO getNew(){
        UsingObjRefHMDMO rc = new UsingObjRefHMDMO();
        return(rc);
    }

    @Override
    public UsingObjRefHMDMO getSlice(DmcSliceInfo info){
        UsingObjRefHMDMO rc = new UsingObjRefHMDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public UsingObjRefHMDMO(DmcTypeModifierMV mods) {
        super("UsingObjRefHM");
        modrec(true);
        setModifier(mods);
    }

    public UsingObjRefHMDMO getModificationRecorder(){
        UsingObjRefHMDMO rc = new UsingObjRefHMDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return An Iterator of ObjWithRefsDMO objects.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1579)
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1591)
    public Iterator<ObjWithRefsREF> getObjRefHM(){
        DmcTypeObjWithRefsREFMAP attr = (DmcTypeObjWithRefsREFMAP) get(DmtDMSAG.__objRefHM);
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
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1610)
    @SuppressWarnings("unchecked")
    public Iterator<ObjWithRefsREF> getObjRefHMREFs(){
        DmcTypeObjWithRefsREFMAP attr = (DmcTypeObjWithRefsREFMAP) get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return( ((List<ObjWithRefsREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * @param key The key of the value you want.
     * @return The ObjWithRefs associated with the specified key.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1644)
    public ObjWithRefsREF getObjRefHM(Object key){
        DmcTypeObjWithRefsREFMAP attr = (DmcTypeObjWithRefsREFMAP) get(DmtDMSAG.__objRefHM);
        if (attr == null)
            return(null);

        return(attr.getByKey(key));
    }

    /**
     * Adds another objRefHM value.
     * @param value A value compatible with ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1696)
    public DmcAttribute<?> addObjRefHM(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__objRefHM);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFMAP(DmtDMSAG.__objRefHM);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__objRefHM,attr);
        return(attr);
    }

    /**
     * Adds another objRefHM value.
     * @param value ObjWithRefs
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1712)
    public DmcAttribute<?> addObjRefHM(ObjWithRefsDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__objRefHM);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFMAP(DmtDMSAG.__objRefHM);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__objRefHM,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Deletes a objRefHM value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1771)
    public DmcAttribute<?> delObjRefHM(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__objRefHM);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeObjWithRefsREFMAP(DmtDMSAG.__objRefHM), value);
        else
            attr = del(DmtDMSAG.__objRefHM, value);
        
        return(attr);
    }

    /**
     * Deletes a objRefHM value.
     * @param value The ObjWithRefs to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1789)
    public DmcAttribute<?> delObjRefHM(ObjWithRefsDMO value){
        DmcAttribute<?> attr = get(DmtDMSAG.__objRefHM);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeObjWithRefsREFMAP(DmtDMSAG.__objRefHM), value.getObjectName());
        else
            attr = del(DmtDMSAG.__objRefHM, value.getObjectName());
        
        return(attr);
    }

    /**
     * Removes the objRefHM attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1885)
    public void remObjRefHM(){
         rem(DmtDMSAG.__objRefHM);
    }




}

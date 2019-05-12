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
import java.io.Serializable;                                                        // Always required - (GenUtility.java:227)
import java.util.*;                                                                 // Always required if we have any MV attributes - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                                                    // Any attributes - (GenUtility.java:248)
import org.dmd.dmc.DmcObject;                                                       // Structural class - (GenUtility.java:362)
import org.dmd.dmc.DmcSliceInfo;                                                    // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                                               // Any attributes - (GenUtility.java:249)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                         // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                               // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dmt.shared.generated.dmo.TestBasicObjectFixedDMO;                    // Type specific set/add - (GenUtility.java:318)
import org.dmd.dmt.shared.generated.types.DmcTypeTestBasicObjectFixedREFMV;         // Reference type - (GenUtility.java:311)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class UnnamedObjMVDMO  extends DmcObject  implements Serializable  {

    public final static String constructionClassName = "UnnamedObjMV";


    static {
    }

    public UnnamedObjMVDMO() {
        super("UnnamedObjMV");
    }

    protected UnnamedObjMVDMO(String oc) {
        super(oc);
    }

    @Override
    public UnnamedObjMVDMO getNew(){
        UnnamedObjMVDMO rc = new UnnamedObjMVDMO();
        return(rc);
    }

    @Override
    public UnnamedObjMVDMO getSlice(DmcSliceInfo info){
        UnnamedObjMVDMO rc = new UnnamedObjMVDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public UnnamedObjMVDMO(DmcTypeModifierMV mods) {
        super("UnnamedObjMV");
        modrec(true);
        setModifier(mods);
    }

    public UnnamedObjMVDMO getModificationRecorder(){
        UnnamedObjMVDMO rc = new UnnamedObjMVDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    /**
     * @return An Iterator of TestBasicObjectFixedDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1124)
    public Iterator<TestBasicObjectFixedDMO> getMvUnnamedObj(){
        DmcTypeTestBasicObjectFixedREFMV attr = (DmcTypeTestBasicObjectFixedREFMV) get(DmtDMSAG.__mvUnnamedObj);
        if (attr == null)
            return( ((List<TestBasicObjectFixedDMO>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another mvUnnamedObj to the specified value.
     * @param value TestBasicObjectFixed
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1170)
    public DmcAttribute<?> addMvUnnamedObj(TestBasicObjectFixedDMO value) {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvUnnamedObj);
        if (attr == null)
            attr = new DmcTypeTestBasicObjectFixedREFMV(DmtDMSAG.__mvUnnamedObj);
        
        try{
            setLastValue(attr.add(value));
            add(DmtDMSAG.__mvUnnamedObj,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another mvUnnamedObj value.
     * @param value A value compatible with TestBasicObjectFixed
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1411)
    public DmcAttribute<?> addMvUnnamedObj(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtDMSAG.__mvUnnamedObj);
        if (attr == null)
            attr = new DmcTypeTestBasicObjectFixedREFMV(DmtDMSAG.__mvUnnamedObj);
        
        setLastValue(attr.add(value));
        add(DmtDMSAG.__mvUnnamedObj,attr);
        return(attr);
    }

    /**
     * Returns the number of values in mvUnnamedObj
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1428)
    public int getMvUnnamedObjSize(){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvUnnamedObj);
        if (attr == null){
            if (DmtDMSAG.__mvUnnamedObj.indexSize == 0)
                return(0);
            else
                return(DmtDMSAG.__mvUnnamedObj.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a mvUnnamedObj value.
     * @param value The TestBasicObjectFixed to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1450)
    public DmcAttribute<?> delMvUnnamedObj(Object value){
        DmcAttribute<?> attr = get(DmtDMSAG.__mvUnnamedObj);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeTestBasicObjectFixedREFMV(DmtDMSAG.__mvUnnamedObj), value);
        else
            attr = del(DmtDMSAG.__mvUnnamedObj, value);
        
        return(attr);
    }

    /**
     * Removes the mvUnnamedObj attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1521)
    public void remMvUnnamedObj(){
         rem(DmtDMSAG.__mvUnnamedObj);
    }




}

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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:321)
import java.io.Serializable;                                   // Always required
import java.util.*;                                            // Always required
import org.dmd.dmc.DmcAttribute;                               // Any attributes
import org.dmd.dmc.DmcObject;                                  // Primitive type and !auxiliary class
import org.dmd.dmc.DmcSliceInfo;                               // Required for object slicing
import org.dmd.dmc.DmcValueException;                          // Any attributes
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;           // Base class
import org.dmd.dms.generated.types.DmcTypeDmcObjectMV;         // Required type
import org.dmd.dms.generated.types.DmcTypeLongSV;              // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;          // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringSV;            // Required type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The ActionResponse returns the results of a particular ActionRequest.
 * Exactly what is returned will depend on the efActionDef.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class ActionResponseDMO  extends ResponseDMO  implements Serializable  {

    public final static String constructionClassName = "ActionResponse";

    public final static DmcClassInfo classInfo = DmpDMSAG.__ActionResponse;

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public ActionResponseDMO() {
        super("ActionResponse");
    }

    protected ActionResponseDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
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

    /**
     * @return An Iterator of DmcObject objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:919)
    public Iterator<DmcObject> getObjectList(){
        DmcTypeDmcObjectMV attr = (DmcTypeDmcObjectMV) get(DmpDMSAG.__objectList);
        if (attr == null)
            return( ((List<DmcObject>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth DmcObject value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:931)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:945)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1009)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1041)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1058)
    public int getObjectListSize(){
        DmcAttribute<?> attr = get(DmpDMSAG.__objectList);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a objectList value.
     * @param value The DmcObject to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1100)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1116)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1135)
    public void remObjectList(){
         rem(DmpDMSAG.__objectList);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
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
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setTimeMS(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpDMSAG.__timeMS);
        if (attr == null)
            attr = new DmcTypeLongSV(DmpDMSAG.__timeMS);
        
        attr.set(value);
        set(DmpDMSAG.__timeMS,attr);
    }

    /**
     * Removes the timeMS attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remTimeMS(){
         rem(DmpDMSAG.__timeMS);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
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
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setActionName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpDMSAG.__actionName);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpDMSAG.__actionName);
        
        attr.set(value);
        set(DmpDMSAG.__actionName,attr);
    }

    /**
     * Removes the actionName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remActionName(){
         rem(DmpDMSAG.__actionName);
    }




}

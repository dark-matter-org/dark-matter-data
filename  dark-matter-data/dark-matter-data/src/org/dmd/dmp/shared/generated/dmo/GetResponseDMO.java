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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:355)
import java.io.Serializable;                                       // Always required
import java.util.*;                                                // Always required
import org.dmd.dmc.DmcAttribute;                                   // Any attributes
import org.dmd.dmc.DmcObject;                                      // Primitive type and !auxiliary class
import org.dmd.dmc.DmcObjectName;                                  // Alternative type for NameContainer values
import org.dmd.dmc.DmcSliceInfo;                                   // Required for object slicing
import org.dmd.dmc.DmcValueException;                              // Any attributes
import org.dmd.dmc.types.NameContainer;                            // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.dmo.ResponseDMO;               // Base class
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeBooleanSV;               // Required type
import org.dmd.dms.generated.types.DmcTypeDmcObjectMV;             // Required type
import org.dmd.dms.generated.types.DmcTypeLongSV;                  // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeNameContainerMV;         // Required type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The GetResponse returns a set of objects. If you had set registerForEvents
 * to true in the GetRequest, the listenerID will be the identifier that you
 * will need to specify in the DenotifyRequest in order to denotify for
 * events on the objects you initially retrieved.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class GetResponseDMO  extends ResponseDMO  implements Serializable  {

    public final static String constructionClassName = "GetResponse";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public GetResponseDMO() {
        super("GetResponse");
    }

    protected GetResponseDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public GetResponseDMO getNew(){
        GetResponseDMO rc = new GetResponseDMO();
        return(rc);
    }

    @Override
    public GetResponseDMO getSlice(DmcSliceInfo info){
        GetResponseDMO rc = new GetResponseDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public GetResponseDMO(DmcTypeModifierMV mods) {
        super("GetResponse");
        modrec(true);
        setModifier(mods);
    }

    public GetResponseDMO getModificationRecorder(){
        GetResponseDMO rc = new GetResponseDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    /**
     * @return An Iterator of NameContainer objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1008)
    public Iterator<NameContainer> getTargets(){
        DmcTypeNameContainerMV attr = (DmcTypeNameContainerMV) get(DmpDMSAG.__targets);
        if (attr == null)
            return( ((List<NameContainer>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth NameContainer value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1020)
    public NameContainer getNthTargets(int i){
        DmcTypeNameContainerMV attr = (DmcTypeNameContainerMV) get(DmpDMSAG.__targets);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another targets to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1034)
    public DmcAttribute<?> addTargets(NameContainer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__targets);
        if (attr == null)
            attr = new DmcTypeNameContainerMV(DmpDMSAG.__targets);
        
        try{
            setLastValue(attr.add(value));
            add(DmpDMSAG.__targets,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another targets to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1088)
    public DmcAttribute<?> addTargets(DmcObjectName value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__targets);
        if (attr == null)
            attr = new DmcTypeNameContainerMV(DmpDMSAG.__targets);
        
        try{
            setLastValue(attr.add(value));
            add(DmpDMSAG.__targets,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The alternative type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified NameContainer.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
    public boolean targetsContains(NameContainer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__targets);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Returns true if we contain a valued keyed by the specified DmcObjectName.
     * @param value DmcObjectName
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1123)
    public boolean targetsContains(DmcObjectName value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__targets);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another targets value.
     * @param value A value compatible with NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1141)
    public DmcAttribute<?> addTargets(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpDMSAG.__targets);
        if (attr == null)
            attr = new DmcTypeNameContainerMV(DmpDMSAG.__targets);
        
        setLastValue(attr.add(value));
        add(DmpDMSAG.__targets,attr);
        return(attr);
    }

    /**
     * Returns the number of values in targets
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1158)
    public int getTargetsSize(){
        DmcAttribute<?> attr = get(DmpDMSAG.__targets);
        if (attr == null){
            if (DmpDMSAG.__targets.indexSize == 0)
                return(0);
            else
                return(DmpDMSAG.__targets.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a targets value.
     * @param value The NameContainer to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1216)
    public DmcAttribute<?> delTargets(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpDMSAG.__targets);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeNameContainerMV(DmpDMSAG.__targets), value);
        else
            attr = del(DmpDMSAG.__targets, value);
        
        return(attr);
    }

    /**
     * Deletes a targets from the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1232)
    public DmcAttribute<?> delTargets(NameContainer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__targets);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeNameContainerMV(DmpDMSAG.__targets), value);
        else
            attr = del(DmpDMSAG.__targets, value);
        
        return(attr);
    }

    /**
     * Removes the targets attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1251)
    public void remTargets(){
         rem(DmpDMSAG.__targets);
    }

    /**
     * @return An Iterator of DmcObject objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1008)
    public Iterator<DmcObject> getObjectList(){
        DmcTypeDmcObjectMV attr = (DmcTypeDmcObjectMV) get(DmpDMSAG.__objectList);
        if (attr == null)
            return( ((List<DmcObject>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth DmcObject value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1020)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1034)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1109)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1141)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1158)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1216)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1232)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1251)
    public void remObjectList(){
         rem(DmpDMSAG.__objectList);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public Boolean isCacheResponse(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(DmpDMSAG.__cacheResponse);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets cacheResponse to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:721)
    public void setCacheResponse(Boolean value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__cacheResponse);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpDMSAG.__cacheResponse);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__cacheResponse,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets cacheResponse to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:773)
    public void setCacheResponse(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(DmpDMSAG.__cacheResponse);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpDMSAG.__cacheResponse);
        
        attr.set(value);
        set(DmpDMSAG.__cacheResponse,attr);
    }

    /**
     * Removes the cacheResponse attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:793)
    public void remCacheResponse(){
         rem(DmpDMSAG.__cacheResponse);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public Long getListenerID(){
        DmcTypeLongSV attr = (DmcTypeLongSV) get(DmpDMSAG.__listenerID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets listenerID to the specified value.
     * @param value Long
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:721)
    public void setListenerID(Long value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__listenerID);
        if (attr == null)
            attr = new DmcTypeLongSV(DmpDMSAG.__listenerID);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__listenerID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets listenerID to the specified value.
     * @param value A value compatible with DmcTypeLongSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:773)
    public void setListenerID(Object value) throws DmcValueException {
        DmcTypeLongSV attr  = (DmcTypeLongSV) get(DmpDMSAG.__listenerID);
        if (attr == null)
            attr = new DmcTypeLongSV(DmpDMSAG.__listenerID);
        
        attr.set(value);
        set(DmpDMSAG.__listenerID,attr);
    }

    /**
     * Removes the listenerID attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:793)
    public void remListenerID(){
         rem(DmpDMSAG.__listenerID);
    }




}

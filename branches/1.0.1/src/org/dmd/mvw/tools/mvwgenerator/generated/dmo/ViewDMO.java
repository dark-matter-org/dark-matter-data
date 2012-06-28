//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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
package org.dmd.mvw.tools.mvwgenerator.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:368)
import java.io.Serializable;                                                               // Always required - (GenUtility.java:197)
import java.util.*;                                                                        // Always required if we have any MV attributes - (GenUtility.java:193)
import org.dmd.dmc.DmcAttribute;                                                           // Any attributes - (GenUtility.java:213)
import org.dmd.dmc.DmcNamedObjectIF;                                                       // Named object - (GenUtility.java:348)
import org.dmd.dmc.DmcOmni;                                                                // Lazy resolution - (GenUtility.java:293)
import org.dmd.dmc.DmcSliceInfo;                                                           // Required for object slicing - (GenUtility.java:202)
import org.dmd.dmc.DmcValueException;                                                      // Any attributes - (GenUtility.java:214)
import org.dmd.dmc.types.CamelCaseName;                                                    // Naming attribute type - (GenUtility.java:343)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                                // Required for MODREC constructor - (GenUtility.java:201)
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                                       // Required type - (GenUtility.java:301)
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                                 // Required type - (GenUtility.java:301)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                      // Required for MODREC constructor - (GenUtility.java:200)
import org.dmd.dms.generated.types.DmcTypeStringMV;                                        // Required type - (GenUtility.java:301)
import org.dmd.dms.generated.types.DmcTypeStringSET;                                       // Required type - (GenUtility.java:301)
import org.dmd.dms.generated.types.DmcTypeStringSV;                                        // Required type - (GenUtility.java:301)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.EventDMO;                              // Type specific set/add - (GenUtility.java:280)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;                      // Base class - (GenUtility.java:328)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.RunContextItemDMO;                     // Type specific set/add - (GenUtility.java:280)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DisplayDataSpec;                     // Primitive type and !auxiliary class - (GenUtility.java:244)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeDisplayDataSpecMV;            // Required type - (GenUtility.java:301)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeEventREFMV;                   // Reference type - (GenUtility.java:273)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeEventREFSET;                  // Reference type - (GenUtility.java:273)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeEventSpecMV;                  // Required type - (GenUtility.java:301)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeMethodWithArgsMV;             // Required type - (GenUtility.java:301)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeOperationSpecMV;              // Required type - (GenUtility.java:301)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeOperationSpecSV;              // Required type - (GenUtility.java:301)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeRunContextItemREFSET;         // Reference type - (GenUtility.java:273)
import org.dmd.mvw.tools.mvwgenerator.generated.types.EventREF;                            // Helper class - (GenUtility.java:308)
import org.dmd.mvw.tools.mvwgenerator.generated.types.EventSpec;                           // Primitive type and !auxiliary class - (GenUtility.java:244)
import org.dmd.mvw.tools.mvwgenerator.generated.types.OperationSpec;                       // Primitive type and !auxiliary class - (GenUtility.java:244)
import org.dmd.mvw.tools.mvwgenerator.generated.types.RunContextItemREF;                   // Helper class - (GenUtility.java:308)
import org.dmd.mvw.tools.mvwgenerator.types.MethodWithArgs;                                // Primitive type and !auxiliary class - (GenUtility.java:244)

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The View is used to define the aspects of two kinds of interfaces that
 * define the functionality provided by a view of a model; the event
 * interface and the  data interface.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class ViewDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "View";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public ViewDMO() {
        super("View");
    }

    protected ViewDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public ViewDMO getNew(){
        ViewDMO rc = new ViewDMO();
        return(rc);
    }

    @Override
    public ViewDMO getSlice(DmcSliceInfo info){
        ViewDMO rc = new ViewDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ViewDMO(DmcTypeModifierMV mods) {
        super("View");
        modrec(true);
        setModifier(mods);
    }

    public ViewDMO getModificationRecorder(){
        ViewDMO rc = new ViewDMO();
        rc.setViewName(getViewName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:744)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__viewName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__viewName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof ViewDMO){
            return( getObjectName().equals( ((ViewDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public int hashCode(){
        CamelCaseName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:751)
    public String getUseBaseClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MvwDMSAG.__useBaseClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets useBaseClass to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:791)
    public void setUseBaseClass(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__useBaseClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__useBaseClass);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__useBaseClass,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets useBaseClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
    public void setUseBaseClass(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MvwDMSAG.__useBaseClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__useBaseClass);
        
        attr.set(value);
        set(MvwDMSAG.__useBaseClass,attr);
    }

    /**
     * Removes the useBaseClass attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remUseBaseClass(){
         rem(MvwDMSAG.__useBaseClass);
    }

    /**
     * @return An Iterator of EventDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:937)
    public Iterator<EventREF> getLocal(){
        DmcTypeEventREFSET attr = (DmcTypeEventREFSET) get(MvwDMSAG.__local);
        if (attr == null)
            return( ((List<EventREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<EventREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of EventREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:957)
    public Iterator<EventREF> getLocalREFs(){
        DmcTypeEventREFSET attr = (DmcTypeEventREFSET) get(MvwDMSAG.__local);
        if (attr == null)
            return( ((List<EventREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another local to the specified value.
     * @param value Event
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:971)
    public DmcAttribute<?> addLocal(EventDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__local);
        if (attr == null)
            attr = new DmcTypeEventREFSET(MvwDMSAG.__local);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__local,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another local value.
     * @param value A value compatible with Event
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1212)
    public DmcAttribute<?> addLocal(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__local);
        if (attr == null)
            attr = new DmcTypeEventREFSET(MvwDMSAG.__local);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__local,attr);
        return(attr);
    }

    /**
     * Returns the number of values in local
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1229)
    public int getLocalSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__local);
        if (attr == null){
            if (MvwDMSAG.__local.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__local.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a local value.
     * @param value The Event to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1268)
    public DmcAttribute<?> delLocal(Object value){
        DmcAttribute<?> attr = get(MvwDMSAG.__local);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeEventREFSET(MvwDMSAG.__local), value);
        else
            attr = del(MvwDMSAG.__local, value);
        
        return(attr);
    }

    /**
     * Removes the local attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1322)
    public void remLocal(){
         rem(MvwDMSAG.__local);
    }

    /**
     * @return An Iterator of EventDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:937)
    public Iterator<EventREF> getBroadcast(){
        DmcTypeEventREFMV attr = (DmcTypeEventREFMV) get(MvwDMSAG.__broadcast);
        if (attr == null)
            return( ((List<EventREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<EventREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of EventREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:957)
    public Iterator<EventREF> getBroadcastREFs(){
        DmcTypeEventREFMV attr = (DmcTypeEventREFMV) get(MvwDMSAG.__broadcast);
        if (attr == null)
            return( ((List<EventREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another broadcast to the specified value.
     * @param value Event
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:971)
    public DmcAttribute<?> addBroadcast(EventDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__broadcast);
        if (attr == null)
            attr = new DmcTypeEventREFMV(MvwDMSAG.__broadcast);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__broadcast,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another broadcast value.
     * @param value A value compatible with Event
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1212)
    public DmcAttribute<?> addBroadcast(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__broadcast);
        if (attr == null)
            attr = new DmcTypeEventREFMV(MvwDMSAG.__broadcast);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__broadcast,attr);
        return(attr);
    }

    /**
     * Returns the number of values in broadcast
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1229)
    public int getBroadcastSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__broadcast);
        if (attr == null){
            if (MvwDMSAG.__broadcast.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__broadcast.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a broadcast value.
     * @param value The Event to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1268)
    public DmcAttribute<?> delBroadcast(Object value){
        DmcAttribute<?> attr = get(MvwDMSAG.__broadcast);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeEventREFMV(MvwDMSAG.__broadcast), value);
        else
            attr = del(MvwDMSAG.__broadcast, value);
        
        return(attr);
    }

    /**
     * Removes the broadcast attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1322)
    public void remBroadcast(){
         rem(MvwDMSAG.__broadcast);
    }

    /**
     * @return An Iterator of EventDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:937)
    public Iterator<EventREF> getBroadcastOnly(){
        DmcTypeEventREFMV attr = (DmcTypeEventREFMV) get(MvwDMSAG.__broadcastOnly);
        if (attr == null)
            return( ((List<EventREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<EventREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of EventREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:957)
    public Iterator<EventREF> getBroadcastOnlyREFs(){
        DmcTypeEventREFMV attr = (DmcTypeEventREFMV) get(MvwDMSAG.__broadcastOnly);
        if (attr == null)
            return( ((List<EventREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another broadcastOnly to the specified value.
     * @param value Event
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:971)
    public DmcAttribute<?> addBroadcastOnly(EventDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__broadcastOnly);
        if (attr == null)
            attr = new DmcTypeEventREFMV(MvwDMSAG.__broadcastOnly);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__broadcastOnly,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another broadcastOnly value.
     * @param value A value compatible with Event
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1212)
    public DmcAttribute<?> addBroadcastOnly(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__broadcastOnly);
        if (attr == null)
            attr = new DmcTypeEventREFMV(MvwDMSAG.__broadcastOnly);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__broadcastOnly,attr);
        return(attr);
    }

    /**
     * Returns the number of values in broadcastOnly
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1229)
    public int getBroadcastOnlySize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__broadcastOnly);
        if (attr == null){
            if (MvwDMSAG.__broadcastOnly.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__broadcastOnly.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a broadcastOnly value.
     * @param value The Event to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1268)
    public DmcAttribute<?> delBroadcastOnly(Object value){
        DmcAttribute<?> attr = get(MvwDMSAG.__broadcastOnly);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeEventREFMV(MvwDMSAG.__broadcastOnly), value);
        else
            attr = del(MvwDMSAG.__broadcastOnly, value);
        
        return(attr);
    }

    /**
     * Removes the broadcastOnly attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1322)
    public void remBroadcastOnly(){
         rem(MvwDMSAG.__broadcastOnly);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1079)
    public Iterator<String> getViewImport(){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(MvwDMSAG.__viewImport);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1091)
    public String getNthViewImport(int i){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(MvwDMSAG.__viewImport);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another viewImport to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1105)
    public DmcAttribute<?> addViewImport(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__viewImport);
        if (attr == null)
            attr = new DmcTypeStringSET(MvwDMSAG.__viewImport);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__viewImport,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1180)
    public boolean viewImportContains(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__viewImport);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another viewImport value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1212)
    public DmcAttribute<?> addViewImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__viewImport);
        if (attr == null)
            attr = new DmcTypeStringSET(MvwDMSAG.__viewImport);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__viewImport,attr);
        return(attr);
    }

    /**
     * Returns the number of values in viewImport
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1229)
    public int getViewImportSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__viewImport);
        if (attr == null){
            if (MvwDMSAG.__viewImport.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__viewImport.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a viewImport value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1287)
    public DmcAttribute<?> delViewImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__viewImport);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(MvwDMSAG.__viewImport), value);
        else
            attr = del(MvwDMSAG.__viewImport, value);
        
        return(attr);
    }

    /**
     * Deletes a viewImport from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1303)
    public DmcAttribute<?> delViewImport(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__viewImport);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(MvwDMSAG.__viewImport), value);
        else
            attr = del(MvwDMSAG.__viewImport, value);
        
        return(attr);
    }

    /**
     * Removes the viewImport attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1322)
    public void remViewImport(){
         rem(MvwDMSAG.__viewImport);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1079)
    public Iterator<String> getPresenterImport(){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(MvwDMSAG.__presenterImport);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1091)
    public String getNthPresenterImport(int i){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(MvwDMSAG.__presenterImport);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another presenterImport to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1105)
    public DmcAttribute<?> addPresenterImport(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__presenterImport);
        if (attr == null)
            attr = new DmcTypeStringSET(MvwDMSAG.__presenterImport);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__presenterImport,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1180)
    public boolean presenterImportContains(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__presenterImport);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another presenterImport value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1212)
    public DmcAttribute<?> addPresenterImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__presenterImport);
        if (attr == null)
            attr = new DmcTypeStringSET(MvwDMSAG.__presenterImport);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__presenterImport,attr);
        return(attr);
    }

    /**
     * Returns the number of values in presenterImport
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1229)
    public int getPresenterImportSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__presenterImport);
        if (attr == null){
            if (MvwDMSAG.__presenterImport.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__presenterImport.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a presenterImport value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1287)
    public DmcAttribute<?> delPresenterImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__presenterImport);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(MvwDMSAG.__presenterImport), value);
        else
            attr = del(MvwDMSAG.__presenterImport, value);
        
        return(attr);
    }

    /**
     * Deletes a presenterImport from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1303)
    public DmcAttribute<?> delPresenterImport(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__presenterImport);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(MvwDMSAG.__presenterImport), value);
        else
            attr = del(MvwDMSAG.__presenterImport, value);
        
        return(attr);
    }

    /**
     * Removes the presenterImport attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1322)
    public void remPresenterImport(){
         rem(MvwDMSAG.__presenterImport);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1079)
    public Iterator<String> getSharedImport(){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(MvwDMSAG.__sharedImport);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1091)
    public String getNthSharedImport(int i){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(MvwDMSAG.__sharedImport);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another sharedImport to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1105)
    public DmcAttribute<?> addSharedImport(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__sharedImport);
        if (attr == null)
            attr = new DmcTypeStringSET(MvwDMSAG.__sharedImport);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__sharedImport,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1180)
    public boolean sharedImportContains(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__sharedImport);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another sharedImport value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1212)
    public DmcAttribute<?> addSharedImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__sharedImport);
        if (attr == null)
            attr = new DmcTypeStringSET(MvwDMSAG.__sharedImport);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__sharedImport,attr);
        return(attr);
    }

    /**
     * Returns the number of values in sharedImport
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1229)
    public int getSharedImportSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__sharedImport);
        if (attr == null){
            if (MvwDMSAG.__sharedImport.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__sharedImport.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a sharedImport value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1287)
    public DmcAttribute<?> delSharedImport(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__sharedImport);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(MvwDMSAG.__sharedImport), value);
        else
            attr = del(MvwDMSAG.__sharedImport, value);
        
        return(attr);
    }

    /**
     * Deletes a sharedImport from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1303)
    public DmcAttribute<?> delSharedImport(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__sharedImport);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(MvwDMSAG.__sharedImport), value);
        else
            attr = del(MvwDMSAG.__sharedImport, value);
        
        return(attr);
    }

    /**
     * Removes the sharedImport attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1322)
    public void remSharedImport(){
         rem(MvwDMSAG.__sharedImport);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:751)
    public String getSubpackage(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__subpackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets subpackage to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:791)
    public void setSubpackage(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__subpackage);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__subpackage);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__subpackage,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets subpackage to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
    public void setSubpackage(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MetaDMSAG.__subpackage);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__subpackage);
        
        attr.set(value);
        set(MetaDMSAG.__subpackage,attr);
    }

    /**
     * Removes the subpackage attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remSubpackage(){
         rem(MetaDMSAG.__subpackage);
    }

    /**
     * @return An Iterator of RunContextItemDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:937)
    public Iterator<RunContextItemREF> getUsesRunContextItem(){
        DmcTypeRunContextItemREFSET attr = (DmcTypeRunContextItemREFSET) get(MvwDMSAG.__usesRunContextItem);
        if (attr == null)
            return( ((List<RunContextItemREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<RunContextItemREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of RunContextItemREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:957)
    public Iterator<RunContextItemREF> getUsesRunContextItemREFs(){
        DmcTypeRunContextItemREFSET attr = (DmcTypeRunContextItemREFSET) get(MvwDMSAG.__usesRunContextItem);
        if (attr == null)
            return( ((List<RunContextItemREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another usesRunContextItem to the specified value.
     * @param value RunContextItem
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:971)
    public DmcAttribute<?> addUsesRunContextItem(RunContextItemDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__usesRunContextItem);
        if (attr == null)
            attr = new DmcTypeRunContextItemREFSET(MvwDMSAG.__usesRunContextItem);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__usesRunContextItem,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another usesRunContextItem value.
     * @param value A value compatible with RunContextItem
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1212)
    public DmcAttribute<?> addUsesRunContextItem(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__usesRunContextItem);
        if (attr == null)
            attr = new DmcTypeRunContextItemREFSET(MvwDMSAG.__usesRunContextItem);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__usesRunContextItem,attr);
        return(attr);
    }

    /**
     * Returns the number of values in usesRunContextItem
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1229)
    public int getUsesRunContextItemSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__usesRunContextItem);
        if (attr == null){
            if (MvwDMSAG.__usesRunContextItem.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__usesRunContextItem.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a usesRunContextItem value.
     * @param value The RunContextItem to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1268)
    public DmcAttribute<?> delUsesRunContextItem(Object value){
        DmcAttribute<?> attr = get(MvwDMSAG.__usesRunContextItem);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeRunContextItemREFSET(MvwDMSAG.__usesRunContextItem), value);
        else
            attr = del(MvwDMSAG.__usesRunContextItem, value);
        
        return(attr);
    }

    /**
     * Removes the usesRunContextItem attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1322)
    public void remUsesRunContextItem(){
         rem(MvwDMSAG.__usesRunContextItem);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:751)
    public Boolean isWidget(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MvwDMSAG.__widget);
        if (attr == null)
            return(true);

        return(attr.getSV());
    }

    /**
     * Sets widget to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:791)
    public void setWidget(Boolean value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__widget);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__widget);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__widget,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets widget to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
    public void setWidget(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(MvwDMSAG.__widget);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__widget);
        
        attr.set(value);
        set(MvwDMSAG.__widget,attr);
    }

    /**
     * Removes the widget attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remWidget(){
         rem(MvwDMSAG.__widget);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1079)
    public Iterator<String> getExtendsInterface(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__extendsInterface);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1091)
    public String getNthExtendsInterface(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__extendsInterface);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another extendsInterface to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1105)
    public DmcAttribute<?> addExtendsInterface(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__extendsInterface);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__extendsInterface);
        
        try{
            setLastValue(attr.add(value));
            add(MetaDMSAG.__extendsInterface,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1180)
    public boolean extendsInterfaceContains(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__extendsInterface);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another extendsInterface value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1212)
    public DmcAttribute<?> addExtendsInterface(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__extendsInterface);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__extendsInterface);
        
        setLastValue(attr.add(value));
        add(MetaDMSAG.__extendsInterface,attr);
        return(attr);
    }

    /**
     * Returns the number of values in extendsInterface
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1229)
    public int getExtendsInterfaceSize(){
        DmcAttribute<?> attr = get(MetaDMSAG.__extendsInterface);
        if (attr == null){
            if (MetaDMSAG.__extendsInterface.indexSize == 0)
                return(0);
            else
                return(MetaDMSAG.__extendsInterface.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a extendsInterface value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1287)
    public DmcAttribute<?> delExtendsInterface(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__extendsInterface);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(MetaDMSAG.__extendsInterface), value);
        else
            attr = del(MetaDMSAG.__extendsInterface, value);
        
        return(attr);
    }

    /**
     * Deletes a extendsInterface from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1303)
    public DmcAttribute<?> delExtendsInterface(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__extendsInterface);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(MetaDMSAG.__extendsInterface), value);
        else
            attr = del(MetaDMSAG.__extendsInterface, value);
        
        return(attr);
    }

    /**
     * Removes the extendsInterface attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1322)
    public void remExtendsInterface(){
         rem(MetaDMSAG.__extendsInterface);
    }

    /**
     * @return An Iterator of MethodWithArgs objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1079)
    public Iterator<MethodWithArgs> getPresenterMethod(){
        DmcTypeMethodWithArgsMV attr = (DmcTypeMethodWithArgsMV) get(MvwDMSAG.__presenterMethod);
        if (attr == null)
            return( ((List<MethodWithArgs>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth MethodWithArgs value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1091)
    public MethodWithArgs getNthPresenterMethod(int i){
        DmcTypeMethodWithArgsMV attr = (DmcTypeMethodWithArgsMV) get(MvwDMSAG.__presenterMethod);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another presenterMethod to the specified value.
     * @param value MethodWithArgs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1105)
    public DmcAttribute<?> addPresenterMethod(MethodWithArgs value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__presenterMethod);
        if (attr == null)
            attr = new DmcTypeMethodWithArgsMV(MvwDMSAG.__presenterMethod);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__presenterMethod,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified MethodWithArgs.
     * @param value MethodWithArgs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1180)
    public boolean presenterMethodContains(MethodWithArgs value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__presenterMethod);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another presenterMethod value.
     * @param value A value compatible with MethodWithArgs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1212)
    public DmcAttribute<?> addPresenterMethod(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__presenterMethod);
        if (attr == null)
            attr = new DmcTypeMethodWithArgsMV(MvwDMSAG.__presenterMethod);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__presenterMethod,attr);
        return(attr);
    }

    /**
     * Returns the number of values in presenterMethod
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1229)
    public int getPresenterMethodSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__presenterMethod);
        if (attr == null){
            if (MvwDMSAG.__presenterMethod.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__presenterMethod.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a presenterMethod value.
     * @param value The MethodWithArgs to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1287)
    public DmcAttribute<?> delPresenterMethod(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__presenterMethod);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeMethodWithArgsMV(MvwDMSAG.__presenterMethod), value);
        else
            attr = del(MvwDMSAG.__presenterMethod, value);
        
        return(attr);
    }

    /**
     * Deletes a presenterMethod from the specified value.
     * @param value MethodWithArgs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1303)
    public DmcAttribute<?> delPresenterMethod(MethodWithArgs value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__presenterMethod);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeMethodWithArgsMV(MvwDMSAG.__presenterMethod), value);
        else
            attr = del(MvwDMSAG.__presenterMethod, value);
        
        return(attr);
    }

    /**
     * Removes the presenterMethod attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1322)
    public void remPresenterMethod(){
         rem(MvwDMSAG.__presenterMethod);
    }

    /**
     * @return An Iterator of MethodWithArgs objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1079)
    public Iterator<MethodWithArgs> getViewMethod(){
        DmcTypeMethodWithArgsMV attr = (DmcTypeMethodWithArgsMV) get(MvwDMSAG.__viewMethod);
        if (attr == null)
            return( ((List<MethodWithArgs>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth MethodWithArgs value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1091)
    public MethodWithArgs getNthViewMethod(int i){
        DmcTypeMethodWithArgsMV attr = (DmcTypeMethodWithArgsMV) get(MvwDMSAG.__viewMethod);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another viewMethod to the specified value.
     * @param value MethodWithArgs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1105)
    public DmcAttribute<?> addViewMethod(MethodWithArgs value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__viewMethod);
        if (attr == null)
            attr = new DmcTypeMethodWithArgsMV(MvwDMSAG.__viewMethod);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__viewMethod,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified MethodWithArgs.
     * @param value MethodWithArgs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1180)
    public boolean viewMethodContains(MethodWithArgs value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__viewMethod);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another viewMethod value.
     * @param value A value compatible with MethodWithArgs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1212)
    public DmcAttribute<?> addViewMethod(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__viewMethod);
        if (attr == null)
            attr = new DmcTypeMethodWithArgsMV(MvwDMSAG.__viewMethod);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__viewMethod,attr);
        return(attr);
    }

    /**
     * Returns the number of values in viewMethod
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1229)
    public int getViewMethodSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__viewMethod);
        if (attr == null){
            if (MvwDMSAG.__viewMethod.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__viewMethod.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a viewMethod value.
     * @param value The MethodWithArgs to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1287)
    public DmcAttribute<?> delViewMethod(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__viewMethod);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeMethodWithArgsMV(MvwDMSAG.__viewMethod), value);
        else
            attr = del(MvwDMSAG.__viewMethod, value);
        
        return(attr);
    }

    /**
     * Deletes a viewMethod from the specified value.
     * @param value MethodWithArgs
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1303)
    public DmcAttribute<?> delViewMethod(MethodWithArgs value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__viewMethod);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeMethodWithArgsMV(MvwDMSAG.__viewMethod), value);
        else
            attr = del(MvwDMSAG.__viewMethod, value);
        
        return(attr);
    }

    /**
     * Removes the viewMethod attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1322)
    public void remViewMethod(){
         rem(MvwDMSAG.__viewMethod);
    }

    /**
     * @return An Iterator of DisplayDataSpec objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1079)
    public Iterator<DisplayDataSpec> getDisplayDMO(){
        DmcTypeDisplayDataSpecMV attr = (DmcTypeDisplayDataSpecMV) get(MvwDMSAG.__displayDMO);
        if (attr == null)
            return( ((List<DisplayDataSpec>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth DisplayDataSpec value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1091)
    public DisplayDataSpec getNthDisplayDMO(int i){
        DmcTypeDisplayDataSpecMV attr = (DmcTypeDisplayDataSpecMV) get(MvwDMSAG.__displayDMO);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another displayDMO to the specified value.
     * @param value DisplayDataSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1105)
    public DmcAttribute<?> addDisplayDMO(DisplayDataSpec value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__displayDMO);
        if (attr == null)
            attr = new DmcTypeDisplayDataSpecMV(MvwDMSAG.__displayDMO);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__displayDMO,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified DisplayDataSpec.
     * @param value DisplayDataSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1180)
    public boolean displayDMOContains(DisplayDataSpec value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__displayDMO);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another displayDMO value.
     * @param value A value compatible with DisplayDataSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1212)
    public DmcAttribute<?> addDisplayDMO(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__displayDMO);
        if (attr == null)
            attr = new DmcTypeDisplayDataSpecMV(MvwDMSAG.__displayDMO);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__displayDMO,attr);
        return(attr);
    }

    /**
     * Returns the number of values in displayDMO
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1229)
    public int getDisplayDMOSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__displayDMO);
        if (attr == null){
            if (MvwDMSAG.__displayDMO.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__displayDMO.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a displayDMO value.
     * @param value The DisplayDataSpec to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1287)
    public DmcAttribute<?> delDisplayDMO(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__displayDMO);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDisplayDataSpecMV(MvwDMSAG.__displayDMO), value);
        else
            attr = del(MvwDMSAG.__displayDMO, value);
        
        return(attr);
    }

    /**
     * Deletes a displayDMO from the specified value.
     * @param value DisplayDataSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1303)
    public DmcAttribute<?> delDisplayDMO(DisplayDataSpec value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__displayDMO);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDisplayDataSpecMV(MvwDMSAG.__displayDMO), value);
        else
            attr = del(MvwDMSAG.__displayDMO, value);
        
        return(attr);
    }

    /**
     * Removes the displayDMO attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1322)
    public void remDisplayDMO(){
         rem(MvwDMSAG.__displayDMO);
    }

    /**
     * @return An Iterator of EventSpec objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1079)
    public Iterator<EventSpec> getSelectEvent(){
        DmcTypeEventSpecMV attr = (DmcTypeEventSpecMV) get(MvwDMSAG.__selectEvent);
        if (attr == null)
            return( ((List<EventSpec>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth EventSpec value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1091)
    public EventSpec getNthSelectEvent(int i){
        DmcTypeEventSpecMV attr = (DmcTypeEventSpecMV) get(MvwDMSAG.__selectEvent);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another selectEvent to the specified value.
     * @param value EventSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1105)
    public DmcAttribute<?> addSelectEvent(EventSpec value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__selectEvent);
        if (attr == null)
            attr = new DmcTypeEventSpecMV(MvwDMSAG.__selectEvent);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__selectEvent,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified EventSpec.
     * @param value EventSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1180)
    public boolean selectEventContains(EventSpec value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__selectEvent);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another selectEvent value.
     * @param value A value compatible with EventSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1212)
    public DmcAttribute<?> addSelectEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__selectEvent);
        if (attr == null)
            attr = new DmcTypeEventSpecMV(MvwDMSAG.__selectEvent);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__selectEvent,attr);
        return(attr);
    }

    /**
     * Returns the number of values in selectEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1229)
    public int getSelectEventSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__selectEvent);
        if (attr == null){
            if (MvwDMSAG.__selectEvent.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__selectEvent.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a selectEvent value.
     * @param value The EventSpec to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1287)
    public DmcAttribute<?> delSelectEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__selectEvent);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeEventSpecMV(MvwDMSAG.__selectEvent), value);
        else
            attr = del(MvwDMSAG.__selectEvent, value);
        
        return(attr);
    }

    /**
     * Deletes a selectEvent from the specified value.
     * @param value EventSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1303)
    public DmcAttribute<?> delSelectEvent(EventSpec value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__selectEvent);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeEventSpecMV(MvwDMSAG.__selectEvent), value);
        else
            attr = del(MvwDMSAG.__selectEvent, value);
        
        return(attr);
    }

    /**
     * Removes the selectEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1322)
    public void remSelectEvent(){
         rem(MvwDMSAG.__selectEvent);
    }

    /**
     * @return An Iterator of EventSpec objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1079)
    public Iterator<EventSpec> getDeleteEvent(){
        DmcTypeEventSpecMV attr = (DmcTypeEventSpecMV) get(MvwDMSAG.__deleteEvent);
        if (attr == null)
            return( ((List<EventSpec>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth EventSpec value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1091)
    public EventSpec getNthDeleteEvent(int i){
        DmcTypeEventSpecMV attr = (DmcTypeEventSpecMV) get(MvwDMSAG.__deleteEvent);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another deleteEvent to the specified value.
     * @param value EventSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1105)
    public DmcAttribute<?> addDeleteEvent(EventSpec value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__deleteEvent);
        if (attr == null)
            attr = new DmcTypeEventSpecMV(MvwDMSAG.__deleteEvent);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__deleteEvent,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified EventSpec.
     * @param value EventSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1180)
    public boolean deleteEventContains(EventSpec value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__deleteEvent);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another deleteEvent value.
     * @param value A value compatible with EventSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1212)
    public DmcAttribute<?> addDeleteEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__deleteEvent);
        if (attr == null)
            attr = new DmcTypeEventSpecMV(MvwDMSAG.__deleteEvent);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__deleteEvent,attr);
        return(attr);
    }

    /**
     * Returns the number of values in deleteEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1229)
    public int getDeleteEventSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__deleteEvent);
        if (attr == null){
            if (MvwDMSAG.__deleteEvent.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__deleteEvent.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a deleteEvent value.
     * @param value The EventSpec to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1287)
    public DmcAttribute<?> delDeleteEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__deleteEvent);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeEventSpecMV(MvwDMSAG.__deleteEvent), value);
        else
            attr = del(MvwDMSAG.__deleteEvent, value);
        
        return(attr);
    }

    /**
     * Deletes a deleteEvent from the specified value.
     * @param value EventSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1303)
    public DmcAttribute<?> delDeleteEvent(EventSpec value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__deleteEvent);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeEventSpecMV(MvwDMSAG.__deleteEvent), value);
        else
            attr = del(MvwDMSAG.__deleteEvent, value);
        
        return(attr);
    }

    /**
     * Removes the deleteEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1322)
    public void remDeleteEvent(){
         rem(MvwDMSAG.__deleteEvent);
    }

    /**
     * @return An Iterator of OperationSpec objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1079)
    public Iterator<OperationSpec> getClickEvent(){
        DmcTypeOperationSpecMV attr = (DmcTypeOperationSpecMV) get(MvwDMSAG.__clickEvent);
        if (attr == null)
            return( ((List<OperationSpec>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth OperationSpec value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1091)
    public OperationSpec getNthClickEvent(int i){
        DmcTypeOperationSpecMV attr = (DmcTypeOperationSpecMV) get(MvwDMSAG.__clickEvent);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another clickEvent to the specified value.
     * @param value OperationSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1105)
    public DmcAttribute<?> addClickEvent(OperationSpec value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__clickEvent);
        if (attr == null)
            attr = new DmcTypeOperationSpecMV(MvwDMSAG.__clickEvent);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__clickEvent,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified OperationSpec.
     * @param value OperationSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1180)
    public boolean clickEventContains(OperationSpec value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__clickEvent);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another clickEvent value.
     * @param value A value compatible with OperationSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1212)
    public DmcAttribute<?> addClickEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__clickEvent);
        if (attr == null)
            attr = new DmcTypeOperationSpecMV(MvwDMSAG.__clickEvent);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__clickEvent,attr);
        return(attr);
    }

    /**
     * Returns the number of values in clickEvent
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1229)
    public int getClickEventSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__clickEvent);
        if (attr == null){
            if (MvwDMSAG.__clickEvent.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__clickEvent.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a clickEvent value.
     * @param value The OperationSpec to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1287)
    public DmcAttribute<?> delClickEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__clickEvent);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeOperationSpecMV(MvwDMSAG.__clickEvent), value);
        else
            attr = del(MvwDMSAG.__clickEvent, value);
        
        return(attr);
    }

    /**
     * Deletes a clickEvent from the specified value.
     * @param value OperationSpec
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1303)
    public DmcAttribute<?> delClickEvent(OperationSpec value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__clickEvent);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeOperationSpecMV(MvwDMSAG.__clickEvent), value);
        else
            attr = del(MvwDMSAG.__clickEvent, value);
        
        return(attr);
    }

    /**
     * Removes the clickEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1322)
    public void remClickEvent(){
         rem(MvwDMSAG.__clickEvent);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:751)
    public OperationSpec getModifyEvent(){
        DmcTypeOperationSpecSV attr = (DmcTypeOperationSpecSV) get(MvwDMSAG.__modifyEvent);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets modifyEvent to the specified value.
     * @param value OperationSpec
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:791)
    public void setModifyEvent(OperationSpec value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__modifyEvent);
        if (attr == null)
            attr = new DmcTypeOperationSpecSV(MvwDMSAG.__modifyEvent);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__modifyEvent,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets modifyEvent to the specified value.
     * @param value A value compatible with DmcTypeOperationSpecSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
    public void setModifyEvent(Object value) throws DmcValueException {
        DmcTypeOperationSpecSV attr  = (DmcTypeOperationSpecSV) get(MvwDMSAG.__modifyEvent);
        if (attr == null)
            attr = new DmcTypeOperationSpecSV(MvwDMSAG.__modifyEvent);
        
        attr.set(value);
        set(MvwDMSAG.__modifyEvent,attr);
    }

    /**
     * Removes the modifyEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remModifyEvent(){
         rem(MvwDMSAG.__modifyEvent);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:751)
    public OperationSpec getCreateEvent(){
        DmcTypeOperationSpecSV attr = (DmcTypeOperationSpecSV) get(MvwDMSAG.__createEvent);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets createEvent to the specified value.
     * @param value OperationSpec
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:791)
    public void setCreateEvent(OperationSpec value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__createEvent);
        if (attr == null)
            attr = new DmcTypeOperationSpecSV(MvwDMSAG.__createEvent);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__createEvent,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets createEvent to the specified value.
     * @param value A value compatible with DmcTypeOperationSpecSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
    public void setCreateEvent(Object value) throws DmcValueException {
        DmcTypeOperationSpecSV attr  = (DmcTypeOperationSpecSV) get(MvwDMSAG.__createEvent);
        if (attr == null)
            attr = new DmcTypeOperationSpecSV(MvwDMSAG.__createEvent);
        
        attr.set(value);
        set(MvwDMSAG.__createEvent,attr);
    }

    /**
     * Removes the createEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remCreateEvent(){
         rem(MvwDMSAG.__createEvent);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:751)
    public CamelCaseName getViewName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__viewName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets viewName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:791)
    public void setViewName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__viewName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__viewName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__viewName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets viewName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
    public void setViewName(Object value) throws DmcValueException {
        DmcTypeCamelCaseNameSV attr  = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__viewName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__viewName);
        
        attr.set(value);
        set(MvwDMSAG.__viewName,attr);
    }

    /**
     * Removes the viewName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remViewName(){
         rem(MvwDMSAG.__viewName);
    }




}

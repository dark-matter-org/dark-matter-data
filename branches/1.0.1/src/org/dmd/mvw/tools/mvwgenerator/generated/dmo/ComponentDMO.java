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
import java.io.Serializable;                                                                   // Always required - (GenUtility.java:197)
import java.util.*;                                                                            // Always required if we have any MV attributes - (GenUtility.java:193)
import org.dmd.dmc.DmcAttribute;                                                               // Any attributes - (GenUtility.java:213)
import org.dmd.dmc.DmcNamedObjectIF;                                                           // Named object - (GenUtility.java:348)
import org.dmd.dmc.DmcOmni;                                                                    // Lazy resolution - (GenUtility.java:293)
import org.dmd.dmc.DmcValueException;                                                          // Any attributes - (GenUtility.java:214)
import org.dmd.dmc.types.CamelCaseName;                                                        // Naming attribute type - (GenUtility.java:343)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                                    // Attribute from meta schema - (GenUtility.java:126)
import org.dmd.dms.generated.dmo.SchemaDefinitionDMO;                                          // Type specific set/add - (GenUtility.java:280)
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                                     // Required type - (GenUtility.java:301)
import org.dmd.dms.generated.types.DmcTypeSchemaDefinitionREFMV;                               // Reference type - (GenUtility.java:273)
import org.dmd.dms.generated.types.DmcTypeStringSV;                                            // Required type - (GenUtility.java:301)
import org.dmd.dms.generated.types.SchemaDefinitionREF;                                        // Helper class - (GenUtility.java:308)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.EventDMO;                                  // Type specific set/add - (GenUtility.java:280)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;                          // Base class - (GenUtility.java:328)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.RunContextItemDMO;                         // Type specific set/add - (GenUtility.java:280)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ViewDMO;                                   // Type specific set/add - (GenUtility.java:280)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeEventREFMAP;                      // Reference type - (GenUtility.java:273)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeRequestTypeWithOptionsMV;         // Required type - (GenUtility.java:301)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeRunContextItemREFSET;             // Reference type - (GenUtility.java:273)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeViewREFMV;                        // Reference type - (GenUtility.java:273)
import org.dmd.mvw.tools.mvwgenerator.generated.types.EventREF;                                // Helper class - (GenUtility.java:308)
import org.dmd.mvw.tools.mvwgenerator.generated.types.RunContextItemREF;                       // Helper class - (GenUtility.java:308)
import org.dmd.mvw.tools.mvwgenerator.generated.types.ViewREF;                                 // Helper class - (GenUtility.java:308)
import org.dmd.mvw.tools.mvwgenerator.types.RequestTypeWithOptions;                            // Primitive type and !auxiliary class - (GenUtility.java:244)

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The Component is an abstract base for classes that define the building
 * blocks of Applications. The primary feature of an Component is that it
 * fires and/or handles events. Beyond that, a component can be whatever you
 * require it to be. A variety of derived component types provide more
 * focussed behavioural units. <p /> Many of the classes generated by MVW
 * must be extended in order to provide the actual behaviour of your
 * application e.g. Controllers, Views, Presenters etc. Activities must also
 * be extended to provide your behaviour, however, Activities are also
 * referred to by generated code and must be in a known location. By default,
 * the classes that extend the generated activity class will reside in the
 * 'extended' package that lies beneath the genPackage specified for your
 * module i.e. if your gen package is com.mine, then the  derived activity
 * classes are expected to be in com.mine.extended. If you want to place
 * these classes in a subpackage beneath extended, use the subpackage
 * attribute to indicate the package name e.g. if subpackage is defined as
 * 'activities', your activity implementation class will be expected to
 * reside in com.mine.extended.activities.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
abstract public class ComponentDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "Component";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public ComponentDMO() {
        super("Component");
    }

    protected ComponentDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:744)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__componentName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__componentName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof ComponentDMO){
            return( getObjectName().equals( ((ComponentDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public int hashCode(){
        CamelCaseName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    /**
     * @return An Iterator of EventDMO objects.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1360)
    @SuppressWarnings("unchecked")
    public Iterator<EventREF> getFiresEvent(){
        DmcTypeEventREFMAP attr = (DmcTypeEventREFMAP) get(MvwDMSAG.__firesEvent);
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
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1390)
    @SuppressWarnings("unchecked")
    public Iterator<EventREF> getFiresEventREFs(){
        DmcTypeEventREFMAP attr = (DmcTypeEventREFMAP) get(MvwDMSAG.__firesEvent);
        if (attr == null)
            return( ((List<EventREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * @param key The key of the value you want.
     * @return The Event associated with the specified key.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1424)
    public EventREF getFiresEvent(Object key){
        DmcTypeEventREFMAP attr = (DmcTypeEventREFMAP) get(MvwDMSAG.__firesEvent);
        if (attr == null)
            return(null);

        return(attr.getByKey(key));
    }

    /**
     * @return The first key of the map.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1458)
    public CamelCaseName getFiresEventFirstKey(){
        DmcTypeEventREFMAP attr = (DmcTypeEventREFMAP) get(MvwDMSAG.__firesEvent);
        if (attr == null)
            return(null);

        return(attr.firstKey());
    }

    /**
     * Adds another firesEvent value.
     * @param value A value compatible with Event
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1476)
    public DmcAttribute<?> addFiresEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__firesEvent);
        if (attr == null)
            attr = new DmcTypeEventREFMAP(MvwDMSAG.__firesEvent);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__firesEvent,attr);
        return(attr);
    }

    /**
     * Adds another firesEvent value.
     * @param value Event
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1492)
    public DmcAttribute<?> addFiresEvent(EventDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__firesEvent);
        if (attr == null)
            attr = new DmcTypeEventREFMAP(MvwDMSAG.__firesEvent);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__firesEvent,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Deletes a firesEvent value.
     * @param value The Event to be deleted from set of attribute values.
     */
    public DmcAttribute<?> delFiresEvent(Object value) throws DmcValueException {
        return(del(MvwDMSAG.__firesEvent, value));
    }

    /**
     * Deletes a firesEvent value.
     * @param value The Event to be deleted from set of attribute values.
     */
    public DmcAttribute<?> delFiresEvent(EventDMO value){
        return(del(MvwDMSAG.__firesEvent, value));
    }

    /**
     * Removes the firesEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1647)
    public void remFiresEvent(){
         rem(MvwDMSAG.__firesEvent);
    }

    /**
     * @return An Iterator of EventDMO objects.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1360)
    @SuppressWarnings("unchecked")
    public Iterator<EventREF> getHandlesEvent(){
        DmcTypeEventREFMAP attr = (DmcTypeEventREFMAP) get(MvwDMSAG.__handlesEvent);
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
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1390)
    @SuppressWarnings("unchecked")
    public Iterator<EventREF> getHandlesEventREFs(){
        DmcTypeEventREFMAP attr = (DmcTypeEventREFMAP) get(MvwDMSAG.__handlesEvent);
        if (attr == null)
            return( ((List<EventREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * @param key The key of the value you want.
     * @return The Event associated with the specified key.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1424)
    public EventREF getHandlesEvent(Object key){
        DmcTypeEventREFMAP attr = (DmcTypeEventREFMAP) get(MvwDMSAG.__handlesEvent);
        if (attr == null)
            return(null);

        return(attr.getByKey(key));
    }

    /**
     * @return The first key of the map.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1458)
    public CamelCaseName getHandlesEventFirstKey(){
        DmcTypeEventREFMAP attr = (DmcTypeEventREFMAP) get(MvwDMSAG.__handlesEvent);
        if (attr == null)
            return(null);

        return(attr.firstKey());
    }

    /**
     * Adds another handlesEvent value.
     * @param value A value compatible with Event
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1476)
    public DmcAttribute<?> addHandlesEvent(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__handlesEvent);
        if (attr == null)
            attr = new DmcTypeEventREFMAP(MvwDMSAG.__handlesEvent);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__handlesEvent,attr);
        return(attr);
    }

    /**
     * Adds another handlesEvent value.
     * @param value Event
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1492)
    public DmcAttribute<?> addHandlesEvent(EventDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__handlesEvent);
        if (attr == null)
            attr = new DmcTypeEventREFMAP(MvwDMSAG.__handlesEvent);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__handlesEvent,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Deletes a handlesEvent value.
     * @param value The Event to be deleted from set of attribute values.
     */
    public DmcAttribute<?> delHandlesEvent(Object value) throws DmcValueException {
        return(del(MvwDMSAG.__handlesEvent, value));
    }

    /**
     * Deletes a handlesEvent value.
     * @param value The Event to be deleted from set of attribute values.
     */
    public DmcAttribute<?> delHandlesEvent(EventDMO value){
        return(del(MvwDMSAG.__handlesEvent, value));
    }

    /**
     * Removes the handlesEvent attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMAPPED(GenUtility.java:1647)
    public void remHandlesEvent(){
         rem(MvwDMSAG.__handlesEvent);
    }

    /**
     * @return An Iterator of SchemaDefinitionDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:937)
    public Iterator<SchemaDefinitionREF> getUseSchema(){
        DmcTypeSchemaDefinitionREFMV attr = (DmcTypeSchemaDefinitionREFMV) get(MvwDMSAG.__useSchema);
        if (attr == null)
            return( ((List<SchemaDefinitionREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<SchemaDefinitionREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of SchemaDefinitionREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:957)
    public Iterator<SchemaDefinitionREF> getUseSchemaREFs(){
        DmcTypeSchemaDefinitionREFMV attr = (DmcTypeSchemaDefinitionREFMV) get(MvwDMSAG.__useSchema);
        if (attr == null)
            return( ((List<SchemaDefinitionREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another useSchema to the specified value.
     * @param value SchemaDefinition
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:971)
    public DmcAttribute<?> addUseSchema(SchemaDefinitionDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__useSchema);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREFMV(MvwDMSAG.__useSchema);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__useSchema,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another useSchema value.
     * @param value A value compatible with SchemaDefinition
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1212)
    public DmcAttribute<?> addUseSchema(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__useSchema);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREFMV(MvwDMSAG.__useSchema);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__useSchema,attr);
        return(attr);
    }

    /**
     * Returns the number of values in useSchema
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1229)
    public int getUseSchemaSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__useSchema);
        if (attr == null){
            if (MvwDMSAG.__useSchema.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__useSchema.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a useSchema value.
     * @param value The SchemaDefinition to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1268)
    public DmcAttribute<?> delUseSchema(Object value){
        DmcAttribute<?> attr = get(MvwDMSAG.__useSchema);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeSchemaDefinitionREFMV(MvwDMSAG.__useSchema), value);
        else
            attr = del(MvwDMSAG.__useSchema, value);
        
        return(attr);
    }

    /**
     * Removes the useSchema attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1322)
    public void remUseSchema(){
         rem(MvwDMSAG.__useSchema);
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

    /**
     * @return An Iterator of RequestTypeWithOptions objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1079)
    public Iterator<RequestTypeWithOptions> getSendsRequest(){
        DmcTypeRequestTypeWithOptionsMV attr = (DmcTypeRequestTypeWithOptionsMV) get(MvwDMSAG.__sendsRequest);
        if (attr == null)
            return( ((List<RequestTypeWithOptions>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth RequestTypeWithOptions value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1091)
    public RequestTypeWithOptions getNthSendsRequest(int i){
        DmcTypeRequestTypeWithOptionsMV attr = (DmcTypeRequestTypeWithOptionsMV) get(MvwDMSAG.__sendsRequest);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another sendsRequest to the specified value.
     * @param value RequestTypeWithOptions
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1105)
    public DmcAttribute<?> addSendsRequest(RequestTypeWithOptions value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__sendsRequest);
        if (attr == null)
            attr = new DmcTypeRequestTypeWithOptionsMV(MvwDMSAG.__sendsRequest);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__sendsRequest,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified RequestTypeWithOptions.
     * @param value RequestTypeWithOptions
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1180)
    public boolean sendsRequestContains(RequestTypeWithOptions value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__sendsRequest);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another sendsRequest value.
     * @param value A value compatible with RequestTypeWithOptions
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1212)
    public DmcAttribute<?> addSendsRequest(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__sendsRequest);
        if (attr == null)
            attr = new DmcTypeRequestTypeWithOptionsMV(MvwDMSAG.__sendsRequest);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__sendsRequest,attr);
        return(attr);
    }

    /**
     * Returns the number of values in sendsRequest
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1229)
    public int getSendsRequestSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__sendsRequest);
        if (attr == null){
            if (MvwDMSAG.__sendsRequest.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__sendsRequest.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a sendsRequest value.
     * @param value The RequestTypeWithOptions to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1287)
    public DmcAttribute<?> delSendsRequest(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__sendsRequest);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeRequestTypeWithOptionsMV(MvwDMSAG.__sendsRequest), value);
        else
            attr = del(MvwDMSAG.__sendsRequest, value);
        
        return(attr);
    }

    /**
     * Deletes a sendsRequest from the specified value.
     * @param value RequestTypeWithOptions
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1303)
    public DmcAttribute<?> delSendsRequest(RequestTypeWithOptions value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__sendsRequest);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeRequestTypeWithOptionsMV(MvwDMSAG.__sendsRequest), value);
        else
            attr = del(MvwDMSAG.__sendsRequest, value);
        
        return(attr);
    }

    /**
     * Removes the sendsRequest attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1322)
    public void remSendsRequest(){
         rem(MvwDMSAG.__sendsRequest);
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
     * @return An Iterator of ViewDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:937)
    public Iterator<ViewREF> getInstantiatesView(){
        DmcTypeViewREFMV attr = (DmcTypeViewREFMV) get(MvwDMSAG.__instantiatesView);
        if (attr == null)
            return( ((List<ViewREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<ViewREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of ViewREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:957)
    public Iterator<ViewREF> getInstantiatesViewREFs(){
        DmcTypeViewREFMV attr = (DmcTypeViewREFMV) get(MvwDMSAG.__instantiatesView);
        if (attr == null)
            return( ((List<ViewREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another instantiatesView to the specified value.
     * @param value View
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:971)
    public DmcAttribute<?> addInstantiatesView(ViewDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__instantiatesView);
        if (attr == null)
            attr = new DmcTypeViewREFMV(MvwDMSAG.__instantiatesView);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__instantiatesView,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another instantiatesView value.
     * @param value A value compatible with View
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1212)
    public DmcAttribute<?> addInstantiatesView(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__instantiatesView);
        if (attr == null)
            attr = new DmcTypeViewREFMV(MvwDMSAG.__instantiatesView);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__instantiatesView,attr);
        return(attr);
    }

    /**
     * Returns the number of values in instantiatesView
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1229)
    public int getInstantiatesViewSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__instantiatesView);
        if (attr == null){
            if (MvwDMSAG.__instantiatesView.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__instantiatesView.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a instantiatesView value.
     * @param value The View to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1268)
    public DmcAttribute<?> delInstantiatesView(Object value){
        DmcAttribute<?> attr = get(MvwDMSAG.__instantiatesView);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeViewREFMV(MvwDMSAG.__instantiatesView), value);
        else
            attr = del(MvwDMSAG.__instantiatesView, value);
        
        return(attr);
    }

    /**
     * Removes the instantiatesView attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1322)
    public void remInstantiatesView(){
         rem(MvwDMSAG.__instantiatesView);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:751)
    public CamelCaseName getComponentName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__componentName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets componentName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:791)
    public void setComponentName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__componentName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__componentName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__componentName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets componentName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
    public void setComponentName(Object value) throws DmcValueException {
        DmcTypeCamelCaseNameSV attr  = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__componentName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__componentName);
        
        attr.set(value);
        set(MvwDMSAG.__componentName,attr);
    }

    /**
     * Removes the componentName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remComponentName(){
         rem(MvwDMSAG.__componentName);
    }




}

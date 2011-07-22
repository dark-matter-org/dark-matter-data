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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:321)
import java.io.Serializable;                                                  // Always required
import java.util.*;                                                           // Always required
import org.dmd.dmc.DmcAttribute;                                              // Any attributes
import org.dmd.dmc.DmcNamedObjectIF;                                          // Named object
import org.dmd.dmc.DmcSliceInfo;                                              // Required for object slicing
import org.dmd.dmc.DmcValueException;                                         // Any attributes
import org.dmd.dmc.types.CamelCaseName;                                       // Naming attribute type
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                    // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                         // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringSET;                          // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                           // Required type
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;         // Base class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The specification of an Event definition will result in the creation of a
 * gwtEvent and its associated handler interface.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class EventDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "Event";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public EventDMO() {
        super("Event");
    }

    protected EventDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public EventDMO getNew(){
        EventDMO rc = new EventDMO();
        return(rc);
    }

    @Override
    public EventDMO getSlice(DmcSliceInfo info){
        EventDMO rc = new EventDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public EventDMO(DmcTypeModifierMV mods) {
        super("Event");
        modrec(true);
        setModifier(mods);
    }

    public EventDMO getModificationRecorder(){
        EventDMO rc = new EventDMO();
        rc.setEventName(getEventName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:735)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__eventName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__eventName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof EventDMO){
            return( getObjectName().equals( ((EventDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public String getArgVector(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MvwDMSAG.__argVector);
        if (attr == null)
            return("()");

        return(attr.getSV());
    }

    /**
     * Sets argVector to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
    public void setArgVector(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__argVector);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__argVector);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__argVector,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets argVector to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setArgVector(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__argVector);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__argVector);
        
        attr.set(value);
        set(MvwDMSAG.__argVector,attr);
    }

    /**
     * Removes the argVector attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remArgVector(){
         rem(MvwDMSAG.__argVector);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:945)
    public Iterator<String> getImportThis(){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(MvwDMSAG.__importThis);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:957)
    public String getNthImportThis(int i){
        DmcTypeStringSET attr = (DmcTypeStringSET) get(MvwDMSAG.__importThis);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another importThis to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:971)
    public DmcAttribute<?> addImportThis(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__importThis);
        if (attr == null)
            attr = new DmcTypeStringSET(MvwDMSAG.__importThis);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__importThis,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1045)
    public boolean importThisContains(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__importThis);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another importThis value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1077)
    public DmcAttribute<?> addImportThis(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__importThis);
        if (attr == null)
            attr = new DmcTypeStringSET(MvwDMSAG.__importThis);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__importThis,attr);
        return(attr);
    }

    /**
     * Returns the number of values in importThis
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1094)
    public int getImportThisSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__importThis);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a importThis value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1136)
    public DmcAttribute<?> delImportThis(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__importThis);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(MvwDMSAG.__importThis), value);
        else
            attr = del(MvwDMSAG.__importThis, value);
        
        return(attr);
    }

    /**
     * Deletes a importThis from the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1152)
    public DmcAttribute<?> delImportThis(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__importThis);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringSET(MvwDMSAG.__importThis), value);
        else
            attr = del(MvwDMSAG.__importThis, value);
        
        return(attr);
    }

    /**
     * Removes the importThis attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1171)
    public void remImportThis(){
         rem(MvwDMSAG.__importThis);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public CamelCaseName getEventName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__eventName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets eventName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
    public void setEventName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__eventName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__eventName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__eventName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets eventName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setEventName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__eventName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__eventName);
        
        attr.set(value);
        set(MvwDMSAG.__eventName,attr);
    }

    /**
     * Removes the eventName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remEventName(){
         rem(MvwDMSAG.__eventName);
    }




}

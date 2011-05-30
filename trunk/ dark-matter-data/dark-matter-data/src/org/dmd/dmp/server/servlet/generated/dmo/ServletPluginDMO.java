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
package org.dmd.dmp.server.servlet.generated.dmo;

// Generated from:  org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:281)
import java.io.Serializable;                                       // Always required
import java.util.*;                                                // Always required
import org.dmd.dmc.DmcAttribute;                                   // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                               // Always required
import org.dmd.dmc.DmcNamedObjectIF;                               // Named object
import org.dmd.dmc.DmcSliceInfo;                                   // Required for object slicing
import org.dmd.dmc.DmcValueException;                              // Any attributes
import org.dmd.dmc.types.CamelCaseName;                            // Naming attribute type
import org.dmd.dms.generated.dmo.DmwWrapperDMO;                    // Structural class
import org.dmd.dms.generated.enums.DataTypeEnum;                   // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;                  // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;         // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringMV;                // Required type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The ServletPlugin is used to specify a plugin to be loaded into the DMP
 * Servlet Reference Implementation servlet.
 * <P>
 * Generated from the dmp.server schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:136)
 */
@SuppressWarnings("serial")
public class ServletPluginDMO  extends DmwWrapperDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "ServletPlugin";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __dependsOnPlugin = new DmcAttributeInfo("dependsOnPlugin",702,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __dependsOnSchema = new DmcAttributeInfo("dependsOnSchema",120,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __pluginName = new DmcAttributeInfo("pluginName",701,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__dependsOnPlugin.id,__dependsOnPlugin);
        _ImAp.put(__dependsOnSchema.id,__dependsOnSchema);
        _ImAp.put(__pluginName.id,__pluginName);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__dependsOnPlugin.name,__dependsOnPlugin);
        _SmAp.put(__dependsOnSchema.name,__dependsOnSchema);
        _SmAp.put(__pluginName.name,__pluginName);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public ServletPluginDMO() {
        super("ServletPlugin");
    }

    protected ServletPluginDMO(String oc) {
        super(oc);
    }

    @Override
    public boolean supportsBackrefTracking(){
        return(false);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public ServletPluginDMO getNew(){
        ServletPluginDMO rc = new ServletPluginDMO();
        return(rc);
    }

    @Override
    public ServletPluginDMO getSlice(DmcSliceInfo info){
        ServletPluginDMO rc = new ServletPluginDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ServletPluginDMO(DmcTypeModifierMV mods) {
        super("ServletPlugin");
        modrec(true);
        setModifier(mods);
    }

    public ServletPluginDMO getModificationRecorder(){
        ServletPluginDMO rc = new ServletPluginDMO();
        rc.setPluginName(getPluginName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    //  org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:736)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(__pluginName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__pluginName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof ServletPluginDMO){
            return( getObjectName().equals( ((ServletPluginDMO) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:802)
    public Iterator<String> getDependsOnSchema(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(__dependsOnSchema);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:814)
    public String getNthDependsOnSchema(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(__dependsOnSchema);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another dependsOnSchema to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:827)
    public DmcAttribute<?> addDependsOnSchema(String value) {
        DmcAttribute<?> attr = get(__dependsOnSchema);
        if (attr == null)
            attr = new DmcTypeStringMV(__dependsOnSchema);
        
        try{
            setLastValue(attr.add(value));
            add(__dependsOnSchema,attr);
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
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:869)
    public boolean dependsOnSchemaContains(String value) {
        DmcAttribute<?> attr = get(__dependsOnSchema);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another dependsOnSchema value.
     * @param value A value compatible with String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addDependsOnSchema(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__dependsOnSchema);
        if (attr == null)
            attr = new DmcTypeStringMV(__dependsOnSchema);
        
        setLastValue(attr.add(value));
        add(__dependsOnSchema,attr);
        return(attr);
    }

    /**
     * Returns the number of values in dependsOnSchema
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getDependsOnSchemaSize(){
        DmcAttribute<?> attr = get(__dependsOnSchema);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a dependsOnSchema value.
     * @param value The String to be deleted from set of attribute values.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:960)
    public DmcAttribute<?> delDependsOnSchema(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__dependsOnSchema);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(__dependsOnSchema), value);
        else
            attr = del(__dependsOnSchema, value);
        
        return(attr);
    }

    /**
     * Deletes a dependsOnSchema from the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:976)
    public DmcAttribute<?> delDependsOnSchema(String value) {
        DmcAttribute<?> attr = get(__dependsOnSchema);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(__dependsOnSchema), value);
        else
            attr = del(__dependsOnSchema, value);
        
        return(attr);
    }

    /**
     * Removes the dependsOnSchema attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remDependsOnSchema(){
         rem(__dependsOnSchema);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:802)
    public Iterator<String> getDependsOnPlugin(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(__dependsOnPlugin);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:814)
    public String getNthDependsOnPlugin(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(__dependsOnPlugin);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another dependsOnPlugin to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:827)
    public DmcAttribute<?> addDependsOnPlugin(String value) {
        DmcAttribute<?> attr = get(__dependsOnPlugin);
        if (attr == null)
            attr = new DmcTypeStringMV(__dependsOnPlugin);
        
        try{
            setLastValue(attr.add(value));
            add(__dependsOnPlugin,attr);
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
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:869)
    public boolean dependsOnPluginContains(String value) {
        DmcAttribute<?> attr = get(__dependsOnPlugin);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another dependsOnPlugin value.
     * @param value A value compatible with String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addDependsOnPlugin(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__dependsOnPlugin);
        if (attr == null)
            attr = new DmcTypeStringMV(__dependsOnPlugin);
        
        setLastValue(attr.add(value));
        add(__dependsOnPlugin,attr);
        return(attr);
    }

    /**
     * Returns the number of values in dependsOnPlugin
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getDependsOnPluginSize(){
        DmcAttribute<?> attr = get(__dependsOnPlugin);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a dependsOnPlugin value.
     * @param value The String to be deleted from set of attribute values.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:960)
    public DmcAttribute<?> delDependsOnPlugin(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__dependsOnPlugin);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(__dependsOnPlugin), value);
        else
            attr = del(__dependsOnPlugin, value);
        
        return(attr);
    }

    /**
     * Deletes a dependsOnPlugin from the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:976)
    public DmcAttribute<?> delDependsOnPlugin(String value) {
        DmcAttribute<?> attr = get(__dependsOnPlugin);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(__dependsOnPlugin), value);
        else
            attr = del(__dependsOnPlugin, value);
        
        return(attr);
    }

    /**
     * Removes the dependsOnPlugin attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remDependsOnPlugin(){
         rem(__dependsOnPlugin);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public CamelCaseName getPluginName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(__pluginName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets pluginName to the specified value.
     * @param value CamelCaseName
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setPluginName(CamelCaseName value) {
        DmcAttribute<?> attr = get(__pluginName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(__pluginName);
        
        try{
            attr.set(value);
            set(__pluginName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets pluginName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setPluginName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__pluginName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(__pluginName);
        
        attr.set(value);
        set(__pluginName,attr);
    }

    /**
     * Removes the pluginName attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remPluginName(){
         rem(__pluginName);
    }




}

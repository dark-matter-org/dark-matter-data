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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:321)
import java.io.Serializable;                                       // Always required
import java.util.*;                                                // Always required
import org.dmd.dmc.DmcAttribute;                                   // Any attributes
import org.dmd.dmc.DmcNamedObjectIF;                               // Named object
import org.dmd.dmc.DmcObject;                                      // Structural class
import org.dmd.dmc.DmcSliceInfo;                                   // Required for object slicing
import org.dmd.dmc.DmcValueException;                              // Any attributes
import org.dmd.dmc.types.CamelCaseName;                            // Naming attribute type
import org.dmd.dms.generated.dmo.MetaDMSAG;                        // Attribute from meta schema
import org.dmd.dms.generated.types.DmcTypeBooleanSV;               // Required type
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;         // Required type
import org.dmd.dms.generated.types.DmcTypeIntegerSV;               // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringSV;                // Required type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The PluginConfig is used to specify a plugin to be loaded into the DMP
 * Servlet Reference Implementation servlet.
 * <P>
 * Generated from the dmp.server schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class PluginConfigDMO  extends DmcObject  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "PluginConfig";

    public final static DmcClassInfo classInfo = DmpServerDMSAG.__PluginConfig;

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public PluginConfigDMO() {
        super("PluginConfig");
    }

    protected PluginConfigDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public PluginConfigDMO getNew(){
        PluginConfigDMO rc = new PluginConfigDMO();
        return(rc);
    }

    @Override
    public PluginConfigDMO getSlice(DmcSliceInfo info){
        PluginConfigDMO rc = new PluginConfigDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public PluginConfigDMO(DmcTypeModifierMV mods) {
        super("PluginConfig");
        modrec(true);
        setModifier(mods);
    }

    public PluginConfigDMO getModificationRecorder(){
        PluginConfigDMO rc = new PluginConfigDMO();
        rc.setCamelCaseName(getCamelCaseName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:735)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__camelCaseName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__camelCaseName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof PluginConfigDMO){
            return( getObjectName().equals( ((PluginConfigDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public Integer getStartOrder(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(DmpServerDMSAG.__startOrder);
        if (attr == null)
            return(5);

        return(attr.getSV());
    }

    /**
     * Sets startOrder to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
    public void setStartOrder(Integer value) {
        DmcAttribute<?> attr = get(DmpServerDMSAG.__startOrder);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmpServerDMSAG.__startOrder);
        
        try{
            attr.set(value);
            set(DmpServerDMSAG.__startOrder,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets startOrder to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setStartOrder(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpServerDMSAG.__startOrder);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmpServerDMSAG.__startOrder);
        
        attr.set(value);
        set(DmpServerDMSAG.__startOrder,attr);
    }

    /**
     * Removes the startOrder attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remStartOrder(){
         rem(DmpServerDMSAG.__startOrder);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public Boolean isRunnable(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(DmpServerDMSAG.__runnable);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets runnable to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
    public void setRunnable(Boolean value) {
        DmcAttribute<?> attr = get(DmpServerDMSAG.__runnable);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpServerDMSAG.__runnable);
        
        try{
            attr.set(value);
            set(DmpServerDMSAG.__runnable,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets runnable to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setRunnable(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpServerDMSAG.__runnable);
        if (attr == null)
            attr = new DmcTypeBooleanSV(DmpServerDMSAG.__runnable);
        
        attr.set(value);
        set(DmpServerDMSAG.__runnable,attr);
    }

    /**
     * Removes the runnable attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remRunnable(){
         rem(DmpServerDMSAG.__runnable);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public String getDescription(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
    public void setDescription(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__description);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__description,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__description);
        
        attr.set(value);
        set(MetaDMSAG.__description,attr);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remDescription(){
         rem(MetaDMSAG.__description);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public Integer getLineNumber(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaDMSAG.__lineNumber);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
    public void setLineNumber(Integer value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__lineNumber);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__lineNumber,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setLineNumber(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__lineNumber);
        
        attr.set(value);
        set(MetaDMSAG.__lineNumber,attr);
    }

    /**
     * Removes the lineNumber attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remLineNumber(){
         rem(MetaDMSAG.__lineNumber);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public String getFile(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__file);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets file to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
    public void setFile(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__file);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__file,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setFile(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__file);
        
        attr.set(value);
        set(MetaDMSAG.__file,attr);
    }

    /**
     * Removes the file attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remFile(){
         rem(MetaDMSAG.__file);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public CamelCaseName getCamelCaseName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MetaDMSAG.__camelCaseName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
    public void setCamelCaseName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__camelCaseName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MetaDMSAG.__camelCaseName);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__camelCaseName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setCamelCaseName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__camelCaseName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MetaDMSAG.__camelCaseName);
        
        attr.set(value);
        set(MetaDMSAG.__camelCaseName,attr);
    }

    /**
     * Removes the camelCaseName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remCamelCaseName(){
         rem(MetaDMSAG.__camelCaseName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public CamelCaseName getPluginName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(DmpServerDMSAG.__pluginName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets pluginName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
    public void setPluginName(CamelCaseName value) {
        DmcAttribute<?> attr = get(DmpServerDMSAG.__pluginName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(DmpServerDMSAG.__pluginName);
        
        try{
            attr.set(value);
            set(DmpServerDMSAG.__pluginName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets pluginName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setPluginName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpServerDMSAG.__pluginName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(DmpServerDMSAG.__pluginName);
        
        attr.set(value);
        set(DmpServerDMSAG.__pluginName,attr);
    }

    /**
     * Removes the pluginName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remPluginName(){
         rem(DmpServerDMSAG.__pluginName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public String getPluginClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmpServerDMSAG.__pluginClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets pluginClass to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
    public void setPluginClass(String value) {
        DmcAttribute<?> attr = get(DmpServerDMSAG.__pluginClass);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpServerDMSAG.__pluginClass);
        
        try{
            attr.set(value);
            set(DmpServerDMSAG.__pluginClass,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets pluginClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setPluginClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpServerDMSAG.__pluginClass);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpServerDMSAG.__pluginClass);
        
        attr.set(value);
        set(DmpServerDMSAG.__pluginClass,attr);
    }

    /**
     * Removes the pluginClass attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remPluginClass(){
         rem(DmpServerDMSAG.__pluginClass);
    }




}

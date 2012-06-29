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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:372)
import java.io.Serializable;                                                      // Always required - (GenUtility.java:201)
import java.util.*;                                                               // Always required if we have any MV attributes - (GenUtility.java:197)
import org.dmd.dmc.DmcAttribute;                                                  // Any attributes - (GenUtility.java:217)
import org.dmd.dmc.DmcNamedObjectIF;                                              // Named object - (GenUtility.java:352)
import org.dmd.dmc.DmcObject;                                                     // Structural class - (GenUtility.java:328)
import org.dmd.dmc.DmcOmni;                                                       // Lazy resolution - (GenUtility.java:297)
import org.dmd.dmc.DmcValueException;                                             // Any attributes - (GenUtility.java:218)
import org.dmd.dmc.types.CamelCaseName;                                           // Naming attribute type - (GenUtility.java:347)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                       // Attribute from meta schema - (GenUtility.java:176)
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                        // Required type - (GenUtility.java:305)
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                              // Required type - (GenUtility.java:305)
import org.dmd.dms.generated.types.DmcTypeStringSV;                               // Required type - (GenUtility.java:305)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ModuleDMO;                    // Type specific set/add - (GenUtility.java:284)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeModuleREFSV;         // Reference type - (GenUtility.java:277)
import org.dmd.mvw.tools.mvwgenerator.generated.types.ModuleREF;                  // Helper class - (GenUtility.java:312)

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The MvwDefinition class provide a common base for all MVW definition
 * classes.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
abstract public class MvwDefinitionDMO  extends DmcObject  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "MvwDefinition";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public MvwDefinitionDMO() {
        super("MvwDefinition");
    }

    protected MvwDefinitionDMO(String oc) {
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
        if (obj instanceof MvwDefinitionDMO){
            return( getObjectName().equals( ((MvwDefinitionDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public int hashCode(){
        CamelCaseName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:755)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:848)
    public void setFile(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MetaDMSAG.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__file);
        
        attr.set(value);
        set(MetaDMSAG.__file,attr);
    }

    /**
     * Removes the file attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:868)
    public void remFile(){
         rem(MetaDMSAG.__file);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:755)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:848)
    public void setLineNumber(Object value) throws DmcValueException {
        DmcTypeIntegerSV attr  = (DmcTypeIntegerSV) get(MetaDMSAG.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__lineNumber);
        
        attr.set(value);
        set(MetaDMSAG.__lineNumber,attr);
    }

    /**
     * Removes the lineNumber attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:868)
    public void remLineNumber(){
         rem(MetaDMSAG.__lineNumber);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:755)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:848)
    public void setDescription(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__description);
        
        attr.set(value);
        set(MetaDMSAG.__description,attr);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:868)
    public void remDescription(){
         rem(MetaDMSAG.__description);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:755)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:848)
    public void setCamelCaseName(Object value) throws DmcValueException {
        DmcTypeCamelCaseNameSV attr  = (DmcTypeCamelCaseNameSV) get(MetaDMSAG.__camelCaseName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MetaDMSAG.__camelCaseName);
        
        attr.set(value);
        set(MetaDMSAG.__camelCaseName,attr);
    }

    /**
     * Removes the camelCaseName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:868)
    public void remCamelCaseName(){
         rem(MetaDMSAG.__camelCaseName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:626)
    public ModuleREF getDefinedInModule(){
        DmcTypeModuleREFSV attr = (DmcTypeModuleREFSV) get(MvwDMSAG.__definedInModule);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getSV());
    }

    /**
     * Returns the reference to Module without attempting lazy resolution (if turned on).
     */
    public ModuleREF getDefinedInModuleREF(){
        DmcTypeModuleREFSV attr = (DmcTypeModuleREFSV) get(MvwDMSAG.__definedInModule);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets definedInModule to the specified value.
     * @param value ModuleDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
    public void setDefinedInModule(ModuleDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__definedInModule);
        if (attr == null)
            attr = new DmcTypeModuleREFSV(MvwDMSAG.__definedInModule);
        else
            ((DmcTypeModuleREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(MvwDMSAG.__definedInModule,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets definedInModule to the specified value.
     * @param value A value compatible with DmcTypeModuleREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:848)
    public void setDefinedInModule(Object value) throws DmcValueException {
        DmcTypeModuleREFSV attr  = (DmcTypeModuleREFSV) get(MvwDMSAG.__definedInModule);
        if (attr == null)
            attr = new DmcTypeModuleREFSV(MvwDMSAG.__definedInModule);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(MvwDMSAG.__definedInModule,attr);
    }

    /**
     * Removes the definedInModule attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:868)
    public void remDefinedInModule(){
         rem(MvwDMSAG.__definedInModule);
    }




}

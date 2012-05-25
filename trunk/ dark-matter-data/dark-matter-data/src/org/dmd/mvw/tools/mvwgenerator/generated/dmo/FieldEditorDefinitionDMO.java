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
import java.io.Serializable;                                                  // Always required - (GenUtility.java:197)
import java.util.*;                                                           // Always required if we have any MV attributes - (GenUtility.java:193)
import org.dmd.dmc.DmcAttribute;                                              // Any attributes - (GenUtility.java:213)
import org.dmd.dmc.DmcNamedObjectIF;                                          // Named object - (GenUtility.java:348)
import org.dmd.dmc.DmcSliceInfo;                                              // Required for object slicing - (GenUtility.java:202)
import org.dmd.dmc.DmcValueException;                                         // Any attributes - (GenUtility.java:214)
import org.dmd.dmc.types.CamelCaseName;                                       // Naming attribute type - (GenUtility.java:343)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                   // Required for MODREC constructor - (GenUtility.java:201)
import org.dmd.dms.generated.types.DmcTypeBooleanSV;                          // Required type - (GenUtility.java:301)
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                    // Required type - (GenUtility.java:301)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                         // Required for MODREC constructor - (GenUtility.java:200)
import org.dmd.dms.generated.types.DmcTypeStringSV;                           // Required type - (GenUtility.java:301)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;         // Base class - (GenUtility.java:328)

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The FieldEditor class allows for the definition of implementation specific
 * field editors. The specified class must implement the
 * org.dmd.dmc.DmcPresentationIF interface so that it can be initialized by
 * the FormBinder that is generated for each FormBindingDefinition instance
 * and so that it can interact with the AttributeTracker and the
 * SetRequestGenerator. <p/> When dealing with indexed attributes, the
 * default behaviour is to create a form binding with an editor instance for
 * each index slot. However, in some cases, you want to use a single complex
 * editor that handles the attribute. By setting useSingleEditor to true, the
 * form binding will contain a single editor for an indexed attribute.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class FieldEditorDefinitionDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "FieldEditorDefinition";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public FieldEditorDefinitionDMO() {
        super("FieldEditorDefinition");
    }

    protected FieldEditorDefinitionDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public FieldEditorDefinitionDMO getNew(){
        FieldEditorDefinitionDMO rc = new FieldEditorDefinitionDMO();
        return(rc);
    }

    @Override
    public FieldEditorDefinitionDMO getSlice(DmcSliceInfo info){
        FieldEditorDefinitionDMO rc = new FieldEditorDefinitionDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public FieldEditorDefinitionDMO(DmcTypeModifierMV mods) {
        super("FieldEditorDefinition");
        modrec(true);
        setModifier(mods);
    }

    public FieldEditorDefinitionDMO getModificationRecorder(){
        FieldEditorDefinitionDMO rc = new FieldEditorDefinitionDMO();
        rc.setEditorName(getEditorName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:744)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__editorName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__editorName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof FieldEditorDefinitionDMO){
            return( getObjectName().equals( ((FieldEditorDefinitionDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public int hashCode(){
        CamelCaseName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:748)
    public Boolean isUseSingleEditor(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MvwDMSAG.__useSingleEditor);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets useSingleEditor to the specified value.
     * @param value Boolean
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:788)
    public void setUseSingleEditor(Boolean value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__useSingleEditor);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__useSingleEditor);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__useSingleEditor,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets useSingleEditor to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:841)
    public void setUseSingleEditor(Object value) throws DmcValueException {
        DmcTypeBooleanSV attr  = (DmcTypeBooleanSV) get(MvwDMSAG.__useSingleEditor);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MvwDMSAG.__useSingleEditor);
        
        attr.set(value);
        set(MvwDMSAG.__useSingleEditor,attr);
    }

    /**
     * Removes the useSingleEditor attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:861)
    public void remUseSingleEditor(){
         rem(MvwDMSAG.__useSingleEditor);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:748)
    public CamelCaseName getEditorName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__editorName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets editorName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:788)
    public void setEditorName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__editorName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__editorName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__editorName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets editorName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:841)
    public void setEditorName(Object value) throws DmcValueException {
        DmcTypeCamelCaseNameSV attr  = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__editorName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__editorName);
        
        attr.set(value);
        set(MvwDMSAG.__editorName,attr);
    }

    /**
     * Removes the editorName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:861)
    public void remEditorName(){
         rem(MvwDMSAG.__editorName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:748)
    public String getUseClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MvwDMSAG.__useClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets useClass to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:788)
    public void setUseClass(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__useClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__useClass);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__useClass,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets useClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:841)
    public void setUseClass(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MvwDMSAG.__useClass);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__useClass);
        
        attr.set(value);
        set(MvwDMSAG.__useClass,attr);
    }

    /**
     * Removes the useClass attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:861)
    public void remUseClass(){
         rem(MvwDMSAG.__useClass);
    }




}

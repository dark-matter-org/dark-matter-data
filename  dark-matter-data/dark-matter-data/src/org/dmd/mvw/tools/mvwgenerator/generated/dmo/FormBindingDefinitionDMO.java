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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:323)
import java.io.Serializable;                                                      // Always required
import java.util.*;                                                               // Always required
import org.dmd.dmc.DmcAttribute;                                                  // Any attributes
import org.dmd.dmc.DmcNamedObjectIF;                                              // Named object
import org.dmd.dmc.DmcOmni;                                                       // Lazy resolution
import org.dmd.dmc.DmcSliceInfo;                                                  // Required for object slicing
import org.dmd.dmc.DmcValueException;                                             // Any attributes
import org.dmd.dmc.types.CamelCaseName;                                           // Naming attribute type
import org.dmd.dms.generated.dmo.ClassDefinitionDMO;                              // Type specific set/add
import org.dmd.dms.generated.dmo.MetaDMSAG;                                       // Required for MODREC constructor
import org.dmd.dms.generated.types.ClassDefinitionREF;                            // Helper class
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                        // Required type
import org.dmd.dms.generated.types.DmcTypeClassDefinitionREFSV;                   // Reference type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                             // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;             // Base class
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeEditFieldSV;         // Required type
import org.dmd.mvw.tools.mvwgenerator.types.EditField;                            // Primitive type and !auxiliary class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The FormBinding class allows for the definition of bindings between DMO
 * attributes and the editors that will be used to display and edit their
 * values.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class FormBindingDefinitionDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "FormBindingDefinition";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public FormBindingDefinitionDMO() {
        super("FormBindingDefinition");
    }

    protected FormBindingDefinitionDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public FormBindingDefinitionDMO getNew(){
        FormBindingDefinitionDMO rc = new FormBindingDefinitionDMO();
        return(rc);
    }

    @Override
    public FormBindingDefinitionDMO getSlice(DmcSliceInfo info){
        FormBindingDefinitionDMO rc = new FormBindingDefinitionDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public FormBindingDefinitionDMO(DmcTypeModifierMV mods) {
        super("FormBindingDefinition");
        modrec(true);
        setModifier(mods);
    }

    public FormBindingDefinitionDMO getModificationRecorder(){
        FormBindingDefinitionDMO rc = new FormBindingDefinitionDMO();
        rc.setBindingName(getBindingName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:736)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__bindingName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__bindingName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof FormBindingDefinitionDMO){
            return( getObjectName().equals( ((FormBindingDefinitionDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:644)
    public CamelCaseName getBindingName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__bindingName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets bindingName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:682)
    public void setBindingName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__bindingName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__bindingName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__bindingName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets bindingName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:734)
    public void setBindingName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__bindingName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__bindingName);
        
        attr.set(value);
        set(MvwDMSAG.__bindingName,attr);
    }

    /**
     * Removes the bindingName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:749)
    public void remBindingName(){
         rem(MvwDMSAG.__bindingName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:574)
    public ClassDefinitionREF getEditObject(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) get(MvwDMSAG.__editObject);
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
     * Returns the reference to ClassDefinition without attempting lazy resolution (if turned on).
     */
    public ClassDefinitionREF getEditObjectREF(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) get(MvwDMSAG.__editObject);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets editObject to the specified value.
     * @param value ClassDefinitionDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:627)
    public void setEditObject(ClassDefinitionDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__editObject);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSV(MvwDMSAG.__editObject);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__editObject,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets editObject to the specified value.
     * @param value A value compatible with DmcTypeClassDefinitionREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:734)
    public void setEditObject(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__editObject);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSV(MvwDMSAG.__editObject);
        
        attr.set(value);
        set(MvwDMSAG.__editObject,attr);
    }

    /**
     * Removes the editObject attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:749)
    public void remEditObject(){
         rem(MvwDMSAG.__editObject);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:644)
    public EditField getEditField(){
        DmcTypeEditFieldSV attr = (DmcTypeEditFieldSV) get(MvwDMSAG.__editField);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets editField to the specified value.
     * @param value EditField
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:682)
    public void setEditField(EditField value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__editField);
        if (attr == null)
            attr = new DmcTypeEditFieldSV(MvwDMSAG.__editField);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__editField,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets editField to the specified value.
     * @param value A value compatible with DmcTypeEditFieldSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:734)
    public void setEditField(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__editField);
        if (attr == null)
            attr = new DmcTypeEditFieldSV(MvwDMSAG.__editField);
        
        attr.set(value);
        set(MvwDMSAG.__editField,attr);
    }

    /**
     * Removes the editField attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:749)
    public void remEditField(){
         rem(MvwDMSAG.__editField);
    }




}
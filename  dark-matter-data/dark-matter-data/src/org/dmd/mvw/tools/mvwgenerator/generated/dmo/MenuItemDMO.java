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
import java.io.Serializable;                                                             // Always required - (GenUtility.java:197)
import java.util.*;                                                                      // Always required if we have any MV attributes - (GenUtility.java:193)
import org.dmd.dmc.DmcAttribute;                                                         // Any attributes - (GenUtility.java:213)
import org.dmd.dmc.DmcNamedObjectIF;                                                     // Named object - (GenUtility.java:348)
import org.dmd.dmc.DmcOmni;                                                              // Lazy resolution - (GenUtility.java:293)
import org.dmd.dmc.DmcSliceInfo;                                                         // Required for object slicing - (GenUtility.java:202)
import org.dmd.dmc.DmcValueException;                                                    // Any attributes - (GenUtility.java:214)
import org.dmd.dmc.types.CamelCaseName;                                                  // Naming attribute type - (GenUtility.java:343)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                              // Required for MODREC constructor - (GenUtility.java:201)
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                               // Required type - (GenUtility.java:301)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                    // Required for MODREC constructor - (GenUtility.java:200)
import org.dmd.dms.generated.types.DmcTypeStringSV;                                      // Required type - (GenUtility.java:301)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ActionBindingDMO;                    // Type specific set/add - (GenUtility.java:280)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuDMO;                             // Type specific set/add - (GenUtility.java:280)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuElementDefinitionDMO;            // Base class - (GenUtility.java:328)
import org.dmd.mvw.tools.mvwgenerator.generated.types.ActionBindingREF;                  // Helper class - (GenUtility.java:308)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeActionBindingREFSV;         // Reference type - (GenUtility.java:273)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeMenuREFSV;                  // Reference type - (GenUtility.java:273)
import org.dmd.mvw.tools.mvwgenerator.generated.types.MenuREF;                           // Helper class - (GenUtility.java:308)

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The MenuItem is used to define triggerable menu items. You must specify
 * either a displayLabel or a displayLabelI18N to indicate the label to be
 * used for the menu item.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class MenuItemDMO  extends MenuElementDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "MenuItem";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public MenuItemDMO() {
        super("MenuItem");
    }

    protected MenuItemDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public MenuItemDMO getNew(){
        MenuItemDMO rc = new MenuItemDMO();
        return(rc);
    }

    @Override
    public MenuItemDMO getSlice(DmcSliceInfo info){
        MenuItemDMO rc = new MenuItemDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public MenuItemDMO(DmcTypeModifierMV mods) {
        super("MenuItem");
        modrec(true);
        setModifier(mods);
    }

    public MenuItemDMO getModificationRecorder(){
        MenuItemDMO rc = new MenuItemDMO();
        rc.setElementName(getElementName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:744)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__elementName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__elementName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof MenuItemDMO){
            return( getObjectName().equals( ((MenuItemDMO) obj).getObjectName()) );
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
    public String getDisplayLabel(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MvwDMSAG.__displayLabel);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets displayLabel to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:788)
    public void setDisplayLabel(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__displayLabel);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__displayLabel);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__displayLabel,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets displayLabel to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:841)
    public void setDisplayLabel(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MvwDMSAG.__displayLabel);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__displayLabel);
        
        attr.set(value);
        set(MvwDMSAG.__displayLabel,attr);
    }

    /**
     * Removes the displayLabel attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:861)
    public void remDisplayLabel(){
         rem(MvwDMSAG.__displayLabel);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:748)
    public String getDisplayLabelI18N(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MvwDMSAG.__displayLabelI18N);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets displayLabelI18N to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:788)
    public void setDisplayLabelI18N(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__displayLabelI18N);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__displayLabelI18N);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__displayLabelI18N,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets displayLabelI18N to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:841)
    public void setDisplayLabelI18N(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MvwDMSAG.__displayLabelI18N);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__displayLabelI18N);
        
        attr.set(value);
        set(MvwDMSAG.__displayLabelI18N,attr);
    }

    /**
     * Removes the displayLabelI18N attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:861)
    public void remDisplayLabelI18N(){
         rem(MvwDMSAG.__displayLabelI18N);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:748)
    public String getUseImpl(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MvwDMSAG.__useImpl);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets useImpl to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:788)
    public void setUseImpl(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__useImpl);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__useImpl);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__useImpl,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets useImpl to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:841)
    public void setUseImpl(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MvwDMSAG.__useImpl);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__useImpl);
        
        attr.set(value);
        set(MvwDMSAG.__useImpl,attr);
    }

    /**
     * Removes the useImpl attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:861)
    public void remUseImpl(){
         rem(MvwDMSAG.__useImpl);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:748)
    public CamelCaseName getElementName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__elementName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets elementName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:788)
    public void setElementName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__elementName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__elementName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__elementName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets elementName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:841)
    public void setElementName(Object value) throws DmcValueException {
        DmcTypeCamelCaseNameSV attr  = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__elementName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__elementName);
        
        attr.set(value);
        set(MvwDMSAG.__elementName,attr);
    }

    /**
     * Removes the elementName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:861)
    public void remElementName(){
         rem(MvwDMSAG.__elementName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:619)
    public ActionBindingREF getTriggersAction(){
        DmcTypeActionBindingREFSV attr = (DmcTypeActionBindingREFSV) get(MvwDMSAG.__triggersAction);
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
     * Returns the reference to ActionBinding without attempting lazy resolution (if turned on).
     */
    public ActionBindingREF getTriggersActionREF(){
        DmcTypeActionBindingREFSV attr = (DmcTypeActionBindingREFSV) get(MvwDMSAG.__triggersAction);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets triggersAction to the specified value.
     * @param value ActionBindingDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:673)
    public void setTriggersAction(ActionBindingDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__triggersAction);
        if (attr == null)
            attr = new DmcTypeActionBindingREFSV(MvwDMSAG.__triggersAction);
        else
            ((DmcTypeActionBindingREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(MvwDMSAG.__triggersAction,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets triggersAction to the specified value.
     * @param value A value compatible with DmcTypeActionBindingREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:841)
    public void setTriggersAction(Object value) throws DmcValueException {
        DmcTypeActionBindingREFSV attr  = (DmcTypeActionBindingREFSV) get(MvwDMSAG.__triggersAction);
        if (attr == null)
            attr = new DmcTypeActionBindingREFSV(MvwDMSAG.__triggersAction);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(MvwDMSAG.__triggersAction,attr);
    }

    /**
     * Removes the triggersAction attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:861)
    public void remTriggersAction(){
         rem(MvwDMSAG.__triggersAction);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:619)
    public MenuREF getAddToMenu(){
        DmcTypeMenuREFSV attr = (DmcTypeMenuREFSV) get(MvwDMSAG.__addToMenu);
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
     * Returns the reference to Menu without attempting lazy resolution (if turned on).
     */
    public MenuREF getAddToMenuREF(){
        DmcTypeMenuREFSV attr = (DmcTypeMenuREFSV) get(MvwDMSAG.__addToMenu);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets addToMenu to the specified value.
     * @param value MenuDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:673)
    public void setAddToMenu(MenuDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__addToMenu);
        if (attr == null)
            attr = new DmcTypeMenuREFSV(MvwDMSAG.__addToMenu);
        else
            ((DmcTypeMenuREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(MvwDMSAG.__addToMenu,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets addToMenu to the specified value.
     * @param value A value compatible with DmcTypeMenuREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:841)
    public void setAddToMenu(Object value) throws DmcValueException {
        DmcTypeMenuREFSV attr  = (DmcTypeMenuREFSV) get(MvwDMSAG.__addToMenu);
        if (attr == null)
            attr = new DmcTypeMenuREFSV(MvwDMSAG.__addToMenu);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(MvwDMSAG.__addToMenu,attr);
    }

    /**
     * Removes the addToMenu attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:861)
    public void remAddToMenu(){
         rem(MvwDMSAG.__addToMenu);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:748)
    public String getMenuOrder(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MvwDMSAG.__menuOrder);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:788)
    public void setMenuOrder(String value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__menuOrder);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__menuOrder);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__menuOrder,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets menuOrder to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:841)
    public void setMenuOrder(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MvwDMSAG.__menuOrder);
        if (attr == null)
            attr = new DmcTypeStringSV(MvwDMSAG.__menuOrder);
        
        attr.set(value);
        set(MvwDMSAG.__menuOrder,attr);
    }

    /**
     * Removes the menuOrder attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:861)
    public void remMenuOrder(){
         rem(MvwDMSAG.__menuOrder);
    }




}

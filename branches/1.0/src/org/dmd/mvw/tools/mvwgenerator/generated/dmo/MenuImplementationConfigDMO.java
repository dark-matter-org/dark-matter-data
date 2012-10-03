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
import java.io.Serializable;                                                                      // Always required - (GenUtility.java:197)
import java.util.*;                                                                               // Always required if we have any MV attributes - (GenUtility.java:193)
import org.dmd.dmc.DmcAttribute;                                                                  // Any attributes - (GenUtility.java:213)
import org.dmd.dmc.DmcNamedObjectIF;                                                              // Named object - (GenUtility.java:348)
import org.dmd.dmc.DmcSliceInfo;                                                                  // Required for object slicing - (GenUtility.java:202)
import org.dmd.dmc.DmcValueException;                                                             // Any attributes - (GenUtility.java:214)
import org.dmd.dmc.types.CamelCaseName;                                                           // Naming attribute type - (GenUtility.java:343)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                                       // Required for MODREC constructor - (GenUtility.java:201)
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                                        // Required type - (GenUtility.java:301)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                             // Required for MODREC constructor - (GenUtility.java:200)
import org.dmd.dms.generated.types.DmcTypeStringSV;                                               // Required type - (GenUtility.java:301)
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;                             // Base class - (GenUtility.java:328)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeMenuElementTypeAndCommentMV;         // Required type - (GenUtility.java:301)
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeMenuElementTypeAndCommentSV;         // Required type - (GenUtility.java:301)
import org.dmd.mvw.tools.mvwgenerator.generated.types.MenuElementTypeAndComment;                  // Primitive type and !auxiliary class - (GenUtility.java:244)

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The MenuImplementationConfig is used to define the various classes that
 * will  be used to implement an actual menu structure based the MVW menu
 * definitions. <p /> The class specified by useClass must be derived from
 * org.dmd.mvw.client.mvwmenus.base.MvwMenuFactory and have a zero arg
 * constructor.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class MenuImplementationConfigDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "MenuImplementationConfig";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public MenuImplementationConfigDMO() {
        super("MenuImplementationConfig");
    }

    protected MenuImplementationConfigDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public MenuImplementationConfigDMO getNew(){
        MenuImplementationConfigDMO rc = new MenuImplementationConfigDMO();
        return(rc);
    }

    @Override
    public MenuImplementationConfigDMO getSlice(DmcSliceInfo info){
        MenuImplementationConfigDMO rc = new MenuImplementationConfigDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public MenuImplementationConfigDMO(DmcTypeModifierMV mods) {
        super("MenuImplementationConfig");
        modrec(true);
        setModifier(mods);
    }

    public MenuImplementationConfigDMO getModificationRecorder(){
        MenuImplementationConfigDMO rc = new MenuImplementationConfigDMO();
        rc.setConfigName(getConfigName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:744)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__configName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__configName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof MenuImplementationConfigDMO){
            return( getObjectName().equals( ((MenuImplementationConfigDMO) obj).getObjectName()) );
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
     * @return An Iterator of MenuElementTypeAndComment objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1079)
    public Iterator<MenuElementTypeAndComment> getAlternateMenuBar(){
        DmcTypeMenuElementTypeAndCommentMV attr = (DmcTypeMenuElementTypeAndCommentMV) get(MvwDMSAG.__alternateMenuBar);
        if (attr == null)
            return( ((List<MenuElementTypeAndComment>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth MenuElementTypeAndComment value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1091)
    public MenuElementTypeAndComment getNthAlternateMenuBar(int i){
        DmcTypeMenuElementTypeAndCommentMV attr = (DmcTypeMenuElementTypeAndCommentMV) get(MvwDMSAG.__alternateMenuBar);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another alternateMenuBar to the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1105)
    public DmcAttribute<?> addAlternateMenuBar(MenuElementTypeAndComment value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__alternateMenuBar);
        if (attr == null)
            attr = new DmcTypeMenuElementTypeAndCommentMV(MvwDMSAG.__alternateMenuBar);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__alternateMenuBar,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified MenuElementTypeAndComment.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1180)
    public boolean alternateMenuBarContains(MenuElementTypeAndComment value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__alternateMenuBar);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another alternateMenuBar value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1212)
    public DmcAttribute<?> addAlternateMenuBar(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__alternateMenuBar);
        if (attr == null)
            attr = new DmcTypeMenuElementTypeAndCommentMV(MvwDMSAG.__alternateMenuBar);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__alternateMenuBar,attr);
        return(attr);
    }

    /**
     * Returns the number of values in alternateMenuBar
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1229)
    public int getAlternateMenuBarSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__alternateMenuBar);
        if (attr == null){
            if (MvwDMSAG.__alternateMenuBar.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__alternateMenuBar.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a alternateMenuBar value.
     * @param value The MenuElementTypeAndComment to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1287)
    public DmcAttribute<?> delAlternateMenuBar(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__alternateMenuBar);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeMenuElementTypeAndCommentMV(MvwDMSAG.__alternateMenuBar), value);
        else
            attr = del(MvwDMSAG.__alternateMenuBar, value);
        
        return(attr);
    }

    /**
     * Deletes a alternateMenuBar from the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1303)
    public DmcAttribute<?> delAlternateMenuBar(MenuElementTypeAndComment value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__alternateMenuBar);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeMenuElementTypeAndCommentMV(MvwDMSAG.__alternateMenuBar), value);
        else
            attr = del(MvwDMSAG.__alternateMenuBar, value);
        
        return(attr);
    }

    /**
     * Removes the alternateMenuBar attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1322)
    public void remAlternateMenuBar(){
         rem(MvwDMSAG.__alternateMenuBar);
    }

    /**
     * @return An Iterator of MenuElementTypeAndComment objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1079)
    public Iterator<MenuElementTypeAndComment> getAlternateSubMenu(){
        DmcTypeMenuElementTypeAndCommentMV attr = (DmcTypeMenuElementTypeAndCommentMV) get(MvwDMSAG.__alternateSubMenu);
        if (attr == null)
            return( ((List<MenuElementTypeAndComment>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth MenuElementTypeAndComment value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1091)
    public MenuElementTypeAndComment getNthAlternateSubMenu(int i){
        DmcTypeMenuElementTypeAndCommentMV attr = (DmcTypeMenuElementTypeAndCommentMV) get(MvwDMSAG.__alternateSubMenu);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another alternateSubMenu to the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1105)
    public DmcAttribute<?> addAlternateSubMenu(MenuElementTypeAndComment value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__alternateSubMenu);
        if (attr == null)
            attr = new DmcTypeMenuElementTypeAndCommentMV(MvwDMSAG.__alternateSubMenu);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__alternateSubMenu,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified MenuElementTypeAndComment.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1180)
    public boolean alternateSubMenuContains(MenuElementTypeAndComment value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__alternateSubMenu);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another alternateSubMenu value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1212)
    public DmcAttribute<?> addAlternateSubMenu(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__alternateSubMenu);
        if (attr == null)
            attr = new DmcTypeMenuElementTypeAndCommentMV(MvwDMSAG.__alternateSubMenu);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__alternateSubMenu,attr);
        return(attr);
    }

    /**
     * Returns the number of values in alternateSubMenu
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1229)
    public int getAlternateSubMenuSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__alternateSubMenu);
        if (attr == null){
            if (MvwDMSAG.__alternateSubMenu.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__alternateSubMenu.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a alternateSubMenu value.
     * @param value The MenuElementTypeAndComment to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1287)
    public DmcAttribute<?> delAlternateSubMenu(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__alternateSubMenu);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeMenuElementTypeAndCommentMV(MvwDMSAG.__alternateSubMenu), value);
        else
            attr = del(MvwDMSAG.__alternateSubMenu, value);
        
        return(attr);
    }

    /**
     * Deletes a alternateSubMenu from the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1303)
    public DmcAttribute<?> delAlternateSubMenu(MenuElementTypeAndComment value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__alternateSubMenu);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeMenuElementTypeAndCommentMV(MvwDMSAG.__alternateSubMenu), value);
        else
            attr = del(MvwDMSAG.__alternateSubMenu, value);
        
        return(attr);
    }

    /**
     * Removes the alternateSubMenu attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1322)
    public void remAlternateSubMenu(){
         rem(MvwDMSAG.__alternateSubMenu);
    }

    /**
     * @return An Iterator of MenuElementTypeAndComment objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1079)
    public Iterator<MenuElementTypeAndComment> getAlternateMenuItem(){
        DmcTypeMenuElementTypeAndCommentMV attr = (DmcTypeMenuElementTypeAndCommentMV) get(MvwDMSAG.__alternateMenuItem);
        if (attr == null)
            return( ((List<MenuElementTypeAndComment>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth MenuElementTypeAndComment value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1091)
    public MenuElementTypeAndComment getNthAlternateMenuItem(int i){
        DmcTypeMenuElementTypeAndCommentMV attr = (DmcTypeMenuElementTypeAndCommentMV) get(MvwDMSAG.__alternateMenuItem);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another alternateMenuItem to the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1105)
    public DmcAttribute<?> addAlternateMenuItem(MenuElementTypeAndComment value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__alternateMenuItem);
        if (attr == null)
            attr = new DmcTypeMenuElementTypeAndCommentMV(MvwDMSAG.__alternateMenuItem);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__alternateMenuItem,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified MenuElementTypeAndComment.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1180)
    public boolean alternateMenuItemContains(MenuElementTypeAndComment value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__alternateMenuItem);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another alternateMenuItem value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1212)
    public DmcAttribute<?> addAlternateMenuItem(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__alternateMenuItem);
        if (attr == null)
            attr = new DmcTypeMenuElementTypeAndCommentMV(MvwDMSAG.__alternateMenuItem);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__alternateMenuItem,attr);
        return(attr);
    }

    /**
     * Returns the number of values in alternateMenuItem
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1229)
    public int getAlternateMenuItemSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__alternateMenuItem);
        if (attr == null){
            if (MvwDMSAG.__alternateMenuItem.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__alternateMenuItem.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a alternateMenuItem value.
     * @param value The MenuElementTypeAndComment to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1287)
    public DmcAttribute<?> delAlternateMenuItem(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__alternateMenuItem);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeMenuElementTypeAndCommentMV(MvwDMSAG.__alternateMenuItem), value);
        else
            attr = del(MvwDMSAG.__alternateMenuItem, value);
        
        return(attr);
    }

    /**
     * Deletes a alternateMenuItem from the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1303)
    public DmcAttribute<?> delAlternateMenuItem(MenuElementTypeAndComment value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__alternateMenuItem);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeMenuElementTypeAndCommentMV(MvwDMSAG.__alternateMenuItem), value);
        else
            attr = del(MvwDMSAG.__alternateMenuItem, value);
        
        return(attr);
    }

    /**
     * Removes the alternateMenuItem attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1322)
    public void remAlternateMenuItem(){
         rem(MvwDMSAG.__alternateMenuItem);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:751)
    public CamelCaseName getConfigName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__configName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets configName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:791)
    public void setConfigName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__configName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__configName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__configName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets configName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
    public void setConfigName(Object value) throws DmcValueException {
        DmcTypeCamelCaseNameSV attr  = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__configName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__configName);
        
        attr.set(value);
        set(MvwDMSAG.__configName,attr);
    }

    /**
     * Removes the configName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remConfigName(){
         rem(MvwDMSAG.__configName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:751)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:791)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remUseClass(){
         rem(MvwDMSAG.__useClass);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:751)
    public MenuElementTypeAndComment getDefaultMenuBar(){
        DmcTypeMenuElementTypeAndCommentSV attr = (DmcTypeMenuElementTypeAndCommentSV) get(MvwDMSAG.__defaultMenuBar);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets defaultMenuBar to the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:791)
    public void setDefaultMenuBar(MenuElementTypeAndComment value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__defaultMenuBar);
        if (attr == null)
            attr = new DmcTypeMenuElementTypeAndCommentSV(MvwDMSAG.__defaultMenuBar);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__defaultMenuBar,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets defaultMenuBar to the specified value.
     * @param value A value compatible with DmcTypeMenuElementTypeAndCommentSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
    public void setDefaultMenuBar(Object value) throws DmcValueException {
        DmcTypeMenuElementTypeAndCommentSV attr  = (DmcTypeMenuElementTypeAndCommentSV) get(MvwDMSAG.__defaultMenuBar);
        if (attr == null)
            attr = new DmcTypeMenuElementTypeAndCommentSV(MvwDMSAG.__defaultMenuBar);
        
        attr.set(value);
        set(MvwDMSAG.__defaultMenuBar,attr);
    }

    /**
     * Removes the defaultMenuBar attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remDefaultMenuBar(){
         rem(MvwDMSAG.__defaultMenuBar);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:751)
    public MenuElementTypeAndComment getDefaultSubMenu(){
        DmcTypeMenuElementTypeAndCommentSV attr = (DmcTypeMenuElementTypeAndCommentSV) get(MvwDMSAG.__defaultSubMenu);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets defaultSubMenu to the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:791)
    public void setDefaultSubMenu(MenuElementTypeAndComment value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__defaultSubMenu);
        if (attr == null)
            attr = new DmcTypeMenuElementTypeAndCommentSV(MvwDMSAG.__defaultSubMenu);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__defaultSubMenu,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets defaultSubMenu to the specified value.
     * @param value A value compatible with DmcTypeMenuElementTypeAndCommentSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
    public void setDefaultSubMenu(Object value) throws DmcValueException {
        DmcTypeMenuElementTypeAndCommentSV attr  = (DmcTypeMenuElementTypeAndCommentSV) get(MvwDMSAG.__defaultSubMenu);
        if (attr == null)
            attr = new DmcTypeMenuElementTypeAndCommentSV(MvwDMSAG.__defaultSubMenu);
        
        attr.set(value);
        set(MvwDMSAG.__defaultSubMenu,attr);
    }

    /**
     * Removes the defaultSubMenu attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remDefaultSubMenu(){
         rem(MvwDMSAG.__defaultSubMenu);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:751)
    public MenuElementTypeAndComment getDefaultMenuItem(){
        DmcTypeMenuElementTypeAndCommentSV attr = (DmcTypeMenuElementTypeAndCommentSV) get(MvwDMSAG.__defaultMenuItem);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets defaultMenuItem to the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:791)
    public void setDefaultMenuItem(MenuElementTypeAndComment value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__defaultMenuItem);
        if (attr == null)
            attr = new DmcTypeMenuElementTypeAndCommentSV(MvwDMSAG.__defaultMenuItem);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__defaultMenuItem,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets defaultMenuItem to the specified value.
     * @param value A value compatible with DmcTypeMenuElementTypeAndCommentSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
    public void setDefaultMenuItem(Object value) throws DmcValueException {
        DmcTypeMenuElementTypeAndCommentSV attr  = (DmcTypeMenuElementTypeAndCommentSV) get(MvwDMSAG.__defaultMenuItem);
        if (attr == null)
            attr = new DmcTypeMenuElementTypeAndCommentSV(MvwDMSAG.__defaultMenuItem);
        
        attr.set(value);
        set(MvwDMSAG.__defaultMenuItem,attr);
    }

    /**
     * Removes the defaultMenuItem attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remDefaultMenuItem(){
         rem(MvwDMSAG.__defaultMenuItem);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:751)
    public MenuElementTypeAndComment getDefaultSeparator(){
        DmcTypeMenuElementTypeAndCommentSV attr = (DmcTypeMenuElementTypeAndCommentSV) get(MvwDMSAG.__defaultSeparator);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets defaultSeparator to the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:791)
    public void setDefaultSeparator(MenuElementTypeAndComment value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__defaultSeparator);
        if (attr == null)
            attr = new DmcTypeMenuElementTypeAndCommentSV(MvwDMSAG.__defaultSeparator);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__defaultSeparator,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets defaultSeparator to the specified value.
     * @param value A value compatible with DmcTypeMenuElementTypeAndCommentSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:844)
    public void setDefaultSeparator(Object value) throws DmcValueException {
        DmcTypeMenuElementTypeAndCommentSV attr  = (DmcTypeMenuElementTypeAndCommentSV) get(MvwDMSAG.__defaultSeparator);
        if (attr == null)
            attr = new DmcTypeMenuElementTypeAndCommentSV(MvwDMSAG.__defaultSeparator);
        
        attr.set(value);
        set(MvwDMSAG.__defaultSeparator,attr);
    }

    /**
     * Removes the defaultSeparator attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:864)
    public void remDefaultSeparator(){
         rem(MvwDMSAG.__defaultSeparator);
    }




}
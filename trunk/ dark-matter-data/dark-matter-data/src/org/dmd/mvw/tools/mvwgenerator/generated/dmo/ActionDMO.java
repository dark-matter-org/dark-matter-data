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
import java.io.Serializable;                                                         // Always required
import java.util.*;                                                                  // Always required
import org.dmd.dmc.DmcAttribute;                                                     // Any attributes
import org.dmd.dmc.DmcNamedObjectIF;                                                 // Named object
import org.dmd.dmc.DmcOmni;                                                          // Lazy resolution
import org.dmd.dmc.DmcSliceInfo;                                                     // Required for object slicing
import org.dmd.dmc.DmcValueException;                                                // Any attributes
import org.dmd.dmc.types.CamelCaseName;                                              // Naming attribute type
import org.dmd.dms.generated.dmo.MetaDMSAG;                                          // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                           // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ComponentDMO;                    // Type specific set/add
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;                // Base class
import org.dmd.mvw.tools.mvwgenerator.generated.types.ComponentREF;                  // Helper class
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeComponentREFSV;         // Reference type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The Action class allows for the definition of an intermediate component
 * that binds behavioural triggers e.g. menu items, toolbar buttons etc. to
 * action implementors e.g. Controllers, Presenters and Activities. The
 * Action serves the same purpose as the com.google.gwt.user.client.Command
 * interface, but provides some additional useful functionality. The
 * implementation of the Action (see org.dmd.mvw.client.mvwmenus.base.Action)
 * maintains a set of TriggerIF interfaces, which are the various
 * implementations of the menu items, toolbar buttons etc. An implementing
 * component can enable/disable its Actions which, in turn, can
 * enable/disable its triggers.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class ActionDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "Action";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public ActionDMO() {
        super("Action");
    }

    protected ActionDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public ActionDMO getNew(){
        ActionDMO rc = new ActionDMO();
        return(rc);
    }

    @Override
    public ActionDMO getSlice(DmcSliceInfo info){
        ActionDMO rc = new ActionDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ActionDMO(DmcTypeModifierMV mods) {
        super("Action");
        modrec(true);
        setModifier(mods);
    }

    public ActionDMO getModificationRecorder(){
        ActionDMO rc = new ActionDMO();
        rc.setActionName(getActionName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:742)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__actionName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__actionName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof ActionDMO){
            return( getObjectName().equals( ((ActionDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:574)
    public ComponentREF getImplementedBy(){
        DmcTypeComponentREFSV attr = (DmcTypeComponentREFSV) get(MvwDMSAG.__implementedBy);
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
     * Returns the reference to Component without attempting lazy resolution (if turned on).
     */
    public ComponentREF getImplementedByREF(){
        DmcTypeComponentREFSV attr = (DmcTypeComponentREFSV) get(MvwDMSAG.__implementedBy);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets implementedBy to the specified value.
     * @param value ComponentDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:627)
    public void setImplementedBy(ComponentDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__implementedBy);
        if (attr == null)
            attr = new DmcTypeComponentREFSV(MvwDMSAG.__implementedBy);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__implementedBy,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets implementedBy to the specified value.
     * @param value A value compatible with DmcTypeComponentREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:734)
    public void setImplementedBy(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__implementedBy);
        if (attr == null)
            attr = new DmcTypeComponentREFSV(MvwDMSAG.__implementedBy);
        
        attr.set(value);
        set(MvwDMSAG.__implementedBy,attr);
    }

    /**
     * Removes the implementedBy attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:749)
    public void remImplementedBy(){
         rem(MvwDMSAG.__implementedBy);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:644)
    public CamelCaseName getActionName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__actionName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets actionName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:682)
    public void setActionName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__actionName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__actionName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__actionName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets actionName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:734)
    public void setActionName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__actionName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__actionName);
        
        attr.set(value);
        set(MvwDMSAG.__actionName,attr);
    }

    /**
     * Removes the actionName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:749)
    public void remActionName(){
         rem(MvwDMSAG.__actionName);
    }




}

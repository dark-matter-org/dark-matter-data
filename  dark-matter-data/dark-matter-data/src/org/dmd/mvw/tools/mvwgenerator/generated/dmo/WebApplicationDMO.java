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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:322)
import java.io.Serializable;                                                                        // Always required
import java.util.*;                                                                                 // Always required
import org.dmd.dmc.DmcAttribute;                                                                    // Any attributes
import org.dmd.dmc.DmcNamedObjectIF;                                                                // Named object
import org.dmd.dmc.DmcOmni;                                                                         // Lazy resolution
import org.dmd.dmc.DmcSliceInfo;                                                                    // Required for object slicing
import org.dmd.dmc.DmcValueException;                                                               // Any attributes
import org.dmd.dmc.types.CamelCaseName;                                                             // Naming attribute type
import org.dmd.dms.generated.dmo.MetaDMSAG;                                                         // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                                          // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                               // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ControllerDMO;                                  // Type specific set/add
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MenuImplementationConfigDMO;                    // Type specific set/add
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;                               // Base class
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.PlaceDMO;                                       // Type specific set/add
import org.dmd.mvw.tools.mvwgenerator.generated.types.ControllerREF;                                // Helper class
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeControllerREFMV;                       // Reference type
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeMenuImplementationConfigREFSV;         // Reference type
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypePlaceREFSV;                            // Reference type
import org.dmd.mvw.tools.mvwgenerator.generated.types.MenuImplementationConfigREF;                  // Helper class
import org.dmd.mvw.tools.mvwgenerator.generated.types.PlaceREF;                                     // Helper class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The WebApplication definition allows for the definition of the
 * superstructure for an application, basically it's the definition of the
 * overall application controller.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class WebApplicationDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "WebApplication";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public WebApplicationDMO() {
        super("WebApplication");
    }

    protected WebApplicationDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public WebApplicationDMO getNew(){
        WebApplicationDMO rc = new WebApplicationDMO();
        return(rc);
    }

    @Override
    public WebApplicationDMO getSlice(DmcSliceInfo info){
        WebApplicationDMO rc = new WebApplicationDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public WebApplicationDMO(DmcTypeModifierMV mods) {
        super("WebApplication");
        modrec(true);
        setModifier(mods);
    }

    public WebApplicationDMO getModificationRecorder(){
        WebApplicationDMO rc = new WebApplicationDMO();
        rc.setAppName(getAppName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:736)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__appName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__appName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof WebApplicationDMO){
            return( getObjectName().equals( ((WebApplicationDMO) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return An Iterator of ControllerDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:811)
    public Iterator<ControllerREF> getUsesController(){
        DmcTypeControllerREFMV attr = (DmcTypeControllerREFMV) get(MvwDMSAG.__usesController);
        if (attr == null)
            return( ((List<ControllerREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<ControllerREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of ControllerREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:831)
    public Iterator<ControllerREF> getUsesControllerREFs(){
        DmcTypeControllerREFMV attr = (DmcTypeControllerREFMV) get(MvwDMSAG.__usesController);
        if (attr == null)
            return( ((List<ControllerREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another usesController to the specified value.
     * @param value Controller
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:845)
    public DmcAttribute<?> addUsesController(ControllerDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__usesController);
        if (attr == null)
            attr = new DmcTypeControllerREFMV(MvwDMSAG.__usesController);
        
        try{
            setLastValue(attr.add(value));
            add(MvwDMSAG.__usesController,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another usesController value.
     * @param value A value compatible with Controller
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1078)
    public DmcAttribute<?> addUsesController(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__usesController);
        if (attr == null)
            attr = new DmcTypeControllerREFMV(MvwDMSAG.__usesController);
        
        setLastValue(attr.add(value));
        add(MvwDMSAG.__usesController,attr);
        return(attr);
    }

    /**
     * Returns the number of values in usesController
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1095)
    public int getUsesControllerSize(){
        DmcAttribute<?> attr = get(MvwDMSAG.__usesController);
        if (attr == null){
            if (MvwDMSAG.__usesController.indexSize == 0)
                return(0);
            else
                return(MvwDMSAG.__usesController.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a usesController value.
     * @param value The Controller to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1128)
    public DmcAttribute<?> delUsesController(Object value){
        DmcAttribute<?> attr = del(MvwDMSAG.__usesController, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the usesController attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1175)
    public void remUsesController(){
         rem(MvwDMSAG.__usesController);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:573)
    public MenuImplementationConfigREF getMenuImplementation(){
        DmcTypeMenuImplementationConfigREFSV attr = (DmcTypeMenuImplementationConfigREFSV) get(MvwDMSAG.__menuImplementation);
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
     * Returns the reference to MenuImplementationConfig without attempting lazy resolution (if turned on).
     */
    public MenuImplementationConfigREF getMenuImplementationREF(){
        DmcTypeMenuImplementationConfigREFSV attr = (DmcTypeMenuImplementationConfigREFSV) get(MvwDMSAG.__menuImplementation);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets menuImplementation to the specified value.
     * @param value MenuImplementationConfigDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:626)
    public void setMenuImplementation(MenuImplementationConfigDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__menuImplementation);
        if (attr == null)
            attr = new DmcTypeMenuImplementationConfigREFSV(MvwDMSAG.__menuImplementation);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__menuImplementation,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets menuImplementation to the specified value.
     * @param value A value compatible with DmcTypeMenuImplementationConfigREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:733)
    public void setMenuImplementation(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__menuImplementation);
        if (attr == null)
            attr = new DmcTypeMenuImplementationConfigREFSV(MvwDMSAG.__menuImplementation);
        
        attr.set(value);
        set(MvwDMSAG.__menuImplementation,attr);
    }

    /**
     * Removes the menuImplementation attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:748)
    public void remMenuImplementation(){
         rem(MvwDMSAG.__menuImplementation);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:643)
    public CamelCaseName getAppName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__appName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets appName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:681)
    public void setAppName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__appName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__appName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__appName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets appName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:733)
    public void setAppName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__appName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__appName);
        
        attr.set(value);
        set(MvwDMSAG.__appName,attr);
    }

    /**
     * Removes the appName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:748)
    public void remAppName(){
         rem(MvwDMSAG.__appName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:573)
    public PlaceREF getDefaultPlace(){
        DmcTypePlaceREFSV attr = (DmcTypePlaceREFSV) get(MvwDMSAG.__defaultPlace);
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
     * Returns the reference to Place without attempting lazy resolution (if turned on).
     */
    public PlaceREF getDefaultPlaceREF(){
        DmcTypePlaceREFSV attr = (DmcTypePlaceREFSV) get(MvwDMSAG.__defaultPlace);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets defaultPlace to the specified value.
     * @param value PlaceDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:626)
    public void setDefaultPlace(PlaceDMO value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__defaultPlace);
        if (attr == null)
            attr = new DmcTypePlaceREFSV(MvwDMSAG.__defaultPlace);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__defaultPlace,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets defaultPlace to the specified value.
     * @param value A value compatible with DmcTypePlaceREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:733)
    public void setDefaultPlace(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__defaultPlace);
        if (attr == null)
            attr = new DmcTypePlaceREFSV(MvwDMSAG.__defaultPlace);
        
        attr.set(value);
        set(MvwDMSAG.__defaultPlace,attr);
    }

    /**
     * Removes the defaultPlace attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:748)
    public void remDefaultPlace(){
         rem(MvwDMSAG.__defaultPlace);
    }




}

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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:281)
import java.io.Serializable;                                                          // Always required
import java.util.*;                                                                   // Always required
import org.dmd.dmc.DmcAttribute;                                                      // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                                  // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                                  // Named object
import org.dmd.dmc.DmcOmni;                                                           // Lazy resolution
import org.dmd.dmc.DmcSliceInfo;                                                      // Required for object slicing
import org.dmd.dmc.DmcValueException;                                                 // Any attributes
import org.dmd.dmc.types.CamelCaseName;                                               // Naming attribute type
import org.dmd.dms.generated.enums.DataTypeEnum;                                      // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;                                     // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                            // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                 // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ControllerDMO;                    // Type specific set/add
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;                 // Base class
import org.dmd.mvw.tools.mvwgenerator.generated.types.ControllerREF;                  // Helper class
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeControllerREFMV;         // Reference type

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
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:136)
 */
@SuppressWarnings("serial")
public class WebApplicationDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "WebApplication";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __appName = new DmcAttributeInfo("appName",833,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __camelCaseName = new DmcAttributeInfo("camelCaseName",116,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __definedInModule = new DmcAttributeInfo("definedInModule",800,"Module",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __usesController = new DmcAttributeInfo("usesController",842,"Controller",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__appName.id,__appName);
        _ImAp.put(__camelCaseName.id,__camelCaseName);
        _ImAp.put(__definedInModule.id,__definedInModule);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__usesController.id,__usesController);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__appName.name,__appName);
        _SmAp.put(__camelCaseName.name,__camelCaseName);
        _SmAp.put(__definedInModule.name,__definedInModule);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__usesController.name,__usesController);

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
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:736)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(__appName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__appName);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:745)
    public Iterator<ControllerREF> getUsesController(){
        DmcTypeControllerREFMV attr = (DmcTypeControllerREFMV) get(__usesController);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:765)
    public Iterator<ControllerREF> getUsesControllerREFs(){
        DmcTypeControllerREFMV attr = (DmcTypeControllerREFMV) get(__usesController);
        if (attr == null)
            return( ((List<ControllerREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another usesController to the specified value.
     * @param value Controller
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:780)
    public DmcAttribute<?> addUsesController(ControllerDMO value) {
        DmcAttribute<?> attr = get(__usesController);
        if (attr == null)
            attr = new DmcTypeControllerREFMV(__usesController);
        
        try{
            setLastValue(attr.add(value));
            add(__usesController,attr);
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:901)
    public DmcAttribute<?> addUsesController(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__usesController);
        if (attr == null)
            attr = new DmcTypeControllerREFMV(__usesController);
        
        setLastValue(attr.add(value));
        add(__usesController,attr);
        return(attr);
    }

    /**
     * Returns the number of values in usesController
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:918)
    public int getUsesControllerSize(){
        DmcAttribute<?> attr = get(__usesController);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * Deletes a usesController value.
     * @param value The Controller to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:948)
    public DmcAttribute<?> delUsesController(Object value){
        DmcAttribute<?> attr = del(__usesController, ((DmcNamedObjectIF)value).getObjectName());
        return(attr);
    }

    /**
     * Removes the usesController attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:995)
    public void remUsesController(){
         rem(__usesController);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public CamelCaseName getAppName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(__appName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets appName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setAppName(CamelCaseName value) {
        DmcAttribute<?> attr = get(__appName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(__appName);
        
        try{
            attr.set(value);
            set(__appName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets appName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setAppName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__appName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(__appName);
        
        attr.set(value);
        set(__appName,attr);
    }

    /**
     * Removes the appName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remAppName(){
         rem(__appName);
    }




}

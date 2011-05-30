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
import java.io.Serializable;                                                        // Always required
import java.util.*;                                                                 // Always required
import org.dmd.dmc.DmcAttribute;                                                    // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                                // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                                // Named object
import org.dmd.dmc.DmcOmni;                                                         // Lazy resolution
import org.dmd.dmc.DmcSliceInfo;                                                    // Required for object slicing
import org.dmd.dmc.DmcValueException;                                               // Any attributes
import org.dmd.dmc.types.CamelCaseName;                                             // Naming attribute type
import org.dmd.dms.generated.enums.DataTypeEnum;                                    // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;                                   // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                          // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                               // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringSV;                                 // Required type
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ActivityDMO;                    // Type specific set/add
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwDefinitionDMO;               // Base class
import org.dmd.mvw.tools.mvwgenerator.generated.types.ActivityREF;                  // Helper class
import org.dmd.mvw.tools.mvwgenerator.generated.types.DmcTypeActivityREFSV;         // Reference type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * null
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:136)
 */
@SuppressWarnings("serial")
public class DefaultPlaceDMO  extends MvwDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "DefaultPlace";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __camelCaseName = new DmcAttributeInfo("camelCaseName",116,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __definedInModule = new DmcAttributeInfo("definedInModule",800,"Module",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __placeName = new DmcAttributeInfo("placeName",853,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __placePrefix = new DmcAttributeInfo("placePrefix",854,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __runsActivity = new DmcAttributeInfo("runsActivity",855,"Activity",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__camelCaseName.id,__camelCaseName);
        _ImAp.put(__definedInModule.id,__definedInModule);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__placeName.id,__placeName);
        _ImAp.put(__placePrefix.id,__placePrefix);
        _ImAp.put(__runsActivity.id,__runsActivity);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__camelCaseName.name,__camelCaseName);
        _SmAp.put(__definedInModule.name,__definedInModule);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__placeName.name,__placeName);
        _SmAp.put(__placePrefix.name,__placePrefix);
        _SmAp.put(__runsActivity.name,__runsActivity);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public DefaultPlaceDMO() {
        super("DefaultPlace");
    }

    protected DefaultPlaceDMO(String oc) {
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
    public DefaultPlaceDMO getNew(){
        DefaultPlaceDMO rc = new DefaultPlaceDMO();
        return(rc);
    }

    @Override
    public DefaultPlaceDMO getSlice(DmcSliceInfo info){
        DefaultPlaceDMO rc = new DefaultPlaceDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public DefaultPlaceDMO(DmcTypeModifierMV mods) {
        super("DefaultPlace");
        modrec(true);
        setModifier(mods);
    }

    public DefaultPlaceDMO getModificationRecorder(){
        DefaultPlaceDMO rc = new DefaultPlaceDMO();
        rc.setPlaceName(getPlaceName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:736)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(__placeName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__placeName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof DefaultPlaceDMO){
            return( getObjectName().equals( ((DefaultPlaceDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public String getPlacePrefix(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__placePrefix);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets placePrefix to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setPlacePrefix(String value) {
        DmcAttribute<?> attr = get(__placePrefix);
        if (attr == null)
            attr = new DmcTypeStringSV(__placePrefix);
        
        try{
            attr.set(value);
            set(__placePrefix,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets placePrefix to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setPlacePrefix(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__placePrefix);
        if (attr == null)
            attr = new DmcTypeStringSV(__placePrefix);
        
        attr.set(value);
        set(__placePrefix,attr);
    }

    /**
     * Removes the placePrefix attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remPlacePrefix(){
         rem(__placePrefix);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public CamelCaseName getPlaceName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(__placeName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets placeName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setPlaceName(CamelCaseName value) {
        DmcAttribute<?> attr = get(__placeName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(__placeName);
        
        try{
            attr.set(value);
            set(__placeName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets placeName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setPlaceName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__placeName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(__placeName);
        
        attr.set(value);
        set(__placeName,attr);
    }

    /**
     * Removes the placeName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remPlaceName(){
         rem(__placeName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:513)
    public ActivityREF getRunsActivity(){
        DmcTypeActivityREFSV attr = (DmcTypeActivityREFSV) get(__runsActivity);
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
     * Returns the reference to Activity without attempting lazy resolution (if turned on).
     */
    public ActivityREF getRunsActivityREF(){
        DmcTypeActivityREFSV attr = (DmcTypeActivityREFSV) get(__runsActivity);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets runsActivity to the specified value.
     * @param value ActivityDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:566)
    public void setRunsActivity(ActivityDMO value) {
        DmcAttribute<?> attr = get(__runsActivity);
        if (attr == null)
            attr = new DmcTypeActivityREFSV(__runsActivity);
        
        try{
            attr.set(value);
            set(__runsActivity,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets runsActivity to the specified value.
     * @param value A value compatible with DmcTypeActivityREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setRunsActivity(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__runsActivity);
        if (attr == null)
            attr = new DmcTypeActivityREFSV(__runsActivity);
        
        attr.set(value);
        set(__runsActivity,attr);
    }

    /**
     * Removes the runsActivity attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remRunsActivity(){
         rem(__runsActivity);
    }




}

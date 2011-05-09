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
import java.io.Serializable;                                              // Always required
import java.util.*;                                                       // Always required
import org.dmd.dmc.DmcAttribute;                                          // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                      // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                      // Named object
import org.dmd.dmc.DmcSliceInfo;                                          // Required for object slicing
import org.dmd.dmc.DmcValueException;                                     // Any attributes
import org.dmd.dmc.types.CamelCaseName;                                   // Naming attribute type
import org.dmd.dms.generated.enums.DataTypeEnum;                          // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;                         // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                     // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringSV;                       // Required type
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.ComponentDMO;         // Base class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The DMOView provides a more structured view based on standardized DMO
 * interfaces.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:136)
 */
@SuppressWarnings("serial")
public class DMOViewDMO  extends ComponentDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "DMOView";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __camelCaseName = new DmcAttributeInfo("camelCaseName",116,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __definedInModule = new DmcAttributeInfo("definedInModule",800,"Module",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __firesEvent = new DmcAttributeInfo("firesEvent",801,"MvwEvent",ValueTypeEnum.TREEMAPPED,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __handlesEvent = new DmcAttributeInfo("handlesEvent",802,"MvwEvent",ValueTypeEnum.TREEMAPPED,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __useBaseClass = new DmcAttributeInfo("useBaseClass",807,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__camelCaseName.id,__camelCaseName);
        _ImAp.put(__definedInModule.id,__definedInModule);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__firesEvent.id,__firesEvent);
        _ImAp.put(__handlesEvent.id,__handlesEvent);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__useBaseClass.id,__useBaseClass);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__camelCaseName.name,__camelCaseName);
        _SmAp.put(__definedInModule.name,__definedInModule);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__firesEvent.name,__firesEvent);
        _SmAp.put(__handlesEvent.name,__handlesEvent);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__useBaseClass.name,__useBaseClass);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public DMOViewDMO() {
        super("DMOView");
    }

    protected DMOViewDMO(String oc) {
        super(oc);
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
    public DMOViewDMO getNew(){
        DMOViewDMO rc = new DMOViewDMO();
        return(rc);
    }

    @Override
    public DMOViewDMO getSlice(DmcSliceInfo info){
        DMOViewDMO rc = new DMOViewDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public DMOViewDMO(DmcTypeModifierMV mods) {
        super("DMOView");
        modrec(true);
        setModifier(mods);
    }

    public DMOViewDMO getModificationRecorder(){
        DMOViewDMO rc = new DMOViewDMO();
        rc.setCamelCaseName(getCamelCaseName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:729)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(__camelCaseName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__camelCaseName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof DMOViewDMO){
            return( getObjectName().equals( ((DMOViewDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public String getUseBaseClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__useBaseClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets useBaseClass to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setUseBaseClass(String value) {
        DmcAttribute<?> attr = get(__useBaseClass);
        if (attr == null)
            attr = new DmcTypeStringSV(__useBaseClass);
        
        try{
            attr.set(value);
            set(__useBaseClass,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets useBaseClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setUseBaseClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__useBaseClass);
        if (attr == null)
            attr = new DmcTypeStringSV(__useBaseClass);
        
        attr.set(value);
        set(__useBaseClass,attr);
    }

    /**
     * Removes the useBaseClass attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remUseBaseClass(){
         rem(__useBaseClass);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public CamelCaseName getCamelCaseName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(__camelCaseName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setCamelCaseName(CamelCaseName value) {
        DmcAttribute<?> attr = get(__camelCaseName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(__camelCaseName);
        
        try{
            attr.set(value);
            set(__camelCaseName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets camelCaseName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setCamelCaseName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__camelCaseName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(__camelCaseName);
        
        attr.set(value);
        set(__camelCaseName,attr);
    }

    /**
     * Removes the camelCaseName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remCamelCaseName(){
         rem(__camelCaseName);
    }




}

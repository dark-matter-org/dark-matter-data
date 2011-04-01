//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
package org.dmd.features.extgwt.generated.dmo;

// Generated from: org.dmd.dms.util.DmoFormatter.formatImports(DmoFormatter.java:606)
import java.util.*;                                                    // Always required
import org.dmd.dmc.DmcAttribute;                                       // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                   // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                   // Named object
import org.dmd.dmc.DmcValueException;                                  // Any attributes
import org.dmd.dmc.types.StringName;                                   // Naming attribute type
import org.dmd.dms.generated.enums.ValueTypeEnum;                      // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeStringNameSV;                // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                    // Required type
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;         // Base class

/**
 * null
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:131)
 */
@SuppressWarnings("serial")
public class MvcServerEventDMO  extends MvcDefinitionDMO  implements DmcNamedObjectIF  {

    public final static String constructionClassName = "MvcServerEvent";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __definedInMVCConfig = new DmcAttributeInfo("definedInMVCConfig",616,"MvcConfig",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __eventDataType = new DmcAttributeInfo("eventDataType",609,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__definedInMVCConfig.id,__definedInMVCConfig);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__eventDataType.id,__eventDataType);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__name.id,__name);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__definedInMVCConfig.name,__definedInMVCConfig);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__eventDataType.name,__eventDataType);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__name.name,__name);
    }

    public MvcServerEventDMO() {
        super("MvcServerEvent");
    }

    protected MvcServerEventDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public MvcServerEventDMO getNew(){
        MvcServerEventDMO rc = new MvcServerEventDMO();
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:677)
    public StringName getObjectName(){
        DmcAttribute<?> name = get(__name);
        if (name != null)
            return((StringName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__name);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcServerEventDMO){
            return( getObjectName().equals( ((MvcServerEventDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:599)
    public String getDescription(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:632)
    public void setDescription(String value) {
        DmcAttribute<?> attr = get(__description);
        if (attr == null)
            attr = new DmcTypeStringSV(__description);
        
        try{
            attr.set(value);
            set(__description,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:659)
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__description);
        if (attr == null)
            attr = new DmcTypeStringSV(__description);
        
        attr.set(value);
        set(__description,attr);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:674)
    public void remDescription(){
         rem(__description);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:599)
    public StringName getName(){
        DmcTypeStringNameSV attr = (DmcTypeStringNameSV) get(__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:632)
    public void setName(StringName value) {
        DmcAttribute<?> attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__name);
        
        try{
            attr.set(value);
            set(__name,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:659)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__name);
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:674)
    public void remName(){
         rem(__name);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:599)
    public String getEventDataType(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__eventDataType);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets eventDataType to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:632)
    public void setEventDataType(String value) {
        DmcAttribute<?> attr = get(__eventDataType);
        if (attr == null)
            attr = new DmcTypeStringSV(__eventDataType);
        
        try{
            attr.set(value);
            set(__eventDataType,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets eventDataType to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:659)
    public void setEventDataType(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__eventDataType);
        if (attr == null)
            attr = new DmcTypeStringSV(__eventDataType);
        
        attr.set(value);
        set(__eventDataType,attr);
    }

    /**
     * Removes the eventDataType attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:674)
    public void remEventDataType(){
         rem(__eventDataType);
    }




}

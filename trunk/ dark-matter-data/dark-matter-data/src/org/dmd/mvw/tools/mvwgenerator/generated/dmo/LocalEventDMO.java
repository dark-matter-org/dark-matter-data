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

// Generated from:  org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:281)
import java.io.Serializable;                                             // Always required
import java.util.*;                                                      // Always required
import org.dmd.dmc.DmcAttribute;                                         // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                     // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                     // Named object
import org.dmd.dmc.DmcSliceInfo;                                         // Required for object slicing
import org.dmd.dmc.DmcValueException;                                    // Any attributes
import org.dmd.dmc.types.CamelCaseName;                                  // Naming attribute type
import org.dmd.dms.generated.enums.DataTypeEnum;                         // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;                        // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;               // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.MvwEventDMO;         // Base class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The LocalEvent is fired by producers that want to define a tightly bound
 * event interface so that consumers can register just for events that the
 * producer fires.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:136)
 */
@SuppressWarnings("serial")
public class LocalEventDMO  extends MvwEventDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "LocalEvent";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __camelCaseName = new DmcAttributeInfo("camelCaseName",116,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __definedInModule = new DmcAttributeInfo("definedInModule",800,"Module",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __description = new DmcAttributeInfo("description",18,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __eventCause = new DmcAttributeInfo("eventCause",809,"CamelCaseName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __userDataImport = new DmcAttributeInfo("userDataImport",804,"String",ValueTypeEnum.TREESET,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __userDataType = new DmcAttributeInfo("userDataType",803,"String",ValueTypeEnum.MULTI,DataTypeEnum.PERSISTENT,false);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__camelCaseName.id,__camelCaseName);
        _ImAp.put(__definedInModule.id,__definedInModule);
        _ImAp.put(__description.id,__description);
        _ImAp.put(__eventCause.id,__eventCause);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__lineNumber.id,__lineNumber);
        _ImAp.put(__userDataImport.id,__userDataImport);
        _ImAp.put(__userDataType.id,__userDataType);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__camelCaseName.name,__camelCaseName);
        _SmAp.put(__definedInModule.name,__definedInModule);
        _SmAp.put(__description.name,__description);
        _SmAp.put(__eventCause.name,__eventCause);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__lineNumber.name,__lineNumber);
        _SmAp.put(__userDataImport.name,__userDataImport);
        _SmAp.put(__userDataType.name,__userDataType);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public LocalEventDMO() {
        super("LocalEvent");
    }

    protected LocalEventDMO(String oc) {
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
    public LocalEventDMO getNew(){
        LocalEventDMO rc = new LocalEventDMO();
        return(rc);
    }

    @Override
    public LocalEventDMO getSlice(DmcSliceInfo info){
        LocalEventDMO rc = new LocalEventDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public LocalEventDMO(DmcTypeModifierMV mods) {
        super("LocalEvent");
        modrec(true);
        setModifier(mods);
    }

    public LocalEventDMO getModificationRecorder(){
        LocalEventDMO rc = new LocalEventDMO(new DmcTypeModifierMV());
        rc.setEventCause(getEventCause());
        return(rc);
    }

    //  org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:728)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(__eventCause);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__eventCause);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof LocalEventDMO){
            return( getObjectName().equals( ((LocalEventDMO) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public CamelCaseName getEventCause(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(__eventCause);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets eventCause to the specified value.
     * @param value CamelCaseName
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setEventCause(CamelCaseName value) {
        DmcAttribute<?> attr = get(__eventCause);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(__eventCause);
        
        try{
            attr.set(value);
            set(__eventCause,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets eventCause to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setEventCause(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__eventCause);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(__eventCause);
        
        attr.set(value);
        set(__eventCause,attr);
    }

    /**
     * Removes the eventCause attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remEventCause(){
         rem(__eventCause);
    }




}

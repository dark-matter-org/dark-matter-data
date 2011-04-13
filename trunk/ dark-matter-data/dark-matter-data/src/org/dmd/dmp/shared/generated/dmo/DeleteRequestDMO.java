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
package org.dmd.dmp.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:270)
import java.io.Serializable;                                          // Always required
import java.util.*;                                                   // Always required
import org.dmd.dmc.DmcAttribute;                                      // Primitive type and !auxiliary class
import org.dmd.dmc.DmcAttributeInfo;                                  // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                  // Named object
import org.dmd.dmc.DmcObjectNameIF;                                   // Generic args import
import org.dmd.dmc.DmcValueException;                                 // Any attributes
import org.dmd.dmc.types.IntegerName;                                 // Naming attribute type
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                   // Base class
import org.dmd.dmp.shared.generated.enums.ScopeEnum;                  // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.types.DmcTypeScopeEnumSV;         // Required type
import org.dmd.dms.generated.enums.ValueTypeEnum;                     // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeDmcAttributeSV;             // Required type
import org.dmd.dms.generated.types.DmcTypeIntegerNameSV;              // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                 // Required for MODREC constructor

/**
 * The DeleteRequest allows you to delete one or more objects. If no scope is
 * specified, the scope is assumed to be BASE i.e. just the specific object
 * indicated by the FQN(s). The behaviour of this request is implementation
 * specific.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:129)
 */
@SuppressWarnings("serial")
public class DeleteRequestDMO  extends RequestDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "DeleteRequest";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __objName = new DmcAttributeInfo("objName",508,"DmcAttribute",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __readableFormat = new DmcAttributeInfo("readableFormat",517,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"IntegerName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __responseFormat = new DmcAttributeInfo("responseFormat",516,"ResponseFormatEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __scope = new DmcAttributeInfo("scope",511,"ScopeEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __sessionID = new DmcAttributeInfo("sessionID",502,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __timeMS = new DmcAttributeInfo("timeMS",518,"Long",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__objName.id,__objName);
        _ImAp.put(__readableFormat.id,__readableFormat);
        _ImAp.put(__requestID.id,__requestID);
        _ImAp.put(__responseFormat.id,__responseFormat);
        _ImAp.put(__scope.id,__scope);
        _ImAp.put(__sessionID.id,__sessionID);
        _ImAp.put(__timeMS.id,__timeMS);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__objName.name,__objName);
        _SmAp.put(__readableFormat.name,__readableFormat);
        _SmAp.put(__requestID.name,__requestID);
        _SmAp.put(__responseFormat.name,__responseFormat);
        _SmAp.put(__scope.name,__scope);
        _SmAp.put(__sessionID.name,__sessionID);
        _SmAp.put(__timeMS.name,__timeMS);
    }

    public DeleteRequestDMO() {
        super("DeleteRequest");
    }

    protected DeleteRequestDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public DeleteRequestDMO getNew(){
        DeleteRequestDMO rc = new DeleteRequestDMO();
        return(rc);
    }

    public DeleteRequestDMO(DmcTypeModifierMV mods) {
        super("DeleteRequest");
        modrec(true);
        setModifier(mods);
    }

    public DeleteRequestDMO getModificationRecorder(){
        DeleteRequestDMO rc = new DeleteRequestDMO(new DmcTypeModifierMV());
        rc.setRequestID(getRequestID());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:669)
    public IntegerName getObjectName(){
        DmcAttribute<?> name = get(__requestID);
        if (name != null)
            return((IntegerName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__requestID);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof DeleteRequestDMO){
            return( getObjectName().equals( ((DeleteRequestDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:558)
    @SuppressWarnings("unchecked")
    public DmcAttribute<DmcObjectNameIF> getObjName(){
        DmcTypeDmcAttributeSV attr = (DmcTypeDmcAttributeSV) get(__objName);
        if (attr == null)
            return(null);

        return((DmcAttribute<DmcObjectNameIF>)attr.getSV());
    }

    /**
     * Sets objName to the specified value.
     * @param value DmcAttribute
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:595)
    public void setObjName(DmcAttribute<DmcObjectNameIF> value) {
        DmcAttribute<?> attr = get(__objName);
        if (attr == null)
            attr = new DmcTypeDmcAttributeSV(__objName);
        
        try{
            attr.set(value);
            set(__objName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets objName to the specified value.
     * @param value A value compatible with DmcTypeDmcAttributeSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
    public void setObjName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__objName);
        if (attr == null)
            attr = new DmcTypeDmcAttributeSV(__objName);
        
        attr.set(value);
        set(__objName,attr);
    }

    /**
     * Removes the objName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:637)
    public void remObjName(){
         rem(__objName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:558)
    public ScopeEnum getScope(){
        DmcTypeScopeEnumSV attr = (DmcTypeScopeEnumSV) get(__scope);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets scope to the specified value.
     * @param value ScopeEnum
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:595)
    public void setScope(ScopeEnum value) {
        DmcAttribute<?> attr = get(__scope);
        if (attr == null)
            attr = new DmcTypeScopeEnumSV(__scope);
        
        try{
            attr.set(value);
            set(__scope,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnumSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
    public void setScope(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__scope);
        if (attr == null)
            attr = new DmcTypeScopeEnumSV(__scope);
        
        attr.set(value);
        set(__scope,attr);
    }

    /**
     * Removes the scope attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:637)
    public void remScope(){
         rem(__scope);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:558)
    public IntegerName getRequestID(){
        DmcTypeIntegerNameSV attr = (DmcTypeIntegerNameSV) get(__requestID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets requestID to the specified value.
     * @param value IntegerName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:595)
    public void setRequestID(IntegerName value) {
        DmcAttribute<?> attr = get(__requestID);
        if (attr == null)
            attr = new DmcTypeIntegerNameSV(__requestID);
        
        try{
            attr.set(value);
            set(__requestID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets requestID to the specified value.
     * @param value A value compatible with DmcTypeIntegerNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:622)
    public void setRequestID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__requestID);
        if (attr == null)
            attr = new DmcTypeIntegerNameSV(__requestID);
        
        attr.set(value);
        set(__requestID,attr);
    }

    /**
     * Removes the requestID attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:637)
    public void remRequestID(){
         rem(__requestID);
    }




}

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

// Generated from: org.dmd.dms.util.DmoFormatter.formatImports(DmoFormatter.java:713)
import java.util.*;                                                 // Always required
import org.dmd.dmc.DmcAttribute;                                    // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                // Named object
import org.dmd.dmc.DmcValueException;                               // Any attributes
import org.dmd.dmc.types.DmcTypeIntegerName;                        // Required type
import org.dmd.dmc.types.DmcTypeString;                             // Required type
import org.dmd.dmc.types.IntegerName;                               // Naming attribute type
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                 // Base class
import org.dmd.dmp.shared.generated.enums.ScopeEnum;                // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.types.DmcTypeScopeEnum;         // Required type
import org.dmd.dms.generated.enums.ValueTypeEnum;                   // Required if we have any attributes

/**
 * The DeleteRequest allows you to delete one or more objects. If no scope is
 * specified, the scope is assumed to be BASE i.e. just the specific object
 * indicated by the FQN(s). The behaviour of this request is implementation
 * specific.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:139)
 */
@SuppressWarnings("serial")
public class DeleteRequestDMO  extends RequestDMO  implements DmcNamedObjectIF  {

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __FQNList = new DmcAttributeInfo("FQNList",507,"String",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __readableFormat = new DmcAttributeInfo("readableFormat",517,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"IntegerName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __responseFormat = new DmcAttributeInfo("responseFormat",516,"ResponseFormatEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __scope = new DmcAttributeInfo("scope",511,"ScopeEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __sessionID = new DmcAttributeInfo("sessionID",502,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__FQNList.id,__FQNList);
        _ImAp.put(__readableFormat.id,__readableFormat);
        _ImAp.put(__requestID.id,__requestID);
        _ImAp.put(__responseFormat.id,__responseFormat);
        _ImAp.put(__scope.id,__scope);
        _ImAp.put(__sessionID.id,__sessionID);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__FQNList.name,__FQNList);
        _SmAp.put(__readableFormat.name,__readableFormat);
        _SmAp.put(__requestID.name,__requestID);
        _SmAp.put(__responseFormat.name,__responseFormat);
        _SmAp.put(__scope.name,__scope);
        _SmAp.put(__sessionID.name,__sessionID);
    }

    public DeleteRequestDMO() {
        super("DeleteRequest",_ImAp,_SmAp);
    }

    protected DeleteRequestDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public DeleteRequestDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public DeleteRequestDMO(DeleteRequestDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public DeleteRequestDMO getOneOfMe() {
        DeleteRequestDMO rc = new DeleteRequestDMO(this.getConstructionClassName());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:789)
    public IntegerName getObjectName(){
        DmcAttribute<?> name = get(__requestID);
        if (name != null)
            return((IntegerName)name.getSV());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof DeleteRequestDMO){
            return( getObjectName().equals( ((DeleteRequestDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:373)
    public ScopeEnum getScope(){
        DmcTypeScopeEnum attr = (DmcTypeScopeEnum) get(__scope);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets scope to the specified value.
     * @param value ScopeEnum
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:391)
    public void setScope(ScopeEnum value) {
        DmcAttribute<?> attr = get(__scope);
        if (attr == null)
            attr = new DmcTypeScopeEnum(__scope);
        
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
     * @param value A value compatible with DmcTypeScopeEnum
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:415)
    public void setScope(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__scope);
        if (attr == null)
            attr = new DmcTypeScopeEnum(__scope);
        
        attr.set(value);
        set(__scope,attr);
    }

    /**
     * Removes the scope attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:430)
    public void remScope(){
         rem(__scope);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:373)
    public IntegerName getRequestID(){
        DmcTypeIntegerName attr = (DmcTypeIntegerName) get(__requestID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets requestID to the specified value.
     * @param value IntegerName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:391)
    public void setRequestID(IntegerName value) {
        DmcAttribute<?> attr = get(__requestID);
        if (attr == null)
            attr = new DmcTypeIntegerName(__requestID);
        
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
     * @param value A value compatible with DmcTypeIntegerName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:415)
    public void setRequestID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__requestID);
        if (attr == null)
            attr = new DmcTypeIntegerName(__requestID);
        
        attr.set(value);
        set(__requestID,attr);
    }

    /**
     * Removes the requestID attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:430)
    public void remRequestID(){
         rem(__requestID);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:519)
    public Iterator<String> getFQNList(){
        DmcTypeString attr = (DmcTypeString) get(__FQNList);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * Adds another FQNList to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:534)
    public DmcAttribute<?> addFQNList(String value) {
        DmcAttribute<?> attr = get(__FQNList);
        if (attr == null)
            attr = new DmcTypeString(__FQNList);
        
        try{
            attr.add(value);
            add(__FQNList,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another FQNList value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:560)
    public DmcAttribute<?> addFQNList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__FQNList);
        if (attr == null)
            attr = new DmcTypeString(__FQNList);
        
        attr.add(value);
        add(__FQNList,attr);
        return(attr);
    }

    /**
     * Deletes a FQNList value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:627)
    public DmcAttribute<?> delFQNList(Object value) throws DmcValueException {
        DmcAttribute<?> attr = del(__FQNList, value);
        return(attr);
    }

    /**
     * Removes the FQNList attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:649)
    public void remFQNList(){
         rem(__FQNList);
    }




}

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

// Generated from: org.dmd.dms.util.DmoFormatter.formatImports(DmoFormatter.java:581)
import java.util.*;                                              // Always required
import org.dmd.dmc.DmcAttribute;                                 // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                             // Always required
import org.dmd.dmc.DmcNamedObjectIF;                             // Named object
import org.dmd.dmc.DmcObject;                                    // Primitive type and !auxiliary class
import org.dmd.dmc.DmcValueException;                            // Any attributes
import org.dmd.dmc.types.IntegerName;                            // Naming attribute type
import org.dmd.dmc.types.StringName;                             // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.dmo.RequestDMO;              // Base class
import org.dmd.dms.generated.enums.ValueTypeEnum;                // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeDmcObjectSV;           // Required type
import org.dmd.dms.generated.types.DmcTypeIntegerNameSV;         // Required type
import org.dmd.dms.generated.types.DmcTypeStringNameSV;          // Required type

/**
 * The CreateRequest allows you to create a new object. If the parentFQN is
 * specified, the object will be created beneath that parent object.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:131)
 */
@SuppressWarnings("serial")
public class CreateRequestDMO  extends RequestDMO  implements DmcNamedObjectIF  {

    public final static String constructionClassName = "CreateRequest";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __newObject = new DmcAttributeInfo("newObject",513,"DmcObject",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __parentFQN = new DmcAttributeInfo("parentFQN",85,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __readableFormat = new DmcAttributeInfo("readableFormat",517,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"IntegerName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __responseFormat = new DmcAttributeInfo("responseFormat",516,"ResponseFormatEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __sessionID = new DmcAttributeInfo("sessionID",502,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__newObject.id,__newObject);
        _ImAp.put(__parentFQN.id,__parentFQN);
        _ImAp.put(__readableFormat.id,__readableFormat);
        _ImAp.put(__requestID.id,__requestID);
        _ImAp.put(__responseFormat.id,__responseFormat);
        _ImAp.put(__sessionID.id,__sessionID);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__newObject.name,__newObject);
        _SmAp.put(__parentFQN.name,__parentFQN);
        _SmAp.put(__readableFormat.name,__readableFormat);
        _SmAp.put(__requestID.name,__requestID);
        _SmAp.put(__responseFormat.name,__responseFormat);
        _SmAp.put(__sessionID.name,__sessionID);
    }

    public CreateRequestDMO() {
        super("CreateRequest",_ImAp,_SmAp);
    }

    protected CreateRequestDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public CreateRequestDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public CreateRequestDMO(CreateRequestDMO original) {
        super(constructionClassName);
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public CreateRequestDMO getOneOfMe() {
        CreateRequestDMO rc = new CreateRequestDMO(constructionClassName);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:652)
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
        if (obj instanceof CreateRequestDMO){
            return( getObjectName().equals( ((CreateRequestDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:351)
    public StringName getParentFQN(){
        DmcTypeStringNameSV attr = (DmcTypeStringNameSV) get(__parentFQN);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets parentFQN to the specified value.
     * @param value StringName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:384)
    public void setParentFQN(StringName value) {
        DmcAttribute<?> attr = get(__parentFQN);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__parentFQN);
        
        try{
            attr.set(value);
            set(__parentFQN,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets parentFQN to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:411)
    public void setParentFQN(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__parentFQN);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__parentFQN);
        
        attr.set(value);
        set(__parentFQN,attr);
    }

    /**
     * Removes the parentFQN attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:426)
    public void remParentFQN(){
         rem(__parentFQN);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:351)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:384)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:411)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:426)
    public void remRequestID(){
         rem(__requestID);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:351)
    public DmcObject getNewObject(){
        DmcTypeDmcObjectSV attr = (DmcTypeDmcObjectSV) get(__newObject);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets newObject to the specified value.
     * @param value DmcObject
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:384)
    public void setNewObject(DmcObject value) {
        DmcAttribute<?> attr = get(__newObject);
        if (attr == null)
            attr = new DmcTypeDmcObjectSV(__newObject);
        
        try{
            attr.set(value);
            set(__newObject,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets newObject to the specified value.
     * @param value A value compatible with DmcTypeDmcObjectSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:411)
    public void setNewObject(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__newObject);
        if (attr == null)
            attr = new DmcTypeDmcObjectSV(__newObject);
        
        attr.set(value);
        set(__newObject,attr);
    }

    /**
     * Removes the newObject attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:426)
    public void remNewObject(){
         rem(__newObject);
    }




}

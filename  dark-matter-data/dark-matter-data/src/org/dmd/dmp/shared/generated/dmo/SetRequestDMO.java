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

// Generated from:  org.dmd.dms.util.DmoFormatter.formatImports(DmoFormatter.java:584)
import java.util.*;                                              // Always required
import org.dmd.dmc.DmcAttribute;                                 // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                             // Always required
import org.dmd.dmc.DmcNamedObjectIF;                             // Named object
import org.dmd.dmc.DmcValueException;                            // Any attributes
import org.dmd.dmc.types.IntegerName;                            // Naming attribute type
import org.dmd.dmc.types.Modifier;                               // Primitive type and !auxiliary class
import org.dmd.dmc.types.StringName;                             // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.dmo.RequestDMO;              // Base class
import org.dmd.dms.generated.enums.ValueTypeEnum;                // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeIntegerNameSV;         // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;            // Required type
import org.dmd.dms.generated.types.DmcTypeStringNameSV;          // Required type

/**
 * The SetRequest allows you to alter the attribute values associated with an
 * object. Like the get request, the set of attributes that can be
 * manipulated will depend on the object type that is specified.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:132)
 */
@SuppressWarnings("serial")
public class SetRequestDMO  extends RequestDMO  implements DmcNamedObjectIF  {

    public final static String constructionClassName = "SetRequest";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __FQN = new DmcAttributeInfo("FQN",84,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __modify = new DmcAttributeInfo("modify",522,"Modifier",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __readableFormat = new DmcAttributeInfo("readableFormat",517,"Boolean",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __requestID = new DmcAttributeInfo("requestID",501,"IntegerName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __responseFormat = new DmcAttributeInfo("responseFormat",516,"ResponseFormatEnum",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __sessionID = new DmcAttributeInfo("sessionID",502,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__FQN.id,__FQN);
        _ImAp.put(__modify.id,__modify);
        _ImAp.put(__readableFormat.id,__readableFormat);
        _ImAp.put(__requestID.id,__requestID);
        _ImAp.put(__responseFormat.id,__responseFormat);
        _ImAp.put(__sessionID.id,__sessionID);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__FQN.name,__FQN);
        _SmAp.put(__modify.name,__modify);
        _SmAp.put(__readableFormat.name,__readableFormat);
        _SmAp.put(__requestID.name,__requestID);
        _SmAp.put(__responseFormat.name,__responseFormat);
        _SmAp.put(__sessionID.name,__sessionID);
    }

    public SetRequestDMO() {
        super("SetRequest",_ImAp,_SmAp);
    }

    protected SetRequestDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public SetRequestDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public SetRequestDMO(SetRequestDMO original) {
        super(constructionClassName);
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public SetRequestDMO getOneOfMe() {
        SetRequestDMO rc = new SetRequestDMO(constructionClassName);
        return(rc);
    }

    //  org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:655)
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
        if (obj instanceof SetRequestDMO){
            return( getObjectName().equals( ((SetRequestDMO) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:351)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:384)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:411)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:426)
    public void remRequestID(){
         rem(__requestID);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:351)
    public StringName getFQN(){
        DmcTypeStringNameSV attr = (DmcTypeStringNameSV) get(__FQN);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets FQN to the specified value.
     * @param value StringName
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:384)
    public void setFQN(StringName value) {
        DmcAttribute<?> attr = get(__FQN);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__FQN);
        
        try{
            attr.set(value);
            set(__FQN,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:411)
    public void setFQN(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__FQN);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__FQN);
        
        attr.set(value);
        set(__FQN,attr);
    }

    /**
     * Removes the FQN attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:426)
    public void remFQN(){
         rem(__FQN);
    }

    /**
     * @return An Iterator of Modifier objects.
     */
    @SuppressWarnings("unchecked")
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:524)
    public Iterator<Modifier> getModify(){
        DmcTypeModifierMV attr = (DmcTypeModifierMV) get(__modify);
        if (attr == null)
            return( ((List<Modifier>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * Adds another modify to the specified value.
     * @param value Modifier
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:537)
    public DmcAttribute<?> addModify(Modifier value) {
        DmcAttribute<?> attr = get(__modify);
        if (attr == null)
            attr = new DmcTypeModifierMV(__modify);
        
        try{
            attr.add(value);
            add(__modify,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another modify value.
     * @param value A value compatible with Modifier
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:562)
    public DmcAttribute<?> addModify(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__modify);
        if (attr == null)
            attr = new DmcTypeModifierMV(__modify);
        
        attr.add(value);
        add(__modify,attr);
        return(attr);
    }

    /**
     * Deletes a modify value.
     * @param value The Modifier to be deleted from set of attribute values.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:624)
    public DmcAttribute<?> delModify(Object value) throws DmcValueException {
        DmcAttribute<?> attr = del(__modify, value);
        return(attr);
    }

    /**
     * Removes the modify attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:645)
    public void remModify(){
         rem(__modify);
    }




}

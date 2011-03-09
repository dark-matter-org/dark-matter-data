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

import java.util.*;

import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
// import 2
import org.dmd.dmc.DmcObject;
// import 3.2 DmcObject
import org.dmd.dmc.types.DmcTypeDmcObject;
// import 2
import org.dmd.dmc.types.StringName;
// import 3.2 StringName
import org.dmd.dmc.types.DmcTypeStringName;

// import 6
import org.dmd.dmp.shared.generated.dmo.RequestDMO;

@SuppressWarnings("serial")
/**
 * The CreateRequest allows you to create a new object. If the parentFQN is
 * specified, the object will be created beneath that parent object.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:654)
 */
public class CreateRequestDMO  extends RequestDMO  {

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
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public CreateRequestDMO getOneOfMe() {
        CreateRequestDMO rc = new CreateRequestDMO(this.getConstructionClassName());
        return(rc);
    }

    public StringName getParentFQN(){
        DmcTypeStringName attr = (DmcTypeStringName) get(__parentFQN);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets parentFQN to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    @SuppressWarnings("unchecked")
    public void setParentFQN(Object value) throws DmcValueException {
        DmcAttribute attr = get(__parentFQN);
        if (attr == null)
            attr = new DmcTypeStringName();
        
        attr.set(value);
        set(__parentFQN,attr);
    }

    /**
     * Removes the parentFQN attribute value.
     */
    public void remParentFQN(){
         rem(__parentFQN);
    }

    public DmcObject getNewObject(){
        DmcTypeDmcObject attr = (DmcTypeDmcObject) get(__newObject);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets newObject to the specified value.
     * @param value A value compatible with DmcTypeDmcObject
     */
    @SuppressWarnings("unchecked")
    public void setNewObject(Object value) throws DmcValueException {
        DmcAttribute attr = get(__newObject);
        if (attr == null)
            attr = new DmcTypeDmcObject();
        
        attr.set(value);
        set(__newObject,attr);
    }

    /**
     * Removes the newObject attribute value.
     */
    public void remNewObject(){
         rem(__newObject);
    }




}

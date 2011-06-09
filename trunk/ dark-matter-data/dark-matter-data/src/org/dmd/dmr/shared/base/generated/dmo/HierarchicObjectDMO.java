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
package org.dmd.dmr.shared.base.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:282)
import java.io.Serializable;                                            // Always required
import java.util.*;                                                     // Always required
import org.dmd.dmc.DmcAttribute;                                        // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                    // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                    // Named object
import org.dmd.dmc.DmcObject;                                           // Structural class
import org.dmd.dmc.DmcSliceInfo;                                        // Required for object slicing
import org.dmd.dmc.DmcValueException;                                   // Any attributes
import org.dmd.dmc.types.FullyQualifiedName;                            // Naming attribute type
import org.dmd.dms.generated.enums.DataTypeEnum;                        // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;                       // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeFullyQualifiedNameSV;         // Required type
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                    // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringSV;                     // Required type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * A HierarchicObject is meant to represent any object that can be identified
 * with a Fully Qualified Name (FQN) and exists in a containment relationship
 * with other objects. The exact implementation of a HierarchicObject is
 * application specific.
 * <P>
 * Generated from the dmr.base schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:132)
 */
@SuppressWarnings("serial")
public class HierarchicObjectDMO  extends DmcObject  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "HierarchicObject";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __FQN = new DmcAttributeInfo("FQN",84,"FullyQualifiedName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,false);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__FQN.id,__FQN);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__lineNumber.id,__lineNumber);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__FQN.name,__FQN);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__lineNumber.name,__lineNumber);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public HierarchicObjectDMO() {
        super("HierarchicObject");
    }

    protected HierarchicObjectDMO(String oc) {
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
    public HierarchicObjectDMO getNew(){
        HierarchicObjectDMO rc = new HierarchicObjectDMO();
        return(rc);
    }

    @Override
    public HierarchicObjectDMO getSlice(DmcSliceInfo info){
        HierarchicObjectDMO rc = new HierarchicObjectDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public HierarchicObjectDMO(DmcTypeModifierMV mods) {
        super("HierarchicObject");
        modrec(true);
        setModifier(mods);
    }

    public HierarchicObjectDMO getModificationRecorder(){
        HierarchicObjectDMO rc = new HierarchicObjectDMO();
        rc.setFQN(getFQN());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:733)
    public FullyQualifiedName getObjectName(){
        DmcAttribute<?> name = get(__FQN);
        if (name != null)
            return((FullyQualifiedName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__FQN);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof HierarchicObjectDMO){
            return( getObjectName().equals( ((HierarchicObjectDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:584)
    public Integer getLineNumber(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(__lineNumber);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:621)
    public void setLineNumber(Integer value) {
        DmcAttribute<?> attr = get(__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(__lineNumber);
        
        try{
            attr.set(value);
            set(__lineNumber,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:669)
    public void setLineNumber(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(__lineNumber);
        
        attr.set(value);
        set(__lineNumber,attr);
    }

    /**
     * Removes the lineNumber attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:684)
    public void remLineNumber(){
         rem(__lineNumber);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:584)
    public String getFile(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__file);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets file to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:621)
    public void setFile(String value) {
        DmcAttribute<?> attr = get(__file);
        if (attr == null)
            attr = new DmcTypeStringSV(__file);
        
        try{
            attr.set(value);
            set(__file,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:669)
    public void setFile(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__file);
        if (attr == null)
            attr = new DmcTypeStringSV(__file);
        
        attr.set(value);
        set(__file,attr);
    }

    /**
     * Removes the file attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:684)
    public void remFile(){
         rem(__file);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:584)
    public FullyQualifiedName getFQN(){
        DmcTypeFullyQualifiedNameSV attr = (DmcTypeFullyQualifiedNameSV) get(__FQN);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets FQN to the specified value.
     * @param value FullyQualifiedName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:621)
    public void setFQN(FullyQualifiedName value) {
        DmcAttribute<?> attr = get(__FQN);
        if (attr == null)
            attr = new DmcTypeFullyQualifiedNameSV(__FQN);
        
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
     * @param value A value compatible with DmcTypeFullyQualifiedNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:669)
    public void setFQN(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__FQN);
        if (attr == null)
            attr = new DmcTypeFullyQualifiedNameSV(__FQN);
        
        attr.set(value);
        set(__FQN,attr);
    }

    /**
     * Removes the FQN attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:684)
    public void remFQN(){
         rem(__FQN);
    }




}

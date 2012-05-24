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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:363)
import java.io.Serializable;                                            // Always required - (GenUtility.java:197)
import java.util.*;                                                     // Always required if we have any MV attributes - (GenUtility.java:193)
import org.dmd.dmc.DmcAttribute;                                        // Any attributes - (GenUtility.java:213)
import org.dmd.dmc.DmcNamedObjectIF;                                    // Named object - (GenUtility.java:343)
import org.dmd.dmc.DmcObject;                                           // Structural class - (GenUtility.java:319)
import org.dmd.dmc.DmcSliceInfo;                                        // Required for object slicing - (GenUtility.java:202)
import org.dmd.dmc.DmcValueException;                                   // Any attributes - (GenUtility.java:214)
import org.dmd.dmc.types.FullyQualifiedName;                            // Naming attribute type - (GenUtility.java:338)
import org.dmd.dms.generated.dmo.MetaDMSAG;                             // Required for MODREC constructor - (GenUtility.java:201)
import org.dmd.dms.generated.types.DmcTypeFullyQualifiedNameSV;         // Required type - (GenUtility.java:296)
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                    // Required type - (GenUtility.java:296)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor - (GenUtility.java:200)
import org.dmd.dms.generated.types.DmcTypeStringSV;                     // Required type - (GenUtility.java:296)

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
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class HierarchicObjectDMO  extends DmcObject  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "HierarchicObject";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

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
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:744)
    public FullyQualifiedName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__FQN);
        if (name != null)
            return((FullyQualifiedName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__FQN);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof HierarchicObjectDMO){
            return( getObjectName().equals( ((HierarchicObjectDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public int hashCode(){
        FullyQualifiedName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:692)
    public Integer getLineNumber(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaDMSAG.__lineNumber);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:730)
    public void setLineNumber(Integer value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__lineNumber);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__lineNumber,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:783)
    public void setLineNumber(Object value) throws DmcValueException {
        DmcTypeIntegerSV attr  = (DmcTypeIntegerSV) get(MetaDMSAG.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__lineNumber);
        
        attr.set(value);
        set(MetaDMSAG.__lineNumber,attr);
    }

    /**
     * Removes the lineNumber attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:803)
    public void remLineNumber(){
         rem(MetaDMSAG.__lineNumber);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:692)
    public String getFile(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__file);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets file to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:730)
    public void setFile(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__file);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__file,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:783)
    public void setFile(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MetaDMSAG.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__file);
        
        attr.set(value);
        set(MetaDMSAG.__file,attr);
    }

    /**
     * Removes the file attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:803)
    public void remFile(){
         rem(MetaDMSAG.__file);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:692)
    public FullyQualifiedName getFQN(){
        DmcTypeFullyQualifiedNameSV attr = (DmcTypeFullyQualifiedNameSV) get(MetaDMSAG.__FQN);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets FQN to the specified value.
     * @param value FullyQualifiedName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:730)
    public void setFQN(FullyQualifiedName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__FQN);
        if (attr == null)
            attr = new DmcTypeFullyQualifiedNameSV(MetaDMSAG.__FQN);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__FQN,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeFullyQualifiedNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:783)
    public void setFQN(Object value) throws DmcValueException {
        DmcTypeFullyQualifiedNameSV attr  = (DmcTypeFullyQualifiedNameSV) get(MetaDMSAG.__FQN);
        if (attr == null)
            attr = new DmcTypeFullyQualifiedNameSV(MetaDMSAG.__FQN);
        
        attr.set(value);
        set(MetaDMSAG.__FQN,attr);
    }

    /**
     * Removes the FQN attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:803)
    public void remFQN(){
         rem(MetaDMSAG.__FQN);
    }




}

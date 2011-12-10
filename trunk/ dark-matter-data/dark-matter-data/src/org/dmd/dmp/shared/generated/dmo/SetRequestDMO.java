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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:357)
import java.io.Serializable;                                            // Always required
import java.util.*;                                                     // Always required
import org.dmd.dmc.DmcAttribute;                                        // Any attributes
import org.dmd.dmc.DmcNamedObjectIF;                                    // Named object reference
import org.dmd.dmc.DmcObjectName;                                       // Alternative type for NameContainer values
import org.dmd.dmc.DmcOmni;                                             // Lazy resolution
import org.dmd.dmc.DmcSliceInfo;                                        // Required for object slicing
import org.dmd.dmc.DmcValueException;                                   // Any attributes
import org.dmd.dmc.types.Modifier;                                      // Primitive type and !auxiliary class
import org.dmd.dmc.types.NameContainer;                                 // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                     // Base class
import org.dmd.dms.generated.dmo.ClassDefinitionDMO;                    // Type specific set/add
import org.dmd.dms.generated.dmo.MetaDMSAG;                             // Required for MODREC constructor
import org.dmd.dms.generated.types.ClassDefinitionREF;                  // Helper class
import org.dmd.dms.generated.types.DmcTypeClassDefinitionREFSV;         // Reference type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required type
import org.dmd.dms.generated.types.DmcTypeNameContainerSV;              // Required type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The SetRequest allows you to alter the attribute values associated with an
 * object. Like the get request, the set of attributes that can be
 * manipulated will depend on the object type that is specified.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class SetRequestDMO  extends RequestDMO  implements Serializable  {

    public final static String constructionClassName = "SetRequest";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public SetRequestDMO() {
        super("SetRequest");
    }

    protected SetRequestDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public SetRequestDMO getNew(){
        SetRequestDMO rc = new SetRequestDMO();
        return(rc);
    }

    @Override
    public SetRequestDMO getSlice(DmcSliceInfo info){
        SetRequestDMO rc = new SetRequestDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public SetRequestDMO(DmcTypeModifierMV mods) {
        super("SetRequest");
        modrec(true);
        setModifier(mods);
    }

    public SetRequestDMO getModificationRecorder(){
        SetRequestDMO rc = new SetRequestDMO();
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:608)
    public ClassDefinitionREF getTargetObjectClass(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) get(DmpDMSAG.__targetObjectClass);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getSV());
    }

    /**
     * Returns the reference to ClassDefinition without attempting lazy resolution (if turned on).
     */
    public ClassDefinitionREF getTargetObjectClassREF(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) get(DmpDMSAG.__targetObjectClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets targetObjectClass to the specified value.
     * @param value ClassDefinitionDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:661)
    public void setTargetObjectClass(ClassDefinitionDMO value) {
        DmcTypeClassDefinitionREFSV attr  = (DmcTypeClassDefinitionREFSV) get(DmpDMSAG.__targetObjectClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSV(DmpDMSAG.__targetObjectClass);
        else
            attr.removeBackReferences();
        
        try{
            attr.set(value);
            set(DmpDMSAG.__targetObjectClass,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets targetObjectClass to the specified value.
     * @param value A value compatible with DmcTypeClassDefinitionREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:775)
    public void setTargetObjectClass(Object value) throws DmcValueException {
        DmcTypeClassDefinitionREFSV attr  = (DmcTypeClassDefinitionREFSV) get(DmpDMSAG.__targetObjectClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSV(DmpDMSAG.__targetObjectClass);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DmpDMSAG.__targetObjectClass,attr);
    }

    /**
     * Removes the targetObjectClass attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
    public void remTargetObjectClass(){
         rem(DmpDMSAG.__targetObjectClass);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:685)
    public NameContainer getTarget(){
        DmcTypeNameContainerSV attr = (DmcTypeNameContainerSV) get(DmpDMSAG.__target);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:723)
    public void setTarget(NameContainer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__target);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(DmpDMSAG.__target);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__target,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:748)
    public void setTarget(DmcObjectName value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__target);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(DmpDMSAG.__target);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__target,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The alternative type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets target to the specified value.
     * @param value A value compatible with DmcTypeNameContainerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:775)
    public void setTarget(Object value) throws DmcValueException {
        DmcTypeNameContainerSV attr  = (DmcTypeNameContainerSV) get(DmpDMSAG.__target);
        if (attr == null)
            attr = new DmcTypeNameContainerSV(DmpDMSAG.__target);
        
        attr.set(value);
        set(DmpDMSAG.__target,attr);
    }

    /**
     * Removes the target attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:795)
    public void remTarget(){
         rem(DmpDMSAG.__target);
    }

    /**
     * @return An Iterator of Modifier objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1010)
    public Iterator<Modifier> getModify(){
        DmcTypeModifierMV attr = (DmcTypeModifierMV) get(MetaDMSAG.__modify);
        if (attr == null)
            return( ((List<Modifier>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth Modifier value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1022)
    public Modifier getNthModify(int i){
        DmcTypeModifierMV attr = (DmcTypeModifierMV) get(MetaDMSAG.__modify);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another modify to the specified value.
     * @param value Modifier
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1036)
    public DmcAttribute<?> addModify(Modifier value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__modify);
        if (attr == null)
            attr = new DmcTypeModifierMV(MetaDMSAG.__modify);
        
        try{
            setLastValue(attr.add(value));
            add(MetaDMSAG.__modify,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified Modifier.
     * @param value Modifier
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1111)
    public boolean modifyContains(Modifier value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__modify);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another modify value.
     * @param value A value compatible with Modifier
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1143)
    public DmcAttribute<?> addModify(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__modify);
        if (attr == null)
            attr = new DmcTypeModifierMV(MetaDMSAG.__modify);
        
        setLastValue(attr.add(value));
        add(MetaDMSAG.__modify,attr);
        return(attr);
    }

    /**
     * Returns the number of values in modify
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1160)
    public int getModifySize(){
        DmcAttribute<?> attr = get(MetaDMSAG.__modify);
        if (attr == null){
            if (MetaDMSAG.__modify.indexSize == 0)
                return(0);
            else
                return(MetaDMSAG.__modify.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a modify value.
     * @param value The Modifier to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1218)
    public DmcAttribute<?> delModify(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__modify);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeModifierMV(MetaDMSAG.__modify), value);
        else
            attr = del(MetaDMSAG.__modify, value);
        
        return(attr);
    }

    /**
     * Deletes a modify from the specified value.
     * @param value Modifier
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1234)
    public DmcAttribute<?> delModify(Modifier value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__modify);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeModifierMV(MetaDMSAG.__modify), value);
        else
            attr = del(MetaDMSAG.__modify, value);
        
        return(attr);
    }

    /**
     * Removes the modify attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1253)
    public void remModify(){
         rem(MetaDMSAG.__modify);
    }




}

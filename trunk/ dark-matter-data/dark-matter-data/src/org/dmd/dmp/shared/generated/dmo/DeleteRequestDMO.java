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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:321)
import java.io.Serializable;                                          // Always required
import java.util.*;                                                   // Always required
import org.dmd.dmc.DmcAttribute;                                      // Any attributes
import org.dmd.dmc.DmcObjectName;                                     // Alternative type for NameContainer values
import org.dmd.dmc.DmcSliceInfo;                                      // Required for object slicing
import org.dmd.dmc.DmcValueException;                                 // Any attributes
import org.dmd.dmc.types.NameContainer;                               // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.dmo.RequestDMO;                   // Base class
import org.dmd.dmp.shared.generated.enums.ScopeEnum;                  // Primitive type and !auxiliary class
import org.dmd.dmp.shared.generated.types.DmcTypeScopeEnumSV;         // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                 // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeNameContainerMV;            // Required type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The DeleteRequest allows you to delete one or more objects. If no scope is
 * specified, the scope is assumed to be BASE i.e. just the specific object
 * indicated by the targets. The behaviour of this request is implementation
 * specific.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class DeleteRequestDMO  extends RequestDMO  implements Serializable  {

    public final static String constructionClassName = "DeleteRequest";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public DeleteRequestDMO() {
        super("DeleteRequest");
    }

    protected DeleteRequestDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public DeleteRequestDMO getNew(){
        DeleteRequestDMO rc = new DeleteRequestDMO();
        return(rc);
    }

    @Override
    public DeleteRequestDMO getSlice(DmcSliceInfo info){
        DeleteRequestDMO rc = new DeleteRequestDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public DeleteRequestDMO(DmcTypeModifierMV mods) {
        super("DeleteRequest");
        modrec(true);
        setModifier(mods);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public ScopeEnum getScope(){
        DmcTypeScopeEnumSV attr = (DmcTypeScopeEnumSV) get(DmpDMSAG.__scope);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets scope to the specified value.
     * @param value ScopeEnum
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
    public void setScope(ScopeEnum value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__scope);
        if (attr == null)
            attr = new DmcTypeScopeEnumSV(DmpDMSAG.__scope);
        
        try{
            attr.set(value);
            set(DmpDMSAG.__scope,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets scope to the specified value.
     * @param value A value compatible with DmcTypeScopeEnumSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setScope(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpDMSAG.__scope);
        if (attr == null)
            attr = new DmcTypeScopeEnumSV(DmpDMSAG.__scope);
        
        attr.set(value);
        set(DmpDMSAG.__scope,attr);
    }

    /**
     * Removes the scope attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remScope(){
         rem(DmpDMSAG.__scope);
    }

    /**
     * @return An Iterator of NameContainer objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:945)
    public Iterator<NameContainer> getTargets(){
        DmcTypeNameContainerMV attr = (DmcTypeNameContainerMV) get(DmpDMSAG.__targets);
        if (attr == null)
            return( ((List<NameContainer>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth NameContainer value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:957)
    public NameContainer getNthTargets(int i){
        DmcTypeNameContainerMV attr = (DmcTypeNameContainerMV) get(DmpDMSAG.__targets);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another targets to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:971)
    public DmcAttribute<?> addTargets(NameContainer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__targets);
        if (attr == null)
            attr = new DmcTypeNameContainerMV(DmpDMSAG.__targets);
        
        try{
            setLastValue(attr.add(value));
            add(DmpDMSAG.__targets,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another targets to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1024)
    public DmcAttribute<?> addTargets(DmcObjectName value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__targets);
        if (attr == null)
            attr = new DmcTypeNameContainerMV(DmpDMSAG.__targets);
        
        try{
            setLastValue(attr.add(value));
            add(DmpDMSAG.__targets,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The alternative type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Returns true if we contain a valued keyed by the specified NameContainer.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1045)
    public boolean targetsContains(NameContainer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__targets);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Returns true if we contain a valued keyed by the specified DmcObjectName.
     * @param value DmcObjectName
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1059)
    public boolean targetsContains(DmcObjectName value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__targets);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another targets value.
     * @param value A value compatible with NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1077)
    public DmcAttribute<?> addTargets(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpDMSAG.__targets);
        if (attr == null)
            attr = new DmcTypeNameContainerMV(DmpDMSAG.__targets);
        
        setLastValue(attr.add(value));
        add(DmpDMSAG.__targets,attr);
        return(attr);
    }

    /**
     * Returns the number of values in targets
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1094)
    public int getTargetsSize(){
        DmcAttribute<?> attr = get(DmpDMSAG.__targets);
        if (attr == null){
            if (DmpDMSAG.__targets.indexSize == 0)
                return(0);
            else
                return(DmpDMSAG.__targets.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a targets value.
     * @param value The NameContainer to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1139)
    public DmcAttribute<?> delTargets(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmpDMSAG.__targets);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeNameContainerMV(DmpDMSAG.__targets), value);
        else
            attr = del(DmpDMSAG.__targets, value);
        
        return(attr);
    }

    /**
     * Deletes a targets from the specified value.
     * @param value NameContainer
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1155)
    public DmcAttribute<?> delTargets(NameContainer value) {
        DmcAttribute<?> attr = get(DmpDMSAG.__targets);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeNameContainerMV(DmpDMSAG.__targets), value);
        else
            attr = del(DmpDMSAG.__targets, value);
        
        return(attr);
    }

    /**
     * Removes the targets attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1174)
    public void remTargets(){
         rem(DmpDMSAG.__targets);
    }




}

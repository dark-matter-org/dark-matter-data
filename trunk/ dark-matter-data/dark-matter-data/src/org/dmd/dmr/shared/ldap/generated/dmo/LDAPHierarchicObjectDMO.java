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
package org.dmd.dmr.shared.ldap.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:321)
import java.io.Serializable;                                              // Always required
import java.util.*;                                                       // Always required
import org.dmd.dmc.DmcAttribute;                                          // Any attributes
import org.dmd.dmc.DmcNamedObjectIF;                                      // Named object
import org.dmd.dmc.DmcSliceInfo;                                          // Required for object slicing
import org.dmd.dmc.DmcValueException;                                     // Any attributes
import org.dmd.dmc.types.FullyQualifiedName;                              // Naming attribute type
import org.dmd.dmr.shared.base.generated.dmo.HierarchicObjectDMO;         // Base class
import org.dmd.dms.generated.dmo.MetaDMSAG;                               // Attribute from meta schema
import org.dmd.dms.generated.types.DmcTypeFullyQualifiedNameSV;           // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                     // Required for MODREC constructor

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The LDAPHierarchicObject provides some additional structure and
 * conventions to the HierarchicObject to make it usable in conjunction with
 * an LDAP enabled directory server. Classes derived from
 * LDAPHierarchicObject must be defined in a schema that has been extended
 * with the LDAPSchemaExtension auxiliary class and must themselves be
 * extended with the LDAPClassExtension auxiliary class; the class must have
 * a defined naming attribute. Furthermore, naming attributes should be
 * unique for each defined class.
 * <P>
 * Generated from the dmr.ldap schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class LDAPHierarchicObjectDMO  extends HierarchicObjectDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "LDAPHierarchicObject";

    public final static DmcClassInfo classInfo = DmrLdapDMSAG.__LDAPHierarchicObject;

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public LDAPHierarchicObjectDMO() {
        super("LDAPHierarchicObject");
    }

    protected LDAPHierarchicObjectDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public LDAPHierarchicObjectDMO getNew(){
        LDAPHierarchicObjectDMO rc = new LDAPHierarchicObjectDMO();
        return(rc);
    }

    @Override
    public LDAPHierarchicObjectDMO getSlice(DmcSliceInfo info){
        LDAPHierarchicObjectDMO rc = new LDAPHierarchicObjectDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public LDAPHierarchicObjectDMO(DmcTypeModifierMV mods) {
        super("LDAPHierarchicObject");
        modrec(true);
        setModifier(mods);
    }

    public LDAPHierarchicObjectDMO getModificationRecorder(){
        LDAPHierarchicObjectDMO rc = new LDAPHierarchicObjectDMO();
        rc.setFQN(getFQN());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:735)
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
        if (obj instanceof LDAPHierarchicObjectDMO){
            return( getObjectName().equals( ((LDAPHierarchicObjectDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setFQN(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__FQN);
        if (attr == null)
            attr = new DmcTypeFullyQualifiedNameSV(MetaDMSAG.__FQN);
        
        attr.set(value);
        set(MetaDMSAG.__FQN,attr);
    }

    /**
     * Removes the FQN attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remFQN(){
         rem(MetaDMSAG.__FQN);
    }




}

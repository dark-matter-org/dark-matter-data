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

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
// import 3 String
import org.dmd.dmc.types.DmcTypeString;

// import 6
import org.dmd.dmr.shared.base.generated.dmo.HierarchicObjectDMO;
// import 7
import org.dmd.dmc.DmcNamedObjectIF;

@SuppressWarnings("serial")
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
 * Generated from:  org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:466)
 */
public class LDAPHierarchicObjectDMO  extends HierarchicObjectDMO  implements DmcNamedObjectIF  {

    public final static String _FQN = "FQN";

    public LDAPHierarchicObjectDMO() {
        super("LDAPHierarchicObject");
    }

    protected LDAPHierarchicObjectDMO(String oc) {
        super(oc);
    }

    public LDAPHierarchicObjectDMO(LDAPHierarchicObjectDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public LDAPHierarchicObjectDMO getOneOfMe() {
        LDAPHierarchicObjectDMO rc = new LDAPHierarchicObjectDMO(this.getConstructionClassName());
        return(rc);
    }

    @SuppressWarnings("unchecked")
    public String getObjectName(){
        DmcAttribute name = get(_FQN);
        if (name != null)
            return(name.getString());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof LDAPHierarchicObjectDMO){
            return( getObjectName().equals( ((LDAPHierarchicObjectDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public String getFQN(){
        DmcTypeString attr = (DmcTypeString) get(_FQN);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setFQN(Object value) throws DmcValueException {
        DmcAttribute attr = get(_FQN);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_FQN,attr);
    }

    /**
     * Removes the FQN attribute value.
     */
    public void remFQN(){
         rem(_FQN);
    }




}

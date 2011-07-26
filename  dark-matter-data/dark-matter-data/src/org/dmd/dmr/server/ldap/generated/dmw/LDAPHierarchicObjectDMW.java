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
package org.dmd.dmr.server.ldap.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:936)
import org.dmd.dmc.*;                                                         // If any attributes
import org.dmd.dmc.types.FullyQualifiedName;                                  // Primitive type
import org.dmd.dmr.server.base.extended.HierarchicObject;                     // Derived class
import org.dmd.dmr.server.ldap.extended.LDAPHierarchicObject;                 // Required for getModificationRecorder()
import org.dmd.dmr.shared.ldap.generated.dmo.LDAPHierarchicObjectDMO;         // Class not auxiliary or abstract
import org.dmd.dms.*;                                                         // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                                   // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeModifierMV;                         // Required for MODREC constructor

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
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:349)
 */
abstract public class LDAPHierarchicObjectDMW extends HierarchicObject implements DmcNamedObjectIF {

    public LDAPHierarchicObjectDMW() {
        super(new LDAPHierarchicObjectDMO(), org.dmd.dmr.server.ldap.generated.DmrLdapSchemaAG._LDAPHierarchicObject);
    }

    public LDAPHierarchicObjectDMW(DmcTypeModifierMV mods) {
        super(new LDAPHierarchicObjectDMO(mods), org.dmd.dmr.server.ldap.generated.DmrLdapSchemaAG._LDAPHierarchicObject);
    }

    public LDAPHierarchicObject getModificationRecorder(){
        LDAPHierarchicObject rc = new LDAPHierarchicObject();
        rc.setFQN(getFQN());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public LDAPHierarchicObjectDMW(LDAPHierarchicObjectDMO obj) {
        super(obj, org.dmd.dmr.server.ldap.generated.DmrLdapSchemaAG._LDAPHierarchicObject);
    }

    public LDAPHierarchicObjectDMO getDMO() {
        return((LDAPHierarchicObjectDMO) core);
    }

    protected LDAPHierarchicObjectDMW(LDAPHierarchicObjectDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:964)
    public FullyQualifiedName getObjectName(){
        return(((LDAPHierarchicObjectDMO) core).getFQN());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((LDAPHierarchicObjectDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof LDAPHierarchicObjectDMW){
            return( getObjectName().equals( ((LDAPHierarchicObjectDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1104)
    public FullyQualifiedName getFQN(){
        return(((LDAPHierarchicObjectDMO) core).getFQN());
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeFullyQualifiedName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1151)
    public void setFQN(Object value) throws DmcValueException {
        ((LDAPHierarchicObjectDMO) core).setFQN(value);
    }

    /**
     * Sets FQN to the specified value.
     * @param value FullyQualifiedName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1160)
    public void setFQN(FullyQualifiedName value){
        ((LDAPHierarchicObjectDMO) core).setFQN(value);
    }

    /**
     * Removes the FQN attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1186)
    public void remFQN(){
        ((LDAPHierarchicObjectDMO) core).remFQN();
    }


}

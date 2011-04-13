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

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:835)
import org.dmd.dmc.*;                                                         // If any attributes
import org.dmd.dmc.types.FullyQualifiedName;                                  // Primitive type
import org.dmd.dmr.server.base.extended.HierarchicObject;                     // Derived class
import org.dmd.dmr.server.ldap.extended.LDAPHierarchicObject;                 // Required for getModificationRecorder()
import org.dmd.dmr.shared.ldap.generated.dmo.LDAPHierarchicObjectDMO;         // Class not auxiliary or abstract
import org.dmd.dms.*;                                                         // Always 2
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
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:343)
 */
abstract public class LDAPHierarchicObjectDMW extends HierarchicObject implements DmcNamedObjectIF {

    private LDAPHierarchicObjectDMO mycore;

    public LDAPHierarchicObjectDMW() {
        super(new LDAPHierarchicObjectDMO(), org.dmd.dmr.server.ldap.generated.DmrLdapSchemaAG._LDAPHierarchicObject);
        mycore = (LDAPHierarchicObjectDMO) core;
        mycore.setContainer(this);
    }

    public LDAPHierarchicObjectDMW(DmcTypeModifierMV mods) {
        super(new LDAPHierarchicObjectDMO(mods), org.dmd.dmr.server.ldap.generated.DmrLdapSchemaAG._LDAPHierarchicObject);
        mycore = (LDAPHierarchicObjectDMO) core;
        mycore.setContainer(this);
    }

    public LDAPHierarchicObjectDMW getModificationRecorder(){
        LDAPHierarchicObjectDMW rc = new LDAPHierarchicObject();
        rc.setDmcObject(new LDAPHierarchicObjectDMO(new DmcTypeModifierMV()));
        rc.setFQN(getFQN());
        return(rc);
    }

    public LDAPHierarchicObjectDMW(LDAPHierarchicObjectDMO obj) {
        super(obj, org.dmd.dmr.server.ldap.generated.DmrLdapSchemaAG._LDAPHierarchicObject);
        mycore = (LDAPHierarchicObjectDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (LDAPHierarchicObjectDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    public LDAPHierarchicObjectDMO getDMO() {
        return(mycore);
    }

    protected LDAPHierarchicObjectDMW(LDAPHierarchicObjectDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (LDAPHierarchicObjectDMO) core;
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:861)
    public FullyQualifiedName getObjectName(){
        return(mycore.getFQN());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof LDAPHierarchicObjectDMW){
            return( getObjectName().equals( ((LDAPHierarchicObjectDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:986)
    public FullyQualifiedName getFQN(){
        return(mycore.getFQN());
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeFullyQualifiedName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1033)
    public void setFQN(Object value) throws DmcValueException {
        mycore.setFQN(value);
    }

    /**
     * Sets FQN to the specified value.
     * @param value FullyQualifiedName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1042)
    public void setFQN(FullyQualifiedName value){
        mycore.setFQN(value);
    }

    /**
     * Removes the FQN attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1057)
    public void remFQN(){
        mycore.remFQN();
    }


}

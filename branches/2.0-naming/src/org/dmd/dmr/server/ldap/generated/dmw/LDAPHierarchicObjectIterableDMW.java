package org.dmd.dmr.server.ldap.generated.dmw;

import java.util.Iterator;

import org.dmd.dmw.DmwContainerIterator;
import org.dmd.dmr.shared.ldap.generated.types.LDAPHierarchicObjectREF;
import org.dmd.dmr.server.ldap.extended.LDAPHierarchicObject;
/**
 * The LDAPHierarchicObjectIteratorDMW will cast from an underlying LDAPHierarchicObjectREF class to 
 * the associated wrapper class: LDAPHierarchicObject when accessing object references in a wrapper context.
 * <P>
 * Generated from the dmrldap schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpIterable(BaseDMWGenerator.java:323)
 */
public class LDAPHierarchicObjectIterableDMW extends DmwContainerIterator<LDAPHierarchicObject,LDAPHierarchicObjectREF> {

    public final static LDAPHierarchicObjectIterableDMW emptyList = new LDAPHierarchicObjectIterableDMW();

    protected LDAPHierarchicObjectIterableDMW(){
        super();
    }

    public LDAPHierarchicObjectIterableDMW(Iterator<LDAPHierarchicObjectREF> it){
        super(it);
    }

}

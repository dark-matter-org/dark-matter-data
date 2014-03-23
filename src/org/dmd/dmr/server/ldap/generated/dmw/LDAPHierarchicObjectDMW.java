package org.dmd.dmr.server.ldap.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                                         // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.types.FullyQualifiedName;                                  // Is named by - (BaseDMWGenerator.java:1062)
import org.dmd.dmr.server.base.extended.HierarchicObject;                     // Derived class - (BaseDMWGenerator.java:1248)
import org.dmd.dmr.server.ldap.extended.LDAPHierarchicObject;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:1076)
import org.dmd.dmr.shared.ldap.generated.dmo.LDAPHierarchicObjectDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.dms.ClassDefinition;                                           // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                   // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                         // Required for MODREC constructor - (BaseDMWGenerator.java:1071)



/**
 * The LDAPHierarchicObject provides some additional structure and\n
 * conventions to the HierarchicObject to make it usable in conjunction with
 * an LDAP\n enabled directory server. Classes derived from
 * LDAPHierarchicObject must be defined\n in a schema that has been extended
 * with the LDAPSchemaExtension auxiliary class and\n must themselves be
 * extended with the LDAPClassExtension auxiliary class; the class\n must
 * have a defined naming attribute. Furthermore, naming attributes should
 * be\n unique for each defined class.
 * <P>
 * Generated from the dmrldap schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
abstract public class LDAPHierarchicObjectDMW extends HierarchicObject implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public LDAPHierarchicObjectDMW() {
        super(new LDAPHierarchicObjectDMO(), org.dmd.dmr.server.ldap.generated.DmrldapSchemaAG._LDAPHierarchicObject);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public LDAPHierarchicObjectDMW(DmcTypeModifierMV mods) {
        super(new LDAPHierarchicObjectDMO(mods), org.dmd.dmr.server.ldap.generated.DmrldapSchemaAG._LDAPHierarchicObject);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:606)
    public LDAPHierarchicObject getModificationRecorder(){
        LDAPHierarchicObject rc = new LDAPHierarchicObject();
        rc.setFQN(getFQN());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
    public LDAPHierarchicObjectDMW(LDAPHierarchicObjectDMO obj) {
        super(obj, org.dmd.dmr.server.ldap.generated.DmrldapSchemaAG._LDAPHierarchicObject);
    }

    public LDAPHierarchicObject cloneIt() {
        LDAPHierarchicObject rc = new LDAPHierarchicObject();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public LDAPHierarchicObjectDMO getDMO() {
        return((LDAPHierarchicObjectDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected LDAPHierarchicObjectDMW(LDAPHierarchicObjectDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1297)
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

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public FullyQualifiedName getFQN(){
        return(((LDAPHierarchicObjectDMO) core).getFQN());
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeFullyQualifiedName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setFQN(Object value) throws DmcValueException {
        ((LDAPHierarchicObjectDMO) core).setFQN(value);
    }

    /**
     * Sets FQN to the specified value.
     * @param value FullyQualifiedName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setFQN(FullyQualifiedName value){
        ((LDAPHierarchicObjectDMO) core).setFQN(value);
    }

    /**
     * Removes the FQN attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remFQN(){
        ((LDAPHierarchicObjectDMO) core).remFQN();
    }


}

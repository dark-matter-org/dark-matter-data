package org.dmd.dmr.server.base.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:366)
import org.dmd.dmc.*;                                                   // If any attributes - (BaseDMWGenerator.java:1011)
import org.dmd.dmc.types.FullyQualifiedName;                            // Is named by - (BaseDMWGenerator.java:986)
import org.dmd.dmr.server.base.extended.DotNamedObject;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:1000)
import org.dmd.dmr.server.base.extended.HierarchicObject;               // Derived class - (BaseDMWGenerator.java:1172)
import org.dmd.dmr.shared.base.generated.dmo.DotNamedObjectDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1176)
import org.dmd.dms.ClassDefinition;                                     // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:991)
import org.dmd.dms.generated.dmo.MetaDMSAG;                             // Required for MODREC constructor - (BaseDMWGenerator.java:996)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor - (BaseDMWGenerator.java:995)



/**
 * A DotNamedObject is a hierarchic object whose fully qualified\n name is
 * composed of naming attributes separated by periods. For example \n
 * grandparent.parent.child.\n <p>\n The naming attribute of a DotNamedObject
 * is name. Unlike LDAP objects, \n we don't bother making this configurable.
 * When a DotNamedObject is parsed\n from a file, we check to see if the name
 * attribute has a value; if not,\n we take the last portion of the FQN as
 * the name. For example, if the FQN\n is x.y.z, the name of the object would
 * be 'z'.
 * <P>
 * Generated from the dmrbase schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:403)
 */
abstract public class DotNamedObjectDMW extends HierarchicObject implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:482)
    public DotNamedObjectDMW() {
        super(new DotNamedObjectDMO(), org.dmd.dmr.server.base.generated.DmrbaseSchemaAG._DotNamedObject);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
    public DotNamedObjectDMW(DmcTypeModifierMV mods) {
        super(new DotNamedObjectDMO(mods), org.dmd.dmr.server.base.generated.DmrbaseSchemaAG._DotNamedObject);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:530)
    public DotNamedObject getModificationRecorder(){
        DotNamedObject rc = new DotNamedObject();
        rc.setFQN(getFQN());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:551)
    public DotNamedObjectDMW(DotNamedObjectDMO obj) {
        super(obj, org.dmd.dmr.server.base.generated.DmrbaseSchemaAG._DotNamedObject);
    }

    public DotNamedObject cloneIt() {
        DotNamedObject rc = new DotNamedObject();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public DotNamedObjectDMO getDMO() {
        return((DotNamedObjectDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:566)
    protected DotNamedObjectDMW(DotNamedObjectDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1221)
    public FullyQualifiedName getObjectName(){
        return(((DotNamedObjectDMO) core).getFQN());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((DotNamedObjectDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof DotNamedObjectDMW){
            return( getObjectName().equals( ((DotNamedObjectDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1398)
    public FullyQualifiedName getFQN(){
        return(((DotNamedObjectDMO) core).getFQN());
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeFullyQualifiedName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1508)
    public void setFQN(Object value) throws DmcValueException {
        ((DotNamedObjectDMO) core).setFQN(value);
    }

    /**
     * Sets FQN to the specified value.
     * @param value FullyQualifiedName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1517)
    public void setFQN(FullyQualifiedName value){
        ((DotNamedObjectDMO) core).setFQN(value);
    }

    /**
     * Removes the FQN attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1543)
    public void remFQN(){
        ((DotNamedObjectDMO) core).remFQN();
    }


}

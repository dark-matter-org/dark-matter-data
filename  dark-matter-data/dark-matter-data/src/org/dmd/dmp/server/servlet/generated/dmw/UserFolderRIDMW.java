package org.dmd.dmp.server.servlet.generated.dmw;

// Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.formatImports(BaseDMWGeneratorNew.java:950)
import org.dmd.dmc.*;                                                    // If any attributes
import org.dmd.dmc.types.DotName;                                        // Primitive type
import org.dmd.dmp.server.servlet.generated.dmo.UserFolderRIDMO;         // Class not auxiliary or abstract
import org.dmd.dms.*;                                                    // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor
import org.dmd.dmw.DmwHierarchicObjectWrapper;                           // Hierarchic object wrapper

/**
 * The UserFolderRI provides for a grouping of UserRI objects.
 * <P>
 * Generated from the dmp.server schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:364)
 */
public class UserFolderRIDMW extends DmwHierarchicObjectWrapper implements DmcHierarchicNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:441)
    public UserFolderRIDMW() {
        super(new UserFolderRIDMO(), org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG._UserFolderRI);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:447)
    public UserFolderRIDMW(DmcTypeModifierMV mods) {
        super(new UserFolderRIDMO(mods), org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG._UserFolderRI);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:498)
    public UserFolderRIDMW getModificationRecorder(){
        UserFolderRIDMW rc = new UserFolderRIDMW();
        rc.setDotName(getDotName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:510)
    public UserFolderRIDMW(UserFolderRIDMO obj) {
        super(obj, org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG._UserFolderRI);
    }

    public UserFolderRIDMW cloneIt() {
        UserFolderRIDMW rc = new UserFolderRIDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public UserFolderRIDMO getDMO() {
        return((UserFolderRIDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:527)
    protected UserFolderRIDMW(UserFolderRIDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.getAccessFunctions(BaseDMWGeneratorNew.java:977)
    public DotName getObjectName(){
        return(((UserFolderRIDMO) core).getDotName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((UserFolderRIDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof UserFolderRIDMW){
            return( getObjectName().equals( ((UserFolderRIDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.getAccessFunctions(BaseDMWGeneratorNew.java:998)
    public DotName getHierarchicObjectName(){
        return(((UserFolderRIDMO) core).getDotName());
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1133)
    public DotName getDotName(){
        return(((UserFolderRIDMO) core).getDotName());
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1204)
    public void setDotName(Object value) throws DmcValueException {
        ((UserFolderRIDMO) core).setDotName(value);
    }

    /**
     * Sets dotName to the specified value.
     * @param value DotName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1213)
    public void setDotName(DotName value){
        ((UserFolderRIDMO) core).setDotName(value);
    }

    /**
     * Removes the dotName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1239)
    public void remDotName(){
        ((UserFolderRIDMO) core).remDotName();
    }


}

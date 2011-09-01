package org.dmd.dmp.server.servlet.generated.dmw;

// Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.formatImports(BaseDMWGeneratorNew.java:855)
import org.dmd.dmc.*;                                                       // If any attributes
import org.dmd.dmc.types.DotName;                                           // Primitive type
import org.dmd.dmp.server.servlet.generated.dmo.SessionFolderRIDMO;         // Class not auxiliary or abstract
import org.dmd.dms.*;                                                       // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                                 // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeModifierMV;                       // Required for MODREC constructor
import org.dmd.dmw.DmwHierarchicObjectWrapper;                              // Hierarchic object wrapper

/**
 * The SessionFolderRI provides for a grouping of SessionRI objects.
 * <P>
 * Generated from the dmp.server schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:290)
 */
public class SessionFolderRIDMW extends DmwHierarchicObjectWrapper implements DmcNamedObjectIF {

    public SessionFolderRIDMW() {
        super(new SessionFolderRIDMO(), org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG._SessionFolderRI);
    }

    public SessionFolderRIDMW(DmcTypeModifierMV mods) {
        super(new SessionFolderRIDMO(mods), org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG._SessionFolderRI);
    }

    public SessionFolderRIDMW getModificationRecorder(){
        SessionFolderRIDMW rc = new SessionFolderRIDMW();
        rc.setDotName(getDotName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public SessionFolderRIDMW(SessionFolderRIDMO obj) {
        super(obj, org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG._SessionFolderRI);
    }

    public SessionFolderRIDMW cloneIt() {
        SessionFolderRIDMW rc = new SessionFolderRIDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public SessionFolderRIDMO getDMO() {
        return((SessionFolderRIDMO) core);
    }

    protected SessionFolderRIDMW(SessionFolderRIDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.getAccessFunctions(BaseDMWGeneratorNew.java:882)
    public DotName getObjectName(){
        return(((SessionFolderRIDMO) core).getDotName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((SessionFolderRIDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof SessionFolderRIDMW){
            return( getObjectName().equals( ((SessionFolderRIDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1027)
    public DotName getDotName(){
        return(((SessionFolderRIDMO) core).getDotName());
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1086)
    public void setDotName(Object value) throws DmcValueException {
        ((SessionFolderRIDMO) core).setDotName(value);
    }

    /**
     * Sets dotName to the specified value.
     * @param value DotName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1095)
    public void setDotName(DotName value){
        ((SessionFolderRIDMO) core).setDotName(value);
    }

    /**
     * Removes the dotName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1121)
    public void remDotName(){
        ((SessionFolderRIDMO) core).remDotName();
    }


}
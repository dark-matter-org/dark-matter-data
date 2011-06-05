package org.dmd.dmp.server.servlet.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:886)
import org.dmd.dmc.*;                                                 // If any attributes
import org.dmd.dmc.types.DotName;                                     // Primitive type
import org.dmd.dmp.server.servlet.generated.dmo.SessionRIDMO;         // Class not auxiliary or abstract
import org.dmd.dms.*;                                                 // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;                 // Required for MODREC constructor

/**
 * The SessionRI represents an authenticated user session.
 * <P>
 * Generated from the dmp.server schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
public class SessionRIDMW extends DmwWrapper implements DmcNamedObjectIF {

    public SessionRIDMW() {
        super(new SessionRIDMO(), org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG._SessionRI);
    }

    public SessionRIDMW(DmcTypeModifierMV mods) {
        super(new SessionRIDMO(mods), org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG._SessionRI);
    }

    public SessionRIDMW getModificationRecorder(){
        SessionRIDMW rc = new SessionRIDMW();
        rc.setDotName(getDotName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public SessionRIDMW(SessionRIDMO obj) {
        super(obj, org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG._SessionRI);
    }

    public SessionRIDMO getDMO() {
        return((SessionRIDMO) core);
    }

    protected SessionRIDMW(SessionRIDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:914)
    public DotName getObjectName(){
        return(((SessionRIDMO) core).getDotName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((SessionRIDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof SessionRIDMW){
            return( getObjectName().equals( ((SessionRIDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public DotName getDotName(){
        return(((SessionRIDMO) core).getDotName());
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setDotName(Object value) throws DmcValueException {
        ((SessionRIDMO) core).setDotName(value);
    }

    /**
     * Sets dotName to the specified value.
     * @param value DotName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setDotName(DotName value){
        ((SessionRIDMO) core).setDotName(value);
    }

    /**
     * Removes the dotName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remDotName(){
        ((SessionRIDMO) core).remDotName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1051)
    public Integer getIdRI(){
        return(((SessionRIDMO) core).getIdRI());
    }

    /**
     * Sets idRI to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public void setIdRI(Object value) throws DmcValueException {
        ((SessionRIDMO) core).setIdRI(value);
    }

    /**
     * Sets idRI to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1107)
    public void setIdRI(Integer value){
        ((SessionRIDMO) core).setIdRI(value);
    }

    /**
     * Removes the idRI attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1133)
    public void remIdRI(){
        ((SessionRIDMO) core).remIdRI();
    }


}

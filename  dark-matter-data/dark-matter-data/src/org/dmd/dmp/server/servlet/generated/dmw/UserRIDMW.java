package org.dmd.dmp.server.servlet.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:922)
import org.dmd.dmc.*;                                              // If any attributes
import org.dmd.dmc.types.DotName;                                  // Primitive type
import org.dmd.dmp.server.servlet.generated.dmo.UserRIDMO;         // Class not auxiliary or abstract
import org.dmd.dms.*;                                              // Always 2
import org.dmd.dms.generated.types.DmcTypeModifierMV;              // Required for MODREC constructor
import org.dmd.dmw.DmwHierarchicObjectWrapper;                     // Hierarchic object wrapper

/**
 * The UserRI class provides a user representation for use with the 
 * Reference Implementation (RI).
 * <P>
 * Generated from the dmp.server schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:347)
 */
public class UserRIDMW extends DmwHierarchicObjectWrapper implements DmcNamedObjectIF {

    public UserRIDMW() {
        super(new UserRIDMO(), org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG._UserRI);
    }

    public UserRIDMW(DmcTypeModifierMV mods) {
        super(new UserRIDMO(mods), org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG._UserRI);
    }

    public UserRIDMW getModificationRecorder(){
        UserRIDMW rc = new UserRIDMW();
        rc.setDotName(getDotName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public UserRIDMW(UserRIDMO obj) {
        super(obj, org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG._UserRI);
    }

    public UserRIDMO getDMO() {
        return((UserRIDMO) core);
    }

    protected UserRIDMW(UserRIDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:950)
    public DotName getObjectName(){
        return(((UserRIDMO) core).getDotName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((UserRIDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof UserRIDMW){
            return( getObjectName().equals( ((UserRIDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1087)
    public DotName getDotName(){
        return(((UserRIDMO) core).getDotName());
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1134)
    public void setDotName(Object value) throws DmcValueException {
        ((UserRIDMO) core).setDotName(value);
    }

    /**
     * Sets dotName to the specified value.
     * @param value DotName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1143)
    public void setDotName(DotName value){
        ((UserRIDMO) core).setDotName(value);
    }

    /**
     * Removes the dotName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1169)
    public void remDotName(){
        ((UserRIDMO) core).remDotName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1087)
    public Integer getIdRI(){
        return(((UserRIDMO) core).getIdRI());
    }

    /**
     * Sets idRI to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1134)
    public void setIdRI(Object value) throws DmcValueException {
        ((UserRIDMO) core).setIdRI(value);
    }

    /**
     * Sets idRI to the specified value.
     * @param value Integer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1143)
    public void setIdRI(Integer value){
        ((UserRIDMO) core).setIdRI(value);
    }

    /**
     * Removes the idRI attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1169)
    public void remIdRI(){
        ((UserRIDMO) core).remIdRI();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1087)
    public String getUserName(){
        return(((UserRIDMO) core).getUserName());
    }

    /**
     * Sets userName to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1134)
    public void setUserName(Object value) throws DmcValueException {
        ((UserRIDMO) core).setUserName(value);
    }

    /**
     * Sets userName to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1143)
    public void setUserName(String value){
        ((UserRIDMO) core).setUserName(value);
    }

    /**
     * Removes the userName attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1169)
    public void remUserName(){
        ((UserRIDMO) core).remUserName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1087)
    public String getPassword(){
        return(((UserRIDMO) core).getPassword());
    }

    /**
     * Sets password to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1134)
    public void setPassword(Object value) throws DmcValueException {
        ((UserRIDMO) core).setPassword(value);
    }

    /**
     * Sets password to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1143)
    public void setPassword(String value){
        ((UserRIDMO) core).setPassword(value);
    }

    /**
     * Removes the password attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1169)
    public void remPassword(){
        ((UserRIDMO) core).remPassword();
    }


}

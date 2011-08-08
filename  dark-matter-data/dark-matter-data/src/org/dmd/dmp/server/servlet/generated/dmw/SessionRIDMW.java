package org.dmd.dmp.server.servlet.generated.dmw;

// Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.formatImports(BaseDMWGeneratorNew.java:855)
import org.dmd.dmc.*;                                                 // If any attributes
import org.dmd.dmc.types.DotName;                                     // Primitive type
import org.dmd.dmp.server.servlet.extended.SessionRI;                 // Required for getModificationRecorder()
import org.dmd.dmp.server.servlet.generated.dmo.SessionRIDMO;         // Class not auxiliary or abstract
import org.dmd.dmp.server.servlet.generated.dmw.UserRIDMW;            // Is reference type aux
import org.dmd.dmp.server.servlet.generated.types.UserRIREF;          // To support getMVCopy() for REFs
import org.dmd.dms.*;                                                 // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                           // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeModifierMV;                 // Required for MODREC constructor
import org.dmd.dmw.DmwHierarchicObjectWrapper;                        // Hierarchic object wrapper

/**
 * The SessionRI represents an authenticated user session.
 * <P>
 * Generated from the dmp.server schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNew.dumpWrapper(BaseDMWGeneratorNew.java:290)
 */
public class SessionRIDMW extends DmwHierarchicObjectWrapper implements DmcNamedObjectIF {

    public SessionRIDMW() {
        super(new SessionRIDMO(), org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG._SessionRI);
    }

    public SessionRIDMW(DmcTypeModifierMV mods) {
        super(new SessionRIDMO(mods), org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG._SessionRI);
    }

    public SessionRI getModificationRecorder(){
        SessionRI rc = new SessionRI();
        rc.setDotName(getDotName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    public SessionRIDMW(SessionRIDMO obj) {
        super(obj, org.dmd.dmp.server.servlet.generated.DmpServerSchemaAG._SessionRI);
    }

    public SessionRI cloneIt() {
        SessionRI rc = new SessionRI();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public SessionRIDMO getDMO() {
        return((SessionRIDMO) core);
    }

    protected SessionRIDMW(SessionRIDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.getAccessFunctions(BaseDMWGeneratorNew.java:882)
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

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1027)
    public DotName getDotName(){
        return(((SessionRIDMO) core).getDotName());
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1086)
    public void setDotName(Object value) throws DmcValueException {
        ((SessionRIDMO) core).setDotName(value);
    }

    /**
     * Sets dotName to the specified value.
     * @param value DotName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1095)
    public void setDotName(DotName value){
        ((SessionRIDMO) core).setDotName(value);
    }

    /**
     * Removes the dotName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1121)
    public void remDotName(){
        ((SessionRIDMO) core).remDotName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1027)
    public String getSessionIDRI(){
        return(((SessionRIDMO) core).getSessionIDRI());
    }

    /**
     * Sets sessionIDRI to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1086)
    public void setSessionIDRI(Object value) throws DmcValueException {
        ((SessionRIDMO) core).setSessionIDRI(value);
    }

    /**
     * Sets sessionIDRI to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1095)
    public void setSessionIDRI(String value){
        ((SessionRIDMO) core).setSessionIDRI(value);
    }

    /**
     * Removes the sessionIDRI attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1121)
    public void remSessionIDRI(){
        ((SessionRIDMO) core).remSessionIDRI();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1027)
    public String getSessionHostRI(){
        return(((SessionRIDMO) core).getSessionHostRI());
    }

    /**
     * Sets sessionHostRI to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1086)
    public void setSessionHostRI(Object value) throws DmcValueException {
        ((SessionRIDMO) core).setSessionHostRI(value);
    }

    /**
     * Sets sessionHostRI to the specified value.
     * @param value String
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1095)
    public void setSessionHostRI(String value){
        ((SessionRIDMO) core).setSessionHostRI(value);
    }

    /**
     * Removes the sessionHostRI attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1121)
    public void remSessionHostRI(){
        ((SessionRIDMO) core).remSessionHostRI();
    }

    /**
     * @return A UserRIDMW object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:999)
    public UserRIDMW getUserRefRI(){
        UserRIREF ref = ((SessionRIDMO) core).getUserRefRI();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((UserRIDMW)ref.getObject().getContainer());
    }

    /**
     * Sets the userRefRI to the specified value.
     * @param value A value compatible with UserRIREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1052)
    public void setUserRefRI(UserRIDMW value) {
        ((SessionRIDMO) core).setUserRefRI(value.getDMO());
    }

    /**
     * Removes the userRefRI attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNew.formatSV(BaseDMWGeneratorNew.java:1121)
    public void remUserRefRI(){
        ((SessionRIDMO) core).remUserRefRI();
    }


}

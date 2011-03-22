package org.dmd.features.extgwt.generated.dmw;

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:697)
import java.util.*;                                                   // If not auxiliary
import org.dmd.dmc.*;                                                 // If any attributes
import org.dmd.dmc.types.StringName;                                  // Primitive type
import org.dmd.dms.*;                                                 // Always 2
import org.dmd.features.extgwt.extended.MvcView;                      // Derived class
import org.dmd.features.extgwt.generated.dmo.MvcMultiViewDMO;         // Class not auxiliary or abstract

/**
 * The MvcMultiView provides the same functionality as an MvcView, but is
 * intended to allow for the concept of a controller controlling several
 * views of the same type. For instance, if you several views of different
 * objects, you would want to be able have a different instance of the view
 * for each object.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:342)
 */
abstract public class MvcMultiViewDMW extends MvcView implements DmcNamedObjectIF {

    private MvcMultiViewDMO mycore;

    public MvcMultiViewDMW() {
        super(new MvcMultiViewDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMultiView);
        mycore = (MvcMultiViewDMO) core;
        mycore.setContainer(this);
    }

    public MvcMultiViewDMW(MvcMultiViewDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcMultiView);
        mycore = (MvcMultiViewDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (MvcMultiViewDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected MvcMultiViewDMW(MvcMultiViewDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcMultiViewDMO) core;
    }

    @Override
    protected ArrayList<?> getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcMultiView>());
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:723)
    public StringName getObjectName(){
        return(mycore.getName());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcMultiViewDMW){
            return( getObjectName().equals( ((MvcMultiViewDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:818)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:857)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:866)
    public void setName(StringName value){
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:880)
    public void remName(){
        mycore.remName();
    }


}

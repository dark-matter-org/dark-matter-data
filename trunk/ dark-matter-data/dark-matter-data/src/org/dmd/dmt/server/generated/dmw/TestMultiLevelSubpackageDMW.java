package org.dmd.dmt.server.generated.dmw;

import java.util.*;
import org.dmd.dmc.types.StringName;
import org.dmd.dmc.*;
import org.dmd.dms.*;

// import 3
import org.dmd.dmc.types.StringName;

// import 9
import org.dmd.dmt.shared.generated.dmo.TestMultiLevelSubpackageDMO;

/**
 * The TestOneLevelSubpackage class provides a test bed for generating DMWs
 * in different subpackages.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:229)
 */
public class TestMultiLevelSubpackageDMW extends DmwWrapper implements DmcNamedObjectIF {

    private TestMultiLevelSubpackageDMO mycore;

    public TestMultiLevelSubpackageDMW() {
        super(new TestMultiLevelSubpackageDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._TestMultiLevelSubpackage);
        mycore = (TestMultiLevelSubpackageDMO) core;
        mycore.setContainer(this);
    }

    public TestMultiLevelSubpackageDMW(TestMultiLevelSubpackageDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._TestMultiLevelSubpackage);
        mycore = (TestMultiLevelSubpackageDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (TestMultiLevelSubpackageDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected TestMultiLevelSubpackageDMW(TestMultiLevelSubpackageDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (TestMultiLevelSubpackageDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmt.server.generated.dmw.TestMultiLevelSubpackageDMW>());
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:699)
    public StringName getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof TestMultiLevelSubpackageDMW){
            return( getObjectName().equals( ((TestMultiLevelSubpackageDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:953)
    public Iterator<String> getMvStringValue(){
        return(mycore.getMvStringValue());
    }

    /**
     * Adds another mvStringValue value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:965)
    public void addMvStringValue(Object value) throws DmcValueException {
        mycore.addMvStringValue(value);
    }

    /**
     * Deletes a mvStringValue value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:977)
    public void delMvStringValue(Object value) throws DmcValueException {
        mycore.delMvStringValue(value);
    }

    /**
     * Removes the mvStringValue attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:989)
    public void remMvStringValue(){
        mycore.remMvStringValue();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:792)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:820)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:831)
    public void remName(){
        mycore.remName();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:792)
    public String getSvStringValue(){
        return(mycore.getSvStringValue());
    }

    /**
     * Sets svStringValue to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:820)
    public void setSvStringValue(Object value) throws DmcValueException {
        mycore.setSvStringValue(value);
    }

    /**
     * Removes the svStringValue attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:831)
    public void remSvStringValue(){
        mycore.remSvStringValue();
    }


}

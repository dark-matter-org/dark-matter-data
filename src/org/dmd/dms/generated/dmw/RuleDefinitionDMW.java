//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012-2021 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dms.generated.dmw;


// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1641)
import java.util.*;                                     // To support access functions - (MetaGenerator.java:1614)
import org.dmd.dmc.*;                                   // Basic dark-matter infrastructure - (MetaGenerator.java:1616)
import org.dmd.dmc.definitions.DmcDefinitionIF;         // Because this is a DS definition - (MetaGenerator.java:1629)
import org.dmd.dmc.types.*;                             // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1615)
import org.dmd.dms.*;                                   // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1622)
import org.dmd.dms.generated.dmo.*;                     // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1618)
import org.dmd.dms.generated.enums.*;                   // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1619)
import org.dmd.dms.generated.types.*;                   // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1620)
import org.dmd.dmw.*;                                   // Base wrapper capabilities - (MetaGenerator.java:1617)
import org.dmd.util.exceptions.*;                       // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1621)

/**
 * The RuleDefinition allows for the definition of rules that can\n be
 * applied to attributes or classes. Rules are not just for validation,
 * they\n can be applied to objects at different times in an object's life
 * cycle e.g. \n the InitRule can initialize a set of attributes to known
 * values.\n <p>\n RuleDefinitions will result in the generation of
 * ClassDefinitions that define the \n DMOs that will carry the parameters
 * associated with the rule and the expectation\n that you will define an
 * implementation class for the rule that derives from\n an abstract BaseImpl
 * (base implementation) of the rule that provides common\n rule
 * infrastructure and appropriate abstract methods that must be filled in.\n
 * <p>\n RuleDefinitions and ClassDefinitions share the same dmdID space and
 * the IDs must\n be unique. This is because each RuleDefinition results in
 * the creation of a \n ClassDefinition for the DMO part of the rule that
 * carries the rule parameters. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1649)
 */
@SuppressWarnings("unused")
public class RuleDefinitionDMW extends org.dmd.dms.DmsDefinition implements DmcDefinitionIF {

    private RuleDefinitionDMO mycore;

    protected RuleDefinitionDMW() {
        super(new RuleDefinitionDMO());
        mycore = (RuleDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected RuleDefinitionDMW(DmcObject obj) {
        super(obj);
        mycore = (RuleDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected RuleDefinitionDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (RuleDefinitionDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        core   = obj;
        mycore = (RuleDefinitionDMO) obj;
        obj.setContainer(this);
    }

    public  RuleDefinitionDMO getDMO() {
        return(mycore);
    }

    protected RuleDefinitionDMW(ClassDefinition cd) {
        super(cd);
    }

    protected RuleDefinitionDMW(String mn) throws DmcValueException {
        super(new RuleDefinitionDMO());
        mycore = (RuleDefinitionDMO) core;
        mycore.setContainer(this);
        mycore.setName(mn);
        metaname = mn;
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers. 
     * @return the DefinitionName
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2404)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2470)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * The category of a rule. 
     * @return the RuleCategory
     * @return An Iterator of RuleCategory objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public RuleCategoryIterableDMW getRuleCategory(){
        DmcTypeRuleCategoryREFMV attr = (DmcTypeRuleCategoryREFMV) mycore.get(MetaDMSAG.__ruleCategory);
        if (attr == null)
            return(RuleCategoryIterableDMW.emptyList);

        return(new RuleCategoryIterableDMW(attr.getMV()));
    }

    /**
     * Adds another ruleCategory value.
     * @param value A value compatible with RuleCategory
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2654)
    public DmcAttribute<?> addRuleCategory(RuleCategory value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addRuleCategory(value.getDmcObject());
        return(attr);
    }

    /**
     * @return the number of ruleCategory values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getRuleCategorySize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__ruleCategory);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * The dmdID attribute is used to store a unique Dark Matter Definition ID
     * for attributes.\n This is used as part of the serialization mechanisms
     * built into Dark Matter Objects. 
     * @return the Integer
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2404)
    public Integer getDmdID(){
        return(mycore.getDmdID());
    }

    /**
     * Sets dmdID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2470)
    public void setDmdID(Object value) throws DmcValueException {
        mycore.setDmdID(value);
    }

    /**
     * Indicates the set of attributes that an instance of a class MUST have. 
     * @return the AttributeDefinition
     * @return An Iterator of AttributeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public AttributeDefinitionIterableDMW getMust(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(MetaDMSAG.__must);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another must value.
     * @param value A value compatible with AttributeDefinition
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2654)
    public DmcAttribute<?> addMust(AttributeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addMust(value.getDmcObject());
        return(attr);
    }

    /**
     * @return the number of must values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getMustSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__must);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates the set of attributes that an instance of a class MAY\n have.
     * When accessed in Java, this is a set of references to
     * AttributeDefinition\n objects. 
     * @return the AttributeDefinition
     * @return An Iterator of AttributeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2581)
    public AttributeDefinitionIterableDMW getMay(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(MetaDMSAG.__may);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another may value.
     * @param value A value compatible with AttributeDefinition
     * @return the attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2654)
    public DmcAttribute<?> addMay(AttributeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addMay(value.getDmcObject());
        return(attr);
    }

    /**
     * @return the number of may values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public int getMaySize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__may);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates whether or not the ClassDefinition associated with a
     * RuleDefinition has classType EXTENSIBLE\n or not. This mechanism is useful
     * in situations where the exact set of attributes associated with a rule
     * must be flexible.\n The best example is the InitRule where any set of
     * attributes can be specified as value for the rule. 
     * @return the Boolean
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2404)
    public Boolean getIsExtensible(){
        return(mycore.getIsExtensible());
    }

    /**
     * Sets isExtensible to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2470)
    public void setIsExtensible(Object value) throws DmcValueException {
        mycore.setIsExtensible(value);
    }

    /**
     * A reference to a single Dependency. 
     * @return the Dependency
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2404)
    public Dependency getDependency(){
        DmcTypeDependencyREFSV attr = (DmcTypeDependencyREFSV) mycore.get(MetaDMSAG.__dependency);
        if (attr == null)
            return(null);
        DependencyDMO obj = attr.getSV().getObject();
        return((Dependency)obj.getContainer());
    }

    /**
     * Sets dependency to the specified value.
     * @param value A value compatible with Dependency
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2460)
    public void setDependency(Dependency value) throws DmcValueException {
        mycore.setDependency(value.getDmcObject());
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1816)

    /**
     * @return The name of this object from the name attribute.
     */
    public DefinitionName getObjectName(){
        return(mycore.getObjectName());
    }


    /**
     * @return The name attribute.
     */
    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

}

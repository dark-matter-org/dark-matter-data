//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
package org.dmd.dms.server.generated.dmw;


// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpDMWClasses(DmwFormatter.java:105)
import java.util.*;                                  // To support access functions - (DmwFormatter.java:75)
import org.dmd.core.*;                               // Basic dark-matter infrastructure - (DmwFormatter.java:77)
import org.dmd.core.feedback.*;                      // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:83)
import org.dmd.dms.server.extended.*;                // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:79)
import org.dmd.dms.shared.generated.dmo.*;           // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:80)
import org.dmd.dms.shared.generated.enums.*;         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:81)
import org.dmd.dms.shared.generated.types.*;         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:82)
import org.dmd.dms.shared.types.*;                   // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:76)
import org.dmd.dmw.*;                                // Base wrapper capabilities - (DmwFormatter.java:78)

/**
 * The RuleDefinition allows for the definition of rules that can be applied
 * to attributes or classes. Rules are not just for validation, they can be
 * applied to objects at different times in an object's life cycle e.g.  the
 * InitRule can initialize a set of attributes to known values. <p/>
 * RuleDefinitions will result in the generation of ClassDefinitions that
 * define the  DMOs that will carry the parameters associated with the rule
 * and the expectation that you will define an implementation class for the
 * rule that derives from an abstract BaseImpl (base implementation) of the
 * rule that provides common rule infrastructure and appropriate abstract
 * methods that must be filled in. <p/> RuleDefinitions and ClassDefinitions
 * share the same dmdID space and the IDs must be unique. This is because
 * each RuleDefinition results in the creation of a  ClassDefinition for the
 * DMO part of the rule that carries the rule parameters. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpDMWClasses(DmwFormatter.java:113)
 */
@SuppressWarnings("unused")
public class RuleDefinitionDMW extends org.dmd.dms.server.extended.DmsDefinition  {

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

    public  RuleDefinitionDMO getDMO() {
        return(mycore);
    }

    protected RuleDefinitionDMW(ClassDefinition cd) {
        super(cd);
    }

    /**
     * How a name is composed will depend on the context in which it used. For
     * instance, the names of definitions specified as part of a dark-matter
     * schema will conform to conventions of naming classes and or attributes in
     * Java. <p/> The generated documentation for a set of Domain Specific
     * Language (DSL) concepts will indicate the rules that apply to a name in
     * that DSL. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setName(Object value) throws DMFeedbackSet {
        mycore.setName(value);
    }

    /**
     * The category of a rule. 
     * @return An Iterator of RuleCategory objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:304)
    public RuleCategoryIterableDMW getRuleCategory(){
        DmcTypeRuleCategoryREFMV attr = (DmcTypeRuleCategoryREFMV) mycore.get(MetaCompactSchema.__ruleCategory);
        if (attr == null)
            return(RuleCategoryIterableDMW.emptyList);

        return(new RuleCategoryIterableDMW(attr.getMV()));
    }

    /**
     * Adds another ruleCategory value.
     * @param value A value compatible with RuleCategory
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:386)
    public DmcAttribute<?> addRuleCategory(RuleCategory value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addRuleCategory(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of ruleCategory values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:405)
    public int getRuleCategorySize(){
        DmcAttribute<?> attr = mycore.get(MetaCompactSchema.__ruleCategory);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if ruleCategory has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:416)
    public boolean getRuleCategoryHasValue(){
        return(getRuleCategorySize() > 0);
    }

    /**
     * Dark-matter identifiers facilitate the compact serialization of
     * dark-matter objects (DMOs); see the serializeIt() and deserializeIt()
     * methods of the DmcObject. <p/> This mechanism also allows for compact
     * transport of dark-matter objects when used with Google Web Toolkit (GWT)
     * RPC mechanisms. When objects are passed back and forth via RPC, the
     * dark-matter identifiers are used instead of the string-based attribute
     * names, which are usually much more lengthy. This optimization is
     * transparently supported by the  DmcObject; you don't need to worry about
     * how it's achieved. <p/> However, if you're curious, have a look at the
     * Compact Schema documentation. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public Integer getDmdID(){
        return(mycore.getDmdID());
    }

    /**
     * Sets dmdID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setDmdID(Object value) throws DMFeedbackSet {
        mycore.setDmdID(value);
    }

    /**
     * Indicates the set of attributes that an instance of a class MUST have. 
     * @return An Iterator of AttributeDefinition objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:304)
    public AttributeDefinitionIterableDMW getMust(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(MetaCompactSchema.__must);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another must value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:386)
    public DmcAttribute<?> addMust(AttributeDefinition value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addMust(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of must values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:405)
    public int getMustSize(){
        DmcAttribute<?> attr = mycore.get(MetaCompactSchema.__must);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if must has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:416)
    public boolean getMustHasValue(){
        return(getMustSize() > 0);
    }

    /**
     * Indicates the set of attributes that an instance of a class MAY have. When
     * accessed in Java, this is a set of references to AttributeDefinition
     * objects. 
     * @return An Iterator of AttributeDefinition objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:304)
    public AttributeDefinitionIterableDMW getMay(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(MetaCompactSchema.__may);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another may value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:386)
    public DmcAttribute<?> addMay(AttributeDefinition value) throws DMFeedbackSet {
        DmcAttribute<?> attr = mycore.addMay(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of may values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:405)
    public int getMaySize(){
        DmcAttribute<?> attr = mycore.get(MetaCompactSchema.__may);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if may has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:416)
    public boolean getMayHasValue(){
        return(getMaySize() > 0);
    }

    /**
     * Indicates whether or not the ClassDefinition associated with a
     * RuleDefinition has classType EXTENSIBLE or not. This mechanism is useful
     * in situations where the exact set of attributes associated with a rule
     * must be flexible. The best example is the InitRule where any set of
     * attributes can be specified as value for the rule. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public Boolean getIsExtensible(){
        return(mycore.getIsExtensible());
    }

    /**
     * Sets isExtensible to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:189)
    public void setIsExtensible(Object value) throws DMFeedbackSet {
        mycore.setIsExtensible(value);
    }

    /**
     * A reference to a single Dependency. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:131)
    public Dependency getDependency(){
        DmcTypeDependencyREFSV attr = (DmcTypeDependencyREFSV) mycore.get(MetaCompactSchema.__dependency);
        if (attr == null)
            return(null);
        DependencyDMO obj = attr.getSV().getObject();
        return((Dependency)obj.getContainer());
    }

    /**
     * Sets dependency to the specified value.
     * @param value A value compatible with Dependency
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:180)
    public void setDependency(Dependency value) throws DMFeedbackSet {
        mycore.setDependency(value.getDmcObject());
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpDMWClasses(DmwFormatter.java:271)

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

    // Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.dumpAdditionalWrapperFunctions(MetaDSDHelper.java:1029)
    /**
     * This method indicates the name of the module from which this definition was loaded.
     */
    @Override
    public String getNameOfModuleWhereThisCameFrom(){
        DmsModuleREF ref = ((RuleDefinitionDMO) core).getDefinedInDmsModule();
        return(ref.getName().getNameString());
    }

}

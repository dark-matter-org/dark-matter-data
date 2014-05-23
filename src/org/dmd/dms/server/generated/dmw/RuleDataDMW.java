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
 * The RuleData class serves as a common base for all ClassDefinitions that
 * are generated internally to represent the data associated with
 * RuleDefinitions. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpDMWClasses(DmwFormatter.java:113)
 */
@SuppressWarnings("unused")
public abstract class RuleDataDMW extends DmwNamedObjectWrapper {

    private RuleDataDMO mycore;

    protected RuleDataDMW() {
        super(new RuleDataDMO());
        mycore = (RuleDataDMO) core;
        mycore.setContainer(this);
    }

    protected RuleDataDMW(DmcObject obj) {
        super(obj);
        mycore = (RuleDataDMO) core;
        mycore.setContainer(this);
    }

    protected RuleDataDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (RuleDataDMO) core;
        mycore.setContainer(this);
    }

    public  RuleDataDMO getDMO() {
        return(mycore);
    }

    /**
     * The title of a rule. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:128)
    public String getRuleTitle(){
        return(mycore.getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:186)
    public void setRuleTitle(Object value) throws DMFeedbackSet {
        mycore.setRuleTitle(value);
    }

    /**
     * The ruleName attribute is used to store a single camelCase format name for
     * a rule. The name starts with a single letter and can be followed by a mix
     * of letters and numbers. No spaces or  other characters are allowed. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:128)
    public RuleName getRuleName(){
        return(mycore.getRuleName());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleNameSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:186)
    public void setRuleName(Object value) throws DMFeedbackSet {
        mycore.setRuleName(value);
    }

    /**
     * The detailed description of some concept definition. The description is
     * multi-valued and is used in the generation of documentation. By
     * convention, it should follow XHTML guidelines in terms of its content. 
     * <p/> Also by convention, the first element of the description should be a
     * short, simple indication of the concept that is suitable for inclusion as
     * a code comment; this is primarily used in dark-matter schema (DMS)
     * specifications since dark-matter object (DMO) and dark-matter wrapper
     * (DMW) Java code is generated from these specifications. <p/> When defining
     * your own Domain Specific Languages (DSLs), feel free to follow whatever
     * conventions make sense for your purposes. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:322)
    public StringIterableDMW getDescriptionIterable(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(StringIterableDMW.emptyList);

        return(new StringIterableDMW(attr.getMV()));
    }

    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:335)
    public Iterator<String> getDescriptionWithNewlines(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        DmcTypeStringMV withNewLines = new DmcTypeStringMV();
        Iterator<String> it = attr.getMV();
        while(it.hasNext()){
            try{
                withNewLines.add(it.next().replaceAll("\\\\n","\\\n"));
            } catch (DMFeedbackSet e) {
                e.printStackTrace();
            }
        }

        return(withNewLines.getMV());
    }

    /**
     * Adds another description value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:390)
    public void addDescription(Object value) throws DMFeedbackSet {
        mycore.addDescription(value);
    }

    /**
     * Returns the number of description values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:399)
    public int getDescriptionSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if description has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:410)
    public boolean getDescriptionHasValue(){
        return(getDescriptionSize() > 0);
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:128)
    public SchemaDefinition getDefinedIn(){
        DmcTypeSchemaDefinitionREFSV attr = (DmcTypeSchemaDefinitionREFSV) mycore.get(MetaDMSAG.__definedIn);
        if (attr == null)
            return(null);
        SchemaDefinitionDMO obj = attr.getSV().getObject();
        return((SchemaDefinition)obj.getContainer());
    }

    /**
     * Sets definedIn to the specified value.
     * @param value A value compatible with SchemaDefinition
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:177)
    public void setDefinedIn(SchemaDefinition value) throws DMFeedbackSet {
        mycore.setDefinedIn(value.getDmcObject());
    }

    /**
     * Indicates the file from which a definition was loaded. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:128)
    public String getFile(){
        return(mycore.getFile());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:186)
    public void setFile(Object value) throws DMFeedbackSet {
        mycore.setFile(value);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:128)
    public Integer getLineNumber(){
        return(mycore.getLineNumber());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:186)
    public void setLineNumber(Object value) throws DMFeedbackSet {
        mycore.setLineNumber(value);
    }

    /**
     * The class to which a rule should be applied. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:128)
    public ClassDefinition getApplyToClass(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) mycore.get(MetaDMSAG.__applyToClass);
        if (attr == null)
            return(null);
        ClassDefinitionDMO obj = attr.getSV().getObject();
        return((ClassDefinition)obj.getContainer());
    }

    /**
     * Sets applyToClass to the specified value.
     * @param value A value compatible with ClassDefinition
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:177)
    public void setApplyToClass(ClassDefinition value) throws DMFeedbackSet {
        mycore.setApplyToClass(value.getDmcObject());
    }

    /**
     * The immediateHalt flag is used to indicate that no further rule processing
     * should occur if a rule fails. It is an optional attribute on rule instance
     * objects. In somes cases, there is no point in continuing with the
     * application of a set  of rules, so this flag gives the option of halting
     * further processing. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:128)
    public Boolean getImmediateHalt(){
        return(mycore.getImmediateHalt());
    }

    /**
     * Sets immediateHalt to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:186)
    public void setImmediateHalt(Object value) throws DMFeedbackSet {
        mycore.setImmediateHalt(value);
    }

    /**
     * The msgKey may be specified on rule instances to indicate the key to be
     * used to look up translated messages. This is primarily a GWT mechanism,
     * but should be applicable in other contexts. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:128)
    public String getMsgKey(){
        return(mycore.getMsgKey());
    }

    /**
     * Sets msgKey to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:186)
    public void setMsgKey(Object value) throws DMFeedbackSet {
        mycore.setMsgKey(value);
    }

    /**
     * The msgParam allows for the specification of parameters to be substituted
     * into translated messages. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:322)
    public StringIterableDMW getMsgParamIterable(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__msgParam);
        if (attr == null)
            return(StringIterableDMW.emptyList);

        return(new StringIterableDMW(attr.getMV()));
    }

    /**
     * Adds another msgParam value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:390)
    public void addMsgParam(Object value) throws DMFeedbackSet {
        mycore.addMsgParam(value);
    }

    /**
     * Returns the number of msgParam values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:399)
    public int getMsgParamSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__msgParam);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Returns true if msgParam has values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:410)
    public boolean getMsgParamHasValue(){
        return(getMsgParamSize() > 0);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpDMWClasses(DmwFormatter.java:271)

    /**
     * @return The name of this object from the ruleName attribute.
     */
    public RuleName getObjectName(){
        return(mycore.getObjectName());
    }


    /**
     * @return The ruleName attribute.
     */
    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

}

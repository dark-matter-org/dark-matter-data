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
package org.dmd.dms.shared.generated.dmo;

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.meta.DmoFormatter.formatDMOForClass(DmoFormatter.java:100)
import java.io.Serializable;                             // Serializable marker interface - (DmoFormatter.java:58)
import java.util.*;                                      // Attribute info support - (DmoFormatter.java:59)
import org.dmd.core.*;                                   // dark-matter core - (DmoFormatter.java:80)
import org.dmd.core.feedback.DMFeedbackSet;              // To allow error feedback - (DmoFormatter.java:79)
import org.dmd.core.interfaces.DmcNamedObjectIF;         // Required for our base definition - (DmoFormatter.java:63)
import org.dmd.core.schema.DmcAttributeInfo;             // To access attribute info - (DmoFormatter.java:81)
import org.dmd.core.schema.DmcSliceInfo;                 // To allow object slicing - (DmoFormatter.java:82)
import org.dmd.dms.shared.generated.types.*;             // Generated type access - (DmoFormatter.java:93)
import org.dmd.dms.shared.types.*;                       // Basic type access - (DmoFormatter.java:76)



/**
 * The RuleData class serves as a common base for all ClassDefinitions that
 * are generated internally to represent the data associated with
 * RuleDefinitions. 
 * Generated from: org.dmd.dms.tools.generation.meta.DmoFormatter.formatDMOForClass(DmoFormatter.java:108)
 */
@SuppressWarnings("serial")
public class RuleDataDMO extends DmcObject implements DmcNamedObjectIF, Serializable  {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(MetaDMSAG.__ruleName.id,MetaDMSAG.__ruleName);
        _ImAp.put(MetaDMSAG.__ruleTitle.id,MetaDMSAG.__ruleTitle);
        _ImAp.put(MetaDMSAG.__applyToClass.id,MetaDMSAG.__applyToClass);
        _ImAp.put(MetaDMSAG.__definedIn.id,MetaDMSAG.__definedIn);
        _ImAp.put(MetaDMSAG.__description.id,MetaDMSAG.__description);
        _ImAp.put(MetaDMSAG.__file.id,MetaDMSAG.__file);
        _ImAp.put(MetaDMSAG.__immediateHalt.id,MetaDMSAG.__immediateHalt);
        _ImAp.put(MetaDMSAG.__lineNumber.id,MetaDMSAG.__lineNumber);
        _ImAp.put(MetaDMSAG.__msgKey.id,MetaDMSAG.__msgKey);
        _ImAp.put(MetaDMSAG.__msgParam.id,MetaDMSAG.__msgParam);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaDMSAG.__ruleName.name,MetaDMSAG.__ruleName);
        _SmAp.put(MetaDMSAG.__ruleTitle.name,MetaDMSAG.__ruleTitle);
        _SmAp.put(MetaDMSAG.__applyToClass.name,MetaDMSAG.__applyToClass);
        _SmAp.put(MetaDMSAG.__definedIn.name,MetaDMSAG.__definedIn);
        _SmAp.put(MetaDMSAG.__description.name,MetaDMSAG.__description);
        _SmAp.put(MetaDMSAG.__file.name,MetaDMSAG.__file);
        _SmAp.put(MetaDMSAG.__immediateHalt.name,MetaDMSAG.__immediateHalt);
        _SmAp.put(MetaDMSAG.__lineNumber.name,MetaDMSAG.__lineNumber);
        _SmAp.put(MetaDMSAG.__msgKey.name,MetaDMSAG.__msgKey);
        _SmAp.put(MetaDMSAG.__msgParam.name,MetaDMSAG.__msgParam);
    }


    public RuleDataDMO(){
        super("RuleData");
    }

    public RuleDataDMO(String oc){
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public RuleDataDMO getNew(){
        RuleDataDMO rc = new RuleDataDMO();
        return(rc);
    }

    @Override
    public RuleDataDMO getSlice(DmcSliceInfo info){
        RuleDataDMO rc = new RuleDataDMO();
        populateSlice(rc,info);
        return(rc);
    }

    /**
     * The ruleName attribute is used to store a single camelCase format name for
     * a rule. The name starts with a single letter and can be followed by a mix
     * of letters and numbers. No spaces or  other characters are allowed. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:79)
    public RuleName getRuleName(){
        DmcTypeRuleNameSV attr = (DmcTypeRuleNameSV) get(MetaDMSAG.__ruleName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleNameSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:161)
    public void setRuleName(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__ruleName);
        if (attr == null)
            attr = new DmcTypeRuleNameSV(MetaDMSAG.__ruleName);
        
        attr.set(value);
        set(MetaDMSAG.__ruleName,attr);
    }

    /**
     * The title of a rule. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:79)
    public String getRuleTitle(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__ruleTitle);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:161)
    public void setRuleTitle(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__ruleTitle);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__ruleTitle);
        
        attr.set(value);
        set(MetaDMSAG.__ruleTitle,attr);
    }

    /**
     * The class to which a rule should be applied. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:79)
    public ClassDefinitionREF getApplyToClass(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) get(MetaDMSAG.__applyToClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets applyToClass to the specified value.
     * @param value A value compatible with DmcTypeClassDefinitionREFSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:161)
    public void setApplyToClass(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__applyToClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSV(MetaDMSAG.__applyToClass);
        
        attr.set(value);
        set(MetaDMSAG.__applyToClass,attr);
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:79)
    public SchemaDefinitionREF getDefinedIn(){
        DmcTypeSchemaDefinitionREFSV attr = (DmcTypeSchemaDefinitionREFSV) get(MetaDMSAG.__definedIn);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets definedIn to the specified value.
     * @param value A value compatible with DmcTypeSchemaDefinitionREFSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:161)
    public void setDefinedIn(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__definedIn);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREFSV(MetaDMSAG.__definedIn);
        
        attr.set(value);
        set(MetaDMSAG.__definedIn,attr);
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:260)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:273)
    public Iterator<String> getDescriptionWithNewlines(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:364)
    public DmcAttribute<?> addDescription(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__description);
        
        attr.add(value);
        add(MetaDMSAG.__description,attr);
        return(attr);
    }

    /**
     * Indicates the file from which a definition was loaded. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:79)
    public String getFile(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__file);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:161)
    public void setFile(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__file);
        
        attr.set(value);
        set(MetaDMSAG.__file,attr);
    }

    /**
     * The immediateHalt flag is used to indicate that no further rule processing
     * should occur if a rule fails. It is an optional attribute on rule instance
     * objects. In somes cases, there is no point in continuing with the
     * application of a set  of rules, so this flag gives the option of halting
     * further processing. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:79)
    public Boolean getImmediateHalt(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaDMSAG.__immediateHalt);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets immediateHalt to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:161)
    public void setImmediateHalt(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__immediateHalt);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaDMSAG.__immediateHalt);
        
        attr.set(value);
        set(MetaDMSAG.__immediateHalt,attr);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:79)
    public Integer getLineNumber(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaDMSAG.__lineNumber);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:161)
    public void setLineNumber(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaDMSAG.__lineNumber);
        
        attr.set(value);
        set(MetaDMSAG.__lineNumber,attr);
    }

    /**
     * The msgKey may be specified on rule instances to indicate the key to be
     * used to look up translated messages. This is primarily a GWT mechanism,
     * but should be applicable in other contexts. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:79)
    public String getMsgKey(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__msgKey);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets msgKey to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:161)
    public void setMsgKey(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__msgKey);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__msgKey);
        
        attr.set(value);
        set(MetaDMSAG.__msgKey,attr);
    }

    /**
     * The msgParam allows for the specification of parameters to be substituted
     * into translated messages. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:260)
    public Iterator<String> getMsgParam(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__msgParam);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another msgParam value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:364)
    public DmcAttribute<?> addMsgParam(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaDMSAG.__msgParam);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__msgParam);
        
        attr.add(value);
        add(MetaDMSAG.__msgParam,attr);
        return(attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.tools.generation.meta.DmoFormatter.formatDMOForClass(DmoFormatter.java:249)

    /**
     * @return The name of this object from the ruleName attribute.
     */
    @Override
    public RuleName getObjectName(){
        DmcTypeRuleName attr = (DmcTypeRuleName) get(MetaDMSAG.__ruleName);
        if (attr == null)
            return(null);
        return(attr.getSV());
    }


    /**
     * @return The ruleName attribute.
     */
    @Override
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> attr = (DmcTypeRuleName) get(MetaDMSAG.__ruleName);
        return(attr);
    }

}

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
        _ImAp.put(MetaCompactSchema.__ruleName.id,MetaCompactSchema.__ruleName);
        _ImAp.put(MetaCompactSchema.__ruleTitle.id,MetaCompactSchema.__ruleTitle);
        _ImAp.put(MetaCompactSchema.__applyToClass.id,MetaCompactSchema.__applyToClass);
        _ImAp.put(MetaCompactSchema.__description.id,MetaCompactSchema.__description);
        _ImAp.put(MetaCompactSchema.__file.id,MetaCompactSchema.__file);
        _ImAp.put(MetaCompactSchema.__immediateHalt.id,MetaCompactSchema.__immediateHalt);
        _ImAp.put(MetaCompactSchema.__lineNumber.id,MetaCompactSchema.__lineNumber);
        _ImAp.put(MetaCompactSchema.__msgKey.id,MetaCompactSchema.__msgKey);
        _ImAp.put(MetaCompactSchema.__msgParam.id,MetaCompactSchema.__msgParam);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaCompactSchema.__ruleName.name,MetaCompactSchema.__ruleName);
        _SmAp.put(MetaCompactSchema.__ruleTitle.name,MetaCompactSchema.__ruleTitle);
        _SmAp.put(MetaCompactSchema.__applyToClass.name,MetaCompactSchema.__applyToClass);
        _SmAp.put(MetaCompactSchema.__description.name,MetaCompactSchema.__description);
        _SmAp.put(MetaCompactSchema.__file.name,MetaCompactSchema.__file);
        _SmAp.put(MetaCompactSchema.__immediateHalt.name,MetaCompactSchema.__immediateHalt);
        _SmAp.put(MetaCompactSchema.__lineNumber.name,MetaCompactSchema.__lineNumber);
        _SmAp.put(MetaCompactSchema.__msgKey.name,MetaCompactSchema.__msgKey);
        _SmAp.put(MetaCompactSchema.__msgParam.name,MetaCompactSchema.__msgParam);
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public RuleName getRuleName(){
        DmcTypeRuleNameSV attr = (DmcTypeRuleNameSV) get(MetaCompactSchema.__ruleName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets ruleName to the specified value.
     * @param value A value compatible with DmcTypeRuleNameSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setRuleName(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__ruleName);
        if (attr == null)
            attr = new DmcTypeRuleNameSV(MetaCompactSchema.__ruleName);
        
        attr.set(value);
        set(MetaCompactSchema.__ruleName,attr);
    }

    /**
     * The title of a rule. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public String getRuleTitle(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaCompactSchema.__ruleTitle);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setRuleTitle(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__ruleTitle);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaCompactSchema.__ruleTitle);
        
        attr.set(value);
        set(MetaCompactSchema.__ruleTitle,attr);
    }

    /**
     * The class to which a rule should be applied. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public ClassDefinitionREF getApplyToClass(){
        DmcTypeClassDefinitionREFSV attr = (DmcTypeClassDefinitionREFSV) get(MetaCompactSchema.__applyToClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets applyToClass to the specified value.
     * @param value A value compatible with DmcTypeClassDefinitionREFSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setApplyToClass(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__applyToClass);
        if (attr == null)
            attr = new DmcTypeClassDefinitionREFSV(MetaCompactSchema.__applyToClass);
        
        attr.set(value);
        set(MetaCompactSchema.__applyToClass,attr);
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaCompactSchema.__description);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:279)
    public Iterator<String> getDescriptionWithNewlines(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaCompactSchema.__description);
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addDescription(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__description);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaCompactSchema.__description);
        
        attr.add(value);
        add(MetaCompactSchema.__description,attr);
        return(attr);
    }

    /**
     * Indicates the file from which a definition was loaded. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public String getFile(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaCompactSchema.__file);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setFile(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__file);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaCompactSchema.__file);
        
        attr.set(value);
        set(MetaCompactSchema.__file,attr);
    }

    /**
     * The immediateHalt flag is used to indicate that no further rule processing
     * should occur if a rule fails. It is an optional attribute on rule instance
     * objects. In somes cases, there is no point in continuing with the
     * application of a set  of rules, so this flag gives the option of halting
     * further processing. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public Boolean getImmediateHalt(){
        DmcTypeBooleanSV attr = (DmcTypeBooleanSV) get(MetaCompactSchema.__immediateHalt);
        if (attr == null)
            return(false);

        return(attr.getSV());
    }

    /**
     * Sets immediateHalt to the specified value.
     * @param value A value compatible with DmcTypeBooleanSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setImmediateHalt(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__immediateHalt);
        if (attr == null)
            attr = new DmcTypeBooleanSV(MetaCompactSchema.__immediateHalt);
        
        attr.set(value);
        set(MetaCompactSchema.__immediateHalt,attr);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public Integer getLineNumber(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MetaCompactSchema.__lineNumber);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setLineNumber(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__lineNumber);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MetaCompactSchema.__lineNumber);
        
        attr.set(value);
        set(MetaCompactSchema.__lineNumber,attr);
    }

    /**
     * The msgKey may be specified on rule instances to indicate the key to be
     * used to look up translated messages. This is primarily a GWT mechanism,
     * but should be applicable in other contexts. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:82)
    public String getMsgKey(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaCompactSchema.__msgKey);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets msgKey to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:164)
    public void setMsgKey(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__msgKey);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaCompactSchema.__msgKey);
        
        attr.set(value);
        set(MetaCompactSchema.__msgKey,attr);
    }

    /**
     * The msgParam allows for the specification of parameters to be substituted
     * into translated messages. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:266)
    public Iterator<String> getMsgParam(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaCompactSchema.__msgParam);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another msgParam value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:370)
    public DmcAttribute<?> addMsgParam(Object value) throws DMFeedbackSet {
        DmcAttribute<?> attr = get(MetaCompactSchema.__msgParam);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaCompactSchema.__msgParam);
        
        attr.add(value);
        add(MetaCompactSchema.__msgParam,attr);
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
        DmcTypeRuleName attr = (DmcTypeRuleName) get(MetaCompactSchema.__ruleName);
        if (attr == null)
            return(null);
        return(attr.getSV());
    }


    /**
     * @return The ruleName attribute.
     */
    @Override
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> attr = (DmcTypeRuleName) get(MetaCompactSchema.__ruleName);
        return(attr);
    }

}

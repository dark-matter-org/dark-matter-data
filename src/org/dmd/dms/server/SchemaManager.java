package org.dmd.dms.server;

import java.util.Iterator;

import org.dmd.core.DmcObject;
import org.dmd.core.DmcObjectName;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.interfaces.DmcNameClashResolverIF;
import org.dmd.core.interfaces.DmcNamedObjectIF;
import org.dmd.core.schema.DmcAttributeInfo;
import org.dmd.dms.server.extended.ActionDefinition;
import org.dmd.dms.server.extended.AttributeDefinition;
import org.dmd.dms.server.extended.ClassDefinition;
import org.dmd.dms.server.extended.ComplexTypeDefinition;
import org.dmd.dms.server.extended.DSDefinitionModule;
import org.dmd.dms.server.extended.DmsModule;
import org.dmd.dms.server.extended.EnumDefinition;
import org.dmd.dms.server.extended.ExtendedReferenceTypeDefinition;
import org.dmd.dms.server.extended.RuleCategory;
import org.dmd.dms.server.extended.RuleDefinition;
import org.dmd.dms.server.extended.SliceDefinition;
import org.dmd.dms.server.extended.TypeDefinition;
import org.dmd.dms.server.generated.MetaDmsModule;
import org.dmd.dms.server.generated.dsd.DmsModuleDefinitionManager;
import org.dmd.dms.shared.generated.dmo.MetaDMSAG;
import org.dmd.util.runtime.DebugInfo;

public class SchemaManager extends DmsModuleDefinitionManager {
	
	public SchemaManager() throws DMFeedbackSet {
		MetaDmsModule meta = new MetaDmsModule();
		manageSchema(meta);
		
		resolveReferences();
	}
	
    @Override
    public DmcNamedObjectIF findNamedObjectMayClash(DmcObject object, DmcObjectName name, DmcNameClashResolverIF resolver, DmcAttributeInfo ai) throws DMFeedbackSet {
    	if (ai.id == MetaDMSAG.__baseDefinition.id){
    		if (name.getNameString().equals("meta.DmsDefinition")){
    			return(getClassDefinition("DmsDefinition"));
    		}
    	}
    	
    	if (ai.id == MetaDMSAG.__requiredPart.id){
    		DebugInfo.debug("HERE");
    	}
    		
    	return(super.findNamedObjectMayClash(object, name, resolver, ai));
    }
	
	public void manageSchema(DmsModule mod) throws DMFeedbackSet {
		// If we've already loaded the schema, return
		if (findNamedObject(mod.getName()) != null)
			return;
		
		addDmsModule(mod);
		
		Iterator<ActionDefinition>	actionIT = mod.getAllActionDefinition();
		while(actionIT.hasNext())
			addActionDefinition(actionIT.next());

		Iterator<AttributeDefinition>	attributeIT = mod.getAllAttributeDefinition();
		while(attributeIT.hasNext())
			addAttributeDefinition(attributeIT.next());
		
		Iterator<ClassDefinition> classIT = mod.getAllClassDefinition();
		while(classIT.hasNext())
			addClassDefinition(classIT.next());
		
		Iterator<ComplexTypeDefinition> complexIT = mod.getAllComplexTypeDefinition();
		while(complexIT.hasNext())
			addComplexTypeDefinition(complexIT.next());
		
		Iterator<ExtendedReferenceTypeDefinition> extendedIT = mod.getAllExtendedReferenceTypeDefinition();
		while(extendedIT.hasNext())
			addExtendedReferenceTypeDefinition(extendedIT.next());
		
//		mod.getAllDependency();
		
//		mod.getAllDependencyImplementation();
		
		Iterator<EnumDefinition> enumIT = mod.getAllEnumDefinition();
		while(enumIT.hasNext())
			addEnumDefinition(enumIT.next());
		
		Iterator<RuleCategory> categoryIT = mod.getAllRuleCategory();
		while(categoryIT.hasNext())
			addRuleCategory(categoryIT.next());
		
		Iterator<RuleDefinition> ruleIT = mod.getAllRuleDefinition();
		while(ruleIT.hasNext())
			addRuleDefinition(ruleIT.next());
		
//		mod.getAllRunContext();
		
		Iterator<SliceDefinition> sliceIT = mod.getAllSliceDefinition();
		while(sliceIT.hasNext())
			addSliceDefinition(sliceIT.next());
		
		Iterator<TypeDefinition> typeIT = mod.getAllTypeDefinition();
		while(typeIT.hasNext())
			addTypeDefinition(typeIT.next());
		
		Iterator<DSDefinitionModule> moduleIT = mod.getAllDSDefinitionModule();
		while(moduleIT.hasNext())
			addDSDefinitionModule(moduleIT.next());

	}
	
	public ClassDefinition getClassDefinition(String name) throws DMFeedbackSet {
		return(ClassDefinitionDefs.getDefinition(name));
	}

}

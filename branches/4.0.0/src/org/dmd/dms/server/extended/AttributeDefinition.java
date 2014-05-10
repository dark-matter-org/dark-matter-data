//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
package org.dmd.dms.server.extended;

import java.util.ArrayList;
import java.util.Iterator;

import org.dmd.core.DmcAttribute;
import org.dmd.core.DmcObject;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.schema.DmcAttributeInfo;
import org.dmd.core.util.NamedStringArray;
import org.dmd.dms.server.generated.MetaSchemaAG;
import org.dmd.dms.server.generated.dmw.AttributeDefinitionDMW;
import org.dmd.dms.shared.generated.dmo.AttributeDefinitionDMO;
import org.dmd.dms.shared.generated.dmo.MetaDMSAG;
import org.dmd.dms.shared.generated.dmo.RuleDataDMO;
import org.dmd.dms.shared.generated.enums.ValueTypeEnum;



public class AttributeDefinition extends AttributeDefinitionDMW {

	// The attribute mediator handles alterations to values associated with this
	// attribute definition. Mediators are constructed as part of a TypeDefinition
	// and set on the AttributeDefinition after the types are created.
	TypeDefinition	typeDef;
	
    // Indicates the classes that include this attribute.
    ArrayList<ClassDefinition>   usedByClasses;

    /**
     * Indicates the actions that include this attribute.
     */
    ArrayList<ActionDefinition>   usedByActions;
    
    // Rules applied to this attribute within the scope of a particular class
    ArrayList<RuleDataDMO>		classRules;
    
    // Global rules that apply to this attribute
    ArrayList<RuleDataDMO>		globalRules;
    
    // This is initialized when we call getAttributeInfo. This mechanism is used to
    // support auxiliary classes that are parsed from file of deserialized.
    DmcAttributeInfo	attrInfo;

    /**
     * Default constructor.
     */
    public AttributeDefinition(){
    	super(new AttributeDefinitionDMO(),MetaSchemaAG._AttributeDefinition);
    	attrInfo = null;
    }
    
    public AttributeDefinition(AttributeDefinitionDMO obj){
    	super(obj);
    	attrInfo = null;
    }
    
    public int getUsedByActionsSize(){
    	if (usedByActions == null)
    		return(0);
    		
    	return(usedByActions.size());
    }
    
    public ActionDefinition getUsedByActionsNth(int i){
    	if (usedByActions == null)
    		return(null);
    	
    	return(usedByActions.get(i));
    }
    
    public int getUsedByClassesSize(){
    	if (usedByClasses == null)
    		return(0);
    	return(usedByClasses.size());
    }
    
    public ClassDefinition getUsedByClassesNth(int i){
    	if (usedByClasses == null)
    		return(null);
    	
    	return(usedByClasses.get(i));
    }
    
    /**
     * @return true if this attribute has any global or class specific rules.
     */
    public boolean hasRules(){
    	if (classRules == null)
    		getClassRules();
    	if ( (classRules.size() > 0) || (globalRules.size() > 0))
    		return(true);
    	return(false);
    }
    
    public Iterator<RuleDataDMO> getClassRules(){
    	if (classRules == null){
    		classRules = new ArrayList<RuleDataDMO>();
    		globalRules = new ArrayList<RuleDataDMO>();
			ArrayList<DmcObject> referring = getDMO().getReferringObjects();
			if (referring != null){
				for(DmcObject obj: referring){
					if (obj instanceof RuleDataDMO){
						RuleDataDMO rd = (RuleDataDMO) obj;
						
						// We only look at attribute rules - they will always have
						// the applyToAttribute attribute.
						if (rd.get(MetaDMSAG.__applyToAttribute) != null){
							if (rd.getApplyToClass() == null)
								globalRules.add(rd);
							else
								classRules.add(rd);
						}
					}
				}
			}
    	}
    	
    	return(classRules.iterator());
    }
    
    public Iterator<RuleDataDMO> getGlobalRules(){
    	if (globalRules == null)
    		getClassRules();
    	return(globalRules.iterator());
    }
    
	/**
	 * Default constructor used in creating the meta schema.
	 * @param mn The meta name of the definition.
	 * @throws DMFeedbackSet 
	 */
	AttributeDefinition(String n, TypeDefinition td) throws DMFeedbackSet{
		super(n);
		typeDef = td;
		attrInfo = null;
	}
	

	protected AttributeDefinition(String mn) throws DMFeedbackSet {
		super(mn);
		attrInfo = null;
	}

    /**
     * Adds a class to our list of classes that use this attribute.
     */
    void addUsingClass(ClassDefinition cd){
        if (usedByClasses == null) {
            usedByClasses = new ArrayList<ClassDefinition>();
        }
        if (!usedByClasses.contains(cd)) {
            usedByClasses.add(cd);
        }
    }

    /**
     * Adds an action to our list of actions that use this attribute.
     */
    void addUsingAction(ActionDefinition ad){
        if (usedByActions == null) {
            usedByActions = new ArrayList<ActionDefinition>();
        }
        if (!usedByActions.contains(ad)) {
            usedByActions.add(ad);
        }
    }

    /**
     * This method is used by parsers and deserializers to get attribute info for attributes
     * associated with auxiliary classes. It shouldn't be used for any other purpose.
     * @return The attribute info.
     */
    public DmcAttributeInfo getAttributeInfo(){
    	if (attrInfo == null)
    		attrInfo = new DmcAttributeInfo(getDefinedIn().getName().getNameString(),getName().getNameString(), getDmdID(), getType().getName().getNameString(), getValueType(), getDataType());
    	
    	return(attrInfo);
    }
    
    public DmcAttribute<?> getAttributeInstance(DmcAttributeInfo ai) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
    	DmcAttribute<?> rc = (DmcAttribute<?>) getType().getAttributeHolder(ai);
    	rc.setAttributeInfo(ai);
    	return(rc);
    }
    
    public String getDMSAGReference(){
    	return(getDefinedIn().getDMSASGName() + ".__" + getName());
    }
    
    public String getAdapterClassImport(){
    	return(getType().getDefinedIn().getSchemaPackage() + ".generated.types.adapters." + getAdapterClassName());
    }
    
    public String getAdapterClassName(){
    	String suffix = "";
    	String REF = "";
    	
    	// If it's a reference type but NOT and extended reference type, insert the REF suffix
    	if (getType().getIsRefType() && (!getType().getIsExtendedRefType())){
    		
    		// We only put in the REF part if the object is a named object
    		if (getType().getOriginalClass().getIsNamedBy() != null)
    			REF = "REF";
    	}
    	    	
    	switch(getValueType()){
    	case HASHMAPPED:
    	case TREEMAPPED:
    		suffix = "MAP";
    		break;
    	case HASHSET:
    	case TREESET:
    		suffix = "SET";
    		break;
    	case MULTI:
    		suffix = "MV";
    		break;
    	case SINGLE:
    		suffix = "SV";
    		break;
    	}
    	
    	return(getType().getName() + REF + suffix + "Adapter");
    }
    
    /**
     * @return the import statement for the appropriate type of this attribute e.g. org.dmd.dms.generated.types.DmcTypeStringSV.
     */
    public String getTypeImport(){
    	return(getType().getTypeImport(this));
    }
    
    /**
     * @return the name of the container type for this attribute e.g. DmcTypeStringSV
     */
    public String getContainerType(){
    	return(getType().getContainerType(this));
    }
    
    /**
     * This is used when formatting rule data in the compact schema. It is used to format attribute
     * containers for attributes used on extensible classes, for instance, initialization rules.
     * @param uniqueNum a unique numeric identifier appended to the attribute instance name so
     * that we don't have clashing attribute value names.
     * @param indent
     * @param prepend
     * @param values
     * @return
     */
    public String getValueModificationStatement(int uniqueNum, String indent, String prepend, NamedStringArray values){
    	StringBuffer sb = new StringBuffer();
    	
    	
    	if (getValueType() == ValueTypeEnum.SINGLE){
    		sb.append(indent + getContainerType() + " " + values.getName() + "Value" + uniqueNum + " = null;\n");
    		for(String value: values){
    			sb.append(indent + values.getName() + "Value" + uniqueNum + " = new " + getContainerType() + "(" + getDMSAGReference() + ");\n");
    			sb.append(indent + values.getName() + "Value" + uniqueNum + ".set(\"" + value + "\");\n");
    			sb.append(prepend + ".set(" + getDMSAGReference() + ", " + values.getName() + "Value" + uniqueNum + ");\n");
    		}
    	}
    	else{
    		sb.append(indent + getContainerType() + " " + values.getName() + "Value" + uniqueNum + " = new " + getContainerType() + "(" + getDMSAGReference() + ");\n");
    		for(String value: values){
    			sb.append(indent + values.getName() + "Value" + uniqueNum + ".add(\"" + value + "\");\n");
    		}
			sb.append(prepend + ".add(" + getDMSAGReference() + ", " + values.getName() + "Value" + uniqueNum + ");\n");
    	}
    	
    	return(sb.toString());
    }
    
    /**
     * This is used when formatting rule data in the compact schema. It is used to format attribute
     * containers for attributes used on extensible classes, for instance, initialization rules.
     * @param uniqueNum a unique numeric identifier appended to the attribute instance name so
     * that we don't have clashing attribute value names.
     * @param indent
     * @param prepend
     * @param values
     * @return
     */
    public String getValueModificationStatement(int uniqueNum, String indent, String prepend, DmcAttribute<?> attr){
    	StringBuffer sb = new StringBuffer();
    	
    	
    	if (getValueType() == ValueTypeEnum.SINGLE){
    		sb.append(indent + getContainerType() + " " + attr.getName() + "Value" + uniqueNum + " = null;\n");

			sb.append(indent + attr.getName() + "Value" + uniqueNum + " = new " + getContainerType() + "(" + getDMSAGReference() + ");\n");
			sb.append(indent + attr.getName() + "Value" + uniqueNum + ".set(\"" + attr.getSV().toString() + "\");\n");
			sb.append(prepend + ".set(" + getDMSAGReference() + ", " + attr.getName() + "Value" + uniqueNum + ");\n");

    	}
    	else{
    		sb.append(indent + getContainerType() + " " + attr.getName() + "Value" + uniqueNum + " = new " + getContainerType() + "(" + getDMSAGReference() + ");\n");
    		Iterator<?> vals = attr.getMV();
    		while(vals.hasNext()){
    			Object val = vals.next();
    			sb.append(indent + attr.getName() + "Value" + uniqueNum + ".add(\"" + val.toString() + "\");\n");
    		}
			sb.append(prepend + ".add(" + getDMSAGReference() + ", " + attr.getName() + "Value" + uniqueNum + ");\n");
    	}
    	
    	return(sb.toString());
    }
}

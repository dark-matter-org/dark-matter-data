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
package org.dmd.dms;

import java.util.ArrayList;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.util.NamedStringArray;
import org.dmd.dms.generated.dmo.AttributeDefinitionDMO;
import org.dmd.dms.generated.dmw.AttributeDefinitionDMW;
import org.dmd.dms.generated.enums.ValueTypeEnum;

public class AttributeDefinition extends AttributeDefinitionDMW {

	// The attribute mediator handles alterations to values associated with this
	// attribute definition. Mediators are constructed as part of a TypeDefinition
	// and set on the AttributeDefinition after the types are created.
	TypeDefinition	typeDef;
	
    // Indicates the classes that include this attribute.
    public ArrayList<ClassDefinition>   usedByClasses;

    /**
     * Indicates the actions that include this attribute.
     */
    public ArrayList<ActionDefinition>   usedByActions;
    
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
    
	/**
	 * Default constructor used in creating the meta schema.
	 * @param mn The meta name of the definition.
	 * @throws DmcValueException 
	 */
	AttributeDefinition(String n, TypeDefinition td) throws DmcValueException{
		super(n);
		typeDef = td;
		attrInfo = null;
	}
	

	protected AttributeDefinition(String mn) throws DmcValueException {
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
    		attrInfo = new DmcAttributeInfo(getName().getNameString(), getDmdID(), getType().getName().getNameString(), getValueType(), getDataType());
    	
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
    	if (getType().getIsRefType() && (!getType().getIsExtendedRefType()))
    		REF = "REF";
    	
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
    
    public String getValueModificationStatement(String indent, String prepend, NamedStringArray values){
    	StringBuffer sb = new StringBuffer();
    	
    	
    	if (getValueType() == ValueTypeEnum.SINGLE){
    		sb.append(indent + getContainerType() + " " + values.getName() + "Value = null;\n");
    		for(String value: values){
    			sb.append(indent + values.getName() + "Value = new " + getContainerType() + "(" + getDMSAGReference() + ");\n");
    			sb.append(indent + values.getName() + "Value.set(\"" + value + "\");\n");
    			sb.append(prepend + ".set(" + getDMSAGReference() + ", " + values.getName() + "Value);\n");
    		}
    	}
    	else{
    		sb.append(indent + getContainerType() + " " + values.getName() + "Value = new " + getContainerType() + "(" + getDMSAGReference() + ");\n");
    		for(String value: values){
    			sb.append(indent + values.getName() + "Value.add(\"" + value + "\");\n");
    		}
			sb.append(prepend + ".add(" + getDMSAGReference() + ", " + values.getName() + "Value);\n");
    	}
    	
    	return(sb.toString());
    }
}
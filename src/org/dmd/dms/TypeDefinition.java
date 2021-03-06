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

import java.net.URL;
import java.net.URLClassLoader;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcObjectName;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.dmo.MetaDMSAG;
import org.dmd.dms.generated.dmo.TypeDefinitionDMO;
import org.dmd.dms.generated.dmw.TypeDefinitionDMW;
import org.dmd.dms.generated.enums.WrapperTypeEnum;
import org.dmd.util.exceptions.DebugInfo;

public class TypeDefinition extends TypeDefinitionDMW {
	
	Class<?> 	attributeClass;
	
	// We maintain these for each of the derived types of attribute holders
	Class<?>	attributeClassSV;
	Class<?>	attributeClassMV;
	Class<?>	attributeClassMAP;
	Class<?>	attributeClassSET;
	
	Class<?>	nameValueClass;
	
	// The DMW class that wraps a DMO object - this is only initialized when
	// we're dealing with internally generated object reference types.
	Class<?> wrapperClass;
	
	// This is only set for internally generated types and will only be set if the
	// referenced object class has its javaClass attribute set
	String auxHolderImport;
	String auxHolderClass;

	ComplexTypeDefinition	complexType;

    /**
     * Default constructor.
     */
    public TypeDefinition(){
    	super(new TypeDefinitionDMO(),MetaSchemaAG._TypeDefinition);
    }
    
    public TypeDefinition(ComplexTypeDefinition ctd){
    	super();
    	complexType = ctd;
    }
    
    public TypeDefinition(TypeDefinitionDMO obj){
    	super(obj);
    }
    
    /**
     * @return the complex type on which this type is based or null if that's not the case
     */
    public ComplexTypeDefinition getComplexType(){
    	return(complexType);
    }
    
	protected TypeDefinition(String mn, Class<?> c) throws DmcValueException {
		super(mn);
		attributeClass 		= c;
		
		attributeClassSV 	= null;
		attributeClassMV 	= null;
		attributeClassMAP	= null;
		attributeClassSET	= null;
	}

	/**
	 * This constructor is used for internally generated reference types.
	 * @param mn
	 * @param c 
	 * @param w
	 * @throws DmcValueException 
	 */
	protected TypeDefinition(String mn, Class<?> c, Class<?> w) throws DmcValueException {
		super(mn);
		attributeClass 		= c;
		wrapperClass 		= w;
		
		attributeClassSV 	= null;
		attributeClassMV 	= null;
		attributeClassMAP	= null;
		attributeClassSET	= null;
	}

	public void setAuxHolderImport(String c){
		auxHolderImport = c;
		int lastDot = c.lastIndexOf(".");
		auxHolderClass = c.substring(lastDot+1);
	}
	
	public String getAuxHolderImport(){
		return(auxHolderImport);
	}
	
	public String getAuxHolderClass(){
		return(auxHolderClass);
	}
	
	/**
	 * If this type is a name type and has a defined name attribute definition, we try to instantiate
	 * a value holder which is a derived class of DmcObjectName.
	 * @return a name value holder of the appropriate type.
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public DmcObjectName getNameValue() throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		DmcObjectName rc = null;
				
		if (getNameAttributeDef() == null){
			throw(new IllegalStateException("The " + getName() + " type does not have a designated name attribute definition!"));
		}
		
		if (nameValueClass == null){
			nameValueClass = Class.forName(getPrimitiveType());
			rc = (DmcObjectName) nameValueClass.newInstance();
		}
		
		return(rc);
	}
	
	/**
	 * This method will return an attribute of the appropriate type and cardinality base on the attribute info.
	 * @param ai The attribute info.
	 * @return The right derived type of DmcAttribute
	 * @throws ClassNotFoundException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	public DmcAttribute<?> getAttributeHolder(DmcAttributeInfo ai) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		DmcAttribute<?>	rc = null;
		
		try{
		switch(ai.valueType){
		case SINGLE:
			if (attributeClassSV == null){
				attributeClassSV = Class.forName(getTypeName("SV"));
			}
			rc = (DmcAttribute<?>) attributeClassSV.newInstance();
			break;
		case MULTI:
			if (attributeClassMV == null){
				attributeClassMV = Class.forName(getTypeName("MV"));
			}
			rc = (DmcAttribute<?>) attributeClassMV.newInstance();
			break;
		case HASHMAPPED:
		case TREEMAPPED:
			if (attributeClassMAP == null){
				attributeClassMAP = Class.forName(getTypeName("MAP"));
			}
			rc = (DmcAttribute<?>) attributeClassMAP.newInstance();
			break;
		case HASHSET:
		case TREESET:
			if (attributeClassSET == null){
				attributeClassSET = Class.forName(getTypeName("SET"));
			}
			rc = (DmcAttribute<?>) attributeClassSET.newInstance();
			break;
		}
		}
		catch (ClassNotFoundException e) {
			DebugInfo.debug("Class not found while trying to get holder for: " + ai.toString());
			DebugInfo.debug(System.getProperty("java.class.path"));
			ClassLoader cl = ClassLoader.getSystemClassLoader();
			 
	        URL[] urls = ((URLClassLoader)cl).getURLs();
	 
	        for(URL url: urls){
	        	DebugInfo.debug(url.getFile());
	        }
			throw(e);
		}
		
		if (rc == null)
			throw(new IllegalStateException("Could not instantiate holder for attribute: " + ai.toString()));
		
		rc.setAttributeInfo(ai);
		
		return(rc);
	}
	
	String getTypeName(String suffix){
		String tn = getDefinedIn().getSchemaPackage() + ".generated.types.DmcType" + getName().getNameString() + suffix;
		
		// If it's an extended reference type, we're good at this stage
		if (getIsExtendedRefType())
			return(tn);

		if (getIsRefType() && (!getName().getNameString().endsWith("REF"))){
			tn = getDefinedIn().getSchemaPackage() + ".generated.types.DmcType" + getName().getNameString() + "REF" + suffix;
		}
		if (getIsEnumType()){
			tn = getDefinedIn().getSchemaPackage() + ".generated.types.DmcType" + getEnumName() + suffix;
		}
		
		return(tn);
	}
	
	/**
	 * Determines the import statement for the type derivative of the specified attribute definition.
	 * @param ad the attribute definition.
	 * @return a fully qualified import for the required type container.
	 */
	public String getTypeImport(AttributeDefinition ad){
		String rc = null;
		switch(ad.getValueType()){
		case SINGLE:
			rc = getTypeName("SV");
			break;
		case MULTI:
			rc = getTypeName("MV");
			break;
		case HASHMAPPED:
		case TREEMAPPED:
			rc = getTypeName("MAP");
			break;
		case HASHSET:
		case TREESET:
			rc = getTypeName("SET");
			break;
		}
		return(rc);
	}
	
	/**
	 * @param ad the attribute definition.
	 * @return just the name of the container type for the specified attribute.
	 */
	public String getContainerType(AttributeDefinition ad){
		String tmp = null;
		switch(ad.getValueType()){
		case SINGLE:
			tmp = getTypeName("SV");
			break;
		case MULTI:
			tmp = getTypeName("MV");
			break;
		case HASHMAPPED:
		case TREEMAPPED:
			tmp = getTypeName("MAP");
			break;
		case HASHSET:
		case TREESET:
			tmp = getTypeName("SET");
			break;
		}
		
		int lastDot = tmp.lastIndexOf(".");
		
		return(tmp.substring(lastDot+1));
	}
	
	/**
	 * Complicated stuff to handle generation of wrapper classes in packages other than where
	 * the DMOs are generated. This should only be used on internally generated type ref classes.
	 * @throws DmcValueException  
	 */
//	public void adjustJavaClass(String genPackage) {
	public void adjustJavaClass() {
		ClassDefinition cd = getOriginalClass();
		String genPackage = cd.getDMWPackage();
		
		if (cd.getUseWrapperType() == WrapperTypeEnum.BASE){
			try {
				cd.setJavaClass(genPackage + ".generated.dmw." + cd.getName() + "DMW");
			} catch (DmcValueException e) {
				e.printStackTrace();
			}
		}
		else if (cd.getUseWrapperType() == WrapperTypeEnum.EXTENDED){
			try {
				if (cd.getDefinedIn().getName().getNameString().equals(MetaDMSAG.instance().getSchemaName())){
					// For meta schema classes, there is no extended subpackage
					cd.setJavaClass(genPackage + "." + cd.getName());
				}
				else if (cd.getSubpackage() == null)
					cd.setJavaClass(genPackage + ".extended." + cd.getName());
				else
					cd.setJavaClass(genPackage + ".extended." + cd.getSubpackage() + "." + cd.getName());
			} catch (DmcValueException e) {
				e.printStackTrace();
			}
		}
		else{
			return;
		}
		setAuxHolderImport(cd.getJavaClass());
	}
}

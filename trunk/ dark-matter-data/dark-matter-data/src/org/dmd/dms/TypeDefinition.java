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

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.dmw.TypeDefinitionDMW;
import org.dmd.dms.generated.enums.WrapperTypeEnum;

public class TypeDefinition extends TypeDefinitionDMW {
	
	@SuppressWarnings("unchecked")
	Class attributeClass;
	
	// The DMW class that wraps a DMO object - this is only initialized when
	// we're dealing with internally generated object reference types.
	@SuppressWarnings("unchecked")
	Class wrapperClass;
	
	// This is only set for internally generated types and will only be set if the
	// referenced object class has its javaClass attribute set
	String auxHolderImport;
	String auxHolderClass;

    /**
     * Default constructor.
     */
    public TypeDefinition(){
    	
    }
    
	@SuppressWarnings("unchecked")
	protected TypeDefinition(String mn, Class c) throws DmcValueException {
		super(mn);
		attributeClass = c;
	}

	/**
	 * This constructor is used for internally generated reference types.
	 * @param mn
	 * @param c 
	 * @param w
	 * @throws DmcValueException 
	 */
	@SuppressWarnings("unchecked")
	protected TypeDefinition(String mn, Class c, Class w) throws DmcValueException {
		super(mn);
		attributeClass = c;
		wrapperClass = w;
	}

	/**
	 * @return The class of object that stores things of this type.
	 * @throws ClassNotFoundException 
	 */
	@SuppressWarnings("unchecked")
	public Class getTypeClass() throws ClassNotFoundException{
		if (attributeClass == null){
			attributeClass = Class.forName(getTypeClassName());
		}
		return(attributeClass);
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
	 * Complicated stuff to handle generation of wrapper classes in packages other than where
	 * the DMOs are generated. This should only be used on internally generated type ref classes.
	 * @param genPackage The location where the wrappers are being generated.
	 * @throws DmcValueException  
	 */
	public void adjustJavaClass(String genPackage) {
		ClassDefinition cd = getOriginalClass();
		if (cd.getUseWrapperType() == WrapperTypeEnum.BASE){
			try {
				cd.setJavaClass(genPackage + ".generated.dmw." + cd.getName() + "DMW");
			} catch (DmcValueException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (cd.getUseWrapperType() == WrapperTypeEnum.EXTENDED){
			try {
				cd.setJavaClass(genPackage + ".extended." + cd.getName());
			} catch (DmcValueException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			return;
		}
		setAuxHolderImport(cd.getJavaClass());
	}
}

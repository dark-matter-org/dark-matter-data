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

import org.dmd.dms.generated.dmw.TypeDefinitionDMW;

public class TypeDefinition extends TypeDefinitionDMW {
	
	@SuppressWarnings("unchecked")
	Class attributeClass;
	
	// The DMW class that wraps a DMO object - this is only initialized when
	// we're dealing with internally generated object reference types.
	@SuppressWarnings("unchecked")
	Class wrapperClass;

    /**
     * Default constructor.
     */
    public TypeDefinition(){
    	
    }
    
	@SuppressWarnings("unchecked")
	protected TypeDefinition(String mn, Class c) {
		super(mn);
		attributeClass = c;
	}

	/**
	 * This constructor is used for internally generated reference types.
	 * @param mn
	 * @param c 
	 * @param w
	 */
	@SuppressWarnings("unchecked")
	protected TypeDefinition(String mn, Class c, Class w) {
		super(mn);
		attributeClass = c;
		wrapperClass = w;
	}

	/**
	 * @return The class of object that stores things of this type.
	 */
	@SuppressWarnings("unchecked")
	public Class getTypeClass(){
		return(attributeClass);
	}
	
	
}

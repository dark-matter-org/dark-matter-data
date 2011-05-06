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
package org.dmd.dmg.types;

import org.dmd.dmc.DmcValueException;
import org.dmd.dmg.DarkMatterGeneratorIF;

/**
 * The GeneratorInstance class is used to maintain an instance of an object
 * that implements the DarkMatterGeneratorIF interface.
 */
public class Generator {

	@SuppressWarnings("unchecked")
	Class					objClass;
	
	String 					generatorClassName;
	
	DarkMatterGeneratorIF	generator;
	
	public Generator(){
		
	}
	
	public Generator(Generator original){
		objClass = original.objClass;
		generatorClassName = original.generatorClassName;
		generator = original.generator;
	}
	
	/**
	 * Constructs a new Generator from the specified class name.
	 * @param gc
	 * @throws DmcValueException
	 */
	public Generator(String gc) throws DmcValueException {
		generatorClassName = gc;
		
        try{
            objClass = Class.forName(gc);
        }
        catch(Exception e){
        	throw(new DmcValueException("Couldn't load Java class: " + gc));
        }
        
        try {
			generator = (DarkMatterGeneratorIF) objClass.newInstance();
		} catch (InstantiationException e) {
			throw(new DmcValueException("Couldn't instantiate class: " + gc));
		} catch (IllegalAccessException e) {
			throw(new DmcValueException("Couldn't instantiate class: " + gc));
		} catch (ClassCastException e){
			throw(new DmcValueException("The class: " + gc + " must implement the DarkMatterGeneratorIF interface."));
		}

	}
	
	public String getGeneratorClassName(){
		return(generatorClassName);
	}
	
	/**
	 * @return the generator instance.
	 */
	public DarkMatterGeneratorIF getGenerator(){
		return(generator);
	}
}

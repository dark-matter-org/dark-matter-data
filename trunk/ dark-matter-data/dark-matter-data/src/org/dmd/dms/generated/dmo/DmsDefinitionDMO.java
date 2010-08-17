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
package org.dmd.dms.generated.dmo;

import java.util.*;

import org.dmd.dmc.types.*;
import org.dmd.dmc.*;
import org.dmd.dms.generated.types.*;
import org.dmd.dms.generated.enums.*;
import org.dmd.util.exceptions.*;
import org.dmd.dms.*;

/**
 * The DmsDefinition class provides a common base for all definition classes.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1017)
 */
@SuppressWarnings({"unused", "serial"})
public class DmsDefinitionDMO extends DmcObject implements DmcNamedObjectIF {

     public final static String _name = "name";
     public final static String _objectClass = "objectClass";
     public final static String _definedIn = "definedIn";
     public final static String _file = "file";
     public final static String _lineNumber = "lineNumber";


     public String getConstructionClassName(){
         return("DmsDefinition");
     }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    public String getName(){
        DmcTypeString attr = (DmcTypeString) attributes.get(_name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setName(Object value){
        try{
            set(_name, DmcTypeString.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * Used to indicate the classes that an object instance supports.
     * @returns An Iterator of ClassDefinitionDMO objects.
     */
    public Iterator<ClassDefinitionREF> getObjectClass(){
        DmcTypeClassDefinitionREF attr = (DmcTypeClassDefinitionREF) attributes.get(_objectClass);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another objectClass value.
     * @param value A value compatible with DmcTypeClassDefinitionREF
     */
    public void addObjectClass(Object value){
        try{
            add(_objectClass, DmcTypeClassDefinitionREF.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined.
     */
    public SchemaDefinitionREF getDefinedIn(){
        DmcTypeSchemaDefinitionREF attr = (DmcTypeSchemaDefinitionREF) attributes.get(_definedIn);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets definedIn to the specified value.
     * @param value A value compatible with DmcTypeSchemaDefinitionREF
     */
    public void setDefinedIn(Object value){
        try{
            set(_definedIn, DmcTypeSchemaDefinitionREF.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * Indicates the file from which a definition was loaded.
     */
    public String getFile(){
        DmcTypeString attr = (DmcTypeString) attributes.get(_file);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setFile(Object value){
        try{
            set(_file, DmcTypeString.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * Indicates the line number of the file from which a definition was loaded.
     */
    public Integer getLineNumber(){
        DmcTypeInteger attr = (DmcTypeInteger) attributes.get(_lineNumber);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    public void setLineNumber(Object value){
        try{
            set(_lineNumber, DmcTypeInteger.class, value);
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    /**
     * @return The name of this object from the name attribute.
     */
    @Override
    public String getObjectName(){
        DmcTypeString attr = (DmcTypeString) attributes.get(_name);
        if (attr == null)
            return(null);
        return(attr.getSV());
    }

}

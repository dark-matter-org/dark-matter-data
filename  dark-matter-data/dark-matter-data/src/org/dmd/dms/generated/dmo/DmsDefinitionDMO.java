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

/**
 * The DmsDefinition class provides a common base for all definition classes.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1016)
 */
@SuppressWarnings({"unused", "serial"})
public class DmsDefinitionDMO extends DmwWrapperDMO implements DmcNamedObjectIF {

    public final static String _name = "name";
    public final static String _definedIn = "definedIn";
    public final static String _file = "file";
    public final static String _lineNumber = "lineNumber";


    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",1,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __definedIn = new DmcAttributeInfo("definedIn",2,"SchemaDefinition",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",3,"String",ValueTypeEnum.SINGLE,true);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",4,"Integer",ValueTypeEnum.SINGLE,true);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__name.id,__name);
        _ImAp.put(__definedIn.id,__definedIn);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__lineNumber.id,__lineNumber);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__name.name,__name);
        _SmAp.put(__definedIn.name,__definedIn);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__lineNumber.name,__lineNumber);
    }


    public DmsDefinitionDMO(){
        super("DmsDefinition",_ImAp,_SmAp);
    }

    public DmsDefinitionDMO(String oc){
        super(oc);
    }

    public DmsDefinitionDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    @Override
    public DmsDefinitionDMO getOneOfMe(){
        DmsDefinitionDMO rc = new DmsDefinitionDMO();
        return(rc);
    }

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
        DmcTypeString attr = (DmcTypeString) get(_name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setName(Object value) throws DmcValueException {
        DmcAttribute attr = get(_name);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_name,attr);
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined.
     */
    public SchemaDefinitionREF getDefinedIn(){
        DmcTypeSchemaDefinitionREF attr = (DmcTypeSchemaDefinitionREF) get(_definedIn);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets definedIn to the specified value.
     * @param value A value compatible with DmcTypeSchemaDefinitionREF
     */
    @SuppressWarnings("unchecked")
    public void setDefinedIn(Object value) throws DmcValueException {
        DmcAttribute attr = get(_definedIn);
        if (attr == null)
            attr = new DmcTypeSchemaDefinitionREF();
        
        attr.set(value);
        set(_definedIn,attr);
    }

    /**
     * Indicates the file from which a definition was loaded.
     */
    public String getFile(){
        DmcTypeString attr = (DmcTypeString) get(_file);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setFile(Object value) throws DmcValueException {
        DmcAttribute attr = get(_file);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_file,attr);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded.
     */
    public Integer getLineNumber(){
        DmcTypeInteger attr = (DmcTypeInteger) get(_lineNumber);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    @SuppressWarnings("unchecked")
    public void setLineNumber(Object value) throws DmcValueException {
        DmcAttribute attr = get(_lineNumber);
        if (attr == null)
            attr = new DmcTypeInteger();
        
        attr.set(value);
        set(_lineNumber,attr);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    /**
     * @return The name of this object from the name attribute.
     */
    @Override
    public String getObjectName(){
        DmcTypeString attr = (DmcTypeString) get(_name);
        if (attr == null)
            return(null);
        return(attr.getSV());
    }

}

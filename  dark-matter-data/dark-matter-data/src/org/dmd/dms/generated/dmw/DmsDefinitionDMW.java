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
package org.dmd.dms.generated.dmw;

import java.util.*;

import org.dmd.dmc.types.*;
import org.dmd.dmc.*;
import org.dmd.dmw.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dms.generated.enums.*;
import org.dmd.dms.generated.types.*;
import org.dmd.util.exceptions.*;
import org.dmd.dms.*;

/**
 * The DmsDefinition class provides a common base for all definition classes.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDefClasses(MetaGenerator.java:792)
 */
@SuppressWarnings("unused")
public abstract class DmsDefinitionDMW extends DmwWrapperBase {

    private DmsDefinitionDMO mycore;

    protected DmsDefinitionDMW() {
        super(new DmsDefinitionDMO());
        mycore = (DmsDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected DmsDefinitionDMW(DmcObject obj) {
        super(obj);
        mycore = (DmsDefinitionDMO) core;
        mycore.setContainer(this);
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    public String getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setName(Object value){
        mycore.setName(value);
    }

    /**
     * Used to indicate the classes that an object instance supports.
     * @returns An Iterator of ClassDefinition objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<ClassDefinition> getObjectClass(){
        DmcAttribute attr = (DmcTypeClassDefinitionREF) mycore.get(DmsDefinitionDMO._objectClass);
        if (attr == null)
            return(null);

        ArrayList<ClassDefinition> refs = (ArrayList<ClassDefinition>) attr.getAuxData();

        if (refs == null)
            return(null);

        return(refs.iterator());
    }

    /**
     * Adds another objectClass value.
     * @param value A value compatible with ClassDefinition
     */
    @SuppressWarnings("unchecked")
    public void addObjectClass(ClassDefinition value){
        try{
            DmcAttribute attr = mycore.add(DmsDefinitionDMO._objectClass, DmcTypeClassDefinitionREF.class, value.getDmcObject());
            ArrayList<ClassDefinition> refs = (ArrayList<ClassDefinition>) attr.getAuxData();
            
            if (refs == null){
                refs = new ArrayList<ClassDefinition>();
                attr.setAuxData(refs);
            }
            refs.add(value);
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined.
     */
    public SchemaDefinition getDefinedIn(){
        DmcTypeSchemaDefinitionREF attr = (DmcTypeSchemaDefinitionREF) mycore.get(DmsDefinitionDMO._definedIn);
        if (attr == null)
            return(null);
        SchemaDefinitionDMO obj = attr.getSV().getObject();
        return((SchemaDefinition)obj.getContainer());
    }

    /**
     * Sets definedIn to the specified value.
     * @param value A value compatible with SchemaDefinition
     */
    public void setDefinedIn(SchemaDefinition value){
        mycore.setDefinedIn(value.getDmcObject());
    }

    /**
     * Indicates the file from which a definition was loaded.
     */
    public String getFile(){
        return(mycore.getFile());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setFile(Object value){
        mycore.setFile(value);
    }

    /**
     * Indicates the line number of the file from which a definition was loaded.
     */
    public Integer getLineNumber(){
        return(mycore.getLineNumber());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    public void setLineNumber(Object value){
        mycore.setLineNumber(value);
    }


}

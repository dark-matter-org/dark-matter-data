//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
 * The DMDefinitionModule is a definition that defines a collection of
 * definitions\n and provides a basis for the generation of various artifacts
 * that allow for parsing and\n management of that set of definitions.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1573)
 */
@SuppressWarnings("unused")
public class DMDefinitionModuleDMW extends org.dmd.dms.DmsDefinition {

    private DMDefinitionModuleDMO mycore;

    protected DMDefinitionModuleDMW() {
        super(new DMDefinitionModuleDMO());
        mycore = (DMDefinitionModuleDMO) core;
        mycore.setContainer(this);
    }

    protected DMDefinitionModuleDMW(DmcObject obj) {
        super(obj);
        mycore = (DMDefinitionModuleDMO) core;
        mycore.setContainer(this);
    }

    protected DMDefinitionModuleDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (DMDefinitionModuleDMO) core;
        mycore.setContainer(this);
    }

    public  DMDefinitionModuleDMO getDMO() {
        return(mycore);
    }

    protected DMDefinitionModuleDMW(ClassDefinition cd) {
        super(cd);
    }

    protected DMDefinitionModuleDMW(String mn) throws DmcValueException {
        super(new DMDefinitionModuleDMO());
        mycore = (DMDefinitionModuleDMO) core;
        mycore.setContainer(this);
        mycore.setName(mn);
        metaname = mn;
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Indicates the extension of files of a particular type.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public String getFileExtension(){
        return(mycore.getFileExtension());
    }

    /**
     * Sets fileExtension to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2394)
    public void setFileExtension(Object value) throws DmcValueException {
        mycore.setFileExtension(value);
    }

    /**
     * A reference to the DMDefinition derived class that is the common\n base
     * class for a related set of definitions.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public DMDefinition getBaseDefinition(){
        DmcTypeDMDefinitionREFSV attr = (DmcTypeDMDefinitionREFSV) mycore.get(MetaDMSAG.__baseDefinition);
        if (attr == null)
            return(null);
        DMDefinitionDMO obj = attr.getSV().getObject();
        return((DMDefinition)obj.getContainer());
    }

    /**
     * Sets baseDefinition to the specified value.
     * @param value A value compatible with DMDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2381)
    public void setBaseDefinition(DMDefinition value) throws DmcValueException {
        mycore.setBaseDefinition(value.getDmcObject());
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2321)
    public SchemaDefinition getDefinedIn(){
        DmcTypeSchemaDefinitionREFSV attr = (DmcTypeSchemaDefinitionREFSV) mycore.get(MetaDMSAG.__definedIn);
        if (attr == null)
            return(null);
        SchemaDefinitionDMO obj = attr.getSV().getObject();
        return((SchemaDefinition)obj.getContainer());
    }

    /**
     * Sets definedIn to the specified value.
     * @param value A value compatible with SchemaDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2381)
    public void setDefinedIn(SchemaDefinition value) throws DmcValueException {
        mycore.setDefinedIn(value.getDmcObject());
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1736)

    /**
     * @return The name of this object from the name attribute.
     */
    public DefinitionName getObjectName(){
        return(mycore.getObjectName());
    }


    /**
     * @return The name attribute.
     */
    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

}

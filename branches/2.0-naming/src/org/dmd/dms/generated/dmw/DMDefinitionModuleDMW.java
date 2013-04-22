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
 * that allow for parsing and\n management of that set of definitions.\n
 * <p/>\n The specific of a definition module will result in the generation
 * of a ClassDefinition for\n the specified module type and thus, the dmdID
 * associated with it must be unique across the\n set of classes that
 * comprise the definitions encompassed by the module.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1601)
 */
@SuppressWarnings("unused")
public class DMDefinitionModuleDMW extends org.dmd.dms.DMDefinition {

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

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2349)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2422)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Indicates the extension of files of a particular type.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2349)
    public String getFileExtension(){
        return(mycore.getFileExtension());
    }

    /**
     * Sets fileExtension to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2422)
    public void setFileExtension(Object value) throws DmcValueException {
        mycore.setFileExtension(value);
    }

    /**
     * The dmdID attribute is used to store a unique Dark Matter Definition ID
     * for attributes.\n This is used as part of the serialization mechanisms
     * built into Dark Matter Objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2349)
    public Integer getDmdID(){
        return(mycore.getDmdID());
    }

    /**
     * Sets dmdID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2422)
    public void setDmdID(Object value) throws DmcValueException {
        mycore.setDmdID(value);
    }

    /**
     * The name of the class that will be generated as a result of a
     * DMDefinitionModule definition.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2349)
    public String getModuleClassName(){
        return(mycore.getModuleClassName());
    }

    /**
     * Sets moduleClassName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2422)
    public void setModuleClassName(Object value) throws DmcValueException {
        mycore.setModuleClassName(value);
    }

    /**
     * A reference to the DMDefinition derived class that is part of\n the
     * abstract syntax of a dark-matter definition module.
     * @return An Iterator of DMDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2510)
    public DMDefinitionIterableDMW getUsesDefinition(){
        DmcTypeDMDefinitionREFMV attr = (DmcTypeDMDefinitionREFMV) mycore.get(MetaDMSAG.__usesDefinition);
        if (attr == null)
            return(DMDefinitionIterableDMW.emptyList);

        return(new DMDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another usesDefinition value.
     * @param value A value compatible with DMDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2569)
    public DmcAttribute<?> addUsesDefinition(DMDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addUsesDefinition(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of usesDefinition values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2595)
    public int getUsesDefinitionSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__usesDefinition);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * Indicates the schema in which a type, attribute or class is defined.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2349)
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2409)
    public void setDefinedIn(SchemaDefinition value) throws DmcValueException {
        mycore.setDefinedIn(value.getDmcObject());
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1764)

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

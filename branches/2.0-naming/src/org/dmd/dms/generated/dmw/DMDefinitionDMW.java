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
 * The dark-matter definition forms the basis for all domain specific
 * definitions\n that use dark-matter as their basis. The initial dark-matter
 * mechanisms were focussed only on \n schema for data objects, but, as the
 * project developed, other, domain specific sets of definitions\n were
 * added. Eventually, a pattern emerged in terms of these various sets of
 * definitions and\n some additional higher order concepts were introduced to
 * make the creation of new, domain specific\n definition sets easier and to
 * allow them to build on and use each others' definitions in a \n coherent
 * manner.\n <p/>\n For instance, the Model View Whatever (MVW) framework,
 * builds on the dark-matter schema \n concepts and introduces definitions
 * that align with the Google Web Toolkit (GWT) conceptual model\n of the
 * elements that comprise GWT applications and the various relationships that
 * exist between\n them. The infrastructure needed to parse, manage and use
 * those definitions to generate code\n and documentation are very similar to
 * those used in the base dark-matter schema mechanisms, but\n they had to be
 * hand built for the domain.\n <p/>\n Other kinds of domain specific
 * definitions started to emerge, Google Protocol Buffer (GPB),\n Simple
 * Network Management Protocol (SNMP) etc. Having to build the infrastructure
 * for these \n definitions each time was tedious and, in the spirit of the
 * rest of dark-matter, lent themselves\n to being defined, generated and
 * extended to make the process the easier.\n <p/>\n Likewise, the code
 * generation mechanisms originally employed have evolved and the more
 * generic\n concept of artifact generation, based on definition sets, was
 * introduced to allow for more rapid\n creation of utilities that generate
 * code or documentation or other types of specifications.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1573)
 */
@SuppressWarnings("unused")
public abstract class DMDefinitionDMW extends DmwNamedObjectWrapper {

    private DMDefinitionDMO mycore;

    protected DMDefinitionDMW() {
        super(new DMDefinitionDMO());
        mycore = (DMDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected DMDefinitionDMW(DmcObject obj) {
        super(obj);
        mycore = (DMDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected DMDefinitionDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (DMDefinitionDMO) core;
        mycore.setContainer(this);
    }

    public  DMDefinitionDMO getDMO() {
        return(mycore);
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

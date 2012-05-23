//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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
 * The SliceDefinition class is used to define a named set of attributes that
 * are used to retrieve a slice of an object i.e. an abbreviated set of
 * values. These are used in the generation of static, named DmcSliceInfo
 * instances.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:986)
 */
@SuppressWarnings("unused")
public class SliceDefinitionDMW extends org.dmd.dms.DmsDefinition {

    private SliceDefinitionDMO mycore;

    protected SliceDefinitionDMW() {
        super(new SliceDefinitionDMO());
        mycore = (SliceDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected SliceDefinitionDMW(DmcObject obj) {
        super(obj);
        mycore = (SliceDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected SliceDefinitionDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (SliceDefinitionDMO) core;
        mycore.setContainer(this);
    }

    public  SliceDefinitionDMO getDMO() {
        return(mycore);
    }

    protected SliceDefinitionDMW(ClassDefinition cd) {
        super(cd);
    }

    protected SliceDefinitionDMW(String mn) throws DmcValueException {
        super(new SliceDefinitionDMO());
        mycore = (SliceDefinitionDMO) core;
        mycore.setContainer(this);
        mycore.setName(mn);
        metaname = mn;
    }

    /**
     * The selectAttribute indicates an attribute to be used in the definition of
     * a Slice.
     * @return An Iterator of AttributeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1705)
    public AttributeDefinitionIterableDMW getSelectAttribute(){
        DmcTypeAttributeDefinitionREFMV attr = (DmcTypeAttributeDefinitionREFMV) mycore.get(MetaDMSAG.__selectAttribute);
        if (attr == null)
            return(AttributeDefinitionIterableDMW.emptyList);

        return(new AttributeDefinitionIterableDMW(attr.getMV()));
    }

    /**
     * Adds another selectAttribute value.
     * @param value A value compatible with AttributeDefinition
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1753)
    public DmcAttribute<?> addSelectAttribute(AttributeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addSelectAttribute(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of selectAttribute values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1776)
    public int getSelectAttributeSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__selectAttribute);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1573)
    public String getDescription(){
        return(mycore.getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1625)
    public void setDescription(Object value) throws DmcValueException {
        mycore.setDescription(value);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    /**
     * @return The name of this object from the name attribute.
     */
    public StringName getObjectName(){
        return(mycore.getObjectName());
    }


    /**
     * @return The name attribute.
     */
    public DmcAttribute<?> getObjectNameAttribute(){
        return(mycore.getObjectNameAttribute());
    }

}

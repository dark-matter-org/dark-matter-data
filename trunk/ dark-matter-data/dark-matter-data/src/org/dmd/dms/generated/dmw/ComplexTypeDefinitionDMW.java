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
 * The ComplexTypeDefinition provides a mechanism for defining the structure
 * of a complex type composed of other types. From this definition, a new
 * DmcType is generated that has all of the required methods automatically
 * defined.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:982)
 */
@SuppressWarnings("unused")
public class ComplexTypeDefinitionDMW extends org.dmd.dms.DmsDefinition {

    private ComplexTypeDefinitionDMO mycore;

    protected ComplexTypeDefinitionDMW() {
        super(new ComplexTypeDefinitionDMO());
        mycore = (ComplexTypeDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected ComplexTypeDefinitionDMW(DmcObject obj) {
        super(obj);
        mycore = (ComplexTypeDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected ComplexTypeDefinitionDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (ComplexTypeDefinitionDMO) core;
        mycore.setContainer(this);
    }

    public  ComplexTypeDefinitionDMO getDMO() {
        return(mycore);
    }

    protected ComplexTypeDefinitionDMW(ClassDefinition cd) {
        super(cd);
    }

    protected ComplexTypeDefinitionDMW(String mn) throws DmcValueException {
        super(new ComplexTypeDefinitionDMO());
        mycore = (ComplexTypeDefinitionDMO) core;
        mycore.setContainer(this);
        mycore.setName(mn);
        metaname = mn;
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1569)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1621)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * The field indicates a type and name for a field in a ComplexType.
     * @return An Iterator of Field objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1713)
    public Iterator<Field> getField(){
        DmcTypeFieldMV attr = (DmcTypeFieldMV) mycore.get(MetaDMSAG.__field);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another field value.
     * @param value A value compatible with DmcTypeFieldMV
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1760)
    public DmcAttribute addField(Object value) throws DmcValueException {
        return(mycore.addField(value));
    }

    /**
     * Returns the number of field values.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1771)
    public int getFieldSize(){
        DmcAttribute attr = mycore.get(MetaDMSAG.__field);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * The fieldSeparator is used to indicate the separation character used when
     * a ComplexType is represented as a String. If a fieldSeparator isn't
     * specified, it is assumed to be a space.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1569)
    public String getFieldSeparator(){
        return(mycore.getFieldSeparator());
    }

    /**
     * Sets fieldSeparator to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1621)
    public void setFieldSeparator(Object value) throws DmcValueException {
        mycore.setFieldSeparator(value);
    }

    /**
     * The extendedClass indicates the fully qualified name of the class that is
     * derived from the generated ComplexType to provide additional behaviour.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1569)
    public String getExtendedClass(){
        return(mycore.getExtendedClass());
    }

    /**
     * Sets extendedClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1621)
    public void setExtendedClass(Object value) throws DmcValueException {
        mycore.setExtendedClass(value);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1569)
    public String getDescription(){
        return(mycore.getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1621)
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

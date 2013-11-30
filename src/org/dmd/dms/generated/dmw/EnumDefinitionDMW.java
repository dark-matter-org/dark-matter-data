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
import org.dmd.dms.types.*;
import org.dmd.dms.generated.dmo.*;
import org.dmd.dms.generated.enums.*;
import org.dmd.dms.generated.types.*;
import org.dmd.util.exceptions.*;
import org.dmd.dms.*;
import org.dmd.dmc.definitions.DmcDefinitionIF;

/**
 * The EnumDefinition allows for the definition of real Java enums that
 * provide\n inherent mapping of the string and integer values of the enum
 * into actual enum values. Once\n defined, EnumDefinitions can be used where
 * ever you would use a TypeDefinition name i.e.\n they can be used in the
 * type attribute of AttributeDefinitions. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1630)
 */
@SuppressWarnings("unused")
public class EnumDefinitionDMW extends org.dmd.dms.DmsDefinition implements DmcDefinitionIF {

    private EnumDefinitionDMO mycore;

    protected EnumDefinitionDMW() {
        super(new EnumDefinitionDMO());
        mycore = (EnumDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected EnumDefinitionDMW(DmcObject obj) {
        super(obj);
        mycore = (EnumDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected EnumDefinitionDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (EnumDefinitionDMO) core;
        mycore.setContainer(this);
    }

    public  EnumDefinitionDMO getDMO() {
        return(mycore);
    }

    protected EnumDefinitionDMW(ClassDefinition cd) {
        super(cd);
    }

    protected EnumDefinitionDMW(String mn) throws DmcValueException {
        super(new EnumDefinitionDMO());
        mycore = (EnumDefinitionDMO) core;
        mycore.setContainer(this);
        mycore.setName(mn);
        metaname = mn;
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2374)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2447)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Indicates the set of enum values associated with an enumeration type\n
     * definition. 
     * @return An Iterator of EnumValue objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2578)
    public Iterator<EnumValue> getEnumValue(){
        DmcTypeEnumValueMV attr = (DmcTypeEnumValueMV) mycore.get(MetaDMSAG.__enumValue);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another enumValue value.
     * @param value A value compatible with DmcTypeEnumValueMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2658)
    public void addEnumValue(Object value) throws DmcValueException {
        mycore.addEnumValue(value);
    }

    /**
     * Returns the number of enumValue values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2671)
    public int getEnumValueSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__enumValue);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * The description attribute is used to provide descriptive\n documentation
     * for schema related definitions. The text provided should conform\n to
     * XHTML concepts since it will be dumped in the context of the generated
     * HTML\n documentation. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2578)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2592)
    public Iterator<String> getDescriptionWithNewlines(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        DmcTypeStringMV withNewLines = new DmcTypeStringMV();
        Iterator<String> it = attr.getMV();
        while(it.hasNext()){
            try{
                withNewLines.add(it.next().replaceAll("\\\\n","\\\n"));
            } catch (DmcValueException e) {
                e.printStackTrace();
            }
        }

        return(withNewLines.getMV());
    }

    /**
     * Adds another description value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2658)
    public void addDescription(Object value) throws DmcValueException {
        mycore.addDescription(value);
    }

    /**
     * Returns the number of description values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2671)
    public int getDescriptionSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * This attribute is used in TypeDefinitions to indicate the value that
     * should be returned when\n an attribute of the specified type doesn't exist
     * in the object. For example, Boolean values are defined\n to return false
     * when they aren't actually set on an object. This just gives a convenient
     * mechanism to\n provide a default value for non-existent attribute values. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2374)
    public String getNullReturnValue(){
        return(mycore.getNullReturnValue());
    }

    /**
     * Sets nullReturnValue to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2447)
    public void setNullReturnValue(Object value) throws DmcValueException {
        mycore.setNullReturnValue(value);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1791)

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

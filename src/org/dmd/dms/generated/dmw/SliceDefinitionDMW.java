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
import org.dmd.dmc.definitions.DmcDefinitionIF;

/**
 * The SliceDefinition class is used to define a named set of attributes\n
 * that are used to retrieve a slice of an object i.e. an abbreviated set
 * of\n values. These are used in the generation of static, named
 * DmcSliceInfo instances. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1630)
 */
@SuppressWarnings("unused")
public class SliceDefinitionDMW extends org.dmd.dms.DmsDefinition implements DmcDefinitionIF {

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
     * The selectAttribute indicates an attribute to be used in the definition\n
     * of a Slice. 
     * @return An Iterator of AttributeDefinition objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2560)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2644)
    public DmcAttribute<?> addSelectAttribute(AttributeDefinition value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addSelectAttribute(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of selectAttribute values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2671)
    public int getSelectAttributeSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__selectAttribute);
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

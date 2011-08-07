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
import org.dmd.dms.generated.dmo.*;
import org.dmd.dms.generated.enums.*;
import org.dmd.dms.generated.types.*;
import org.dmd.util.exceptions.*;
import org.dmd.dms.*;

/**
 * The AttributeValidatorDefinition allows for the the definition of
 * attribute level validation logic.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:952)
 */
@SuppressWarnings("unused")
public class AttributeValidatorDefinitionDMW extends org.dmd.dms.DmsDefinition {

    private AttributeValidatorDefinitionDMO mycore;

    protected AttributeValidatorDefinitionDMW() {
        super(new AttributeValidatorDefinitionDMO());
        mycore = (AttributeValidatorDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected AttributeValidatorDefinitionDMW(DmcObject obj) {
        super(obj);
        mycore = (AttributeValidatorDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected AttributeValidatorDefinitionDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (AttributeValidatorDefinitionDMO) core;
        mycore.setContainer(this);
    }

    public  AttributeValidatorDefinitionDMO getDMO() {
        return(mycore);
    }

    protected AttributeValidatorDefinitionDMW(ClassDefinition cd) {
        super(cd);
    }

    protected AttributeValidatorDefinitionDMW(String mn) throws DmcValueException {
        super(new AttributeValidatorDefinitionDMO());
        mycore = (AttributeValidatorDefinitionDMO) core;
        mycore.setContainer(this);
        mycore.setName(mn);
        metaname = mn;
    }

    /**
     * The fully qualified name of an object or attribute validator class.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1537)
    public String getValidatorClass(){
        return(mycore.getValidatorClass());
    }

    /**
     * Sets validatorClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public void setValidatorClass(Object value) throws DmcValueException {
        mycore.setValidatorClass(value);
    }

    /**
     * Indicates the operational context for some component e.g. object or
     * attribute validators.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1537)
    public OperationalContextEnum getOpContext(){
        return(mycore.getOpContext());
    }

    /**
     * Sets opContext to the specified value.
     * @param value A value compatible with DmcTypeOperationalContextEnumSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
    public void setOpContext(Object value) throws DmcValueException {
        mycore.setOpContext(value);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The description is of type XHMTLString which
     * is basically an XML formatted fragment that conforms to the XHTML 1.0
     * specification. For more information, see the DmdTypeDef for XHTMLString.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1537)
    public String getDescription(){
        return(mycore.getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1589)
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
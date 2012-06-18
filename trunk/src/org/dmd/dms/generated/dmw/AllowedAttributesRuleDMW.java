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
 * null
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1077)
 */
@SuppressWarnings("unused")
public class AllowedAttributesRuleDMW extends DmwWrapper {

    private AllowedAttributesRuleDMO mycore;

    protected AllowedAttributesRuleDMW() {
        super(new AllowedAttributesRuleDMO());
        mycore = (AllowedAttributesRuleDMO) core;
        mycore.setContainer(this);
    }

    protected AllowedAttributesRuleDMW(DmcObject obj) {
        super(obj);
        mycore = (AllowedAttributesRuleDMO) core;
        mycore.setContainer(this);
    }

    protected AllowedAttributesRuleDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (AllowedAttributesRuleDMO) core;
        mycore.setContainer(this);
    }

    public  AllowedAttributesRuleDMO getDMO() {
        return(mycore);
    }

    /**
     * The title of a rule.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1721)
    public String getRuleTitle(){
        return(mycore.getRuleTitle());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1773)
    public void setRuleTitle(Object value) throws DmcValueException {
        mycore.setRuleTitle(value);
    }

    /**
     * The fully qualified name of a class that extends the schema management
     * capabilities of the SchemaManager. the class must have a zero arg
     * constructor and implement the SchemaExtensionIF.
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1866)
    public Iterator<String> getSchemaExtension(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__schemaExtension);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another schemaExtension value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1913)
    public DmcAttribute<?> addSchemaExtension(Object value) throws DmcValueException {
        return(mycore.addSchemaExtension(value));
    }

    /**
     * Returns the number of schemaExtension values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1924)
    public int getSchemaExtensionSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__schemaExtension);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }


}

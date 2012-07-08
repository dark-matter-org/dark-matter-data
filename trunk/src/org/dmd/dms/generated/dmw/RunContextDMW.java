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
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1149)
 */
@SuppressWarnings("unused")
public class RunContextDMW extends org.dmd.dms.DmsDefinition {

    private RunContextDMO mycore;

    protected RunContextDMW() {
        super(new RunContextDMO());
        mycore = (RunContextDMO) core;
        mycore.setContainer(this);
    }

    protected RunContextDMW(DmcObject obj) {
        super(obj);
        mycore = (RunContextDMO) core;
        mycore.setContainer(this);
    }

    protected RunContextDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (RunContextDMO) core;
        mycore.setContainer(this);
    }

    public  RunContextDMO getDMO() {
        return(mycore);
    }

    protected RunContextDMW(ClassDefinition cd) {
        super(cd);
    }

    protected RunContextDMW(String mn) throws DmcValueException {
        super(new RunContextDMO());
        mycore = (RunContextDMO) core;
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1771)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1823)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * A set of references to Dependencies.
     * @return An Iterator of Dependency objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1903)
    public DependencyIterableDMW getDependencies(){
        DmcTypeDependencyREFMV attr = (DmcTypeDependencyREFMV) mycore.get(MetaDMSAG.__dependencies);
        if (attr == null)
            return(DependencyIterableDMW.emptyList);

        return(new DependencyIterableDMW(attr.getMV()));
    }

    /**
     * Adds another dependencies value.
     * @param value A value compatible with Dependency
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1951)
    public DmcAttribute<?> addDependencies(Dependency value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addDependencies(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of dependencies values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1974)
    public int getDependenciesSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__dependencies);
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1771)
    public String getDescription(){
        return(mycore.getDescription());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1823)
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

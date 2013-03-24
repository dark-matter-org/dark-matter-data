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
 * The Dependency class allows for the definition of a named dependency\n on
 * something; usually an interface. In the current schema mechanisms, the
 * only place\n that this mechanism is used is in the specification of
 * RuleDefinitions. Rule instances are\n created by injecting RuleData into a
 * rule implementation. If the rule implementation\n has dependencies on
 * other objects, those dependencies are specified via references to\n
 * Dependencies.\n <p/>\n A Dependency can be referred to via a RunContext
 * definition which directs the generation\n of code that can instantiate the
 * required object instances. Satisfying a Dependency relies\n on there being
 * a DependencyImplementation that indicates how to instantiate the object\n
 * that implements the interface defined by the dependency.\n <p/>\n If a
 * Dependency specifies an instantiation, this is considered the default
 * mechanism to\n fulfill the dependency. Other DependencyImplementations may
 * be specified that override\n the specified instantiation in particular
 * contexts.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1577)
 */
@SuppressWarnings("unused")
public class DependencyDMW extends org.dmd.dms.DmsDefinition implements DmcDefinitionIF {

    private DependencyDMO mycore;

    protected DependencyDMW() {
        super(new DependencyDMO());
        mycore = (DependencyDMO) core;
        mycore.setContainer(this);
    }

    protected DependencyDMW(DmcObject obj) {
        super(obj);
        mycore = (DependencyDMO) core;
        mycore.setContainer(this);
    }

    protected DependencyDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (DependencyDMO) core;
        mycore.setContainer(this);
    }

    public  DependencyDMO getDMO() {
        return(mycore);
    }

    protected DependencyDMW(ClassDefinition cd) {
        super(cd);
    }

    protected DependencyDMW(String mn) throws DmcValueException {
        super(new DependencyDMO());
        mycore = (DependencyDMO) core;
        mycore.setContainer(this);
        mycore.setName(mn);
        metaname = mn;
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name\n for an object. A name should be composed of characters in
     * the range, [a-z] [A-Z] [0-9]. No whitespace\n characters are allowed. All
     * names must start with a character.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2398)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * The fully qualified name of a Java interface or base class that specifies
     * a dependency.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
    public String getUseInterface(){
        return(mycore.getUseInterface());
    }

    /**
     * Sets useInterface to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2398)
    public void setUseInterface(Object value) throws DmcValueException {
        mycore.setUseInterface(value);
    }

    /**
     * A set of references to Dependencies.
     * @return An Iterator of Dependency objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2486)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2545)
    public DmcAttribute<?> addDependencies(Dependency value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addDependencies(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of dependencies values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2571)
    public int getDependenciesSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__dependencies);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }

    /**
     * The instantiation attribute specifies how something is to be instantiated.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2325)
    public String getInstantiation(){
        return(mycore.getInstantiation());
    }

    /**
     * Sets instantiation to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2398)
    public void setInstantiation(Object value) throws DmcValueException {
        mycore.setInstantiation(value);
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1740)

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

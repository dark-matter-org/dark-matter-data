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
 * The DependencyImplementation allows you to fulfill a defined Dependency.\n
 * When a RunContext is specified, it will indicate a set of dependencies.
 * For each of the\n specified dependencies, there must be at least one
 * related DependencyImplementation,\n otherwise, we have no way to fulfill
 * the dependency.
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1561)
 */
@SuppressWarnings("unused")
public class DependencyImplementationDMW extends org.dmd.dms.DmsDefinition {

    private DependencyImplementationDMO mycore;

    protected DependencyImplementationDMW() {
        super(new DependencyImplementationDMO());
        mycore = (DependencyImplementationDMO) core;
        mycore.setContainer(this);
    }

    protected DependencyImplementationDMW(DmcObject obj) {
        super(obj);
        mycore = (DependencyImplementationDMO) core;
        mycore.setContainer(this);
    }

    protected DependencyImplementationDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (DependencyImplementationDMO) core;
        mycore.setContainer(this);
    }

    public  DependencyImplementationDMO getDMO() {
        return(mycore);
    }

    protected DependencyImplementationDMW(ClassDefinition cd) {
        super(cd);
    }

    protected DependencyImplementationDMW(String mn) throws DmcValueException {
        super(new DependencyImplementationDMO());
        mycore = (DependencyImplementationDMO) core;
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
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2281)
    public StringName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2354)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * A reference to a single Dependency.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2281)
    public Dependency getDependency(){
        DmcTypeDependencyREFSV attr = (DmcTypeDependencyREFSV) mycore.get(MetaDMSAG.__dependency);
        if (attr == null)
            return(null);
        DependencyDMO obj = attr.getSV().getObject();
        return((Dependency)obj.getContainer());
    }

    /**
     * Sets dependency to the specified value.
     * @param value A value compatible with Dependency
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2341)
    public void setDependency(Dependency value) throws DmcValueException {
        mycore.setDependency(value.getDmcObject());
    }

    /**
     * A reference to a RunContext.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2281)
    public RunContext getRunContext(){
        DmcTypeRunContextREFSV attr = (DmcTypeRunContextREFSV) mycore.get(MetaDMSAG.__runContext);
        if (attr == null)
            return(null);
        RunContextDMO obj = attr.getSV().getObject();
        return((RunContext)obj.getContainer());
    }

    /**
     * Sets runContext to the specified value.
     * @param value A value compatible with RunContext
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2341)
    public void setRunContext(RunContext value) throws DmcValueException {
        mycore.setRunContext(value.getDmcObject());
    }

    /**
     * The instantiation attribute specifies how something is to be instantiated.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2281)
    public String getInstantiation(){
        return(mycore.getInstantiation());
    }

    /**
     * Sets instantiation to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2354)
    public void setInstantiation(Object value) throws DmcValueException {
        mycore.setInstantiation(value);
    }

    /**
     * The description attribute is used to provide descriptive\n documentation
     * for schema related definitions. The text provided should conform\n to
     * XHTML concepts since it will be dumped in the context of the generated
     * HTML\n documentation.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2281)
    public String getDescription(){
        return(mycore.getDescription());
    }

    public String getDescriptionWithNewlines(){
        return(mycore.getDescriptionWithNewlines());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2354)
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

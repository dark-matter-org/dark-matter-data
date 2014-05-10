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
package org.dmd.dms.server.generated.dmw;


// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpDMWClasses(DmwFormatter.java:97)
import java.util.*;                                     // To support access functions - (DmwFormatter.java:69)
import org.dmd.core.*;                                  // Basic dark-matter infrastructure - (DmwFormatter.java:71)
import org.dmd.core.feedback.*;                         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:77)
import org.dmd.core.interfaces.DmcDefinitionIF;         // Because this is a DS definition - (DmwFormatter.java:85)
import org.dmd.dms.server.extended.*;                   // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:73)
import org.dmd.dms.shared.generated.dmo.*;              // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:74)
import org.dmd.dms.shared.generated.enums.*;            // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:75)
import org.dmd.dms.shared.generated.types.*;            // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:76)
import org.dmd.dms.shared.types.*;                      // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (DmwFormatter.java:70)
import org.dmd.dmw.*;                                   // Base wrapper capabilities - (DmwFormatter.java:72)

/**
 * The DependencyImplementation allows you to fulfill a defined Dependency.
 * When a RunContext is specified, it will indicate a set of dependencies.
 * For each of the specified dependencies, there must be at least one related
 * DependencyImplementation, otherwise, we have no way to fulfill the
 * dependency. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpDMWClasses(DmwFormatter.java:105)
 */
@SuppressWarnings("unused")
public class DependencyImplementationDMW extends org.dmd.dms.server.extended.DmsDefinition implements DmcDefinitionIF {

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

    protected DependencyImplementationDMW(String mn) throws DMFeedbackSet {
        super(new DependencyImplementationDMO());
        mycore = (DependencyImplementationDMO) core;
        mycore.setContainer(this);
        mycore.setName(mn);
        metaname = mn;
    }

    /**
     * How a name is composed will depend on the context in which it used. For
     * instance, the names of definitions specified as part of a dark-matter
     * schema will conform to conventions of naming classes and or attributes in
     * Java. <p/> The generated documentation for a set of Domain Specific
     * Language (DSL) concepts will indicate the rules that apply to a name in
     * that DSL. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setName(Object value) throws DMFeedbackSet {
        mycore.setName(value);
    }

    /**
     * A reference to a single Dependency. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:193)
    public void setDependency(Dependency value) throws DMFeedbackSet {
        mycore.setDependency(value.getDmcObject());
    }

    /**
     * A reference to a RunContext. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
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
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:193)
    public void setRunContext(RunContext value) throws DMFeedbackSet {
        mycore.setRunContext(value.getDmcObject());
    }

    /**
     * The instantiation attribute specifies how something is to be instantiated. 
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:133)
    public String getInstantiation(){
        return(mycore.getInstantiation());
    }

    /**
     * Sets instantiation to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpSVAccessFunction(AccessFunctionFormatter.java:206)
    public void setInstantiation(Object value) throws DMFeedbackSet {
        mycore.setInstantiation(value);
    }

    /**
     * The description attribute is used to provide descriptive documentation for
     * schema related definitions. The text provided should conform to XHTML
     * concepts since it will be dumped in the context of the generated HTML
     * documentation. 
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:350)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:364)
    public Iterator<String> getDescriptionWithNewlines(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        DmcTypeStringMV withNewLines = new DmcTypeStringMV();
        Iterator<String> it = attr.getMV();
        while(it.hasNext()){
            try{
                withNewLines.add(it.next().replaceAll("\\\\n","\\\n"));
            } catch (DMFeedbackSet e) {
                e.printStackTrace();
            }
        }

        return(withNewLines.getMV());
    }

    /**
     * Adds another description value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:427)
    public void addDescription(Object value) throws DMFeedbackSet {
        mycore.addDescription(value);
    }

    /**
     * Returns the number of description values.
     */
    // org.dmd.dms.tools.generation.meta.AccessFunctionFormatter.dumpMVAccessFunction(AccessFunctionFormatter.java:436)
    public int getDescriptionSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.tools.generation.meta.DmwFormatter.dumpDMWClasses(DmwFormatter.java:256)

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

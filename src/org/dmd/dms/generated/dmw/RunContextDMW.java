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


// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1637)
import java.util.*;                                     // To support access functions - (MetaGenerator.java:1610)
import org.dmd.dmc.*;                                   // Basic dark-matter infrastructure - (MetaGenerator.java:1612)
import org.dmd.dmc.definitions.DmcDefinitionIF;         // Because this is a DS definition - (MetaGenerator.java:1625)
import org.dmd.dmc.types.*;                             // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1611)
import org.dmd.dms.*;                                   // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1618)
import org.dmd.dms.generated.dmo.*;                     // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1614)
import org.dmd.dms.generated.enums.*;                   // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1615)
import org.dmd.dms.generated.types.*;                   // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1616)
import org.dmd.dmw.*;                                   // Base wrapper capabilities - (MetaGenerator.java:1613)
import org.dmd.util.exceptions.*;                       // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1617)

/**
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1646)
 */
@SuppressWarnings("unused")
public class RunContextDMW extends org.dmd.dms.DmsDefinition implements DmcDefinitionIF {

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

    @Override
    public void setDmcObject(DmcObject obj) {
        core   = obj;
        mycore = (RunContextDMO) obj;
        obj.setContainer(this);
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
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2399)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2472)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * A set of references to Dependencies. 
     * @return An Iterator of Dependency objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2590)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2674)
    public DmcAttribute<?> addDependencies(Dependency value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addDependencies(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of dependencies values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2701)
    public int getDependenciesSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__dependencies);
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2608)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2622)
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
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2688)
    public void addDescription(Object value) throws DmcValueException {
        mycore.addDescription(value);
    }

    /**
     * Returns the number of description values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2701)
    public int getDescriptionSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__description);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1813)

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

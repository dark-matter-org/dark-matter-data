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
import java.util.*;                           // To support access functions - (MetaGenerator.java:1610)
import org.dmd.dmc.*;                         // Basic dark-matter infrastructure - (MetaGenerator.java:1612)
import org.dmd.dmc.types.*;                   // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1611)
import org.dmd.dms.*;                         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1618)
import org.dmd.dms.generated.dmo.*;           // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1614)
import org.dmd.dms.generated.enums.*;         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1615)
import org.dmd.dms.generated.types.*;         // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1616)
import org.dmd.dmw.*;                         // Base wrapper capabilities - (MetaGenerator.java:1613)
import org.dmd.util.exceptions.*;             // Blanket import because at the meta level it's tricky to determine the exact pieces we need - (MetaGenerator.java:1617)

/**
 * The DmsDefinition class provides a common base for all dark-matter schema
 * (DMS) definition classes. 
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1646)
 */
@SuppressWarnings("unused")
public abstract class DmsDefinitionDMW extends org.dmd.dms.DSDefinition {

    private DmsDefinitionDMO mycore;

    protected DmsDefinitionDMW() {
        super(new DmsDefinitionDMO());
        mycore = (DmsDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected DmsDefinitionDMW(DmcObject obj) {
        super(obj);
        mycore = (DmsDefinitionDMO) core;
        mycore.setContainer(this);
    }

    protected DmsDefinitionDMW(DmcObject obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (DmsDefinitionDMO) core;
        mycore.setContainer(this);
    }

    public  DmsDefinitionDMO getDMO() {
        return(mycore);
    }

    /**
     * The name attribute is used to store a single string token that represents
     * a unique name\n for an object with the set of definitions of which it is a
     * part. A name starts with a letter followed\n by letters and numbers. 
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2393)
    public DefinitionName getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:2466)
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Allows for references to base concepts that relate this\n definition to
     * another definition in the Concinnity domain. This mechanism is only used\n
     * in the domain of dark-matter schema definitions; other DSLs will allow for
     * direct\n reference to Concinnity concepts. 
     * @return An Iterator of Concinnity objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2584)
    public ConcinnityIterableDMW getRelatedToConcept(){
        DmcTypeConcinnityREFMV attr = (DmcTypeConcinnityREFMV) mycore.get(MetaDMSAG.__relatedToConcept);
        if (attr == null)
            return(ConcinnityIterableDMW.emptyList);

        return(new ConcinnityIterableDMW(attr.getMV()));
    }

    /**
     * Adds another relatedToConcept value.
     * @param value A value compatible with Concinnity
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2668)
    public DmcAttribute<?> addRelatedToConcept(Concinnity value) throws DmcValueException {
        DmcAttribute<?> attr = mycore.addRelatedToConcept(value.getDmcObject());
        return(attr);
    }

    /**
     * Returns the number of relatedToConcept values.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:2695)
    public int getRelatedToConceptSize(){
        DmcAttribute<?> attr = mycore.get(MetaDMSAG.__relatedToConcept);
        if (attr == null)
            return(0);
        return(attr.getMVSize());
    }


    ////////////////////////////////////////////////////////////////////////////////
    // DmcNamedObjectIF implementation
    // Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMWClasses(MetaGenerator.java:1807)

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

//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2013 dark-matter-data committers
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
package org.dmd.dmt.dsd.dsdb.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:365)
import org.dmd.dmc.*;                                                     // If any attributes - (BaseDMWGeneratorNewest.java:979)
import org.dmd.dmc.definitions.DmcDefinitionIF;                           // The object is a domain specific definition - (BaseDMWGeneratorNewest.java:334)
import org.dmd.dmc.types.DefinitionName;                                  // Is named by - (BaseDMWGeneratorNewest.java:958)
import org.dmd.dmc.types.DotName;                                         // Primitive type - (BaseDMWGeneratorNewest.java:1042)
import org.dmd.dms.ClassDefinition;                                       // Passing derived class def up the hierarchy - (BaseDMWGeneratorNewest.java:963)
import org.dmd.dms.DSDefinition;                                          // Derived class - (BaseDMWGeneratorNewest.java:1140)
import org.dmd.dmt.dsd.dsdb.server.extended.BConceptBase;                 // Required for getModificationRecorder() - (BaseDMWGeneratorNewest.java:972)
import org.dmd.dmt.dsd.dsdb.server.extended.ModuleB;                      // Is reference type - (BaseDMWGeneratorNewest.java:999)
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.BConceptBaseDMO;         // Abstract class - (BaseDMWGeneratorNewest.java:1122)
import org.dmd.dmt.dsd.dsdb.shared.generated.types.ModuleBREF;            // Is reference type REF - (BaseDMWGeneratorNewest.java:1007)



/**
 * The base definition for this DSD module.
 * <P>
 * Generated from the dsdB schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:391)
 */
abstract public class BConceptBaseDMW extends DSDefinition implements DmcNamedObjectIF, DmcDefinitionIF {

    protected BConceptBaseDMW() {
        super();
    }

    abstract public BConceptBase getModificationRecorder();

    public BConceptBaseDMO getDMO() {
        return((BConceptBaseDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGeneratorNewest.dumpWrapper(BaseDMWGeneratorNewest.java:554)
    protected BConceptBaseDMW(BConceptBaseDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.getAccessFunctions(BaseDMWGeneratorNewest.java:1189)
    public DefinitionName getObjectName(){
        return(((BConceptBaseDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((BConceptBaseDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof BConceptBaseDMW){
            return( getObjectName().equals( ((BConceptBaseDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return A ModuleB object.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1326)
    public ModuleB getDefinedInModuleB(){
        ModuleBREF ref = ((BConceptBaseDMO) core).getDefinedInModuleB();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((ModuleB)ref.getObject().getContainer());
    }

    /**
     * Sets the definedInModuleB to the specified value.
     * @param value A value compatible with ModuleBREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1411)
    public void setDefinedInModuleB(ModuleB value) {
        ((BConceptBaseDMO) core).setDefinedInModuleB(value.getDMO());
    }

    /**
     * Sets the definedInModuleB to the specified value.
     * @param value A value compatible with ModuleBREF
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1420)
    public void setDefinedInModuleB(Object value) throws DmcValueException {
        ((BConceptBaseDMO) core).setDefinedInModuleB(value);
    }

    /**
     * Removes the definedInModuleB attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1511)
    public void remDefinedInModuleB(){
        ((BConceptBaseDMO) core).remDefinedInModuleB();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public DotName getDotName(){
        return(((BConceptBaseDMO) core).getDotName());
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1476)
    public void setDotName(Object value) throws DmcValueException {
        ((BConceptBaseDMO) core).setDotName(value);
    }

    /**
     * Sets dotName to the specified value.
     * @param value DotName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1485)
    public void setDotName(DotName value){
        ((BConceptBaseDMO) core).setDotName(value);
    }

    /**
     * Removes the dotName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1511)
    public void remDotName(){
        ((BConceptBaseDMO) core).remDotName();
    }

    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1366)
    public DefinitionName getName(){
        return(((BConceptBaseDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1476)
    public void setName(Object value) throws DmcValueException {
        ((BConceptBaseDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1485)
    public void setName(DefinitionName value){
        ((BConceptBaseDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGeneratorNewest.formatSV(BaseDMWGeneratorNewest.java:1511)
    public void remName(){
        ((BConceptBaseDMO) core).remName();
    }


}

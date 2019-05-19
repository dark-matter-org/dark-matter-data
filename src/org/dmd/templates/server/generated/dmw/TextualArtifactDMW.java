//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
package org.dmd.templates.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import java.util.ArrayList;                                                // Support for MULTI attribute - (BaseDMWGenerator.java:2114)
import java.util.Iterator;                                                 // Support copy of MV objects - (BaseDMWGenerator.java:2128)
import org.dmd.dmc.*;                                                      // If any attributes - (BaseDMWGenerator.java:975)
import org.dmd.dmc.definitions.DmcDefinitionIF;                            // The object is a domain specific definition - (BaseDMWGenerator.java:411)
import org.dmd.dmc.types.DefinitionName;                                   // Is named by - (BaseDMWGenerator.java:939)
import org.dmd.dms.ClassDefinition;                                        // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                // Required for MODREC constructor - (BaseDMWGenerator.java:949)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                      // Required for MODREC constructor - (BaseDMWGenerator.java:948)
import org.dmd.templates.server.extended.TdlDefinition;                    // Derived class - (BaseDMWGenerator.java:1136)
import org.dmd.templates.server.extended.TextualArtifact;                  // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.templates.server.generated.dmw.ContainsIterableDMW;         // For multi-valued Contains - (BaseDMWGenerator.java:1991)
import org.dmd.templates.shared.generated.dmo.DmtdlDMSAG;                  // Attribute contains from the dmtdl schema - (BaseDMWGenerator.java:910)
import org.dmd.templates.shared.generated.dmo.TextualArtifactDMO;          // Class not auxiliary or abstract - (BaseDMWGenerator.java:1140)
import org.dmd.templates.shared.generated.types.Contains;                  // Primitive type - (BaseDMWGenerator.java:1038)
import org.dmd.templates.shared.generated.types.TdlModuleREF;              // Required to access defined in module name - (DMWGenerator.java:181)



/**
 * A TextualArtifact is the top level entity that is comprised of Sections\n
 * and formatted via Templates.
 * <P>
 * Generated from the dmtdl schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
abstract public class TextualArtifactDMW extends TdlDefinition implements DmcDefinitionIF, DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:577)
    public TextualArtifactDMW() {
        super(new TextualArtifactDMO(), org.dmd.templates.server.generated.DmtdlSchemaAG._TextualArtifact);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:583)
    public TextualArtifactDMW(DmcTypeModifierMV mods) {
        super(new TextualArtifactDMO(mods), org.dmd.templates.server.generated.DmtdlSchemaAG._TextualArtifact);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:625)
    public TextualArtifact getModificationRecorder(){
        TextualArtifact rc = new TextualArtifact();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:646)
    public TextualArtifactDMW(TextualArtifactDMO obj) {
        super(obj, org.dmd.templates.server.generated.DmtdlSchemaAG._TextualArtifact);
    }

    public TextualArtifact cloneIt() {
        TextualArtifact rc = new TextualArtifact();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public TextualArtifactDMO getDMO() {
        return((TextualArtifactDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected TextualArtifactDMW(TextualArtifactDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1185)
    public DefinitionName getObjectName(){
        return(((TextualArtifactDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((TextualArtifactDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof TextualArtifactDMW){
            return( getObjectName().equals( ((TextualArtifactDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return The number of Contains items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1559)
    public int getContainsSize(){
        return(((TextualArtifactDMO) core).getContainsSize());
    }

    /**
     * @return true if there are no ContainsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1567)
    public boolean getContainsIsEmpty(){
        if (((TextualArtifactDMO) core).getContainsSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any ContainsDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1577)
    public boolean getContainsHasValue(){
        if (((TextualArtifactDMO) core).getContainsSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of Contains objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1995)
    public ContainsIterableDMW getContainsIterable(){
        DmcAttribute<?> attr = core.get(DmtdlDMSAG.__contains);
        if (attr == null)
            return(ContainsIterableDMW.emptyList);
        
        return(new ContainsIterableDMW(((TextualArtifactDMO) core).getContains()));
    }

    /**
     * Adds another contains value.
     * @param value A value compatible with Contains
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2021)
    public void addContains(Object value) throws DmcValueException {
        ((TextualArtifactDMO) core).addContains(value);
    }

    /**
     * Adds another contains value.
     * @param value A value compatible with Contains
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2031)
    public void addContains(Contains value){
        ((TextualArtifactDMO) core).addContains(value);
    }

    /**
     * Returns true if the collection contains the contains value.
     * @param value A value compatible with Contains
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2088)
    public boolean containsContains(Contains value){
        return(((TextualArtifactDMO) core).containsContains(value));
    }

    /**
     * @return A COPY of the collection of Contains objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2132)
    @SuppressWarnings("unchecked")
    public ArrayList<Contains> getContainsCopy(){
        DmcAttribute<?> attr = core.get(DmtdlDMSAG.__contains);
        if (attr == null)
            return(new ArrayList<Contains>());
        
        ArrayList<Contains> rc = new ArrayList<Contains>(attr.getMVSize());
        
        Iterator<Contains> it = (Iterator<Contains>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a contains value.
     * @param value The Contains to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2159)
    public void delContains(Object value) throws DmcValueException {
        ((TextualArtifactDMO) core).delContains(value);
    }

    /**
     * Deletes a contains value.
     * @param value The Contains to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2168)
    public void delContains(Contains value){
        ((TextualArtifactDMO) core).delContains(value);
    }

    /**
     * Removes the contains attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2180)
    public void remContains(){
        ((TextualArtifactDMO) core).remContains();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1362)
    public DefinitionName getName(){
        return(((TextualArtifactDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1472)
    public void setName(Object value) throws DmcValueException {
        ((TextualArtifactDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1481)
    public void setName(DefinitionName value){
        ((TextualArtifactDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1507)
    public void remName(){
        ((TextualArtifactDMO) core).remName();
    }

    // Generated from: org.dmd.dmg.generators.DMWGenerator.dumpAdditionalWrapperFunctions(DMWGenerator.java:234)
    /**
     * This method indicates the name of the module from which this definition was loaded.
     */
    @Override
    public String getNameOfModuleWhereThisCameFrom(){
        TdlModuleREF ref = ((TextualArtifactDMO) core).getDefinedInTdlModule();
        return(ref.getName().getNameString());
    }


}

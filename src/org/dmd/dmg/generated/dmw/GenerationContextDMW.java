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
package org.dmd.dmg.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:442)
import org.dmd.dmc.*;                                          // If any attributes - (BaseDMWGenerator.java:1087)
import org.dmd.dmc.types.CamelCaseName;                        // Is named by - (BaseDMWGenerator.java:1062)
import org.dmd.dmg.extended.GenerationContext;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:1076)
import org.dmd.dmg.generated.dmo.GenerationContextDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1252)
import org.dmd.dms.ClassDefinition;                            // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:1067)
import org.dmd.dms.generated.dmo.MetaDMSAG;                    // Required for MODREC constructor - (BaseDMWGenerator.java:1072)
import org.dmd.dms.generated.types.DmcTypeModifierMV;          // Required for MODREC constructor - (BaseDMWGenerator.java:1071)
import org.dmd.dmw.DmwNamedObjectWrapper;                      // Named object wrapper - (BaseDMWGenerator.java:1242)



/**
 * The GenerationContext acts as a gathering point for a set of\n code
 * generation components.
 * <P>
 * Generated from the dmg schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:479)
 */
public class GenerationContextDMW extends DmwNamedObjectWrapper implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:558)
    public GenerationContextDMW() {
        super(new GenerationContextDMO(), org.dmd.dmg.generated.DmgSchemaAG._GenerationContext);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:564)
    public GenerationContextDMW(DmcTypeModifierMV mods) {
        super(new GenerationContextDMO(mods), org.dmd.dmg.generated.DmgSchemaAG._GenerationContext);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:606)
    public GenerationContext getModificationRecorder(){
        GenerationContext rc = new GenerationContext();
        rc.setGenContextName(getGenContextName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:627)
    public GenerationContextDMW(GenerationContextDMO obj) {
        super(obj, org.dmd.dmg.generated.DmgSchemaAG._GenerationContext);
    }

    public GenerationContext cloneIt() {
        GenerationContext rc = new GenerationContext();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public GenerationContextDMO getDMO() {
        return((GenerationContextDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:642)
    protected GenerationContextDMW(GenerationContextDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1297)
    public CamelCaseName getObjectName(){
        return(((GenerationContextDMO) core).getGenContextName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((GenerationContextDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof GenerationContextDMW){
            return( getObjectName().equals( ((GenerationContextDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public CamelCaseName getGenContextName(){
        return(((GenerationContextDMO) core).getGenContextName());
    }

    /**
     * Sets genContextName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1584)
    public void setGenContextName(Object value) throws DmcValueException {
        ((GenerationContextDMO) core).setGenContextName(value);
    }

    /**
     * Sets genContextName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1593)
    public void setGenContextName(CamelCaseName value){
        ((GenerationContextDMO) core).setGenContextName(value);
    }

    /**
     * Removes the genContextName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1619)
    public void remGenContextName(){
        ((GenerationContextDMO) core).remGenContextName();
    }


}

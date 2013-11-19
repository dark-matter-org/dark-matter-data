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
//	Copyright (c) 2010 dark-matter-data committers
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
package org.dmd.dmr.server.base.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:365)
import org.dmd.dmc.*;                                                   // If any attributes - (BaseDMWGenerator.java:979)
import org.dmd.dmc.types.FullyQualifiedName;                            // Is named by - (BaseDMWGenerator.java:958)
import org.dmd.dmr.server.base.extended.DotNamedObject;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:972)
import org.dmd.dmr.server.base.extended.HierarchicObject;               // Derived class - (BaseDMWGenerator.java:1140)
import org.dmd.dmr.shared.base.generated.dmo.DotNamedObjectDMO;         // Class not auxiliary or abstract - (BaseDMWGenerator.java:1144)
import org.dmd.dms.ClassDefinition;                                     // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:963)
import org.dmd.dms.generated.dmo.MetaDMSAG;                             // Required for MODREC constructor - (BaseDMWGenerator.java:968)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor - (BaseDMWGenerator.java:967)



/**
 * A DotNamedObject is a hierarchic object whose fully qualified\n name is
 * composed of naming attributes separated by periods. For example \n
 * grandparent.parent.child.\n <p>\n The naming attribute of a DotNamedObject
 * is name. Unlike LDAP objects, \n we don't bother making this configurable.
 * When a DotNamedObject is parsed\n from a file, we check to see if the name
 * attribute has a value; if not,\n we take the last portion of the FQN as
 * the name. For example, if the FQN\n is x.y.z, the name of the object would
 * be 'z'.
 * <P>
 * Generated from the dmrbase schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:391)
 */
abstract public class DotNamedObjectDMW extends HierarchicObject implements DmcNamedObjectIF {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:470)
    public DotNamedObjectDMW() {
        super(new DotNamedObjectDMO(), org.dmd.dmr.server.base.generated.DmrbaseSchemaAG._DotNamedObject);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:476)
    public DotNamedObjectDMW(DmcTypeModifierMV mods) {
        super(new DotNamedObjectDMO(mods), org.dmd.dmr.server.base.generated.DmrbaseSchemaAG._DotNamedObject);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:518)
    public DotNamedObject getModificationRecorder(){
        DotNamedObject rc = new DotNamedObject();
        rc.setFQN(getFQN());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:539)
    public DotNamedObjectDMW(DotNamedObjectDMO obj) {
        super(obj, org.dmd.dmr.server.base.generated.DmrbaseSchemaAG._DotNamedObject);
    }

    public DotNamedObject cloneIt() {
        DotNamedObject rc = new DotNamedObject();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public DotNamedObjectDMO getDMO() {
        return((DotNamedObjectDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:554)
    protected DotNamedObjectDMW(DotNamedObjectDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1189)
    public FullyQualifiedName getObjectName(){
        return(((DotNamedObjectDMO) core).getFQN());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((DotNamedObjectDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof DotNamedObjectDMW){
            return( getObjectName().equals( ((DotNamedObjectDMW) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1366)
    public FullyQualifiedName getFQN(){
        return(((DotNamedObjectDMO) core).getFQN());
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeFullyQualifiedName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1476)
    public void setFQN(Object value) throws DmcValueException {
        ((DotNamedObjectDMO) core).setFQN(value);
    }

    /**
     * Sets FQN to the specified value.
     * @param value FullyQualifiedName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1485)
    public void setFQN(FullyQualifiedName value){
        ((DotNamedObjectDMO) core).setFQN(value);
    }

    /**
     * Removes the FQN attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1511)
    public void remFQN(){
        ((DotNamedObjectDMO) core).remFQN();
    }


}

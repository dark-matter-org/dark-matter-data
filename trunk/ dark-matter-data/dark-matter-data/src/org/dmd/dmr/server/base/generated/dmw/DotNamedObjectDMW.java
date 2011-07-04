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

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:933)
import org.dmd.dmc.*;                                                   // If any attributes
import org.dmd.dmc.types.FullyQualifiedName;                            // Primitive type
import org.dmd.dmr.server.base.extended.DotNamedObject;                 // Required for getModificationRecorder()
import org.dmd.dmr.server.base.extended.HierarchicObject;               // Derived class
import org.dmd.dmr.shared.base.generated.dmo.DotNamedObjectDMO;         // Class not auxiliary or abstract
import org.dmd.dms.*;                                                   // Always 2
import org.dmd.dms.generated.dmo.MetaDMSAG;                             // Attribute from meta schema
import org.dmd.dms.generated.types.DmcTypeModifierMV;                   // Required for MODREC constructor

/**
 * A DotNamedObject is a hierarchic object whose fully qualified name is
 * composed of naming attributes separated by periods. For example 
 * grandparent.parent.child. <p> The naming attribute of a DotNamedObject is
 * name. Unlike LDAP objects,  we don't bother making this configurable. When
 * a DotNamedObject is parsed from a file, we check to see if the name
 * attribute has a value; if not, we take the last portion of the FQN as the
 * name. For example, if the FQN is x.y.z, the name of the object would be
 * 'z'.
 * <P>
 * Generated from the dmr.base schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:348)
 */
abstract public class DotNamedObjectDMW extends HierarchicObject implements DmcNamedObjectIF {

    public DotNamedObjectDMW() {
        super(new DotNamedObjectDMO(), org.dmd.dmr.server.base.generated.DmrBaseSchemaAG._DotNamedObject);
    }

    public DotNamedObjectDMW(DmcTypeModifierMV mods) {
        super(new DotNamedObjectDMO(mods), org.dmd.dmr.server.base.generated.DmrBaseSchemaAG._DotNamedObject);
    }

    public DotNamedObject getModificationRecorder(){
        DotNamedObject rc = new DotNamedObject();
        rc.setFQN(getFQN());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public DotNamedObjectDMW(DotNamedObjectDMO obj) {
        super(obj, org.dmd.dmr.server.base.generated.DmrBaseSchemaAG._DotNamedObject);
    }

    public DotNamedObjectDMO getDMO() {
        return((DotNamedObjectDMO) core);
    }

    protected DotNamedObjectDMW(DotNamedObjectDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:961)
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

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1098)
    public FullyQualifiedName getFQN(){
        return(((DotNamedObjectDMO) core).getFQN());
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeFullyQualifiedName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1145)
    public void setFQN(Object value) throws DmcValueException {
        ((DotNamedObjectDMO) core).setFQN(value);
    }

    /**
     * Sets FQN to the specified value.
     * @param value FullyQualifiedName
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1154)
    public void setFQN(FullyQualifiedName value){
        ((DotNamedObjectDMO) core).setFQN(value);
    }

    /**
     * Removes the FQN attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1180)
    public void remFQN(){
        ((DotNamedObjectDMO) core).remFQN();
    }


}

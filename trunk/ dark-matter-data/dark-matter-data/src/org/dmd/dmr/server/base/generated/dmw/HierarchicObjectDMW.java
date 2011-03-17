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

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:666)
import java.util.*;                                                       // If not auxliary
import org.dmd.dmc.*;                                                     // Always 2
import org.dmd.dmc.types.StringName;                                      // Primitive type
import org.dmd.dmr.shared.base.generated.dmo.HierarchicObjectDMO;         // Class not auxiliary or abstract
import org.dmd.dms.*;                                                     // Always 3

/**
 * A HierarchicObject is meant to represent any object that can be identified
 * with a Fully Qualified Name (FQN) and exists in a containment relationship
 * with other objects. The exact implementation of a HierarchicObject is
 * application specific.
 * <P>
 * Generated from the dmr.base schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:231)
 */
public class HierarchicObjectDMW extends DmwWrapper implements DmcNamedObjectIF {

    private HierarchicObjectDMO mycore;

    public HierarchicObjectDMW() {
        super(new HierarchicObjectDMO(), org.dmd.dmr.server.base.generated.DmrBaseSchemaAG._HierarchicObject);
        mycore = (HierarchicObjectDMO) core;
        mycore.setContainer(this);
    }

    public HierarchicObjectDMW(HierarchicObjectDMO obj) {
        super(obj, org.dmd.dmr.server.base.generated.DmrBaseSchemaAG._HierarchicObject);
        mycore = (HierarchicObjectDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (HierarchicObjectDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected HierarchicObjectDMW(HierarchicObjectDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (HierarchicObjectDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmr.server.base.extended.HierarchicObject>());
    }

    //  org.dmd.dmg.generators.DMWGenerator.getAccessFunctions(DMWGenerator.java:698)
    public StringName getObjectName(){
        return(mycore.getFQN());
    }

    public boolean equals(Object obj){
        if (obj instanceof HierarchicObjectDMW){
            return( getObjectName().equals( ((HierarchicObjectDMW) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:791)
    public StringName getParentFQN(){
        return(mycore.getParentFQN());
    }

    /**
     * Sets parentFQN to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:819)
    public void setParentFQN(Object value) throws DmcValueException {
        mycore.setParentFQN(value);
    }

    /**
     * Removes the parentFQN attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:830)
    public void remParentFQN(){
        mycore.remParentFQN();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:791)
    public Integer getLineNumber(){
        return(mycore.getLineNumber());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:819)
    public void setLineNumber(Object value) throws DmcValueException {
        mycore.setLineNumber(value);
    }

    /**
     * Removes the lineNumber attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:830)
    public void remLineNumber(){
        mycore.remLineNumber();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:791)
    public String getFile(){
        return(mycore.getFile());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:819)
    public void setFile(Object value) throws DmcValueException {
        mycore.setFile(value);
    }

    /**
     * Removes the file attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:830)
    public void remFile(){
        mycore.remFile();
    }

    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:791)
    public StringName getFQN(){
        return(mycore.getFQN());
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:819)
    public void setFQN(Object value) throws DmcValueException {
        mycore.setFQN(value);
    }

    /**
     * Removes the FQN attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:830)
    public void remFQN(){
        mycore.remFQN();
    }


}
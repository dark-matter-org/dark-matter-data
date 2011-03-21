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
package org.dmd.dmp.server.generated.dmw;

// Generated from:  org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:695)
import java.util.*;                                                // If not auxiliary
import org.dmd.dmc.*;                                              // If any attributes
import org.dmd.dmp.server.extended.Response;                       // Derived class
import org.dmd.dmp.shared.generated.dmo.DeleteResponseDMO;         // Class not auxiliary or abstract
import org.dmd.dms.*;                                              // Always 2
import org.dmd.dms.generated.dmw.DmcObjectIterableDMW;             // For multi-valued DmcObject

/**
 * The DeleteResponse returns the results of a particular DeleteRequest. The
 * objectList contents will be implementation specific e.g. if there were
 * problems with object deletion there may be error indications.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:340)
 */
abstract public class DeleteResponseDMW extends Response {

    private DeleteResponseDMO mycore;

    public DeleteResponseDMW() {
        super(new DeleteResponseDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._DeleteResponse);
        mycore = (DeleteResponseDMO) core;
        mycore.setContainer(this);
    }

    public DeleteResponseDMW(DeleteResponseDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._DeleteResponse);
        mycore = (DeleteResponseDMO) core;
        mycore.setContainer(this);
    }

    @Override
    public void setDmcObject(DmcObject obj) {
        mycore = (DeleteResponseDMO) obj;
        mycore.setContainer(this);
        super.setDmcObject(obj);
    }

    protected DeleteResponseDMW(DeleteResponseDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (DeleteResponseDMO) core;
    }

    @Override
    protected ArrayList<?> getAuxDataHolder() {
        return(new ArrayList<org.dmd.dmp.server.extended.DeleteResponse>());
    }

    /**
     * @return The number of DmcObjectDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:918)
    public int getObjectListSize(){
        DmcAttribute<?> attr = mycore.get(DeleteResponseDMO.__objectList);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no DmcObjectDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:930)
    public boolean getObjectListIsEmpty(){
        DmcAttribute<?> attr = mycore.get(DeleteResponseDMO.__objectList);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any DmcObjectDMO items.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:942)
    public boolean getObjectListHasValue(){
        DmcAttribute<?> attr = mycore.get(DeleteResponseDMO.__objectList);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of DmcObject objects.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1014)
    public DmcObjectIterableDMW getObjectListIterable(){
        DmcAttribute<?> attr = mycore.get(DeleteResponseDMO.__objectList);
        if (attr == null)
            return(DmcObjectIterableDMW.emptyList);
        
        return(new DmcObjectIterableDMW(mycore.getObjectList()));
    }

    /**
     * Adds another objectList value.
     * @param value A value compatible with DmcObject
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1052)
    public void addObjectList(Object value) throws DmcValueException {
        mycore.addObjectList(value);
    }

    /**
     * Deletes a objectList value.
     * @param value The DmcObject to be deleted from set of attribute values.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1064)
    public void delObjectList(Object value) throws DmcValueException {
        mycore.delObjectList(value);
    }

    /**
     * Removes the objectList attribute value.
     */
    //  org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1076)
    public void remObjectList(){
        mycore.remObjectList();
    }


}

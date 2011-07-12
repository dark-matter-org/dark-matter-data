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

// Generated from: org.dmd.dmg.generators.DMWGenerator.formatImports(DMWGenerator.java:933)
import java.util.ArrayList;                                    // To support getMVCopy()
import java.util.Iterator;                                     // To support getMVCopy()
import org.dmd.dmc.*;                                          // If any attributes
import org.dmd.dmc.DmcObjectName;                              // Alternative type for NameContainer values
import org.dmd.dmc.types.Modifier;                             // For multi-valued containsModifier
import org.dmd.dmc.types.NameContainer;                        // Primitive type
import org.dmd.dmp.server.extended.Request;                    // Derived class
import org.dmd.dmp.server.extended.SetRequest;                 // Required for getModificationRecorder()
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;              // Attribute from dmp schema
import org.dmd.dmp.shared.generated.dmo.SetRequestDMO;         // Class not auxiliary or abstract
import org.dmd.dms.*;                                          // Always 2
import org.dmd.dms.generated.dmw.ClassDefinitionDMW;           // Is reference type aux
import org.dmd.dms.generated.dmw.ModifierIterableDMW;          // For multi-valued Modifier
import org.dmd.dms.generated.types.ClassDefinitionREF;         // To support getMVCopy() for REFs
import org.dmd.dms.generated.types.DmcTypeModifierMV;          // Required for MODREC constructor

/**
 * The SetRequest allows you to alter the attribute values associated with an
 * object. Like the get request, the set of attributes that can be
 * manipulated will depend on the object type that is specified.
 * <P>
 * Generated from the dmp schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.DMWGenerator.dumpWrapper(DMWGenerator.java:348)
 */
abstract public class SetRequestDMW extends Request {

    public SetRequestDMW() {
        super(new SetRequestDMO(), org.dmd.dmp.server.generated.DmpSchemaAG._SetRequest);
    }

    public SetRequestDMW(DmcTypeModifierMV mods) {
        super(new SetRequestDMO(mods), org.dmd.dmp.server.generated.DmpSchemaAG._SetRequest);
    }

    public SetRequest getModificationRecorder(){
        SetRequest rc = new SetRequest();
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    public SetRequestDMW(SetRequestDMO obj) {
        super(obj, org.dmd.dmp.server.generated.DmpSchemaAG._SetRequest);
    }

    public SetRequestDMO getDMO() {
        return((SetRequestDMO) core);
    }

    protected SetRequestDMW(SetRequestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return A ClassDefinitionDMW object.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1077)
    public ClassDefinitionDMW getTargetObjectClass(){
        ClassDefinitionREF ref = ((SetRequestDMO) core).getTargetObjectClass();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((ClassDefinitionDMW)ref.getObject().getContainer());
    }

    /**
     * Sets the targetObjectClass to the specified value.
     * @param value A value compatible with ClassDefinitionREF
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1125)
    public void setTargetObjectClass(ClassDefinitionDMW value) {
        ((SetRequestDMO) core).setTargetObjectClass(value.getDMO());
    }

    /**
     * Removes the targetObjectClass attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1183)
    public void remTargetObjectClass(){
        ((SetRequestDMO) core).remTargetObjectClass();
    }

    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1101)
    public NameContainer getTarget(){
        return(((SetRequestDMO) core).getTarget());
    }

    /**
     * Sets target to the specified value.
     * @param value A value compatible with DmcTypeNameContainer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1148)
    public void setTarget(Object value) throws DmcValueException {
        ((SetRequestDMO) core).setTarget(value);
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1157)
    public void setTarget(NameContainer value){
        ((SetRequestDMO) core).setTarget(value);
    }

    /**
     * Sets target to the specified value.
     * @param value NameContainer
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1171)
    public void setTarget(DmcObjectName value){
        ((SetRequestDMO) core).setTarget(value);
    }

    /**
     * Removes the target attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatSV(DMWGenerator.java:1183)
    public void remTarget(){
        ((SetRequestDMO) core).remTarget();
    }

    /**
     * @return The number of Modifier items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1235)
    public int getModifySize(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__modify);
        if (attr == null)
            return(0);
        
        return(attr.getMVSize());
    }

    /**
     * @return true if there are no ModifierDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1248)
    public boolean getModifyIsEmpty(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__modify);
        if (attr == null)
            return(true);
        
        return(false);
    }

    /**
     * @return true if there are any ModifierDMO items.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1260)
    public boolean getModifyHasValue(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__modify);
        if (attr == null)
            return(false);
        
        return(true);
    }

    /**
     * @return An Iterator of Modifier objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1458)
    public ModifierIterableDMW getModifyIterable(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__modify);
        if (attr == null)
            return(ModifierIterableDMW.emptyList);
        
        return(new ModifierIterableDMW(((SetRequestDMO) core).getModify()));
    }

    /**
     * Adds another modify value.
     * @param value A value compatible with Modifier
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1474)
    public void addModify(Object value) throws DmcValueException {
        ((SetRequestDMO) core).addModify(value);
    }

    /**
     * Adds another modify value.
     * @param value A value compatible with Modifier
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1484)
    public void addModify(Modifier value){
        ((SetRequestDMO) core).addModify(value);
    }

    /**
     * Returns true if the collection contains the modify value.
     * @param value A value compatible with Modifier
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1542)
    public boolean modifyContains(Modifier value){
        return(((SetRequestDMO) core).modifyContains(value));
    }

    /**
     * @return A COPY of the collection of Modifier objects.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1582)
    @SuppressWarnings("unchecked")
    public ArrayList<Modifier> getModifyCopy(){
        DmcAttribute<?> attr = core.get(DmpDMSAG.__modify);
        if (attr == null)
            return(new ArrayList<Modifier>());
        
        ArrayList<Modifier> rc = new ArrayList<Modifier>(attr.getMVSize());
        
        Iterator<Modifier> it = (Iterator<Modifier>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a modify value.
     * @param value The Modifier to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1609)
    public void delModify(Object value) throws DmcValueException {
        ((SetRequestDMO) core).delModify(value);
    }

    /**
     * Deletes a modify value.
     * @param value The Modifier to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1618)
    public void delModify(Modifier value){
        ((SetRequestDMO) core).delModify(value);
    }

    /**
     * Removes the modify attribute value.
     */
    // org.dmd.dmg.generators.DMWGenerator.formatMV(DMWGenerator.java:1630)
    public void remModify(){
        ((SetRequestDMO) core).remModify();
    }


}

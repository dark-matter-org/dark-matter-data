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
package org.dmd.dmt.server.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:365)
import java.util.ArrayList;                                                           // To support getMVCopy() - (BaseDMWGenerator.java:1073)
import java.util.Iterator;                                                            // Support copy of MV objects - (BaseDMWGenerator.java:2132)
import org.dmd.dmc.*;                                                                 // If any attributes - (BaseDMWGenerator.java:979)
import org.dmd.dms.ClassDefinition;                                                   // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:963)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                           // Required for MODREC constructor - (BaseDMWGenerator.java:968)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                                 // Required for MODREC constructor - (BaseDMWGenerator.java:967)
import org.dmd.dmt.server.generated.dmw.MenuElementTypeAndCommentIterableDMW;         // For multi-valued MenuElementTypeAndComment - (BaseDMWGenerator.java:1995)
import org.dmd.dmt.shared.generated.dmo.ComplexTypeTestDMO;                           // Class not auxiliary or abstract - (BaseDMWGenerator.java:1144)
import org.dmd.dmt.shared.generated.dmo.DmtDMSAG;                                     // Attribute mvComplex from the dmt schema - (BaseDMWGenerator.java:794)
import org.dmd.dmt.shared.generated.types.MenuElementTypeAndComment;                  // Primitive type - (BaseDMWGenerator.java:1042)
import org.dmd.dmw.DmwWrapper;                                                        // Unnamed object wrapper - (BaseDMWGenerator.java:1127)



/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:391)
 */
public class ComplexTypeTestDMW extends DmwWrapper  {

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:470)
    public ComplexTypeTestDMW() {
        super(new ComplexTypeTestDMO(), org.dmd.dmt.server.generated.DmtSchemaAG._ComplexTypeTest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:476)
    public ComplexTypeTestDMW(DmcTypeModifierMV mods) {
        super(new ComplexTypeTestDMO(mods), org.dmd.dmt.server.generated.DmtSchemaAG._ComplexTypeTest);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:505)
    public ComplexTypeTestDMW getModificationRecorder(){
        ComplexTypeTestDMW rc = new ComplexTypeTestDMW(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:539)
    public ComplexTypeTestDMW(ComplexTypeTestDMO obj) {
        super(obj, org.dmd.dmt.server.generated.DmtSchemaAG._ComplexTypeTest);
    }

    public ComplexTypeTestDMW cloneIt() {
        ComplexTypeTestDMW rc = new ComplexTypeTestDMW();
        rc.setDmcObject(getDMO().cloneIt());
        return(rc);
    }

    public ComplexTypeTestDMO getDMO() {
        return((ComplexTypeTestDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:554)
    protected ComplexTypeTestDMW(ComplexTypeTestDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    /**
     * @return The number of MenuElementTypeAndComment items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1563)
    public int getMvComplexSize(){
        return(((ComplexTypeTestDMO) core).getMvComplexSize());
    }

    /**
     * @return true if there are no MenuElementTypeAndCommentDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1571)
    public boolean getMvComplexIsEmpty(){
        if (((ComplexTypeTestDMO) core).getMvComplexSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any MenuElementTypeAndCommentDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1581)
    public boolean getMvComplexHasValue(){
        if (((ComplexTypeTestDMO) core).getMvComplexSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of MenuElementTypeAndComment objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1999)
    public MenuElementTypeAndCommentIterableDMW getMvComplexIterable(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvComplex);
        if (attr == null)
            return(MenuElementTypeAndCommentIterableDMW.emptyList);
        
        return(new MenuElementTypeAndCommentIterableDMW(((ComplexTypeTestDMO) core).getMvComplex()));
    }

    /**
     * Adds another mvComplex value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2025)
    public void addMvComplex(Object value) throws DmcValueException {
        ((ComplexTypeTestDMO) core).addMvComplex(value);
    }

    /**
     * Adds another mvComplex value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2035)
    public void addMvComplex(MenuElementTypeAndComment value){
        ((ComplexTypeTestDMO) core).addMvComplex(value);
    }

    /**
     * Returns true if the collection contains the mvComplex value.
     * @param value A value compatible with MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2092)
    public boolean mvComplexContains(MenuElementTypeAndComment value){
        return(((ComplexTypeTestDMO) core).mvComplexContains(value));
    }

    /**
     * @return A COPY of the collection of MenuElementTypeAndComment objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2136)
    @SuppressWarnings("unchecked")
    public ArrayList<MenuElementTypeAndComment> getMvComplexCopy(){
        DmcAttribute<?> attr = core.get(DmtDMSAG.__mvComplex);
        if (attr == null)
            return(new ArrayList<MenuElementTypeAndComment>());
        
        ArrayList<MenuElementTypeAndComment> rc = new ArrayList<MenuElementTypeAndComment>(attr.getMVSize());
        
        Iterator<MenuElementTypeAndComment> it = (Iterator<MenuElementTypeAndComment>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a mvComplex value.
     * @param value The MenuElementTypeAndComment to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2163)
    public void delMvComplex(Object value) throws DmcValueException {
        ((ComplexTypeTestDMO) core).delMvComplex(value);
    }

    /**
     * Deletes a mvComplex value.
     * @param value The MenuElementTypeAndComment to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2172)
    public void delMvComplex(MenuElementTypeAndComment value){
        ((ComplexTypeTestDMO) core).delMvComplex(value);
    }

    /**
     * Removes the mvComplex attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2184)
    public void remMvComplex(){
        ((ComplexTypeTestDMO) core).remMvComplex();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1366)
    public MenuElementTypeAndComment getSvComplex(){
        return(((ComplexTypeTestDMO) core).getSvComplex());
    }

    /**
     * Sets svComplex to the specified value.
     * @param value A value compatible with DmcTypeMenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1476)
    public void setSvComplex(Object value) throws DmcValueException {
        ((ComplexTypeTestDMO) core).setSvComplex(value);
    }

    /**
     * Sets svComplex to the specified value.
     * @param value MenuElementTypeAndComment
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1485)
    public void setSvComplex(MenuElementTypeAndComment value){
        ((ComplexTypeTestDMO) core).setSvComplex(value);
    }

    /**
     * Removes the svComplex attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1511)
    public void remSvComplex(){
        ((ComplexTypeTestDMO) core).remSvComplex();
    }


}

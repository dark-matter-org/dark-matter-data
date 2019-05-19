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
import java.util.ArrayList;                                             // Support for MULTI attribute - (BaseDMWGenerator.java:2116)
import java.util.Iterator;                                              // Support copy of MV objects - (BaseDMWGenerator.java:2130)
import org.dmd.dmc.*;                                                   // If any attributes - (BaseDMWGenerator.java:977)
import org.dmd.dmc.definitions.DmcDefinitionIF;                         // The object is a domain specific definition - (BaseDMWGenerator.java:411)
import org.dmd.dmc.types.DefinitionName;                                // Is named by - (BaseDMWGenerator.java:939)
import org.dmd.dmc.types.DotName;                                       // Primitive type - (BaseDMWGenerator.java:1040)
import org.dmd.dms.ClassDefinition;                                     // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:944)
import org.dmd.dms.DSDefinition;                                        // Derived class - (BaseDMWGenerator.java:1138)
import org.dmd.dms.generated.dmo.MetaDMSAG;                             // Attribute description from the meta schema - (BaseDMWGenerator.java:910)
import org.dmd.dms.generated.dmw.StringIterableDMW;                     // For multi-valued String - (BaseDMWGenerator.java:1993)
import org.dmd.templates.server.extended.TdlDefinition;                 // Required for getModificationRecorder() - (BaseDMWGenerator.java:953)
import org.dmd.templates.server.extended.TdlModule;                     // Is reference type - (BaseDMWGenerator.java:997)
import org.dmd.templates.shared.generated.dmo.TdlDefinitionDMO;         // Abstract class - (BaseDMWGenerator.java:1120)
import org.dmd.templates.shared.generated.types.TdlModuleREF;           // Is reference type REF - (BaseDMWGenerator.java:1005)



/**
 * The TdlDefinition provides a common base for all dark-matter\n Template
 * Definition Language (TDL) definitions.
 * <P>
 * Generated from the dmtdl schema at version unknown
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:488)
 */
abstract public class TdlDefinitionDMW extends DSDefinition implements DmcDefinitionIF, DmcNamedObjectIF {

    protected TdlDefinitionDMW() {
        super();
    }

    abstract public TdlDefinition getModificationRecorder();

    public TdlDefinitionDMO getDMO() {
        return((TdlDefinitionDMO) core);
    }

    // Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpWrapper(BaseDMWGenerator.java:661)
    protected TdlDefinitionDMW(TdlDefinitionDMO obj, ClassDefinition cd) {
        super(obj,cd);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.getAccessFunctions(BaseDMWGenerator.java:1187)
    public DefinitionName getObjectName(){
        return(((TdlDefinitionDMO) core).getName());
    }

    public int hashCode(){
        return(getObjectName().hashCode());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        return(((TdlDefinitionDMO) core).getObjectNameAttribute());
    }

    public boolean equals(Object obj){
        if (obj instanceof TdlDefinitionDMW){
            return( getObjectName().equals( ((TdlDefinitionDMW) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return A TdlModule object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1324)
    public TdlModule getDefinedInTdlModule(){
        TdlModuleREF ref = ((TdlDefinitionDMO) core).getDefinedInTdlModule();
        if (ref == null)
            return(null);
        
        if (ref.getObject() == null)
            return(null);
        
        return((TdlModule)ref.getObject().getContainer());
    }

    /**
     * Sets the definedInTdlModule to the specified value.
     * @param value A value compatible with TdlModuleREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1409)
    public void setDefinedInTdlModule(TdlModule value) {
        ((TdlDefinitionDMO) core).setDefinedInTdlModule(value.getDMO());
    }

    /**
     * Sets the definedInTdlModule to the specified value.
     * @param value A value compatible with TdlModuleREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1418)
    public void setDefinedInTdlModule(Object value) throws DmcValueException {
        ((TdlDefinitionDMO) core).setDefinedInTdlModule(value);
    }

    /**
     * Removes the definedInTdlModule attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remDefinedInTdlModule(){
        ((TdlDefinitionDMO) core).remDefinedInTdlModule();
    }

    /**
     * @return The number of String items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1561)
    public int getDescriptionSize(){
        return(((TdlDefinitionDMO) core).getDescriptionSize());
    }

    /**
     * @return true if there are no StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1569)
    public boolean getDescriptionIsEmpty(){
        if (((TdlDefinitionDMO) core).getDescriptionSize() == 0)
            return(true);
        return(false);
    }

    /**
     * @return true if there are any StringDMO items.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1579)
    public boolean getDescriptionHasValue(){
        if (((TdlDefinitionDMO) core).getDescriptionSize() == 0)
            return(false);
        return(true);
    }

    /**
     * @return An Iterator of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:1997)
    public StringIterableDMW getDescriptionIterable(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__description);
        if (attr == null)
            return(StringIterableDMW.emptyList);
        
        return(new StringIterableDMW(((TdlDefinitionDMO) core).getDescription()));
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2023)
    public void addDescription(Object value) throws DmcValueException {
        ((TdlDefinitionDMO) core).addDescription(value);
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2033)
    public void addDescription(String value){
        ((TdlDefinitionDMO) core).addDescription(value);
    }

    /**
     * Returns true if the collection contains the description value.
     * @param value A value compatible with String
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2090)
    public boolean descriptionContains(String value){
        return(((TdlDefinitionDMO) core).descriptionContains(value));
    }

    /**
     * @return A COPY of the collection of String objects.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2134)
    @SuppressWarnings("unchecked")
    public ArrayList<String> getDescriptionCopy(){
        DmcAttribute<?> attr = core.get(MetaDMSAG.__description);
        if (attr == null)
            return(new ArrayList<String>());
        
        ArrayList<String> rc = new ArrayList<String>(attr.getMVSize());
        
        Iterator<String> it = (Iterator<String>) attr.getMV();
        while(it.hasNext()){
            rc.add(it.next());
        }
        
        return(rc);
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2161)
    public void delDescription(Object value) throws DmcValueException {
        ((TdlDefinitionDMO) core).delDescription(value);
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2170)
    public void delDescription(String value){
        ((TdlDefinitionDMO) core).delDescription(value);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatMV(BaseDMWGenerator.java:2182)
    public void remDescription(){
        ((TdlDefinitionDMO) core).remDescription();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public DotName getDotName(){
        return(((TdlDefinitionDMO) core).getDotName());
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setDotName(Object value) throws DmcValueException {
        ((TdlDefinitionDMO) core).setDotName(value);
    }

    /**
     * Sets dotName to the specified value.
     * @param value DotName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setDotName(DotName value){
        ((TdlDefinitionDMO) core).setDotName(value);
    }

    /**
     * Removes the dotName attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remDotName(){
        ((TdlDefinitionDMO) core).remDotName();
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1364)
    public DefinitionName getName(){
        return(((TdlDefinitionDMO) core).getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1474)
    public void setName(Object value) throws DmcValueException {
        ((TdlDefinitionDMO) core).setName(value);
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1483)
    public void setName(DefinitionName value){
        ((TdlDefinitionDMO) core).setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatSV(BaseDMWGenerator.java:1509)
    public void remName(){
        ((TdlDefinitionDMO) core).remName();
    }


}

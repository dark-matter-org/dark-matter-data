//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2020 dark-matter-data committers
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
package org.dmd.dmu.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:408)
import java.io.Serializable;                                             // Always required - (GenUtility.java:227)
import java.util.*;                                                      // Always required if we have any MV attributes - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                                         // Named object - (GenUtility.java:388)
import org.dmd.dmc.DmcNamedObjectIF;                                     // Named object - (GenUtility.java:387)
import org.dmd.dmc.DmcOmni;                                              // Lazy resolution - (GenUtility.java:331)
import org.dmd.dmc.DmcSliceInfo;                                         // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                                    // Any attributes - (GenUtility.java:249)
import org.dmd.dmc.types.DefinitionName;                                 // Naming attribute type - (GenUtility.java:382)
import org.dmd.dms.generated.dmo.MetaDMSAG;                              // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV;              // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                    // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dms.generated.types.DmcTypeSchemaAndReasonMV;             // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeStringMV;                      // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.SchemaAndReason;                      // Primitive type - (GenUtility.java:282)
import org.dmd.dmu.shared.generated.dmo.DmuDefinitionDMO;                // Base class - (GenUtility.java:367)
import org.dmd.dmu.shared.generated.dmo.DmuModuleDMO;                    // Type specific set/add - (GenUtility.java:318)
import org.dmd.dmu.shared.generated.types.DmcTypeDmuModuleREFMV;         // Reference type - (GenUtility.java:311)
import org.dmd.dmu.shared.generated.types.DmuModuleREF;                  // Helper class - (GenUtility.java:346)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * This is the module definition for the dmu domain-specific language.
 * <P>
 * Generated from the dmu schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class DmuModuleDMO  extends DmuDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "DmuModule";


    static {
    }

    public DmuModuleDMO() {
        super("DmuModule");
    }

    protected DmuModuleDMO(String oc) {
        super(oc);
    }

    @Override
    public DmuModuleDMO getNew(){
        DmuModuleDMO rc = new DmuModuleDMO();
        return(rc);
    }

    @Override
    public DmuModuleDMO getSlice(DmcSliceInfo info){
        DmuModuleDMO rc = new DmuModuleDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public DmuModuleDMO(DmcTypeModifierMV mods) {
        super("DmuModule");
        modrec(true);
        setModifier(mods);
    }

    public DmuModuleDMO getModificationRecorder(){
        DmuModuleDMO rc = new DmuModuleDMO();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:752)
    public DefinitionName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        if (name != null)
            return((DefinitionName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:769)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public boolean equals(Object obj){
        if (obj instanceof DmuModuleDMO){
            return( getObjectName().equals( ((DmuModuleDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:784)
    public int hashCode(){
        DefinitionName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    /**
     * @return An Iterator of SchemaAndReason objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1289)
    public Iterator<SchemaAndReason> getLoadSchemaClass(){
        DmcTypeSchemaAndReasonMV attr = (DmcTypeSchemaAndReasonMV) get(MetaDMSAG.__loadSchemaClass);
        if (attr == null)
            return( ((List<SchemaAndReason>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @param i the index
     * @return The nth SchemaAndReason value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1302)
    public SchemaAndReason getNthLoadSchemaClass(int i){
        DmcTypeSchemaAndReasonMV attr = (DmcTypeSchemaAndReasonMV) get(MetaDMSAG.__loadSchemaClass);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another loadSchemaClass to the specified value.
     * @param value SchemaAndReason
     * @return the attribute instance
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> addLoadSchemaClass(SchemaAndReason value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__loadSchemaClass);
        if (attr == null)
            attr = new DmcTypeSchemaAndReasonMV(MetaDMSAG.__loadSchemaClass);
        
        try{
            setLastValue(attr.add(value));
            add(MetaDMSAG.__loadSchemaClass,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * @param value SchemaAndReason
     * @return true if we contain a valued keyed by the specified SchemaAndReason.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1392)
    public boolean loadSchemaClassContains(SchemaAndReason value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__loadSchemaClass);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another loadSchemaClass value.
     * @param value A value compatible with SchemaAndReason
     * @return the attribute instance
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1426)
    public DmcAttribute<?> addLoadSchemaClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__loadSchemaClass);
        if (attr == null)
            attr = new DmcTypeSchemaAndReasonMV(MetaDMSAG.__loadSchemaClass);
        
        setLastValue(attr.add(value));
        add(MetaDMSAG.__loadSchemaClass,attr);
        return(attr);
    }

    /**
     * @return the number of values in loadSchemaClass
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1443)
    public int getLoadSchemaClassSize(){
        DmcAttribute<?> attr = get(MetaDMSAG.__loadSchemaClass);
        if (attr == null){
            if (MetaDMSAG.__loadSchemaClass.indexSize == 0)
                return(0);
            else
                return(MetaDMSAG.__loadSchemaClass.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a loadSchemaClass value.
     * @param value The SchemaAndReason to be deleted from set of attribute values.
     * @return the deleted attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1505)
    public DmcAttribute<?> delLoadSchemaClass(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__loadSchemaClass);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeSchemaAndReasonMV(MetaDMSAG.__loadSchemaClass), value);
        else
            attr = del(MetaDMSAG.__loadSchemaClass, value);
        
        return(attr);
    }

    /**
     * Deletes a loadSchemaClass from the specified value.
     * @param value SchemaAndReason
     * @return the deleted attribute instance     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1522)
    public DmcAttribute<?> delLoadSchemaClass(SchemaAndReason value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__loadSchemaClass);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeSchemaAndReasonMV(MetaDMSAG.__loadSchemaClass), value);
        else
            attr = del(MetaDMSAG.__loadSchemaClass, value);
        
        return(attr);
    }

    /**
     * Removes the loadSchemaClass attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1541)
    public void remLoadSchemaClass(){
         rem(MetaDMSAG.__loadSchemaClass);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1289)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @param i the index
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1302)
    public String getNthDescription(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another description to the specified value.
     * @param value String
     * @return the attribute instance
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> addDescription(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__description);
        
        try{
            setLastValue(attr.add(value));
            add(MetaDMSAG.__description,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * @param value String
     * @return true if we contain a valued keyed by the specified String.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1392)
    public boolean descriptionContains(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     * @return the attribute instance
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1426)
    public DmcAttribute<?> addDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__description);
        
        setLastValue(attr.add(value));
        add(MetaDMSAG.__description,attr);
        return(attr);
    }

    /**
     * @return the number of values in description
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1443)
    public int getDescriptionSize(){
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null){
            if (MetaDMSAG.__description.indexSize == 0)
                return(0);
            else
                return(MetaDMSAG.__description.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a description value.
     * @param value The String to be deleted from set of attribute values.
     * @return the deleted attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1505)
    public DmcAttribute<?> delDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(MetaDMSAG.__description), value);
        else
            attr = del(MetaDMSAG.__description, value);
        
        return(attr);
    }

    /**
     * Deletes a description from the specified value.
     * @param value String
     * @return the deleted attribute instance     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1522)
    public DmcAttribute<?> delDescription(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(MetaDMSAG.__description), value);
        else
            attr = del(MetaDMSAG.__description, value);
        
        return(attr);
    }

    /**
     * Removes the description attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1541)
    public void remDescription(){
         rem(MetaDMSAG.__description);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1289)
    public Iterator<String> getDefFiles(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__defFiles);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @param i the index
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1302)
    public String getNthDefFiles(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__defFiles);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another defFiles to the specified value.
     * @param value String
     * @return the attribute instance
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1317)
    public DmcAttribute<?> addDefFiles(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__defFiles);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__defFiles);
        
        try{
            setLastValue(attr.add(value));
            add(MetaDMSAG.__defFiles,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * @param value String
     * @return true if we contain a valued keyed by the specified String.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1392)
    public boolean defFilesContains(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__defFiles);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with String
     * @return the attribute instance
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1426)
    public DmcAttribute<?> addDefFiles(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__defFiles);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__defFiles);
        
        setLastValue(attr.add(value));
        add(MetaDMSAG.__defFiles,attr);
        return(attr);
    }

    /**
     * @return the number of values in defFiles
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1443)
    public int getDefFilesSize(){
        DmcAttribute<?> attr = get(MetaDMSAG.__defFiles);
        if (attr == null){
            if (MetaDMSAG.__defFiles.indexSize == 0)
                return(0);
            else
                return(MetaDMSAG.__defFiles.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a defFiles value.
     * @param value The String to be deleted from set of attribute values.
     * @return the deleted attribute instance
     * @throws DmcValueException if the value is incorrect
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1505)
    public DmcAttribute<?> delDefFiles(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__defFiles);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(MetaDMSAG.__defFiles), value);
        else
            attr = del(MetaDMSAG.__defFiles, value);
        
        return(attr);
    }

    /**
     * Deletes a defFiles from the specified value.
     * @param value String
     * @return the deleted attribute instance     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1522)
    public DmcAttribute<?> delDefFiles(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__defFiles);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeStringMV(MetaDMSAG.__defFiles), value);
        else
            attr = del(MetaDMSAG.__defFiles, value);
        
        return(attr);
    }

    /**
     * Removes the defFiles attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1541)
    public void remDefFiles(){
         rem(MetaDMSAG.__defFiles);
    }

    /**
     * @return An Iterator of DmuModuleDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1146)
    public Iterator<DmuModuleREF> getDependsOnDmuModule(){
        DmcTypeDmuModuleREFMV attr = (DmcTypeDmuModuleREFMV) get(DmuDMSAG.__dependsOnDmuModule);
        if (attr == null)
            return( ((List<DmuModuleREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<DmuModuleREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of DmuModuleREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1166)
    public Iterator<DmuModuleREF> getDependsOnDmuModuleREFs(){
        DmcTypeDmuModuleREFMV attr = (DmcTypeDmuModuleREFMV) get(DmuDMSAG.__dependsOnDmuModule);
        if (attr == null)
            return( ((List<DmuModuleREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another dependsOnDmuModule to the specified value.
     * @param value DmuModule
     * @return the attribute instance
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1181)
    public DmcAttribute<?> addDependsOnDmuModule(DmuModuleDMO value) {
        DmcAttribute<?> attr = get(DmuDMSAG.__dependsOnDmuModule);
        if (attr == null)
            attr = new DmcTypeDmuModuleREFMV(DmuDMSAG.__dependsOnDmuModule);
        
        try{
            setLastValue(attr.add(value));
            add(DmuDMSAG.__dependsOnDmuModule,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another dependsOnDmuModule value.
     * @param value A value compatible with DmuModule
     * @return the attribute instance
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1426)
    public DmcAttribute<?> addDependsOnDmuModule(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmuDMSAG.__dependsOnDmuModule);
        if (attr == null)
            attr = new DmcTypeDmuModuleREFMV(DmuDMSAG.__dependsOnDmuModule);
        
        setLastValue(attr.add(value));
        add(DmuDMSAG.__dependsOnDmuModule,attr);
        return(attr);
    }

    /**
     * @return the number of values in dependsOnDmuModule
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1443)
    public int getDependsOnDmuModuleSize(){
        DmcAttribute<?> attr = get(DmuDMSAG.__dependsOnDmuModule);
        if (attr == null){
            if (DmuDMSAG.__dependsOnDmuModule.indexSize == 0)
                return(0);
            else
                return(DmuDMSAG.__dependsOnDmuModule.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a dependsOnDmuModule value.
     * @param value The DmuModule to be deleted from set of attribute values.
     * @return the deleted attribute instance     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1484)
    public DmcAttribute<?> delDependsOnDmuModule(Object value){
        DmcAttribute<?> attr = get(DmuDMSAG.__dependsOnDmuModule);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeDmuModuleREFMV(DmuDMSAG.__dependsOnDmuModule), value);
        else
            attr = del(DmuDMSAG.__dependsOnDmuModule, value);
        
        return(attr);
    }

    /**
     * Removes the dependsOnDmuModule attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1541)
    public void remDependsOnDmuModule(){
         rem(DmuDMSAG.__dependsOnDmuModule);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
    public DefinitionName getName(){
        DmcTypeDefinitionNameSV attr = (DmcTypeDefinitionNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value DefinitionName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
    public void setName(DefinitionName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__name,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeDefinitionNameSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setName(Object value) throws DmcValueException {
        DmcTypeDefinitionNameSV attr  = (DmcTypeDefinitionNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeDefinitionNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remName(){
         rem(MetaDMSAG.__name);
    }




}

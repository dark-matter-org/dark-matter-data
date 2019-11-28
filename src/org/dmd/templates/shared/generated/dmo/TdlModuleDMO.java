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
package org.dmd.templates.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:408)
import java.io.Serializable;                                                   // Always required - (GenUtility.java:227)
import java.util.*;                                                            // Always required if we have any MV attributes - (GenUtility.java:224)
import org.dmd.dmc.DmcAttribute;                                               // Named object - (GenUtility.java:388)
import org.dmd.dmc.DmcNamedObjectIF;                                           // Named object - (GenUtility.java:387)
import org.dmd.dmc.DmcOmni;                                                    // Lazy resolution - (GenUtility.java:331)
import org.dmd.dmc.DmcSliceInfo;                                               // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                                          // Any attributes - (GenUtility.java:249)
import org.dmd.dmc.types.DefinitionName;                                       // Naming attribute type - (GenUtility.java:382)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                    // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV;                    // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeIntegerSV;                           // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                          // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dms.generated.types.DmcTypeStringMV;                            // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeStringSV;                            // Required type - (GenUtility.java:339)
import org.dmd.templates.shared.generated.dmo.TdlDefinitionDMO;                // Base class - (GenUtility.java:367)
import org.dmd.templates.shared.generated.dmo.TdlModuleDMO;                    // Type specific set/add - (GenUtility.java:318)
import org.dmd.templates.shared.generated.types.DmcTypeTdlModuleREFMV;         // Reference type - (GenUtility.java:311)
import org.dmd.templates.shared.generated.types.TdlModuleREF;                  // Helper class - (GenUtility.java:346)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * A TdlModule is used to define a set of Sections that\n define the overall
 * structure of a textual artifact. When run through the dmtdlgen\n utility,
 * a set of classes are generated to represent these different artifact
 * sections.\n <p>\n By convention, you should place the .dmtdl files along
 * with your other dark-matter \n config files e.g. in the dmconfig folder
 * with your dark-matter schema or with \n your .dmg wrapper generation
 * files. However, there is no restriction on where you\n place your .dmtdl
 * files, but it's recommended that they exist in a separate subfolder.\n
 * <p>\n When the dmtdlgen utility is run, a folder (named generated) will be
 * created at\n the same level as the dmconfig folder (or whatever you called
 * it). This will contain\n a dmtdl subpackage that will contain the
 * generated code that represents the \n various Sections that you've defined.
 * <P>
 * Generated from the dmtdl schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class TdlModuleDMO  extends TdlDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "TdlModule";


    static {
    }

    public TdlModuleDMO() {
        super("TdlModule");
    }

    protected TdlModuleDMO(String oc) {
        super(oc);
    }

    @Override
    public TdlModuleDMO getNew(){
        TdlModuleDMO rc = new TdlModuleDMO();
        return(rc);
    }

    @Override
    public TdlModuleDMO getSlice(DmcSliceInfo info){
        TdlModuleDMO rc = new TdlModuleDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public TdlModuleDMO(DmcTypeModifierMV mods) {
        super("TdlModule");
        modrec(true);
        setModifier(mods);
    }

    public TdlModuleDMO getModificationRecorder(){
        TdlModuleDMO rc = new TdlModuleDMO();
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
        if (obj instanceof TdlModuleDMO){
            return( getObjectName().equals( ((TdlModuleDMO) obj).getObjectName()) );
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

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
    public String getTemplateFileSuffix(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmtdlDMSAG.__templateFileSuffix);
        if (attr == null)
            return("dmt");

        return(attr.getSV());
    }

    /**
     * Sets templateFileSuffix to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
    public void setTemplateFileSuffix(String value) {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__templateFileSuffix);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtdlDMSAG.__templateFileSuffix);
        
        try{
            attr.set(value);
            set(DmtdlDMSAG.__templateFileSuffix,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets templateFileSuffix to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setTemplateFileSuffix(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmtdlDMSAG.__templateFileSuffix);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtdlDMSAG.__templateFileSuffix);
        
        attr.set(value);
        set(DmtdlDMSAG.__templateFileSuffix,attr);
    }

    /**
     * Removes the templateFileSuffix attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remTemplateFileSuffix(){
         rem(DmtdlDMSAG.__templateFileSuffix);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
    public Integer getMaxFastAddValues(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(DmtdlDMSAG.__maxFastAddValues);
        if (attr == null)
            return(8);

        return(attr.getSV());
    }

    /**
     * Sets maxFastAddValues to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
    public void setMaxFastAddValues(Integer value) {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__maxFastAddValues);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmtdlDMSAG.__maxFastAddValues);
        
        try{
            attr.set(value);
            set(DmtdlDMSAG.__maxFastAddValues,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets maxFastAddValues to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setMaxFastAddValues(Object value) throws DmcValueException {
        DmcTypeIntegerSV attr  = (DmcTypeIntegerSV) get(DmtdlDMSAG.__maxFastAddValues);
        if (attr == null)
            attr = new DmcTypeIntegerSV(DmtdlDMSAG.__maxFastAddValues);
        
        attr.set(value);
        set(DmtdlDMSAG.__maxFastAddValues,attr);
    }

    /**
     * Removes the maxFastAddValues attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remMaxFastAddValues(){
         rem(DmtdlDMSAG.__maxFastAddValues);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
    public String getInsertMarker(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmtdlDMSAG.__insertMarker);
        if (attr == null)
            return("::");

        return(attr.getSV());
    }

    /**
     * Sets insertMarker to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
    public void setInsertMarker(String value) {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__insertMarker);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtdlDMSAG.__insertMarker);
        
        try{
            attr.set(value);
            set(DmtdlDMSAG.__insertMarker,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets insertMarker to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setInsertMarker(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmtdlDMSAG.__insertMarker);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtdlDMSAG.__insertMarker);
        
        attr.set(value);
        set(DmtdlDMSAG.__insertMarker,attr);
    }

    /**
     * Removes the insertMarker attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remInsertMarker(){
         rem(DmtdlDMSAG.__insertMarker);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
    public String getCommentFormat(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmtdlDMSAG.__commentFormat);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets commentFormat to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
    public void setCommentFormat(String value) {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__commentFormat);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtdlDMSAG.__commentFormat);
        
        try{
            attr.set(value);
            set(DmtdlDMSAG.__commentFormat,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets commentFormat to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setCommentFormat(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmtdlDMSAG.__commentFormat);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtdlDMSAG.__commentFormat);
        
        attr.set(value);
        set(DmtdlDMSAG.__commentFormat,attr);
    }

    /**
     * Removes the commentFormat attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remCommentFormat(){
         rem(DmtdlDMSAG.__commentFormat);
    }

    /**
     * @return An Iterator of TdlModuleDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1146)
    public Iterator<TdlModuleREF> getDependsOnTdlModule(){
        DmcTypeTdlModuleREFMV attr = (DmcTypeTdlModuleREFMV) get(DmtdlDMSAG.__dependsOnTdlModule);
        if (attr == null)
            return( ((List<TdlModuleREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<TdlModuleREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of TdlModuleREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1166)
    public Iterator<TdlModuleREF> getDependsOnTdlModuleREFs(){
        DmcTypeTdlModuleREFMV attr = (DmcTypeTdlModuleREFMV) get(DmtdlDMSAG.__dependsOnTdlModule);
        if (attr == null)
            return( ((List<TdlModuleREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another dependsOnTdlModule to the specified value.
     * @param value TdlModule
     * @return the attribute instance
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1181)
    public DmcAttribute<?> addDependsOnTdlModule(TdlModuleDMO value) {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__dependsOnTdlModule);
        if (attr == null)
            attr = new DmcTypeTdlModuleREFMV(DmtdlDMSAG.__dependsOnTdlModule);
        
        try{
            setLastValue(attr.add(value));
            add(DmtdlDMSAG.__dependsOnTdlModule,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another dependsOnTdlModule value.
     * @param value A value compatible with TdlModule
     * @return the attribute instance
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1426)
    public DmcAttribute<?> addDependsOnTdlModule(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__dependsOnTdlModule);
        if (attr == null)
            attr = new DmcTypeTdlModuleREFMV(DmtdlDMSAG.__dependsOnTdlModule);
        
        setLastValue(attr.add(value));
        add(DmtdlDMSAG.__dependsOnTdlModule,attr);
        return(attr);
    }

    /**
     * @return the number of values in dependsOnTdlModule
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1443)
    public int getDependsOnTdlModuleSize(){
        DmcAttribute<?> attr = get(DmtdlDMSAG.__dependsOnTdlModule);
        if (attr == null){
            if (DmtdlDMSAG.__dependsOnTdlModule.indexSize == 0)
                return(0);
            else
                return(DmtdlDMSAG.__dependsOnTdlModule.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a dependsOnTdlModule value.
     * @param value The TdlModule to be deleted from set of attribute values.
     * @return the deleted attribute instance     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1484)
    public DmcAttribute<?> delDependsOnTdlModule(Object value){
        DmcAttribute<?> attr = get(DmtdlDMSAG.__dependsOnTdlModule);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeTdlModuleREFMV(DmtdlDMSAG.__dependsOnTdlModule), value);
        else
            attr = del(DmtdlDMSAG.__dependsOnTdlModule, value);
        
        return(attr);
    }

    /**
     * Removes the dependsOnTdlModule attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1541)
    public void remDependsOnTdlModule(){
         rem(DmtdlDMSAG.__dependsOnTdlModule);
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

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
    public String getPackage(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmtdlDMSAG.__package);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets package to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
    public void setPackage(String value) {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__package);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtdlDMSAG.__package);
        
        try{
            attr.set(value);
            set(DmtdlDMSAG.__package,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets package to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setPackage(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmtdlDMSAG.__package);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtdlDMSAG.__package);
        
        attr.set(value);
        set(DmtdlDMSAG.__package,attr);
    }

    /**
     * Removes the package attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remPackage(){
         rem(DmtdlDMSAG.__package);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
    public String getTemplateFile(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmtdlDMSAG.__templateFile);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets templateFile to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
    public void setTemplateFile(String value) {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__templateFile);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtdlDMSAG.__templateFile);
        
        try{
            attr.set(value);
            set(DmtdlDMSAG.__templateFile,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets templateFile to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setTemplateFile(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmtdlDMSAG.__templateFile);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtdlDMSAG.__templateFile);
        
        attr.set(value);
        set(DmtdlDMSAG.__templateFile,attr);
    }

    /**
     * Removes the templateFile attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remTemplateFile(){
         rem(DmtdlDMSAG.__templateFile);
    }




}

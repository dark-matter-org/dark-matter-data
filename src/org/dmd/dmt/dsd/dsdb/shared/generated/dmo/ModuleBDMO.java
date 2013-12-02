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
package org.dmd.dmt.dsd.dsdb.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:396)
import java.io.Serializable;                                                    // Always required - (GenUtility.java:224)
import java.util.*;                                                             // Always required if we have any MV attributes - (GenUtility.java:221)
import org.dmd.dmc.DmcAttribute;                                                // Named object - (GenUtility.java:376)
import org.dmd.dmc.DmcNamedObjectIF;                                            // Named object - (GenUtility.java:375)
import org.dmd.dmc.DmcOmni;                                                     // Lazy resolution - (GenUtility.java:320)
import org.dmd.dmc.DmcSliceInfo;                                                // Required for object slicing - (GenUtility.java:229)
import org.dmd.dmc.DmcValueException;                                           // Any attributes - (GenUtility.java:241)
import org.dmd.dmc.types.DefinitionName;                                        // Naming attribute type - (GenUtility.java:370)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                     // Required for MODREC constructor - (GenUtility.java:228)
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV;                     // Required type - (GenUtility.java:328)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                           // Required for MODREC constructor - (GenUtility.java:227)
import org.dmd.dms.generated.types.DmcTypeStringMV;                             // Required type - (GenUtility.java:328)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.DsdADMSAG;                     // Attribute from dsdA schema - (GenUtility.java:135)
import org.dmd.dmt.dsd.dsda.shared.generated.dmo.ModuleADMO;                    // Type specific set/add - (GenUtility.java:307)
import org.dmd.dmt.dsd.dsda.shared.generated.types.DmcTypeModuleAREFMV;         // Reference type - (GenUtility.java:300)
import org.dmd.dmt.dsd.dsda.shared.generated.types.ModuleAREF;                  // Helper class - (GenUtility.java:335)
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.BConceptBaseDMO;               // Base class - (GenUtility.java:355)
import org.dmd.dmt.dsd.dsdb.shared.generated.dmo.ModuleBDMO;                    // Type specific set/add - (GenUtility.java:307)
import org.dmd.dmt.dsd.dsdb.shared.generated.types.DmcTypeModuleBREFMV;         // Reference type - (GenUtility.java:300)
import org.dmd.dmt.dsd.dsdb.shared.generated.types.ModuleBREF;                  // Helper class - (GenUtility.java:335)

/**
 * <P>
 * Generated from the dsdB schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class ModuleBDMO  extends BConceptBaseDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "ModuleB";


    static {
    }

    public ModuleBDMO() {
        super("ModuleB");
    }

    protected ModuleBDMO(String oc) {
        super(oc);
    }

    @Override
    public ModuleBDMO getNew(){
        ModuleBDMO rc = new ModuleBDMO();
        return(rc);
    }

    @Override
    public ModuleBDMO getSlice(DmcSliceInfo info){
        ModuleBDMO rc = new ModuleBDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ModuleBDMO(DmcTypeModifierMV mods) {
        super("ModuleB");
        modrec(true);
        setModifier(mods);
    }

    public ModuleBDMO getModificationRecorder(){
        ModuleBDMO rc = new ModuleBDMO();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:750)
    public DefinitionName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        if (name != null)
            return((DefinitionName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:767)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:774)
    public boolean equals(Object obj){
        if (obj instanceof ModuleBDMO){
            return( getObjectName().equals( ((ModuleBDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:782)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1112)
    public Iterator<String> getDescription(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1124)
    public String getNthDescription(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__description);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another description to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1138)
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
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1213)
    public boolean descriptionContains(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another description value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1245)
    public DmcAttribute<?> addDescription(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__description);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__description);
        
        setLastValue(attr.add(value));
        add(MetaDMSAG.__description,attr);
        return(attr);
    }

    /**
     * Returns the number of values in description
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1262)
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
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1320)
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
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1336)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1355)
    public void remDescription(){
         rem(MetaDMSAG.__description);
    }

    /**
     * @return An Iterator of String objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1112)
    public Iterator<String> getDefFiles(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__defFiles);
        if (attr == null)
            return( ((List<String>) Collections.EMPTY_LIST).iterator());

        return(attr.getMV());
    }

    /**
     * @return The nth String value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1124)
    public String getNthDefFiles(int i){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__defFiles);
        if (attr == null)
            return(null);

        return(attr.getMVnth(i));
    }

    /**
     * Adds another defFiles to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1138)
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
     * Returns true if we contain a valued keyed by the specified String.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1213)
    public boolean defFilesContains(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__defFiles);
        if (attr == null)
            return(false);
        return(attr.contains(value));
    }

    /**
     * Adds another defFiles value.
     * @param value A value compatible with String
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1245)
    public DmcAttribute<?> addDefFiles(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__defFiles);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__defFiles);
        
        setLastValue(attr.add(value));
        add(MetaDMSAG.__defFiles,attr);
        return(attr);
    }

    /**
     * Returns the number of values in defFiles
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1262)
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
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1320)
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
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1336)
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
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1355)
    public void remDefFiles(){
         rem(MetaDMSAG.__defFiles);
    }

    /**
     * @return An Iterator of ModuleBDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:970)
    public Iterator<ModuleBREF> getDependsOnModuleB(){
        DmcTypeModuleBREFMV attr = (DmcTypeModuleBREFMV) get(DsdBDMSAG.__dependsOnModuleB);
        if (attr == null)
            return( ((List<ModuleBREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<ModuleBREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of ModuleBREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:990)
    public Iterator<ModuleBREF> getDependsOnModuleBREFs(){
        DmcTypeModuleBREFMV attr = (DmcTypeModuleBREFMV) get(DsdBDMSAG.__dependsOnModuleB);
        if (attr == null)
            return( ((List<ModuleBREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another dependsOnModuleB to the specified value.
     * @param value ModuleB
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1004)
    public DmcAttribute<?> addDependsOnModuleB(ModuleBDMO value) {
        DmcAttribute<?> attr = get(DsdBDMSAG.__dependsOnModuleB);
        if (attr == null)
            attr = new DmcTypeModuleBREFMV(DsdBDMSAG.__dependsOnModuleB);
        
        try{
            setLastValue(attr.add(value));
            add(DsdBDMSAG.__dependsOnModuleB,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another dependsOnModuleB value.
     * @param value A value compatible with ModuleB
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1245)
    public DmcAttribute<?> addDependsOnModuleB(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DsdBDMSAG.__dependsOnModuleB);
        if (attr == null)
            attr = new DmcTypeModuleBREFMV(DsdBDMSAG.__dependsOnModuleB);
        
        setLastValue(attr.add(value));
        add(DsdBDMSAG.__dependsOnModuleB,attr);
        return(attr);
    }

    /**
     * Returns the number of values in dependsOnModuleB
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1262)
    public int getDependsOnModuleBSize(){
        DmcAttribute<?> attr = get(DsdBDMSAG.__dependsOnModuleB);
        if (attr == null){
            if (DsdBDMSAG.__dependsOnModuleB.indexSize == 0)
                return(0);
            else
                return(DsdBDMSAG.__dependsOnModuleB.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a dependsOnModuleB value.
     * @param value The ModuleB to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1301)
    public DmcAttribute<?> delDependsOnModuleB(Object value){
        DmcAttribute<?> attr = get(DsdBDMSAG.__dependsOnModuleB);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeModuleBREFMV(DsdBDMSAG.__dependsOnModuleB), value);
        else
            attr = del(DsdBDMSAG.__dependsOnModuleB, value);
        
        return(attr);
    }

    /**
     * Removes the dependsOnModuleB attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1355)
    public void remDependsOnModuleB(){
         rem(DsdBDMSAG.__dependsOnModuleB);
    }

    /**
     * @return An Iterator of ModuleADMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:970)
    public Iterator<ModuleAREF> getDependsOnModuleA(){
        DmcTypeModuleAREFMV attr = (DmcTypeModuleAREFMV) get(DsdADMSAG.__dependsOnModuleA);
        if (attr == null)
            return( ((List<ModuleAREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<ModuleAREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of ModuleAREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:990)
    public Iterator<ModuleAREF> getDependsOnModuleAREFs(){
        DmcTypeModuleAREFMV attr = (DmcTypeModuleAREFMV) get(DsdADMSAG.__dependsOnModuleA);
        if (attr == null)
            return( ((List<ModuleAREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another dependsOnModuleA to the specified value.
     * @param value ModuleA
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1004)
    public DmcAttribute<?> addDependsOnModuleA(ModuleADMO value) {
        DmcAttribute<?> attr = get(DsdADMSAG.__dependsOnModuleA);
        if (attr == null)
            attr = new DmcTypeModuleAREFMV(DsdADMSAG.__dependsOnModuleA);
        
        try{
            setLastValue(attr.add(value));
            add(DsdADMSAG.__dependsOnModuleA,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another dependsOnModuleA value.
     * @param value A value compatible with ModuleA
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1245)
    public DmcAttribute<?> addDependsOnModuleA(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DsdADMSAG.__dependsOnModuleA);
        if (attr == null)
            attr = new DmcTypeModuleAREFMV(DsdADMSAG.__dependsOnModuleA);
        
        setLastValue(attr.add(value));
        add(DsdADMSAG.__dependsOnModuleA,attr);
        return(attr);
    }

    /**
     * Returns the number of values in dependsOnModuleA
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1262)
    public int getDependsOnModuleASize(){
        DmcAttribute<?> attr = get(DsdADMSAG.__dependsOnModuleA);
        if (attr == null){
            if (DsdADMSAG.__dependsOnModuleA.indexSize == 0)
                return(0);
            else
                return(DsdADMSAG.__dependsOnModuleA.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a dependsOnModuleA value.
     * @param value The ModuleA to be deleted from set of attribute values.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1301)
    public DmcAttribute<?> delDependsOnModuleA(Object value){
        DmcAttribute<?> attr = get(DsdADMSAG.__dependsOnModuleA);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeModuleAREFMV(DsdADMSAG.__dependsOnModuleA), value);
        else
            attr = del(DsdADMSAG.__dependsOnModuleA, value);
        
        return(attr);
    }

    /**
     * Removes the dependsOnModuleA attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1355)
    public void remDependsOnModuleA(){
         rem(DsdADMSAG.__dependsOnModuleA);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:784)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:824)
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
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:877)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:897)
    public void remName(){
         rem(MetaDMSAG.__name);
    }




}

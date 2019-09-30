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
package org.dmd.concinnity.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:408)
import java.io.Serializable;                                                    // Always required - (GenUtility.java:227)
import java.util.*;                                                             // Always required if we have any MV attributes - (GenUtility.java:224)
import org.dmd.concinnity.shared.generated.dmo.ConceptDMO;                      // Type specific set/add - (GenUtility.java:318)
import org.dmd.concinnity.shared.generated.dmo.ConcinnityDefinitionDMO;         // Base class - (GenUtility.java:367)
import org.dmd.concinnity.shared.generated.types.ConceptREF;                    // Helper class - (GenUtility.java:346)
import org.dmd.concinnity.shared.generated.types.DmcTypeConceptREFMV;           // Reference type - (GenUtility.java:311)
import org.dmd.concinnity.shared.generated.types.DmcTypeConceptREFSV;           // Reference type - (GenUtility.java:311)
import org.dmd.dmc.DmcAttribute;                                                // Named object - (GenUtility.java:388)
import org.dmd.dmc.DmcNamedObjectIF;                                            // Named object - (GenUtility.java:387)
import org.dmd.dmc.DmcOmni;                                                     // Lazy resolution - (GenUtility.java:331)
import org.dmd.dmc.DmcSliceInfo;                                                // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                                           // Any attributes - (GenUtility.java:249)
import org.dmd.dmc.types.DefinitionName;                                        // Naming attribute type - (GenUtility.java:382)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                     // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV;                     // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                           // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dms.generated.types.DmcTypeStringSV;                             // Required type - (GenUtility.java:339)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * The Concept class provides a flexible mechanism for defining concepts that
 * can be\n linked in arbitrary or structured ways to other concepts.
 * Concepts allow other, disparate information\n from other dark-matter
 * Domain Specific Languages (DSLs) to be linked together at a conceptual
 * level.\n <p>\n How you use this mechanism is bounded only by your
 * imagination.
 * <P>
 * Generated from the dmconcinnity schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class ConceptDMO  extends ConcinnityDefinitionDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "Concept";


    static {
    }

    public ConceptDMO() {
        super("Concept");
    }

    protected ConceptDMO(String oc) {
        super(oc);
    }

    @Override
    public ConceptDMO getNew(){
        ConceptDMO rc = new ConceptDMO();
        return(rc);
    }

    @Override
    public ConceptDMO getSlice(DmcSliceInfo info){
        ConceptDMO rc = new ConceptDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ConceptDMO(DmcTypeModifierMV mods) {
        super("Concept");
        modrec(true);
        setModifier(mods);
    }

    public ConceptDMO getModificationRecorder(){
        ConceptDMO rc = new ConceptDMO();
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
        if (obj instanceof ConceptDMO){
            return( getObjectName().equals( ((ConceptDMO) obj).getObjectName()) );
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

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:678)
    /**
     * @return the ConceptREF
     */
    public ConceptREF getIs(){
        DmcTypeConceptREFSV attr = (DmcTypeConceptREFSV) get(DmconcinnityDMSAG.__is);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getSV());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:700)
    /**
     * @return the reference to Concept without attempting lazy resolution (if turned on).
     */
    public ConceptREF getIsREF(){
        DmcTypeConceptREFSV attr = (DmcTypeConceptREFSV) get(DmconcinnityDMSAG.__is);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:718)
    /**
     * Sets is to the specified value.
     * @param value ConceptDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:723)
    public void setIs(ConceptDMO value) {
        DmcAttribute<?> attr = get(DmconcinnityDMSAG.__is);
        if (attr == null)
            attr = new DmcTypeConceptREFSV(DmconcinnityDMSAG.__is);
        else
            ((DmcTypeConceptREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(DmconcinnityDMSAG.__is,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets is to the specified value.
     * @param value A value compatible with DmcTypeConceptREFSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setIs(Object value) throws DmcValueException {
        DmcTypeConceptREFSV attr  = (DmcTypeConceptREFSV) get(DmconcinnityDMSAG.__is);
        if (attr == null)
            attr = new DmcTypeConceptREFSV(DmconcinnityDMSAG.__is);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DmconcinnityDMSAG.__is,attr);
    }

    /**
     * Removes the is attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remIs(){
         rem(DmconcinnityDMSAG.__is);
    }

    /**
     * @return An Iterator of ConceptDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1146)
    public Iterator<ConceptREF> getIsLike(){
        DmcTypeConceptREFMV attr = (DmcTypeConceptREFMV) get(DmconcinnityDMSAG.__isLike);
        if (attr == null)
            return( ((List<ConceptREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<ConceptREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of ConceptREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1166)
    public Iterator<ConceptREF> getIsLikeREFs(){
        DmcTypeConceptREFMV attr = (DmcTypeConceptREFMV) get(DmconcinnityDMSAG.__isLike);
        if (attr == null)
            return( ((List<ConceptREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another isLike to the specified value.
     * @param value Concept
     * @return the attribute instance
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1181)
    public DmcAttribute<?> addIsLike(ConceptDMO value) {
        DmcAttribute<?> attr = get(DmconcinnityDMSAG.__isLike);
        if (attr == null)
            attr = new DmcTypeConceptREFMV(DmconcinnityDMSAG.__isLike);
        
        try{
            setLastValue(attr.add(value));
            add(DmconcinnityDMSAG.__isLike,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another isLike value.
     * @param value A value compatible with Concept
     * @return the attribute instance
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1424)
    public DmcAttribute<?> addIsLike(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmconcinnityDMSAG.__isLike);
        if (attr == null)
            attr = new DmcTypeConceptREFMV(DmconcinnityDMSAG.__isLike);
        
        setLastValue(attr.add(value));
        add(DmconcinnityDMSAG.__isLike,attr);
        return(attr);
    }

    /**
     * @return the number of values in isLike
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1441)
    public int getIsLikeSize(){
        DmcAttribute<?> attr = get(DmconcinnityDMSAG.__isLike);
        if (attr == null){
            if (DmconcinnityDMSAG.__isLike.indexSize == 0)
                return(0);
            else
                return(DmconcinnityDMSAG.__isLike.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a isLike value.
     * @param value The Concept to be deleted from set of attribute values.
     * @return the deleted attribute instance     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1482)
    public DmcAttribute<?> delIsLike(Object value){
        DmcAttribute<?> attr = get(DmconcinnityDMSAG.__isLike);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeConceptREFMV(DmconcinnityDMSAG.__isLike), value);
        else
            attr = del(DmconcinnityDMSAG.__isLike, value);
        
        return(attr);
    }

    /**
     * Removes the isLike attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1538)
    public void remIsLike(){
         rem(DmconcinnityDMSAG.__isLike);
    }

    /**
     * @return An Iterator of ConceptDMO objects.
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1146)
    public Iterator<ConceptREF> getIsRelatedTo(){
        DmcTypeConceptREFMV attr = (DmcTypeConceptREFMV) get(DmconcinnityDMSAG.__isRelatedTo);
        if (attr == null)
            return( ((List<ConceptREF>) Collections.EMPTY_LIST).iterator() );

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return( ((List<ConceptREF>) Collections.EMPTY_LIST).iterator() );
            }
        }

        return(attr.getMV());
    }

    /**
     * @return An Iterator of ConceptREFs without attempting lazy resolution (if it's turned on).
     */
    @SuppressWarnings("unchecked")
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1166)
    public Iterator<ConceptREF> getIsRelatedToREFs(){
        DmcTypeConceptREFMV attr = (DmcTypeConceptREFMV) get(DmconcinnityDMSAG.__isRelatedTo);
        if (attr == null)
            return( ((List<ConceptREF>) Collections.EMPTY_LIST).iterator() );

        return(attr.getMV());
    }

    /**
     * Adds another isRelatedTo to the specified value.
     * @param value Concept
     * @return the attribute instance
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1181)
    public DmcAttribute<?> addIsRelatedTo(ConceptDMO value) {
        DmcAttribute<?> attr = get(DmconcinnityDMSAG.__isRelatedTo);
        if (attr == null)
            attr = new DmcTypeConceptREFMV(DmconcinnityDMSAG.__isRelatedTo);
        
        try{
            setLastValue(attr.add(value));
            add(DmconcinnityDMSAG.__isRelatedTo,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific add() method shouldn't throw exceptions!",ex));
        }
        return(attr);
    }

    /**
     * Adds another isRelatedTo value.
     * @param value A value compatible with Concept
     * @return the attribute instance
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1424)
    public DmcAttribute<?> addIsRelatedTo(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmconcinnityDMSAG.__isRelatedTo);
        if (attr == null)
            attr = new DmcTypeConceptREFMV(DmconcinnityDMSAG.__isRelatedTo);
        
        setLastValue(attr.add(value));
        add(DmconcinnityDMSAG.__isRelatedTo,attr);
        return(attr);
    }

    /**
     * @return the number of values in isRelatedTo
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1441)
    public int getIsRelatedToSize(){
        DmcAttribute<?> attr = get(DmconcinnityDMSAG.__isRelatedTo);
        if (attr == null){
            if (DmconcinnityDMSAG.__isRelatedTo.indexSize == 0)
                return(0);
            else
                return(DmconcinnityDMSAG.__isRelatedTo.indexSize);
        }
        return(attr.getMVSize());
    }

    /**
     * Deletes a isRelatedTo value.
     * @param value The Concept to be deleted from set of attribute values.
     * @return the deleted attribute instance     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1482)
    public DmcAttribute<?> delIsRelatedTo(Object value){
        DmcAttribute<?> attr = get(DmconcinnityDMSAG.__isRelatedTo);
        
        if ( (attr == null) && (getModifier()!= null))
            delFromEmptyAttribute(new DmcTypeConceptREFMV(DmconcinnityDMSAG.__isRelatedTo), value);
        else
            attr = del(DmconcinnityDMSAG.__isRelatedTo, value);
        
        return(attr);
    }

    /**
     * Removes the isRelatedTo attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatMV(GenUtility.java:1538)
    public void remIsRelatedTo(){
         rem(DmconcinnityDMSAG.__isRelatedTo);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:678)
    /**
     * @return the ConceptREF
     */
    public ConceptREF getRepresents(){
        DmcTypeConceptREFSV attr = (DmcTypeConceptREFSV) get(DmconcinnityDMSAG.__represents);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getSV());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:700)
    /**
     * @return the reference to Concept without attempting lazy resolution (if turned on).
     */
    public ConceptREF getRepresentsREF(){
        DmcTypeConceptREFSV attr = (DmcTypeConceptREFSV) get(DmconcinnityDMSAG.__represents);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:718)
    /**
     * Sets represents to the specified value.
     * @param value ConceptDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:723)
    public void setRepresents(ConceptDMO value) {
        DmcAttribute<?> attr = get(DmconcinnityDMSAG.__represents);
        if (attr == null)
            attr = new DmcTypeConceptREFSV(DmconcinnityDMSAG.__represents);
        else
            ((DmcTypeConceptREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(DmconcinnityDMSAG.__represents,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets represents to the specified value.
     * @param value A value compatible with DmcTypeConceptREFSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setRepresents(Object value) throws DmcValueException {
        DmcTypeConceptREFSV attr  = (DmcTypeConceptREFSV) get(DmconcinnityDMSAG.__represents);
        if (attr == null)
            attr = new DmcTypeConceptREFSV(DmconcinnityDMSAG.__represents);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DmconcinnityDMSAG.__represents,attr);
    }

    /**
     * Removes the represents attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remRepresents(){
         rem(DmconcinnityDMSAG.__represents);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
    public String getHint(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__hint);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets hint to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
    public void setHint(String value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__hint);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__hint);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__hint,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets hint to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setHint(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(MetaDMSAG.__hint);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__hint);
        
        attr.set(value);
        set(MetaDMSAG.__hint,attr);
    }

    /**
     * Removes the hint attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remHint(){
         rem(MetaDMSAG.__hint);
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

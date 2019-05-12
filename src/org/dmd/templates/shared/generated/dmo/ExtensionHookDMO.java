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
import java.io.Serializable;                                                 // Always required - (GenUtility.java:227)
import org.dmd.dmc.DmcAttribute;                                             // Named object - (GenUtility.java:388)
import org.dmd.dmc.DmcNamedObjectIF;                                         // Named object - (GenUtility.java:387)
import org.dmd.dmc.DmcOmni;                                                  // Lazy resolution - (GenUtility.java:331)
import org.dmd.dmc.DmcSliceInfo;                                             // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                                        // Any attributes - (GenUtility.java:249)
import org.dmd.dmc.types.DefinitionName;                                     // Naming attribute type - (GenUtility.java:382)
import org.dmd.dms.generated.dmo.MetaDMSAG;                                  // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.DmcTypeDefinitionNameSV;                  // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                        // Required for MODREC constructor - (GenUtility.java:230)
import org.dmd.dms.generated.types.DmcTypeStringSV;                          // Required type - (GenUtility.java:339)
import org.dmd.templates.shared.generated.dmo.ContainedElementDMO;           // Base class - (GenUtility.java:367)
import org.dmd.templates.shared.generated.dmo.SectionDMO;                    // Type specific set/add - (GenUtility.java:318)
import org.dmd.templates.shared.generated.types.DmcTypeSectionREFSV;         // Reference type - (GenUtility.java:311)
import org.dmd.templates.shared.generated.types.SectionREF;                  // Helper class - (GenUtility.java:346)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * The dark-matter Domain Specific Definition (DSD) mechanisms allow for
 * the\n extension of objects using auxliary classes and arbitrary name value
 * pairs (via the nvp attribute).\n These mechanisms are useful because they
 * allow you to augment an existing Domain Specific Language\n (DSL) with
 * your own information that can be used to facilitate generation of other
 * types\n of artifacts.\n <p/>\n However, you might also want that
 * additional information to show up in the documentation\n produced as part
 * of the base DSL. That's where the ExtensionHook mechanism comes into
 * play;\n although you can use this for your own purposes to allow others to
 * extend the\n content of your generated artifacts - there's nothing
 * dark-matter specific about \n the mechanism.\n <p/>\n When defining your
 * Sections, you may indicate that they contain ExtensionHooks.  This\n will
 * result in the generation of an ExtensionHook interface for the template
 * definition module.\n Other designers who have extended your DSL then
 * create a class that implements the ExtensionHook\n interface and have it
 * dynamically loaded when the artifact generator is invoked (this is
 * usually\n done via commandline arguments that are passed to the generated
 * TemplateLoader). It's up to the\n designer of the base DSL to provide
 * these mechanisms.\n <p/>\n When formatting the artifact, the base DSL
 * designer will call the method on a Section\n (in the appropriate sequence)
 * to have the TemplateLoader call any registered classes that\n implement
 * the ExtensionHook interface.
 * <P>
 * Generated from the dmtdl schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class ExtensionHookDMO  extends ContainedElementDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "ExtensionHook";


    static {
    }

    public ExtensionHookDMO() {
        super("ExtensionHook");
    }

    protected ExtensionHookDMO(String oc) {
        super(oc);
    }

    @Override
    public ExtensionHookDMO getNew(){
        ExtensionHookDMO rc = new ExtensionHookDMO();
        return(rc);
    }

    @Override
    public ExtensionHookDMO getSlice(DmcSliceInfo info){
        ExtensionHookDMO rc = new ExtensionHookDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public ExtensionHookDMO(DmcTypeModifierMV mods) {
        super("ExtensionHook");
        modrec(true);
        setModifier(mods);
    }

    public ExtensionHookDMO getModificationRecorder(){
        ExtensionHookDMO rc = new ExtensionHookDMO();
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
        if (obj instanceof ExtensionHookDMO){
            return( getObjectName().equals( ((ExtensionHookDMO) obj).getObjectName()) );
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

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remName(){
         rem(MetaDMSAG.__name);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:660)
    public SectionREF getUsesSection(){
        DmcTypeSectionREFSV attr = (DmcTypeSectionREFSV) get(DmtdlDMSAG.__usesSection);
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

    /**
     * Returns the reference to Section without attempting lazy resolution (if turned on).
     */
    public SectionREF getUsesSectionREF(){
        DmcTypeSectionREFSV attr = (DmcTypeSectionREFSV) get(DmtdlDMSAG.__usesSection);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets usesSection to the specified value.
     * @param value SectionDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:714)
    public void setUsesSection(SectionDMO value) {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__usesSection);
        if (attr == null)
            attr = new DmcTypeSectionREFSV(DmtdlDMSAG.__usesSection);
        else
            ((DmcTypeSectionREFSV)attr).removeBackReferences();
        
        try{
            attr.set(value);
            set(DmtdlDMSAG.__usesSection,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets usesSection to the specified value.
     * @param value A value compatible with DmcTypeSectionREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setUsesSection(Object value) throws DmcValueException {
        DmcTypeSectionREFSV attr  = (DmcTypeSectionREFSV) get(DmtdlDMSAG.__usesSection);
        if (attr == null)
            attr = new DmcTypeSectionREFSV(DmtdlDMSAG.__usesSection);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DmtdlDMSAG.__usesSection,attr);
    }

    /**
     * Removes the usesSection attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remUsesSection(){
         rem(DmtdlDMSAG.__usesSection);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:789)
    public String getTargetObjectClass(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmtdlDMSAG.__targetObjectClass);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets targetObjectClass to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:829)
    public void setTargetObjectClass(String value) {
        DmcAttribute<?> attr = get(DmtdlDMSAG.__targetObjectClass);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtdlDMSAG.__targetObjectClass);
        
        try{
            attr.set(value);
            set(DmtdlDMSAG.__targetObjectClass,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets targetObjectClass to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:882)
    public void setTargetObjectClass(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmtdlDMSAG.__targetObjectClass);
        if (attr == null)
            attr = new DmcTypeStringSV(DmtdlDMSAG.__targetObjectClass);
        
        attr.set(value);
        set(DmtdlDMSAG.__targetObjectClass,attr);
    }

    /**
     * Removes the targetObjectClass attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:902)
    public void remTargetObjectClass(){
         rem(DmtdlDMSAG.__targetObjectClass);
    }




}

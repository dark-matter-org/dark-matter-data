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
package org.dmd.features.extgwt.examples.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:321)
import java.io.Serializable;                                    // Always required
import java.util.*;                                             // Always required
import org.dmd.dmc.DmcAttribute;                                // Any attributes
import org.dmd.dmc.DmcNamedObjectIF;                            // Named object
import org.dmd.dmc.DmcObject;                                   // Structural class
import org.dmd.dmc.DmcSliceInfo;                                // Required for object slicing
import org.dmd.dmc.DmcValueException;                           // Any attributes
import org.dmd.dmc.types.StringName;                            // Naming attribute type
import org.dmd.dms.generated.dmo.MetaDMSAG;                     // Attribute from meta schema
import org.dmd.dms.generated.types.DmcTypeIntegerSV;            // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;           // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringNameSV;         // Required type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The Folder class allows for the grouping of MailItems into folders.
 * <P>
 * Generated from the mail schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class FolderDMO  extends DmcObject  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "Folder";

    public final static DmcClassInfo classInfo = MailDMSAG.__Folder;

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public FolderDMO() {
        super("Folder");
    }

    protected FolderDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public FolderDMO getNew(){
        FolderDMO rc = new FolderDMO();
        return(rc);
    }

    @Override
    public FolderDMO getSlice(DmcSliceInfo info){
        FolderDMO rc = new FolderDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public FolderDMO(DmcTypeModifierMV mods) {
        super("Folder");
        modrec(true);
        setModifier(mods);
    }

    public FolderDMO getModificationRecorder(){
        FolderDMO rc = new FolderDMO();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:735)
    public StringName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        if (name != null)
            return((StringName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__name);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof FolderDMO){
            return( getObjectName().equals( ((FolderDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public Integer getFolderID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(MailDMSAG.__folderID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets folderID to the specified value.
     * @param value Integer
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
    public void setFolderID(Integer value) {
        DmcAttribute<?> attr = get(MailDMSAG.__folderID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MailDMSAG.__folderID);
        
        try{
            attr.set(value);
            set(MailDMSAG.__folderID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets folderID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setFolderID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MailDMSAG.__folderID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(MailDMSAG.__folderID);
        
        attr.set(value);
        set(MailDMSAG.__folderID,attr);
    }

    /**
     * Removes the folderID attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remFolderID(){
         rem(MailDMSAG.__folderID);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public StringName getName(){
        DmcTypeStringNameSV attr = (DmcTypeStringNameSV) get(MetaDMSAG.__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:680)
    public void setName(StringName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(MetaDMSAG.__name);
        
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
     * @param value A value compatible with DmcTypeStringNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(MetaDMSAG.__name);
        
        attr.set(value);
        set(MetaDMSAG.__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remName(){
         rem(MetaDMSAG.__name);
    }




}

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

// Generated from:  org.dmd.dms.util.DmoFormatter.formatImports(DmoFormatter.java:607)
import java.io.Serializable;                                    // Always required
import java.util.*;                                             // Always required
import org.dmd.dmc.DmcAttribute;                                // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                            // Always required
import org.dmd.dmc.DmcNamedObjectIF;                            // Named object
import org.dmd.dmc.DmcValueException;                           // Any attributes
import org.dmd.dmc.types.StringName;                            // Naming attribute type
import org.dmd.dms.generated.dmo.DmwWrapperDMO;                 // Structural class
import org.dmd.dms.generated.enums.ValueTypeEnum;               // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeIntegerSV;            // Required type
import org.dmd.dms.generated.types.DmcTypeStringNameSV;         // Required type

/**
 * The Folder class allows for the grouping of MailItems into folders.
 * <P>
 * Generated from the mail schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:131)
 */
@SuppressWarnings("serial")
public class FolderDMO  extends DmwWrapperDMO  implements DmcNamedObjectIF , Serializable  {

    public final static String constructionClassName = "Folder";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __folderID = new DmcAttributeInfo("folderID",900,"Integer",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__folderID.id,__folderID);
        _ImAp.put(__name.id,__name);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__folderID.name,__folderID);
        _SmAp.put(__name.name,__name);
    }

    public FolderDMO() {
        super("Folder");
    }

    protected FolderDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public FolderDMO getNew(){
        FolderDMO rc = new FolderDMO();
        return(rc);
    }

    //  org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:680)
    public StringName getObjectName(){
        DmcAttribute<?> name = get(__name);
        if (name != null)
            return((StringName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__name);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof FolderDMO){
            return( getObjectName().equals( ((FolderDMO) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:600)
    public Integer getFolderID(){
        DmcTypeIntegerSV attr = (DmcTypeIntegerSV) get(__folderID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets folderID to the specified value.
     * @param value Integer
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:633)
    public void setFolderID(Integer value) {
        DmcAttribute<?> attr = get(__folderID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(__folderID);
        
        try{
            attr.set(value);
            set(__folderID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets folderID to the specified value.
     * @param value A value compatible with DmcTypeIntegerSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:660)
    public void setFolderID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__folderID);
        if (attr == null)
            attr = new DmcTypeIntegerSV(__folderID);
        
        attr.set(value);
        set(__folderID,attr);
    }

    /**
     * Removes the folderID attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:675)
    public void remFolderID(){
         rem(__folderID);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:600)
    public StringName getName(){
        DmcTypeStringNameSV attr = (DmcTypeStringNameSV) get(__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value StringName
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:633)
    public void setName(StringName value) {
        DmcAttribute<?> attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__name);
        
        try{
            attr.set(value);
            set(__name,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringNameSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:660)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringNameSV(__name);
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:675)
    public void remName(){
         rem(__name);
    }




}

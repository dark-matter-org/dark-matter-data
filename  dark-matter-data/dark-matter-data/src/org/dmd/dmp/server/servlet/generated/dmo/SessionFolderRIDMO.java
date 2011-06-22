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
package org.dmd.dmp.server.servlet.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:287)
import java.io.Serializable;                                  // Always required
import java.util.*;                                           // Always required
import org.dmd.dmc.DmcAttribute;                              // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                          // Always required
import org.dmd.dmc.DmcHierarchicNamedObjectIF;                // Named object
import org.dmd.dmc.DmcNamedObjectIF;                          // Named object
import org.dmd.dmc.DmcObject;                                 // Structural class
import org.dmd.dmc.DmcSliceInfo;                              // Required for object slicing
import org.dmd.dmc.DmcValueException;                         // Any attributes
import org.dmd.dmc.types.DotName;                             // Naming attribute type
import org.dmd.dms.generated.enums.DataTypeEnum;              // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;             // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeDotNameSV;          // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;         // Required for MODREC constructor

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The SessionFolderRI provides for a grouping of SessionRI objects.
 * <P>
 * Generated from the dmp.server schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class SessionFolderRIDMO  extends DmcObject  implements DmcNamedObjectIF, DmcHierarchicNamedObjectIF, Serializable  {

    public final static String constructionClassName = "SessionFolderRI";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __dotName = new DmcAttributeInfo("dotName",107,"DotName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__dotName.id,__dotName);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__dotName.name,__dotName);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public SessionFolderRIDMO() {
        super("SessionFolderRI");
    }

    protected SessionFolderRIDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public SessionFolderRIDMO getNew(){
        SessionFolderRIDMO rc = new SessionFolderRIDMO();
        return(rc);
    }

    @Override
    public SessionFolderRIDMO getSlice(DmcSliceInfo info){
        SessionFolderRIDMO rc = new SessionFolderRIDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public SessionFolderRIDMO(DmcTypeModifierMV mods) {
        super("SessionFolderRI");
        modrec(true);
        setModifier(mods);
    }

    public SessionFolderRIDMO getModificationRecorder(){
        SessionFolderRIDMO rc = new SessionFolderRIDMO();
        rc.setDotName(getDotName());
        rc.setModifier(new DmcTypeModifierMV());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:739)
    public DotName getObjectName(){
        DmcAttribute<?> name = get(__dotName);
        if (name != null)
            return((DotName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:749)
    public DotName getHierarchicObjectName(){
        return(getObjectName());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__dotName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof SessionFolderRIDMO){
            return( getObjectName().equals( ((SessionFolderRIDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:605)
    public DotName getDotName(){
        DmcTypeDotNameSV attr = (DmcTypeDotNameSV) get(__dotName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dotName to the specified value.
     * @param value DotName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:642)
    public void setDotName(DotName value) {
        DmcAttribute<?> attr = get(__dotName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(__dotName);
        
        try{
            attr.set(value);
            set(__dotName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:690)
    public void setDotName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__dotName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(__dotName);
        
        attr.set(value);
        set(__dotName,attr);
    }

    /**
     * Removes the dotName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:705)
    public void remDotName(){
         rem(__dotName);
    }




}

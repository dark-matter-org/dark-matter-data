//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
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
package org.dmd.mvw.tools.mvwgenerator.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:322)
import java.io.Serializable;                                                   // Always required
import java.util.*;                                                            // Always required
import org.dmd.dmc.DmcAttribute;                                               // Any attributes
import org.dmd.dmc.DmcNamedObjectIF;                                           // Named object
import org.dmd.dmc.DmcSliceInfo;                                               // Required for object slicing
import org.dmd.dmc.DmcValueException;                                          // Any attributes
import org.dmd.dmc.types.CamelCaseName;                                        // Naming attribute type
import org.dmd.dms.generated.dmo.MetaDMSAG;                                    // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeCamelCaseNameSV;                     // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                          // Required for MODREC constructor
import org.dmd.mvw.tools.mvwgenerator.generated.dmo.RunContextItemDMO;         // Base class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The I18NConfig is a specialized RunContextItem that indicates an interface
 * class used to access internationalized constants or messages.
 * <P>
 * Generated from the mvw schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class I18NConfigDMO  extends RunContextItemDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "I18NConfig";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public I18NConfigDMO() {
        super("I18NConfig");
    }

    protected I18NConfigDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public I18NConfigDMO getNew(){
        I18NConfigDMO rc = new I18NConfigDMO();
        return(rc);
    }

    @Override
    public I18NConfigDMO getSlice(DmcSliceInfo info){
        I18NConfigDMO rc = new I18NConfigDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public I18NConfigDMO(DmcTypeModifierMV mods) {
        super("I18NConfig");
        modrec(true);
        setModifier(mods);
    }

    public I18NConfigDMO getModificationRecorder(){
        I18NConfigDMO rc = new I18NConfigDMO();
        rc.setItemName(getItemName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:736)
    public CamelCaseName getObjectName(){
        DmcAttribute<?> name = get(MvwDMSAG.__itemName);
        if (name != null)
            return((CamelCaseName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MvwDMSAG.__itemName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof I18NConfigDMO){
            return( getObjectName().equals( ((I18NConfigDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:643)
    public CamelCaseName getItemName(){
        DmcTypeCamelCaseNameSV attr = (DmcTypeCamelCaseNameSV) get(MvwDMSAG.__itemName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets itemName to the specified value.
     * @param value CamelCaseName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:681)
    public void setItemName(CamelCaseName value) {
        DmcAttribute<?> attr = get(MvwDMSAG.__itemName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__itemName);
        
        try{
            attr.set(value);
            set(MvwDMSAG.__itemName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets itemName to the specified value.
     * @param value A value compatible with DmcTypeCamelCaseNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:733)
    public void setItemName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MvwDMSAG.__itemName);
        if (attr == null)
            attr = new DmcTypeCamelCaseNameSV(MvwDMSAG.__itemName);
        
        attr.set(value);
        set(MvwDMSAG.__itemName,attr);
    }

    /**
     * Removes the itemName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:748)
    public void remItemName(){
         rem(MvwDMSAG.__itemName);
    }




}

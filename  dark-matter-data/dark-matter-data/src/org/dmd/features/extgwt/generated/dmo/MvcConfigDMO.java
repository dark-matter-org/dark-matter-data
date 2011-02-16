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
package org.dmd.features.extgwt.generated.dmo;

import java.util.*;

import org.dmd.dms.generated.enums.ModifyTypeEnum;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dmc.types.Modification;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
// import 3 MvcConfig
import org.dmd.features.extgwt.generated.types.DmcTypeMvcConfigREF;
import org.dmd.features.extgwt.generated.types.MvcConfigREF;
// import 4
import org.dmd.features.extgwt.generated.types.MvcConfigREF;
// import 3 String
import org.dmd.dmc.types.DmcTypeString;

// import 6
import org.dmd.features.extgwt.generated.dmo.MvcDefinitionDMO;
// import 7
import org.dmd.dmc.DmcNamedObjectIF;

@SuppressWarnings("serial")
/**
 * The MvcConfig class is stored in a file with a .mvc suffix and used to
 * define the set of files that hold the definitions of MvcEvents,
 * MvcControllers and MvcViews. Based on the definition of these objects, we
 * can generate base classes for the com.extjs.gxt.ui.client.mvc.Controller
 * and com.extjs.gxt.ui.client.mvc.View that provide some common code
 * required by these classes.
 * <P>
 * Generated from the extgwt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:535)
 */
public class MvcConfigDMO  extends MvcDefinitionDMO  implements DmcNamedObjectIF  {

    public final static String _dependsOnMVC = "dependsOnMVC";
    public final static String _name = "name";
    public final static String _genPackage = "genPackage";

    public MvcConfigDMO() {
        super("MvcConfig");
    }

    protected MvcConfigDMO(String oc) {
        super(oc);
    }

    public MvcConfigDMO(MvcConfigDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public MvcConfigDMO getOneOfMe() {
        MvcConfigDMO rc = new MvcConfigDMO(this.getConstructionClassName());
        return(rc);
    }

    @SuppressWarnings("unchecked")
    public String getObjectName(){
        DmcAttribute name = get(_name);
        if (name != null)
            return(name.getString());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcConfigDMO){
            return( getObjectName().equals( ((MvcConfigDMO) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return An Iterator of MvcConfigDMO objects.
     */
    public Iterator<MvcConfigREF> getDependsOnMVC(){
        DmcTypeMvcConfigREF attr = (DmcTypeMvcConfigREF) get(_dependsOnMVC);
        if (attr == null)
            return(Collections.<MvcConfigREF> emptyList().iterator());

        return(attr.getMV());
    }

    /**
     * Adds another dependsOnMVC value.
     * @param value A value compatible with MvcConfig
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addDependsOnMVC(Object value) throws DmcValueException {
        DmcAttribute attr = get(_dependsOnMVC);
        if (attr == null)
            attr = new DmcTypeMvcConfigREF();
        
        attr.add(value);
        add(_dependsOnMVC,attr);
        return(attr);
    }

    /**
     * Deletes a dependsOnMVC value.
     * @param value The MvcConfig to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delDependsOnMVC(Object value) throws DmcValueException {
        DmcAttribute attr = del(_dependsOnMVC, ((DmcNamedObjectIF)value).getObjectName());
        if (attr == null){
            DmcTypeModifier mods = getModifier();
            if (mods != null){
                attr = new DmcTypeMvcConfigREF();
                attr.setName(_dependsOnMVC);
                attr.add(((DmcNamedObjectIF)value).getObjectName());
                mods.add(new Modification(ModifyTypeEnum.DEL, attr));
            }
        }
        return(attr);
    }

    /**
     * Removes the dependsOnMVC attribute value.
     */
    public void remDependsOnMVC(){
         rem(_dependsOnMVC);
    }

    public String getName(){
        DmcTypeString attr = (DmcTypeString) get(_name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setName(Object value) throws DmcValueException {
        DmcAttribute attr = get(_name);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    public void remName(){
         rem(_name);
    }

    public String getGenPackage(){
        DmcTypeString attr = (DmcTypeString) get(_genPackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets genPackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setGenPackage(Object value) throws DmcValueException {
        DmcAttribute attr = get(_genPackage);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_genPackage,attr);
    }

    /**
     * Removes the genPackage attribute value.
     */
    public void remGenPackage(){
         rem(_genPackage);
    }




}

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
package org.dmd.dmr.shared.base.generated.dmo;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
// import 3 String
import org.dmd.dmc.types.DmcTypeString;

// import 6
import org.dmd.dmr.shared.base.generated.dmo.HierarchicObjectDMO;
// import 7
import org.dmd.dmc.DmcNamedObjectIF;

@SuppressWarnings("serial")
/**
 * A DotNamedObject is a hierarchic object whose fully qualified name is
 * composed of naming attributes separated by periods. For example 
 * grandparent.parent.child. <p> The naming attribute of a DotNamedObject is
 * name. Unlike LDAP objects,  we don't bother making this configurable. When
 * a DotNamedObject is parsed from a file, we check to see if the name
 * attribute has a value; if not, we take the last portion of the FQN as the
 * name. For example, if the FQN is x.y.z, the name of the object would be
 * 'z'.
 * <P>
 * Generated from the dmr.base schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:466)
 */
public class DotNamedObjectDMO  extends HierarchicObjectDMO  implements DmcNamedObjectIF  {

    public final static String _FQN = "FQN";
    public final static String _name = "name";

    public DotNamedObjectDMO() {
        super("DotNamedObject");
    }

    protected DotNamedObjectDMO(String oc) {
        super(oc);
    }

    public DotNamedObjectDMO(DotNamedObjectDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public DotNamedObjectDMO getOneOfMe() {
        DotNamedObjectDMO rc = new DotNamedObjectDMO(this.getConstructionClassName());
        return(rc);
    }

    @SuppressWarnings("unchecked")
    public String getObjectName(){
        DmcAttribute name = get(_FQN);
        if (name != null)
            return(name.getString());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof DotNamedObjectDMO){
            return( getObjectName().equals( ((DotNamedObjectDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public String getFQN(){
        DmcTypeString attr = (DmcTypeString) get(_FQN);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setFQN(Object value) throws DmcValueException {
        DmcAttribute attr = get(_FQN);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_FQN,attr);
    }

    /**
     * Removes the FQN attribute value.
     */
    public void remFQN(){
         rem(_FQN);
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




}

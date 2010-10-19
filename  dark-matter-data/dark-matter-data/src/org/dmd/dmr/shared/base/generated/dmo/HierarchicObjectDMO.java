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
// import 3 Integer
import org.dmd.dmc.types.DmcTypeInteger;
// import 3 String
import org.dmd.dmc.types.DmcTypeString;

// import 5
import org.dmd.dms.generated.dmo.DmwWrapperDMO;
// import 7
import org.dmd.dmc.DmcNamedObjectIF;

@SuppressWarnings("serial")
/**
 * A HierarchicObject is meant to represent any object that can be identified
 * with a Fully Qualified Name (FQN) and exists in a containment relationship
 * with other objects. The exact implementation of a HierarchicObject is
 * application specific.
 * <P>
 * Generated from the dmr.base schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:451)
 */
abstract public class HierarchicObjectDMO  extends DmwWrapperDMO  implements DmcNamedObjectIF  {

    public final static String _parentFQN = "parentFQN";
    public final static String _lineNumber = "lineNumber";
    public final static String _file = "file";
    public final static String _FQN = "FQN";

    public HierarchicObjectDMO() {
        super("HierarchicObject");
    }

    protected HierarchicObjectDMO(String oc) {
        super(oc);
    }

    @SuppressWarnings("unchecked")
    public String getObjectName(){
        DmcAttribute name = get(_FQN);
        if (name != null)
            return(name.getString());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof HierarchicObjectDMO){
            return( getObjectName().equals( ((HierarchicObjectDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public String getParentFQN(){
        DmcTypeString attr = (DmcTypeString) get(_parentFQN);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets parentFQN to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setParentFQN(Object value) throws DmcValueException {
        DmcAttribute attr = get(_parentFQN);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_parentFQN,attr);
    }

    /**
     * Removes the parentFQN attribute value.
     */
    public void remParentFQN(){
         rem(_parentFQN);
    }

    public Integer getLineNumber(){
        DmcTypeInteger attr = (DmcTypeInteger) get(_lineNumber);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets lineNumber to the specified value.
     * @param value A value compatible with DmcTypeInteger
     */
    @SuppressWarnings("unchecked")
    public void setLineNumber(Object value) throws DmcValueException {
        DmcAttribute attr = get(_lineNumber);
        if (attr == null)
            attr = new DmcTypeInteger();
        
        attr.set(value);
        set(_lineNumber,attr);
    }

    /**
     * Removes the lineNumber attribute value.
     */
    public void remLineNumber(){
         rem(_lineNumber);
    }

    public String getFile(){
        DmcTypeString attr = (DmcTypeString) get(_file);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets file to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setFile(Object value) throws DmcValueException {
        DmcAttribute attr = get(_file);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_file,attr);
    }

    /**
     * Removes the file attribute value.
     */
    public void remFile(){
         rem(_file);
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




}

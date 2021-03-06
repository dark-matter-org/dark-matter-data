//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010-2021 dark-matter-data committers
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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:408)
import java.io.Serializable;                                              // Always required - (GenUtility.java:227)
import org.dmd.dmc.DmcAttribute;                                          // Named object - (GenUtility.java:388)
import org.dmd.dmc.DmcNamedObjectIF;                                      // Named object - (GenUtility.java:387)
import org.dmd.dmc.DmcSliceInfo;                                          // Required for object slicing - (GenUtility.java:232)
import org.dmd.dmc.DmcValueException;                                     // Any attributes - (GenUtility.java:249)
import org.dmd.dmc.types.FullyQualifiedName;                              // Naming attribute type - (GenUtility.java:382)
import org.dmd.dmr.shared.base.generated.dmo.HierarchicObjectDMO;         // Base class - (GenUtility.java:367)
import org.dmd.dms.generated.dmo.MetaDMSAG;                               // Required for MODREC constructor - (GenUtility.java:231)
import org.dmd.dms.generated.types.DmcTypeFullyQualifiedNameSV;           // Required type - (GenUtility.java:339)
import org.dmd.dms.generated.types.DmcTypeModifierMV;                     // Required for MODREC constructor - (GenUtility.java:230)

// Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:678)
/**
 * A DotNamedObject is a hierarchic object whose fully qualified\n name is
 * composed of naming attributes separated by periods. For example \n
 * grandparent.parent.child.\n <p>\n The naming attribute of a DotNamedObject
 * is name. Unlike LDAP objects, \n we don't bother making this configurable.
 * When a DotNamedObject is parsed\n from a file, we check to see if the name
 * attribute has a value; if not,\n we take the last portion of the FQN as
 * the name. For example, if the FQN\n is x.y.z, the name of the object would
 * be 'z'.
 * <P>
 * Generated from the dmrbase schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class DotNamedObjectDMO  extends HierarchicObjectDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "DotNamedObject";


    static {
    }

    public DotNamedObjectDMO() {
        super("DotNamedObject");
    }

    protected DotNamedObjectDMO(String oc) {
        super(oc);
    }

    @Override
    public DotNamedObjectDMO getNew(){
        DotNamedObjectDMO rc = new DotNamedObjectDMO();
        return(rc);
    }

    @Override
    public DotNamedObjectDMO getSlice(DmcSliceInfo info){
        DotNamedObjectDMO rc = new DotNamedObjectDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public DotNamedObjectDMO(DmcTypeModifierMV mods) {
        super("DotNamedObject");
        modrec(true);
        setModifier(mods);
    }

    public DotNamedObjectDMO getModificationRecorder(){
        DotNamedObjectDMO rc = new DotNamedObjectDMO();
        rc.setFQN(getFQN());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:752)
    public FullyQualifiedName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__FQN);
        if (name != null)
            return((FullyQualifiedName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:769)
    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__FQN);
        return(name);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:776)
    public boolean equals(Object obj){
        if (obj instanceof DotNamedObjectDMO){
            return( getObjectName().equals( ((DotNamedObjectDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:784)
    public int hashCode(){
        FullyQualifiedName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:798)
    public FullyQualifiedName getFQN(){
        DmcTypeFullyQualifiedNameSV attr = (DmcTypeFullyQualifiedNameSV) get(MetaDMSAG.__FQN);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets FQN to the specified value.
     * @param value FullyQualifiedName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:838)
    public void setFQN(FullyQualifiedName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__FQN);
        if (attr == null)
            attr = new DmcTypeFullyQualifiedNameSV(MetaDMSAG.__FQN);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__FQN,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeFullyQualifiedNameSV
     * @throws DmcValueException if value is not correct
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:892)
    public void setFQN(Object value) throws DmcValueException {
        DmcTypeFullyQualifiedNameSV attr  = (DmcTypeFullyQualifiedNameSV) get(MetaDMSAG.__FQN);
        if (attr == null)
            attr = new DmcTypeFullyQualifiedNameSV(MetaDMSAG.__FQN);
        
        attr.set(value);
        set(MetaDMSAG.__FQN,attr);
    }

    /**
     * Removes the FQN attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:912)
    public void remFQN(){
         rem(MetaDMSAG.__FQN);
    }




}

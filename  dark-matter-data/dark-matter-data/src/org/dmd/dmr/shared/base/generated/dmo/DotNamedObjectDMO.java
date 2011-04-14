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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:272)
import java.io.Serializable;                                              // Always required
import java.util.*;                                                       // Always required
import org.dmd.dmc.DmcAttribute;                                          // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                      // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                      // Named object
import org.dmd.dmc.DmcValueException;                                     // Any attributes
import org.dmd.dmc.types.FullyQualifiedName;                              // Naming attribute type
import org.dmd.dmr.shared.base.generated.dmo.HierarchicObjectDMO;         // Base class
import org.dmd.dms.generated.enums.ValueTypeEnum;                         // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeFullyQualifiedNameSV;           // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                     // Required for MODREC constructor

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
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:127)
 */
@SuppressWarnings("serial")
public class DotNamedObjectDMO  extends HierarchicObjectDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "DotNamedObject";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __FQN = new DmcAttributeInfo("FQN",84,"FullyQualifiedName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __file = new DmcAttributeInfo("file",74,"String",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __lineNumber = new DmcAttributeInfo("lineNumber",75,"Integer",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__FQN.id,__FQN);
        _ImAp.put(__file.id,__file);
        _ImAp.put(__lineNumber.id,__lineNumber);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__FQN.name,__FQN);
        _SmAp.put(__file.name,__file);
        _SmAp.put(__lineNumber.name,__lineNumber);
    }

    public DotNamedObjectDMO() {
        super("DotNamedObject");
    }

    protected DotNamedObjectDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public DotNamedObjectDMO getNew(){
        DotNamedObjectDMO rc = new DotNamedObjectDMO();
        return(rc);
    }

    public DotNamedObjectDMO(DmcTypeModifierMV mods) {
        super("DotNamedObject");
        modrec(true);
        setModifier(mods);
    }

    public DotNamedObjectDMO getModificationRecorder(){
        DotNamedObjectDMO rc = new DotNamedObjectDMO(new DmcTypeModifierMV());
        rc.setFQN(getFQN());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:667)
    public FullyQualifiedName getObjectName(){
        DmcAttribute<?> name = get(__FQN);
        if (name != null)
            return((FullyQualifiedName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__FQN);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof DotNamedObjectDMO){
            return( getObjectName().equals( ((DotNamedObjectDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:560)
    public FullyQualifiedName getFQN(){
        DmcTypeFullyQualifiedNameSV attr = (DmcTypeFullyQualifiedNameSV) get(__FQN);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets FQN to the specified value.
     * @param value FullyQualifiedName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:597)
    public void setFQN(FullyQualifiedName value) {
        DmcAttribute<?> attr = get(__FQN);
        if (attr == null)
            attr = new DmcTypeFullyQualifiedNameSV(__FQN);
        
        try{
            attr.set(value);
            set(__FQN,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets FQN to the specified value.
     * @param value A value compatible with DmcTypeFullyQualifiedNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:624)
    public void setFQN(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__FQN);
        if (attr == null)
            attr = new DmcTypeFullyQualifiedNameSV(__FQN);
        
        attr.set(value);
        set(__FQN,attr);
    }

    /**
     * Removes the FQN attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:639)
    public void remFQN(){
         rem(__FQN);
    }




}

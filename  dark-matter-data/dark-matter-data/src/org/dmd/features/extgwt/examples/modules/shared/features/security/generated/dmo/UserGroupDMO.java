package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:323)
import java.io.Serializable;                                    // Always required
import java.util.*;                                             // Always required
import org.dmd.dmc.DmcAttribute;                                // Any attributes
import org.dmd.dmc.DmcNamedObjectIF;                            // Named object
import org.dmd.dmc.DmcObject;                                   // Structural class
import org.dmd.dmc.DmcSliceInfo;                                // Required for object slicing
import org.dmd.dmc.DmcValueException;                           // Any attributes
import org.dmd.dmc.types.StringName;                            // Naming attribute type
import org.dmd.dms.generated.dmo.MetaDMSAG;                     // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeModifierMV;           // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringNameSV;         // Required type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The UserGroup class represents a group of users with similar capabilities.
 * <P>
 * Generated from the exsecurity schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:134)
 */
@SuppressWarnings("serial")
public class UserGroupDMO  extends DmcObject  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "UserGroup";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public UserGroupDMO() {
        super("UserGroup");
    }

    protected UserGroupDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public UserGroupDMO getNew(){
        UserGroupDMO rc = new UserGroupDMO();
        return(rc);
    }

    @Override
    public UserGroupDMO getSlice(DmcSliceInfo info){
        UserGroupDMO rc = new UserGroupDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public UserGroupDMO(DmcTypeModifierMV mods) {
        super("UserGroup");
        modrec(true);
        setModifier(mods);
    }

    public UserGroupDMO getModificationRecorder(){
        UserGroupDMO rc = new UserGroupDMO();
        rc.setName(getName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:736)
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
        if (obj instanceof UserGroupDMO){
            return( getObjectName().equals( ((UserGroupDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:644)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:682)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:734)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:749)
    public void remName(){
         rem(MetaDMSAG.__name);
    }




}

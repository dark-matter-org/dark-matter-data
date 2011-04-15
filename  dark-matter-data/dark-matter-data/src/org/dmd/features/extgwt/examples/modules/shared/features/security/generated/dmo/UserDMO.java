package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:272)
import java.io.Serializable;                                    // Always required
import java.util.*;                                             // Always required
import org.dmd.dmc.DmcAttribute;                                // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                            // Always required
import org.dmd.dmc.DmcNamedObjectIF;                            // Named object
import org.dmd.dmc.DmcValueException;                           // Any attributes
import org.dmd.dmc.types.StringName;                            // Naming attribute type
import org.dmd.dms.generated.dmo.DmwWrapperDMO;                 // Structural class
import org.dmd.dms.generated.enums.ValueTypeEnum;               // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeModifierMV;           // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringNameSV;         // Required type

/**
 * The User class represents a user of the system.
 * <P>
 * Generated from the exsecurity schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:127)
 */
@SuppressWarnings("serial")
public class UserDMO  extends DmwWrapperDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "User";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__name.id,__name);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__name.name,__name);
    }

    public UserDMO() {
        super("User");
    }

    protected UserDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public UserDMO getNew(){
        UserDMO rc = new UserDMO();
        return(rc);
    }

    public UserDMO(DmcTypeModifierMV mods) {
        super("User");
        modrec(true);
        setModifier(mods);
    }

    public UserDMO getModificationRecorder(){
        UserDMO rc = new UserDMO(new DmcTypeModifierMV());
        rc.setName(getName());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:667)
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
        if (obj instanceof UserDMO){
            return( getObjectName().equals( ((UserDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:560)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:597)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:624)
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
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:639)
    public void remName(){
         rem(__name);
    }




}

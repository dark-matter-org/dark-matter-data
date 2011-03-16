package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.dmo;

// Generated from: org.dmd.dms.util.DmoFormatter.formatImports(DmoFormatter.java:707)
import java.util.*;                                       // Always required
import org.dmd.dmc.DmcAttribute;                          // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                      // Always required
import org.dmd.dmc.DmcNamedObjectIF;                      // Named object
import org.dmd.dmc.DmcValueException;                     // Any attributes
import org.dmd.dmc.types.DmcTypeStringName;               // Required type
import org.dmd.dmc.types.StringName;                      // Naming attribute type
import org.dmd.dms.generated.dmo.DmwWrapperDMO;           // Structural class
import org.dmd.dms.generated.enums.ValueTypeEnum;         // Always required

/**
 * The User class represents a user of the system.
 * <P>
 * Generated from the exsecurity schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:140)
 */
@SuppressWarnings("serial")
public class UserDMO  extends DmwWrapperDMO  implements DmcNamedObjectIF  {

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
        super("User",_ImAp,_SmAp);
    }

    protected UserDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public UserDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public UserDMO(UserDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public UserDMO getOneOfMe() {
        UserDMO rc = new UserDMO(this.getConstructionClassName());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:783)
    public StringName getObjectName(){
        DmcAttribute<?> name = get(__name);
        if (name != null)
            return((StringName)name.getSV());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof UserDMO){
            return( getObjectName().equals( ((UserDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:322)
    public StringName getName(){
        DmcTypeStringName attr = (DmcTypeStringName) get(__name);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeStringName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:345)
    public void setName(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringName(__name);
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:360)
    public void remName(){
         rem(__name);
    }




}

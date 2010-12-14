package org.dmd.features.extgwt.examples.modules.shared.features.security.generated.dmo;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
// import 3 String
import org.dmd.dmc.types.DmcTypeString;

// import 5
import org.dmd.dms.generated.dmo.DmwWrapperDMO;
// import 7
import org.dmd.dmc.DmcNamedObjectIF;

@SuppressWarnings("serial")
/**
 * The UserGroup class represents a group of users with similar capabilities.
 * <P>
 * Generated from the exsecurity schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:466)
 */
public class UserGroupDMO  extends DmwWrapperDMO  implements DmcNamedObjectIF  {

    public final static String _name = "name";

    public UserGroupDMO() {
        super("UserGroup");
    }

    protected UserGroupDMO(String oc) {
        super(oc);
    }

    public UserGroupDMO(UserGroupDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public UserGroupDMO getOneOfMe() {
        UserGroupDMO rc = new UserGroupDMO(this.getConstructionClassName());
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
        if (obj instanceof UserGroupDMO){
            return( getObjectName().equals( ((UserGroupDMO) obj).getObjectName()) );
        }
        return(false);
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

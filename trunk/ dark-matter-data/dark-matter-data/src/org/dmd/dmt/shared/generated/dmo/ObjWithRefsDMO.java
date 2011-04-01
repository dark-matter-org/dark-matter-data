package org.dmd.dmt.shared.generated.dmo;

// Generated from:  org.dmd.dms.util.DmoFormatter.formatImports(DmoFormatter.java:606)
import java.util.*;                                                        // Always required
import org.dmd.dmc.DmcAttribute;                                           // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                       // Always required
import org.dmd.dmc.DmcNamedObjectIF;                                       // Named object
import org.dmd.dmc.DmcValueException;                                      // Any attributes
import org.dmd.dmc.types.StringName;                                       // Naming attribute type
import org.dmd.dms.generated.dmo.DmwWrapperDMO;                            // Structural class
import org.dmd.dms.generated.enums.ValueTypeEnum;                          // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeStringNameSV;                    // Required type
import org.dmd.dms.generated.types.DmcTypeStringSV;                        // Required type
import org.dmd.dmt.shared.generated.dmo.ObjWithRefsDMO;                    // Type specific set/add
import org.dmd.dmt.shared.generated.types.DmcTypeObjWithRefsREFSV;         // Reference type
import org.dmd.dmt.shared.generated.types.ObjWithRefsREF;                  // Helper class

/**
 * null
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:131)
 */
@SuppressWarnings("serial")
public class ObjWithRefsDMO  extends DmwWrapperDMO  implements DmcNamedObjectIF  {

    public final static String constructionClassName = "ObjWithRefs";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __objRef = new DmcAttributeInfo("objRef",10403,"ObjWithRefs",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __svString = new DmcAttributeInfo("svString",10140,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__name.id,__name);
        _ImAp.put(__objRef.id,__objRef);
        _ImAp.put(__svString.id,__svString);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__name.name,__name);
        _SmAp.put(__objRef.name,__objRef);
        _SmAp.put(__svString.name,__svString);
    }

    public ObjWithRefsDMO() {
        super("ObjWithRefs");
    }

    protected ObjWithRefsDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public ObjWithRefsDMO getNew(){
        ObjWithRefsDMO rc = new ObjWithRefsDMO();
        return(rc);
    }

    //  org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:677)
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
        if (obj instanceof ObjWithRefsDMO){
            return( getObjectName().equals( ((ObjWithRefsDMO) obj).getObjectName()) );
        }
        return(false);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:599)
    public String getSvString(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__svString);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svString to the specified value.
     * @param value String
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:632)
    public void setSvString(String value) {
        DmcAttribute<?> attr = get(__svString);
        if (attr == null)
            attr = new DmcTypeStringSV(__svString);
        
        try{
            attr.set(value);
            set(__svString,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets svString to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:659)
    public void setSvString(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__svString);
        if (attr == null)
            attr = new DmcTypeStringSV(__svString);
        
        attr.set(value);
        set(__svString,attr);
    }

    /**
     * Removes the svString attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:674)
    public void remSvString(){
         rem(__svString);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:550)
    public ObjWithRefsREF getObjRef(){
        DmcTypeObjWithRefsREFSV attr = (DmcTypeObjWithRefsREFSV) get(__objRef);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets objRef to the specified value.
     * @param value ObjWithRefsDMO
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:582)
    public void setObjRef(ObjWithRefsDMO value) {
        DmcAttribute<?> attr = get(__objRef);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFSV(__objRef);
        
        try{
            attr.set(value);
            set(__objRef,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets objRef to the specified value.
     * @param value A value compatible with DmcTypeObjWithRefsREFSV
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:659)
    public void setObjRef(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__objRef);
        if (attr == null)
            attr = new DmcTypeObjWithRefsREFSV(__objRef);
        
        attr.set(value);
        set(__objRef,attr);
    }

    /**
     * Removes the objRef attribute value.
     */
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:674)
    public void remObjRef(){
         rem(__objRef);
    }

    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:599)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:632)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:659)
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
    //  org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:674)
    public void remName(){
         rem(__name);
    }




}

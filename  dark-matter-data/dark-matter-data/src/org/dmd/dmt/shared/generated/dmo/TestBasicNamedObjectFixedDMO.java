package org.dmd.dmt.shared.generated.dmo;

import java.util.*;

import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dms.generated.enums.ModifyTypeEnum;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dmc.types.Modification;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
// import 3.2 String
import org.dmd.dmc.types.DmcTypeString;
// import 2
import org.dmd.dmc.types.StringName;
// import 3.2 StringName
import org.dmd.dmc.types.DmcTypeStringName;

// import 5
import org.dmd.dms.generated.dmo.DmwWrapperDMO;
// import 7
import org.dmd.dmc.DmcNamedObjectIF;

@SuppressWarnings("serial")
/**
 * The TestBasicNamedObjectFixed class provides a test bed a named object.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:654)
 */
public class TestBasicNamedObjectFixedDMO  extends DmwWrapperDMO  implements DmcNamedObjectIF  {

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __mvStringValue = new DmcAttributeInfo("mvStringValue",817,"String",ValueTypeEnum.MULTI,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __svStringValue = new DmcAttributeInfo("svStringValue",816,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__mvStringValue.id,__mvStringValue);
        _ImAp.put(__name.id,__name);
        _ImAp.put(__svStringValue.id,__svStringValue);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__mvStringValue.name,__mvStringValue);
        _SmAp.put(__name.name,__name);
        _SmAp.put(__svStringValue.name,__svStringValue);
    }

    public TestBasicNamedObjectFixedDMO() {
        super("TestBasicNamedObjectFixed",_ImAp,_SmAp);
    }

    protected TestBasicNamedObjectFixedDMO(String oc) {
        super(oc,_ImAp,_SmAp);
    }

    public TestBasicNamedObjectFixedDMO(String oc, Map<Integer,DmcAttributeInfo> im, Map<String,DmcAttributeInfo> sm){
        super(oc,im,sm);
    }

    public TestBasicNamedObjectFixedDMO(TestBasicNamedObjectFixedDMO original) {
        super(original.getConstructionClassName());
        System.out.println("Full object cloning not implemented...");
    }

    @Override
    public TestBasicNamedObjectFixedDMO getOneOfMe() {
        TestBasicNamedObjectFixedDMO rc = new TestBasicNamedObjectFixedDMO(this.getConstructionClassName());
        return(rc);
    }

    @SuppressWarnings("unchecked")
    public String getObjectName(){
        DmcAttribute name = get(__name);
        if (name != null)
            return(name.getString());
    
        return(null);
    }

    public boolean equals(Object obj){
        if (obj instanceof TestBasicNamedObjectFixedDMO){
            return( getObjectName().equals( ((TestBasicNamedObjectFixedDMO) obj).getObjectName()) );
        }
        return(false);
    }

    /**
     * @return An Iterator of String objects.
     */
    public Iterator<String> getMvStringValue(){
        DmcTypeString attr = (DmcTypeString) get(__mvStringValue);
        if (attr == null)
            return(Collections.<String> emptyList().iterator());

        return(attr.getMV());
    }

    /**
     * Adds another mvStringValue value.
     * @param value A value compatible with String
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addMvStringValue(Object value) throws DmcValueException {
        DmcAttribute attr = get(__mvStringValue);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.add(value);
        add(__mvStringValue,attr);
        return(attr);
    }

    /**
     * Deletes a mvStringValue value.
     * @param value The String to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delMvStringValue(Object value) throws DmcValueException {
        DmcAttribute attr = del(__mvStringValue, value);
        if (attr == null){
            DmcTypeModifier mods = getModifier();
            if (mods != null){
                attr = new DmcTypeString();
                attr.setName(__mvStringValue.name);
                attr.add(value);
                mods.add(new Modification(ModifyTypeEnum.DEL, attr));
            }
        }
        return(attr);
    }

    /**
     * Removes the mvStringValue attribute value.
     */
    public void remMvStringValue(){
         rem(__mvStringValue);
    }

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
    @SuppressWarnings("unchecked")
    public void setName(Object value) throws DmcValueException {
        DmcAttribute attr = get(__name);
        if (attr == null)
            attr = new DmcTypeStringName();
        
        attr.set(value);
        set(__name,attr);
    }

    /**
     * Removes the name attribute value.
     */
    public void remName(){
         rem(__name);
    }

    public String getSvStringValue(){
        DmcTypeString attr = (DmcTypeString) get(__svStringValue);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets svStringValue to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setSvStringValue(Object value) throws DmcValueException {
        DmcAttribute attr = get(__svStringValue);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(__svStringValue,attr);
    }

    /**
     * Removes the svStringValue attribute value.
     */
    public void remSvStringValue(){
         rem(__svStringValue);
    }




}

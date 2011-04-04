package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dmt.shared.generated.dmo.NameContainerTestDMO;    // primitive import
/**
 * The DmcTypeNameContainerTestREFSET provides storage for a set of NameContainerTestDMO
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from: org.dmd.dms.util.GenUtility.dumpSETType(GenUtility.java:1619)
 *    Called from: org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:189)
 */
@SuppressWarnings("serial")
public class DmcTypeNameContainerTestREFSET extends DmcTypeNameContainerTestREF implements Serializable {
    
    Set<NameContainerTestDMO> value;
    
    public DmcTypeNameContainerTestREFSET(){
        value = null;
    }
    
    public DmcTypeNameContainerTestREFSET(DmcAttributeInfo ai){
        super(ai);
        initValue();
    }
    
    void initValue(){
        if (attrInfo.valueType == ValueTypeEnum.HASHSET)
            value = new HashSet<NameContainerTestDMO>();
        else
            value = new TreeSet<NameContainerTestDMO>();
    }
    
    public DmcTypeNameContainerTestREFSET getNew(){
        return(new DmcTypeNameContainerTestREFSET(attrInfo));
    }
    
    @Override
    public DmcAttribute<NameContainerTestDMO> cloneIt(){
        DmcTypeNameContainerTestREFSET rc = getNew();
        for(NameContainerTestDMO val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    public NameContainerTestDMO add(Object v) throws DmcValueException {
        NameContainerTestDMO rc = typeCheck(v);
        if (value == null)
            initValue();
        value.add(rc);
        return(rc);
    }
    
    public NameContainerTestDMO del(Object v){
        NameContainerTestDMO rc = null;
        try {
            rc = typeCheck(v);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
        }
        if (value.contains(rc))
            value.remove(rc);
        else;
            rc = null;
        return(rc);
    }
    
    public Iterator<NameContainerTestDMO> getMV(){
        return(value.iterator());
    }
    
    public int getMVSize(){
        return(value.size());
    }
    
    public boolean contains(Object v){
        boolean rc = false;
        try {
            NameContainerTestDMO val = typeCheck(v);
            rc = value.contains(val);
        } catch (DmcValueException e) {
        }
        return(rc);
    }
    
}


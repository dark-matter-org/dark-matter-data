package org.dmd.dmt.shared.generated.types;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.NameContainerTestDMO;    // DmcType import
/**
 * The DmcTypeNameContainerTestREFMV provides storage for a multi-valued NameContainerTest
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1773)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:199)
 */
@SuppressWarnings("serial")
public class DmcTypeNameContainerTestREFMV extends DmcTypeNameContainerTestREF implements Serializable {
    
    ArrayList<NameContainerTestDMO> value;
    
    public DmcTypeNameContainerTestREFMV(){
    
    }
    
    public DmcTypeNameContainerTestREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
    @Override
    public DmcTypeNameContainerTestREFMV getNew(){
        return(new DmcTypeNameContainerTestREFMV(attrInfo));
    }
    
    @Override
    public DmcAttribute<NameContainerTestDMO> cloneIt(){
        DmcTypeNameContainerTestREFMV rc = getNew();
        for(NameContainerTestDMO val: value)
        try {
            rc.add(val);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("typeCheck() should never fail here!",e));
        }
        return(rc);
    }
    
    @Override
    public NameContainerTestDMO add(Object v) throws DmcValueException {
        NameContainerTestDMO rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<NameContainerTestDMO>();
        value.add(rc);
        return(rc);
    }
    
    @Override
    public NameContainerTestDMO del(Object v){
        NameContainerTestDMO rc = null;
        try {
            rc = typeCheck(v);
        } catch (DmcValueException e) {
            throw(new IllegalStateException("Incompatible type passed to del():" + getName(),e));
        }
        if (value.contains(rc))
            value.remove(rc);
        else
            rc = null;
        return(rc);
    }
    
    @Override
    public Iterator<NameContainerTestDMO> getMV(){
        ArrayList<NameContainerTestDMO> clone = new ArrayList<NameContainerTestDMO>(value);
        return(clone.iterator());
    }
    
    public ArrayList<NameContainerTestDMO> getMVCopy(){
        ArrayList<NameContainerTestDMO> clone = new ArrayList<NameContainerTestDMO>(value);
        return(clone);
    }
    
    @Override
    public int getMVSize(){
        if (value == null)
            return(0);
        return(value.size());
    }
    
    @Override
    public NameContainerTestDMO getMVnth(int i){
        return(value.get(i));
    }
    
    @Override
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


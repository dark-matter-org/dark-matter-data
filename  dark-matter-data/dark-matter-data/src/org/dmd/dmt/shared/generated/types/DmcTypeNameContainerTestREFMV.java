package org.dmd.dmt.shared.generated.types;

import java.util.ArrayList;
import java.util.Iterator;
import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmt.shared.generated.dmo.NameContainerTestDMO;    // primitive import
/**
 * The DmcTypeNameContainerTestREFMV provides storage for a multi-valued NameContainerTest
 * <P>
 * This code was auto-generated and shouldn't be altered manually!
 * Generated from:  org.dmd.dms.util.GenUtility.dumpMVType(GenUtility.java:1490)
 *    Called from:  org.dmd.dms.util.DmoTypeFormatter.dumpNormalREFType(DmoTypeFormatter.java:243)
 */
@SuppressWarnings("serial")
public class DmcTypeNameContainerTestREFMV extends DmcTypeNameContainerTestREF {
    
    ArrayList<NameContainerTestDMO> value;
    
    public DmcTypeNameContainerTestREFMV(){
    
    }
    
    public DmcTypeNameContainerTestREFMV(DmcAttributeInfo ai){
        super(ai);
    }
    
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
    
    public NameContainerTestDMO add(Object v) throws DmcValueException {
        NameContainerTestDMO rc = typeCheck(v);
        if (value == null)
            value = new ArrayList<NameContainerTestDMO>();
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
    
    public NameContainerTestDMO getMVnth(int i){
        return(value.get(i));
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


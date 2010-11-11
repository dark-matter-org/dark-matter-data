package org.dmd.features.extgwt.generated.dmw;

import java.util.*;
import org.dmd.dmc.*;
import org.dmd.dms.*;

// import 1
import org.dmd.features.extgwt.extended.MvcMenu;

// import 8
import org.dmd.features.extgwt.extended.MvcMenu;
// import 9
import org.dmd.features.extgwt.generated.dmo.MvcSubMenuDMO;

public class MvcSubMenuDMW extends MvcMenu implements DmcNamedObjectIF {

    private MvcSubMenuDMO mycore;

    public MvcSubMenuDMW() {
        super(new MvcSubMenuDMO(), org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcSubMenu);
        mycore = (MvcSubMenuDMO) core;
        mycore.setContainer(this);
    }

    public MvcSubMenuDMW(MvcSubMenuDMO obj) {
        super(obj, org.dmd.features.extgwt.generated.ExtgwtSchemaAG._MvcSubMenu);
        mycore = (MvcSubMenuDMO) core;
        mycore.setContainer(this);
    }

    protected MvcSubMenuDMW(MvcSubMenuDMO obj, ClassDefinition cd) {
        super(obj,cd);
        mycore = (MvcSubMenuDMO) core;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected ArrayList getAuxDataHolder() {
        return(new ArrayList<org.dmd.features.extgwt.extended.MvcSubMenu>());
    }

    public String getObjectName(){
        return(mycore.getName());
    }

    public boolean equals(Object obj){
        if (obj instanceof MvcSubMenuDMW){
            return( getObjectName().equals( ((MvcSubMenuDMW) obj).getObjectName()) );
        }
        return(false);
    }

    public String getDisplayLabel(){
        return(mycore.getDisplayLabel());
    }

    /**
     * Sets displayLabel to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setDisplayLabel(Object value) throws DmcValueException {
        mycore.setDisplayLabel(value);
    }

    /**
     * Removes the displayLabel attribute value.
     */
    public void remDisplayLabel(){
        mycore.remDisplayLabel();
    }

    public String getName(){
        return(mycore.getName());
    }

    /**
     * Sets name to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    public void setName(Object value) throws DmcValueException {
        mycore.setName(value);
    }

    /**
     * Removes the name attribute value.
     */
    public void remName(){
        mycore.remName();
    }

    /**
     * @return An Iterator of MvcMenuDMO objects.
     */
    @SuppressWarnings("unchecked")
    public Iterator<MvcMenu> getAddToMenu(){
        DmcAttribute attr = mycore.get(MvcSubMenuDMO._addToMenu);
        if (attr == null)
            return(null);
        
        ArrayList<MvcMenu> refs = (ArrayList<MvcMenu>) attr.getAuxData();
        
        if (refs == null)
            return(null);
        
        return(refs.iterator());
    }

    /**
     * Adds another addToMenu value.
     * @param value A value compatible with MvcMenu
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addAddToMenu(MvcMenu value) throws DmcValueException {
        DmcAttribute attr = mycore.addAddToMenu(value.getDmcObject());
        ArrayList<MvcMenu> refs = (ArrayList<MvcMenu>) attr.getAuxData();
        
        if (refs == null){
            refs = new ArrayList<MvcMenu>();
            attr.setAuxData(refs);
        }
        refs.add(value);
        return(attr);
    }

    /**
     * Deletes a addToMenu value.
     * @param value The MvcMenu to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public void delAddToMenu(MvcMenu value){
        DmcAttribute attr = mycore.delAddToMenu(value);
        if (attr == null)
            return;
        
        attr.del(value.getDmcObject());
        
        ArrayList<MvcMenu> refs = (ArrayList<MvcMenu>) attr.getAuxData();
        
        if (refs != null){
            refs.remove(value);
        }
    }

    /**
     * Removes the addToMenu attribute value.
     */
    public void remAddToMenu(){
        mycore.remAddToMenu();
    }


}

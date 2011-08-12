//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.features.extgwt.client;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.extjs.gxt.ui.client.core.FastMap;
import com.extjs.gxt.ui.client.core.FastSet;
import com.extjs.gxt.ui.client.data.ChangeEvent;
import com.extjs.gxt.ui.client.data.ChangeEventSource;
import com.extjs.gxt.ui.client.data.ChangeEventSupport;
import com.extjs.gxt.ui.client.data.ChangeListener;
import com.extjs.gxt.ui.client.data.Model;
import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.data.PropertyChangeEvent;
import com.extjs.gxt.ui.client.util.Util;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeChangeListenerIF;
import org.dmd.dmc.DmcContainerIF;
import org.dmd.dmc.DmcListenerManagerIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dmc.types.Modifier;
import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;
import org.dmd.dmp.shared.generated.dmo.DmpDMSAG;
import org.dmd.dms.generated.dmo.MetaDMSAG;
import org.dmd.dms.generated.types.DmcTypeModifierMV;

/**
 * The DmoExtGWTWrapperBase provides a common base class for auto generated Dark Matter
 * Wrapper (DMW) objects that allow Dark MAtter Objects (DMOs) to be used ExtGWT data
 * models.
 * @param <DMO> 
 */
public class DmoExtGWTWrapperBase<DMO extends DmcObject> implements Model, ModelData, DmcContainerIF {
	
	// The Dark Matter Object we're wrapping
	protected DMO core;
	
	protected transient ChangeEventSupport changeEventSupport;
	
	// A flag that can be used to indicate that an object has been deleted.
	boolean deleted;

	public DmoExtGWTWrapperBase(){
		deleted = false;
	}

	@SuppressWarnings("unchecked")
	protected DmoExtGWTWrapperBase(DmcObject obj){
		core = (DMO) obj;
	}
	
	/**
	 * Sets the object's deleted flag to true.
	 */
	public void setDeleted(){
		deleted = true;
		fireUpdateEvent();
	}
	
	/**
	 * @return The object's deleted flag.
	 */
	public boolean getDeleted(){
		return(deleted);
	}
	
	public void wrap(DMO obj){
		core = obj;
	}
	
	public DMO getDmcObject(){
		return(core);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <X> X get(String property) {
		DmcAttribute attr = core.get(property);
		if (attr == null)
			return(null);
		return (X) (attr.getSV());
	}
	
	public String toOIF(){
		if (core != null)
			return(core.toOIF());
		return("");
	}

	public String toOIF(int padding){
		if (core != null)
			return(core.toOIF(padding));
		return("");
	}
	
	public void setModifier(DmcTypeModifierMV mods){
		core.setModifier(mods);
	}
	
	public DmcTypeModifier getModifier(){
		return(core.getModifier());
	}
	
	public void applyModifier(DmcTypeModifier mods) throws DmcValueExceptionSet, DmcValueException{
		core.applyModifier(mods);
		Iterator<Modifier> it = mods.getMV();
		while(it.hasNext()){
			Modifier mod = it.next();
			// We only notify of changes to single valued attributes currently, since that's
			// all that's supported in GXT's model
			if (mod.getAttribute().getSV() != null){
				notifyPropertyChanged(mod.getAttributeName(), mod.getAttribute().getSV().toString(), "");
			}
		}
		fireUpdateEvent();
	}
	
	public void applyModifierFromEvent(DMPEventDMO event) throws DmcValueExceptionSet, DmcValueException{
		DmcTypeModifier mods = (DmcTypeModifier) event.get(MetaDMSAG.__modify);
		if (mods != null)
			core.applyModifier(mods);
	}
	
	/**
	 * This is a convenience function to allow notification that something has changed
	 * on this object. This is required because we don't actually use the set() mechanisms
	 * provided by the Model framework.
	 */
	protected void fireUpdateEvent(){
		notify(new ChangeEvent(ChangeEventSource.Update, this));
	}

	////////////////////////////////////////////////////////////////////////////////
	// Model implementation
	
	@Override
	public void addChangeListener(ChangeListener... listener) {
		if (changeEventSupport == null)
			changeEventSupport = new ChangeEventSupport();
		
	    changeEventSupport.addChangeListener(listener);
	}

	@Override
	public void notify(ChangeEvent event) {
		if (changeEventSupport != null)
			changeEventSupport.notify(event);
	}

	@Override
	public void removeChangeListener(ChangeListener... listener) {
		if (changeEventSupport != null)
			changeEventSupport.removeChangeListener(listener);
	}

	@Override
	public void removeChangeListeners() {
		if (changeEventSupport != null)
			changeEventSupport.removeChangeListeners();
	}

	@Override
	public void setSilent(boolean silent) {
		if (changeEventSupport != null)
			changeEventSupport.setSilent(silent);
	}
	
	////////////////////////////////////////////////////////////////////////////////
	// Other event methods supported in BaseModel, but not defined in the Model
	// interface
	
	public void addChangeListener(List<ChangeListener> listeners) {
		for (ChangeListener listener : listeners) {
			changeEventSupport.addChangeListener(listener);
	    }
	}

	public boolean isSilent() {
		return changeEventSupport.isSilent();
	}

	protected void fireEvent(int type) {
		notify(new ChangeEvent(type, this));
	}

	protected void fireEvent(int type, Model item) {
		notify(new ChangeEvent(type, this, item));
	}

	protected void notifyPropertyChanged(String name, Object value, Object oldValue) {
		if (!Util.equalWithNull(value, oldValue)) {
			notify(new PropertyChangeEvent(Update, this, name, oldValue, value));
		}
	}

	////////////////////////////////////////////////////////////////////////////////
	// ModelData implementation
	
	@SuppressWarnings("unchecked")
	@Override
	public Map<String, Object> getProperties() {
	    Map<String, Object> newMap = new FastMap<Object>();
	    if (core.getAttributes() != null) {
	    	for(DmcAttribute attr: core.getAttributes().values()){
	    		newMap.put(attr.getName(), attr);
	    	}
//	      newMap.putAll(core.getAttributes());
	    }
	    return newMap;
	}

	@Override
	public Collection<String> getPropertyNames() {
	    Set<String> set = new FastSet();
	    if (core.getAttributes() != null) {
//	    	set.addAll(core.getAttributes().keySet());
		    set.addAll(core.getAttributeNames(true));
	    }
	    return set;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <X> X remove(String property) {
		return (X) (core.rem(property));
	}

	@Override
	public <X> X set(String property, X value) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setDmcObject(DmcObject obj) {
		core = (DMO) obj;
		obj.setContainer(this);
	}

//	@Override
//	public void addAttributeChangeListener(DmcAttributeChangeListenerIF listener) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public DmcListenerManagerIF getListenerManager() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void removeAttributeChangeListener(
//			DmcAttributeChangeListenerIF listener) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void setListenerManager(DmcListenerManagerIF manager) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void updateObjectAdd(String an, Object existing, Object newvalue) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void updateObjectDel(String an, Object existing, Object value) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void updateObjectRem(String an, Object existing) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void updateObjectSet(String an, Object existing, Object newvalue) {
//		// TODO Auto-generated method stub
//		
//	}

	////////////////////////////////////////////////////////////////////////////////

}

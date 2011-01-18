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
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.extjs.gxt.ui.client.core.FastMap;
import com.extjs.gxt.ui.client.core.FastSet;
import com.extjs.gxt.ui.client.data.ChangeEvent;
import com.extjs.gxt.ui.client.data.ChangeEventSupport;
import com.extjs.gxt.ui.client.data.ChangeListener;
import com.extjs.gxt.ui.client.data.Model;
import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.data.PropertyChangeEvent;
import com.extjs.gxt.ui.client.util.Util;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcObject;

/**
 * The DmoExtGWTWrapperBase provides a common base class for auto generated Dark Matter
 * Wrapper (DMW) objects that allow Dark MAtter Objects (DMOs) to be used ExtGWT data
 * models.
 * @param <DMO> 
 */
abstract public class DmoExtGWTWrapperBase<DMO extends DmcObject> implements Model, ModelData {
	
	// The Dark Matter Object we're wrapping
	protected DMO core;
	
	protected transient ChangeEventSupport changeEventSupport;

	public DmoExtGWTWrapperBase(){
		
	}

	@SuppressWarnings("unchecked")
	protected DmoExtGWTWrapperBase(DmcObject obj){
		core = (DMO) obj;
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

	////////////////////////////////////////////////////////////////////////////////
	// Model implementation
	
	@Override
	public void addChangeListener(ChangeListener... listener) {
	    changeEventSupport.addChangeListener(listener);
	}

	@Override
	public void notify(ChangeEvent event) {
		changeEventSupport.notify(event);
	}

	@Override
	public void removeChangeListener(ChangeListener... listener) {
		changeEventSupport.removeChangeListener(listener);
	}

	@Override
	public void removeChangeListeners() {
		changeEventSupport.removeChangeListeners();
	}

	@Override
	public void setSilent(boolean silent) {
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
	
	@Override
	public Map<String, Object> getProperties() {
	    Map<String, Object> newMap = new FastMap<Object>();
	    if (core.getAttributes() != null) {
	      newMap.putAll(core.getAttributes());
	    }
	    return newMap;
	}

	@Override
	public Collection<String> getPropertyNames() {
	    Set<String> set = new FastSet();
	    if (core.getAttributes() != null) {
	      set.addAll(core.getAttributes().keySet());
	    }
	    return set;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <X> X remove(String property) {
		return (X) (core.getAttributes().remove(property));
	}

	@Override
	public <X> X set(String property, X value) {
		// TODO Auto-generated method stub
		return null;
	}

	////////////////////////////////////////////////////////////////////////////////

}

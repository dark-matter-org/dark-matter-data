package org.dmd.mvw.client.gxt.dmw;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcContainer;
import org.dmd.dmc.DmcContainerIF;
import org.dmd.dmc.DmcObject;
import org.dmd.dmc.DmcValueException;
import org.dmd.dmc.DmcValueExceptionSet;
import org.dmd.dmc.types.DmcTypeModifier;
import org.dmd.dmc.types.Modifier;
import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;
import org.dmd.dms.generated.dmo.MetaDMSAG;

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

/**
 * The GxtWrapper provides a mapping from Dark Matter Objects to the ModelData interface
 * required to interwork with GXT's grid and list mechanisms. 
 */
public class GxtWrapper extends DmcContainer implements Model, ModelData, DmcContainerIF {
	
	protected transient ChangeEventSupport changeEventSupport;
	
	// In some cases, you may need to add additional information to the wrapper that
	// doesn't come directly from the DMO. These additional values are stored here.
	private HashMap<String,Object>	additionalValues;
	
	protected GxtWrapper(){
		additionalValues = null;
	}

	protected GxtWrapper(DmcObject obj){
		super(obj);
		additionalValues = null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public <X> X get(String property) {
		DmcAttribute attr = core.get(property);
		if (attr == null){
			// It's not in the DMO, it may be in our additionalValues
			if (additionalValues == null)
				return(null);
			return (X) (additionalValues.get(property));
		}
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
		fireUpdateEvent();
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
	    }
	    return newMap;
	}

	@Override
	public Collection<String> getPropertyNames() {
	    Set<String> set = new FastSet();
	    if (core.getAttributes() != null) {
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
		throw(new IllegalStateException("The set() method on GxtWrapper is NOT supported. Use setAdditional() to sett additional non-DMO data on a GxtWrapper."));
	}
	
	@SuppressWarnings("unchecked")
	public <X> X setAdditional(String property, X value){
		X rc = null;
		if (additionalValues == null)
			additionalValues = new HashMap<String, Object>();
		rc = (X) additionalValues.get(property);
		additionalValues.put(property, value);
		fireUpdateEvent();
		return(rc);
	}

	@Override
	public void setDmcObject(DmcObject obj) {
		core = obj;
		obj.setContainer(this);
	}

}

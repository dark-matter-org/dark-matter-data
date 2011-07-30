package org.dmd.dmc.presentation;

import java.util.ArrayList;
import java.util.HashMap;

import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.presentation.DmcChangeListenerIF;
import org.dmd.dmc.presentation.DmcPresentationIF;
import org.dmd.dmc.presentation.DmcPresentationTrackerIF;
import org.dmd.dmc.presentation.DmcReadyListenerIF;

/**
 * The Tracker implements the DmcPresentationTrackerIF interface and can be used to track
 * the readiness and change status of one or more generated form bindings (that result from
 * FormBindingDefinitions in Model View Whatever).
 * <p />
 * Simply set a tracker on your generated form bindings and then use components similar to
 * the GxtCancel or GxtApply buttons (org.dmd.mvw.client.gxtforms.implementation) to
 * allow users to submit changes or cancel any changes they've made.
 */
public class Tracker implements DmcPresentationTrackerIF {
	
	HashMap<Integer, DmcPresentationIF> presenters;
	
	HashMap<Integer, DmcPresentationIF>	ready;
	HashMap<Integer, DmcPresentationIF>	notReady;
	HashMap<Integer, DmcPresentationIF>	changed;
	
	ArrayList<DmcReadyListenerIF>		readyListeners;
	ArrayList<DmcChangeListenerIF>		changeListeners;
	
	public Tracker(){
		presenters 		= new HashMap<Integer, DmcPresentationIF>();
		ready 			= new HashMap<Integer, DmcPresentationIF>();
		notReady 		= new HashMap<Integer, DmcPresentationIF>();
		changed			= new HashMap<Integer, DmcPresentationIF>();
		readyListeners 	= new ArrayList<DmcReadyListenerIF>();
		changeListeners = new ArrayList<DmcChangeListenerIF>();
	}

	@Override
	public void addReadyListener(DmcReadyListenerIF listener) {
		readyListeners.add(listener);
	}

	@Override
	public void addChangeListener(DmcChangeListenerIF listener) {
		changeListeners.add(listener);
	}

	@Override
	public void isNotReady(DmcPresentationIF dpi) {
		System.out.println(dpi.getAdapter().getAttributeInfo().name + " is NOT ready");

		ready.remove(dpi.getAdapter().getAttributeInfo().id);
		changed.remove(dpi.getAdapter().getAttributeInfo().id);
		notReady.put(dpi.getAdapter().getAttributeInfo().id, dpi);
		
		for(DmcReadyListenerIF listener: readyListeners)
			listener.isReady((notReady.size() == 0) && (changed.size() > 0));
		
		for(DmcChangeListenerIF listener: changeListeners)
			listener.isChanged(changed.size() > 0);
	}

	@Override
	public void isReady(DmcPresentationIF dpi) {
		System.out.println(dpi.getAdapter().getAttributeInfo().name + " is ready");
		
		notReady.remove(dpi.getAdapter().getAttributeInfo().id);
		ready.put(dpi.getAdapter().getAttributeInfo().id, dpi);
		
		if (dpi.valueChanged()){
			System.out.println("value has changed");
			changed.put(dpi.getAdapter().getAttributeInfo().id, dpi);
		}
		else{
			System.out.println("value has NOT changed");
			changed.remove(dpi.getAdapter().getAttributeInfo().id);
		}
		
		System.out.println("not ready size = " + notReady.size());
		System.out.println("changed size   = " + changed.size());
		
		for(DmcReadyListenerIF listener: readyListeners)
			listener.isReady((notReady.size() == 0) && (changed.size() > 0));
		
		for(DmcChangeListenerIF listener: changeListeners)
			listener.isChanged(changed.size() > 0);
	}

	@Override
	public void startTracking() {
		for(DmcPresentationIF p: presenters.values()){
			if (p.isReady())
				ready.put(p.getAdapter().getAttributeInfo().id, p);
			else
				notReady.put(p.getAdapter().getAttributeInfo().id, p);
		}
		
		System.out.println("not ready size = " + notReady.size());
		
		for(DmcReadyListenerIF listener: readyListeners)
			listener.isReady((notReady.size() == 0) && (changed.size() > 0));
		
		for(DmcChangeListenerIF listener: changeListeners)
			listener.isChanged(changed.size() > 0);
	}

	@Override
	public void track(DmcPresentationIF dpi) {
		presenters.put(dpi.getAdapter().getAttributeInfo().id, dpi);
		dpi.setTracker(this);
	}

	@Override
	public void reset() {
		ready.clear();
		notReady.clear();
		changed.clear();
		for(DmcPresentationIF p: presenters.values()){
			p.reset();
			if (p.isReady())
				ready.put(p.getAdapter().getAttributeInfo().id, p);
			else
				notReady.put(p.getAdapter().getAttributeInfo().id, p);			
		}
		
		for(DmcReadyListenerIF listener: readyListeners)
			listener.isReady((notReady.size() == 0) && (changed.size() > 0));

		for(DmcChangeListenerIF listener: changeListeners)
			listener.isChanged(changed.size() > 0);
	}

	@Override
	public DmcPresentationIF getPresentation(DmcAttributeInfo ai) {
		return(presenters.get(ai.id));
	}

}

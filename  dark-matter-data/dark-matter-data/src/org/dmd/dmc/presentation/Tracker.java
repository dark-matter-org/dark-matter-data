package org.dmd.dmc.presentation;

import java.util.ArrayList;
import java.util.HashMap;

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
	
	int	uniqueID;
	
	HashMap<Integer, DmcPresentationIF> presenters;
	
	HashMap<Integer, DmcPresentationIF>	ready;
	HashMap<Integer, DmcPresentationIF>	notReady;
	HashMap<Integer, DmcPresentationIF>	changed;
	
	ArrayList<DmcReadyListenerIF>		readyListeners;
	ArrayList<DmcChangeListenerIF>		changeListeners;
	
	public Tracker(){
		uniqueID		= 0;
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

		ready.remove(dpi.getID());
		notReady.put(dpi.getID(), dpi);
		
		if (dpi.valueChanged()){
			if (changed.get(dpi.getID()) == null)
				changed.put(dpi.getID(), dpi);
		}
		else{
			changed.remove(dpi.getID());			
		}
		
		for(DmcReadyListenerIF listener: readyListeners)
			listener.isReady((notReady.size() == 0) && (changed.size() > 0));
		
		for(DmcChangeListenerIF listener: changeListeners)
			listener.isChanged(changed.size() > 0);
	}

	@Override
	public void isReady(DmcPresentationIF dpi) {
		System.out.println(dpi.getAdapter().getAttributeInfo().name + " is ready");
		
		notReady.remove(dpi.getID());
		ready.put(dpi.getID(), dpi);
		
		if (dpi.valueChanged()){
			System.out.println("Tracker: value has changed " + dpi.getAdapter().getAttributeInfo().name);
			changed.put(dpi.getID(), dpi);
		}
		else{
			System.out.println("Tracker: value has NOT changed " + dpi.getAdapter().getAttributeInfo().name);
			changed.remove(dpi.getID());
		}
		
		System.out.println("Tracker: not ready size = " + notReady.size());
		System.out.println("Tracker: changed size   = " + changed.size());
		
		for(DmcReadyListenerIF listener: readyListeners)
			listener.isReady((notReady.size() == 0) && (changed.size() > 0));
		
		for(DmcChangeListenerIF listener: changeListeners)
			listener.isChanged(changed.size() > 0);
	}

	@Override
	public void startTracking() {
		for(DmcPresentationIF p: presenters.values()){
			if (p.isReady())
				ready.put(p.getID(), p);
			else
				notReady.put(p.getID(), p);
		}
		
		System.out.println("not ready size = " + notReady.size());
		
		for(DmcReadyListenerIF listener: readyListeners)
			listener.isReady((notReady.size() == 0) && (changed.size() > 0));
		
		for(DmcChangeListenerIF listener: changeListeners)
			listener.isChanged(changed.size() > 0);
	}

	@Override
	public void track(DmcPresentationIF dpi) {
		// Set the ID on the presenter before trying to use its ID!
		dpi.setTracker(this, uniqueID++);
		
		presenters.put(dpi.getID(), dpi);
	}

	@Override
	public void reset() {
		ready.clear();
		notReady.clear();
		changed.clear();
		for(DmcPresentationIF p: presenters.values()){
			p.resetToExisting();
			if (p.isReady())
				ready.put(p.getID(), p);
			else
				notReady.put(p.getID(), p);			
		}
		
		for(DmcReadyListenerIF listener: readyListeners)
			listener.isReady((notReady.size() == 0) && (changed.size() > 0));

		for(DmcChangeListenerIF listener: changeListeners)
			listener.isChanged(changed.size() > 0);
	}

//	@Override
//	public DmcPresentationIF getPresentation(DmcAttributeInfo ai) {
//		return(presenters.get(ai.id));
//	}

}

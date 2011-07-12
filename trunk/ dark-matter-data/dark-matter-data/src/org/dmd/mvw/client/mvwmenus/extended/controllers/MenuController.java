package org.dmd.mvw.client.mvwmenus.extended.controllers;

import java.util.TreeMap;

import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;
import org.dmd.mvw.client.mvwmenus.base.Action;
import org.dmd.mvw.client.mvwmenus.generated.mvw.controllers.MenuControllerBaseImpl;

public class MenuController extends MenuControllerBaseImpl {
	
	TreeMap<String,Action>	actions;	

	public MenuController(MvwRunContextIF rc) {
		super(rc);
		actions = new TreeMap<String, Action>();
	}

	public void addAction(Action action){
		if (actions.get(action.getName()) != null)
			throw(new IllegalStateException("Duplicate action added to MenuController: " + action.getName()));
		actions.put(action.getName(), action);
	}
}

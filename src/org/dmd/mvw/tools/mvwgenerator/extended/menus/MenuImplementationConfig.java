package org.dmd.mvw.tools.mvwgenerator.extended.menus;

import java.util.TreeMap;

import org.dmd.dmc.types.CamelCaseName;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.MenuElementDefinitionDMW;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.MenuImplementationConfigDMW;
import org.dmd.mvw.tools.mvwgenerator.generated.types.MenuElementTypeAndComment;
import org.dmd.util.exceptions.ResultException;

public class MenuImplementationConfig extends MenuImplementationConfigDMW {
	
	boolean initialized;
	
	TreeMap<String,MenuElementTypeAndComment>	menubarTypes;
	
	TreeMap<String,MenuElementTypeAndComment>	submenuTypes;
	
	TreeMap<String,MenuElementTypeAndComment>	menuItemTypes;
	
	TreeMap<String,MenuElementTypeAndComment>	separatorTypes;
	
	public MenuImplementationConfig(){
		initialized = false;
	}
	
	void initialize(){
		if (!initialized){
			initialized 	= true;
			menubarTypes 	= new TreeMap<String, MenuElementTypeAndComment>();
			submenuTypes 	= new TreeMap<String, MenuElementTypeAndComment>();
			menuItemTypes 	= new TreeMap<String, MenuElementTypeAndComment>();
			separatorTypes	= new TreeMap<String, MenuElementTypeAndComment>();
			
			menubarTypes.put(getDefaultMenuBar().getType(), getDefaultMenuBar());
			
			if (getAlternateMenuBarHasValue()){
				for(MenuElementTypeAndComment mtac: getAlternateMenuBarIterable()){
					menubarTypes.put(mtac.getType(),mtac);
				}
			}
			
			submenuTypes.put(getDefaultSubMenu().getType(), getDefaultSubMenu());
			
			if (getAlternateSubMenuHasValue()){
				for(MenuElementTypeAndComment mtac: getAlternateSubMenuIterable()){
					submenuTypes.put(mtac.getType(),mtac);
				}
			}
			
			menuItemTypes.put(getDefaultMenuItem().getType(), getDefaultMenuItem());
			
			if (getAlternateMenuItemHasValue()){
				for(MenuElementTypeAndComment mtac: getAlternateMenuItemIterable()){
					menuItemTypes.put(mtac.getType(),mtac);
				}
			}
			
			separatorTypes.put(getDefaultSeparator().getType(), getDefaultSeparator());
						
		}
	}
	
	public void validateImplementations(TreeMap<CamelCaseName, MenuElementDefinitionDMW> menuElements) throws ResultException {
		initialize();
		
		ResultException errors = null;
		
		for(MenuElementDefinitionDMW def: menuElements.values()){
			if (def instanceof MenuBar){
				if (def.getUseImpl() == null)
					def.setUseImpl(getDefaultMenuBar().getType());
				else if (menubarTypes.get(def.getUseImpl()) == null){
					if (errors == null)
						errors = new ResultException();
					errors.addError("Invalid implementation (useImpl) for MenuBar: " + def.getUseImpl());
					errors.result.lastResult().fileName(def.getFile());
					errors.result.lastResult().lineNumber(def.getLineNumber());
				}
			}
			else if (def instanceof MenuItem){
				if (def.getUseImpl() == null)
					def.setUseImpl(getDefaultMenuItem().getType());
				else if (menuItemTypes.get(def.getUseImpl()) == null){
					if (errors == null)
						errors = new ResultException();
					errors.addError("Invalid implementation (useImpl) for MenuItem: " + def.getUseImpl());
					errors.result.lastResult().fileName(def.getFile());
					errors.result.lastResult().lineNumber(def.getLineNumber());
				}
			}
			else if (def instanceof SubMenu){
				if (def.getUseImpl() == null)
					def.setUseImpl(getDefaultSubMenu().getType());
				else if (submenuTypes.get(def.getUseImpl()) == null){
					if (errors == null)
						errors = new ResultException();
					errors.addError("Invalid implementation (useImpl) for SubMenu: " + def.getUseImpl());
					errors.result.lastResult().fileName(def.getFile());
					errors.result.lastResult().lineNumber(def.getLineNumber());
				}
			}
			else if (def instanceof Separator){
				if (def.getUseImpl() == null)
					def.setUseImpl(getDefaultSeparator().getType());
				else if (separatorTypes.get(def.getUseImpl()) == null){
					if (errors == null)
						errors = new ResultException();
					errors.addError("Invalid implementation (useImpl) for Separator: " + def.getUseImpl());
					errors.result.lastResult().fileName(def.getFile());
					errors.result.lastResult().lineNumber(def.getLineNumber());
				}
			}
			
		}
		
		if (errors != null)
			throw(errors);
	}
	
}

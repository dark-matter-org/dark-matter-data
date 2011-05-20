package org.dmd.mvw.tools.mvwgenerator.extended;

import java.util.ArrayList;
import java.util.Iterator;

import org.dmd.dms.util.GenUtility;
import org.dmd.mvw.tools.mvwgenerator.generated.dmw.ModuleDMW;

public class Module extends ModuleDMW {

	ArrayList<RunContextItem> runContextItems;
	
	public Module(){
		runContextItems = new ArrayList<RunContextItem>();
	}
	
	public void addRunContextItem(RunContextItem rci){
		runContextItems.add(rci);
	}
	
	public String getContextName(){
		if (runContextItems.size() == 0)
			return("");
		else{
			String capped = GenUtility.capTheName(getModuleName().getNameString());
			return(capped + "RunContextIF");
		}	
	}
	
	public String getContextImport(){
		if (runContextItems.size() == 0)
			return("");
		else{
			String capped = GenUtility.capTheName(getModuleName().getNameString());
			return(getGenPackage() + ".generated.mvw." + capped + "RunContextIF");
		}	
	}
	
	public int contextItemCount(){
		return(runContextItems.size());
	}
	
	public Iterator<RunContextItem>	getItems(){
		return(runContextItems.iterator());
	}
	
}

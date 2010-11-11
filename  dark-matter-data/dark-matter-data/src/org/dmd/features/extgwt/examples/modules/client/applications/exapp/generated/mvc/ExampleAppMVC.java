package org.dmd.features.extgwt.examples.modules.client.applications.exapp.generated.mvc;

import java.util.TreeMap;
import com.extjs.gxt.ui.client.mvc.Dispatcher;
import com.extjs.gxt.ui.client.event.EventType;
import com.extjs.gxt.ui.client.Registry;
import org.dmd.features.extgwt.client.ApplicationIF;
import org.dmd.features.extgwt.client.extended.MenuController;
import org.dmd.features.extgwt.client.extended.ServerEventController;
import org.dmd.features.extgwt.examples.modules.client.applications.exapp.extended.ExampleAppController;
import org.dmd.features.extgwt.examples.modules.client.features.exsecurity.extended.SecurityController;
import org.dmd.features.extgwt.examples.modules.client.features.exmodule1.extended.Mod1Controller;

/**
 * The ExampleApp provides a way of checking the MVC code generation
 * framework.
 * <P>
 * This code was auto-generated by the mvcgenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.features.extgwt.extended.MvcApplication.initCodeGenInfo(MvcApplication.java:58)
 */
public class ExampleAppMVC implements ApplicationIF {

    TreeMap<String,EventType> events;

    public ExampleAppMVC(){
        // Register ourselves as the global application
        Registry.register("application",this);
        
        events = new TreeMap<String,EventType>();
        
        initEvents();
        initControllers();
        
    }

    public EventType getEvent(String name){
        return(events.get(name));
    }

    private void initEvents(){
        events.put("common.init", AppEventsMVC.CommonInit);
        events.put("common.loggedIn", AppEventsMVC.CommonLoggedIn);
        events.put("common.performLogin", AppEventsMVC.CommonPerformLogin);
        events.put("mod1.dataReady", AppEventsMVC.Mod1DataReady);
        events.put("mvc.init", AppEventsMVC.MvcInit);
        events.put("mvc.init.eventFramework", AppEventsMVC.MvcInitEventFramework);
        events.put("mvc.objectSelectionChanged", AppEventsMVC.MvcObjectSelectionChanged);
        events.put("mvc.registerMenus", AppEventsMVC.MvcRegisterMenus);
    }

    private void initControllers(){
        Dispatcher dispatcher = Dispatcher.get();
        dispatcher.addController(new MenuController());
        dispatcher.addController(new ServerEventController());
        dispatcher.addController(new ExampleAppController());
        dispatcher.addController(new SecurityController());
        dispatcher.addController(new Mod1Controller());
    }

}

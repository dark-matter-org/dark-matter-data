package org.dmd.features.extgwt.examples.generated.mvc;

import com.extjs.gxt.ui.client.mvc.Controller;
import com.extjs.gxt.ui.client.mvc.AppEvent;
import com.extjs.gxt.ui.client.event.EventType;
import com.extjs.gxt.ui.client.Registry;

abstract public class AppViewMVC extends Controller {


    protected AppViewMVC(){
    }

    abstract void handleMailLogin(EventType event);

    abstract void handleAppInit(EventType event);

}

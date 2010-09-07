package org.dmd.features.extgwt.examples.generated.mvc;

import com.extjs.gxt.ui.client.mvc.Controller;
import com.extjs.gxt.ui.client.mvc.AppEvent;
import com.extjs.gxt.ui.client.event.EventType;
import com.extjs.gxt.ui.client.Registry;

abstract public class AppControllerMVC extends Controller {

    protected AppViewMVC appView;

    protected AppControllerMVC(){
        registerEventTypes(AppEventsMVC.AppError);
        registerEventTypes(AppEventsMVC.AppInit);
        registerEventTypes(AppEventsMVC.MailLogin);
    }

    public void handleEvent(AppEvent event) {
    EventType type = event.getType();
        if (type == AppEventsMVC.AppError) {
            handleAppError(event);
        }
        else if (type == AppEventsMVC.AppInit) {
            appView.handleAppInit(event);
        }
        else if (type == AppEventsMVC.MailLogin) {
            appView.handleMailLogin(event);
        }
    }
}

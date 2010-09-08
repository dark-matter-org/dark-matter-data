package org.dmd.features.extgwt.examples.generated.mvc;

import com.extjs.gxt.ui.client.mvc.Controller;
import com.extjs.gxt.ui.client.mvc.AppEvent;
import com.extjs.gxt.ui.client.event.EventType;
import com.extjs.gxt.ui.client.Registry;
import java.lang.String;

abstract public class AppControllerMVC extends Controller {

    // Resources
    protected String mailService;
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
            forwardToView(appView,event);
        }
        else if (type == AppEventsMVC.MailLogin) {
            forwardToView(appView,event);
        }
    }

    abstract protected void handleAppError(AppEvent event);

    protected String getMailService(){
        if (mailService == null)
            mailService = (String) Registry.get("mail.service");
        return(mailService);
    }

}

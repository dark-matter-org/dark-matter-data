package org.dmd.features.extgwt.examples.generated.mvc;

import com.extjs.gxt.ui.client.mvc.Controller;
import com.extjs.gxt.ui.client.mvc.View;
import com.extjs.gxt.ui.client.mvc.AppEvent;
import com.extjs.gxt.ui.client.Registry;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.Viewport;

abstract public class AppViewMVC extends View {

    // Resources
    protected Viewport appViewViewport;
    protected ContentPanel appViewWestpanel;
    protected LayoutContainer appViewCenter;

    protected AppViewMVC(Controller controller){
        super(controller);
    }

    abstract protected void initialize();

    abstract void handleMailLogin(AppEvent event);

    abstract void handleAppInit(AppEvent event);

    protected Viewport getAppViewViewport(){
        if (appViewViewport == null)
            appViewViewport = (Viewport) Registry.get("app.view.viewport");
        return(appViewViewport);
    }

    abstract void addAppViewViewportToRegistry(Viewport item);

    protected ContentPanel getAppViewWestpanel(){
        if (appViewWestpanel == null)
            appViewWestpanel = (ContentPanel) Registry.get("app.view.westpanel");
        return(appViewWestpanel);
    }

    abstract void addAppViewWestpanelToRegistry(ContentPanel item);

    protected LayoutContainer getAppViewCenter(){
        if (appViewCenter == null)
            appViewCenter = (LayoutContainer) Registry.get("app.view.center");
        return(appViewCenter);
    }

    abstract void addAppViewCenterToRegistry(LayoutContainer item);

}

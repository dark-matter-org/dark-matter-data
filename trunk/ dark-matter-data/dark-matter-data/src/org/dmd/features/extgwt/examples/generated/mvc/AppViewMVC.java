package org.dmd.features.extgwt.examples.generated.mvc;

import com.extjs.gxt.ui.client.mvc.Controller;
import com.extjs.gxt.ui.client.mvc.View;
import com.extjs.gxt.ui.client.mvc.AppEvent;
import com.extjs.gxt.ui.client.Registry;
import com.extjs.gxt.ui.client.widget.ContentPanel;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import com.extjs.gxt.ui.client.widget.Viewport;

/**
 * The AppView has a dual responsibility, when it is first created by the
 * AppController, it creates and displays the Login dialog. Once login is
 * complete it emits the app.init event. Now, because the AppController is
 * the first controller registered with the dispatcher, it forwards the
 * app.init event to AppView and the AppView then initializes the overall
 * container for the application.
 * <P>
 * This code was auto-generated by the mvcgenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.features.extgwt.extended.MvcView.initCodeGenInfo(MvcView.java:57)
 */
abstract public class AppViewMVC extends View {

    // Resources
    protected Viewport appViewViewport;
    protected ContentPanel appViewWestpanel;
    protected LayoutContainer appViewCenter;

    protected AppViewMVC(Controller controller){
        super(controller);
    }

    abstract protected void initialize();

    /**
     * The derived View class must overload this method to handle the mail.login event.
     * <P>
     * The login event is injected when the system is ready to start the login
     * process. It isn't emitted by any controller/view.
     */
    abstract protected void handleMailLogin(AppEvent event);

    /**
     * The derived View class must overload this method to handle the app.init event.
     * <P>
     * The init event is generated once the user has logged in to the system.
     */
    abstract protected void handleAppInit(AppEvent event);

    /**
     * @return The overall viewport of the application which is configured with a
     * border layout.
     */
    protected Viewport getAppViewViewport(){
        if (appViewViewport == null)
            appViewViewport = (Viewport) Registry.get("app.view.viewport");
        return(appViewViewport);
    }

    abstract void addAppViewViewportToRegistry(Viewport item);

    /**
     * @return The west portion of the overall border layout that forms the main
     * window.
     */
    protected ContentPanel getAppViewWestpanel(){
        if (appViewWestpanel == null)
            appViewWestpanel = (ContentPanel) Registry.get("app.view.westpanel");
        return(appViewWestpanel);
    }

    abstract void addAppViewWestpanelToRegistry(ContentPanel item);

    /**
     * @return The center portion of the overall border layout configured with a
     * fit layout.
     */
    protected LayoutContainer getAppViewCenter(){
        if (appViewCenter == null)
            appViewCenter = (LayoutContainer) Registry.get("app.view.center");
        return(appViewCenter);
    }

    abstract void addAppViewCenterToRegistry(LayoutContainer item);

}

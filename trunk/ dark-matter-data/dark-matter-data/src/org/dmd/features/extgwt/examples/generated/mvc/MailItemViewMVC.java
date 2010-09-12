package org.dmd.features.extgwt.examples.generated.mvc;

import com.extjs.gxt.ui.client.mvc.Controller;
import com.extjs.gxt.ui.client.mvc.View;
import com.extjs.gxt.ui.client.mvc.AppEvent;
import com.extjs.gxt.ui.client.event.EventType;
import com.extjs.gxt.ui.client.Registry;
import com.extjs.gxt.ui.client.widget.LayoutContainer;
import java.util.List;
import org.dmd.features.extgwt.examples.generated.dmo.FolderDMO;
import org.dmd.features.extgwt.examples.generated.dmo.MailItemDMO;

/**
 * null
 * <P>
 * This code was auto-generated by the mvcgenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.features.extgwt.extended.MvcView.initCodeGenInfo(MvcView.java:66)
 */
abstract public class MailItemViewMVC extends View {

    // Resources
    protected LayoutContainer appViewCenter;

    protected MailItemViewMVC(Controller controller){
        super(controller);
    }

    abstract protected void initialize();

    @SuppressWarnings("unchecked")
	public void handleEvent(AppEvent event) {
        EventType type = event.getType();
        if (type == AppEventsMVC.AppNavmail) {
            handleAppNavmailEvent(event,(FolderDMO)event.getData());
        }
        else if (type == AppEventsMVC.MailViewItems) {
            handleMailViewItemsEvent(event,(FolderDMO)event.getData());
        }
        else if (type == AppEventsMVC.MailViewItem) {
            handleMailViewItemEvent(event,(List<MailItemDMO>)event.getData());
        }
    }


    /**
     * The derived class must overload this method to handle the app.navmail event.
     * <P>
     * The navmail event is sent when we successfully retrieve a mail folder from
     * the server.
     */
    abstract protected void handleAppNavmailEvent(AppEvent event,FolderDMO data);

    /**
     * The derived class must overload this method to handle the mail.viewItems event.
     * <P>
     * The viewItems event is sent when the user selects a mail folder in the
     * folder tree.
     */
    abstract protected void handleMailViewItemsEvent(AppEvent event,FolderDMO data);

    /**
     * The derived class must overload this method to handle the mail.viewItem event.
     * <P>
     * The viewItem event id generated by the MailItemViews display panel when
     * the user selects a mail item from the list.
     */
    abstract protected void handleMailViewItemEvent(AppEvent event,List<MailItemDMO> data);

    /**
     * @return The center portion of the overall border layout configured with a
     * fit layout.
     */
    protected LayoutContainer getAppViewCenter(){
        if (appViewCenter == null)
            appViewCenter = (LayoutContainer) Registry.get("app.view.center");
        return(appViewCenter);
    }

}

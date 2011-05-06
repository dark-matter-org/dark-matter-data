package org.dmd.features.extgwt.examples.modules.client.features.exsecurity.generated.mvc;

import com.extjs.gxt.ui.client.mvc.Controller;
import com.extjs.gxt.ui.client.mvc.AppEvent;
import com.extjs.gxt.ui.client.event.EventType;
import com.extjs.gxt.ui.client.Registry;
import org.dmd.features.extgwt.client.extended.ServerEventController;
import org.dmd.features.extgwt.client.ServerEventHandlerIF;
import org.dmd.dmp.shared.generated.dmo.DMPEventDMO;
import org.dmd.dmp.shared.generated.enums.DMPEventTypeEnum;
import org.dmd.features.extgwt.examples.modules.shared.features.security.generated.dmo.UserDMO;
import com.extjs.gxt.ui.client.mvc.View;
import org.dmd.features.extgwt.examples.modules.client.features.exsecurity.extended.SecurityController;

/**
 * The SecurityView does blah, blah, blah
 * <P>
 * This code was auto-generated by the mvcgenerator utility and shouldn't be altered manually!
 * Generated from: org.dmd.features.extgwt.extended.MvcView.initCodeGenInfo(MvcView.java:100)
 */
abstract public class SecurityViewMVC extends View implements ServerEventHandlerIF {

    protected SecurityController myController;

    // Resources
    private ServerEventController mvcServerEventController;

    protected SecurityViewMVC(Controller controller){
        super(controller);
        myController = (SecurityController) controller;
    }

    /**
     * Derived classes must override this method to perform their initialization behaviour.
     */
    abstract protected void initialize();

    public void handleEvent(AppEvent event) {
        EventType type = event.getType();
        if (type == myController.CommonInit) {
            handleCommonInitEvent(event);
        }
        else if (type == myController.MvcInitEventFramework) {
            handleMvcInitEventFrameworkEvent(event);
        }
    }


    /**
     * The derived class must overload this method to handle the common.init event.
     * <P>
     * The init event is generated once the user has logged in to the system.
     */
    abstract protected void handleCommonInitEvent(AppEvent event);

    /**
     * When we receive this event, we add ourselves to handle various server events.
     */
    protected void handleMvcInitEventFrameworkEvent(AppEvent event){
        getMvcServerEventController().addEventHandler(this,"User");
    }

    /**
     * @return Handle to the server event controller.
     */
    public ServerEventController getMvcServerEventController(){
        if (mvcServerEventController == null)
            mvcServerEventController = (ServerEventController) Registry.get("mvc.serverEventController");
        return(mvcServerEventController);
    }

    public void handleServerEvent(DMPEventDMO event) {
        if (event.getSourceObjectClass().equals("User"))
            handleSecUserUpdate(event.getEventTypeDMP(),(UserDMO)event.getSourceObject());
    }

    /**
     * The derived class must overload this method to handle the sec.userUpdate event.
     * <P>
     * The sec.userUpdate event is relayed to us when server events are generated
     * for User objects.
     */
    abstract protected void handleSecUserUpdate(DMPEventTypeEnum etype, UserDMO obj);

}

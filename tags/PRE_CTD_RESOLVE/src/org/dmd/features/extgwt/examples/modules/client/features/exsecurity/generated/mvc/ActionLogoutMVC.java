package org.dmd.features.extgwt.examples.modules.client.features.exsecurity.generated.mvc;

import org.dmd.features.extgwt.examples.modules.client.features.exsecurity.extended.SecurityController;
import org.dmd.features.extgwt.client.util.Action;

abstract public class ActionLogoutMVC extends Action {

    protected SecurityController myController;


    protected ActionLogoutMVC(SecurityControllerMVC controller){
        super("action.logout");
        myController = (SecurityController)controller;
    }

}

package org.dmd.mvw.client.mvwmenus.generated.mvw.controllers;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from: org.dmd.mvw.tools.mvwgenerator.extended.Component.getImports(Component.java:78)
import com.google.gwt.event.shared.EventBus;                         // Used by eventBus
import org.dmd.mvw.client.mvw.generated.mvw.MvwRunContextIF;         // Mvw run context

abstract public class MenuControllerBaseImpl {

    protected final EventBus eventBus;

    public MenuControllerBaseImpl(MvwRunContextIF rc){
        eventBus = ((MvwRunContextIF)rc).getEventBus();



    }

}


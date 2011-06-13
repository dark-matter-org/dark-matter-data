package org.dmd.mvw.client.mvw.generated.mvw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:76)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatModuleRunContextInterface(RunContextFormatter.java:33)
import com.google.gwt.activity.shared.ActivityManager;          // Used by activityManager
import com.google.gwt.event.shared.EventBus;                    // Used by eventBus
import com.google.gwt.place.shared.PlaceController;             // Used by placeController
import com.google.gwt.place.shared.PlaceHistoryHandler;         // Used by historyHandler
import org.dmd.mvw.client.mvw.MvwActivityMapper;                // Used by activityMapper


public interface MvwRunContextIF {

    public EventBus getEventBus();
    public PlaceController getPlaceController();
    public MvwActivityMapper getActivityMapper();
    public ActivityManager getActivityManager();
    public PlaceHistoryHandler getHistoryHandler();
}


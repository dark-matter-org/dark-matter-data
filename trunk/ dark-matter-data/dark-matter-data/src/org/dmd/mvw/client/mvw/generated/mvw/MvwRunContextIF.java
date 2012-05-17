package org.dmd.mvw.client.mvw.generated.mvw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatModuleRunContextInterface(RunContextFormatter.java:37)
import com.google.gwt.activity.shared.ActivityManager;          // Used by activityManager
import com.google.gwt.event.shared.EventBus;                    // Used by eventBus
import com.google.gwt.place.shared.PlaceHistoryHandler;         // Used by historyHandler
import org.dmd.mvw.client.mvw.MvwActivityMapper;                // Used by activityMapper
import org.dmd.mvw.client.mvw.MvwAsyncPlaceController;          // Used by placeController


// Generated from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatModuleRunContextInterface(RunContextFormatter.java:40)
public interface MvwRunContextIF {

    public EventBus                getEventBus();
    public MvwAsyncPlaceController getPlaceController();
    public MvwActivityMapper       getActivityMapper();
    public ActivityManager         getActivityManager();
    public PlaceHistoryHandler     getHistoryHandler();
}


package org.dmd.mvw.client.mvw.generated.mvw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatModuleRunContextInterface(RunContextFormatter.java:37)
import com.google.gwt.activity.shared.ActivityManager;          // Used by activityManager - (RunContextItem.java:290)
import com.google.gwt.event.shared.EventBus;                    // Used by eventBus - (RunContextItem.java:290)
import com.google.gwt.place.shared.PlaceHistoryHandler;         // Used by historyHandler - (RunContextItem.java:290)
import org.dmd.mvw.client.mvw.MvwActivityMapper;                // Used by activityMapper - (RunContextItem.java:290)
import org.dmd.mvw.client.mvw.MvwAsyncErrorHandlerIF;           // Used by centralAsyncErrorHandler - (RunContextItem.java:290)
import org.dmd.mvw.client.mvw.MvwAsyncPlaceController;          // Used by placeController - (RunContextItem.java:290)


// Generated from: org.dmd.mvw.tools.mvwgenerator.util.RunContextFormatter.formatModuleRunContextInterface(RunContextFormatter.java:40)
public interface MvwRunContextIF {

    public EventBus                getEventBus();
    public MvwAsyncPlaceController getPlaceController();
    public MvwActivityMapper       getActivityMapper();
    public ActivityManager         getActivityManager();
    public PlaceHistoryHandler     getHistoryHandler();
    public MvwAsyncErrorHandlerIF  getCentralAsyncErrorHandler();
}


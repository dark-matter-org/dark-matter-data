package org.dmd.mvw.tools.mvwgenerator.util;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.mvw.tools.mvwgenerator.extended.WebApplication;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.exceptions.DebugInfo;

/**
 * The WebApplicationFormatter creates the base implementation for a web application
 * that can be instantiated with a particular run context.
 */
public class WebApplicationFormatter {

	public static void formatApplication(String outdir, WebApplication app) throws IOException{
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, app.getAppName() + "BaseImpl.java");

        out.write("package " + app.getDefinedInModule().getGenPackage() + ".generated.mvw;\n\n");
        
        out.write("import com.google.gwt.user.client.ui.Widget;\n");
        out.write("import com.google.gwt.user.client.ui.RootPanel;\n");
        out.write("import com.google.gwt.core.client.GWT;\n");
        out.write("import com.google.gwt.user.client.ui.AcceptsOneWidget;\n");
        out.write("import " + app.getDefaultPlace().getPlaceImport() + ";\n");

        out.write("\n");

        out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("abstract public class " + app.getAppName() + "BaseImpl {\n\n");
        
        out.write("    protected " + app.getAppName() + "RunContext rc;\n\n");
        
        out.write("    /**\n");
        out.write("     * Use this constructor if you need to use an environment specific run context.\n");
        out.write("     */\n");
        out.write("    protected " + app.getAppName() + "BaseImpl(" + app.getAppName() + "RunContext r){\n");
        out.write("        rc = r;\n");
        out.write("        initialize();\n");
        out.write("    }\n\n");
        
        out.write("    /**\n");
        out.write("     * Use this constructor if you want to use the default run context.\n");
        out.write("     */\n");
        out.write("    protected " + app.getAppName() + "BaseImpl(){\n");
        out.write("        rc = GWT.create(" + app.getAppName() + "RunContext.class);\n");
        out.write("        initialize();\n");
        out.write("    }\n\n");
        
        out.write("    public void run(){\n");
        out.write("        rc.getActivityManager().setDisplay(getInitialWidget());\n");
        out.write("        rc.getHistoryHandler().register(rc.getPlaceController(), rc.getEventBus(), getDefaultPlace());\n");
        out.write("        RootPanel.get().add((Widget) getInitialWidget());\n");
        out.write("        rc.getHistoryHandler().handleCurrentHistory();\n");
        out.write("    }\n\n");

        out.write("    abstract public void initialize();\n\n");
        
        out.write("    abstract public " + app.getDefaultPlace().getPlaceName() + " getDefaultPlace();\n\n");
        
        out.write("    abstract public AcceptsOneWidget getInitialWidget();\n\n");
        
        out.write("\n");
        out.write("\n");
        
        out.write("}\n\n");
        out.close();
	}
}

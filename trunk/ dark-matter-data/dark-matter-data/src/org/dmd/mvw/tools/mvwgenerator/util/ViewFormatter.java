package org.dmd.mvw.tools.mvwgenerator.util;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;
import org.dmd.mvw.tools.mvwgenerator.extended.View;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.exceptions.DebugInfo;

public class ViewFormatter {

	static public void formatViewInterface(String outdir, View view) throws IOException{
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, view.getViewName().getNameString() + ".java");

//        ImportManager.reset();
//        view.getInterfaceImports();

        out.write("package " + view.getDefinedInModule().getGenPackage() + ".generated.mvw.views;\n\n");
        
        out.write(view.getInterfaceImports() + "\n");
        
        out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public interface " + view.getViewName() + " {\n\n");
        
        out.write("    public interface " + view.getViewName() + "Presenter {\n\n");
        
        out.write(view.getPresenterMethods());
        
        out.write("    }\n\n");
        
//        out.write("    public void setPresenter(" + view.getViewName() + "Presenter presenter);\n\n");
        
        out.write(view.getViewMethods());
        
        out.write("}\n\n");
        
        out.close();
	}
	
	static public void formatViewBaseImpl(String outdir, View view) throws IOException{
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, view.getViewName().getNameString() + "BaseImpl.java");
		
        out.write("package " + view.getDefinedInModule().getGenPackage() + ".generated.mvw.views;\n\n");

        out.write(view.getViewImplImports() + "\n");
        
        String otherInterfaces = "";
        
        if (view.isWidget())
        	otherInterfaces = ", IsWidget";
        
        out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("abstract public class " + view.getViewName() + "BaseImpl implements " + view.getViewName() + otherInterfaces + " {\n\n");
        
        out.write("    protected " + view.getViewName() + "Presenter presenter;\n\n");
        
        if (view.getUsesRunContextItemHasValue()){
        	for(RunContextItem rci: view.getUsesRunContextItemIterable()){
        		out.write(rci.getImplVariable());
        	}
        	out.write("\n");
        }
        
        if (view.getUsesRunContextItemHasValue()){
            out.write("    protected " + view.getViewName() + "BaseImpl(" + view.getViewName() + "Presenter p, MvwRunContextIF rc){\n");
            out.write("        presenter = p;\n\n");
            if (view.getUsesRunContextItemHasValue()){
            	for(RunContextItem rci: view.getUsesRunContextItemIterable()){
            		out.write(rci.getImplVariableAssignment());
            	}
            }
            out.write("    }\n\n");
        }
        else{
            out.write("    protected " + view.getViewName() + "BaseImpl(" + view.getViewName() + "Presenter p){\n");
            out.write("        presenter = p;\n");
            out.write("    }\n\n");
        }
        
//        out.write("    public void setPresenter(" + view.getViewName() + "Presenter p){\n");
//        out.write("        presenter = p;\n");
//        out.write("    }\n");
//        out.write("    \n");
        
        out.write(view.getViewImplMethods());
        
        out.write("}\n\n");
        
        out.close();
	}
}

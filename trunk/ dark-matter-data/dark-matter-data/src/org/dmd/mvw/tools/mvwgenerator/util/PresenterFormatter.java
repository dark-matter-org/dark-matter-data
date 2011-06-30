package org.dmd.mvw.tools.mvwgenerator.util;

import java.io.BufferedWriter;
import java.io.IOException;

import org.dmd.mvw.tools.mvwgenerator.extended.Presenter;
import org.dmd.mvw.tools.mvwgenerator.extended.RunContextItem;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.exceptions.DebugInfo;

public class PresenterFormatter {

	static public void formatPresenterBaseImpl(String outdir, Presenter presenter) throws IOException {
		
		
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, presenter.getPresenterName() + "BaseImpl.java");

        out.write("package " + presenter.getDefinedInModule().getGenPackage() + ".generated.mvw.presenters;\n\n");
        
        out.write(presenter.getImports());
        
        out.write("\n");
        
        
		out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("abstract public class " + presenter.getPresenterName() + "BaseImpl" + presenter.getPresenterInterfaces() + " {\n\n");
        
    	boolean onDemand = false;
    	for(RunContextItem rci: presenter.getUsesRunContextItemIterable()){
    		out.write(rci.getImplVariable());
    		if (rci.isCreateOnDemand())
    			onDemand = true;
    	}
    	
    	if (onDemand){
        	out.write("\n");
        	out.write("    MvwRunContextIF runcontext;\n");
    	}
    	
    	out.write("\n");
    	
    	out.write(presenter.getCommsContants());
    	
    	///////////////////////////////////////////////////////////////////////
    	// Constructor

    	out.write("    public " + presenter.getPresenterName() + "BaseImpl(MvwRunContextIF rc){\n");

    	for(RunContextItem rci: presenter.getUsesRunContextItemIterable()){
    		out.write(rci.getImplVariableAssignment());
    	}

    	if (onDemand){
        	out.write("\n");
        	out.write("        runcontext = rc;\n");
    	}
    		
        out.write("    }\n\n");
        
    	///////////////////////////////////////////////////////////////////////

        // On demand accessors
    	for(RunContextItem rci: presenter.getUsesRunContextItemIterable()){
    		out.write(rci.getOnDemandMethod());
    	}

    	// Fire event methods
    	out.write(presenter.getFireMethods());
    	
    	// Communications methods
    	out.write(presenter.getCommsMethods());
        
        out.write(presenter.getAbstractMethods());
        
        out.write("}\n\n");
        
        out.close();
	}

}

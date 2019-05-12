package org.dmd.templates.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.TreeMap;

import org.dmd.dms.ClassDefinition;
import org.dmd.templates.server.generated.dmw.ContainsIterableDMW;
import org.dmd.templates.server.generated.dmw.TextualArtifactDMW;
import org.dmd.templates.server.util.StaticAccessInfo;
import org.dmd.templates.shared.generated.dmo.TextualArtifactDMO;
import org.dmd.templates.shared.generated.enums.CardinalityEnum;
import org.dmd.templates.shared.generated.types.Contains;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.codegen.MemberManager;
import org.dmd.util.exceptions.DebugInfo;


public class TextualArtifact extends TextualArtifactDMW {

    public TextualArtifact(){
        super();
    }

    public TextualArtifact(TextualArtifactDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }

    public void generateTextualArtifactClass(String outdir) throws IOException {
    	ImportManager 				imports 		= new ImportManager();
    	MemberManager				members			= new MemberManager();
    	TreeMap<String,StaticAccessInfo>	staticSections	= new TreeMap<String,StaticAccessInfo>();
    	
    	getStaticAccessToStructure(staticSections);
    	
    	imports.addImport("org.dmd.templates.server.util.FormattedArtifactIF", "Common interface for gathering formatted output");
    	imports.addImport("java.io.IOException", "Thrown by formatting");
    	
    	for(StaticAccessInfo info: staticSections.values()){
    		imports.addImport(info.getClassImport(), "To access static Section: " + info.getName());
    	}
    	
		ContainsIterableDMW it = getContainsIterable();
		while(it.hasNext()){
			Contains c = it.getNext();
			ContainedElement ce = (ContainedElement) c.getElement().getObject().getContainer();
			
			if (ce instanceof Section){
				Section contained = (Section)ce;
				imports.addImport(contained.getClassImport(), "Is a contained section");
				if (c.getOccurences() == CardinalityEnum.ONE){
					members.addMember(contained.getName().getNameString(), "_" + contained.getName(), "A single instance of " + contained.getName());
				}
				else if (c.getOccurences() == CardinalityEnum.MANY){
					imports.addImport("java.util.ArrayList", "Because we have multiple instances of some Sections");
					imports.addImport("java.util.Iterator", "Because we have multiple instances of some Sections");
					members.addMember("ArrayList<" + contained.getName().getNameString() + ">", "_" + contained.getName(), "new ArrayList<" + contained.getName().getNameString() + ">()", "Multiple instances of " + contained.getName());
				}
				else{
					members.addMember(contained.getName().getNameString(), "_" + contained.getName(), "A single static instance of " + contained.getName());
				}
			}
		}

        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, getName().getNameString() + ".java");
        
        out.write("package " + getDefinedInTdlModule().getPackage() + ".generated.dmtdl;\n\n");

        out.write(imports.getFormattedImports()  + "\n\n");
        
        out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(getFormatHint());
        out.write("    public class " + getName() + " {\n\n");
        out.write("\n");
        out.write(members.getFormattedMembers() + "\n");
        out.write("\n");

        out.write("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("    public " + getName() + "(){\n");
        out.write(getStaticSectionConstruction());
        out.write("    }\n\n");
        out.write("");
        
        out.write(getFormatFunction());
        
		it = getContainsIterable();
		while(it.hasNext()){
			Contains c = it.getNext();
			ContainedElement ce = (ContainedElement) c.getElement().getObject().getContainer();
			
			if (ce instanceof Section){
				Section contained = (Section)ce;
				// We don't get the static functions for the sections, instead, we insert only the 
				// static access functions to access sections that can have content added
				out.write(contained.getAccessFunctions(this.getName().getNameString(), c.getOccurences(), false));
			}
		}
		
    	for(StaticAccessInfo info: staticSections.values()){
    		out.write(info.getAccessFunctions());
    	}
    	        
        out.write("}");

        out.close();
    }
    
    /**
     * Creates the static instantiations of the starts with, ends with and static contained Sections.
     * @return
     */
    String getStaticSectionConstruction(){
    	StringBuffer sb = new StringBuffer();
    	
		ContainsIterableDMW it = getContainsIterable();
		while(it.hasNext()){
			Contains c = it.getNext();
			ContainedElement ce = (ContainedElement) c.getElement().getObject().getContainer();
			
			if (ce instanceof Section){
				Section contained = (Section)ce;
				if (c.getOccurences() == CardinalityEnum.STATIC){
		    		sb.append("        _" + contained.getName() + " = new " + contained.getName() + "(); // Static Section\n");
				}
			}
		}
    	
    	return(sb.toString());
    }

    String getFormatFunction(){
    	StringBuffer sb = new StringBuffer();
    	
    	sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
    	sb.append("    public void format(FormattedArtifactIF artifact) throws IOException {\n");
    	
		ContainsIterableDMW it = getContainsIterable();
		while(it.hasNext()){
			Contains c = it.getNext();
			ContainedElement ce = (ContainedElement) c.getElement().getObject().getContainer();
			
			if (ce instanceof Section){
				Section contained = (Section)ce;
		    	sb.append("\n");
		    	
		    	if (c.getOccurences() == CardinalityEnum.ONE){
		    		sb.append("        if (_" + contained.getName() + " != null)\n");
		    		sb.append("            _" + contained.getName() + ".format(artifact);\n");
		    	}
		    	else if (c.getOccurences() == CardinalityEnum.MANY){
		    		sb.append("        if (_" + contained.getName() + " != null){\n");
		        	sb.append("            for(" + contained.getName() + " entry: _" + contained.getName() + "){\n");
		    		sb.append("                entry.format(artifact);\n");
		        	sb.append("            }\n");
		        	sb.append("        }\n");
		    	}
		    	else{
		    		sb.append("        _" + contained.getName() + ".format(artifact);\n");
		    	}
			}
		}
		
    	sb.append("\n");
    	sb.append("    }\n\n");
    	
    	return(sb.toString());
    }

    String getFormatHint(){
    	StringBuffer hint = new StringBuffer();
    	
    	hint.append("    /**\n");
    	hint.append("     * The structure of the " + getName() + " TextualArtifact is as follows:\n");
    	hint.append("     * \n");
    	hint.append("     * [] : many Sections\n");
    	hint.append("     * ++ : an optional Section\n");
    	hint.append("     * -- : a static Section\n");
    	hint.append("     * <- : values can be inserted\n");
    	hint.append("     * xx : extension hook can be inserted\n");
    	hint.append("     * \n");
    	hint.append("     * " + getName() + "\n");
    	
		ContainsIterableDMW it = getContainsIterable();
		while(it.hasNext()){
			Contains c = it.getNext();
			ContainedElement ce = (ContainedElement) c.getElement().getObject().getContainer();
			
			if (ce instanceof Section){
				Section contained = (Section)ce;
				contained.getFormatHint(c.getOccurences(), "  ", hint);
			}
			// Note: artifacts don't contain extension hooks!
		}
    	hint.append("     */\n");
    	
    	return(hint.toString());
    }
    
    /**
     * This method cycles over the contained elements and creates a set of member functions that
     * will allow for direct access to unbroken chains of static sections that have either values
     * that can be added or have sections beneath them with dynamic content. 
     * <p/>
     * Basically, there's no point in providing access to any section that can't be altered i.e.
     * no point in accessing the static part of the artifact, only places where you "make a difference".
     * @return the methods needed to access the appropriate sections.
     */
    void getStaticAccessToStructure(TreeMap<String,StaticAccessInfo>	sections){
//    	StringBuffer sb = new StringBuffer();
    	
    	// Key: 
//    	TreeMap<String,ArrayList<String>>	sections = new TreeMap<String, ArrayList<String>>();
//    	TreeSet<StaticAccessInfo>	sections = new TreeSet<StaticAccessInfo>();
    	
		ContainsIterableDMW it = getContainsIterable();
		while(it.hasNext()){
			Contains c = it.getNext();
			ContainedElement ce = (ContainedElement) c.getElement().getObject().getContainer();
			
			if (ce instanceof Section){
				Section contained = (Section)ce;
				contained.getStaticAccessToStructure(0, c.getOccurences(), "", sections);
			}
		}
    	
//		for(String section: sections.keySet()){
//			ArrayList<String> callPaths = sections.get(section);
//			if (callPaths.size() == 1){
//				System.out.println(section + "  --  " + callPaths.get(0));
//			}
//			else {
//				
//			}
//		}
    	
//    	return(sb.toString());
    }
    
}


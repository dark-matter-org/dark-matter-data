package org.dmd.templates.server.extended;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.DMWGenerator.dumpExtendedClass(DMWGenerator.java:276)
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.TreeMap;

import org.dmd.dms.ClassDefinition;
import org.dmd.templates.server.generated.dmw.ContainsIterableDMW;
import org.dmd.templates.server.generated.dmw.SectionDMW;
import org.dmd.templates.server.generated.dmw.ValueIterableDMW;
import org.dmd.templates.server.util.StaticAccessInfo;
import org.dmd.templates.shared.generated.dmo.SectionDMO;
import org.dmd.templates.shared.generated.enums.CardinalityEnum;
import org.dmd.templates.shared.generated.types.Contains;
import org.dmd.templates.shared.generated.types.Value;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.codegen.ImportManager;
import org.dmd.util.codegen.Manipulator;
import org.dmd.util.codegen.MemberManager;
import org.dmd.util.exceptions.DebugInfo;


public class Section extends SectionDMW {
	
	// String v1_, String v2_, String v3_
	String fastAddArgVector;
	
	// v1_, v2_, v3_
	String fastAddArgs;

    public Section(){
        super();
    }

    public Section(SectionDMO dmo, ClassDefinition cd){
        super(dmo,cd);
    }
    
    /**
     * @return the fully qualified name of the generated class for this Section
     */
    public String getClassImport(){
    	return(getDefinedInTdlModule().getPackage() + ".generated.dmtdl." + getName());
    }
    
    void getSubsectionImportsAndMembers(ImportManager imports, MemberManager members){
    	if (getStartsWith() != null){
			imports.addImport(getStartsWith().getClassImport(), "Starts with one of these");
			members.addMember(getStartsWith().getName().getNameString(), "_" + getStartsWith().getName(), "Starts with a " + getStartsWith().getName());
    	}
    	
    	if (getContainsHasValue()){
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
    			else{
    				ExtensionHook hook = (ExtensionHook) ce;
    				hook.getSectionImportsAndMembers(imports, members);
    			}
    		}
    	}
    	
    	if (getEndsWith() != null){
			imports.addImport(getEndsWith().getClassImport(), "Ends with one of these");
			members.addMember(getEndsWith().getName().getNameString(), "_" + getEndsWith().getName(), "Ends with a " + getEndsWith().getName());
    	}
    }

    public void generateSectionClass(String outdir) throws IOException {
    	ImportManager 	imports = new ImportManager();
    	MemberManager	members	= new MemberManager();
    	
    	imports.addImport("org.dmd.templates.server.util.SectionIF", "Standard interface used by Templates");
    	imports.addImport("org.dmd.templates.server.extended.Template", "The Template");
    	imports.addImport("org.dmd.templates.server.util.FormattedArtifactIF", "Common interface for gathering formatted output");
    	imports.addImport("java.io.IOException", "Thrown by formatting");
    	
    	if ((getDefinedInTdlModule().getCommentFormat() != null) && (getStartsWithText() != null)){
        	imports.addImport("org.dmd.templates.server.util.TemplateMediator", "To access commentContainer");    		
    	}
    	
        if (getValueHasValue()){
        	imports.addImport("java.util.TreeMap", "To store values");
        	members.addMember("TreeMap<String,String>", "values", "new TreeMap<String,String>()", "Required to store our values");
        }
        
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, getName().getNameString() + ".java");
        
        out.write("package " + getDefinedInTdlModule().getPackage() + ".generated.dmtdl;\n\n");
        
        getSubsectionImportsAndMembers(imports, members);
                
        out.write(imports.getFormattedImports()  + "\n\n");
        
        out.write("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write("public class " + getName() + " implements SectionIF {\n\n");
        out.write("\n");
        out.write(members.getFormattedMembers() + "\n");
        out.write("\n");
        
        ///////////////////////////////////////////////////////////////////////
        
        out.write("    public " + getName() + "(){\n");
        out.write(getStaticSectionConstruction());
        out.write("    }\n\n");
        out.write("");
        
        ///////////////////////////////////////////////////////////////////////
        
        if (getValueHasValue()){
        	ValueIterableDMW values = null;
	        // If the number of values we have is less than or equal to the number that
	        // we want in the fastAdd() method, we create a constructor that takes all
	        // of the values as parameters.
	        if (getValueSize() <= getDefinedInTdlModule().getMaxFastAddValues()){
	        	
	        	out.write("    /**\n");
	        	out.write("     * Constructs a new " + getName() + " section.\n");
	            values = getValueIterable();
	            while(values.hasNext()){
	            	Value value = values.getNext();
		        	out.write("     * @param " + value.getValueName() + "_ " + value.getDescription() + "\n");
	            }
	        	out.write("     * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
	        	out.write("     */\n");
	            out.write("    public " + getName() + "(");
	            
	            values = getValueIterable();
	            while(values.hasNext()){
	            	Value value = values.getNext();
	            	
	            	out.write("String " + value.getValueName() + "_");
	            	if (values.hasNext())
	            		out.write(", ");
	            }
	            out.write("){\n");
	            
	            out.write(getStaticSectionConstruction());

	            values = getValueIterable();
	            while(values.hasNext()){
	            	Value value = values.getNext();
	            	
	            	out.write("        if (" + value.getValueName() + "_ != null)\n");
		            out.write("            values.put(\"" + value.getValueName() + "\", " + value.getValueName() + "_);\n");
		            out.write("\n");
	            }	            
	            
	            out.write("    }\n\n");
	            out.write("");
	        }
	        
            // Create the individual set() functions for values.
            values = getValueIterable();
            while(values.hasNext()){
            	Value value = values.getNext();
            	String fn = "set" + Manipulator.capFirstChar(value.getValueName());
            	
	            out.write("    public " + getName() + " " + fn + "(String " + value.getValueName() + "_){\n");
            	out.write("        if (" + value.getValueName() + "_ != null)\n");
	            out.write("            values.put(\"" + value.getValueName() + "\", " + value.getValueName() + "_);\n");
	            out.write("        return(this);\n");
	            out.write("    }\n\n");
            }	            
	        
            out.write("    public String getValue(String name){\n");
            out.write("        String rc = values.get(name);\n");
            out.write("        if (rc == null)\n");
            out.write("            rc = \"\";\n");
            out.write("        return(rc);\n");
            out.write("    }\n\n");
	        
        }
        else{
        	// No values
            out.write("    public String getValue(String name){\n");
            out.write("        return(\"\");\n");
            out.write("    }\n\n");

        }
        
        out.write(getFormatFunction());
        
        if (getStartsWith() != null){
			out.write(getStartsWith().getAccessFunctions(this.getName().getNameString(), CardinalityEnum.STATIC, true));        	
        }
        
		ContainsIterableDMW it = getContainsIterable();
		while(it.hasNext()){
			Contains c = it.getNext();
			ContainedElement ce = (ContainedElement) c.getElement().getObject().getContainer();
			
			if (ce instanceof Section){
				Section contained = (Section)ce;
				out.write(contained.getAccessFunctions(this.getName().getNameString(), c.getOccurences(), true));
			}
			else if (ce instanceof ExtensionHook){
				ExtensionHook hook = (ExtensionHook) ce;
				out.write(hook.getExtensionFunction());
			}
		}

        if (getEndsWith() != null){
			out.write(getEndsWith().getAccessFunctions(this.getName().getNameString(), CardinalityEnum.STATIC, true));        	
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
    	
    	if (getStartsWith() != null){
    		sb.append("        _" + getStartsWith().getName() + " = new " + getStartsWith().getName() + "(); // Starts with\n");
    	}
    	
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
    	
    	if (getEndsWith() != null){
    		sb.append("        _" + getEndsWith().getName() + " = new " + getEndsWith().getName() + "(); // Ends with\n");
    	}
    	
    	return(sb.toString());
    }
    
    String getFormatFunction(){

    	StringBuffer sb = new StringBuffer();
    	
    	sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
    	sb.append("    public void format(FormattedArtifactIF artifact) throws IOException {\n");
    	
    	
    	// Starts with
    	
    	if (getStartsWith() != null){
    		sb.append("        _" + getStartsWith().getName() + ".format(artifact);\n");    		
    	}
    	
    	String loader = Manipulator.capFirstChar(getDefinedInTdlModule().getName().getNameString()) + "TemplateLoader";

    	if (getStartsWithText() != null){
    		if (getDefinedInTdlModule().getCommentFormat() != null){
    			sb.append("        TemplateMediator.commentContainer.setValue(\"comment\", \"" + getName() + " starts with text\");\n");
    			sb.append("        " + loader + "._Comment.format(TemplateMediator.commentContainer, artifact);\n");
    		}
        	sb.append("        artifact.addText(\"" + getStartsWithText().replaceAll("\\\"", "\\\\\"") + "\\n\");\n");
    	}
    	
    	String comment = "";
    	if (getDefinedInTdlModule().getCommentFormat() != null)
    		comment = ", " + loader + "._Comment";

    	sb.append("\n");
    	sb.append("        " + loader + "." + getName() + ".format(this,artifact" + comment + ");\n");

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
			else{
				ExtensionHook hook = (ExtensionHook) ce;
				sb.append(hook.getFormatFunction());
			}
		}
		
    	sb.append("\n");
    	
    	
    	// Ends with
    	if (getEndsWith() != null){
    		sb.append("        _" + getEndsWith().getName() + ".format(artifact);\n");    		
    	}
    	
    	if (getEndsWithText() != null){
        	sb.append("        artifact.addText(\"" + getEndsWithText().replaceAll("\\\"", "\\\\\"") + "\\n\");\n");
    	}
    	
    	
    	sb.append("    }\n\n");
    	
    	sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
    	sb.append("    public void format(FormattedArtifactIF artifact, Template template) throws IOException {\n");
    	sb.append("        template.format(this, artifact);\n");
    	sb.append("    }\n\n");

    	
    	return(sb.toString());
    }
    
    /**
     * Returns the access functions to be used when accessing this section
     * from the TextualArtifact or another Section.
     * @param cardinality the occurrence of this Section in the surrounding context.
     * @param staticFunctions flag to indicate if we want the static access functions at this level.
     * @return the appropriate access functions
     */
    String getAccessFunctions(String container, CardinalityEnum cardinality, boolean staticFunctions){
    	StringBuffer sb = new StringBuffer();
    	
    	if (cardinality == CardinalityEnum.ONE){
    		sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
    		sb.append("    public " + getName() + " add" + getName() + "(){\n");
        	sb.append("        if (_" + getName() + " != null)\n");
        	sb.append("            throw(new IllegalStateException(\"Multiple calls to add a " + getName() + " Section. There should only be one of these in a " + container + ".\"));\n");
        	sb.append("        _" + getName() + " = new " + getName() + "();\n");
        	sb.append("        return(_" + getName() + ");\n");
        	sb.append("    }\n\n");
        	
    		sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
    		sb.append("    public " + getName() + " get" + getName() + "(){\n");
        	sb.append("        if (_" + getName() + " == null)\n");
        	sb.append("            throw new IllegalStateException(\"The " + getName() + " Section is optional. You must add the section before you get it.\");\n");
        	sb.append("\n");
        	sb.append("        return(_" + getName() + ");\n");
        	sb.append("    }\n\n");
        	
        	if (getValueHasValue()){
        		if (getValueSize() <= getDefinedInTdlModule().getMaxFastAddValues()){
            		sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
            		sb.append("    public " + getName() + " fastAdd" + getName() + "(" + getFastAddArgVector() + "){\n");
                	sb.append("        if (_" + getName() + " != null)\n");
                	sb.append("            throw(new IllegalStateException(\"Multiple calls to add a " + getName() + " Section. There should only be one of these in a " + container + ".\"));\n");
                	sb.append("        _" + getName() + " = new " + getName() + "(" + getFastAddArgs() + ");\n");
                	sb.append("        return(_" + getName() + ");\n");
                	sb.append("    }\n\n");
        			
        		}
        	}
    	}
    	else if (cardinality == CardinalityEnum.MANY){
    		sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
    		sb.append("    public " + getName() + " add" + getName() + "(){\n");
        	sb.append("        if (_" + getName() + " == null)\n");
        	sb.append("            _" + getName() + " = new ArrayList<" + getName() + ">();\n");
        	sb.append("        " + getName() + " rc = new " + getName() + "();\n");
        	sb.append("        _" + getName() + ".add(rc);\n");
        	sb.append("        return(rc);\n");
        	sb.append("    }\n\n");
        	
    		sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
    		sb.append("    public Iterator<" + getName() + "> get" + getName() + "Set(){\n");
        	sb.append("        return(_" + getName() + ".iterator());\n");
        	sb.append("    }\n\n");

        	if (getValueHasValue()){
        		if (getValueSize() <= getDefinedInTdlModule().getMaxFastAddValues()){
            		sb.append("    // Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
            		sb.append("    public " + getName() + " fastAdd" + getName() + "(" + getFastAddArgVector() + "){\n");
                	sb.append("        if (_" + getName() + " == null)\n");
                	sb.append("            _" + getName() + " = new ArrayList<" + getName() + ">();\n");
                	sb.append("        " + getName() + " rc = new " + getName() + "(" + getFastAddArgs() + ");\n");
                	sb.append("        _" + getName() + ".add(rc);\n");
                	sb.append("        return(rc);\n");
                	sb.append("    }\n\n");
        		}
        	}
    	}
    	else {
    		if (staticFunctions){
	    		// STATIC - you can retrieve it, but it's added automatically
	    		
	    		sb.append("    public " + getName() + " get" + getName() + "(){\n");
	        	sb.append("        return(_" + getName() + ");\n");
	        	sb.append("    }\n\n");
    		}
    	}

    	return(sb.toString());
    }
    
//    public String getAddFastMethodCall(){
//    	StringBuffer sb = new StringBuffer();
//    	
//    	return(sb.toString());
//    }
    
    /**
     * @return the argument vector for a fastAdd() method e.g. String v1_, String v2_
     */
    public String getFastAddArgVector(){
    	if (fastAddArgVector == null){
    		if (getValueSize() == 0){
    			fastAddArgVector = "";
    		}
    		else{
		    	StringBuffer sb = new StringBuffer();
		    	
		    	ValueIterableDMW values = getValueIterable();
		        while(values.hasNext()){
		        	Value value = values.getNext();
		        	
		        	sb.append("String " + value.getValueName() + "_");
		        	if (values.hasNext())
		        		sb.append(", ");
		        }
	        
	        	fastAddArgVector = sb.toString();
    		}
    	}
    	return(fastAddArgVector);
    }
    
    public String getFastAddArgs(){
    	if (fastAddArgs == null){
    		if (getValueSize() == 0){
    			fastAddArgs = "";
    		}
    		else{
		    	StringBuffer sb = new StringBuffer();
		    	
		    	ValueIterableDMW values = getValueIterable();
		        while(values.hasNext()){
		        	Value value = values.getNext();
		        	
		        	sb.append(value.getValueName() + "_");
		        	if (values.hasNext())
		        		sb.append(", ");
		        }
	        
		        fastAddArgs = sb.toString();
    		}
    	}
    	
    	return(fastAddArgs);
    }
    
    /**
     * 
     * @param cardinality
     * @param indent
     * @param hint
     */
    public void getFormatHint(CardinalityEnum cardinality, String indent, StringBuffer hint){
		hint.append("     * " + indent);

		switch(cardinality){
    	case MANY:
    		hint.append("[] ");
    		break;
    	case ONE:
    		hint.append("++ ");
    		break;
    	case STATIC:
    		hint.append("-- ");
    		break;
    	}
		
		String values = "";
		if (getValueHasValue())
			values = "<-";
		hint.append(getName().getNameString() + "  " + values + "\n");
    	
    	if (getStartsWith() != null){
    		getStartsWith().getFormatHint(CardinalityEnum.STATIC, indent + "  ", hint);
    	}
    	
		ContainsIterableDMW it = getContainsIterable();
		while(it.hasNext()){
			Contains c = it.getNext();
			ContainedElement ce = (ContainedElement) c.getElement().getObject().getContainer();
			
			if (ce instanceof Section){
				Section contained = (Section)ce;
				contained.getFormatHint(c.getOccurences(), indent + "  ", hint);
			}
			else if (ce instanceof ExtensionHook){
				ExtensionHook hook = (ExtensionHook) ce;
				hook.getFormatHint(indent + "  ", hint);
			}
		}    	
    	
    	if (getEndsWith() != null){
    		getEndsWith().getFormatHint(CardinalityEnum.STATIC, indent + "  ", hint);
    	}
    }
    
    /**
     * 
     * @param depth the depth from the top level of the artifact - starts at 0
     * @param cardinality the cardinality of this section with the enclosing section
     * @param callStructure
     * @param sections
     */
    void getStaticAccessToStructure(int depth, CardinalityEnum cardinality, String callStructure, TreeMap<String,StaticAccessInfo> sections){
    	if (cardinality == CardinalityEnum.STATIC){
    		if (getValueHasValue()){
    			// We have an unbroken static access chain to the top and have values that can be set
    			StaticAccessInfo info = sections.get(getName().getNameString());
    			if (info == null){
    				info = new StaticAccessInfo(this);
    				sections.put(getName().getNameString(), info);
    			}
    			
    			if (depth == 0)
    				info.addPath("_" + getName());
    			else
    				info.addPath(callStructure + ".get" + getName() + "()");
    			
//    			ArrayList<String> callPath = sections.get(getName().getNameString());
//    			if (callPath == null){
//    				callPath = new ArrayList<String>();
//    				sections.put(getName().getNameString(), callPath);
//    			}
//    			callPath.add(callStructure + ".get" + getName() + "()");
    		}
    		
        	if (getStartsWith() != null){
        		if (depth == 0)
            		getStartsWith().getStaticAccessToStructure(depth+1, CardinalityEnum.STATIC, "_" + getName(), sections);
        		else
        			getStartsWith().getStaticAccessToStructure(depth+1, CardinalityEnum.STATIC, callStructure + ".get" + getName() + "()", sections);
        	}
        	
        	boolean nonStaticDirectlyBelowMe = false;
    		ContainsIterableDMW it = getContainsIterable();
    		while(it.hasNext()){
    			Contains c = it.getNext();
    			ContainedElement ce = (ContainedElement) c.getElement().getObject().getContainer();
    			
    			if (ce instanceof Section){
	    			Section contained = (Section)ce;
	    			if (depth == 0)
		    			contained.getStaticAccessToStructure(depth+1, c.getOccurences(), "_" + getName(), sections);
	    			else
	    				contained.getStaticAccessToStructure(depth+1, c.getOccurences(), callStructure + ".get" + getName() + "()", sections);
	    			if (c.getOccurences() != CardinalityEnum.STATIC)
	    				nonStaticDirectlyBelowMe = true;
    			}
    		} 
    		
    		if (nonStaticDirectlyBelowMe){
    			StaticAccessInfo info = sections.get(getName().getNameString());
    			if (info == null){
    				info = new StaticAccessInfo(this);
    				sections.put(getName().getNameString(), info);
    			}
    			
    			if (depth == 0)
    				info.addPath("_" + getName());
    			else
    				info.addPath(callStructure + ".get" + getName() + "()");

//    			ArrayList<String> callPath = sections.get(getName().getNameString());
//    			if (callPath == null){
//    				callPath = new ArrayList<String>();
//    				sections.put(getName().getNameString(), callPath);
//    			}
//    			callPath.add(callStructure + ".get" + getName() + "()");
    		}
        	
        	if (getEndsWith() != null){
        		if (depth == 0)
            		getEndsWith().getStaticAccessToStructure(depth+1, CardinalityEnum.STATIC, "_" + getName(), sections);
        		else
        			getEndsWith().getStaticAccessToStructure(depth+1, CardinalityEnum.STATIC, callStructure + ".get" + getName() + "()", sections);
        	}
    		
    	}
    	
    }


}


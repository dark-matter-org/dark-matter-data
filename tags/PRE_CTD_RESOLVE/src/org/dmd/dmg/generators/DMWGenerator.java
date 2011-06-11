	//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2011 dark-matter-data committers
//	---------------------------------------------------------------------------
//	This program is free software; you can redistribute it and/or modify it
//	under the terms of the GNU Lesser General Public License as published by the
//	Free Software Foundation; either version 3 of the License, or (at your
//	option) any later version.
//	This program is distributed in the hope that it will be useful, but WITHOUT
//	ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
//	FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for
//	more details.
//	You should have received a copy of the GNU Lesser General Public License along
//	with this program; if not, see <http://www.gnu.org/licenses/lgpl.html>.
//	---------------------------------------------------------------------------
package org.dmd.dmg.generators;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

import org.dmd.dmc.types.IntegerVar;
import org.dmd.dmc.types.StringName;
import org.dmd.dmg.DarkMatterGeneratorIF;
import org.dmd.dmg.generated.dmo.DmgConfigDMO;
import org.dmd.dmg.util.GeneratorUtils;
import org.dmd.dmg.util.SchemaFormatter;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.EnumDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.dms.generated.enums.WrapperTypeEnum;
import org.dmd.dms.util.GenUtility;
import org.dmd.dms.util.TypeAndAttr;
import org.dmd.util.FileUpdateManager;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;
import org.dmd.util.formatting.CodeFormatter;
import org.dmd.util.formatting.PrintfFormat;
import org.dmd.util.parsing.ConfigFinder;
import org.dmd.util.parsing.ConfigLocation;

public class DMWGenerator implements DarkMatterGeneratorIF {

	String gendir;
	String auxwdir;
	String dmwdir;
	String	fileHeader;

	ArrayList<AttributeDefinition>	allAttr;
	
	PrintStream		progress;
	
	SchemaManager	schema;
	
	SchemaFormatter	sformatter;
		
	// This is filled as a side effect of calling getImports()
	StringBuffer 	attributeInfo;

	// These are used when generating AUX classes. We set them in the getImports() method
	// so that we can generate the appropriate private set()/get() methods as required.
	boolean	anyMVAttributes;
	boolean anySVAttributes;
	boolean anyMVRefs;
	
	// Set to true if the class for which we're dumping a wrapper has any of
	// its own attributes.
	boolean			anyAttributes;

	public DMWGenerator(){
		sformatter = new SchemaFormatter();
	}
	
	
	////////////////////////////////////////////////////////////////////////////////
	// DarkMatterGeneratorIF implementation

	@Override
	public void gatherUserInput(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm) {
		// Nothing for now
	}

	@Override
	public void generateCode(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm) throws IOException, ResultException {
		gendir = loc.getConfigParentDirectory() + File.separator + "generated";
		dmwdir = gendir + File.separator + "dmw";
		auxwdir = gendir + File.separator + "auxw";
		
		schema = sm;
		
		createGenDirs();
		
		createTypeIterables(config, loc, f, sm);
		
		createWrappers(config, loc, f, sm);
		
		sformatter.setFileHeader(fileHeader);
		sformatter.setProgressStream(progress);
		SchemaDefinition sd = sm.isSchema(config.getSchemaToLoad());
		sformatter.dumpSchema(gendir, config.getGenPackage(), sd, sm);
	}

	@Override
	public void setProgressStream(PrintStream ps) {
		progress = ps;
	}
	
	@Override
	public void setFileHeader(String fh) {
		fileHeader = fh;
	}

	////////////////////////////////////////////////////////////////////////////////
	// Our functionality

	void createTypeIterables(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm) throws IOException, ResultException {
		SchemaDefinition sd = sm.isSchema(config.getSchemaToLoad());
		
		sd.dumpInfo();
		
		Iterator<ClassDefinition>	classes = sd.getClassDefList();
		if (classes != null){
			// We only generate the iterators for unnamed classes. Named classes will have their
			// Iterable generated along with the types because internal types are generated for them
			while(classes.hasNext()){
				ClassDefinition cd = classes.next();
				
				if (cd.getClassType() == ClassTypeEnum.AUXILIARY)
					continue;
				
				if (cd.getIsNamedBy() == null){
//					DebugInfo.debug("ITERABLE 1:\n" + cd.toOIF(15));
					
					String dmwImport = cd.getDmwImport();
					if (cd.getUseWrapperType() == WrapperTypeEnum.EXTENDED)
						dmwImport = cd.getDmeImport();
					
					GenUtility.dumpObjectIterable(dmwdir, sd.getDmwPackage(), cd.getDmoImport(), cd.getName().getNameString(), dmwImport, "", fileHeader, progress);
				}
			}
			
		}
		
		Iterator<TypeDefinition> types = sd.getTypeDefList();
		if (types != null){
			while(types.hasNext()){
				TypeDefinition td = types.next();
				String genericArgs = td.getGenericArgs();
				if (genericArgs == null)
					genericArgs = "";
				
				GenUtility.dumpIterable(dmwdir, sd.getDmwPackage(), td.getPrimitiveType(), td.getName().getNameString(), genericArgs, fileHeader, progress);
			}
//			DebugInfo.debug("\n\n");
		}
		
		Iterator<EnumDefinition>	enums = sd.getEnumDefList();
		if (enums != null){
			while(enums.hasNext()){
				EnumDefinition ed = enums.next();
				
				String enumPrimitive = sd.getSchemaPackage() + ".generated.enums." + ed.getName().getNameString();
				
				GenUtility.dumpIterable(dmwdir, sd.getDmwPackage(), enumPrimitive, ed.getName().getNameString(), "", fileHeader, progress);
			}
		}
	}
	
	/**
	 * Creates the output directory structure for our code.
	 */
	void createGenDirs(){
		File gdf = new File(gendir);
		if (!gdf.exists())
			gdf.mkdir();
		
		File ddf = new File(dmwdir);
		if (!ddf.exists())
			ddf.mkdir();
		
		File adf = new File(auxwdir);
		if (!adf.exists())
			adf.mkdir();
		
	}

	void createWrappers(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm) throws IOException, ResultException {
				
		SchemaDefinition sd = sm.isSchema(config.getSchemaToLoad());
		Iterator<ClassDefinition> cdefs = sd.getClassDefList();
		
		if (cdefs != null){
			while(cdefs.hasNext()){
				ClassDefinition cd = cdefs.next();
				
//				DebugInfo.debug(cd.getName().getNameString());
				
				cd.adjustJavaClass();
				
				if (cd.getDMWPackage() == null){
					ResultException ex = new ResultException();
					ex.addError("The " + cd.getDefinedIn().getName() + " schema must define the dmwPackage attribute to facilitate wrapper creation.");
					ex.result.lastResult().fileName(cd.getDefinedIn().getFile());
					throw(ex);
				}
				
				if (cd.getClassType() == ClassTypeEnum.AUXILIARY){
					dumpAUX(cd, auxwdir);
				}
				else{	
					
					if (cd.getJavaClass() == null){
						ResultException ex = new ResultException();
						ex.addError("The " + cd.getName() + " class must define the javaClass attribute to facilitate wrapper creation.");
						ex.result.lastResult().fileName(cd.getFile());
						ex.result.lastResult().lineNumber(cd.getLineNumber());
						throw(ex);
					}
					
					dumpWrapper(config, loc, f, sm, cd);
				}
			}
		}
		
		
		Iterator<TypeDefinition>	tdefs = sd.getInternalTypeDefList();
		while(tdefs.hasNext()){
			TypeDefinition td = tdefs.next();
			
			ClassDefinition cd = td.getOriginalClass();
			if (cd != null){
				dumpIterable(config, loc, f, sm, cd, sd);
			}
		}

	}
	
	void dumpIterable(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm, ClassDefinition cd, SchemaDefinition thisSchema) throws IOException {
		if (cd.getIsNamedBy() == null)
			return;
		
//		String ofn = dmwdir + File.separator + cd.getName().getNameString() + "IterableDMW.java";
		
		
//        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmwdir, cd.getName().getNameString() + "IterableDMW.java");
        
//        if (progress != null)
//        	progress.println("    Generating " + ofn);
        
        if (fileHeader != null)
        	out.write(fileHeader);
        
        String CAST = cd.getDmeClass();
        String REF 	= cd.getDmtClass();
        
        out.write("package " + cd.getDMWPackage() + ".generated.dmw;\n\n");
        
        out.write("import java.util.Iterator;\n\n");
        out.write("import org.dmd.dmw.DmwContainerIterator;\n");
        out.write("import " + cd.getDmtREFImport()+ ";\n");
        
        if (cd.getUseWrapperType() == WrapperTypeEnum.EXTENDED){
            out.write("import " + cd.getDmeImport() + ";\n");
            CAST = cd.getDmeClass();
        }
        else{
            out.write("import " + cd.getDmwImport() + ";\n");
            CAST = cd.getDmwClass();
        }
          	                
        out.write("/**\n");
        out.write(" * The " + cd.getName() + "IteratorDMW will cast from an underlying " + REF + " class to \n");
        out.write(" * the associated wrapper class: " + CAST + " when accessing object references in a wrapper context.\n");
        out.write(" * <P>\n");
        out.write(" * Generated from the " + cd.getDefinedIn().getName() + " schema at version " + cd.getDefinedIn().getVersion() + "\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated by the dmggenerator utility and shouldn't be altered manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" */\n");
        
        
        out.write("public class " + cd.getName() + "IterableDMW extends DmwContainerIterator<" + CAST + "," + REF + "> {\n");
        out.write("\n");
        out.write("    public final static " + cd.getName() + "IterableDMW emptyList = new " + cd.getName() + "IterableDMW();\n");
        out.write("\n");
        out.write("    protected " + cd.getName() + "IterableDMW(){\n");
        out.write("        super();\n");
        out.write("    }\n");
        out.write("\n");
        out.write("    public " + cd.getName() + "IterableDMW(Iterator<" + REF + "> it){\n");
        out.write("        super(it);\n");
        out.write("    }\n");
        out.write("\n");
        
        out.write("}\n\n");
        
        out.close();

	}
	
	void dumpWrapper(DmgConfigDMO config, ConfigLocation loc, ConfigFinder f, SchemaManager sm, ClassDefinition cd) throws IOException {
		attributeInfo = new StringBuffer();
		
//		String ofn = dmwdir + File.separator + cd.getName().getNameString() + "DMW.java";
		
		
//        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(dmwdir, cd.getName().getNameString() + "DMW.java");
        
//        if (progress != null)
//        	progress.println("    Generating " + ofn);
        
        if (fileHeader != null)
        	out.write(fileHeader);
        
        out.write("package " + cd.getDMWPackage() + ".generated.dmw;\n\n");
        
		allAttr = new ArrayList<AttributeDefinition>();
		StringBuffer imports = new StringBuffer();
		
		getAttributesAndImports(cd, allAttr, imports);
        
        out.write(imports.toString());
        
        String impl = "";
        
        if (cd.getIsNamedBy() != null)
        	impl = "implements DmcNamedObjectIF ";
        
        out.write("/**\n");
        CodeFormatter.dumpCodeComment(cd.getDescription(),out," * ");
        out.write(" * <P>\n");
        out.write(" * Generated from the " + cd.getDefinedIn().getName() + " schema at version " + cd.getDefinedIn().getVersion() + "\n");
        out.write(" * <P>\n");
        out.write(" * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!\n");
        out.write(" * Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
        out.write(" */\n");

        if (cd.getName().getNameString().equals("ConfigProfile"))
        	DebugInfo.debug("Here");
        
        if (cd.getDerivedFrom() == null){
        	if (cd.getClassType() == ClassTypeEnum.ABSTRACT)
            	out.write("abstract public class " + cd.getName() + "DMW extends DmwWrapper " + impl + "{\n");
        	else
        		out.write("public class " + cd.getName() + "DMW extends DmwWrapper " + impl + "{\n");
        }
        else{
        	if (cd.getDerivedFrom().getDMWPackage() != null)
        		cd.getDerivedFrom().adjustJavaClass();

            if ( cd.getDerivedFrom().getUseWrapperType() == WrapperTypeEnum.EXTENDED){
            	if (cd.getUseWrapperType() == WrapperTypeEnum.EXTENDED)
            		out.write("abstract public class " + cd.getName() + "DMW extends " + cd.getDerivedFrom().getName() + " " + impl + "{\n");
            	else{
            		if (cd.getClassType() == ClassTypeEnum.ABSTRACT)
                		out.write("abstract public class " + cd.getName() + "DMW extends " + cd.getDerivedFrom().getName() + " " + impl + "{\n");
            		else
            			out.write("public class " + cd.getName() + "DMW extends " + cd.getDerivedFrom().getName() + " " + impl + "{\n");
            	}
        	}
        	else{
        		if (cd.getClassType() == ClassTypeEnum.ABSTRACT)
        			out.write("abstract public class " + cd.getName() + "DMW extends " + cd.getDerivedFrom().getName() + "DMW " + impl + "{\n");
        		else
        			out.write("public class " + cd.getName() + "DMW extends " + cd.getDerivedFrom().getName() + "DMW " + impl + "{\n");
        	}
        		
        }
        
        out.write("\n");
        
//        if (anyAttributes){
//        	// we only bother with mycore if the object has attributes at this level
//        	out.write("    private " + cd.getName() + "DMO mycore;\n\n");
//        }

        // All dark matter wrappers have to have a standard constructor that takes no
        // arguments and constructs the appropriate DMO for the wrapper.	
        if (cd.getClassType() == ClassTypeEnum.ABSTRACT){
	        out.write("    protected " + cd.getName() + "DMW() {\n");
	        out.write("        super();\n");	       
	        out.write("    }\n\n");	 
	        
	        if (cd.getUseWrapperType() == WrapperTypeEnum.EXTENDED)
		        out.write("    abstract public " + cd.getName() + " getModificationRecorder();\n\n");
	        else
	        	out.write("    abstract public " + cd.getName() + "DMW getModificationRecorder();\n\n");

        }
        else{
        	String schemaName = GeneratorUtils.dotNameToCamelCase(cd.getDefinedIn().getName().getNameString()) + "SchemaAG";
        	String classDef = cd.getDMWPackage() + ".generated." + schemaName + "._" + cd.getName();
        	
	        out.write("    public " + cd.getName() + "DMW() {\n");
	        out.write("        super(new " + cd.getName() + "DMO(), " + classDef + ");\n");
	      
//	        if (anyAttributes){
//		        out.write("        mycore = (" + cd.getName() + "DMO) core;\n");
//		        out.write("        mycore.setContainer(this);\n");
//	        }
	        out.write("    }\n\n");
	        
	        
	        
	        // Modification recorder constructor
	        out.write("    public " + cd.getName() + "DMW(DmcTypeModifierMV mods) {\n");
	        out.write("        super(new " + cd.getName() + "DMO(mods), " + classDef + ");\n");
	      
//	        if (anyAttributes){
//		        out.write("        mycore = (" + cd.getName() + "DMO) core;\n");
//		        out.write("        mycore.setContainer(this);\n");
//	        }
	        out.write("    }\n\n");
	        
	        
	        if (cd.getIsNamedBy() == null){
		        if (cd.getUseWrapperType() ==  WrapperTypeEnum.EXTENDED){
		        	// If the wrapper type is extended, we're abstract at this level, so we
		        	// have to instantiate our derived wrapper class instead
			        out.write("    public " + cd.getName() + " getModificationRecorder(){\n");
			        out.write("        " + cd.getName() + " rc = new " + cd.getName() + "();\n");
			        out.write("        rc.setModifier(new DmcTypeModifierMV());\n");
			        out.write("        return(rc);\n");
			        out.write("    }\n\n");
		        }
		        else{
			        out.write("    public " + cd.getName() + "DMW getModificationRecorder(){\n");
			        out.write("        " + cd.getName() + "DMW rc = new " + cd.getName() + "DMW(new DmcTypeModifierMV());\n");
			        out.write("        return(rc);\n");
			        out.write("    }\n\n");
		        }
	        }
	        else{
	        	String upper = GenUtility.capTheName(cd.getIsNamedBy().getObjectName().toString());
	        	
		        if (cd.getUseWrapperType() ==  WrapperTypeEnum.EXTENDED){
		        	// If the wrapper type is extended, we're abstract at this level, so we
		        	// have to instantiate our derived wrapper class instead
			        out.write("    public " + cd.getName() + " getModificationRecorder(){\n");
			        out.write("        " + cd.getName() + " rc = new " + cd.getName() + "();\n");
			        out.write("        rc.set" + upper + "(get" + upper + "());\n");
			        out.write("        rc.setModifier(new DmcTypeModifierMV());\n");
			        out.write("        return(rc);\n");
			        out.write("    }\n\n");
		        }
		        else{
			        out.write("    public " + cd.getName() + "DMW getModificationRecorder(){\n");
			        out.write("        " + cd.getName() + "DMW rc = new " + cd.getName() + "DMW();\n");
			        out.write("        rc.set" + upper + "(get" + upper + "());\n");
			        out.write("        rc.setModifier(new DmcTypeModifierMV());\n");
			        out.write("        return(rc);\n");
			        out.write("    }\n\n");
		        }
	        }	        
	        
	        out.write("    public " + cd.getName() + "DMW(" + cd.getName() + "DMO obj) {\n");
	        out.write("        super(obj, " + classDef + ");\n");
	        
//	        if (anyAttributes){
//		        out.write("        mycore = (" + cd.getName() + "DMO) core;\n");
//		        out.write("        mycore.setContainer(this);\n");
//	        }
	        out.write("    }\n\n");
	        
//	        out.write("    @Override\n");
//	        out.write("    public void setDmcObject(DmcObject obj) {\n");
//	        if (anyAttributes){
//		        out.write("        mycore = (" + cd.getName() + "DMO) obj;\n");
//		        out.write("        mycore.setContainer(this);\n");
//	        }
//	        out.write("        super.setDmcObject(obj);\n");
//	        out.write("    }\n\n");	       
        }

        if (anyAttributes){
	        out.write("    public " + cd.getName() + "DMO getDMO() {\n");
	        out.write("        return((" + cd.getName() + "DMO) core);\n");
	        out.write("    }\n\n");
        }

        out.write("    protected " + cd.getName() + "DMW(" + cd.getName() + "DMO obj, ClassDefinition cd) {\n");
        out.write("        super(obj,cd);\n");
//        if (anyAttributes){
//        	out.write("        mycore = (" + cd.getName() + "DMO) core;\n");
//        }
        out.write("    }\n\n");
	        
//        out.write("    @Override\n");
//        out.write("    protected ArrayList<?> getAuxDataHolder() {\n");
//        out.write("        return(new ArrayList<" + cd.getJavaClass() + ">());\n");
//        out.write("    }\n\n");
        
        out.write(getAccessFunctions(cd));
        out.write("\n");
        out.write("}\n");
		
        out.close();
	}
	
	/**
	 * Dumps a file named <class name>AUX.java to the specified output directory.
	 * @param cd     The definition of the class.
	 * @param outdir The output directory.
	 * @throws IOException 
	 */
	private void dumpAUX(ClassDefinition cd, String outdir) throws IOException {
		// reset the static names, just in case we've been here before
		attributeInfo = new StringBuffer();
		
		allAttr = new ArrayList<AttributeDefinition>();
		
//		String ofn = outdir + File.separator + cd.getName().getNameString() + ".java";
		
		
//        BufferedWriter 	out = new BufferedWriter( new FileWriter(ofn) );
        BufferedWriter 	out = FileUpdateManager.instance().getWriter(outdir, cd.getName().getNameString() + ".java");
        
//        if (progress != null)
//        	progress.println("    Generating " + ofn);
        
        if (fileHeader != null)
        	out.write(fileHeader);

        String tmp = GeneratorUtils.dotNameToCamelCase(cd.getDefinedIn().getName().getNameString());
        String schemaName = cd.getDefinedIn().getDmwPackage() + ".generated." + tmp + "SchemaAG";
        String classDef   = schemaName + "._" + cd.getName();
        
        out.write("package " + cd.getDefinedIn().getDmwPackage() + ".generated.auxw;\n\n");
        
        anyMVAttributes = false;
        anySVAttributes = false;
        anyMVRefs		= false;
        
		StringBuffer imports = new StringBuffer();
		allAttr = new ArrayList<AttributeDefinition>();
		
		getAttributesAndImports(cd,allAttr,imports);
		
//		if (anyMVAttributes){
//			out.write("import java.util.*;\n");
//		}
		
		out.write("import org.dmd.dms.generated.enums.ValueTypeEnum;\n");
		
        out.write(imports.toString());
        
        out.write(getAuxClassHeader(cd, DebugInfo.getWhereWeAreNow()));
        
        out.write(" {\n\n");
        
        out.write("    public final static ClassDefinition _auxClass = " + classDef + ";\n");
        out.write(attributeInfo.toString() + "\n");
        
        out.write(getCommonAUXFunctions());
        
        out.write(getAUXAccessFunctions(cd));
        
        out.write("\n");
        
        out.write("\n\n}\n");
        
        out.close();
	}
	
    void appendAttributeInfo(StringBuffer out, String n, int ID, String t, ValueTypeEnum vte, String opt){
    	out.append("    public final static DmcAttributeInfo __" + n + " = new DmcAttributeInfo(");
    	out.append("\"" + n + "\",");
    	out.append(ID + ",");
    	out.append("\"" + t + "\",");
		out.append("ValueTypeEnum." + vte.toString() + ",");
    	out.append(opt + ");\n");

    }
	
	/**
	 * This method cycles through the class derivation hierarchy and the types required by all
	 * attributes associated with this class to determine the appropriate set of import statements
	 * required for the DMO.
	 * @param cd        The class definition of the object.
	 * @param allAttr   An array that will be populated with all attribute definitions of the class.
	 * @param sb        The buffer where the import statements are accumulated.
	 */
	public void getAttributesAndImports(ClassDefinition cd, ArrayList<AttributeDefinition> allAttr, StringBuffer sb){
		IntegerVar		longestImport	= new IntegerVar();
		TreeMap<StringName,TypeDefinition>	types = new TreeMap<StringName,TypeDefinition>();
		TreeMap<StringName,TypeDefinition>	iterables = new TreeMap<StringName,TypeDefinition>();
		TreeSet<String>						genericImports	= new TreeSet<String>();
		TreeMap<String,TypeAndAttr>			typeAndAttr 	= new TreeMap<String,TypeAndAttr>();
		boolean								needDmwOmni		= false;
		
		// Key: type name
		// Value: comment
		TreeMap<String,String>	uniqueImports = new TreeMap<String, String>();

		anyAttributes = false;
		
		if (cd.getDMWPackage() != null){
			cd.adjustJavaClass();
		}

		Iterator<AttributeDefinition> may = cd.getMay();
		if (may != null){
			while(may.hasNext()){
				// NOTE: COMPLICATED! We always add the type of the attribute to our global types
				// map EXCEPT IF the type is a non-referential, MULTI/SET attribute. Gaa!
				//
				// This is because WE DON'T want the primitive type any more, just the TYPEIterableDMW.
				// If the value is a single valued type, we'll want the primitive type.
				
				boolean shouldAddType = true;
				
				anyAttributes = true;
				AttributeDefinition ad = may.next();
				TypeDefinition td = ad.getType();
				
				if (ad.getGenericArgs() != null){
					if (ad.getGenericArgs().equals("<DmcObjectName>"))
						needDmwOmni = true;
				}
				
				switch(ad.getValueType()){
				case SINGLE:
					anySVAttributes =  true;
					break;
				case HASHMAPPED:
				case TREEMAPPED:
					anyMVAttributes = true;
					if (ad.getType().getIsRefType())
						anyMVRefs = true;
					
					iterables.put(td.getName(),td);
					break;
				case MULTI:
				case HASHSET:
				case TREESET:
					anyMVAttributes = true;
					
					if (ad.getType().getIsRefType())
						anyMVRefs = true;
					
//DebugInfo.debug("REMOVED CHECK FOR REF TYPE");
//					if (!td.getIsRefType()){
//						shouldAddType = false;
//					}
					iterables.put(td.getName(),td);
					
					break;
				}
				
				if (shouldAddType){
					types.put(td.getName(), td);
					TypeAndAttr ta = new TypeAndAttr(td,ad.getValueType());
					typeAndAttr.put(ta.name, ta);
				}
				
				appendAttributeInfo(attributeInfo, ad.getName().getNameString(), ad.getDmdID(), ad.getType().getName().getNameString(), ad.getValueType(), "true");

				if (ad.getGenericArgsImport() != null)
					genericImports.add(ad.getGenericArgsImport());

				allAttr.add(ad);
			}
		}
		
		Iterator<AttributeDefinition> must = cd.getMust();
		if (must != null){
			while(must.hasNext()){
				// NOTE: COMPLICATED! We always add the type of the attribute to our global types
				// map EXCEPT IF the type is a non-referential, MULTI/SET attribute. Gaa!
				//
				// This is because WE DON'T want the primitive type any more, just the TYPEIterableDMW.
				// If the value is a single valued type, we'll want the primitive type.
				
				boolean shouldAddType = true;
				anyAttributes = true;
				AttributeDefinition ad = must.next();
				TypeDefinition td = ad.getType();
				
				if (ad.getGenericArgs() != null){
					if (ad.getGenericArgs().equals("<DmcObjectName>"))
						needDmwOmni = true;
				}
				
				switch(ad.getValueType()){
				case SINGLE:
					anySVAttributes =  true;
					break;
				case HASHMAPPED:
				case TREEMAPPED:
					anyMVAttributes = true;
					if (ad.getType().getIsRefType())
						anyMVRefs = true;

					iterables.put(td.getName(),td);
					break;
				case MULTI:
				case HASHSET:
				case TREESET:
					anyMVAttributes = true;
					if (ad.getType().getIsRefType())
						anyMVRefs = true;
//DebugInfo.debug("REMOVED CHECK FOR REF TYPE");
//					if (!td.getIsRefType()){
//						shouldAddType = false;
//					}
					iterables.put(td.getName(),td);
					break;
				}

				if (shouldAddType){
					types.put(td.getName(), td);
					TypeAndAttr ta = new TypeAndAttr(td,ad.getValueType());
					typeAndAttr.put(ta.name, ta);
				}
				
				appendAttributeInfo(attributeInfo, ad.getName().getNameString(), ad.getDmdID(), ad.getType().getName().getNameString(), ad.getValueType(), "true");

				if (ad.getGenericArgsImport() != null)
					genericImports.add(ad.getGenericArgsImport());

				allAttr.add(ad);
			}
		}
		
		if (cd.getIsNamedBy() != null){
			AttributeDefinition isNamedBy = cd.getIsNamedBy();
			String nameAttributeType = isNamedBy.getType().getPrimitiveType();
			
			addImport(uniqueImports, longestImport, nameAttributeType, "Is named by");
		}
				
//		if ((cd.getClassType() != ClassTypeEnum.AUXILIARY))
//			addImport(uniqueImports, longestImport, "java.util.*", "If not auxiliary");

		addImport(uniqueImports, longestImport, "org.dmd.dms.*", "Always 2");
		
		if ( (cd.getClassType() != ClassTypeEnum.ABSTRACT) && (cd.getClassType() != ClassTypeEnum.AUXILIARY))
			addImport(uniqueImports, longestImport, "org.dmd.dms.generated.types.DmcTypeModifierMV", "Required for MODREC constructor");
		
		
//		if ( (cd.getUseWrapperType() == WrapperTypeEnum.EXTENDED) && (cd.getIsNamedBy() != null)){
		if (cd.getUseWrapperType() == WrapperTypeEnum.EXTENDED){
//			if (cd.getClassType() != ClassTypeEnum.ABSTRACT)
				addImport(uniqueImports, longestImport, cd.getDmeImport(), "Required for getModificationRecorder()");
		}
			
		if (needDmwOmni)
			addImport(uniqueImports, longestImport, "org.dmd.dmw.DmwOmni", "Have DmcObjectName attributes");
		
		if (anyAttributes)
			addImport(uniqueImports, longestImport, "org.dmd.dmc.*", "If any attributes");
		
		for(String s: genericImports){
			addImport(uniqueImports, longestImport, s, "Generic args import");
		}

		for(TypeAndAttr ta : typeAndAttr.values()){
//		Iterator<TypeDefinition> t = types.values().iterator();
//		while(t.hasNext()){
			TypeDefinition td = ta.td;
			
			if (td.getIsRefType()){
				// We have to make some adjustments to handle the fact that we
				// may not be generating this code in the same location as the DMOs
				td.adjustJavaClass();
				
				addImport(uniqueImports, longestImport, td.getAuxHolderImport(), "Is reference type aux");
				
				// If this is multi-valued, we don't need the REF because we're returning the Iterable
				if (ta.valueType == ValueTypeEnum.SINGLE){
					if (td.getOriginalClass().getIsNamedBy() == null)
						addImport(uniqueImports, longestImport, td.getOriginalClass().getDmoImport(), "Reference to unnamed object");
					else
						addImport(uniqueImports, longestImport, td.getOriginalClass().getDmtREFImport(), "Is reference type REF");
				}
				
				if (cd.getClassType() == ClassTypeEnum.AUXILIARY){
//					addImport(uniqueImports, longestImport, td.getOriginalClass().getDmtImport(), "Reference in an auxiliary class");
					addImport(uniqueImports, longestImport, ta.getImport(), "Reference in an auxiliary class");
				}
				
				if (td.getOriginalClass().getIsNamedBy() != null)
					addImport(uniqueImports, longestImport, td.getOriginalClass().getDmtREFImport(), "To support getMVCopy() for REFs");
				
			}
			else if (td.getPrimitiveType() != null){
				addImport(uniqueImports, longestImport, td.getPrimitiveType(), "Primitive type");
			}
			else if (cd.getClassType() == ClassTypeEnum.AUXILIARY){
//				addImport(uniqueImports, longestImport, td.getTypeClassName(), "Type in an auxiliary class");
				addImport(uniqueImports, longestImport, ta.getImport(), "Type in an auxiliary class");
			}
			
			if (td.getAltType() != null){
				if (td.getAltTypeImport() != null)
					addImport(uniqueImports, longestImport, td.getAltTypeImport(), "Alternative type for " + td.getName() + " values");
			}
			
			if (td.getKeyImport() != null)
				addImport(uniqueImports, longestImport, td.getKeyImport(), "Key class");
			
			if (ta.valueType != ValueTypeEnum.SINGLE)
				addImport(uniqueImports, longestImport, "java.util.Iterator", "To support getMVCopy()");
				
//			if (cd.getName().getNameString().equals("TestBasicObjectFixed")){
//				if (ta.name.equals("mvBoolean"))
//					DebugInfo.debug("HERE");
//			}
			
			switch(ta.valueType){
			case SINGLE:
				break;
			case MULTI:
				addImport(uniqueImports, longestImport, "java.util.ArrayList", "To support getMVCopy()");
				break;
			case HASHMAPPED:
				addImport(uniqueImports, longestImport, "java.util.HashMap", "To support getMVCopy()");
				break;
			case TREEMAPPED:
				addImport(uniqueImports, longestImport, "java.util.TreeMap", "To support getMVCopy()");
				break;
			case HASHSET:
				addImport(uniqueImports, longestImport, "java.util.HashSet", "To support getMVCopy()");
				break;
			case TREESET:
				addImport(uniqueImports, longestImport, "java.util.TreeSet", "To support getMVCopy()");
				break;
			}
				
		}
		
		Iterator<TypeDefinition> t  = iterables.values().iterator();
		while(t.hasNext()){
			TypeDefinition td = t.next();
			
//			DebugInfo.debug(td.getName().toString());
//			DebugInfo.debug(td.toOIF(15));
			
			addImport(uniqueImports, longestImport, td.getDmwIteratorImport(), "For multi-valued " + td.getName().getNameString());
			
			if (td.getPrimitiveType() != null)
				addImport(uniqueImports, longestImport, td.getPrimitiveType(), "For multi-valued contains" + td.getName().getNameString());
			
		}
		
		if (cd.getClassType() == ClassTypeEnum.ABSTRACT){
			addImport(uniqueImports, longestImport, cd.getDmoImport(), "Abstract class");
		}

		if (cd.getDerivedFrom() != null){
			cd.getDerivedFrom().adjustJavaClass();
			addImport(uniqueImports, longestImport, cd.getDerivedFrom().getJavaClass(), "Derived class");
		}
			
		if ((cd.getClassType() != ClassTypeEnum.AUXILIARY) && (cd.getClassType() != ClassTypeEnum.ABSTRACT)){
			addImport(uniqueImports, longestImport, cd.getDmoImport(), "Class not auxiliary or abstract");
		}
		
		sb.append(formatImports(uniqueImports, longestImport.intValue()));
	}
	
	void addImport(TreeMap<String,String> map, IntegerVar longest, String i, String c){
		if (i.length() > longest.intValue())
			longest.set(i.length());
		
		map.put(i,c);
	}

	String formatImports(TreeMap<String,String> map, int longest){
		int padding = longest+17;
		StringBuffer sb = new StringBuffer();
		PrintfFormat format = new PrintfFormat("%-" + padding + "s");
		
		sb.append("// Generated from: " + DebugInfo.getWhereWeAreNow() + "\n");
		
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()){
			String key = keys.next();
			sb.append(format.sprintf("import " + key + ";") + "// " + map.get(key) + "\n");
		}
		
		sb.append("\n");
		
		return(sb.toString());
	}
	

	String getAccessFunctions(ClassDefinition cd){
		StringBuffer sb	= new StringBuffer();
		
		// provide the getObjectName() method to support DmcNamedObjectIF
		if (cd.getIsNamedBy() != null){
			AttributeDefinition isNamedBy = cd.getIsNamedBy();
			String nameType = isNamedBy.getType().getName().getNameString();
			
	    	StringBuffer 	attrNameCapped 	= new StringBuffer();
	    	attrNameCapped.append(cd.getIsNamedBy().getName());
	    	attrNameCapped.setCharAt(0,Character.toUpperCase(attrNameCapped.charAt(0)));
	    	
	    	String dmocast = "((" + cd.getName() + "DMO) core)";
	    	
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public " + nameType + " getObjectName(){\n");
			sb.append("        return(" + dmocast + ".get" + attrNameCapped.toString() + "());\n");
			sb.append("    }\n\n");
			
			sb.append("    public int hashCode(){\n");
			sb.append("        return(getObjectName().hashCode());\n");
			sb.append("    }\n\n");
			
			sb.append("    public DmcAttribute<?> getObjectNameAttribute(){\n");
			sb.append("        return(" + dmocast + ".getObjectNameAttribute());\n");
			sb.append("    }\n\n");
			
			sb.append("    public boolean equals(Object obj){\n");
			sb.append("        if (obj instanceof " + cd.getName()+ "DMW){\n");
			sb.append("            return( getObjectName().equals( ((" + cd.getName() + "DMW) obj).getObjectName()) );\n");
			sb.append("        }\n");
			sb.append("        return(false);\n");
			sb.append("    }\n\n");

		}
		
		for(AttributeDefinition ad : allAttr){
			switch(ad.getValueType()){
			case SINGLE:
				formatSV(cd,ad,sb);
				break;
			case MULTI:
			case HASHSET:
			case TREESET:
				formatMV(cd,ad,sb);
				break;
			case HASHMAPPED:
			case TREEMAPPED:
				formatMAPPED(cd, ad, sb);
				break;
			}

		}
		
		return(sb.toString());
	}
	
	void formatSV(ClassDefinition cd, AttributeDefinition ad, StringBuffer sb){
    	String typeClassName = ad.getType().getTypeClassName();
    	String attrType = "DmcType" + ad.getType().getName();
    	String typeName = ad.getType().getName().getNameString();
    	String genericArgs		= ad.getGenericArgs();
    	
    	if (genericArgs == null)
    		genericArgs = "<?>";
    	
    	// Complicated stuff. When we're referring to wrapped objects through a reference
    	// attribute we can have two cases. Either, we have a straight wrapper e.g. generated.dmw.classDMW
    	// or, the generated wrapper has been extended e.g.  extended.class
    	// So, we need to handle both of these cases and the internally generated type gives us
    	// this info via the auxHolderType
    	
    	// But - a bit more complicated, we have to take into account where we're generating the wrappers.
    	// We don't always generate them in the same location where we generate the DMOs i.e. we might
    	// be generating wrappers for use on the server only, or for use on the client only. So, we have to
    	// take this into account.
    	
    	String auxHolderClass = ad.getType().getAuxHolderClass();

    	if (ad.getType().getIsRefType()){
    		attrType = attrType + "REF";
    		typeName = typeName + "REF";
    	}

    	if (typeClassName != null){
    		int lastPeriod = typeClassName.lastIndexOf('.');
    		if (lastPeriod != -1){
    			attrType = typeClassName.substring(lastPeriod + 1);
    		}
    	}
    	
    	String dmocast = "((" + cd.getName() + "DMO) core)";
    	
    	////////////////////////////////////////////////////////////////////////////////
    	// getter

    	StringBuffer 	functionName 	= new StringBuffer();
    	functionName.append(ad.getName());
    	functionName.setCharAt(0,Character.toUpperCase(functionName.charAt(0)));
		
    	if (ad.getType().getIsRefType()){
    		if (ad.getType().getOriginalClass().getIsNamedBy() == null){
    			String cname = null;
    			if (ad.getType().getOriginalClass().getUseWrapperType() == WrapperTypeEnum.EXTENDED)
    				cname = ad.getType().getOriginalClass().getName().getNameString();
    			else
    				cname = ad.getType().getOriginalClass().getName().getNameString() + "DMW";
    				
		    	sb.append("    /**\n");
				sb.append("     * @return A " + cname + " object.\n");
				sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public " + cname + " get" + functionName + "(){\n");
				sb.append("        " + ad.getType().getName() + "DMO dmo = " + dmocast + ".get" + functionName + "();\n");
				sb.append("        if (dmo == null)\n");
				sb.append("            return(null);\n");
				sb.append("        \n");
				sb.append("        return((" + cname + ")dmo.getContainer());\n");
				sb.append("    }\n\n");
    		}
    		else{
    			String suffix = "";
    			if (ad.getType().getOriginalClass().getUseWrapperType() == WrapperTypeEnum.EXTENDED)
    				suffix = "";
    			else
    				suffix = "DMW";
    			
		    	sb.append("    /**\n");
				sb.append("     * @return A " + ad.getType().getName() + suffix + " object.\n");
				sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public " + ad.getType().getName() + suffix  + " get" + functionName + "(){\n");
				sb.append("        " + ad.getType().getName() + "REF ref = " + dmocast + ".get" + functionName + "();\n");
				sb.append("        if (ref == null)\n");
				sb.append("            return(null);\n");
				sb.append("        \n");
				sb.append("        return((" + ad.getType().getName() + suffix + ")ref.getObject().getContainer());\n");
				sb.append("    }\n\n");
    		}
    	}
    	else{
//    		if (genericArgs.equals("<DmcObjectName>")){
//    			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
//    			if (typeName.equals("DmcAttribute"))
//    				sb.append("    public DmcAttribute" + genericArgs + " get" + functionName + "(){\n");
//    			else
//    				sb.append("    public " + typeName + " get" + functionName + "(){\n");
//    			sb.append("        return(mycore.get" + functionName + "());\n");
//    	    	sb.append("    }\n\n");
//    		}
    		
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			if (typeName.equals("DmcAttribute")){
				sb.append("    public DmcAttribute" + genericArgs + " get" + functionName + "(){\n");
				sb.append("        return(" + dmocast + ".get" + functionName + "());\n");
			}
			else if (typeName.equals("Boolean")){
				sb.append("    public " + typeName + " is" + functionName + "(){\n");
				sb.append("        return(" + dmocast + ".is" + functionName + "());\n");
			}
			else{
				sb.append("    public " + typeName + " get" + functionName + "(){\n");
				sb.append("        return(" + dmocast + ".get" + functionName + "());\n");
			}
	    	sb.append("    }\n\n");
    	}
		
    	////////////////////////////////////////////////////////////////////////////////
    	// setter
    	
    	if (ad.getType().getIsRefType()){
			sb.append("    /**\n");
			sb.append("     * Sets the " + ad.getName() + " to the specified value.\n");
			sb.append("     * @param value A value compatible with " + typeName + "\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public void set" + functionName + "(" + auxHolderClass + " value) {\n");
	    	sb.append("        " + dmocast + ".set" + functionName + "(value.getDMO());\n");
			sb.append("    }\n\n");
    	}
    	else{
    		if (genericArgs.equals("<DmcObjectName>")){
    	    	sb.append("    /**\n");
    	    	sb.append("     * Sets " + ad.getName() + " to the specified value.\n");
    	    	sb.append("     * @param value A value compatible with DmcObjectName\n");
    	    	sb.append("     */\n");
    			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
    	    	sb.append("    public void set" + functionName + "(DmcObjectName value) throws DmcValueException {\n");
    	    	sb.append("        DmcAttribute<DmcObjectName>	nameattr = DmwOmni.instance().getNameAttribute(value);\n");
    	    	sb.append("        nameattr.set(value);\n");
    	    	sb.append("        " + dmocast + ".setObjName(nameattr);\n");
    	    	sb.append("    }\n\n");
    		}
    		
	    	sb.append("    /**\n");
	    	sb.append("     * Sets " + ad.getName() + " to the specified value.\n");
	    	sb.append("     * @param value A value compatible with " + attrType + "\n");
	    	sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
	    	sb.append("    public void set" + functionName + "(Object value) throws DmcValueException {\n");
	    	sb.append("        " + dmocast + ".set" + functionName + "(value);\n");
	    	sb.append("    }\n\n");
	    	
	    	sb.append("    /**\n");
	    	sb.append("     * Sets " + ad.getName() + " to the specified value.\n");
	    	sb.append("     * @param value " + typeName + "\n");
	    	sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			if (typeName.equals("DmcAttribute")){
				sb.append("    public void set" + functionName + "(DmcAttribute" + genericArgs + " value){\n");
			}
			else
				sb.append("    public void set" + functionName + "(" + typeName + " value){\n");
	    	sb.append("        " + dmocast + ".set" + functionName + "(value);\n");
	    	sb.append("    }\n\n");	  
	    	
	    	if (ad.getType().getAltType() != null){
		    	sb.append("    /**\n");
		    	sb.append("     * Sets " + ad.getName() + " to the specified value.\n");
		    	sb.append("     * @param value " + typeName + "\n");
		    	sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public void set" + functionName + "(" + ad.getType().getAltType() + " value){\n");
		    	sb.append("        " + dmocast + ".set" + functionName + "(value);\n");
		    	sb.append("    }\n\n");	  
	    	}
    	}
    	
    	////////////////////////////////////////////////////////////////////////////////
    	// remover
		sb.append("    /**\n");
		sb.append("     * Removes the " + ad.getName() + " attribute value.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public void rem" + functionName + "(){\n");
		sb.append("        " + dmocast + ".rem" + functionName + "();\n");
		sb.append("    }\n\n");

	}
	
	/**
	 * 
	 * @param ad The attribute definition we're creating the access functions for.
	 * @param sb Where we're appending the functions.
	 */
	void formatMV(ClassDefinition cd, AttributeDefinition ad, StringBuffer sb){
		// The fully qualified name of the DmcType for the attribute
    	String typeClassName = ad.getType().getTypeClassName();
    	
    	// The last part typeClassName
    	String attrType = "DmcType" + ad.getType().getName();
    	
    	// 
    	String typeName = ad.getType().getName().getNameString();
    	
    	// Complicated stuff. When we're referring to wrapped objects through a reference
    	// attribute we can have two cases. Either, we have a straight wrapper e.g. generated.dmw.classDMW
    	// or, the generated wrapper has been extended e.g.  extended.class
    	// So, we need to handle both of these cases and the internally generated type gives us
    	// this info via the auxHolderType
    	String auxHolderClass = ad.getType().getAuxHolderClass();
    	
    	if (ad.getType().getIsRefType()){
    		attrType = attrType + "REF";
    	}

    	if (typeClassName != null){
    		int lastPeriod = typeClassName.lastIndexOf('.');
    		if (lastPeriod != -1){
    			attrType = typeClassName.substring(lastPeriod + 1);
    		}
    	}

    	StringBuffer 	functionName 	= new StringBuffer();
    	functionName.append(ad.getName());
    	functionName.setCharAt(0,Character.toUpperCase(functionName.charAt(0)));
    	
    	String dmocast = "((" + cd.getName() + "DMO) core)";

    	////////////////////////////////////////////////////////////////////////////////
    	// convenience functions
    	
    	sb.append("    /**\n");
		sb.append("     * @return The number of " + typeName + " items.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public int get" + functionName + "Size(){\n");
		sb.append("        DmcAttribute<?> attr = core.get(" + cd.getName() + "DMO.__" + ad.getName() + ");\n");
		sb.append("        if (attr == null)\n");
		sb.append("            return(0);\n");
		sb.append("        \n");
		sb.append("        return(attr.getMVSize());\n");
		sb.append("    }\n\n");
    	
    	sb.append("    /**\n");
		sb.append("     * @return true if there are no " + typeName + "DMO items.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public boolean get" + functionName + "IsEmpty(){\n");
		sb.append("        DmcAttribute<?> attr = core.get(" + cd.getName() + "DMO.__" + ad.getName() + ");\n");
		sb.append("        if (attr == null)\n");
		sb.append("            return(true);\n");
		sb.append("        \n");
		sb.append("        return(false);\n");
		sb.append("    }\n\n");
    	
    	sb.append("    /**\n");
		sb.append("     * @return true if there are any " + typeName + "DMO items.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public boolean get" + functionName + "HasValue(){\n");
		sb.append("        DmcAttribute<?> attr = core.get(" + cd.getName() + "DMO.__" + ad.getName() + ");\n");
		sb.append("        if (attr == null)\n");
		sb.append("            return(false);\n");
		sb.append("        \n");
		sb.append("        return(true);\n");
		sb.append("    }\n\n");
    	
    	////////////////////////////////////////////////////////////////////////////////
    	// getter

		if (ad.getType().getIsRefType()){
			String justdmo = ad.getType().getOriginalClass().getName().getNameString() + "DMO";

			String itClass = ad.getType().getOriginalClass().getDmwIteratorClass();
	    	sb.append("    /**\n");
			sb.append("     * @return An Iterator of " + typeName + "DMO objects.\n");
			sb.append("     */\n");
			sb.append("    @SuppressWarnings(\"unchecked\")\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public " + itClass + " get" + functionName + "Iterable(){\n");
			sb.append("        DmcAttribute attr = " + dmocast + ".get(" + cd.getName() + "DMO.__" + ad.getName() + ");\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return(" + itClass+ ".emptyList);\n");
			sb.append("        \n");
			sb.append("        return(new " + itClass + "(attr.getMV()));\n");
			sb.append("    }\n\n");
			
	    	////////////////////////////////////////////////////////////////////////////////
	    	// adder

			sb.append("    /**\n");
			sb.append("     * Adds another " + ad.getName() + " value.\n");
			sb.append("     * @param value A value compatible with " + typeName + "\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public DmcAttribute<?> add" + functionName + "(" + auxHolderClass + " value){\n");
	    	sb.append("        DmcAttribute<?> attr = " + dmocast + ".add" + functionName + "(((" + justdmo + ")value.getDmcObject()));\n");
	    	sb.append("        return(attr);\n");
			sb.append("    }\n\n");

	    	////////////////////////////////////////////////////////////////////////////////
	    	// deleter

			sb.append("    /**\n");
			sb.append("     * Deletes a " + ad.getName() + " value.\n");
			sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public void del" + functionName + "(" + auxHolderClass + " value){\n");
			sb.append("        " + dmocast + ".del" + functionName + "(value.getDMO());\n");
			sb.append("    }\n\n");
			
	    	////////////////////////////////////////////////////////////////////////////////
	    	// collection
			
			if (ad.getType().getOriginalClass().getIsNamedBy() != null){
				String collectionClass 	= null;
				String dmwClass			= null;
				boolean isMULTI = false;
				
				if (ad.getType().getOriginalClass().getUseWrapperType() == WrapperTypeEnum.EXTENDED)
					dmwClass = ad.getType().getOriginalClass().getName().getNameString();
				else
					dmwClass = ad.getType().getOriginalClass().getName().getNameString() + "DMW";
					
			
				switch(ad.getValueType()){
				case MULTI:
					collectionClass = "ArrayList";
					isMULTI = true;
					break;
				case HASHSET:
					collectionClass = "HashSet";
					break;
				case TREESET:
					collectionClass = "TreeSet";
					break;
				}
				
		    	sb.append("    /**\n");
				sb.append("     * @return A COPY of the collection of " + typeName + " objects.\n");
				sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public " + collectionClass + "<" + dmwClass + ">" + " get" + functionName + "Copy(){\n");
				sb.append("        DmcAttribute<?> attr = " + dmocast + ".get(" + cd.getName() + "DMO.__" + ad.getName() + ");\n");
				sb.append("        if (attr == null)\n");
				sb.append("            return(new " + collectionClass + "<" + dmwClass + ">());\n");
				sb.append("        \n");
				if (isMULTI)
					sb.append("        " + collectionClass + "<" + dmwClass + "> rc = new " + collectionClass + "<" + dmwClass + ">(attr.getMVSize());\n");
				else
					sb.append("        " + collectionClass + "<" + dmwClass + "> rc = new " + collectionClass + "<" + dmwClass + ">();\n");
				sb.append("        \n");
				
				sb.append("        " + itClass + " it = get" + functionName + "Iterable();\n");
				sb.append("        while(it.hasNext()){\n");
				sb.append("            rc.add(it.next());\n");
				sb.append("        }\n");
				sb.append("        \n");
				sb.append("        return(rc);\n");
				sb.append("    }\n\n");
			}
			
		}
		else{
			String itClass = ad.getType().getDmwIteratorClass();
			
	    	sb.append("    /**\n");
			sb.append("     * @return An Iterator of " + typeName + " objects.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public " + itClass + " get" + functionName + "Iterable(){\n");
			sb.append("        DmcAttribute<?> attr = core.get(" + cd.getName() + "DMO.__" + ad.getName() + ");\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return(" + itClass+ ".emptyList);\n");
			sb.append("        \n");
			sb.append("        return(new " + itClass + "(" + dmocast + ".get" + functionName + "()));\n");
			sb.append("    }\n\n");
			
	    	////////////////////////////////////////////////////////////////////////////////
	    	// adder

			sb.append("    /**\n");
			sb.append("     * Adds another " + ad.getName() + " value.\n");
			sb.append("     * @param value A value compatible with " + typeName + "\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public void add" + functionName + "(Object value) throws DmcValueException {\n");
	    	sb.append("        " + dmocast + ".add" + functionName + "(value);\n");
			sb.append("    }\n\n");
			
			sb.append("    /**\n");
			sb.append("     * Adds another " + ad.getName() + " value.\n");
			sb.append("     * @param value A value compatible with " + typeName + "\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public void add" + functionName + "(" + typeName + " value){\n");
	    	sb.append("        " + dmocast + ".add" + functionName + "(value);\n");
			sb.append("    }\n\n");
			
			if (ad.getType().getAltType() != null){
				String alt = ad.getType().getAltType();
				sb.append("    /**\n");
				sb.append("     * Adds another " + alt + " value.\n");
				sb.append("     * @param value A value compatible with " + alt + "\n");
				sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public void add" + functionName + "(" + alt + " value){\n");
		    	sb.append("        " + dmocast + ".add" + functionName + "(value);\n");
				sb.append("    }\n\n");
			}
			
	    	////////////////////////////////////////////////////////////////////////////////
	    	// contains
			
			sb.append("    /**\n");
			sb.append("     * Returns true if the collection contains the " + ad.getName() + " value.\n");
			sb.append("     * @param value A value compatible with " + typeName + "\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public boolean " + ad.getName() + "Contains(" + typeName + " value){\n");
	    	sb.append("        return(" + dmocast + "." + ad.getName() + "Contains(value));\n");
			sb.append("    }\n\n");
			
			if (ad.getType().getAltType() != null){
				String alt = ad.getType().getAltType();
				sb.append("    /**\n");
				sb.append("     * Returns true if the collection contains the " + alt + " value.\n");
				sb.append("     * @param value A value compatible with " + alt + "\n");
				sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public boolean " + ad.getName() + "Contains(" + alt + " value){\n");
		    	sb.append("        return(" + dmocast + "." + ad.getName() + "Contains(value));\n");
				sb.append("    }\n\n");
			}
			
	    	////////////////////////////////////////////////////////////////////////////////
	    	// collection
			
			String collectionClass = null;
			boolean supportsSize = false;
		
			switch(ad.getValueType()){
			case MULTI:
				collectionClass = "ArrayList";
				supportsSize = true;
				break;
			case HASHSET:
				collectionClass = "HashSet";
				supportsSize = true;
				break;
			case TREESET:
				collectionClass = "TreeSet";
				break;
			}
			
	    	sb.append("    /**\n");
			sb.append("     * @return A COPY of the collection of " + typeName + " objects.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    @SuppressWarnings(\"unchecked\")\n");
			sb.append("    public " + collectionClass + "<" + ad.getType().getName() + ">" + " get" + functionName + "Copy(){\n");
			sb.append("        DmcAttribute<?> attr = core.get(" + cd.getName() + "DMO.__" + ad.getName() + ");\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return(new " + collectionClass + "<" + ad.getType().getName() + ">());\n");
			sb.append("        \n");
			if (supportsSize)
				sb.append("        " + collectionClass + "<" + ad.getType().getName() + "> rc = new " + collectionClass + "<" + ad.getType().getName() + ">(attr.getMVSize());\n");
			else
				sb.append("        " + collectionClass + "<" + ad.getType().getName() + "> rc = new " + collectionClass + "<" + ad.getType().getName() + ">();\n");
			sb.append("        \n");
			sb.append("        Iterator<" + ad.getType().getName() + "> it = (Iterator<" + ad.getType().getName() + ">) attr.getMV();\n");
			sb.append("        while(it.hasNext()){\n");
			sb.append("            rc.add(it.next());\n");
			sb.append("        }\n");
			sb.append("        \n");
			sb.append("        return(rc);\n");
			sb.append("    }\n\n");
			
	    	////////////////////////////////////////////////////////////////////////////////
	    	// deleter

			sb.append("    /**\n");
			sb.append("     * Deletes a " + ad.getName() + " value.\n");
			sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public void del" + functionName + "(Object value) throws DmcValueException {\n");
			sb.append("        " + dmocast + ".del" + functionName + "(value);\n");
			sb.append("    }\n\n");

			sb.append("    /**\n");
			sb.append("     * Deletes a " + ad.getName() + " value.\n");
			sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public void del" + functionName + "(" + typeName + " value){\n");
			sb.append("        " + dmocast + ".del" + functionName + "(value);\n");
			sb.append("    }\n\n");

		}
		
    	////////////////////////////////////////////////////////////////////////////////
    	// remover
		sb.append("    /**\n");
		sb.append("     * Removes the " + ad.getName() + " attribute value.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public void rem" + functionName + "(){\n");
		sb.append("        " + dmocast + ".rem" + functionName + "();\n");
		sb.append("    }\n\n");

	}

	/**
	 * 
	 * @param ad The attribute definition we're creating the access functions for.
	 * @param sb Where we're appending the functions.
	 */
	void formatMAPPED(ClassDefinition cd, AttributeDefinition ad, StringBuffer sb){
		// The fully qualified name of the DmcType for the attribute
    	String typeClassName = ad.getType().getTypeClassName();
    	
    	// The last part typeClassName
    	String attrType = "DmcType" + ad.getType().getName();
    	
    	// 
    	String typeName = ad.getType().getName().getNameString();
    	
    	// Complicated stuff. When we're referring to wrapped objects through a reference
    	// attribute we can have two cases. Either, we have a straight wrapper e.g. generated.dmw.classDMW
    	// or, the generated wrapper has been extended e.g.  extended.class
    	// So, we need to handle both of these cases and the internally generated type gives us
    	// this info via the auxHolderType
    	String auxHolderClass = ad.getType().getAuxHolderClass();
    	
    	if (ad.getType().getIsRefType()){
    		attrType = attrType + "REF";
    	}

    	if (typeClassName != null){
    		int lastPeriod = typeClassName.lastIndexOf('.');
    		if (lastPeriod != -1){
    			attrType = typeClassName.substring(lastPeriod + 1);
    		}
    	}

    	StringBuffer 	functionName 	= new StringBuffer();
    	functionName.append(ad.getName());
    	functionName.setCharAt(0,Character.toUpperCase(functionName.charAt(0)));
    	
    	String dmocast = "((" + cd.getName() + "DMO) core)";

    	////////////////////////////////////////////////////////////////////////////////
    	// convenience functions
    	
    	sb.append("    /**\n");
		sb.append("     * @return The number of " + typeName + "DMO items.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public int get" + functionName + "Size(){\n");
		sb.append("        DmcAttribute<?> attr = " + dmocast + ".get(" + cd.getName() + "DMO.__" + ad.getName() + ");\n");
		sb.append("        if (attr == null)\n");
		sb.append("            return(0);\n");
		sb.append("        \n");
		sb.append("        return(attr.getMVSize());\n");
		sb.append("    }\n\n");
    	
    	sb.append("    /**\n");
		sb.append("     * @return true if there are no " + typeName + "DMO items.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public boolean get" + functionName + "IsEmpty(){\n");
		sb.append("        DmcAttribute<?> attr = " + dmocast + ".get(" + cd.getName() + "DMO.__" + ad.getName() + ");\n");
		sb.append("        if (attr == null)\n");
		sb.append("            return(true);\n");
		sb.append("        \n");
		sb.append("        return(false);\n");
		sb.append("    }\n\n");
    	
    	sb.append("    /**\n");
		sb.append("     * @return true if there are any " + typeName + "DMO items.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public boolean get" + functionName + "HasValue(){\n");
		sb.append("        DmcAttribute<?> attr = " + dmocast + ".get(" + cd.getName() + "DMO.__" + ad.getName() + ");\n");
		sb.append("        if (attr == null)\n");
		sb.append("            return(false);\n");
		sb.append("        \n");
		sb.append("        return(true);\n");
		sb.append("    }\n\n");
		
    	////////////////////////////////////////////////////////////////////////////////
    	// getter by key
		
    	sb.append("    /**\n");
		sb.append("     * @return The keyed " + typeName + " object if it's available and null otherwise.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public " + typeName + " get" + functionName + "(Object key){\n");
		sb.append("        DmcAttribute<?> attr = " + dmocast + ".get(" + cd.getName() + "DMO.__" + ad.getName() + ");\n");
		sb.append("        if (attr == null)\n");
		sb.append("            return(null);\n");
		sb.append("        \n");
		sb.append("        return((" + typeName + ")attr.getByKey(key));\n");
		sb.append("    }\n\n");
		
    	

		if (ad.getType().getIsRefType()){
			String itClass = ad.getType().getOriginalClass().getDmwIteratorClass();
			
			if (ad.getType().getOriginalClass().getIsNamedBy() == null){
				DebugInfo.debug("NOT GENERATING cast Iterable of straight objects.");
			}
			else{
		    	////////////////////////////////////////////////////////////////////////////////
		    	// getter
		    	sb.append("    /**\n");
				sb.append("     * @return An Iterable of " + typeName + " objects.\n");
				sb.append("     */\n");
				sb.append("    @SuppressWarnings(\"unchecked\")\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public " + itClass + " get" + functionName + "Iterable(){\n");
				sb.append("        DmcAttribute attr = " + dmocast + ".get(" + cd.getName() + "DMO.__" + ad.getName() + ");\n");
				sb.append("        if (attr == null)\n");
				sb.append("            return(" + itClass+ ".emptyList);\n");
				sb.append("        \n");
				sb.append("        Iterator<" + typeName + "REF> it = " + dmocast + ".get" + functionName + "();\n");
				sb.append("        \n");
				sb.append("        if (it == null)\n");
				sb.append("            return(" + itClass+ ".emptyList);\n");
				sb.append("        \n");
				sb.append("        return(new " + itClass + "(it));\n");
				sb.append("    }\n\n");
			}
			
	    	////////////////////////////////////////////////////////////////////////////////
	    	// adder

			sb.append("    /**\n");
			sb.append("     * Adds another " + ad.getName() + " value.\n");
			sb.append("     * @param value " + typeName + "DMW\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public DmcAttribute<?> add" + functionName + "(" + auxHolderClass + " value) {\n");
	    	sb.append("        return(" + dmocast + ".add" + functionName + "(value.getDMO()));\n");
			sb.append("    }\n\n");

	    	////////////////////////////////////////////////////////////////////////////////
	    	// deleter

			sb.append("    /**\n");
			sb.append("     * Deletes a " + ad.getName() + " value.\n");
			sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public void del" + functionName + "(" + auxHolderClass + " value){\n");
	    	sb.append("        " + dmocast + ".del" + functionName + "(value.getDMO());\n");
			sb.append("    }\n\n");

	    	////////////////////////////////////////////////////////////////////////////////
	    	// collection
			
			if (ad.getType().getOriginalClass().getIsNamedBy() != null){
			
				String collectionClass 	= null;
				String dmwClass			= null;
				String keyClass = ad.getType().getOriginalClass().getIsNamedBy().getType().getName().getNameString();
				
//				String dmoREF			= ad.getType().getOriginalClass().getName() + "REF";
				
				if (ad.getType().getOriginalClass().getUseWrapperType() == WrapperTypeEnum.EXTENDED)
					dmwClass = ad.getType().getOriginalClass().getName().getNameString();
				else
					dmwClass = ad.getType().getOriginalClass().getName().getNameString() + "DMW";
					
			
				switch(ad.getValueType()){
				case HASHMAPPED:
					collectionClass = "HashMap";
					break;
				case TREEMAPPED:
					collectionClass = "TreeMap";
					break;
				}
				
		    	sb.append("    /**\n");
				sb.append("     * @return A COPY of the collection of " + typeName + " objects.\n");
				sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public " + collectionClass + "<" + keyClass + "," + dmwClass + ">" + " get" + functionName + "Copy(){\n");
				sb.append("        DmcAttribute<?> attr = " + dmocast + ".get(" + cd.getName() + "DMO.__" + ad.getName() + ");\n");
				sb.append("        if (attr == null)\n");
				sb.append("            return(new " + collectionClass + "<" + keyClass + "," + dmwClass + ">());\n");
				sb.append("        \n");
				sb.append("        " + collectionClass + "<" + keyClass + "," + dmwClass + "> rc = new " + collectionClass + "<" + keyClass + "," + dmwClass + ">();\n");
				sb.append("        \n");
				sb.append("        " + itClass + " it = get" + functionName + "Iterable();\n");
				sb.append("        while(it.hasNext()){\n");
				sb.append("            " + dmwClass + " obj = it.next();\n");
				sb.append("            rc.put((" + keyClass + ") obj.getObjectName(),obj);\n");
				sb.append("        }\n");
				sb.append("        return(rc);\n");
				sb.append("    }\n\n");
			
			}
			

		}
		else{
			String itClass = ad.getType().getDmwIteratorClass();
	    	sb.append("    /**\n");
			sb.append("     * @return An Iterator of " + typeName + " objects.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public " + itClass + " get" + functionName + "Iterable(){\n");
			sb.append("        DmcAttribute<?> attr = " + dmocast + ".get(" + cd.getName() + "DMO.__" + ad.getName() + ");\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return(" + itClass+ ".emptyList);\n");
			sb.append("        \n");
			sb.append("        return(new " + itClass + "(" + dmocast + ".get" + functionName + "()));\n");
			sb.append("    }\n\n");
			
	    	////////////////////////////////////////////////////////////////////////////////
	    	// adder

			sb.append("    /**\n");
			sb.append("     * Adds another " + ad.getName() + " value.\n");
			sb.append("     * @param value A value compatible with " + typeName + "\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public void add" + functionName + "(Object value) throws DmcValueException {\n");
	    	sb.append("        " + dmocast + ".add" + functionName + "(value);\n");
			sb.append("    }\n\n");
			
			sb.append("    /**\n");
			sb.append("     * Adds another " + ad.getName() + " value.\n");
			sb.append("     * @param value " + typeName + "\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public void add" + functionName + "(" + typeName+ " value) {\n");
	    	sb.append("        " + dmocast + ".add" + functionName + "(value);\n");
			sb.append("    }\n\n");
			
	    	////////////////////////////////////////////////////////////////////////////////
	    	// deleter

			sb.append("    /**\n");
			sb.append("     * Deletes a " + ad.getName() + " value.\n");
			sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public void del" + functionName + "(Object value) throws DmcValueException {\n");
			sb.append("        " + dmocast + ".del" + functionName + "(value);\n");
			sb.append("    }\n\n");

			sb.append("    /**\n");
			sb.append("     * Deletes a " + ad.getName() + " value.\n");
			sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public void del" + functionName + "(" + ad.getType().getKeyClass() + " value){\n");
			sb.append("        " + dmocast + ".del" + functionName + "(value);\n");
			sb.append("    }\n\n");

			
	    	////////////////////////////////////////////////////////////////////////////////
	    	// collection
			
			String collectionClass = null;
			String keyClass = ad.getType().getKeyClass();
			boolean supportsSize = false;
		
			switch(ad.getValueType()){
			case HASHMAPPED:
				collectionClass = "HashMap";
				supportsSize = true;
				break;
			case TREEMAPPED:
				collectionClass = "TreeMap";
				break;
			}
			
	    	sb.append("    /**\n");
			sb.append("     * @return A COPY of the collection of " + typeName + " objects.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    @SuppressWarnings(\"unchecked\")\n");
			sb.append("    public " + collectionClass + "<" + keyClass + "," + ad.getType().getName() + ">" + " get" + functionName + "Copy(){\n");
			sb.append("        DmcAttribute<?> attr = " + dmocast + ".get(" + cd.getName() + "DMO.__" + ad.getName() + ");\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return(new " + collectionClass + "<" + keyClass + "," + ad.getType().getName() + ">());\n");
			sb.append("        \n");
			if (supportsSize)
				sb.append("        " + collectionClass + "<" + keyClass + "," + ad.getType().getName() + "> rc = new " + collectionClass + "<" + keyClass + "," + ad.getType().getName() + ">(attr.getMVSize());\n");
			else
				sb.append("        " + collectionClass + "<" + keyClass + "," + ad.getType().getName() + "> rc = new " + collectionClass + "<" + keyClass + "," + ad.getType().getName() + ">();\n");
			sb.append("        \n");
			sb.append("        Iterator<" + ad.getType().getName() + "> it = (Iterator<" + ad.getType().getName() + ">) attr.getMV();\n");
			sb.append("        while(it.hasNext()){\n");
			sb.append("            " + ad.getType().getName() + " obj = it.next();\n");
			sb.append("            rc.put((" + keyClass + ")obj.getKey(),obj);\n");
			sb.append("        }\n");
			sb.append("        \n");
			sb.append("        return(rc);\n");
			sb.append("    }\n\n");

		}
		
    	////////////////////////////////////////////////////////////////////////////////
    	// contains
		// TODO: add support for containsKey in MAPPED attributes
//		sb.append("    /**\n");
//		sb.append("     * Returns true if the collection contains the " + ad.getName() + " value.\n");
//		sb.append("     * @param value A value compatible with " + typeName + "\n");
//		sb.append("     */\n");
//		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
//		sb.append("    public boolean " + ad.getName() + "Contains(" + typeName + " value){\n");
//    	sb.append("        return(mycore." + ad.getName() + "Contains(value));\n");
//		sb.append("    }\n\n");
//		
    	////////////////////////////////////////////////////////////////////////////////
    	// remover
		sb.append("    /**\n");
		sb.append("     * Removes the " + ad.getName() + " attribute value.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public void rem" + functionName + "(){\n");
		sb.append("        " + dmocast + ".rem" + functionName + "();\n");
		sb.append("    }\n\n");

	}


	String getCommonAUXFunctions(){
		StringBuffer sb = new StringBuffer();
		
		sb.append("    /**\n");
		sb.append("     * This method will check to see if the object has any of our attributes.\n");
		sb.append("     * If not, our aux class is automatically removed from the object.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    static private void removeAuxIfRequired(DmwWrapper corew){\n");
		sb.append("        boolean anyLeft = false;\n");
		sb.append("\n");
		for(AttributeDefinition ad : allAttr){
			sb.append("        if (corew.getDmcObject().get(__" + ad.getName() + ") != null)\n");
			sb.append("            anyLeft = true;\n");
		}
		sb.append("\n");
		sb.append("        if (!anyLeft)\n");
		sb.append("            corew.removeAux(_auxClass);\n");
		sb.append("    }\n");
		sb.append("\n");
		
		sb.append("    /**\n");
		sb.append("     * This method will check to see if the object has our aux class.\n");
		sb.append("     * If not, we add our aux class the object.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    static private void addAuxIfRequired(DmwWrapper corew) throws DmcValueException {\n");
		sb.append("        if (!corew.hasAux(_auxClass))\n");
		sb.append("            corew.addAux(_auxClass);\n");
		sb.append("    }\n");
		sb.append("\n");

		sb.append("    /**\n");
		sb.append("     * This method checks if the object has this auxiliary class.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    static public boolean hasAux(DmwWrapper corew){\n");
		sb.append("        if (corew == null)\n");
		sb.append("            return(false);\n");
		sb.append("        return(corew.hasAux(_auxClass));\n");
		sb.append("    }\n");
		sb.append("\n");
			
		return(sb.toString());
	}
	
	String getAuxClassHeader(ClassDefinition cd, String where){
		StringBuffer sb = new StringBuffer();
		
		sb.append("/**\n");
        CodeFormatter.dumpCodeComment(cd.getDescription(),sb," * ");
        sb.append(" * <P>\n");
        sb.append(" * Generated from the " + cd.getDefinedIn().getName() + " schema at version " + cd.getDefinedIn().getVersion() + "\n");
        sb.append(" * <P>\n");
        sb.append(" * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!\n");
        sb.append(" * Generated from: " + where + "\n");
        sb.append(" */\n");
		
		sb.append("public class ");
		
		sb.append(cd.getName());
		
		return(sb.toString());
	}
	
	String getAUXAccessFunctions(ClassDefinition cd){
		StringBuffer sb	= new StringBuffer();
		
		
		for(AttributeDefinition ad : allAttr){
			switch(ad.getValueType()){
			case SINGLE:
				formatAUXSV(cd,ad,sb);
				break;
			case MULTI:
				formatAUXMV(cd,ad,sb);
				break;
			case HASHMAPPED:
				break;
			case TREEMAPPED:
				break;
			}
		}
		
		return(sb.toString());
	}
	
	void formatAUXSV(ClassDefinition cd, AttributeDefinition ad, StringBuffer sb){
    	String typeClassName = ad.getType().getTypeClassName();
    	String attrType = "DmcType" + ad.getType().getName();
    	String typeName = ad.getType().getName().getNameString();
    	String nullReturnValue = ad.getType().getNullReturnValue();
    	String staticName = "__" + ad.getName();
    	
    	// Complicated stuff. When we're referring to wrapped objects through a reference
    	// attribute we can have two cases. Either, we have a straight wrapper e.g. generated.dmw.classDMW
    	// or, the generated wrapper has been extended e.g.  extended.class
    	// So, we need to handle both of these cases and the internally generated type gives us
    	// this info via the auxHolderType
    	
    	// But - a bit more complicated, we have to take into account where we're generating the wrappers.
    	// We don't always generate them in the same location where we generate the DMOs i.e. we might
    	// be generating wrappers for use on the server only, or for use on the client only. So, we have to
    	// take this into account.
    	
    	String auxHolderClass = ad.getType().getAuxHolderClass();

    	if (ad.getType().getIsRefType()){
    		attrType = attrType + "REF";
    		typeName = typeName + "REF";
    	}

    	if (typeClassName != null){
    		int lastPeriod = typeClassName.lastIndexOf('.');
    		if (lastPeriod != -1){
    			attrType = typeClassName.substring(lastPeriod + 1);
    		}
    	}
    	
    	StringBuffer 	functionName 	= new StringBuffer();
    	functionName.append(ad.getName());
    	functionName.setCharAt(0,Character.toUpperCase(functionName.charAt(0)));
    	
    	attrType = attrType + "SV";
		
    	// Remove attribute
    	
    	sb.append("    /**\n");
		sb.append("     * Removes the " + ad.getName() + " attribute from the object.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    static public DmcAttribute<?> rem" + functionName + "(DmwWrapper corew){\n");
		sb.append("        if (corew == null)\n");
		sb.append("            return(null);\n");
		sb.append("        DmcAttribute<?> rc = corew.getDmcObject().rem(__" + ad.getName() + ");\n");
		sb.append("        removeAuxIfRequired(corew);\n");
		sb.append("        return(rc);\n");
		sb.append("    }\n");
		sb.append("\n");

    	////////////////////////////////////////////////////////////////////////////////
    	// getter

		if (ad.getType().getIsRefType()){
			String REF = ad.getType().getOriginalClass().getName() + "REF";
			
	    	sb.append("    /**\n");
			sb.append("     * @return A " + auxHolderClass + " object.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    static public " + auxHolderClass + " get" + functionName + "(DmwWrapper corew){\n");
			sb.append("        DmcAttribute<?> attr = corew.getDmcObject().get(" + staticName + ");\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return(null);\n");
			sb.append("        \n");
			sb.append("        " + REF + " ref = (" + REF + ") attr.getSV();\n");
			sb.append("        \n");
//			sb.append("        " + auxHolderClass + " ref = (" + auxHolderClass + ") attr.getAuxData();\n");
//			sb.append("        \n");
			sb.append("        return((" + auxHolderClass + ")ref.getObject().getContainer());\n");
			sb.append("    }\n\n");
			
    		
    	}
    	else{
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    static public " + typeName + " get" + functionName + "(DmwWrapper corew){\n");
			sb.append("        " + attrType + " attr = (" + attrType + ") corew.getDmcObject().get(__" + ad.getName() + ");\n");
			sb.append("        if (attr == null)\n");
			
	    	if (nullReturnValue == null)
	    		sb.append("            return(null);\n");
	    	else
	    		sb.append("            return(" + nullReturnValue + ");\n");
	
	    	sb.append("\n");
	    	sb.append("        return(attr.getSV());\n");
	    	sb.append("    }\n\n");
    	}
		
    	////////////////////////////////////////////////////////////////////////////////
    	// setter
    	
    	if (ad.getType().getIsRefType()){
			sb.append("    /**\n");
			sb.append("     * Sets the " + ad.getName() + " to the specified value.\n");
			sb.append("     * @param value A value compatible with " + typeName + "\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    static public void set" + functionName + "(DmwWrapper corew, Object value) throws DmcValueException {\n");
	    	sb.append("        DmcAttribute<?> attr = corew.getDmcObject().get(" + staticName + ");\n");
	    	sb.append("        if (attr == null){\n");
	    	sb.append("            attr = new " + attrType + "();\n");
			sb.append("            addAuxIfRequired(corew);\n");
			sb.append("        }\n\n");
	    	sb.append("        attr.set(value);\n");
	    	sb.append("        corew.getDmcObject().set(" + staticName + ", attr);\n");
//	    	sb.append("        attr.setAuxData(value);\n");
			sb.append("    }\n\n");

    	}
    	else{
        	sb.append("    /**\n");
        	sb.append("     * Sets " + ad.getName() + " to the specified value.\n");
        	sb.append("     * @param value A value compatible with " + attrType + "\n");
        	sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
        	sb.append("    static public void set" + functionName + "(DmwWrapper corew, Object value) throws DmcValueException {\n");
        	sb.append("        DmcAttribute<?> attr = corew.getDmcObject().get(" + staticName + ");\n");
        	sb.append("        if (attr == null){\n");
        	sb.append("            attr = new " + attrType + "();\n");
			sb.append("            addAuxIfRequired(corew);\n");
			sb.append("        }\n");
        	sb.append("        \n");
        	sb.append("        attr.set(value);\n");
        	sb.append("        corew.getDmcObject().set(" + staticName + ",attr);\n");
        	sb.append("    }\n\n");

    	}
	}
	
	/**
	 * 
	 * @param ad The attribute definition we're creating the access functions for.
	 * @param sb Where we're appending the functions.
	 */
	void formatAUXMV(ClassDefinition cd, AttributeDefinition ad, StringBuffer sb){
		// The fully qualified name of the DmcType for the attribute
    	String typeClassName = ad.getType().getTypeClassName();
    	
    	// The last part typeClassName
    	String attrType = "DmcType" + ad.getType().getName();
    	
    	// 
    	String typeName = ad.getType().getName().getNameString();
    	
    	// Complicated stuff. When we're referring to wrapped objects through a reference
    	// attribute we can have two cases. Either, we have a straight wrapper e.g. generated.dmw.classDMW
    	// or, the generated wrapper has been extended e.g.  extended.class
    	// So, we need to handle both of these cases and the internally generated type gives us
    	// this info via the auxHolderType
    	String auxHolderClass = ad.getType().getAuxHolderClass();
    	
    	if (ad.getType().getIsRefType()){
    		attrType = attrType + "REF";
    	}

    	if (typeClassName != null){
    		int lastPeriod = typeClassName.lastIndexOf('.');
    		if (lastPeriod != -1){
    			attrType = typeClassName.substring(lastPeriod + 1);
    		}
    	}

    	StringBuffer 	functionName 	= new StringBuffer();
    	functionName.append(ad.getName());
    	functionName.setCharAt(0,Character.toUpperCase(functionName.charAt(0)));
    	
    	attrType = attrType + "MV";
    	
    	// Remove attribute
    	
    	sb.append("    /**\n");
		sb.append("     * Removes the " + ad.getName() + " attribute from the object.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    static public DmcAttribute<?> rem" + functionName + "(DmwWrapper corew){\n");
		sb.append("        if (corew == null)\n");
		sb.append("            return(null);\n");
		sb.append("        DmcAttribute<?> rc = corew.getDmcObject().rem(__" + ad.getName() + ");\n");
		sb.append("        removeAuxIfRequired(corew);\n");
		sb.append("        return(rc);\n");
		sb.append("    }\n");
		sb.append("\n");
		
    	////////////////////////////////////////////////////////////////////////////////
    	// convenience functions
    	
    	sb.append("    /**\n");
		sb.append("     * @return The number of " + typeName + "DMO items.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    static public int get" + functionName + "Size(DmwWrapper corew){\n");
		sb.append("        DmcAttribute<?> attr = corew.getDmcObject().get(__" + ad.getName() + ");\n");
		sb.append("        if (attr == null)\n");
		sb.append("            return(0);\n");
		sb.append("        \n");
		sb.append("        return(attr.getMVSize());\n");
		sb.append("    }\n\n");
    	
    	sb.append("    /**\n");
		sb.append("     * @return true if there are no " + typeName + "DMO items.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    static public boolean get" + functionName + "IsEmpty(DmwWrapper corew){\n");
		sb.append("        DmcAttribute<?> attr = corew.getDmcObject().get(__" + ad.getName() + ");\n");
		sb.append("        if (attr == null)\n");
		sb.append("            return(true);\n");
		sb.append("        \n");
		sb.append("        return(false);\n");
		sb.append("    }\n\n");
    	
    	sb.append("    /**\n");
		sb.append("     * @return true if there are any " + typeName + "DMO items.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    static public boolean get" + functionName + "HasValue(DmwWrapper corew){\n");
		sb.append("        DmcAttribute<?> attr = corew.getDmcObject().get(__" + ad.getName() + ");\n");
		sb.append("        if (attr == null)\n");
		sb.append("            return(false);\n");
		sb.append("        \n");
		sb.append("        return(true);\n");
		sb.append("    }\n\n");


		////////////////////////////////////////////////////////////////////////////////
    	// getter

		if (ad.getType().getIsRefType()){
			String itClass = ad.getType().getOriginalClass().getDmwIteratorClass();
			
	    	sb.append("    /**\n");
			sb.append("     * @return An Iterator of " + typeName + "DMO objects.\n");
			sb.append("     */\n");
			sb.append("    @SuppressWarnings(\"unchecked\")\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    static public " + itClass + " get" + functionName + "Iterable(DmwWrapper corew){\n");
			sb.append("        DmcAttribute attr = corew.getDmcObject().get(__" + ad.getName() + ");\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return(" + itClass + ".emptyList);\n");
			sb.append("        \n");
			sb.append("        return(new " + itClass + "(attr.getMV()));\n");
			sb.append("    }\n\n");

			////////////////////////////////////////////////////////////////////////////////
	    	// adder

			sb.append("    /**\n");
			sb.append("     * Adds another " + ad.getName() + " value.\n");
			sb.append("     * @param value A value compatible with " + typeName + "\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    static public DmcAttribute<?> add" + functionName + "(DmwWrapper corew, " + auxHolderClass + " value) throws DmcValueException {\n");
	    	sb.append("        DmcAttribute<?> attr = corew.getDmcObject().get(__" + ad.getName() + ");\n");
	    	sb.append("        if (attr == null){\n");
	    	sb.append("            attr = new " + attrType+ "();\n");
	    	sb.append("            attr.add(value.getDmcObject());\n");
	    	sb.append("            addAuxIfRequired(corew);\n");
	    	sb.append("        }\n");
	    	sb.append("        else\n");
	    	sb.append("            attr.add(value);\n");
	    	sb.append("        \n");
	    	sb.append("        corew.getDmcObject().add(__" + ad.getName() + ",attr);\n");
	    	sb.append("        \n");
	    	sb.append("        return(attr);\n");
			sb.append("    }\n\n");

	    	////////////////////////////////////////////////////////////////////////////////
	    	// deleter

			sb.append("    /**\n");
			sb.append("     * Deletes a " + ad.getName() + " value.\n");
			sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
//			sb.append("    @SuppressWarnings(\"unchecked\")\n");
			sb.append("    static public void del" + functionName + "(DmwWrapper corew, " + auxHolderClass + " value){\n");
//			sb.append("        " + attrType + " attr = (" + attrType + ") corew.getDmcObject().del(__" + ad.getName() + ", value);\n");
			sb.append("        corew.getDmcObject().del(__" + ad.getName() + ", value);\n");
			
			// NOTE: COMPLICATED STUFF - when we have a utility object that we're using to populate a modifier, we
			// have to handle the case where the object doesn't contain the attribute we're trying to delete the
			// value from. So, we have to create a holder for the attribute and add the operation directly to the modifier.
			
//	    	sb.append("        if (attr == null){\n");
//	    	sb.append("            DmcTypeModifier mods = corew.getModifier();\n");
//	    	sb.append("            if (mods != null){\n");
//	    	sb.append("        		   try {\n");
//	    	sb.append("        	           attr = new " + attrType + "();\n");
//	    	sb.append("        		       attr.setName(__" + ad.getName() + ".name);\n");
//	    	sb.append("        		       attr.add(value.getDmcObject());\n");
//	    	sb.append("        		       mods.add(new Modification(ModifyTypeEnum.DEL, attr));\n");
//	    	sb.append("        	       } catch (DmcValueException e) {\n");
//	    	sb.append("        		       e.printStackTrace();\n");
//	    	sb.append("        	       }\n");
//	    	sb.append("        	   }\n");
//	    	sb.append("            return;\n");
//	    	sb.append("        }\n");
//	    	sb.append("        \n");
//	    	
//	    	
//	    	sb.append("        attr.del(value.getDmcObject());\n");
	    	
	    	
//	    	sb.append("        \n");
//	    	sb.append("        ArrayList<" + auxHolderClass + "> refs = (ArrayList<" + auxHolderClass + ">) attr.getAuxData();\n");
//	    	sb.append("        \n");
//	    	sb.append("        if (refs != null){\n");
//	    	sb.append("            refs.remove(value);\n");
//	    	sb.append("        }\n");
	    	sb.append("        removeAuxIfRequired(corew);\n");
			sb.append("    }\n\n");


		}
		else{
	    	sb.append("    /**\n");
			sb.append("     * @return An Iterator of " + typeName + " objects.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    static public Iterator<" + typeName + "> get" + functionName + "(DmwWrapper corew){\n");
			sb.append("        return(corew.getDmcObject().get(__" + ad.getName() + ");\n");
			sb.append("    }\n\n");
			
	    	////////////////////////////////////////////////////////////////////////////////
	    	// adder

			sb.append("    /**\n");
			sb.append("     * Adds another " + ad.getName() + " value.\n");
			sb.append("     * @param value A value compatible with " + typeName + "\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    static public void add" + functionName + "(DmwWrapper corew, Object value) throws DmcValueException {\n");
	    	sb.append("        corew.getDmcObject().add(__" + ad.getName() + "(, value);\n");
			sb.append("    }\n\n");
			
	    	////////////////////////////////////////////////////////////////////////////////
	    	// deleter

			sb.append("    /**\n");
			sb.append("     * Deletes a " + ad.getName() + " value.\n");
			sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    static public void del" + functionName + "(DmwWrapper corew, Object value){\n");
			sb.append("        corew.getDmcObject().del(__" + ad.getName() + ", value);\n");
	    	sb.append("        removeAuxIfRequired(corew);\n");
			sb.append("    }\n\n");
		}
		
	}

}
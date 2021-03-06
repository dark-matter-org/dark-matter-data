//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2010 dark-matter-data committers
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
package org.dmd.dms.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

import org.dmd.dmc.types.DefinitionName;
import org.dmd.dms.ActionDefinition;
import org.dmd.dms.AttributeDefinition;
import org.dmd.dms.ClassDefinition;
import org.dmd.dms.DmsDefinition;
import org.dmd.dms.EnumDefinition;
import org.dmd.dms.SchemaDefinition;
import org.dmd.dms.SchemaManager;
import org.dmd.dms.TypeDefinition;
import org.dmd.dms.generated.enums.ClassTypeEnum;
import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.parsing.Token;

/**
 * This class generates HTML from Dark Matter Schema (DMS) definitions stored in
 * a SchemaDefinition object.
 * <P>
 * Although DMS is readable text, it's not particularly easy to navigate in its
 * textual state. However, when presented in HTML format, the descriptions are
 * much more user friendly.
 */

public class SchemaDocHtmlFormatter {

    /**
     * The schema's classes sorted by name.
     * Key: String
     * Data: ClassDefinition
     */
    TreeMap<DefinitionName,ClassDefinition> classes;

    /**
     * The schema's types sorted by name.
     * Key: String
     * Data: TypeDefinition
     */
    TreeMap<DefinitionName,TypeDefinition> types;

    /**
     * The schema's attributes sorted by name.
     * Key: String
     * Data: AttributeDefinition
     */
    TreeMap<DefinitionName,AttributeDefinition> attrs;

    /**
     * The schema's actions sorted by name.
     * Key: String
     * Data: ActionDefinition
     */
    TreeMap<DefinitionName, ActionDefinition> actions;

    /**
     * A treemap used to sort various definitions.
     */
    TreeMap<DefinitionName,DmsDefinition> util;

    /**
     * The global index of all definitions.
     * Key:   String (A-Z)
     * Value: TreeMap
     *
     * TreeMap...
     * Key:   String (uppercase of definition name)
     * Value: Token  (whose value is the mixed case definition name and the
     *                user data is an GenericObject - an IMD definition)
     */
    TreeMap<String,TreeMap<String,Token>>     index;

    /**
     * The string that stores the current index references, one for each letter
     * that has any definitions.
     */
    String      indexRefHTML;

    /**
     * The current HTML directory from the web server where the javadoc is available.
     */
    String      javaDir;

    /**
     * The current schema manager.
     */
    SchemaManager    schema;


    /**
     * The rule manager.
     */
    /**
     * TODO put the rule manager back in
     */
//    PmfRuleManager      rules;
    
    String organization;
    String schemaUser;
    String userEmail;

    /**
     * Constructs a new IMD HTML formatter.
     */
    public SchemaDocHtmlFormatter(String org, String user, String email){
        classes = new TreeMap<DefinitionName,ClassDefinition>();
        types   = new TreeMap<DefinitionName,TypeDefinition>();
        attrs   = new TreeMap<DefinitionName,AttributeDefinition>();
        actions = new TreeMap<DefinitionName,ActionDefinition>();
        util    = new TreeMap<DefinitionName,DmsDefinition>();
        schema  = null;
        
        organization = org;
        schemaUser = user;
        userEmail = email;
//        rules   = null;
    }

//    /**
//     * This dumps all the schema information in the specified schema manager to
//     * a set of files in the specified directory.
//     * @param sd The schema manager whose data is to be formatted.
//     * @param src The source directory.
//     * @param dir The directory to which we'll dump.
//     * @param jd The javadoc diretory on the webserver.
//     */
//    public void dumpHtml(SchemaManager sd, String src, String dir, String jd){
//        Iterator<SchemaDefinition>    it = null;
//
//        schema  = sd;
//
//        javaDir = jd;
//
//        generateIndex(dir);
//
//        // System.out.println("Dumping " + dir + File.separator + MetaSchemaAG.meta_metaSchema.getName() + ".shtml");
//        it = schema.getSchemas();
//        while(it.hasNext()){
//            SchemaDefinition    s = (SchemaDefinition)it.next();
//            System.out.println("Dumping " + dir + File.separator + s.getObjectName() + ".shtml");
//            dumpHtml(s,dir + File.separator + s.getObjectName() + ".shtml");
//        }
//
//        dumpClassHierarchy(dir);
//
//        dumpInstanceHierarchy(dir);
//
//        dumpClassListing(dir);
//
//    }

    /**
     * This dumps the specified schema definition in HTML format to the specified
     * file.
     * @param sd The schema to be formatted.
     * @param fn The file to which we'll dump.
     */
	void dumpHtml(SchemaDefinition sd, String fn){
//        Iterator            it      = null;
        ClassDefinition         cd      = null;
        TypeDefinition          td      = null;
        AttributeDefinition     ad      = null;
        ActionDefinition        acd     = null;
        Iterator<DefinitionName>            entries = null;

        classes.clear();
        attrs.clear();
        actions.clear();
        types.clear();

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(fn));

            // System.out.println("The schema object:\n\n" + sd + "\n\n");
            out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\"\n");
            out.write("        \"http://www.w3.org/TR/REC-html40\">\n");
            out.write("<HTML>\n");
            out.write("<HEAD>\n");
            out.write("<TITLE> " + organization + " - The " + sd.getObjectName() + " Schema Documentation </TITLE>\n");
            out.write("<LINK href=\"/standard.css\" rel=\"stylesheet\" type=\"text/css\">\n");
            out.write("</HEAD>\n");
            out.write("<BODY BGCOLOR=\"FFFFFF\">\n\n");

            // The whole page is in a table
            out.write("<TABLE WIDTH=600 CELLPADDING=10> <tr> \n");

            out.write("<TD WIDTH=120 CLASS=\"sidebar2\" VALIGN=TOP>\n");
//            out.write("<!--#include virtual=\"navLinks.html\" --> <P> </TD>\n");
            out.write("<TD>\n");

            out.write("<CENTER> \n");
            out.write("<P CLASS=\"pagehead\"> The " + sd.getObjectName() + " Schema \n");
            out.write("</CENTER> \n");

            out.write(indexRefHTML);

            out.write("<TABLE>\n");
            /*
            out.write("<TR WIDTH=100>\n");
            out.write("<TD CLASS=\"stronghead\"> Schema </TD>\n");
            out.write("<TD CLASS=\"pagetext\">");
            out.write(sd.getName() + "\n</TD>\n");
            out.write("</tr>\n");
            */
            out.write("<tr>\n");
            out.write("<TD VALIGN=TOP CLASS=\"stronghead\"> Description </TD>\n");
            out.write("<TD CLASS=\"pagetextUnjust\">\n");
            out.write(getFormattedDescription(sd.getDescription()));
            out.write("</TD> </tr> \n");

            if (sd.getSchemaPackage() != null){
                out.write("<tr>\n");
                out.write("<TD VALIGN=TOP CLASS=\"stronghead\"> Package </TD>\n");
                out.write("<TD CLASS=\"pagetextUnjust\">\n");
                String withSlashes = sd.getSchemaPackage().replace('.','/');
                out.write("<A HREF=\"" + javaDir + File.separator + withSlashes + "/package-summary.html\"> " + sd.getSchemaPackage() + " </A>\n");
                out.write("</TD> </tr> \n");
            }

            Iterator<String> sdit;
            if ( (sdit = sd.getDependsOn()) != null){
                TreeSet<String> ts = new TreeSet<String>();
                while(sdit.hasNext()){
                    ts.add(sdit.next());
                }
                out.write("<tr> <TD VALIGN=TOP CLASS=\"stronghead\"> " + "Depends on </TD>\n");
                out.write("<TD CLASS=\"pagetextUnjust\">\n");
                sdit = ts.iterator();

                while(sdit.hasNext()){
                    String s = (String)sdit.next();
                    out.write("<A HREF=\"" + s + ".shtml\"> " + s + "</A> <BR>\n");
                }
                out.write("</TD> </tr> \n");
            }

            out.write("</TABLE> <P>\n");
            // out.write();

            // out.write("</TABLE>");

            Iterator<TypeDefinition> tdit;
            if ((tdit = sd.getTypeDefList()) != null){
                while(tdit.hasNext()){
                    td = ((TypeDefinition) tdit.next());
                    types.put(td.getObjectName(),td);
                }
            }

            Iterator<AttributeDefinition> adit;
            if ((adit = sd.getAttributeDefList()) != null){
                while(adit.hasNext()){
                    ad = ((AttributeDefinition) adit.next());
                    attrs.put(ad.getObjectName(),ad);
                }
            }

            Iterator<ActionDefinition> actit;
            if ((actit = sd.getActionDefList()) != null){
                while(actit.hasNext()){
                    acd = ((ActionDefinition) actit.next());
                    actions.put(acd.getObjectName(),acd);
                }
            }

            Iterator<ClassDefinition> cdit;
            if ((cdit = sd.getClassDefList()) != null){
                while(cdit.hasNext()){
                    cd = ((ClassDefinition) cdit.next());
                    classes.put(cd.getObjectName(),cd);
                }
            }

            out.write("<P CLASS=\"stronghead\">\nClass Index<BR>Total Classes: ");
            out.write(classes.size() + "\n<P CLASS=\"pagetext\">\n");
            entries = classes.keySet().iterator();
            while(entries.hasNext()){
                cd = (ClassDefinition) classes.get(entries.next());
                out.write("<A HREF=\"#" + cd.getObjectName() + "\"> " + cd.getObjectName() + "</A> <BR>\n");
            }

            out.write("<P CLASS=\"stronghead\">\nAttribute Index<BR>Total Attributes: ");
            out.write(attrs.size() + "\n<P CLASS=\"pagetext\">\n");
            entries = attrs.keySet().iterator();
            while(entries.hasNext()){
                ad = (AttributeDefinition) attrs.get(entries.next());
                out.write("<A HREF=\"#" + ad.getObjectName() + "\"> " + ad.getObjectName() + "</A> <BR>\n");
            }

            out.write("<P CLASS=\"stronghead\"> Action Index<BR>Total Actions: ");
            out.write(actions.size() + "\n<P CLASS=\"pagetext\">\n");
            entries = actions.keySet().iterator();
            while(entries.hasNext()){
                acd = (ActionDefinition) actions.get(entries.next());
                out.write("<A HREF=\"#" + acd.getObjectName() + "\"> " + acd.getObjectName() + "</A> <BR>\n");
            }

            if (types.size() > 0){
                out.write("<P CLASS=\"stronghead\">\nType Index<BR>Total Types: ");
                out.write(types.size() + "\n<P CLASS=\"pagetext\">\n");
                entries = types.keySet().iterator();
                while(entries.hasNext()){
                    td = (TypeDefinition) types.get(entries.next());
                    out.write("<A HREF=\"#" + td.getObjectName() + "\"> " + td.getObjectName() + "</A> <BR>\n");
                }
            }

            this.formatClasses(sd,out);

            this.formatAttributes(sd,out);

            this.formatActions(sd,out);

            this.formatTypes(sd,out);

            out.write(getFooter(sd.getObjectName() + ".shtml"));

            out.write("</TD> </tr> </TABLE>");
            // out.write("</TABLE>\n\n");
            out.write("</BODY>\n");
            out.write("</HTML>\n");

            out.close();
        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }
    }
	
	String getFormattedDescription(Iterator<String> description){
		if (description == null)
			return("");
		
		StringBuffer sb = new StringBuffer();
		
		while(description.hasNext()){
			sb.append(description.next());
			if (description.hasNext())
				sb.append("</p>");
		}
		
		return(sb.toString());
	}

    /**
     * Formats each class definition.
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
	private void formatClasses(SchemaDefinition currSchema, BufferedWriter out){
        Iterator<DefinitionName>	entries = classes.keySet().iterator();
        ClassDefinition		cd      = null;
        Iterator            it      = null;
//        AttributeDefinition     ad;

        if (classes.size() == 0)
            return;

        try{
            out.write("<P CLASS=\"stronghead\">\nClass Definitions \n");
            out.write("<TABLE> \n");
            while(entries.hasNext()){
                cd = (ClassDefinition) classes.get(entries.next());
                out.write("<tr> <TH COLSPAN=2> <HR SIZE=3 NOSHADE> </TH> </tr>\n");

                out.write("<tr> <TD WIDTH=100 CLASS=\"stronghead\"> Class </TD>");
                out.write("<TD CLASS=\"pagetext\">");
                out.write("<A NAME=\"" + cd.getObjectName() + "\">" +  cd.getObjectName() + "</A>\n");
                if (cd.getAbbrev() != null){
                    out.write(" (" + cd.getAbbrev() + ")");
                }
                out.write("</TD></tr><tr>\n");

                if (cd.getJavaClass() != null){
                    out.write("<tr> <TD  CLASS=\"pagetextUnjust\"> Java Class </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    String withSlashes = cd.getJavaClass().replace('.','/');
                    out.write("<A HREF=\"" + javaDir + File.separator + withSlashes + ".html\"> " + cd.getJavaClass() + " </A>\n");
                    out.write("</TD></tr><tr>\n");
                }

                out.write("<tr> <TD  CLASS=\"pagetextUnjust\"> Class Type </TD>");
                out.write("<TD CLASS=\"pagetext\">");
                out.write(cd.getClassType() + "\n");
//                out.write(MetaSchemaAG.meta_CLASSTYPEE.getEnumValue(cd.getClassType()) + "\n");
                out.write("</TD></tr><tr>\n");

//                out.write("<tr> <TD  CLASS=\"pagetext\"> Data Type </TD>");
//                out.write("<TD CLASS=\"pagetext\">");
//                out.write(cd.getDataType() + "\n");
//                out.write("</TD></tr><tr>\n");

             // reposName moved to the DMR SCHEMA
//                if (cd.getReposName() != null){
//                    out.write("<tr> <TD  CLASS=\"pagetext\"> Repository Name </TD>");
//                    out.write("<TD CLASS=\"pagetext\">");
//                    out.write(cd.getReposName() + "\n");
//                    out.write("</TD></tr><tr>\n");
//                }

                if (cd.getDerivedFrom() != null){
                    out.write("<tr> <TD VALIGN=TOP CLASS=\"pagetext\"> Derived from </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    if (cd.getDerivedFrom().getDefinedIn() == currSchema)
                        out.write("<A HREF=\"#" + cd.getDerivedFrom().getObjectName() + "\">" +  cd.getDerivedFrom().getObjectName() + "</A> \n");
                    else
                        out.write("<A HREF=\"" + cd.getDerivedFrom().getDefinedIn().getObjectName() + ".shtml" + "#" + cd.getDerivedFrom().getObjectName() + "\">" +  cd.getDerivedFrom().getObjectName() + "</A> \n");
                    out.write("</TD></tr><tr>\n");
                }

//                if ((it = cd.getImplements()) != null){
//                    Iterator sorted = sort(it);
//                    out.write("<tr> <TD VALIGN=TOP CLASS=\"pagetext\"> Implements </TD>");
//                    out.write("<TD CLASS=\"pagetext\">");
//                    out.write(formatTable(sorted,util.size(),4));
//                    out.write("</TD></tr><tr>\n");
//                }

                if (cd.getAllImplementors() != null) {
                    it = cd.getAllImplementors().iterator();
                    Iterator sorted = sort(it);
                    out.write("<tr> <TD VALIGN=TOP CLASS=\"pagetext\"> Implementors </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    out.write(formatTable(sorted,util.size(),4));
                    out.write("</TD></tr><tr>\n");
                }

                if ((it = cd.getDerivedClasses()) != null){
                    Iterator sorted = sort(it);
                    out.write("<tr> <TD VALIGN=TOP CLASS=\"pagetext\"> Derived classes </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    out.write(formatTable(sorted,util.size(),4));
                    out.write("</TD></tr><tr>\n");
                }

                if ((it = cd.getMust()) != null){
                    Iterator sorted = sort(it);
                    out.write("<tr> <TD VALIGN=TOP CLASS=\"pagetext\"> Must have </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    out.write(formatTable(sorted,util.size(),4));
                    out.write("</TD></tr><tr>\n");
                }

                if ((it = cd.getMay()) != null){
                    Iterator sorted = sort(it);
                    out.write("<tr> <TD VALIGN=TOP CLASS=\"pagetext\"> May have </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    out.write(formatTable(sorted,util.size(),4));
                    out.write("</TD></tr><tr>\n");
                }

                if ((it = cd.getActions()) != null){
                    Iterator sorted = sort(it);
                    out.write("<tr> <TD VALIGN=TOP CLASS=\"pagetext\"> Actions </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    out.write(formatTable(sorted,util.size(),4));
                    out.write("</TD></tr><tr>\n");
                }

                out.write("<tr> <TD VALIGN=TOP CLASS=\"pagetext\"> Description </TD>");
                out.write("<TD CLASS=\"pagetext\">");
                out.write("<A NAME=\"" + cd.getDescription() + "\">" +  cd.getDescription() + "</A>\n");
                out.write("</TD></tr><tr>\n");

            }
            out.write("</TABLE>\n\n");
        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }
    }

    /**
     * Formats each attribute definition.
     */
	private void formatAttributes(SchemaDefinition currSchema, BufferedWriter out){
        Iterator<DefinitionName>            entries = attrs.keySet().iterator();
        AttributeDefinition     ad      = null;

        try{
            out.write("<P CLASS=\"stronghead\">\nAttribute Definitions \n");
            out.write("<TABLE> \n");
            while(entries.hasNext()){
                ad = (AttributeDefinition) attrs.get(entries.next());
                out.write("<tr> <TH COLSPAN=2> <HR SIZE=3 NOSHADE> </TH> </tr>\n");
                out.write("<tr> <TD CLASS=\"stronghead\"> Attribute </TD>");
                out.write("<TD CLASS=\"pagetext\">");
                out.write("<A NAME=\"" + ad.getObjectName() + "\">" +  ad.getObjectName() + "</A>\n");
                if (ad.getAbbrev() != null){
                    out.write(" (" + ad.getAbbrev() + ")");
                }
                out.write("</TD></tr><tr>\n");

                out.write("<tr> <TD VALIGN=TOP CLASS=\"pagetext\"> Type </TD>");
                out.write("<TD CLASS=\"pagetext\">");
                
//                Boolean mv = ad.getIsMultiValued();
                				
				out.write(ad.getValueType().toString());

//                if ( (mv != null) && (mv == true) )
//                    out.write("Multi-valued ");
//                else
//                    out.write("Single-valued ");
                

                out.write("<A HREF=\"" +  ad.getType().getDefinedIn().getObjectName() + ".shtml#" +  ad.getType().getObjectName() + "\">" +  ad.getType().getObjectName() + "</A>\n");
                out.write("</TD></tr><tr>\n");

//                out.write("<tr> <TD  CLASS=\"pagetext\"> Data Type </TD>");
//                out.write("<TD CLASS=\"pagetext\">");
//                out.write(ad.getDataType() + "\n");
//                out.write("</TD></tr><tr>\n");

             // reposName moved to the DMR SCHEMA
//                if (ad.getReposName() != null){
//                    out.write("<tr> <TD  CLASS=\"pagetext\"> Repository Name </TD>");
//                    out.write("<TD CLASS=\"pagetext\">");
//                    out.write(ad.getReposName() + "\n");
//                    out.write("</TD></tr><tr>\n");
//                }

                if (ad.getUsedByClassesSize() > 0){
                    out.write("<tr> <TD  CLASS=\"pagetext\"> Used In Classes </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    for (int i=0; i<ad.getUsedByClassesSize(); i++)
                        out.write(defLink((ClassDefinition)ad.getUsedByClassesNth(i),null) + " ");
                    out.write("\n</TD></tr><tr>\n");
                }

                if (ad.getUsedByActionsSize() > 0){
                    out.write("<tr> <TD  CLASS=\"pagetext\"> Used In Actions </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    for (int i=0; i<ad.getUsedByActionsSize(); i++)
                        out.write(defLink((ActionDefinition)ad.getUsedByActionsNth(i),null) + " ");
                    out.write("\n</TD></tr><tr>\n");
                }

                out.write("<tr> <TD VALIGN=TOP CLASS=\"pagetext\"> Description </TD>");
                out.write("<TD CLASS=\"pagetext\">");
                out.write("<A NAME=\"" + ad.getDescription() + "\">" +  ad.getDescription() + "</A>\n");
                out.write("</TD></tr><tr>\n");
            }
            out.write("</TABLE>\n\n");
        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }
    }

    /**
     * Formats each attribute definition.
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
	private void formatActions(SchemaDefinition currSchema, BufferedWriter out){
        Iterator<DefinitionName>	entries = actions.keySet().iterator();
        ActionDefinition    	ad      = null;
        Iterator        it      = null;

        try{
            out.write("<P CLASS=\"stronghead\">\nAction Definitions \n");
            out.write("<TABLE> \n");
            while(entries.hasNext()){
                ad = (ActionDefinition) actions.get(entries.next());
                out.write("<tr> <TH COLSPAN=2> <HR SIZE=3 NOSHADE> </TH> </tr>\n");
                out.write("<tr> <TD CLASS=\"stronghead\"> Action </TD>");
                out.write("<TD CLASS=\"pagetext\">");
                out.write("<A NAME=\"" + ad.getObjectName() + "\">" +  ad.getObjectName() + "</A>\n");
                out.write("</TD></tr><tr>\n");

                if ((it = ad.getMustParm()) != null){
                    Iterator sorted = sort(it);
                    out.write("<tr> <TD VALIGN=TOP CLASS=\"pagetext\"> Must parms </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    out.write(formatTable(sorted,util.size(),4));
                    out.write("</TD></tr><tr>\n");
                }

                if ((it = ad.getMayParm()) != null){
                    Iterator sorted = sort(it);
                    out.write("<tr> <TD VALIGN=TOP CLASS=\"pagetext\"> May parms </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    out.write(formatTable(sorted,util.size(),4));
                    out.write("</TD></tr><tr>\n");
                }

                if (ad.usedByClasses != null){
                    out.write("<tr> <TD  CLASS=\"pagetext\"> Used In Classes </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    for (int i=0; i<ad.usedByClasses.size(); i++)
                        out.write(defLink((ClassDefinition)ad.usedByClasses.get(i),null) + " ");
                    out.write("\n</TD></tr><tr>\n");
                }

                if (ad.attachedToClasses != null){
                    out.write("<tr> <TD  CLASS=\"pagetext\"> Attached To Classes </TD>");
                    out.write("<TD CLASS=\"pagetext\">");
                    for (int i=0; i<ad.attachedToClasses.size(); i++)
                        out.write(defLink((ClassDefinition)ad.attachedToClasses.get(i),null) + " ");
                    out.write("\n</TD></tr><tr>\n");
                }

                out.write("<tr> <TD VALIGN=TOP CLASS=\"pagetext\"> Description </TD>");
                out.write("<TD CLASS=\"pagetext\">");
                out.write("<A NAME=\"" + ad.getDescription() + "\">" +  ad.getDescription() + "</A>\n");
                out.write("</TD></tr><tr>\n");
            }
            out.write("</TABLE>\n\n");
        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }
    }

    /**
     * Formats each type definition.
     */
	private void formatTypes(SchemaDefinition currSchema, BufferedWriter out){
        Iterator<DefinitionName>        entries = types.keySet().iterator();
        TypeDefinition      td      = null;

        try{
            out.write("<P CLASS=\"stronghead\">\nType Definitions \n");
            out.write("<TABLE> \n");
            while(entries.hasNext()){
                td = (TypeDefinition) types.get(entries.next());
                out.write("<tr> <TH COLSPAN=2> <HR SIZE=3 NOSHADE> </TH> </tr>\n");
                out.write("<tr> <TD CLASS=\"stronghead\"> Type </TD>");
                out.write("<TD CLASS=\"pagetext\">");
                out.write("<A NAME=\"" + td.getObjectName() + "\">" +  td.getObjectName() + "</A>\n");
                out.write("</TD></tr><tr>\n");

                out.write("<tr> <TD CLASS=\"pagetext\" VALIGN=TOP> Description </TD>");
                out.write("<TD CLASS=\"pagetext\">");
                out.write("<A NAME=\"" + td.getDescription() + "\">" +  td.getDescription() + "</A>\n");
                out.write("</TD></tr><tr>\n");

                // TODO need to dump the enum definitions separately
                
//                if (BooleanVar.equals(true,td.getIsEnumType())){
//                    out.write("<tr>\n");
//                    out.write("<TD VALIGN=TOP CLASS=\"pagetext\"> Values </TD>");
//                    out.write("<TD>\n");
//
//                    Iterator it = td.getEnumTreeMap().values().iterator();
//
//                    if (it != null){
//                        out.write("<TABLE>\n");
//                        while(it.hasNext()){
//                            DmdEnumValueDef evd = (DmdEnumValueDef)it.next();
//                            out.write("<tr>");
//                            out.write("<TD VALIGN=TOP> " + evd.getEnumString() + " </TD>\n");
//                            out.write("<TD VALIGN=TOP> " + evd.getEnumInt().longValue() + " </TD>\n");
//                            out.write("<TD> " + evd.getDescription() + " </TD>\n");
//                            out.write("</tr>");
//                        }
//                        out.write("</TABLE>\n");
//                    }
//
//                    out.write("</TD>\n");
//                    out.write("</tr>\n");
//                }
            }
            out.write("</TABLE>\n\n");

        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }
    }

    /**
     * Sorts generic objects - schema definitions on the basis of their names.
     */
    public Iterator<DmsDefinition> sort(Iterator<DmsDefinition> it){
        util = new TreeMap<DefinitionName,DmsDefinition>();
        while(it.hasNext()){
        	
        	DmsDefinition    go = (DmsDefinition)it.next();
            util.put(go.getObjectName(),go);
        }
        return(util.values().iterator());
    }

    /**
     * Formats a table of generic objects.
     * @param it An iterator over a set of generic objects (definitions)
     * @param size The number of elements in the iterator.
     * @param cols The number of columns in the table.
     */
    public String formatTable(Iterator<DmsDefinition> it, int size, int cols){
        int curr    = 1;
        StringBuffer    sb = new StringBuffer();

        sb.append("<TABLE>\n");
        sb.append("<tr>\n");
        while(it.hasNext()){
        	DmsDefinition go = it.next();
            sb.append("  <TD CLASS=\"pagetextUnjust\">\n");
            SchemaDefinition sd = go.getDefinedIn();
            
//            DmdTypeSCHEMAREF ref = (DmdTypeSCHEMAREF)go.getAttr(MetaSchemaAG._definedIn);
//            DmdObjRefValue   val = (DmdObjRefValue)ref.getSV();
            
            sb.append("<A HREF=\"" + sd.getObjectName() + ".shtml" + "#" + go.getObjectName() + "\">" +  go.getObjectName() + "</A> \n");
//            sb.append("<A HREF=\"" + val.getName() + ".shtml" + "#" + go.getName() + "\">" +  go.getName() + "</A> \n");
//            sb.append("<A HREF=\"" + go.getAttr(MetaSchemaAG.meta_definedIn).getDmdObjRef().obj().getName() + ".shtml" + "#" + go.getName() + "\">" +  go.getName() + "</A> \n");
            sb.append("  </TD>\n");
            if ((curr % cols) == 0){
                if (curr < size)
                    sb.append("</tr>\n<tr>\n");
            }
            curr++;
        }
        sb.append("</tr>\n</TABLE>\n");

        return(sb.toString());
    }

	@SuppressWarnings("unlikely-arg-type")
	public void generateIndex(String dir){
//        Iterator<DefinitionName>        it  = null;
        StringBuffer    sb  = new StringBuffer();
        initIndex();

        DebugInfo.debugWithTrace("\n\n*** NEED TO USE THE SCHEMA'S GLOBAL INDEX ***\n\n");
//        it = schema.allDefs.keySet().iterator();
//        while(it.hasNext()){
//            DefinitionName  key         = it.next();
//            String  firstChar   = key.getNameString().substring(0,1).toUpperCase();
//            TreeMap<String,Token> charTree    = index.get(firstChar);
//
//            charTree.put(key.getNameString().toUpperCase(), new Token(key.getNameString(),0,schema.allDefs.get(key)));
//        }

        // Generate the index reference header in HTML format - this will be
        // placed at the top of each index page.
        sb.append("<P> <HR SIZE=3 NOSHADE>");
        sb.append("<TABLE>\n");
        sb.append("<tr> <TD CLASS=\"pagetextUnjust\"> <A HREF=\"index-allSchemas.shtml\"> Schema Summary </A></TD><TD></TD> </tr>\n");
        sb.append("<tr> <TD CLASS=\"pagetextUnjust\"> <A HREF=\"classHierarchy.shtml\"> Class Hierarchy </A></TD><TD></TD> </tr>\n");
        sb.append("<tr> <TD CLASS=\"pagetextUnjust\"> <A HREF=\"instanceHierarchy.shtml\"> Instance Hierarchy </A></TD><TD></TD> </tr>\n");
        sb.append("<tr> <TD CLASS=\"pagetextUnjust\"> Definitions Index </TD> <TD>\n");

        Iterator<String> indexIT = index.keySet().iterator();
        while(indexIT.hasNext()){
            String key = indexIT.next();
            TreeMap<String,Token>     tm = index.get(key);
//            String      fn = new String(dir + File.separator + "index-" + key + ".shtml");

            if (tm.size() > 0){
                sb.append("<A HREF=\"index-" + key + ".shtml\">" + key + "</A> \n");
            }
            else{
                sb.append(key + "  ");
            }
        }
        sb.append("</TD> </tr> </TABLE> <HR SIZE=3 NOSHADE> <P>\n");
        indexRefHTML = sb.toString();

        // Generate the schema summary
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(dir + "/index-allSchemas.shtml"));

            out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\"\n");
            out.write("        \"http://www.w3.org/TR/REC-html40\">\n");
            out.write("<HTML>\n");
            out.write("<HEAD>\n");
            out.write("<LINK href=\"/standard.css\" rel=\"stylesheet\" type=\"text/css\">\n");
            out.write("<TITLE> " + organization + " - Schema Summary </TITLE>\n");
            out.write("</HEAD>\n");
            out.write("<BODY BGCOLOR=\"FFFFFF\">\n\n");

            // The whole page is in a table
            out.write("<TABLE WIDTH=600 CELLPADDING=10> <tr>\n");

            out.write("<TD WIDTH=120 CLASS=\"sidebar2\" VALIGN=TOP>\n");
//            out.write("<!--#include virtual=\"navLinks.html\" --> <P> </TD>\n");

            out.write("<TD>\n\n");

            out.write("<P CLASS=\"pagehead\">" + organization + " Schema Summary\n");
            out.write(indexRefHTML);
            // out.write("<H2> Schema Summary </H2> <P>");

            out.write("<TABLE>\n");

            Iterator<SchemaDefinition> schemaIT= schema.getSchemas();
            while(schemaIT.hasNext()){
                SchemaDefinition sd = schemaIT.next();

                out.write("<tr> <TD VALIGN=TOP CLASS=\"pagetextUnjust\">\n");
                out.write(schemaLink(sd));
                out.write("</TD> <TD CLASS=\"pagetextUnjust\">\n");
                out.write(getFormattedDescription(sd.getDescription()));
                out.write("</TD> </tr>");
            }

            out.write("</TABLE>");

            out.write("</TD> </tr> </TABLE>");
            out.write("</BODY>\n");
            out.write("</HTML>\n");

            out.close();
        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }


        indexIT = index.keySet().iterator();
        while(indexIT.hasNext()){
            String key = indexIT.next();
            TreeMap<String,Token>     tm = index.get(key);
            String      fn = new String(dir + File.separator + "index-" + key + ".shtml");

            if (tm.size() > 0){
                try {
                    BufferedWriter out = new BufferedWriter(new FileWriter(fn));
                    Iterator<Token> defsIt = tm.values().iterator();

                    System.out.println("Generating index - " + fn);

                    out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\"\n");
                    out.write("        \"http://www.w3.org/TR/REC-html40\">\n");
                    out.write("<HTML>\n");
                    out.write("<HEAD>\n");
                    out.write("<LINK href=\"/standard.css\" rel=\"stylesheet\" type=\"text/css\">\n");
                    out.write("<TITLE> " + organization + " - Schema Definitions Starting With The Letter - " + key + "</TITLE>\n");
                    out.write("</HEAD>\n");
                    out.write("<BODY BGCOLOR=\"FFFFFF\">\n\n");

                    // The whole page is in a table
                    out.write("<TABLE WIDTH=600 CELLPADDING=10> <tr> \n");

                    out.write("<TD WIDTH=120 CLASS=\"sidebar2\" VALIGN=TOP>\n");
//                    out.write("<!--#include virtual=\"navLinks.html\" --> <P> </TD>\n");

                    out.write("<TD>\n\n");
                    out.write(indexRefHTML);
                    out.write("<H1> - " + key + " - </H1> <P>");

                    out.write("<TABLE>\n");

                    while(defsIt.hasNext()){
                        Token               t  = (Token)defsIt.next();
                        DmsDefinition    go = (DmsDefinition) t.getUserData();

                        out.write("<tr> <TD VALIGN=TOP>\n");

                        if (go instanceof AttributeDefinition){
                            AttributeDefinition ad = (AttributeDefinition)go;
                            if (schema.attrAbbrevs.get(t.getValue()) != null){
                                out.write(defLink(go,t.getValue()) + "</TD> <TD>\n");
                                out.write("the abbreviated name of the " + defLink(ad,null) + " attribute of type " + defLink(ad.getType(),null) + " from the " + schemaLink(ad.getDefinedIn()) + " schema");
                            }
//                            else if (schema.reposNames.get(tname) != null){
//                                out.write(defLink(go,t.getValue()) + "</TD> <TD>\n");
//                                out.write("the repository name of the " + defLink(ad,null) + " attribute of type " + defLink(ad.getType(),null) + " from the " + schemaLink(ad.getDefinedIn()) + " schema");
//                            }
                            else{
                                out.write(defLink(go,null) + "</TD> <TD>\n");
                                out.write(" an attribute of type " + defLink(ad.getType(),null) + " from the " + schemaLink(ad.getDefinedIn()) + " schema");
                            }
                        }
                        else if (go instanceof ClassDefinition){
                            ClassDefinition cd = (ClassDefinition)go;
                            if (schema.attrAbbrevs.get(t.getValue()) != null){
                                out.write(defLink(go,t.getValue()) + "</TD> <TD>\n");
                                out.write("the abbreviated name of the " + defLink(cd,null) + " class from the " + schemaLink(cd.getDefinedIn()) + " schema");
                            }
//                            else if (schema.reposNames.get(t.getValue()) != null){
//                                out.write(defLink(go,t.getValue()) + "</TD> <TD>\n");
//                                out.write("the repository name of the " + defLink(cd,null) + " class from the " + schemaLink(cd.getDefinedIn()) + " schema");
//                            }
                            else{
                                out.write(defLink(go,null) + "</TD> <TD>\n");
                                out.write(" a class from the " + schemaLink(cd.getDefinedIn()) + " schema");
                            }
                        }
                        else if (go instanceof ActionDefinition){
                            ActionDefinition acd = (ActionDefinition)go;
                            out.write(defLink(go,null) + "</TD> <TD>\n");
                            out.write(" an action from the " + schemaLink(acd.getDefinedIn()) + " schema");
                        }
                        else if (go instanceof TypeDefinition){
                            TypeDefinition td = (TypeDefinition)go;
                            out.write(defLink(go,null) + "</TD> <TD>\n");
                            out.write(" a type from the " + schemaLink(td.getDefinedIn()) + " schema");
                        }
                        else if (go instanceof EnumDefinition){
                        	EnumDefinition evd = (EnumDefinition)go;
                            out.write(defLink(go,null) + "</TD> <TD>\n");
                            out.write(" an enum definition from the " + schemaLink(evd.getDefinedIn()) + " schema");
                        }
                        else if (go instanceof SchemaDefinition){
                            SchemaDefinition sd = (SchemaDefinition)go;
                            out.write(schemaLink(sd) + "</TD> <TD>\n");
                            out.write(" the " + schemaLink(sd) + " schema");
                        }

                        out.write("\n</TD> </tr>\n");

                    }

                    out.write("</TABLE>");

                    out.write("</TD> </tr> </TABLE>");
                    out.write("</BODY>\n");
                    out.write("</HTML>\n");

                    out.close();
                } catch (IOException e) {
                    System.out.println("IO Error:\n" + e);
                }

            } // End size test
        }
    }

//    /**
//     * This function dumps the class derivation hierarchy. Basically, if a
//     * class has derived classes (but no derivedFrom class) it will be
//     * dumped.
//     * @param dir The output directory.
//     */
//	void dumpClassHierarchy(String dir){
//        Iterator<ClassDefinition>            it      = null;
//        ClassDefinition         cd      = null;
//
//        classes.clear();
//
//        try {
//            BufferedWriter out = new BufferedWriter(new FileWriter(dir + "/classHierarchy.shtml"));
//
//            // System.out.println("The schema object:\n\n" + sd + "\n\n");
//            out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\"\n");
//            out.write("        \"http://www.w3.org/TR/REC-html40\">\n");
//            out.write("<HTML>\n");
//            out.write("<HEAD>\n");
//            out.write("<TITLE> " + organization + " - The Schema Class Derivation Hierarchy </TITLE>\n");
//            out.write("<LINK href=\"/standard.css\" rel=\"stylesheet\" type=\"text/css\">\n");
//            out.write("</HEAD>\n");
//            out.write("<BODY BGCOLOR=\"FFFFFF\">\n\n");
//
//            // The whole page is in a table
//            out.write("<TABLE WIDTH=600 CELLPADDING=10> <tr> \n");
//
//            out.write("<TD WIDTH=120 CLASS=\"sidebar2\" VALIGN=TOP>\n");
////            out.write("<!--#include virtual=\"navLinks.html\" --> <P> </TD>\n");
//            out.write("<TD>\n");
//
//            out.write("<CENTER> \n");
//            out.write("<P CLASS=\"pagehead\"> The Schema Class Derivation Hierarchy \n");
//            out.write("</CENTER> \n");
//
//            out.write(indexRefHTML);
//
//            it = schema.classDefs.values().iterator();
//            while(it.hasNext()){
//                cd = (ClassDefinition)it.next();
//
//                if (cd.getDerivedClasses() != null){
//                    // We have derived classes, but are we the base class of
//                    // the whole works?
//                    if (cd.getDerivedFrom() == null){
//                        // Ain't nothin' above us, so we are the base of the base!
//                        classes.put(cd.getObjectName(),cd);
//                    }
//                }
//            }
//
//            formatClassHierarchy(classes.values().iterator(),classes.size(),out);
//
//            out.write("</TD> </tr> </TABLE>");
//            // out.write("</TABLE>\n\n");
//            out.write("</BODY>\n");
//            out.write("</HTML>\n");
//
//            out.close();
//        } catch (IOException e) {
//            System.out.println("IO Error:\n" + e);
//        }
//    }

	// TODO: probably not required anymore
//    /**
//     * This function dumps all of the classes. if the class has a prodDescr
//     * attribute, it is dumped as well.
//     * @param dir The output directory.
//     */
//    void dumpClassListing(String dir){
//        Iterator<ClassDefinition>            it      = null;
//        ClassDefinition         cd      = null;
//
//        classes.clear();
//
//        try {
//            BufferedWriter out = new BufferedWriter(new FileWriter(dir + "/classListing.shtml"));
//
//            // System.out.println("The schema object:\n\n" + sd + "\n\n");
//            out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\"\n");
//            out.write("        \"http://www.w3.org/TR/REC-html40\">\n");
//            out.write("<HTML>\n");
//            out.write("<HEAD>\n");
//            out.write("<TITLE> " + organization + " - Class Listing </TITLE>\n");
//            out.write("<LINK href=\"/standard.css\" rel=\"stylesheet\" type=\"text/css\">\n");
//            out.write("</HEAD>\n");
//            out.write("<BODY BGCOLOR=\"FFFFFF\">\n\n");
//
//            // The whole page is in a table
//            out.write("<TABLE WIDTH=600 CELLPADDING=10> <tr> \n");
//
//            out.write("<TD WIDTH=120 CLASS=\"sidebar2\" VALIGN=TOP>\n");
////            out.write("<!--#include virtual=\"navLinks.html\" --> <P> </TD>\n");
//            out.write("<TD>\n");
//
//            out.write("<CENTER> \n");
//            out.write("<P CLASS=\"pagehead\"> Class Listing \n");
//            out.write("</CENTER> \n");
//
//            out.write(indexRefHTML);
//            
//            PriorityQueue<ClassDefinition> queue;
//
//            it = schema.classDefs.values().iterator();
//            while(it.hasNext()){
//                cd = it.next();
//
//                classes.put(cd.getObjectName(),cd);
//            }
//
//            formatClassList(classes.values().iterator(),classes.size(),out);
//
//            out.write("</TD> </tr> </TABLE>");
//            // out.write("</TABLE>\n\n");
//            out.write("</BODY>\n");
//            out.write("</HTML>\n");
//
//            out.close();
//        } catch (IOException e) {
//            System.out.println("IO Error:\n" + e);
//        }
//    }

    /**
     * Formats a nested set of derived classes
     */
	void formatClassList(Iterator<ClassDefinition> it, int size, BufferedWriter out){
//        DmdGenericAttribute ga  = null;
//        Iterator            sub = null;
        try{
            out.write("<UL>");
            for(int i=0; i<size; i++){
                ClassDefinition cd = (ClassDefinition)it.next();
//                ga = cd.getAttr(MetaSchemaAG._description);
                String description = getFormattedDescription(cd.getDescription());

                if (cd.getClassType() == ClassTypeEnum.STRUCTURAL){
//                    if (DmdClassTypeEnumAG.isSTRUCTURAL(cd.getClassType().intValue())){
                    if (description == null){
                        out.write("<LI TYPE=\"circle\"> " + cd.getObjectName() + "</LI>\n");
                    }
                    else{
//                        out.write("<LI TYPE=\"circle\"> " + cd.getName() + " - " + ga.getString() + "</LI>\n");
                        out.write("<LI TYPE=\"circle\"> " + cd.getObjectName() + " - " + description + "</LI>\n");
                    }
                }
            }
            out.write("</UL>");
        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }
    }

    /**
     * This function dumps the class instance hierarchy. Basically, if a
     * class has any class that indicate that it is an allowedParent, the
     * class and it allowed subcomponents are dumped.
     * @param dir The output directory.
     */
//    @SuppressWarnings("unchecked")
	void dumpInstanceHierarchy(String dir){
//        Iterator            it      = null;
//        ClassDefinition         cd      = null;

        classes.clear();

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(dir + "/instanceHierarchy.shtml"));

            // System.out.println("The schema object:\n\n" + sd + "\n\n");
            out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\"\n");
            out.write("        \"http://www.w3.org/TR/REC-html40\">\n");
            out.write("<HTML>\n");
            out.write("<HEAD>\n");
            out.write("<TITLE> Class Instance Hierarchy </TITLE>\n");
            out.write("<LINK href=\"/standard.css\" rel=\"stylesheet\" type=\"text/css\">\n");
            out.write("</HEAD>\n");
            out.write("<BODY BGCOLOR=\"FFFFFF\">\n\n");

            // The whole page is in a table
            out.write("<TABLE WIDTH=600 CELLPADDING=10> <tr> \n");

            out.write("<TD WIDTH=120 CLASS=\"sidebar2\" VALIGN=TOP>\n");
//            out.write("<!--#include virtual=\"navLinks.html\" --> <P> </TD>\n");
            out.write("<TD>\n");

            out.write("<CENTER> \n");
            out.write("<P CLASS=\"pagehead\"> The Class Instance Hierarchy \n");
            out.write("</CENTER> \n");

            out.write(indexRefHTML);

//            it = schema.classDefs.values().iterator();
//            while(it.hasNext()){
//                cd = (ClassDefinition)it.next();
//
//                if (cd.getAllowedSubcomps() != null){
//                    // We have subcomponent classes, but are we a top level object
//                    if (cd.getAllowedParents() == null){
//                        // Ain't nothin' above us, so we are top level
//                        classes.put(cd.getObjectName(),cd);
//                    }
//                }
//            }
//
//            formatInstanceHierarchy(null,classes.values().iterator(),out);

            out.write("<TD> </tr> </TABLE>");
            // out.write("</TABLE>\n\n");
            out.write("</BODY>\n");
            out.write("</HTML>\n");

            out.close();
        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }
    }

    /**
     * This function dumps information about the datatype of each class i.e.
     * whether it's persistent, cached, transient etc.
     * @param dir The output directory.
     */
//    @SuppressWarnings("unchecked")
	void dumpDataTypeInfo(String dir){
//        Iterator            it      = null;
//        ClassDefinition         cd      = null;
//        ArrayList           trans       = new ArrayList();
//        ArrayList           persistent  = new ArrayList();
//        ArrayList           other       = new ArrayList();

        classes.clear();

        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(dir + "/dataTypeInfo.shtml"));

            // System.out.println("The schema object:\n\n" + sd + "\n\n");
            out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\"\n");
            out.write("        \"http://www.w3.org/TR/REC-html40\">\n");
            out.write("<HTML>\n");
            out.write("<HEAD>\n");
            out.write("<TITLE> " + organization + " - Class Data Types </TITLE>\n");
            out.write("<LINK href=\"/standard.css\" rel=\"stylesheet\" type=\"text/css\">\n");
            out.write("</HEAD>\n");
            out.write("<BODY BGCOLOR=\"FFFFFF\">\n\n");

            // The whole page is in a table
            out.write("<TABLE WIDTH=600 CELLPADDING=10> <tr> \n");

            out.write("<TD WIDTH=120 CLASS=\"sidebar2\" VALIGN=TOP>\n");
//            out.write("<!--#include virtual=\"navLinks.html\" --> <P> </TD>\n");
            out.write("<TD>\n");

            out.write("<CENTER> \n");
            out.write("<P CLASS=\"pagehead\"> Class Data Types \n");
            out.write("</CENTER> \n");

            out.write(indexRefHTML);

//            it = schema.classDefs.values().iterator();
//            while(it.hasNext()){
//                cd = (ClassDefinition)it.next();
//
//                if (cd.getAllowedSubcomps() != null){
//                    // We have subcomponent classes, but are we a top level object
//                    if (cd.getAllowedParents() == null){
//                        // Ain't nothin' above us, so we are top level
//                        classes.put(cd.getObjectName(),cd);
//                    }
//                }
//            }
//
//            formatInstanceHierarchy(null,classes.values().iterator(),out);

            out.write("<TD> </tr> </TABLE>");
            // out.write("</TABLE>\n\n");
            out.write("</BODY>\n");
            out.write("</HTML>\n");

            out.close();
        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }
    }

    /**
     * Formats a nested set of derived classes
     */
    void formatClassHierarchy(Iterator<ClassDefinition> it, int size, BufferedWriter out){
//        DmdGenericAttribute ga  = null;
//        Iterator            sub = null;
        
        try{
            out.write("<UL>");
            for(int i=0; i<size; i++){
                ClassDefinition cd = it.next();
                
//                Iterator<ClassDefinition> dcit = cd.getDerivedClasses();

                out.write("<LI TYPE=\"circle\"> " + defLink(cd,null) + "</LI>\n");
         
//                if ((ga = cd.getAttr(MetaSchemaAG._derivedClasses)) != null){
                if (cd.getDerivedClasses() != null){
//                    formatDerivedClassHierarchy(cd.getDerivedClasses(),ga.size(),out);
                    formatDerivedClassHierarchy(cd.getDerivedClasses(),out);
                }
            }
            out.write("</UL>");
        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }
    }

//    void formatDerivedClassHierarchy(Iterator<ClassDefinition> it, int size, BufferedWriter out){
    void formatDerivedClassHierarchy(Iterator<ClassDefinition> it, BufferedWriter out){
//        DmdGenericAttribute ga  = null;
//        Iterator            sub = null;
        try{
            out.write("<UL>");
//            for(int i=0; i<size; i++){
            while(it.hasNext()){
                ClassDefinition cd = it.next();
                out.write("<LI TYPE=\"circle\"> " + defLink(cd,null) + "</LI>\n");
                
                if (cd.getDerivedClasses() != null){
                    formatDerivedClassHierarchy(cd.getDerivedClasses(),out);
                }
            }
            out.write("</UL>");
        } catch (IOException e) {
            System.out.println("IO Error:\n" + e);
        }
    }

//    /**
//     * Formats a nested set of derived classes
//     */
//    void formatInstanceHierarchy(ClassDefinition parent, Iterator<ClassDefinition> it, BufferedWriter out){
//        try{
//            out.write("<UL>");
//            while(it.hasNext()){
//                ClassDefinition cd = it.next();
//                out.write("<LI TYPE=\"circle\"> " + defLink(cd,null) + "</LI>\n");
//
//                // We check if this class is the same as the parent class in the
//                // hierarchy i.e. that this type of object can be created beneath
//                // itself - if so, we DON'T recurse.
//                if ((cd != parent) && (cd.getAllowedSubcomps() != null)){
//                    formatInstanceHierarchy(cd,cd.getAllowedSubcomps().values().iterator(),out);
//                }
//            }
//            out.write("</UL>");
//        } catch (IOException e) {
//            System.out.println("IO Error:\n" + e);
//        }
//    }

    void initIndex(){
        index = new TreeMap<String,TreeMap<String,Token>>();

        index.put(new String("0"),new TreeMap<String,Token>());
        index.put(new String("1"),new TreeMap<String,Token>());
        index.put(new String("2"),new TreeMap<String,Token>());
        index.put(new String("3"),new TreeMap<String,Token>());
        index.put(new String("4"),new TreeMap<String,Token>());
        index.put(new String("5"),new TreeMap<String,Token>());
        index.put(new String("6"),new TreeMap<String,Token>());
        index.put(new String("7"),new TreeMap<String,Token>());
        index.put(new String("8"),new TreeMap<String,Token>());
        index.put(new String("9"),new TreeMap<String,Token>());
        index.put(new String("A"),new TreeMap<String,Token>());
        index.put(new String("B"),new TreeMap<String,Token>());
        index.put(new String("C"),new TreeMap<String,Token>());
        index.put(new String("D"),new TreeMap<String,Token>());
        index.put(new String("E"),new TreeMap<String,Token>());
        index.put(new String("F"),new TreeMap<String,Token>());
        index.put(new String("G"),new TreeMap<String,Token>());
        index.put(new String("H"),new TreeMap<String,Token>());
        index.put(new String("I"),new TreeMap<String,Token>());
        index.put(new String("J"),new TreeMap<String,Token>());
        index.put(new String("K"),new TreeMap<String,Token>());
        index.put(new String("L"),new TreeMap<String,Token>());
        index.put(new String("M"),new TreeMap<String,Token>());
        index.put(new String("N"),new TreeMap<String,Token>());
        index.put(new String("O"),new TreeMap<String,Token>());
        index.put(new String("P"),new TreeMap<String,Token>());
        index.put(new String("Q"),new TreeMap<String,Token>());
        index.put(new String("R"),new TreeMap<String,Token>());
        index.put(new String("S"),new TreeMap<String,Token>());
        index.put(new String("T"),new TreeMap<String,Token>());
        index.put(new String("U"),new TreeMap<String,Token>());
        index.put(new String("V"),new TreeMap<String,Token>());
        index.put(new String("W"),new TreeMap<String,Token>());
        index.put(new String("X"),new TreeMap<String,Token>());
        index.put(new String("Y"),new TreeMap<String,Token>());
        index.put(new String("Z"),new TreeMap<String,Token>());
    }

    /**
     * Returns a link to the specified schema.
     */
    String schemaLink(SchemaDefinition sd){
        return(new String("<A HREF=\"" + sd.getObjectName() + ".shtml\">" + sd.getObjectName() + "</A> \n"));
    }

    /**
     * Returns a link to the specified definition.
     * @param go A definition passed as a generic object.
     * @param alias An alternate name for the definition; if provided, this is
     * used as the string in the reference.
     */
    String defLink(DmsDefinition go, String alias){
    	DmsDefinition def = (DmsDefinition)go;
    	SchemaDefinition sd = def.getDefinedIn();

        if (alias == null)
            return(new String("<A HREF=\"" + sd.getObjectName() + ".shtml" + "#" + go.getObjectName() + "\">" +  go.getObjectName() + "</A> \n"));
        else
            return(new String("<A HREF=\"" + sd.getObjectName() + ".shtml" + "#" + go.getObjectName() + "\">" +  alias + "</A> \n"));
    }

    /**
     * Creates the standard footer.
     */
    String getFooter(String filename){
        StringBuffer sb = new StringBuffer();

        sb.append("<CENTER>\n");
        sb.append("<TABLE> <tr> <TD CLASS=\"smalltext\">\n");
        sb.append("URL: http://www.dark-matter-data.org<!--#echo var=\"DOCUMENT_URI\" -->\n");
        sb.append("<BR>\n");
        sb.append("Comments to: <A HREF=\"mailto:" + userEmail + "\">" + schemaUser + " </A>\n");
        sb.append("<BR>\n");
        sb.append("Modified:\n");
        sb.append("<!--#config timefmt=\"%B %d, %Y\" -->\n");
        sb.append("<!--#flastmod file=\"" + filename + "\" -->\n");
        sb.append("Copyright &#169;\n");
        sb.append("<!--#config timefmt=\"%Y\" -->\n");
        sb.append("<!--#flastmod file=\"" + filename + "\" -->\n");
        sb.append(organization +"\n");
        sb.append("</TD> </tr> </TABLE> \n");

        return(sb.toString());
    }

}




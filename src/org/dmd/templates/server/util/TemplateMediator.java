package org.dmd.templates.server.util;

import java.io.IOException;

import org.dmd.templates.server.extended.Template;

/**
 * The TemplateMediator provides the linkage between a Section and the associated
 * Template that has been loaded from the separate template definition file.
 */
public class TemplateMediator {
	
	public static ValueContainer	commentContainer = new ValueContainer();
	
	String 		name;
	Template	template;

	public TemplateMediator(String n){
		name = n;
		template = null;
	}
	
	public void reset(){
		template = null;
	}
	
	public Template getTemplate(){
		return(template);
	}
	
	public void setTemplate(Template t){
		template = t;
	}
	
	/**
	 * If the template has been loaded, we format the information in the Section and
	 * write it to the artifact. Otherwise we do nothing.
	 * @param section
	 * @param artifact
	 * @throws IOException
	 */
	public void format(ValueContainerIF section, FormattedArtifactIF artifact) throws IOException {
		if (template == null)
			return;
		template.format(section, artifact);
	}
	
	/**
	 * If the template has been loaded, we dump a debug comment to the artifact (based on the 
	 * commentFormat from the TdlModule), format the information in the Section and
	 * write it to the artifact. Otherwise we do nothing.
	 * @param section
	 * @param artifact
	 * @throws IOException
	 */
	public void format(ValueContainerIF section, FormattedArtifactIF artifact, Template commentTemplate) throws IOException {
		if (template == null)
			return;
		
		// Debug commenting can be controlled at the Template level
		if (template.isDebugOn()){
			commentContainer.setValue("comment", "Formatted with template: " + template.getName() + " - " + template.getFile() + " : " + template.getLineNumber());
			commentTemplate.format(commentContainer, artifact);
		}
		
		template.format(section, artifact);
	}
}

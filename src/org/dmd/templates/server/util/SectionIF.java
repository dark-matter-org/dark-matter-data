package org.dmd.templates.server.util;

import java.io.IOException;

/**
 * The SectionIF interface is implemented by all classes generated as a result
 * of Section definitions in a .dmtdl module.
 */
public interface SectionIF extends ValueContainerIF {
	
	/**
	 * Adds formatted text to the specified artifact. If this Section contains other
	 * Sections, their formatted content if recursively added.
	 * @param artifact the artifact being formatted.
	 */
	public void format(FormattedArtifactIF artifact) throws IOException;
}

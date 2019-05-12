package org.dmd.templates.server.util;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

public class FormattedFile extends BufferedWriter implements FormattedArtifactIF {

	public FormattedFile(Writer out) {
		super(out);
	}

	@Override
	public void addText(String text) throws IOException {
		write(text);
	}

}

package org.dmd.util.artifact.java;


public class CommentFormatter {

	/**
	 * This function dumps the description of a class as a code comment. Long
	 * lines are folded to 75 characters.
	 * @param comment The comment to be written
	 * @indent A string that is written at the beginning of each line to indent it
	 */
	static public String format(String comment, String indent) {
		StringBuffer sb = new StringBuffer();
		StringBuffer rc = new StringBuffer();
		int offset;

		sb.append(comment);
		while (sb.length() > 75) {
			offset = 74;
			// Move back until we find a space
			while (sb.charAt(offset) != ' ') {
				offset--;
			}

			rc.append(indent);
			for (int i = 0; i < offset; i++) {
				rc.append(sb.charAt(i));
			}
			rc.append("\n");
			
			// The subString(int,int) method seems to be missing
			// out.write(" * " + sb.subString(start,offset) + "\n");
			sb.delete(0, offset + 1);
		}

		return(rc.toString());
	}


}

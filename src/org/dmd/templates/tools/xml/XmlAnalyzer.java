package org.dmd.templates.tools.xml;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.Stack;

import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;


/**
 * Reads an XML file and determines its structure.
 */
public class XmlAnalyzer {
	
	
	XmlDeclaration			declaration;
	
	boolean					strict;
	
	// If parsing is strict, there should only be one top element
	ArrayList<XmlElement>	topElements;
	
	// As we recognize elements, we place them on the stack
	Stack<XmlElement>		stack;
	
	// The maximum stack depth we reach
	int						depth;
	
	enum State {
		start,
		lookingForElementNameStart,
		parsingXmlDeclaration,
		nextCharMustBeEndBracket,
		parseBodyOrTag,
		parsingBody,
		parsingAttributes,
		parsingComment,
		startOrStopTag,
		lookingForEndBracketOfCloseTag,
		lookingForEndBracketOfOpenTag
	};
	
	State state = State.start;
	
	LineNumberReader	in;
	String				fileName;
	
	public XmlDeclaration getDeclaration(){
		return(declaration);
	}
	
	public ArrayList<XmlElement> getTopElements(){
		return(topElements);
	}
	
	public int getDepth(){
		return(depth);
	}

	public void parse(String fn, boolean strictFlag) throws ResultException, IOException {
		state			= State.start;
		declaration		= null;
		topElements		= new ArrayList<XmlElement>();
		stack			= new Stack<XmlElement>();
		strict			= strictFlag;
		
		in = new LineNumberReader(new FileReader(fn));
		fileName = fn;
		
		String str;
		StringBuffer	tagName			= null;
		StringBuffer	attributeInfo	= null;
		StringBuffer	bodyInfo		= null;
		@SuppressWarnings("unused")
		StringBuffer	commentInfo		= null;
		String			lastString		= null;

        while ((str = in.readLine()) != null){
        	str = str.trim();
        	if (str.length() == 0)
        		continue;
        	
        	lastString = str;
        	for(int i=0; i<str.length();i++){
        		System.out.println("i = " + i + " : " + str.charAt(i) + "     - " + state.name());
        		switch(state){
        			///////////////////////////////////////////////////////////
        			case start:
        				if (str.charAt(i) == '<'){
        					state = State.lookingForElementNameStart;
        					tagName = new StringBuffer();
        				}
        				else if (Character.isWhitespace(str.charAt(i))){
        					// Whitespace is okay
        				}
        				else{
        					// Anything else is just hanging out there!
        					throwError("Expecting < ", i, str);
        				}
        				break;
                	///////////////////////////////////////////////////////////
        			case lookingForElementNameStart:
        				if (str.charAt(i) == '?'){
        					// We have a doc type
        					state = State.parsingXmlDeclaration;
        					
        					// The entire line will be the declaration
        				}
        				else{
        					if (str.charAt(i) == '!'){
        						// Starting a comment
        						state = State.parsingComment;
        						commentInfo = new StringBuffer();
        					}
        					else if (Character.isWhitespace(str.charAt(i))){
        						if (tagName.length() == 0){
        							// Means we have "< " which shouldn't happen
        							throwError("Expecting tag name, not whitespace",i,str);
        						}
        						else{
        							// We've reached the end of the tag name, so we can create an XmlElement
        							pushElement(tagName.toString(),in.getLineNumber());
        							tagName = null;
        							state = State.lookingForEndBracketOfOpenTag;
        						}
        					}
        					else if (str.charAt(i) == '>'){
        						if (tagName.length() == 0){
        							// Means we have " <>
        							throwError("Expecting tag name, not closing >",i,str);
        						}
        						else{
        							// Means we had <name>
        							pushElement(tagName.toString(),in.getLineNumber());
        							tagName = null;
        							state = State.parsingBody;
        						}
        					}
        					else if (str.charAt(i) == '/'){
        						pushElement(tagName.toString(),in.getLineNumber());
    							tagName = null;
        						state = State.nextCharMustBeEndBracket;
        					}
        					else if (str.charAt(i) == '<'){
    							throwError("Expecting closure of tag name, or attributes, not < ",i,str);
        					}
        					else{
        						tagName.append(str.charAt(i));
        					}
        				}
        				break;
            		///////////////////////////////////////////////////////////
        			case nextCharMustBeEndBracket:
        				if (Character.isWhitespace(str.charAt(i))){
        					// Okay, keeping looking - we're being really forgiving here...
        				}
        				else if (!(str.charAt(i) == '>')){
							throwError("Expecting end bracket >",i,str);
        				}
        				else{
        					// We have an empty element - we're in this state because we 
        					// were parsing the tag name and found the closing /
        					stack.peek().setEmpty();
        					
        					// And, pop it off the stack
        					stack.pop();
        					
        					// We now start looking for another tag
        					state = State.start;
        				}
        				break;
        			///////////////////////////////////////////////////////////
        			case parsingXmlDeclaration:
        				// We shouldn't ever reach this state here - we'll break
        				// when we parse the declaration and go to the next line
        				break;
                	///////////////////////////////////////////////////////////
        			case lookingForEndBracketOfOpenTag:
        				if (str.charAt(i) == '>'){
        					// We've hit the end of the open tag, we're parsing the body between open/close tags now
        					state = State.parsingBody;
        				}
        				else if (str.charAt(i) == '/'){
        					// The end of the tag is nigh! And it shall be empty!
        					state = State.nextCharMustBeEndBracket;
        				}
        				else if (Character.isWhitespace(str.charAt(i))){
        					// Okay, we'll keep going
        				}
        				else{
        					// We haven't hit the end bracket and have non-whitespace - so we have attributes
        					// We are going to handle this by gathering up everything from here until we hit 
        					// the end bracket
        					attributeInfo = new StringBuffer();
        					attributeInfo.append(str.charAt(i));
        					
        					state = State.parsingAttributes;
        				}
        				break;
                    ///////////////////////////////////////////////////////////
        			case parsingAttributes:
        				if (str.charAt(i) == '>'){
        					// We've hit the end of the attributes
        					state = State.parsingBody;
        				}
        				else if (str.charAt(i) == '/'){
        					// The end of the tag is nigh! And it shall be empty!
        					state = State.nextCharMustBeEndBracket;
        				}
        				else{
        					attributeInfo.append(str.charAt(i));
        				}
        				break;
                    ///////////////////////////////////////////////////////////
        			case parsingBody:
        				if (bodyInfo == null)
        					bodyInfo = new StringBuffer();
        				
        				if (str.charAt(i) == '<'){
        					// We're starting some other tag - it could be a start or an end tag,
        					// we'll just have to wait and see. However, we're definitely done with the 
        					// body, so we'll store it to the current element
        					if (bodyInfo.length() > 0){
        						stack.peek().addText(new XmlText(bodyInfo.toString()));
        					}
        					bodyInfo = null;
        					state = State.startOrStopTag;
        				}
        				else{
        					bodyInfo.append(str.charAt(i));
        				}
        				break;
                    ///////////////////////////////////////////////////////////
        			// Enter from parsingBody after finding <
        			case startOrStopTag:
        				if (Character.isWhitespace(str.charAt(i))){
							throwError("Expecting the / of an end tag or start of a tag name.",i,str);
        				}
        				else if (str.charAt(i) == '/'){
        					// We're dealing with an end tag, so now we're looking
        					// for the end bracket
        					state = State.lookingForEndBracketOfCloseTag;
        					tagName = new StringBuffer();
        				}
        				else{
        					// We're at another start tag - since we're not seeing the /
        					if (str.charAt(i) == '>'){
        						// We're missing the name
    							throwError("Expecting tag name, but found >",i,str);
        					}
        					else{
        						// Start building up the name of the tag
        						state = State.lookingForElementNameStart;
            					tagName = new StringBuffer();
            					tagName.append(str.charAt(i));
        					}
        				}
        				break;
                    ///////////////////////////////////////////////////////////
        			case lookingForEndBracketOfCloseTag:
    					if (Character.isWhitespace(str.charAt(i))){
    						if (tagName.length() == 0){
    							// Means we have "</ " which shouldn't happen
    							throwError("Expecting end tag name, not whitespace",i,str);
    						}
    						else{
    							// We have something like "</stop " which probably isn't good either
    							throwError("Extraneous space with end tag name",i,str);
    						}
    					}
    					else if (str.charAt(i) == '>'){
    						// We've hit the end of the end tag and should have a name
    						String endName = tagName.toString();
    						
    						if (stack.peek().name().equals(endName)){
    							// We've found the end tag for the current element
    							// so pop it off the stack
    							stack.pop();
    							
    							// We've come to the end of something - so we're looking
    							// for either some body text or another start/end tag
    							state = State.parseBodyOrTag;
    						}
    						else{
    							throwError("Expecting end tag for " + stack.peek().name() + " element, but got end tag for " + endName + " instead");
    						}
    					}
    					else{
    						tagName.append(str.charAt(i));
    						// Just keep looking...
    					}
        				break;
        			case parseBodyOrTag:
        				if (Character.isWhitespace(str.charAt(i))){
        					// Nothing to do - keep looking
        				}
        				else{
        					if (str.charAt(i) == '<'){
        						state = State.startOrStopTag;
        					}
        					else{
        						bodyInfo = new StringBuffer();
        						bodyInfo.append(str.charAt(i));
        						state = State.parsingBody;
        					}
        				}
        				break;
        			case parsingComment:
        				if (str.charAt(i) == '>'){
        					// Comments are bizarre, because they don't recognize that the first --> is the end of the comment.
        					// You can have something like:
        					// <!-- -->
        					// -->
        					// And it passes validation!
        					// And so does (in several different validators I tried):
        					// <!-- -->
        					// - ->
        					// Apparently this is okay:
        					// <!---->
        					// But this isn't:
        					// <!----->
        					// And this isn't (because -- is not allowed in comments)
        					// <!-- -- -->
        					// But this is:
        					// <!-->-->
        					
        				}
        				break;
        		}

        		if (state == State.parsingXmlDeclaration){
    				// The xml declaration must be on the first line
    				// <?xml version="1.0" encoding="UTF-8" standalone="no" ?>
    				parseDeclaration(str);
        			
    				// Continue to the next line
        			break;
        		}
        	} // for
        	
        	
        }
        
        switch(state){
        case lookingForElementNameStart:
        	break;
        case lookingForEndBracketOfOpenTag:
        	break;
        case nextCharMustBeEndBracket:
        	break;
        case parsingAttributes:
        	break;
        case parsingBody:
        	break;
        case parsingXmlDeclaration:
        	break;
        case start:
        	// This is where we should be
        	break;
		case lookingForEndBracketOfCloseTag:
			break;
		case parseBodyOrTag:
			break;
		case parsingComment:
			break;
		case startOrStopTag:
			break;
		default:
			break;
        }
        
        if (!stack.isEmpty()){
        	// We haven't been properly terminated something
        	throwError(stack.peek().name() + " not properly terminated.", 0, lastString);
        }
        
        in.close();
	}
	
	void pushElement(String name, int line) throws ResultException, IOException {
		String test = name.toLowerCase();
		
		if (test.startsWith("xml"))
			throwError("Tag name can't start with xml:" + name);
		
		if (!Character.isLetter(name.charAt(0)))
			throwError("Tag names must start with a letter:" + name);
		
		XmlElement xe = new XmlElement(name, line);
		
		DebugInfo.debug("Pushing element: " + name);
		
		if (stack.size() == 0){
			// This is s top level element
			if (strict && (topElements.size() != 0)){
				ResultException ex = new ResultException("An XML file should have only one top level element");
				ex.setLocationInfo(fileName, line);
				throw(ex);
			}
			topElements.add(xe);
		}
		
		if (stack.size() > 0){
			// We add the new element as a sub element of whatever's on top of the stack
			stack.peek().addElement(xe);
		}
		
		stack.push(xe);
		
		if (stack.size() > depth)
			depth = stack.size();
	}
	
	void throwError(String message, int position, String input) throws ResultException, IOException {
		in.close();
		ResultException ex = new ResultException(message);
		ex.setLocationInfo(fileName, in.getLineNumber());
		ex.result.lastResult().moreMessages(showErrorLocation(position, input));
		throw(ex);
	}
	
	void throwError(String message) throws ResultException, IOException {
		in.close();
		ResultException ex = new ResultException(message);
		ex.setLocationInfo(fileName, in.getLineNumber());
		throw(ex);
	}
	
	/**
	 * We should be parsing something like:
	 * <?xml version="1.0" encoding="UTF-8" standalone="no" ?>
	 * @param str
	 */
	void parseDeclaration(String str) throws ResultException {
		if (!str.endsWith("?>")){
			ResultException ex = new ResultException("Missing ?> tag for XML declaration");
			throw(ex);
		}
		
		declaration = new XmlDeclaration();
		
		// For, now, not bothering with the contents.
		state = State.start;
	}
	
	
	void parseAttributes(StringBuffer attributeInfo){
		// Not yet
	}
	
	
	String showErrorLocation(int position, String input){
		StringBuffer sb = new StringBuffer("\n" + input + "\n");
		for(int i=0; i< position; i++){
			sb.append(" ");
		}
		sb.append("^");
		return(sb.toString());
	}	
}

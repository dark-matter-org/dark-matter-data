//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2012 dark-matter-data committers
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
package org.dmd.core.rules;

import java.util.ArrayList;

import org.dmd.core.feedback.DMFeedback;
import org.dmd.core.feedback.SourceInfo;


/**
 * The DmcRuleException is generally thrown by validation rules defined
 * as part of your dark-matter schema. Not all categories of rules throw
 * exceptions.
 * <p/>
 * The primary reason for the existence of the DmcRuleException is to allow
 * for shared rules between full Java and restricted Java environments (like GWT).
 * A DmcRuleException will always have an error message in whatever base language
 * you prefer, but it can always be adapted for display in other languages because
 * it provides mechanisms to define a unique message key as well as any parameters
 * that may be embedded in the message.
 */
public class DmcRuleException extends DMFeedback {

	// The rule that generated this exception
	RuleIF				rule;
	
	// The key to look up translated messages
	String				messageKey;
	
	// The parameters to be inserted in translated messages
	ArrayList<String>	messageParameters;
	
	// This flag will be set to true if the rule instance has specified that
	// rule processing should be halted immediately
	boolean				immediateHalt;
	
	/**
	 * Instantiates a new DmcRuleException.
	 * @param baseMessage the basic message.
	 * @param ri the rule that threw the exception.
	 */
	public DmcRuleException(String baseMessage, RuleIF ri){
		super(baseMessage);
		rule				= ri;
		messageKey 			= null;
		messageParameters	= null;
	}
	
	public void source(SourceInfo si){
		source = si;
	}
	
	public SourceInfo source(){
		return(source);
	}
	
	/**
	 * @return true if this rule that generated this exception wants no further processing to occur.
	 */
	public boolean immediateHalt(){
		return(immediateHalt);
	}
	
	/**
	 * Sets the immediate halt flag as specified.
	 * @param f the flag value.
	 */
	public void immediateHalt(boolean f){
		immediateHalt = f;
	}
	
	/**
	 * Instantiates a new, translatable DmcRuleException.
	 * @param baseMessage the basic message.
	 * @param ri the rule that threw the exception.
	 * @param mk the message key.
	 */
	public DmcRuleException(String baseMessage, RuleIF ri, String mk){
		super(baseMessage);
		rule				= ri;
		messageKey 			= mk;
		messageParameters	= null;
	}
	
	/**
	 * Instantiates a new, translatable DmcRuleException with a single message parameter.
	 * @param baseMessage the basic message.
	 * @param ri the rule that threw the exception.
	 * @param mk the message key.
	 * @param p1 the first parameter.
	 */
	public DmcRuleException(String baseMessage, RuleIF ri, String mk, String p1){
		super(baseMessage);
		rule				= ri;
		messageKey 			= mk;
		messageParameters	= null;
		messageParameters	= new ArrayList<String>();
		messageParameters.add(p1);
	}
	
	/**
	 * Instantiates a new, translatable DmcRuleException with two message parameters.
	 * @param baseMessage the basic message.
	 * @param ri the rule that threw the exception.
	 * @param mk the message key.
	 * @param p1 the first parameter.
	 * @param p2 the second parameter.
	 */
	public DmcRuleException(String baseMessage, RuleIF ri, String mk, String p1, String p2){
		super(baseMessage);
		rule				= ri;
		messageKey 			= mk;
		messageParameters	= null;
		messageParameters	= new ArrayList<String>();
		messageParameters.add(p1);
		messageParameters.add(p2);
	}
	
	/**
	 * Instantiates a new, translatable DmcRuleException with three message parameters.
	 * @param baseMessage the basic message.
	 * @param ri the rule that threw the exception.
	 * @param mk the message key.
	 * @param p1 the first parameter.
	 * @param p2 the second parameter.
	 * @param p3 the third parameter.
	 */
	public DmcRuleException(String baseMessage, RuleIF ri, String mk, String p1, String p2, String p3){
		super(baseMessage);
		rule				= ri;
		messageKey 			= mk;
		messageParameters	= null;
		messageParameters	= new ArrayList<String>();
		messageParameters.add(p1);
		messageParameters.add(p2);
		messageParameters.add(p3);
	}
	
	/**
	 * @return the rule that threw this exception.
	 */
	public RuleIF getRule(){
		return(rule);
	}
	
	/**
	 * @return the message key if it was provided and null otherwise.
	 */
	public String getMessageKey(){
		return(messageKey);
	}
	
	/**
	 * @return the specified message parameter or null if it doesn't exist.
	 */
	public String getParameter(int index){
		if (messageParameters == null)
			return(null);
		return(messageParameters.get(index));
	}
	
	@Override
	public String toString(){
		StringBuffer sb = new StringBuffer();
		
		sb.append(super.toString());
		
		if (rule != null)
			sb.append("Rule: " + rule.getRuleTitle());
		
		return(sb.toString());
	}
	
	
}

package org.dmd.dmc.util;

import java.util.ArrayList;

/**
 * The NamedValueArray allows for the storage of both StringValues and UcoValues
 * by virtue of the fact that they are both marked as AttributeValueIF. We need
 * this mechanism so that we can handle the String representation of attributes
 * as well as attributes that are themselves objects.
 * <p/>
 * In any given NamdValueArray, all of the values must be one type or the other,
 * since it makes no sense to have an attribute that is both. The mixed() method
 * will be used by the DmoObjectFactory to check on this.
 */
@SuppressWarnings("serial")
public class NamedValueArray extends ArrayList<AttributeValueIF> {
	
	// The attribute name associated with these values
	private String name;
	
	// Whether our initial value was a string
	private boolean	isString;
	
	// Whether a mix of values types has been added
	private boolean	mixed;
	
	public NamedValueArray(String n){
		name = n;
		isString = true;
	}

	public String getName(){
		return(name);
	}
	
	public boolean strings(){
		return(isString);
	}
	
	public boolean mixed(){
		return(mixed);
	}
	
	public void toOIF(int padding, StringBuffer sb){
		if (mixed){
			addNameWithPadding(name, padding, sb);
			sb.append(" MIXED INPUT!!!\n");
			return;
		}
		
		if (size() == 0){
			return;
		}
		
		if (isString){
			for(AttributeValueIF s: this){
				addNameWithPadding(name, padding, sb);
				sb.append(" " + s + "\n");
			}
		}
		else{
			if (size() == 1){
				UcoValue value = (UcoValue) get(0);
				addNameWithPadding(name, padding, sb);
				sb.append("\n{\n" + ((UcoValue)value).getValue() + "\n}\n");
				
			}
			else {
				sb.append("\n[\n");
				for(AttributeValueIF s: this){
					addNameWithPadding(name, padding, sb);
					sb.append(" " + s + "\n");
				}
				sb.append("]\n");
			}
			
		}
	}
	
	@Override
	public boolean add(AttributeValueIF v){
		// On first addition, we set the nature of this value collection, it defaults to string
		if (this.size() == 0){
			if (v instanceof UcoValue)
				isString = false;
		}
		else{
			if (v instanceof UcoValue){
				if (isString)
					mixed = true;
			}
			else{
				if(!isString)
					mixed = true;
			}
		}
		
		return(super.add(v));
	}
	
	/**
	 * Adds the attribute name and pads it with the required number of spaces. If the name is
	 * longer than the padding, we do nothing.
	 * @param attrName The name of the attribute.
	 * @param padding  The amount of padding.
	 * @param sb       The buffer where we're building the output.
	 */
	private void addNameWithPadding(String attrName, int padding, StringBuffer sb){
		sb.append(attrName);
		if (attrName.length() < padding){
			for(int i=attrName.length(); i<padding; i++)
				sb.append(" ");
		}
	}

}

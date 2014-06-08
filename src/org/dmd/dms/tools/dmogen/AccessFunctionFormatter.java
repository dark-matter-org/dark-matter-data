package org.dmd.dms.tools.dmogen;

import org.dmd.dms.server.extended.AttributeDefinition;
import org.dmd.dms.server.generated.MetaDmsModule;
import org.dmd.dms.shared.generated.enums.ValueTypeEnum;
import org.dmd.util.runtime.DebugInfo;


public class AccessFunctionFormatter {

	static public void formatSV(AttributeDefinition ad, StringBuffer sb){
    	String typeClassName 	= ad.getType().getTypeClassName();
    	String attrType 		= "DmcType" + ad.getType().getName();
    	// Try to get the nullReturnValue from the attribute first - and try the type second
    	String nullReturnValue 	= ad.getNullReturnValue();
    	String typeName 		= ad.getType().getName().getNameString();
    	String genericArgs		= ad.getGenericArgs();
    	
    	if (genericArgs == null)
    		genericArgs = "<?>";
    	
    	if (nullReturnValue == null){
    		nullReturnValue = ad.getType().getNullReturnValue();
    	}
    	
    	if (ad.getType().getIsRefType()){
    		attrType = attrType + "REF";
    	}

    	if (typeClassName != null){
    		int lastPeriod = typeClassName.lastIndexOf('.');
    		if (lastPeriod != -1){
    			attrType = typeClassName.substring(lastPeriod + 1);
    		}
    	}
    	
    	attrType = attrType + "SV";
    	
    	////////////////////////////////////////////////////////////////////////////////
    	// getter

    	StringBuffer 	functionName 	= new StringBuffer();
    	functionName.append(ad.getName());
    	functionName.setCharAt(0,Character.toUpperCase(functionName.charAt(0)));
		
    	if (ad.getType().getIsRefType() && !ad.getType().getIsExtendedRefType()){
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			if (ad.getType().getOriginalClass().getIsNamedBy() == null){
				sb.append("    public " + typeName + "DMO get" + functionName + "(){\n");		
				sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getCompactSchemaReference() + ");\n");
				sb.append("        if (attr == null)\n");
		    	if (nullReturnValue == null)
		    		sb.append("            return(null);\n");
		    	else
		    		sb.append("            return(" + nullReturnValue + ");\n");
		    	sb.append("\n");
		    	sb.append("        return(attr.getSV());\n");
		    	sb.append("    }\n\n");
		    	
			}
			else{
				sb.append("    public " + typeName + "REF get" + functionName + "(){\n");
				sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getCompactSchemaReference() + ");\n");
				sb.append("        if (attr == null)\n");
		    	if (nullReturnValue == null)
		    		sb.append("            return(null);\n");
		    	else
		    		sb.append("            return(" + nullReturnValue + ");\n");
		    	sb.append("\n");
		    	sb.append("        if (DmcOmni.instance().lazyResolution()){\n");
		    	sb.append("            if (attr.doLazyResolution(this)){\n");
		    	sb.append("                rem(attr.getAttributeInfo());\n");
	    		sb.append("                return(null);\n");
		    	sb.append("            }\n");
		    	sb.append("        }\n");
		    	sb.append("\n");
		    	sb.append("        return(attr.getSV());\n");
		    	sb.append("    }\n\n");
		    	
		    	sb.append("    /**\n");
		    	sb.append("     * Returns the reference to " + typeName + " without attempting lazy resolution (if turned on).\n");
		    	sb.append("     */\n");
				sb.append("    public " + typeName + "REF get" + functionName + "REF(){\n");
				sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getCompactSchemaReference() + ");\n");
				sb.append("        if (attr == null)\n");
		    	if (nullReturnValue == null)
		    		sb.append("            return(null);\n");
		    	else
		    		sb.append("            return(" + nullReturnValue + ");\n");
		    	sb.append("\n");
		    	sb.append("        return(attr.getSV());\n");
		    	sb.append("    }\n\n");
		    	
			}	    	

			// NOTE: We need the attribute cast to the correct type here because of the removeBackReferences call
	    	sb.append("    /**\n");
	    	sb.append("     * Sets " + ad.getName() + " to the specified value.\n");
	    	sb.append("     * @param value " + typeName + "DMO\n");
	    	sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
	    	sb.append("    public void set" + functionName + "(" + typeName + "DMO value) {\n");
	    	sb.append("        DmcAttribute<?> attr = get(" + ad.getCompactSchemaReference() + ");\n");
	    	sb.append("        if (attr == null)\n");
	    	sb.append("            attr = new " + attrType+ "(" + ad.getCompactSchemaReference() + ");\n");
	    	
	    	if (ad.getType().getIsRefType() && (ad.getType().getOriginalClass().getIsNamedBy() != null)){
	        	sb.append("        else\n");
	        	sb.append("            ((" + attrType + ")attr).removeBackReferences();\n");
	    	}
	    	
	    	sb.append("        \n");
	    	sb.append("        try{\n");
	    	sb.append("            attr.set(value);\n");
	    	sb.append("            set(" + ad.getCompactSchemaReference() + ",attr);\n");
	    	sb.append("        }\n");
	    	sb.append("        catch(DMFeedbackSet ex){\n");
	    	sb.append("            throw(new IllegalStateException(\"The type specific set() method shouldn't throw exceptions!\",ex));\n");
	    	sb.append("        }\n");
	    	sb.append("    }\n\n");

    	}
    	else{
    		if (ad.getType().getIsExtendedRefType()){
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		    	sb.append("    /**\n");
				sb.append("     * @return The " + typeName + ", attempting lazy resolution (if it's turned on).\n");
				sb.append("     */\n");
				sb.append("    public " + typeName + " get" + functionName + "(){\n");
	
				sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getCompactSchemaReference() + ");\n");
				sb.append("        if (attr == null)\n");
				
		    	if (nullReturnValue == null)
		    		sb.append("            return(null);\n");
		    	else
		    		sb.append("            return(" + nullReturnValue + ");\n");
		
		    	sb.append("\n");
		    	
		    	sb.append("        if (DmcOmni.instance().lazyResolution()){\n");
		    	sb.append("            if (attr.doLazyResolution(this)){\n");
		    	sb.append("                rem(attr.getAttributeInfo());\n");
	    		sb.append("                return(null);\n");
		    	sb.append("            }\n");
		    	sb.append("        }\n");
		    	sb.append("\n");
		    	
		    	sb.append("        return(attr.getSV());\n");
		    	
		    	sb.append("    }\n\n");
		    	
		    	///////////////////////////////////////////////////////////////
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		    	sb.append("    /**\n");
				sb.append("     * @return The " + typeName + " without attempting lazy resolution (if it's turned on).\n");
				sb.append("     */\n");
				sb.append("    public " + typeName + " get" + functionName + "REF(){\n");
	
				sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getCompactSchemaReference() + ");\n");
				sb.append("        if (attr == null)\n");
				
		    	if (nullReturnValue == null)
		    		sb.append("            return(null);\n");
		    	else
		    		sb.append("            return(" + nullReturnValue + ");\n");
		
		    	sb.append("\n");
		    			    	
		    	sb.append("        return(attr.getSV());\n");
		    	
		    	sb.append("    }\n\n");
    		}
    		else{
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				if (typeName.equals("DmcAttribute")){
					if (!genericArgs.equals("<?>"))
						sb.append("    @SuppressWarnings(\"unchecked\")\n");
					sb.append("    public DmcAttribute" + genericArgs + " get" + functionName + "(){\n");
				}
				else if (ad.getType() == MetaDmsModule._Boolean){
					sb.append("    public " + typeName + " is" + functionName + "(){\n");
				}
				else{
					sb.append("    public " + typeName + " get" + functionName + "(){\n");
				}
	
				sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getCompactSchemaReference() + ");\n");
				sb.append("        if (attr == null)\n");
				
		    	if (nullReturnValue == null)
		    		sb.append("            return(null);\n");
		    	else
		    		sb.append("            return(" + nullReturnValue + ");\n");
		
		    	sb.append("\n");
		    	
		    	if (typeName.equals("DmcAttribute")){
			    	if (!genericArgs.equals("<?>"))
				    	sb.append("        return((DmcAttribute" + genericArgs + ")attr.getSV());\n");
			    	else
			    		sb.append("        return(attr.getSV());\n");
		    	}
		    	else
		    		sb.append("        return(attr.getSV());\n");
		    	
		    	sb.append("    }\n\n");
		    	
    		}
    		
	    	sb.append("    /**\n");
	    	sb.append("     * Sets " + ad.getName() + " to the specified value.\n");
	    	sb.append("     * @param value " + typeName + "\n");
	    	sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			if (typeName.equals("DmcAttribute"))
				sb.append("    public void set" + functionName + "(DmcAttribute" + genericArgs + " value) {\n");
			else
				sb.append("    public void set" + functionName + "(" + typeName + " value) {\n");
	    	sb.append("        DmcAttribute<?> attr = get(" + ad.getCompactSchemaReference() + ");\n");
	    	sb.append("        if (attr == null)\n");
	    	sb.append("            attr = new " + attrType + "(" + ad.getCompactSchemaReference() + ");\n");
	    	sb.append("        \n");
	    	sb.append("        try{\n");
	    	sb.append("            attr.set(value);\n");
	    	sb.append("            set(" + ad.getCompactSchemaReference() + ",attr);\n");
	    	sb.append("        }\n");
	    	sb.append("        catch(DMFeedbackSet ex){\n");
	    	sb.append("            throw(new IllegalStateException(\"The type specific set() method shouldn't throw exceptions!\",ex));\n");
	    	sb.append("        }\n");
	    	sb.append("    }\n\n");
	    	
	    	if (ad.getType().getAltType() != null){
		    	sb.append("    /**\n");
		    	sb.append("     * Sets " + ad.getName() + " to the specified value.\n");
		    	sb.append("     * @param value " + typeName + "\n");
		    	sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public void set" + functionName + "(" + ad.getType().getAltType() + " value) {\n");
		    	sb.append("        DmcAttribute<?> attr = get(" + ad.getCompactSchemaReference() + ");\n");
		    	sb.append("        if (attr == null)\n");
		    	sb.append("            attr = new " + attrType+ "(" + ad.getCompactSchemaReference() + ");\n");
		    	sb.append("        \n");
		    	sb.append("        try{\n");
		    	sb.append("            attr.set(value);\n");
		    	sb.append("            set(" + ad.getCompactSchemaReference() + ",attr);\n");
		    	sb.append("        }\n");
		    	sb.append("        catch(DMFeedbackSet ex){\n");
		    	sb.append("            throw(new IllegalStateException(\"The alternative type specific set() method shouldn't throw exceptions!\",ex));\n");
		    	sb.append("        }\n");
		    	sb.append("    }\n\n");
	    	}
	    
    	}
    	
    	////////////////////////////////////////////////////////////////////////////////
    	// setter
    	
    	sb.append("    /**\n");
    	sb.append("     * Sets " + ad.getName() + " to the specified value.\n");
    	sb.append("     * @param value A value compatible with " + attrType + "\n");
    	sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
    	sb.append("    public void set" + functionName + "(Object value) throws DMFeedbackSet {\n");
    	sb.append("        " + attrType + " attr  = (" + attrType + ") get(" + ad.getCompactSchemaReference() + ");\n");
    	sb.append("        if (attr == null)\n");
    	sb.append("            attr = new " + attrType+ "(" + ad.getCompactSchemaReference() + ");\n");
    	if (ad.getType().getIsRefType() && (ad.getType().getOriginalClass().getIsNamedBy() != null)){
        	sb.append("        else\n");
        	sb.append("            attr.removeBackReferences();\n");
    	}
    	sb.append("        \n");
    	sb.append("        attr.set(value);\n");
    	sb.append("        set(" + ad.getCompactSchemaReference() + ",attr);\n");
    	sb.append("    }\n\n");
    	
    	////////////////////////////////////////////////////////////////////////////////
    	// remover
		sb.append("    /**\n");
		sb.append("     * Removes the " + ad.getName() + " attribute value.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public void rem" + functionName + "(){\n");
		sb.append("         rem(" + ad.getCompactSchemaReference() + ");\n");
		sb.append("    }\n\n");
		

	}
	
	static public void formatMV(AttributeDefinition ad, StringBuffer sb){
    	String typeClassName = ad.getType().getTypeClassName();
    	String attrType = "DmcType" + ad.getType().getName();
    	String typeName = ad.getType().getName().getNameString();
    	
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
    	
    	if (ad.getValueType() == ValueTypeEnum.MULTI)
    		attrType = attrType + "MV";
    	else if (ad.getValueType() == ValueTypeEnum.HASHSET)
    		attrType = attrType + "SET";
    	else if (ad.getValueType() == ValueTypeEnum.TREESET)
    		attrType = attrType + "SET";
    	
    	
    	
    	////////////////////////////////////////////////////////////////////////////////
    	// getter

		
		if (ad.getType().getIsRefType()){
			String REF = "REF";
			String DMO = "DMO";
			
			if  (ad.getType().getIsExtendedRefType()){
				REF = "";
				DMO = "";
			}
			
			if (ad.getIndexSize() == null){

				sb.append("    /**\n");
				sb.append("     * @return An Iterator of " + typeName + "DMO objects.\n");
				sb.append("     */\n");
		    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
				if (ad.getType().getOriginalClass().getIsNamedBy() == null){
					sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
					sb.append("    public Iterator<" + typeName + "DMO> get" + functionName + "(){\n");			
					sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getCompactSchemaReference() + ");\n");
					sb.append("        if (attr == null)\n");
					sb.append("            return( ((List<" + typeName + "DMO>) Collections.EMPTY_LIST).iterator() );\n");
					sb.append("\n");
					sb.append("        return(attr.getMV());\n");
					sb.append("    }\n\n");
					
				}
				else{
					
					sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
					sb.append("    public Iterator<" + typeName + REF + "> get" + functionName + "(){\n");
					sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getCompactSchemaReference() + ");\n");
					sb.append("        if (attr == null)\n");
					sb.append("            return( ((List<" + typeName + REF + ">) Collections.EMPTY_LIST).iterator() );\n");
			    	sb.append("\n");
			    	sb.append("        if (DmcOmni.instance().lazyResolution()){\n");
			    	sb.append("            if (attr.doLazyResolution(this)){\n");
			    	sb.append("                rem(attr.getAttributeInfo());\n");
					sb.append("                return( ((List<" + typeName + REF + ">) Collections.EMPTY_LIST).iterator() );\n");
			    	sb.append("            }\n");
			    	sb.append("        }\n");
			    	sb.append("\n");
					sb.append("        return(attr.getMV());\n");
					sb.append("    }\n\n");
					
			    	sb.append("    /**\n");
					sb.append("     * @return An Iterator of " + typeName + "REFs without attempting lazy resolution (if it's turned on).\n");
					sb.append("     */\n");
			    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
					sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
					sb.append("    public Iterator<" + typeName + REF + "> get" + functionName + "REFs(){\n");
					sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getCompactSchemaReference() + ");\n");
					sb.append("        if (attr == null)\n");
					sb.append("            return( ((List<" + typeName + REF + ">) Collections.EMPTY_LIST).iterator() );\n");
			    	sb.append("\n");
					sb.append("        return(attr.getMV());\n");
					sb.append("    }\n\n");
				}
			
		    	sb.append("    /**\n");
		    	sb.append("     * Adds another " + ad.getName() + " to the specified value.\n");
		    	sb.append("     * @param value " + typeName + "\n");
		    	sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		    	sb.append("    public DmcAttribute<?> add" + functionName + "(" + typeName + DMO + " value) {\n");
		    	sb.append("        DmcAttribute<?> attr = get(" + ad.getCompactSchemaReference() + ");\n");
		    	sb.append("        if (attr == null)\n");
		    	sb.append("            attr = new " + attrType+ "(" + ad.getCompactSchemaReference() + ");\n");
		    	sb.append("        \n");
		    	sb.append("        try{\n");
		    	sb.append("            setLastValue(attr.add(value));\n");
		    	sb.append("            add(" + ad.getCompactSchemaReference() + ",attr);\n");
		    	sb.append("        }\n");
		    	sb.append("        catch(DMFeedbackSet ex){\n");
		    	sb.append("            throw(new IllegalStateException(\"The type specific add() method shouldn't throw exceptions!\",ex));\n");
		    	sb.append("        }\n");
		    	sb.append("        return(attr);\n");
		    	sb.append("    }\n\n");
			}
			else{
				if (ad.getType().getOriginalClass().getIsNamedBy() == null){
			    	sb.append("    /**\n");
					sb.append("     * @return The nth " + typeName + " value without attempting lazy resolution.\n");
					sb.append("     */\n");
					sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
					sb.append("    public " + typeName + DMO + " getNth" + functionName + "(int i){\n");
					sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getCompactSchemaReference() + ");\n");
					sb.append("        if (attr == null)\n");
					sb.append("            return(null);\n");
					sb.append("\n");
					sb.append("        return(attr.getMVnth(i));\n");
					sb.append("    }\n\n");
				}
				else{
			    	sb.append("    /**\n");
					sb.append("     * @return The nth " + typeName + " value and attempt lazy resolution if it's on.\n");
					sb.append("     */\n");
					sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
					sb.append("    public " + typeName + REF + " getNth" + functionName + "(int i){\n");
					sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getCompactSchemaReference() + ");\n");
					sb.append("        if (attr == null)\n");
					sb.append("            return(null);\n");
					sb.append("\n");
			    	sb.append("        if (DmcOmni.instance().lazyResolution()){\n");
			    	sb.append("            if (attr.doLazyResolution(this)){\n");
			    	sb.append("                rem(attr.getAttributeInfo());\n");
					sb.append("                return(null);\n");
			    	sb.append("            }\n");
			    	sb.append("        }\n");
					sb.append("\n");
					sb.append("        return(attr.getMVnth(i));\n");
					sb.append("    }\n\n");
					
			    	sb.append("    /**\n");
					sb.append("     * @return The nth " + typeName + " value without attempting lazy resolution.\n");
					sb.append("     */\n");
					sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
					sb.append("    public " + typeName + REF + " getNth" + functionName + "REF(int i){\n");
					sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getCompactSchemaReference() + ");\n");
					sb.append("        if (attr == null)\n");
					sb.append("            return(null);\n");
					sb.append("\n");
					sb.append("        return(attr.getMVnth(i));\n");
					sb.append("    }\n\n");
				}
				
		    	sb.append("    /**\n");
		    	sb.append("     * Sets the " + ad.getName() + " value at the specified index.\n");
		    	sb.append("     * @param value " + typeName + "\n");
		    	sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		    	sb.append("    public DmcAttribute<?> setNth" + functionName + "(int index, " + typeName + DMO + " value) {\n");
		    	sb.append("        DmcAttribute<?> attr = get(" + ad.getCompactSchemaReference() + ");\n");
		    	sb.append("        if (attr == null){\n");
		    	sb.append("            if (value == null){\n");
		    	sb.append("                if (getModifier() == null)\n");
		    	sb.append("                    throw(new IllegalStateException(\"Calling setNth() on a non-existent attribute with a null value makes no sense!\"));\n");
		    	sb.append("                else{\n");
		    	sb.append("                    nthNullFromEmptyAttribute(" + ad.getCompactSchemaReference() + ", index);\n");
		    	sb.append("                    return(null);\n");
		    	sb.append("                }\n");
		    	sb.append("            }\n");
		    	sb.append("            else\n");
		    	sb.append("                attr = new " + attrType+ "(" + ad.getCompactSchemaReference() + ");\n");
		    	sb.append("        }\n");
		    	sb.append("        \n");
		    	sb.append("        try{\n");
		    	if (ad.getType().getOriginalClass().getIsNamedBy() == null){
			    	sb.append("            setLastValue(attr.setMVnth(index, value));\n");
			    	sb.append("            nth(" + ad.getCompactSchemaReference() + ", index ,attr, null);\n");
		    	}
		    	else{
		    		sb.append("            " + typeName + REF + " previous = (" + typeName + REF + ") attr.getMVnth(index);\n");
			    	sb.append("            setLastValue(attr.setMVnth(index, value));\n");
			    	sb.append("            nth(" + ad.getCompactSchemaReference() + ",index ,attr,previous);\n");
		    	}
		    	sb.append("        }\n");
		    	sb.append("        catch(DMFeedbackSet ex){\n");
		    	sb.append("            throw(new IllegalStateException(\"The type specific setNth() method shouldn't throw exceptions!\",ex));\n");
		    	sb.append("        }\n");
		    	sb.append("        return(attr);\n");
		    	sb.append("    }\n\n");

			}

		}
		else{
	    	sb.append("    /**\n");
			sb.append("     * @return An Iterator of " + typeName + " objects.\n");
			sb.append("     */\n");
	    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public Iterator<" + typeName + "> get" + functionName + "(){\n");
			sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getCompactSchemaReference() + ");\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return( ((List<" + typeName + ">) Collections.EMPTY_LIST).iterator());\n");
			sb.append("\n");
			sb.append("        return(attr.getMV());\n");
			sb.append("    }\n\n");
			
	    	sb.append("    /**\n");
			sb.append("     * @return The nth " + typeName + " value.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public " + typeName + " getNth" + functionName + "(int i){\n");
			sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getCompactSchemaReference() + ");\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return(null);\n");
			sb.append("\n");
			sb.append("        return(attr.getMVnth(i));\n");
			sb.append("    }\n\n");
			
			if (ad.getIndexSize() == null){
		    	sb.append("    /**\n");
		    	sb.append("     * Adds another " + ad.getName() + " to the specified value.\n");
		    	sb.append("     * @param value " + typeName + "\n");
		    	sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		    	sb.append("    public DmcAttribute<?> add" + functionName + "(" + typeName + " value) {\n");
		    	sb.append("        DmcAttribute<?> attr = get(" + ad.getCompactSchemaReference() + ");\n");
		    	sb.append("        if (attr == null)\n");
		    	sb.append("            attr = new " + attrType+ "(" + ad.getCompactSchemaReference() + ");\n");
		    	sb.append("        \n");
		    	sb.append("        try{\n");
		    	sb.append("            setLastValue(attr.add(value));\n");
		    	sb.append("            add(" + ad.getCompactSchemaReference() + ",attr);\n");
		    	sb.append("        }\n");
		    	sb.append("        catch(DMFeedbackSet ex){\n");
		    	sb.append("            throw(new IllegalStateException(\"The type specific add() method shouldn't throw exceptions!\",ex));\n");
		    	sb.append("        }\n");
		    	sb.append("        return(attr);\n");
		    	sb.append("    }\n\n");
			}
			else{
		    	sb.append("    /**\n");
		    	sb.append("     * Sets the value at the specified index.\n");
		    	sb.append("     * @param value " + typeName + "\n");
		    	sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		    	sb.append("    public DmcAttribute<?> setNth" + functionName + "(int index, " + typeName + " value) {\n");
		    	sb.append("        DmcAttribute<?> attr = get(" + ad.getCompactSchemaReference() + ");\n");
		    	sb.append("        if (attr == null){\n");
		    	sb.append("            if (value == null){\n");
		    	sb.append("                if (getModifier() == null)\n");
		    	sb.append("                    throw(new IllegalStateException(\"Calling setNth() on a non-existent attribute with a null value makes no sense!\"));\n");
		    	sb.append("                else{\n");
		    	sb.append("                    nthNullFromEmptyAttribute(" + ad.getCompactSchemaReference() + ", index);\n");
		    	sb.append("                    return(null);\n");
		    	sb.append("                }\n");
		    	sb.append("            }\n");
		    	sb.append("            else\n");
		    	sb.append("                attr = new " + attrType+ "(" + ad.getCompactSchemaReference() + ");\n");
		    	sb.append("        }\n");
		    	sb.append("        \n");
		    	sb.append("        try{\n");
		    	sb.append("            " + typeName + " previous = (" + typeName + ") attr.getMVnth(index);\n");
		    	sb.append("            setLastValue(attr.setMVnth(index, value));\n");
		    	sb.append("            nth(" + ad.getCompactSchemaReference() + ",index ,attr,previous);\n");
		    	sb.append("        }\n");
		    	sb.append("        catch(DMFeedbackSet ex){\n");
		    	sb.append("            throw(new IllegalStateException(\"The type specific setNth() method shouldn't throw exceptions!\",ex));\n");
		    	sb.append("        }\n");
		    	sb.append("        return(attr);\n");
		    	sb.append("    }\n\n");
			}
	    	
	    	if (ad.getType().getAltType() != null){
		    	sb.append("    /**\n");
		    	sb.append("     * Adds another " + ad.getName() + " to the specified value.\n");
		    	sb.append("     * @param value " + typeName + "\n");
		    	sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		    	sb.append("    public DmcAttribute<?> add" + functionName + "(" + ad.getType().getAltType() + " value) {\n");
		    	sb.append("        DmcAttribute<?> attr = get(" + ad.getCompactSchemaReference() + ");\n");
		    	sb.append("        if (attr == null)\n");
		    	sb.append("            attr = new " + attrType+ "(" + ad.getCompactSchemaReference() + ");\n");
		    	sb.append("        \n");
		    	sb.append("        try{\n");
		    	sb.append("            setLastValue(attr.add(value));\n");
		    	sb.append("            add(" + ad.getCompactSchemaReference() + ",attr);\n");
		    	sb.append("        }\n");
		    	sb.append("        catch(DMFeedbackSet ex){\n");
		    	sb.append("            throw(new IllegalStateException(\"The alternative type specific add() method shouldn't throw exceptions!\",ex));\n");
		    	sb.append("        }\n");
		    	sb.append("        return(attr);\n");
		    	sb.append("    }\n\n");	    		
	    	}

	    	sb.append("    /**\n");
	    	sb.append("     * Returns true if we contain a valued keyed by the specified " + typeName + ".\n");
	    	sb.append("     * @param value " + typeName + "\n");
	    	sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
	    	sb.append("    public boolean " + ad.getName() + "Contains(" + typeName + " value) {\n");
	    	sb.append("        DmcAttribute<?> attr = get(" + ad.getCompactSchemaReference() + ");\n");
	    	sb.append("        if (attr == null)\n");
	    	sb.append("            return(false);\n");
	    	sb.append("        return(attr.contains(value));\n");
	    	sb.append("    }\n\n");

	    	if (ad.getType().getAltType() != null){
	    		String alt = ad.getType().getAltType();
		    	sb.append("    /**\n");
		    	sb.append("     * Returns true if we contain a valued keyed by the specified " + alt + ".\n");
		    	sb.append("     * @param value " + alt + "\n");
		    	sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		    	sb.append("    public boolean " + ad.getName() + "Contains(" + alt + " value) {\n");
		    	sb.append("        DmcAttribute<?> attr = get(" + ad.getCompactSchemaReference() + ");\n");
		    	sb.append("        if (attr == null)\n");
		    	sb.append("            return(false);\n");
		    	sb.append("        return(attr.contains(value));\n");
		    	sb.append("    }\n\n");
	    	}

		}
		
    	////////////////////////////////////////////////////////////////////////////////
    	// adder

		sb.append("    /**\n");
		sb.append("     * Adds another " + ad.getName() + " value.\n");
		sb.append("     * @param value A value compatible with " + typeName + "\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public DmcAttribute<?> add" + functionName + "(Object value) throws DMFeedbackSet {\n");
    	sb.append("        DmcAttribute<?> attr = get(" + ad.getCompactSchemaReference() + ");\n");
    	sb.append("        if (attr == null)\n");
    	sb.append("            attr = new " + attrType+ "(" + ad.getCompactSchemaReference() + ");\n");
    	sb.append("        \n");
    	sb.append("        setLastValue(attr.add(value));\n");
    	sb.append("        add(" + ad.getCompactSchemaReference() + ",attr);\n");
    	sb.append("        return(attr);\n");
		sb.append("    }\n\n");

    	////////////////////////////////////////////////////////////////////////////////
    	// size

		sb.append("    /**\n");
		sb.append("     * Returns the number of values in " + ad.getName() + "\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public int get" + functionName + "Size(){\n");
    	sb.append("        DmcAttribute<?> attr = get(" + ad.getCompactSchemaReference() + ");\n");
    	sb.append("        if (attr == null){\n");
    	sb.append("            if (" + ad.getCompactSchemaReference() + ".indexSize == 0)\n");
    	sb.append("                return(0);\n");
    	sb.append("            else\n");
    	sb.append("                return(" + ad.getCompactSchemaReference() + ".indexSize);\n");
    	sb.append("        }\n");
    	sb.append("        return(attr.getMVSize());\n");
		sb.append("    }\n\n");

    	
    	////////////////////////////////////////////////////////////////////////////////
    	// deleter

		if (ad.getType().getIsRefType()){
			if (ad.getType().getOriginalClass().getIsNamedBy() == null){
				sb.append("    /**\n");
				sb.append("     * Deletes a " + ad.getName() + " value.\n");
				sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
				sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public DmcAttribute<?> del" + functionName + "(Object value){\n");
		    	sb.append("        DmcAttribute<?> attr = get(" + ad.getCompactSchemaReference() + ");\n");
				sb.append("        \n");
				sb.append("        if ( (attr == null) && (getModifier()!= null))\n");
				sb.append("            delFromEmptyAttribute(new " + attrType+ "(" + ad.getCompactSchemaReference() + "), value);\n");
				sb.append("        else\n");
				sb.append("            attr = del(" + ad.getCompactSchemaReference() + ", value);\n");
				sb.append("        \n");
				sb.append("        return(attr);\n");
				sb.append("    }\n\n");
			}
			else{
				sb.append("    /**\n");
				sb.append("     * Deletes a " + ad.getName() + " value.\n");
				sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
				sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public DmcAttribute<?> del" + functionName + "(Object value){\n");
		    	sb.append("        DmcAttribute<?> attr = get(" + ad.getCompactSchemaReference() + ");\n");
				sb.append("        \n");
				sb.append("        if ( (attr == null) && (getModifier()!= null))\n");
				sb.append("            delFromEmptyAttribute(new " + attrType+ "(" + ad.getCompactSchemaReference() + "), value);\n");
				sb.append("        else\n");
				sb.append("            attr = del(" + ad.getCompactSchemaReference() + ", value);\n");
				sb.append("        \n");
				sb.append("        return(attr);\n");
				sb.append("    }\n\n");
			}
		}
		else{
			sb.append("    /**\n");
			sb.append("     * Deletes a " + ad.getName() + " value.\n");
			sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
			sb.append("     */\n");//	    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public DmcAttribute<?> del" + functionName + "(Object value) throws DMFeedbackSet {\n");
	    	sb.append("        DmcAttribute<?> attr = get(" + ad.getCompactSchemaReference() + ");\n");
			sb.append("        \n");
			sb.append("        if ( (attr == null) && (getModifier()!= null))\n");
			sb.append("            delFromEmptyAttribute(new " + attrType+ "(" + ad.getCompactSchemaReference() + "), value);\n");
			sb.append("        else\n");
			sb.append("            attr = del(" + ad.getCompactSchemaReference() + ", value);\n");
			sb.append("        \n");
			sb.append("        return(attr);\n");
			sb.append("    }\n\n");
			
	    	sb.append("    /**\n");
	    	sb.append("     * Deletes a " + ad.getName() + " from the specified value.\n");
	    	sb.append("     * @param value " + typeName + "\n");
	    	sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
	    	sb.append("    public DmcAttribute<?> del" + functionName + "(" + typeName + " value) {\n");
	    	sb.append("        DmcAttribute<?> attr = get(" + ad.getCompactSchemaReference() + ");\n");
			sb.append("        \n");
			sb.append("        if ( (attr == null) && (getModifier()!= null))\n");
			sb.append("            delFromEmptyAttribute(new " + attrType+ "(" + ad.getCompactSchemaReference() + "), value);\n");
			sb.append("        else\n");
			sb.append("            attr = del(" + ad.getCompactSchemaReference() + ", value);\n");
			sb.append("        \n");
			sb.append("        return(attr);\n");
	    	sb.append("    }\n\n");
	    	
		}

    	////////////////////////////////////////////////////////////////////////////////
    	// remover
		sb.append("    /**\n");
		sb.append("     * Removes the " + ad.getName() + " attribute value.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public void rem" + functionName + "(){\n");
		sb.append("         rem(" + ad.getCompactSchemaReference() + ");\n");
		sb.append("    }\n\n");
		
		
	}

	
	static public void formatMAPPED(AttributeDefinition ad, StringBuffer sb){
    	String typeClassName = ad.getType().getTypeClassName();
    	String attrType = "DmcType" + ad.getType().getName();
    	String typeName = ad.getType().getName().getNameString();
    	
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
    	
    	attrType = attrType + "MAP";
    	
    	////////////////////////////////////////////////////////////////////////////////
    	// getter

		if (ad.getType().getIsRefType()){
	    	sb.append("    /**\n");
			sb.append("     * @return An Iterator of " + typeName + "DMO objects.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			if (ad.getType().getOriginalClass().getIsNamedBy() == null){
				sb.append("    public Iterator<" + typeName + "DMO> get" + functionName + "(){\n");			
				sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getCompactSchemaReference() + ");\n");
				sb.append("        if (attr == null)\n");
				sb.append("            return(Collections.<" + typeName + "DMO> emptyList().iterator());\n");
				sb.append("\n");
				sb.append("        return(attr.getMV());\n");
				sb.append("    }\n\n");
			}
			else{
		    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public Iterator<" + typeName + "REF> get" + functionName + "(){\n");
				sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getCompactSchemaReference() + ");\n");
				sb.append("        if (attr == null)\n");
				sb.append("            return( ((List<" + typeName + "REF>) Collections.EMPTY_LIST).iterator() );\n");
		    	sb.append("\n");
		    	sb.append("        if (DmcOmni.instance().lazyResolution()){\n");
		    	sb.append("            if (attr.doLazyResolution(this)){\n");
		    	sb.append("                rem(attr.getAttributeInfo());\n");
				sb.append("                return( ((List<" + typeName + "REF>) Collections.EMPTY_LIST).iterator() );\n");
		    	sb.append("            }\n");
		    	sb.append("        }\n");
				sb.append("\n");
				sb.append("        return(attr.getMV());\n");
				sb.append("    }\n\n");
				
		    	sb.append("    /**\n");
				sb.append("     * @return An Iterator of " + typeName + "REFs without attempting lazy resolution (if it's turned on).\n");
				sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
				sb.append("    public Iterator<" + typeName + "REF> get" + functionName + "REFs(){\n");
				sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getCompactSchemaReference() + ");\n");
				sb.append("        if (attr == null)\n");
				sb.append("            return( ((List<" + typeName + "REF>) Collections.EMPTY_LIST).iterator() );\n");
		    	sb.append("\n");
				sb.append("        return(attr.getMV());\n");
				sb.append("    }\n\n");
			}
		}
		else{
	    	sb.append("    /**\n");
			sb.append("     * @return An Iterator of " + typeName + " objects.\n");
			sb.append("     */\n");
	    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public Iterator<" + typeName + "> get" + functionName + "(){\n");
			sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getCompactSchemaReference() + ");\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return( ((List<" + typeName + ">) Collections.EMPTY_LIST).iterator());\n");
			sb.append("\n");
			sb.append("        return(attr.getMV());\n");
			sb.append("    }\n\n");
		}
		
    	////////////////////////////////////////////////////////////////////////////////
    	// get by key
		
		if (ad.getType().getIsRefType()){
	    	sb.append("    /**\n");
			sb.append("     * @param key The key of the value you want.\n");
			sb.append("     * @return The " + typeName + " associated with the specified key.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public " + typeName + "REF get" + functionName + "(Object key){\n");
			sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getCompactSchemaReference() + ");\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return(null);\n");
	    	sb.append("\n");
			sb.append("        return(attr.getByKey(key));\n");
			sb.append("    }\n\n");
		}
		else{
	    	sb.append("    /**\n");
			sb.append("     * @param key The key of the value you want.\n");
			sb.append("     * @return The " + typeName + " associated with the specified key.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public " + typeName + " get" + functionName + "(Object key){\n");
			sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getCompactSchemaReference() + ");\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return(null);\n");
			sb.append("\n");
			sb.append("        return(attr.getByKey(key));\n");
			sb.append("    }\n\n");
		}
		
		if (ad.getValueType() == ValueTypeEnum.TREEMAPPED){
			
			String keyClass = ad.getType().getKeyClass();
			if (ad.getType().getIsRefType()){
				keyClass = ad.getType().getOriginalClass().getIsNamedBy().getType().getName().getNameString();
			}
			
	    	sb.append("    /**\n");
			sb.append("     * @return The first key of the map.\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public " + keyClass + " get" + functionName + "FirstKey(){\n");
			sb.append("        " + attrType + " attr = (" + attrType + ") get(" + ad.getCompactSchemaReference() + ");\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return(null);\n");
			sb.append("\n");
			sb.append("        return(attr.firstKey());\n");
			sb.append("    }\n\n");
		}
		
    	////////////////////////////////////////////////////////////////////////////////
    	// adder

		sb.append("    /**\n");
		sb.append("     * Adds another " + ad.getName() + " value.\n");
		sb.append("     * @param value A value compatible with " + typeName + "\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public DmcAttribute<?> add" + functionName + "(Object value) throws DMFeedbackSet {\n");
    	sb.append("        DmcAttribute<?> attr = get(" + ad.getCompactSchemaReference() + ");\n");
    	sb.append("        if (attr == null)\n");
    	sb.append("            attr = new " + attrType+ "(" + ad.getCompactSchemaReference() + ");\n");
    	sb.append("        \n");
    	sb.append("        setLastValue(attr.add(value));\n");
    	sb.append("        add(" + ad.getCompactSchemaReference() + ",attr);\n");
    	sb.append("        return(attr);\n");
		sb.append("    }\n\n");

		if (ad.getType().getIsRefType()){
			sb.append("    /**\n");
			sb.append("     * Adds another " + ad.getName() + " value.\n");
			sb.append("     * @param value " + typeName + "\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public DmcAttribute<?> add" + functionName + "(" + typeName+ "DMO value) {\n");
	    	sb.append("        DmcAttribute<?> attr = get(" + ad.getCompactSchemaReference() + ");\n");
	    	sb.append("        if (attr == null)\n");
	    	sb.append("            attr = new " + attrType+ "(" + ad.getCompactSchemaReference() + ");\n");
	    	sb.append("        \n");
	    	sb.append("        try{\n");
	    	sb.append("            setLastValue(attr.add(value));\n");
	    	sb.append("            add(" + ad.getCompactSchemaReference() + ",attr);\n");
	    	sb.append("        }\n");
	    	sb.append("        catch(DMFeedbackSet ex){\n");
	    	sb.append("            throw(new IllegalStateException(\"The type specific add() method shouldn't throw exceptions!\",ex));\n");
	    	sb.append("        }\n");
	    	sb.append("        return(attr);\n");
			sb.append("    }\n\n");
		}
		else{
			sb.append("    /**\n");
			sb.append("     * Adds another " + ad.getName() + " value.\n");
			sb.append("     * @param value " + typeName + "\n");
			sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public DmcAttribute<?> add" + functionName + "(" + typeName+ " value) {\n");
	    	sb.append("        DmcAttribute<?> attr = get(" + ad.getCompactSchemaReference() + ");\n");
	    	sb.append("        if (attr == null)\n");
	    	sb.append("            attr = new " + attrType+ "(" + ad.getCompactSchemaReference() + ");\n");
	    	sb.append("        \n");
	    	sb.append("        try{\n");
	    	sb.append("            setLastValue(attr.add(value));\n");
	    	sb.append("            add(" + ad.getCompactSchemaReference() + ",attr);\n");
	    	sb.append("        }\n");
	    	sb.append("        catch(DMFeedbackSet ex){\n");
	    	sb.append("            throw(new IllegalStateException(\"The type specific add() method shouldn't throw exceptions!\",ex));\n");
	    	sb.append("        }\n");
	    	sb.append("        return(attr);\n");
			sb.append("    }\n\n");
		}

    	////////////////////////////////////////////////////////////////////////////////
    	// deleter

		if (ad.getType().getIsRefType()){
			if (ad.getType().getOriginalClass().getIsNamedBy() == null){
				DebugInfo.debug("*** Mapped value deletion not yet supported for non object reference types.");
//				sb.append("    /**\n");
//				sb.append("     * Deletes a " + ad.getName() + " value.\n");
//				sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
//				sb.append("     */\n");
//		    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
//				sb.append("    public DmcAttribute del" + functionName + "(Object value){\n");
//		    	sb.append("        DmcAttribute attr = del(" + ad.getDMSAGReference() + ", value);\n");
//				sb.append("        return(attr);\n");
//				sb.append("    }\n\n");
			}
			else{
				sb.append("    /**\n");
				sb.append("     * Deletes a " + ad.getName() + " value.\n");
				sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
				sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public DmcAttribute<?> del" + functionName + "(Object value) throws DMFeedbackSet {\n");
		    	sb.append("        DmcAttribute<?> attr = get(" + ad.getCompactSchemaReference() + ");\n");
				sb.append("        \n");
				sb.append("        if ( (attr == null) && (getModifier()!= null))\n");
				sb.append("            delFromEmptyAttribute(new " + attrType+ "(" + ad.getCompactSchemaReference() + "), value);\n");
				sb.append("        else\n");
				sb.append("            attr = del(" + ad.getCompactSchemaReference() + ", value);\n");
				sb.append("        \n");
				sb.append("        return(attr);\n");
				sb.append("    }\n\n");
				
				sb.append("    /**\n");
				sb.append("     * Deletes a " + ad.getName() + " value.\n");
				sb.append("     * @param value The " + typeName + " to be deleted from set of attribute values.\n");
				sb.append("     */\n");
				sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
				sb.append("    public DmcAttribute<?> del" + functionName + "(" + typeName + "DMO value){\n");
		    	sb.append("        DmcAttribute<?> attr = get(" + ad.getCompactSchemaReference() + ");\n");
				sb.append("        \n");
				sb.append("        if ( (attr == null) && (getModifier()!= null))\n");
				sb.append("            delFromEmptyAttribute(new " + attrType+ "(" + ad.getCompactSchemaReference() + "), value.getObjectName());\n");
				sb.append("        else\n");
				sb.append("            attr = del(" + ad.getCompactSchemaReference() + ", value.getObjectName());\n");
				sb.append("        \n");
				sb.append("        return(attr);\n");
				sb.append("    }\n\n");

			}
		}
		else{
			sb.append("    /**\n");
			sb.append("     * Deletes a " + ad.getName() + " value.\n");
			sb.append("     * @param key The key of the " + typeName + " to be deleted from the map of attribute values.\n");
			sb.append("     */\n");//	    	sb.append("    @SuppressWarnings(\"unchecked\")\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
			sb.append("    public DmcAttribute<?> del" + functionName + "(Object key){\n");
	    	sb.append("        DmcAttribute<?> attr = get(" + ad.getCompactSchemaReference() + ");\n");
			sb.append("        \n");
			sb.append("        if ( (attr == null) && (getModifier()!= null))\n");
			sb.append("            delFromEmptyAttribute(new " + attrType+ "(" + ad.getCompactSchemaReference() + "), key);\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return(null);\n");
			sb.append("        \n");
			sb.append("        attr = del(" + ad.getCompactSchemaReference() + ", key);\n");
			sb.append("        \n");
			sb.append("        return(attr);\n");
			sb.append("    }\n\n");
			
	    	sb.append("    /**\n");
			sb.append("     * Deletes a " + ad.getName() + " value.\n");
	    	sb.append("     * @param key the " + ad.getType().getKeyClass() + " key value\n");
	    	sb.append("     */\n");
			sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
	    	sb.append("    public DmcAttribute<?> del" + functionName + "(" + ad.getType().getKeyClass() + " key) {\n");
	    	sb.append("        DmcAttribute<?> attr = get(" + ad.getCompactSchemaReference() + ");\n");
			sb.append("        \n");
			sb.append("        if ( (attr == null) && (getModifier()!= null))\n");
			sb.append("            delFromEmptyAttribute(new " + attrType+ "(" + ad.getCompactSchemaReference() + "), key);\n");
			sb.append("        if (attr == null)\n");
			sb.append("            return(null);\n");
			sb.append("        \n");
			sb.append("        attr = del(" + ad.getCompactSchemaReference() + ", key);\n");
			sb.append("        \n");
			sb.append("        return(attr);\n");
	    	sb.append("    }\n\n");

		}

    	////////////////////////////////////////////////////////////////////////////////
    	// contains
		// TODO: add support for containsKey with MAPPED attributes
//    	sb.append("    /**\n");
//    	sb.append("     * Returns true if we contain a valued keyed by the specified " + typeName + ".\n");
//    	sb.append("     * @param value " + typeName + "\n");
//    	sb.append("     */\n");
//		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
//    	sb.append("    public boolean " + ad.getName() + "ContainsKey(" + ad.getType().getKeyClass() + " value) {\n");
//    	sb.append("        DmcAttribute<?> attr = get(" + ad.getDMSAGReference() + ");\n");
//    	sb.append("        return(attr.contains(value));\n");
//    	sb.append("    }\n\n");

    	////////////////////////////////////////////////////////////////////////////////
    	// remover
		sb.append("    /**\n");
		sb.append("     * Removes the " + ad.getName() + " attribute value.\n");
		sb.append("     */\n");
		sb.append("    // " + DebugInfo.getWhereWeAreNow() + "\n");
		sb.append("    public void rem" + functionName + "(){\n");
		sb.append("         rem(" + ad.getCompactSchemaReference() + ");\n");
		sb.append("    }\n\n");
		
		
	}


}

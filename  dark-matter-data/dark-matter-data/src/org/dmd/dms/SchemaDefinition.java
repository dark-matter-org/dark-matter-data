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
package org.dmd.dms;

import java.util.Iterator;
import java.util.TreeMap;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.generated.dmw.SchemaDefinitionDMW;
import org.dmd.dms.generated.enums.ValueTypeEnum;
import org.dmd.util.exceptions.ResultException;

public class SchemaDefinition extends SchemaDefinitionDMW {

    // Stores the name of the schema as it would be referred to in a static
    // reference
    protected String staticRefName;

    // Indicates if we've called initializeDefs() - we only do this once.
    protected boolean defsCompleteV;
    
    // This will be set by the SchemaParser using information from the schema
    // location. If the schema isn't versioned, this will be unknown, otherwise
    // it will be the version of the schema e.g. 1.3
    protected String version;
    
    // Auto generated schemas will populate this map
    // Key: schema name
    // Value: the fully  qualified name of the auto generated SchemaAG class
    protected TreeMap<String,String> dependsOnSchemaClasses;

    // This value is set to true in SchemaAG instances. This allows us to distinguish
    // between schemas we've read on the fly and ones that have been blown into code.
    protected boolean generatedSchema;
    
    /**
     * Default constructor.
     */
    public SchemaDefinition(){
    	dependsOnSchemaClasses = new TreeMap<String, String>();
    	generatedSchema = false;
    }

	protected SchemaDefinition(String mn) throws DmcValueException {
		super(mn);
    	dependsOnSchemaClasses = new TreeMap<String, String>();
    	generatedSchema = false;
	}
	
	public String getDependsOnClass(String schemaName){
		return(dependsOnSchemaClasses.get(schemaName));
	}

	/**
	 * Generated schemas overload this method to provide access to their initialized
	 * information.
	 * @return The schema instance.
	 * @throws DmcValueException
	 */
	public SchemaDefinition getInstance() throws DmcValueException {
		return(null);
	}
	
	/**
	 * Indicates if this schema definition exists as code of has been read on the fly.
	 * @return true if it's generated.
	 */
	public boolean isGeneratedSchema(){
		return(generatedSchema);
	}
	
	/**
	 * Returns the name of this schema as it would be referred to in a static reference.
	 * For example org.dmd.dmr.server.ldap.generated.DmrLdapSchemaAG
	 * @return The name of the schema when used in a static context.
	 */
	public String getStaticRefName(){
		return(staticRefName);
	}

    /**
     * Indicates if our initializeDefs() function has been called.
     */
    public boolean defsComplete(){
        return(defsCompleteV);
    }
    
    public void setVersion(String v){
    	version = v;
    }
    
    public String getVersion(){
    	return(version);
    }
    
    public void dumpInfo(){
    	int ccount 	= 0;
    	int acount	= 0;;
    	int sv		= 0;
    	int mv		= 0;
    	
    	Iterator<ClassDefinition> cl = getClassDefList();
    	while(cl.hasNext()){
    		cl.next();
    		ccount++;
    	}
    	Iterator<AttributeDefinition> al = getAttributeDefList();
    	while(al.hasNext()){
    		AttributeDefinition ad = al.next();
    		acount++;
    		
    		if (ad.getValueType() == ValueTypeEnum.SINGLE)
    			sv++;
    		else
    			mv++;
    	}
    	System.out.println("Classes:    " + ccount);
    	System.out.println("Attributes: " + acount);
    	System.out.println("        SV: " + sv);
    	System.out.println("        MV: " + mv);
    }

//    /**
//     * Initializes the static members of the schema so that they can be referred
//     * to by other schemas. At this level, this function does nothing. Derived
//     * schemas classes (which are usually automatically generated) will overload
//     * this function to perform the proper initialization.
//     * @param rs Place to return result information.
//     * @returns true If the initialization proceeded without problems and false otherwise.
//     */
//    public void initialize() throws ResultException {
//        
//    }
//
//    /**
//     * Initializes the values of the definitions. At this level, this function does nothing. Derived
//     * schemas classes (which are usually automatically generated) will overload
//     * this function to perform the proper initialization.
//     * @param rs Place to return result information.
//     * @returns true If the initialization proceeded without problems and false otherwise.
//     */
//    public void initializeDefs() throws ResultException {
//        
//    }

    /**
     * Determines if this version of the schema contains different classes compared
     * to its predecessor.
     */
    public int classChanges(SchemaDefinition pred, StringBuffer sb){
        int         rc = 0;

        return(rc);
    }

    /**
     * Determines if this version of the schema contains different attributes compared
     * to its predecessor.
     */
    public int attributeChanges(SchemaDefinition pred, StringBuffer sb, SchemaManager currManager){
//        DmdGenericAttribute c = (DmdGenericAttribute)this.getAttr(MetaSchema._attributeDefList);
//        DmdGenericAttribute p = (DmdGenericAttribute)pred.getAttr(MetaSchema._attributeDefList);
        int         rc = 0;
        
        /**
         * TODO finish implementing attributeChanges()
         */
        return(rc);
    }

    /**
     * Determines if this version of the schema contains different types compared
     * to its predecessor.
     */
    public int typeChanges(SchemaDefinition pred, StringBuffer sb){
//        DmdGenericAttribute c = (DmdGenericAttribute)this.getAttr(MetaSchema._typeDefList);
//        DmdGenericAttribute p = (DmdGenericAttribute)pred.getAttr(MetaSchema._typeDefList);
        int         rc = 0;

        /**
         * TODO finish implementing typeChanges()
         */

        return(rc);
    }

    /**
     * Attempts to add the specified definition to the schema. This method is generally
     * only used by code that reads schemas such at the DmsSchemaParser.
     * @throws DmcValueException 
     */
    public void addDefinition(DmsDefinition def) throws ResultException, DmcValueException {
    	
    	if (def instanceof AttributeDefinition)
    		this.addAttributeDefList((AttributeDefinition) def);
    	else if (def instanceof ClassDefinition)
    		this.addClassDefList((ClassDefinition) def);
    	else if (def instanceof ActionDefinition)
    		this.addActionDefList((ActionDefinition) def);
    	else if (def instanceof TypeDefinition)
    		this.addTypeDefList((TypeDefinition) def);
    	else if (def instanceof EnumDefinition)
    		this.addEnumDefList((EnumDefinition) def);
        else{
        	ResultException ex = new ResultException();
        	ex.addError("The specified object is not a DMD object: " + def.getObjectName());
        	throw(ex);
        }

    }
    
}

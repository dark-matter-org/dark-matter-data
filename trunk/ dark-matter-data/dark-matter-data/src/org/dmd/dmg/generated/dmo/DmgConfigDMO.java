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
package org.dmd.dmg.generated.dmo;

import java.util.*;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcValueException;
// import 2
import org.dmd.dmg.types.Generator;
// import 3 Generator
import org.dmd.dmg.types.DmcTypeGenerator;
// import 3 String
import org.dmd.dmc.types.DmcTypeString;

// import 5
import org.dmd.dmc.DmcObject;

@SuppressWarnings("serial")
/**
 * The DmgConfig class is used to specify a set of schemas and a set of  code
 * generators to be run when you want to generate various types of code.
 * <P>
 * Generated from the dmg schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.getClassHeader(DmoFormatter.java:440)
 */
public class DmgConfigDMO  extends DmcObject  {

    public final static String _schemaToLoad = "schemaToLoad";
    public final static String _configSuffix = "configSuffix";
    public final static String _description = "description";
    public final static String _generatedFileHeader = "generatedFileHeader";
    public final static String _generator = "generator";
    public final static String _genPackage = "genPackage";

    public DmgConfigDMO() {
        super("DmgConfig");
    }

    protected DmgConfigDMO(String oc) {
        super(oc);
    }

    public String getSchemaToLoad(){
        DmcTypeString attr = (DmcTypeString) get(_schemaToLoad);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets schemaToLoad to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setSchemaToLoad(Object value) throws DmcValueException {
        DmcAttribute attr = get(_schemaToLoad);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_schemaToLoad,attr);
    }

    /**
     * @returns An Iterator of String objects.
     */
    public Iterator<String> getConfigSuffix(){
        DmcTypeString attr = (DmcTypeString) get(_configSuffix);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another configSuffix value.
     * @param value A value compatible with String
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addConfigSuffix(Object value) throws DmcValueException {
        DmcAttribute attr = get(_configSuffix);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.add(value);
        add(_configSuffix,attr);
        return(attr);
    }

    /**
     * Deletes a configSuffix value.
     * @param value The String to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delConfigSuffix(Object value){
        return(del(_configSuffix, value));
    }

    public String getDescription(){
        DmcTypeString attr = (DmcTypeString) get(_description);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets description to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setDescription(Object value) throws DmcValueException {
        DmcAttribute attr = get(_description);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_description,attr);
    }

    public String getGeneratedFileHeader(){
        DmcTypeString attr = (DmcTypeString) get(_generatedFileHeader);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets generatedFileHeader to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setGeneratedFileHeader(Object value) throws DmcValueException {
        DmcAttribute attr = get(_generatedFileHeader);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_generatedFileHeader,attr);
    }

    /**
     * @returns An Iterator of Generator objects.
     */
    public Iterator<Generator> getGenerator(){
        DmcTypeGenerator attr = (DmcTypeGenerator) get(_generator);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another generator value.
     * @param value A value compatible with Generator
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute addGenerator(Object value) throws DmcValueException {
        DmcAttribute attr = get(_generator);
        if (attr == null)
            attr = new DmcTypeGenerator();
        
        attr.add(value);
        add(_generator,attr);
        return(attr);
    }

    /**
     * Deletes a generator value.
     * @param value The Generator to be deleted from set of attribute values.
     */
    @SuppressWarnings("unchecked")
    public DmcAttribute delGenerator(Object value){
        return(del(_generator, value));
    }

    public String getGenPackage(){
        DmcTypeString attr = (DmcTypeString) get(_genPackage);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets genPackage to the specified value.
     * @param value A value compatible with DmcTypeString
     */
    @SuppressWarnings("unchecked")
    public void setGenPackage(Object value) throws DmcValueException {
        DmcAttribute attr = get(_genPackage);
        if (attr == null)
            attr = new DmcTypeString();
        
        attr.set(value);
        set(_genPackage,attr);
    }




}

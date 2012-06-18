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
package org.dmd.dms.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1311)
import java.io.Serializable;                       // Serializable marker interface - (MetaGenerator.java:1275)
import java.util.*;                                // Attribute info support - (MetaGenerator.java:1276)
import org.dmd.dmc.*;                              // Dark matter core - (MetaGenerator.java:1291)
import org.dmd.dms.generated.dmo.MetaVCAG;         // Old validation farmeowrk - obsolete - (MetaGenerator.java:1292)
import org.dmd.dms.generated.types.*;              // Generated type access - (MetaGenerator.java:1302)


/**
 * null
 * @author Auto Generated
 * Generated from: org.dmd.dms.meta.MetaGenerator.dumpDMOClasses(MetaGenerator.java:1320)
 */
@SuppressWarnings("serial")
public class AllowedAttributesRuleDMO extends DmcObject implements Serializable {



    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(MetaDMSAG.__ruleTitle.id,MetaDMSAG.__ruleTitle);
        _ImAp.put(MetaDMSAG.__schemaExtension.id,MetaDMSAG.__schemaExtension);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(MetaDMSAG.__ruleTitle.name,MetaDMSAG.__ruleTitle);
        _SmAp.put(MetaDMSAG.__schemaExtension.name,MetaDMSAG.__schemaExtension);

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String ,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }


    public AllowedAttributesRuleDMO(){
        super("AllowedAttributesRule");
    }

    public AllowedAttributesRuleDMO(String oc){
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public AllowedAttributesRuleDMO getNew(){
        AllowedAttributesRuleDMO rc = new AllowedAttributesRuleDMO();
        return(rc);
    }

    @Override
    public AllowedAttributesRuleDMO getSlice(DmcSliceInfo info){
        AllowedAttributesRuleDMO rc = new AllowedAttributesRuleDMO();
        populateSlice(rc,info);
        return(rc);
    }

    /**
     * The title of a rule.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1695)
    public String getRuleTitle(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(MetaDMSAG.__ruleTitle);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets ruleTitle to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpSVAccessFunction(MetaGenerator.java:1746)
    public void setRuleTitle(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__ruleTitle);
        if (attr == null)
            attr = new DmcTypeStringSV(MetaDMSAG.__ruleTitle);
        
        attr.set(value);
        set(MetaDMSAG.__ruleTitle,attr);
    }

    /**
     * The fully qualified name of a class that extends the schema management
     * capabilities of the SchemaManager. the class must have a zero arg
     * constructor and implement the SchemaExtensionIF.
     * @return An Iterator of String objects.
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1838)
    public Iterator<String> getSchemaExtension(){
        DmcTypeStringMV attr = (DmcTypeStringMV) get(MetaDMSAG.__schemaExtension);
        if (attr == null)
            return(null);

        return(attr.getMV());
    }

    /**
     * Adds another schemaExtension value.
     * @param value A value compatible with DmcTypeStringMV
     */
    // org.dmd.dms.meta.MetaGenerator.dumpMVAccessFunction(MetaGenerator.java:1883)
    public DmcAttribute<?> addSchemaExtension(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(MetaDMSAG.__schemaExtension);
        if (attr == null)
            attr = new DmcTypeStringMV(MetaDMSAG.__schemaExtension);
        
        attr.add(value);
        add(MetaDMSAG.__schemaExtension,attr);
        return(attr);
    }


}

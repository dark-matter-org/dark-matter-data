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
package org.dmd.dmv.shared.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:274)
import java.io.Serializable;                                                // Always required
import java.util.*;                                                         // Always required
import org.dmd.dmc.DmcAttribute;                                            // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                                        // Always required
import org.dmd.dmc.DmcOmni;                                                 // Lazy resolution
import org.dmd.dmc.DmcValueException;                                       // Any attributes
import org.dmd.dms.generated.dmo.AttributeDefinitionDMO;                    // Type specific set/add
import org.dmd.dms.generated.enums.ValueTypeEnum;                           // Required if we have any attributes
import org.dmd.dms.generated.types.AttributeDefinitionREF;                  // Helper class
import org.dmd.dms.generated.types.DmcTypeAttributeDefinitionREFSV;         // Reference type
import org.dmd.dmv.shared.generated.dmo.RuleDMO;                            // Base class

/**
 * The AttributeRule is the simplest rule that operates on a single attribute.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:127)
 */
@SuppressWarnings("serial")
abstract public class AttributeRuleDMO  extends RuleDMO  implements Serializable  {

    public final static String constructionClassName = "AttributeRule";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __applyToAttribute = new DmcAttributeInfo("applyToAttribute",303,"AttributeDefinition",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __name = new DmcAttributeInfo("name",2,"StringName",ValueTypeEnum.SINGLE,false);
    public final static DmcAttributeInfo __ruleTitle = new DmcAttributeInfo("ruleTitle",300,"String",ValueTypeEnum.SINGLE,false);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__applyToAttribute.id,__applyToAttribute);
        _ImAp.put(__name.id,__name);
        _ImAp.put(__ruleTitle.id,__ruleTitle);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__applyToAttribute.name,__applyToAttribute);
        _SmAp.put(__name.name,__name);
        _SmAp.put(__ruleTitle.name,__ruleTitle);
    }

    public AttributeRuleDMO() {
        super("AttributeRule");
    }

    protected AttributeRuleDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:506)
    public AttributeDefinitionREF getApplyToAttribute(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(__applyToAttribute);
        if (attr == null)
            return(null);

        if (DmcOmni.instance().lazyResolution()){
            if (attr.doLazyResolution(this)){
                rem(attr.getAttributeInfo());
                return(null);
            }
        }

        return(attr.getSV());
    }

    /**
     * Sets applyToAttribute to the specified value.
     * @param value AttributeDefinitionDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:545)
    public void setApplyToAttribute(AttributeDefinitionDMO value) {
        DmcAttribute<?> attr = get(__applyToAttribute);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(__applyToAttribute);
        
        try{
            attr.set(value);
            set(__applyToAttribute,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets applyToAttribute to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:626)
    public void setApplyToAttribute(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__applyToAttribute);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(__applyToAttribute);
        
        attr.set(value);
        set(__applyToAttribute,attr);
    }

    /**
     * Removes the applyToAttribute attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:641)
    public void remApplyToAttribute(){
         rem(__applyToAttribute);
    }




}

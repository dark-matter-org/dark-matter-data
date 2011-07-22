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

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:321)
import java.io.Serializable;                                                // Always required
import java.util.*;                                                         // Always required
import org.dmd.dmc.DmcAttribute;                                            // Any attributes
import org.dmd.dmc.DmcNamedObjectIF;                                        // Named object reference
import org.dmd.dmc.DmcOmni;                                                 // Lazy resolution
import org.dmd.dmc.DmcValueException;                                       // Any attributes
import org.dmd.dms.generated.dmo.AttributeDefinitionDMO;                    // Type specific set/add
import org.dmd.dms.generated.types.AttributeDefinitionREF;                  // Helper class
import org.dmd.dms.generated.types.DmcTypeAttributeDefinitionREFSV;         // Reference type
import org.dmd.dmv.shared.generated.dmo.RuleDMO;                            // Base class

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcClassInfo;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The AttributeRule is the simplest rule that operates on a single attribute.
 * <P>
 * Generated from the dmv schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
abstract public class AttributeRuleDMO  extends RuleDMO  implements Serializable  {

    public final static String constructionClassName = "AttributeRule";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public AttributeRuleDMO() {
        super("AttributeRule");
    }

    protected AttributeRuleDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:572)
    public AttributeDefinitionREF getApplyToAttribute(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(DmvDMSAG.__applyToAttribute);
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
     * Returns the reference to AttributeDefinition without attempting lazy resolution (if turned on).
     */
    public AttributeDefinitionREF getApplyToAttributeREF(){
        DmcTypeAttributeDefinitionREFSV attr = (DmcTypeAttributeDefinitionREFSV) get(DmvDMSAG.__applyToAttribute);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets applyToAttribute to the specified value.
     * @param value AttributeDefinitionDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:625)
    public void setApplyToAttribute(AttributeDefinitionDMO value) {
        DmcAttribute<?> attr = get(DmvDMSAG.__applyToAttribute);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(DmvDMSAG.__applyToAttribute);
        
        try{
            attr.set(value);
            set(DmvDMSAG.__applyToAttribute,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets applyToAttribute to the specified value.
     * @param value A value compatible with DmcTypeAttributeDefinitionREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:732)
    public void setApplyToAttribute(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(DmvDMSAG.__applyToAttribute);
        if (attr == null)
            attr = new DmcTypeAttributeDefinitionREFSV(DmvDMSAG.__applyToAttribute);
        
        attr.set(value);
        set(DmvDMSAG.__applyToAttribute,attr);
    }

    /**
     * Removes the applyToAttribute attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:747)
    public void remApplyToAttribute(){
         rem(DmvDMSAG.__applyToAttribute);
    }




}

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
package org.dmd.dmp.server.servlet.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:355)
import java.io.Serializable;                                                  // Always required
import java.util.*;                                                           // Always required
import org.dmd.dmc.DmcAttribute;                                              // Any attributes
import org.dmd.dmc.DmcHierarchicNamedObjectIF;                                // Named object
import org.dmd.dmc.DmcNamedObjectIF;                                          // Named object
import org.dmd.dmc.DmcObject;                                                 // Structural class
import org.dmd.dmc.DmcOmni;                                                   // Lazy resolution
import org.dmd.dmc.DmcSliceInfo;                                              // Required for object slicing
import org.dmd.dmc.DmcValueException;                                         // Any attributes
import org.dmd.dmc.types.DotName;                                             // Naming attribute type
import org.dmd.dmp.server.servlet.generated.dmo.UserRIDMO;                    // Type specific set/add
import org.dmd.dmp.server.servlet.generated.types.DmcTypeUserRIREFSV;         // Reference type
import org.dmd.dmp.server.servlet.generated.types.UserRIREF;                  // Helper class
import org.dmd.dms.generated.dmo.MetaDMSAG;                                   // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeDotNameSV;                          // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;                         // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringSV;                           // Required type

import org.dmd.dms.generated.dmo.MetaVCAG;
import org.dmd.dmc.DmcAttributeValidator;
import org.dmd.dmc.DmcObjectValidator;

/**
 * The SessionRI represents an authenticated user session and is an important
 * aspect of any serious application. All interactions are usually associated
 * with a valid session and, in the case of the reference implementation of
 * the Dark MAtter Protocol service are also associated with the handling of
 * asynchronous message handling and events.
 * <P>
 * Generated from the dmp.server schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:133)
 */
@SuppressWarnings("serial")
public class SessionRIDMO  extends DmcObject  implements DmcNamedObjectIF, DmcHierarchicNamedObjectIF, Serializable  {

    public final static String constructionClassName = "SessionRI";

    static Map<Integer,HashMap<String,DmcAttributeValidator>> _AvDmAp;

    static Map<String ,DmcObjectValidator> _OvDmAp;


    static {

        _AvDmAp = new HashMap<Integer,HashMap<String,DmcAttributeValidator>>();

        _OvDmAp = new HashMap<String,DmcObjectValidator>();
        _OvDmAp.put(MetaVCAG.__AttributeSetValidator.getName(),MetaVCAG.__AttributeSetValidator);
    }

    public SessionRIDMO() {
        super("SessionRI");
    }

    protected SessionRIDMO(String oc) {
        super(oc);
    }

    protected Map<Integer,HashMap<String,DmcAttributeValidator>> getAttributeValidators(){
        return(_AvDmAp);
    }

    protected Map<String,DmcObjectValidator> getObjectValidators(){
        return(_OvDmAp);
    }

    @Override
    public SessionRIDMO getNew(){
        SessionRIDMO rc = new SessionRIDMO();
        return(rc);
    }

    @Override
    public SessionRIDMO getSlice(DmcSliceInfo info){
        SessionRIDMO rc = new SessionRIDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public SessionRIDMO(DmcTypeModifierMV mods) {
        super("SessionRI");
        modrec(true);
        setModifier(mods);
    }

    public SessionRIDMO getModificationRecorder(){
        SessionRIDMO rc = new SessionRIDMO();
        rc.setDotName(getDotName());
        rc.setModifier(new DmcTypeModifierMV(MetaDMSAG.__modify));
        rc.modrec(true);
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:744)
    public DotName getObjectName(){
        DmcAttribute<?> name = get(MetaDMSAG.__dotName);
        if (name != null)
            return((DotName)name.getSV());
    
        return(null);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:755)
    public DotName getHierarchicObjectName(){
        return(getObjectName());
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(MetaDMSAG.__dotName);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof SessionRIDMO){
            return( getObjectName().equals( ((SessionRIDMO) obj).getObjectName()) );
        }
        return(false);
    }

    public int hashCode(){
        DotName objn = getObjectName();
        if (objn == null)
            return(0);
        
        return(objn.hashCode());
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public DotName getDotName(){
        DmcTypeDotNameSV attr = (DmcTypeDotNameSV) get(MetaDMSAG.__dotName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets dotName to the specified value.
     * @param value DotName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:721)
    public void setDotName(DotName value) {
        DmcAttribute<?> attr = get(MetaDMSAG.__dotName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaDMSAG.__dotName);
        
        try{
            attr.set(value);
            set(MetaDMSAG.__dotName,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets dotName to the specified value.
     * @param value A value compatible with DmcTypeDotNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:773)
    public void setDotName(Object value) throws DmcValueException {
        DmcTypeDotNameSV attr  = (DmcTypeDotNameSV) get(MetaDMSAG.__dotName);
        if (attr == null)
            attr = new DmcTypeDotNameSV(MetaDMSAG.__dotName);
        
        attr.set(value);
        set(MetaDMSAG.__dotName,attr);
    }

    /**
     * Removes the dotName attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:793)
    public void remDotName(){
         rem(MetaDMSAG.__dotName);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public String getSessionIDRI(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmpServerDMSAG.__sessionIDRI);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sessionIDRI to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:721)
    public void setSessionIDRI(String value) {
        DmcAttribute<?> attr = get(DmpServerDMSAG.__sessionIDRI);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpServerDMSAG.__sessionIDRI);
        
        try{
            attr.set(value);
            set(DmpServerDMSAG.__sessionIDRI,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets sessionIDRI to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:773)
    public void setSessionIDRI(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmpServerDMSAG.__sessionIDRI);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpServerDMSAG.__sessionIDRI);
        
        attr.set(value);
        set(DmpServerDMSAG.__sessionIDRI,attr);
    }

    /**
     * Removes the sessionIDRI attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:793)
    public void remSessionIDRI(){
         rem(DmpServerDMSAG.__sessionIDRI);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public String getSessionHostRI(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(DmpServerDMSAG.__sessionHostRI);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sessionHostRI to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:721)
    public void setSessionHostRI(String value) {
        DmcAttribute<?> attr = get(DmpServerDMSAG.__sessionHostRI);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpServerDMSAG.__sessionHostRI);
        
        try{
            attr.set(value);
            set(DmpServerDMSAG.__sessionHostRI,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets sessionHostRI to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:773)
    public void setSessionHostRI(Object value) throws DmcValueException {
        DmcTypeStringSV attr  = (DmcTypeStringSV) get(DmpServerDMSAG.__sessionHostRI);
        if (attr == null)
            attr = new DmcTypeStringSV(DmpServerDMSAG.__sessionHostRI);
        
        attr.set(value);
        set(DmpServerDMSAG.__sessionHostRI,attr);
    }

    /**
     * Removes the sessionHostRI attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:793)
    public void remSessionHostRI(){
         rem(DmpServerDMSAG.__sessionHostRI);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:606)
    public UserRIREF getUserRefRI(){
        DmcTypeUserRIREFSV attr = (DmcTypeUserRIREFSV) get(DmpServerDMSAG.__userRefRI);
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
     * Returns the reference to UserRI without attempting lazy resolution (if turned on).
     */
    public UserRIREF getUserRefRIREF(){
        DmcTypeUserRIREFSV attr = (DmcTypeUserRIREFSV) get(DmpServerDMSAG.__userRefRI);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets userRefRI to the specified value.
     * @param value UserRIDMO
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:659)
    public void setUserRefRI(UserRIDMO value) {
        DmcTypeUserRIREFSV attr  = (DmcTypeUserRIREFSV) get(DmpServerDMSAG.__userRefRI);
        if (attr == null)
            attr = new DmcTypeUserRIREFSV(DmpServerDMSAG.__userRefRI);
        else
            attr.removeBackReferences();
        
        try{
            attr.set(value);
            set(DmpServerDMSAG.__userRefRI,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets userRefRI to the specified value.
     * @param value A value compatible with DmcTypeUserRIREFSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:773)
    public void setUserRefRI(Object value) throws DmcValueException {
        DmcTypeUserRIREFSV attr  = (DmcTypeUserRIREFSV) get(DmpServerDMSAG.__userRefRI);
        if (attr == null)
            attr = new DmcTypeUserRIREFSV(DmpServerDMSAG.__userRefRI);
        else
            attr.removeBackReferences();
        
        attr.set(value);
        set(DmpServerDMSAG.__userRefRI,attr);
    }

    /**
     * Removes the userRefRI attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:793)
    public void remUserRefRI(){
         rem(DmpServerDMSAG.__userRefRI);
    }




}

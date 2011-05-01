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
package org.dmd.features.extgwt.examples.generated.dmo;

// Generated from: org.dmd.dms.util.GenUtility.formatImports(GenUtility.java:281)
import java.io.Serializable;                                     // Always required
import java.util.*;                                              // Always required
import org.dmd.dmc.DmcAttribute;                                 // Any attributes
import org.dmd.dmc.DmcAttributeInfo;                             // Always required
import org.dmd.dmc.DmcNamedObjectIF;                             // Named object
import org.dmd.dmc.DmcSliceInfo;                                 // Required for object slicing
import org.dmd.dmc.DmcValueException;                            // Any attributes
import org.dmd.dmc.types.IntegerName;                            // Naming attribute type
import org.dmd.dms.generated.dmo.DmwWrapperDMO;                  // Structural class
import org.dmd.dms.generated.enums.DataTypeEnum;                 // Required if we have any attributes
import org.dmd.dms.generated.enums.ValueTypeEnum;                // Required if we have any attributes
import org.dmd.dms.generated.types.DmcTypeIntegerNameSV;         // Required type
import org.dmd.dms.generated.types.DmcTypeModifierMV;            // Required for MODREC constructor
import org.dmd.dms.generated.types.DmcTypeStringSV;              // Required type

/**
 * The MailItem class represents a single piece of email.
 * <P>
 * Generated from the mail schema at version unknown
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dms.util.DmoFormatter.dumpDMO(DmoFormatter.java:128)
 */
@SuppressWarnings("serial")
public class MailItemDMO  extends DmwWrapperDMO  implements DmcNamedObjectIF, Serializable  {

    public final static String constructionClassName = "MailItem";

    static Map<Integer,DmcAttributeInfo> _ImAp;

    static Map<String ,DmcAttributeInfo> _SmAp;

    public final static DmcAttributeInfo __body = new DmcAttributeInfo("body",905,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __email = new DmcAttributeInfo("email",903,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __mailID = new DmcAttributeInfo("mailID",901,"IntegerName",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __sender = new DmcAttributeInfo("sender",902,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);
    public final static DmcAttributeInfo __subject = new DmcAttributeInfo("subject",904,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT,true);

    static {
        _ImAp = new HashMap<Integer,DmcAttributeInfo>();
        _ImAp.put(__body.id,__body);
        _ImAp.put(__email.id,__email);
        _ImAp.put(__mailID.id,__mailID);
        _ImAp.put(__sender.id,__sender);
        _ImAp.put(__subject.id,__subject);

        _SmAp = new HashMap<String ,DmcAttributeInfo>();
        _SmAp.put(__body.name,__body);
        _SmAp.put(__email.name,__email);
        _SmAp.put(__mailID.name,__mailID);
        _SmAp.put(__sender.name,__sender);
        _SmAp.put(__subject.name,__subject);
    }

    public MailItemDMO() {
        super("MailItem");
    }

    protected MailItemDMO(String oc) {
        super(oc);
    }

    public Map<Integer,DmcAttributeInfo> getIdToAttrInfo(){
        return(_ImAp);
    }

    public Map<String,DmcAttributeInfo> getStringToAttrInfo(){
        return(_SmAp);
    }

    @Override
    public MailItemDMO getNew(){
        MailItemDMO rc = new MailItemDMO();
        return(rc);
    }

    @Override
    public MailItemDMO getSlice(DmcSliceInfo info){
        MailItemDMO rc = new MailItemDMO();
        populateSlice(rc,info);
        return(rc);
    }

    public MailItemDMO(DmcTypeModifierMV mods) {
        super("MailItem");
        modrec(true);
        setModifier(mods);
    }

    public MailItemDMO getModificationRecorder(){
        MailItemDMO rc = new MailItemDMO(new DmcTypeModifierMV());
        rc.setMailID(getMailID());
        return(rc);
    }

    // org.dmd.dms.util.DmoFormatter.getAccessFunctions(DmoFormatter.java:679)
    public IntegerName getObjectName(){
        DmcAttribute<?> name = get(__mailID);
        if (name != null)
            return((IntegerName)name.getSV());
    
        return(null);
    }

    public DmcAttribute<?> getObjectNameAttribute(){
        DmcAttribute<?> name = get(__mailID);
        return(name);
    }

    public boolean equals(Object obj){
        if (obj instanceof MailItemDMO){
            return( getObjectName().equals( ((MailItemDMO) obj).getObjectName()) );
        }
        return(false);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public IntegerName getMailID(){
        DmcTypeIntegerNameSV attr = (DmcTypeIntegerNameSV) get(__mailID);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets mailID to the specified value.
     * @param value IntegerName
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setMailID(IntegerName value) {
        DmcAttribute<?> attr = get(__mailID);
        if (attr == null)
            attr = new DmcTypeIntegerNameSV(__mailID);
        
        try{
            attr.set(value);
            set(__mailID,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets mailID to the specified value.
     * @param value A value compatible with DmcTypeIntegerNameSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setMailID(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__mailID);
        if (attr == null)
            attr = new DmcTypeIntegerNameSV(__mailID);
        
        attr.set(value);
        set(__mailID,attr);
    }

    /**
     * Removes the mailID attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remMailID(){
         rem(__mailID);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public String getSender(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__sender);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets sender to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setSender(String value) {
        DmcAttribute<?> attr = get(__sender);
        if (attr == null)
            attr = new DmcTypeStringSV(__sender);
        
        try{
            attr.set(value);
            set(__sender,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets sender to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setSender(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__sender);
        if (attr == null)
            attr = new DmcTypeStringSV(__sender);
        
        attr.set(value);
        set(__sender,attr);
    }

    /**
     * Removes the sender attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remSender(){
         rem(__sender);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public String getEmail(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__email);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets email to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setEmail(String value) {
        DmcAttribute<?> attr = get(__email);
        if (attr == null)
            attr = new DmcTypeStringSV(__email);
        
        try{
            attr.set(value);
            set(__email,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets email to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setEmail(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__email);
        if (attr == null)
            attr = new DmcTypeStringSV(__email);
        
        attr.set(value);
        set(__email,attr);
    }

    /**
     * Removes the email attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remEmail(){
         rem(__email);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public String getSubject(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__subject);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets subject to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setSubject(String value) {
        DmcAttribute<?> attr = get(__subject);
        if (attr == null)
            attr = new DmcTypeStringSV(__subject);
        
        try{
            attr.set(value);
            set(__subject,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets subject to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setSubject(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__subject);
        if (attr == null)
            attr = new DmcTypeStringSV(__subject);
        
        attr.set(value);
        set(__subject,attr);
    }

    /**
     * Removes the subject attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remSubject(){
         rem(__subject);
    }

    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:583)
    public String getBody(){
        DmcTypeStringSV attr = (DmcTypeStringSV) get(__body);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets body to the specified value.
     * @param value String
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:620)
    public void setBody(String value) {
        DmcAttribute<?> attr = get(__body);
        if (attr == null)
            attr = new DmcTypeStringSV(__body);
        
        try{
            attr.set(value);
            set(__body,attr);
        }
        catch(DmcValueException ex){
            throw(new IllegalStateException("The type specific set() method shouldn't throw exceptions!",ex));
        }
    }

    /**
     * Sets body to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:668)
    public void setBody(Object value) throws DmcValueException {
        DmcAttribute<?> attr = get(__body);
        if (attr == null)
            attr = new DmcTypeStringSV(__body);
        
        attr.set(value);
        set(__body,attr);
    }

    /**
     * Removes the body attribute value.
     */
    // org.dmd.dms.util.GenUtility.formatSV(GenUtility.java:683)
    public void remBody(){
         rem(__body);
    }




}

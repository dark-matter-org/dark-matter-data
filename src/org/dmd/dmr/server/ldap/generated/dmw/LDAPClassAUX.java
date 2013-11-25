package org.dmd.dmr.server.ldap.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpAUX(BaseDMWGenerator.java:706)
import org.dmd.dmc.*;                                                       // If any attributes - (BaseDMWGenerator.java:1006)
import org.dmd.dms.AttributeDefinition;                                     // Is reference type - (BaseDMWGenerator.java:1026)
import org.dmd.dms.ClassDefinition;                                         // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:990)
import org.dmd.dms.generated.enums.DataTypeEnum;                            // For AUX base functionality - (BaseDMWGenerator.java:704)
import org.dmd.dms.generated.enums.ValueTypeEnum;                           // For AUX base functionality - (BaseDMWGenerator.java:703)
import org.dmd.dms.generated.types.AttributeDefinitionREF;                  // Is reference type REF - (BaseDMWGenerator.java:1034)
import org.dmd.dms.generated.types.DmcTypeAttributeDefinitionREFSV;         // Reference in an auxiliary class - (BaseDMWGenerator.java:1039)
import org.dmd.dms.generated.types.DmcTypeStringSV;                         // Type in an auxiliary class - (BaseDMWGenerator.java:1072)
import org.dmd.dmw.DmwWrapper;                                              // Unnamed object wrapper - (BaseDMWGenerator.java:1154)



/**
 * The LDAPSchemaExtension class is used to extend the basic
 * SchemaDefinition\n class with information required to map objects onto an
 * LDAP repository.
 * <P>
 * Generated from the dmrldap schema at version 0.1
 * <P>
 * This code was auto-generated by the dmogenerator utility and shouldn't be alterred manually!
 * Generated from: org.dmd.dmg.generators.BaseDMWGenerator.dumpAUX(BaseDMWGenerator.java:708)
 */
public class LDAPClassAUX {

    public final static ClassDefinition _auxClass = org.dmd.dmr.server.ldap.generated.DmrldapSchemaAG._LDAPClassAUX;
    public final static DmcAttributeInfo __namingAttribute = new DmcAttributeInfo("namingAttribute",64,"AttributeDefinition",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);
    public final static DmcAttributeInfo __reposName = new DmcAttributeInfo("reposName",451,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);

    /**
     * This method will check to see if the object has any of our attributes.
     * If not, our aux class is automatically removed from the object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.getCommonAUXFunctions(BaseDMWGenerator.java:2632)
    static private void removeAuxIfRequired(DmwWrapper corew){
        boolean anyLeft = false;

        if (corew.getDmcObject().get(__namingAttribute) != null)
            anyLeft = true;
        if (corew.getDmcObject().get(__reposName) != null)
            anyLeft = true;

        if (!anyLeft)
            corew.removeAux(_auxClass);
    }

    /**
     * This method will check to see if the object has our aux class.
     * If not, we add our aux class the object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.getCommonAUXFunctions(BaseDMWGenerator.java:2650)
    static private void addAuxIfRequired(DmwWrapper corew) throws DmcValueException {
        if (!corew.hasAux(_auxClass))
            corew.addAux(_auxClass);
    }

    /**
     * This method checks if the object has this auxiliary class.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.getCommonAUXFunctions(BaseDMWGenerator.java:2660)
    static public boolean hasAux(DmwWrapper corew){
        if (corew == null)
            return(false);
        return(corew.hasAux(_auxClass));
    }

    /**
     * Removes the namingAttribute attribute from the object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatAUXSV(BaseDMWGenerator.java:2755)
    static public DmcAttribute<?> remNamingAttribute(DmwWrapper corew){
        if (corew == null)
            return(null);
        DmcAttribute<?> rc = corew.getDmcObject().rem(__namingAttribute);
        removeAuxIfRequired(corew);
        return(rc);
    }

    /**
     * @return A AttributeDefinition object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatAUXSV(BaseDMWGenerator.java:2774)
    static public AttributeDefinition getNamingAttribute(DmwWrapper corew){
        DmcAttribute<?> attr = corew.getDmcObject().get(__namingAttribute);
        if (attr == null)
            return(null);
        
        AttributeDefinitionREF ref = (AttributeDefinitionREF) attr.getSV();
        
        return((AttributeDefinition)ref.getObject().getContainer());
    }

    /**
     * Sets the namingAttribute to the specified value.
     * @param value A value compatible with AttributeDefinitionREF
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatAUXSV(BaseDMWGenerator.java:2809)
    static public void setNamingAttribute(DmwWrapper corew, Object value) throws DmcValueException {
        DmcAttribute<?> attr = corew.getDmcObject().get(__namingAttribute);
        if (attr == null){
            attr = new DmcTypeAttributeDefinitionREFSV();
            addAuxIfRequired(corew);
        }

        attr.set(value);
        corew.getDmcObject().set(__namingAttribute, attr);
    }

    /**
     * Removes the reposName attribute from the object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatAUXSV(BaseDMWGenerator.java:2755)
    static public DmcAttribute<?> remReposName(DmwWrapper corew){
        if (corew == null)
            return(null);
        DmcAttribute<?> rc = corew.getDmcObject().rem(__reposName);
        removeAuxIfRequired(corew);
        return(rc);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatAUXSV(BaseDMWGenerator.java:2786)
    static public String getReposName(DmwWrapper corew){
        DmcTypeStringSV attr = (DmcTypeStringSV) corew.getDmcObject().get(__reposName);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets reposName to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatAUXSV(BaseDMWGenerator.java:2826)
    static public void setReposName(DmwWrapper corew, Object value) throws DmcValueException {
        DmcAttribute<?> attr = corew.getDmcObject().get(__reposName);
        if (attr == null){
            attr = new DmcTypeStringSV();
            addAuxIfRequired(corew);
        }
        
        attr.set(value);
        corew.getDmcObject().set(__reposName,attr);
    }




}

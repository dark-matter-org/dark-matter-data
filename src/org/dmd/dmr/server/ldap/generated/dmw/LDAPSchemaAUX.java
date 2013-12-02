package org.dmd.dmr.server.ldap.generated.dmw;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dmg.generators.BaseDMWGenerator.dumpAUX(BaseDMWGenerator.java:706)
import org.dmd.dmc.*;                                       // If any attributes - (BaseDMWGenerator.java:1011)
import org.dmd.dms.ClassDefinition;                         // Passing derived class def up the hierarchy - (BaseDMWGenerator.java:991)
import org.dmd.dms.generated.enums.DataTypeEnum;            // For AUX base functionality - (BaseDMWGenerator.java:704)
import org.dmd.dms.generated.enums.ValueTypeEnum;           // For AUX base functionality - (BaseDMWGenerator.java:703)
import org.dmd.dms.generated.types.DmcTypeStringSV;         // Type in an auxiliary class - (BaseDMWGenerator.java:1077)
import org.dmd.dmw.DmwWrapper;                              // Unnamed object wrapper - (BaseDMWGenerator.java:1159)



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
public class LDAPSchemaAUX {

    public final static ClassDefinition _auxClass = org.dmd.dmr.server.ldap.generated.DmrldapSchemaAG._LDAPSchemaAUX;
    public final static DmcAttributeInfo __ldapIdPrefix = new DmcAttributeInfo("ldapIdPrefix",450,"String",ValueTypeEnum.SINGLE,DataTypeEnum.PERSISTENT);

    /**
     * This method will check to see if the object has any of our attributes.
     * If not, our aux class is automatically removed from the object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.getCommonAUXFunctions(BaseDMWGenerator.java:2637)
    static private void removeAuxIfRequired(DmwWrapper corew){
        boolean anyLeft = false;

        if (corew.getDmcObject().get(__ldapIdPrefix) != null)
            anyLeft = true;

        if (!anyLeft)
            corew.removeAux(_auxClass);
    }

    /**
     * This method will check to see if the object has our aux class.
     * If not, we add our aux class the object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.getCommonAUXFunctions(BaseDMWGenerator.java:2655)
    static private void addAuxIfRequired(DmwWrapper corew) throws DmcValueException {
        if (!corew.hasAux(_auxClass))
            corew.addAux(_auxClass);
    }

    /**
     * This method checks if the object has this auxiliary class.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.getCommonAUXFunctions(BaseDMWGenerator.java:2665)
    static public boolean hasAux(DmwWrapper corew){
        if (corew == null)
            return(false);
        return(corew.hasAux(_auxClass));
    }

    /**
     * Removes the ldapIdPrefix attribute from the object.
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatAUXSV(BaseDMWGenerator.java:2760)
    static public DmcAttribute<?> remLdapIdPrefix(DmwWrapper corew){
        if (corew == null)
            return(null);
        DmcAttribute<?> rc = corew.getDmcObject().rem(__ldapIdPrefix);
        removeAuxIfRequired(corew);
        return(rc);
    }

    // org.dmd.dmg.generators.BaseDMWGenerator.formatAUXSV(BaseDMWGenerator.java:2791)
    static public String getLdapIdPrefix(DmwWrapper corew){
        DmcTypeStringSV attr = (DmcTypeStringSV) corew.getDmcObject().get(__ldapIdPrefix);
        if (attr == null)
            return(null);

        return(attr.getSV());
    }

    /**
     * Sets ldapIdPrefix to the specified value.
     * @param value A value compatible with DmcTypeStringSV
     */
    // org.dmd.dmg.generators.BaseDMWGenerator.formatAUXSV(BaseDMWGenerator.java:2831)
    static public void setLdapIdPrefix(DmwWrapper corew, Object value) throws DmcValueException {
        DmcAttribute<?> attr = corew.getDmcObject().get(__ldapIdPrefix);
        if (attr == null){
            attr = new DmcTypeStringSV();
            addAuxIfRequired(corew);
        }
        
        attr.set(value);
        corew.getDmcObject().set(__ldapIdPrefix,attr);
    }




}

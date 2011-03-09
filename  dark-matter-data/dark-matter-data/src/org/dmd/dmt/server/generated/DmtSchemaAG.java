package org.dmd.dmt.server.generated;

import org.dmd.dmc.DmcValueException;
import org.dmd.dms.*;
import org.dmd.dms.generated.dmo.*;


/**
 * The dmt schema defines a sets of definitions for Dark Matter Testing
 * purposes.
 * <P>
 * Generated from the dmt schema at version 0.1
 * <P>
 * This code was auto-generated by the dmggenerator utility and shouldn't be alterred manually!
 * Generated from:  org.dmd.dmg.util.SchemaFormatter.dumpSchema(SchemaFormatter.java:143)
 */
public class DmtSchemaAG extends SchemaDefinition {

    public static ClassDefinition _TestAbstractFixed;
    public static ClassDefinition _TestAbstractExtended;
    public static ClassDefinition _TestBasicObjectFixed;
    public static ClassDefinition _TestBasicNamedObjectFixed;
    public static ClassDefinition _TestBasicAuxiliary;

    public static AttributeDefinition _svBooleanValue;
    public static AttributeDefinition _mvBooleanValue;
    public static AttributeDefinition _svDateValue;
    public static AttributeDefinition _mvDateValue;
    public static AttributeDefinition _svDmcObjectValue;
    public static AttributeDefinition _mvDmcObjectValue;
    public static AttributeDefinition _svDoubleValue;
    public static AttributeDefinition _mvDoubleValue;
    public static AttributeDefinition _svFloatValue;
    public static AttributeDefinition _mvFloatValue;
    public static AttributeDefinition _svIntegerValue;
    public static AttributeDefinition _mvIntegerValue;
    public static AttributeDefinition _svLongValue;
    public static AttributeDefinition _mvLongValue;
    public static AttributeDefinition _svTestBasicNamedObjectFixed;
    public static AttributeDefinition _mvTestBasicNamedObjectFixed;
    public static AttributeDefinition _svStringValue;
    public static AttributeDefinition _mvStringValue;
    public static AttributeDefinition _svAuxString;
    public static AttributeDefinition _mvAuxString;
    public static AttributeDefinition _intToString;

    public static TypeDefinition _IntegerToString;

    static DmtSchemaAG instance;

    public DmtSchemaAG() throws DmcValueException {
        generatedSchema = true;
        staticRefName   = "org.dmd.dmt.server.generated.DmtSchemaAG";

    }

    private void initialize() throws DmcValueException {
        if (instance == null){
            instance        = this;
            SchemaDefinitionDMO me = (SchemaDefinitionDMO) this.getDmcObject();
            me.setName("dmt");
            me.setSchemaPackage("org.dmd.dmt.shared");
            me.setDmwPackage("org.dmd.dmt.server");
            me.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/dmt.dms");

            ClassDefinitionDMO _TestAbstractFixedOBJ = new ClassDefinitionDMO();
            _TestAbstractFixed = new ClassDefinition(_TestAbstractFixedOBJ);
            _TestAbstractFixedOBJ.setName("TestAbstractFixed");
            _TestAbstractFixedOBJ.setClassType("ABSTRACT");
            _TestAbstractFixedOBJ.setDescription("The TestAbstract class just defines an abstract base class from which other test classes can be derived to tes this type of derivation.");
            _TestAbstractFixedOBJ.addMust("svStringValue");
            _TestAbstractFixed.setDefinedIn(this);
            _TestAbstractFixedOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/classes.dmd");
            _TestAbstractFixedOBJ.setLineNumber("7");
            addClassDefList(_TestAbstractFixed);

            ClassDefinitionDMO _TestAbstractExtendedOBJ = new ClassDefinitionDMO();
            _TestAbstractExtended = new ClassDefinition(_TestAbstractExtendedOBJ);
            _TestAbstractExtendedOBJ.setName("TestAbstractExtended");
            _TestAbstractExtendedOBJ.setClassType("ABSTRACT");
            _TestAbstractExtendedOBJ.setDescription("The TestAbstract class just defines an abstract base class from which other test classes can be derived to tes this type of derivation.");
            _TestAbstractExtendedOBJ.addMust("svStringValue");
            _TestAbstractExtended.setDefinedIn(this);
            _TestAbstractExtendedOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/classes.dmd");
            _TestAbstractExtendedOBJ.setLineNumber("15");
            _TestAbstractExtendedOBJ.setUseWrapperType("EXTENDED");
            addClassDefList(_TestAbstractExtended);

            ClassDefinitionDMO _TestBasicObjectFixedOBJ = new ClassDefinitionDMO();
            _TestBasicObjectFixed = new ClassDefinition(_TestBasicObjectFixedOBJ);
            _TestBasicObjectFixedOBJ.setName("TestBasicObjectFixed");
            _TestBasicObjectFixedOBJ.setClassType("STRUCTURAL");
            _TestBasicObjectFixedOBJ.setDescription("The TestBasicObjectFixed class provides a test bed for all types of basic attribute values.");
            _TestBasicObjectFixedOBJ.addMust("svStringValue");
            _TestBasicObjectFixedOBJ.addMay("mvStringValue");
            _TestBasicObjectFixedOBJ.addMay("intToString");
            _TestBasicObjectFixedOBJ.addMay("mvLongValue");
            _TestBasicObjectFixed.setDefinedIn(this);
            _TestBasicObjectFixedOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/classes.dmd");
            _TestBasicObjectFixedOBJ.setLineNumber("25");
            addClassDefList(_TestBasicObjectFixed);

            ClassDefinitionDMO _TestBasicNamedObjectFixedOBJ = new ClassDefinitionDMO();
            _TestBasicNamedObjectFixed = new ClassDefinition(_TestBasicNamedObjectFixedOBJ);
            _TestBasicNamedObjectFixedOBJ.setName("TestBasicNamedObjectFixed");
            _TestBasicNamedObjectFixedOBJ.setClassType("STRUCTURAL");
            _TestBasicNamedObjectFixedOBJ.setDescription("The TestBasicNamedObjectFixed class provides a test bed a named object.");
            _TestBasicNamedObjectFixedOBJ.addMust("name");
            _TestBasicNamedObjectFixedOBJ.addMust("svStringValue");
            _TestBasicNamedObjectFixedOBJ.addMay("mvStringValue");
            _TestBasicNamedObjectFixed.setDefinedIn(this);
            _TestBasicNamedObjectFixedOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/classes.dmd");
            _TestBasicNamedObjectFixedOBJ.setLineNumber("34");
            _TestBasicNamedObjectFixedOBJ.setIsNamedBy("name");
            addClassDefList(_TestBasicNamedObjectFixed);

            ClassDefinitionDMO _TestBasicAuxiliaryOBJ = new ClassDefinitionDMO();
            _TestBasicAuxiliary = new ClassDefinition(_TestBasicAuxiliaryOBJ);
            _TestBasicAuxiliaryOBJ.setName("TestBasicAuxiliary");
            _TestBasicAuxiliaryOBJ.setClassType("AUXILIARY");
            _TestBasicAuxiliaryOBJ.setDescription("The TestBasicAuxiliary class allows us to test basic auxiliary class functionality.");
            _TestBasicAuxiliaryOBJ.addMay("svAuxString");
            _TestBasicAuxiliaryOBJ.setDmoAuxClass("TestBasicAuxiliaryDMO");
            _TestBasicAuxiliaryOBJ.setDmoAuxClassImport("org.dmd.dmt.shared.generated.auxw.TestBasicAuxiliaryDMO");
            _TestBasicAuxiliaryOBJ.setDmwAuxClass("TestBasicAuxiliary");
            _TestBasicAuxiliaryOBJ.setDmwAuxClassImport("org.dmd.dmt.server.generated.auxw.TestBasicAuxiliary");
            _TestBasicAuxiliary.setDefinedIn(this);
            _TestBasicAuxiliaryOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/classes.dmd");
            _TestBasicAuxiliaryOBJ.setLineNumber("39");
            addClassDefList(_TestBasicAuxiliary);


            AttributeDefinitionDMO _svBooleanValueOBJ = new AttributeDefinitionDMO();
            _svBooleanValue = new AttributeDefinition(_svBooleanValueOBJ);
            _svBooleanValueOBJ.setName("svBooleanValue");
            _svBooleanValueOBJ.setDmdID("800");
            _svBooleanValueOBJ.setDescription("A single valued Boolean.");
            _svBooleanValueOBJ.setType("Boolean");
            _svBooleanValue.setDefinedIn(this);
            _svBooleanValueOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/attributes.dmd");
            _svBooleanValueOBJ.setLineNumber("6");
            addAttributeDefList(_svBooleanValue);

            AttributeDefinitionDMO _mvBooleanValueOBJ = new AttributeDefinitionDMO();
            _mvBooleanValue = new AttributeDefinition(_mvBooleanValueOBJ);
            _mvBooleanValueOBJ.setName("mvBooleanValue");
            _mvBooleanValueOBJ.setDmdID("801");
            _mvBooleanValueOBJ.setValueType("MULTI");
            _mvBooleanValueOBJ.setDescription("A multi-valued Boolean.");
            _mvBooleanValueOBJ.setType("Boolean");
            _mvBooleanValue.setDefinedIn(this);
            _mvBooleanValueOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/attributes.dmd");
            _mvBooleanValueOBJ.setLineNumber("13");
            addAttributeDefList(_mvBooleanValue);

            AttributeDefinitionDMO _svDateValueOBJ = new AttributeDefinitionDMO();
            _svDateValue = new AttributeDefinition(_svDateValueOBJ);
            _svDateValueOBJ.setName("svDateValue");
            _svDateValueOBJ.setDmdID("802");
            _svDateValueOBJ.setDescription("A single valued Date.");
            _svDateValueOBJ.setType("Date");
            _svDateValue.setDefinedIn(this);
            _svDateValueOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/attributes.dmd");
            _svDateValueOBJ.setLineNumber("20");
            addAttributeDefList(_svDateValue);

            AttributeDefinitionDMO _mvDateValueOBJ = new AttributeDefinitionDMO();
            _mvDateValue = new AttributeDefinition(_mvDateValueOBJ);
            _mvDateValueOBJ.setName("mvDateValue");
            _mvDateValueOBJ.setDmdID("803");
            _mvDateValueOBJ.setValueType("MULTI");
            _mvDateValueOBJ.setDescription("A multi-valued Date.");
            _mvDateValueOBJ.setType("Date");
            _mvDateValue.setDefinedIn(this);
            _mvDateValueOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/attributes.dmd");
            _mvDateValueOBJ.setLineNumber("27");
            addAttributeDefList(_mvDateValue);

            AttributeDefinitionDMO _svDmcObjectValueOBJ = new AttributeDefinitionDMO();
            _svDmcObjectValue = new AttributeDefinition(_svDmcObjectValueOBJ);
            _svDmcObjectValueOBJ.setName("svDmcObjectValue");
            _svDmcObjectValueOBJ.setDmdID("804");
            _svDmcObjectValueOBJ.setDescription("A single valued DmcObject.");
            _svDmcObjectValueOBJ.setType("DmcObject");
            _svDmcObjectValue.setDefinedIn(this);
            _svDmcObjectValueOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/attributes.dmd");
            _svDmcObjectValueOBJ.setLineNumber("34");
            addAttributeDefList(_svDmcObjectValue);

            AttributeDefinitionDMO _mvDmcObjectValueOBJ = new AttributeDefinitionDMO();
            _mvDmcObjectValue = new AttributeDefinition(_mvDmcObjectValueOBJ);
            _mvDmcObjectValueOBJ.setName("mvDmcObjectValue");
            _mvDmcObjectValueOBJ.setDmdID("805");
            _mvDmcObjectValueOBJ.setValueType("MULTI");
            _mvDmcObjectValueOBJ.setDescription("A multi-valued DmcObject.");
            _mvDmcObjectValueOBJ.setType("DmcObject");
            _mvDmcObjectValue.setDefinedIn(this);
            _mvDmcObjectValueOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/attributes.dmd");
            _mvDmcObjectValueOBJ.setLineNumber("41");
            addAttributeDefList(_mvDmcObjectValue);

            AttributeDefinitionDMO _svDoubleValueOBJ = new AttributeDefinitionDMO();
            _svDoubleValue = new AttributeDefinition(_svDoubleValueOBJ);
            _svDoubleValueOBJ.setName("svDoubleValue");
            _svDoubleValueOBJ.setDmdID("806");
            _svDoubleValueOBJ.setDescription("A single valued Double.");
            _svDoubleValueOBJ.setType("Double");
            _svDoubleValue.setDefinedIn(this);
            _svDoubleValueOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/attributes.dmd");
            _svDoubleValueOBJ.setLineNumber("48");
            addAttributeDefList(_svDoubleValue);

            AttributeDefinitionDMO _mvDoubleValueOBJ = new AttributeDefinitionDMO();
            _mvDoubleValue = new AttributeDefinition(_mvDoubleValueOBJ);
            _mvDoubleValueOBJ.setName("mvDoubleValue");
            _mvDoubleValueOBJ.setDmdID("807");
            _mvDoubleValueOBJ.setValueType("MULTI");
            _mvDoubleValueOBJ.setDescription("A multi-valued Double.");
            _mvDoubleValueOBJ.setType("Double");
            _mvDoubleValue.setDefinedIn(this);
            _mvDoubleValueOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/attributes.dmd");
            _mvDoubleValueOBJ.setLineNumber("55");
            addAttributeDefList(_mvDoubleValue);

            AttributeDefinitionDMO _svFloatValueOBJ = new AttributeDefinitionDMO();
            _svFloatValue = new AttributeDefinition(_svFloatValueOBJ);
            _svFloatValueOBJ.setName("svFloatValue");
            _svFloatValueOBJ.setDmdID("808");
            _svFloatValueOBJ.setDescription("A single valued Float.");
            _svFloatValueOBJ.setType("Float");
            _svFloatValue.setDefinedIn(this);
            _svFloatValueOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/attributes.dmd");
            _svFloatValueOBJ.setLineNumber("62");
            addAttributeDefList(_svFloatValue);

            AttributeDefinitionDMO _mvFloatValueOBJ = new AttributeDefinitionDMO();
            _mvFloatValue = new AttributeDefinition(_mvFloatValueOBJ);
            _mvFloatValueOBJ.setName("mvFloatValue");
            _mvFloatValueOBJ.setDmdID("809");
            _mvFloatValueOBJ.setValueType("MULTI");
            _mvFloatValueOBJ.setDescription("A multi-valued Float.");
            _mvFloatValueOBJ.setType("Float");
            _mvFloatValue.setDefinedIn(this);
            _mvFloatValueOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/attributes.dmd");
            _mvFloatValueOBJ.setLineNumber("69");
            addAttributeDefList(_mvFloatValue);

            AttributeDefinitionDMO _svIntegerValueOBJ = new AttributeDefinitionDMO();
            _svIntegerValue = new AttributeDefinition(_svIntegerValueOBJ);
            _svIntegerValueOBJ.setName("svIntegerValue");
            _svIntegerValueOBJ.setDmdID("810");
            _svIntegerValueOBJ.setDescription("A single valued Integer.");
            _svIntegerValueOBJ.setType("Integer");
            _svIntegerValue.setDefinedIn(this);
            _svIntegerValueOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/attributes.dmd");
            _svIntegerValueOBJ.setLineNumber("76");
            addAttributeDefList(_svIntegerValue);

            AttributeDefinitionDMO _mvIntegerValueOBJ = new AttributeDefinitionDMO();
            _mvIntegerValue = new AttributeDefinition(_mvIntegerValueOBJ);
            _mvIntegerValueOBJ.setName("mvIntegerValue");
            _mvIntegerValueOBJ.setDmdID("811");
            _mvIntegerValueOBJ.setValueType("MULTI");
            _mvIntegerValueOBJ.setDescription("A multi-valued Integer.");
            _mvIntegerValueOBJ.setType("Integer");
            _mvIntegerValue.setDefinedIn(this);
            _mvIntegerValueOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/attributes.dmd");
            _mvIntegerValueOBJ.setLineNumber("83");
            addAttributeDefList(_mvIntegerValue);

            AttributeDefinitionDMO _svLongValueOBJ = new AttributeDefinitionDMO();
            _svLongValue = new AttributeDefinition(_svLongValueOBJ);
            _svLongValueOBJ.setName("svLongValue");
            _svLongValueOBJ.setDmdID("812");
            _svLongValueOBJ.setDescription("A single valued Long.");
            _svLongValueOBJ.setType("Long");
            _svLongValue.setDefinedIn(this);
            _svLongValueOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/attributes.dmd");
            _svLongValueOBJ.setLineNumber("89");
            addAttributeDefList(_svLongValue);

            AttributeDefinitionDMO _mvLongValueOBJ = new AttributeDefinitionDMO();
            _mvLongValue = new AttributeDefinition(_mvLongValueOBJ);
            _mvLongValueOBJ.setName("mvLongValue");
            _mvLongValueOBJ.setDmdID("813");
            _mvLongValueOBJ.setValueType("MULTI");
            _mvLongValueOBJ.setDescription("A multi-valued Long.");
            _mvLongValueOBJ.setType("Long");
            _mvLongValue.setDefinedIn(this);
            _mvLongValueOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/attributes.dmd");
            _mvLongValueOBJ.setLineNumber("96");
            addAttributeDefList(_mvLongValue);

            AttributeDefinitionDMO _svTestBasicNamedObjectFixedOBJ = new AttributeDefinitionDMO();
            _svTestBasicNamedObjectFixed = new AttributeDefinition(_svTestBasicNamedObjectFixedOBJ);
            _svTestBasicNamedObjectFixedOBJ.setName("svTestBasicNamedObjectFixed");
            _svTestBasicNamedObjectFixedOBJ.setDmdID("814");
            _svTestBasicNamedObjectFixedOBJ.setDescription("A single valued TestBasicNamedObjectFixed.");
            _svTestBasicNamedObjectFixedOBJ.setType("TestBasicNamedObjectFixed");
            _svTestBasicNamedObjectFixed.setDefinedIn(this);
            _svTestBasicNamedObjectFixedOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/attributes.dmd");
            _svTestBasicNamedObjectFixedOBJ.setLineNumber("102");
            addAttributeDefList(_svTestBasicNamedObjectFixed);

            AttributeDefinitionDMO _mvTestBasicNamedObjectFixedOBJ = new AttributeDefinitionDMO();
            _mvTestBasicNamedObjectFixed = new AttributeDefinition(_mvTestBasicNamedObjectFixedOBJ);
            _mvTestBasicNamedObjectFixedOBJ.setName("mvTestBasicNamedObjectFixed");
            _mvTestBasicNamedObjectFixedOBJ.setDmdID("815");
            _mvTestBasicNamedObjectFixedOBJ.setValueType("MULTI");
            _mvTestBasicNamedObjectFixedOBJ.setDescription("A multi-valued TestBasicNamedObjectFixed.");
            _mvTestBasicNamedObjectFixedOBJ.setType("TestBasicNamedObjectFixed");
            _mvTestBasicNamedObjectFixed.setDefinedIn(this);
            _mvTestBasicNamedObjectFixedOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/attributes.dmd");
            _mvTestBasicNamedObjectFixedOBJ.setLineNumber("109");
            addAttributeDefList(_mvTestBasicNamedObjectFixed);

            AttributeDefinitionDMO _svStringValueOBJ = new AttributeDefinitionDMO();
            _svStringValue = new AttributeDefinition(_svStringValueOBJ);
            _svStringValueOBJ.setName("svStringValue");
            _svStringValueOBJ.setDmdID("816");
            _svStringValueOBJ.setDescription("A single valued String.");
            _svStringValueOBJ.setType("String");
            _svStringValue.setDefinedIn(this);
            _svStringValueOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/attributes.dmd");
            _svStringValueOBJ.setLineNumber("115");
            addAttributeDefList(_svStringValue);

            AttributeDefinitionDMO _mvStringValueOBJ = new AttributeDefinitionDMO();
            _mvStringValue = new AttributeDefinition(_mvStringValueOBJ);
            _mvStringValueOBJ.setName("mvStringValue");
            _mvStringValueOBJ.setDmdID("817");
            _mvStringValueOBJ.setValueType("MULTI");
            _mvStringValueOBJ.setDescription("A multi-valued String.");
            _mvStringValueOBJ.setType("String");
            _mvStringValue.setDefinedIn(this);
            _mvStringValueOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/attributes.dmd");
            _mvStringValueOBJ.setLineNumber("122");
            addAttributeDefList(_mvStringValue);

            AttributeDefinitionDMO _svAuxStringOBJ = new AttributeDefinitionDMO();
            _svAuxString = new AttributeDefinition(_svAuxStringOBJ);
            _svAuxStringOBJ.setName("svAuxString");
            _svAuxStringOBJ.setDmdID("818");
            _svAuxStringOBJ.setDescription("A single-valued String.");
            _svAuxStringOBJ.setType("String");
            _svAuxString.setDefinedIn(this);
            _svAuxStringOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/attributes.dmd");
            _svAuxStringOBJ.setLineNumber("128");
            addAttributeDefList(_svAuxString);

            AttributeDefinitionDMO _mvAuxStringOBJ = new AttributeDefinitionDMO();
            _mvAuxString = new AttributeDefinition(_mvAuxStringOBJ);
            _mvAuxStringOBJ.setName("mvAuxString");
            _mvAuxStringOBJ.setDmdID("819");
            _mvAuxStringOBJ.setValueType("MULTI");
            _mvAuxStringOBJ.setDescription("A multi-valued String.");
            _mvAuxStringOBJ.setType("String");
            _mvAuxString.setDefinedIn(this);
            _mvAuxStringOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/attributes.dmd");
            _mvAuxStringOBJ.setLineNumber("135");
            addAttributeDefList(_mvAuxString);

            AttributeDefinitionDMO _intToStringOBJ = new AttributeDefinitionDMO();
            _intToString = new AttributeDefinition(_intToStringOBJ);
            _intToStringOBJ.setName("intToString");
            _intToStringOBJ.setDmdID("820");
            _intToStringOBJ.setValueType("HASHMAPPED");
            _intToStringOBJ.setDescription("A hash mapping of an integer to a string.");
            _intToStringOBJ.setType("IntegerToString");
            _intToString.setDefinedIn(this);
            _intToStringOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/attributes.dmd");
            _intToStringOBJ.setLineNumber("142");
            addAttributeDefList(_intToString);


            TypeDefinitionDMO _IntegerToStringOBJ = new TypeDefinitionDMO();
            _IntegerToString = new TypeDefinition(_IntegerToStringOBJ);
            _IntegerToStringOBJ.setName("IntegerToString");
            _IntegerToStringOBJ.setTypeClassName("org.dmd.dmt.shared.types.DmcTypeIntegerToString");
            _IntegerToStringOBJ.setPrimitiveType("org.dmd.dmt.shared.types.IntegerToString");
            _IntegerToStringOBJ.setDescription("Provides support for hashed integer to string values.");
            _IntegerToString.setDefinedIn(this);
            _IntegerToStringOBJ.setFile("C:/Dev/svn-web1/dark-matter-data/src/org/dmd/dmt/shared/dmdconfig/v0dot1/types.dmd");
            _IntegerToStringOBJ.setLineNumber("5");
            addTypeDefList(_IntegerToString);


        }
    }


    @Override
    public DmtSchemaAG getInstance() throws DmcValueException{
    	   if (instance == null)
    		   initialize();
    	   return(instance);
    }
}


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
package org.dmd.dms.server.generated.dsd;

// Generated from: org.dmd.util.artifact.java.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateGlobalInterface(MetaDSDHelper.java:138)
import java.util.Iterator;                                                  // To provide iterators over definitions - (MetaDSDHelper.java:117)
import org.dmd.dms.server.extended.ActionDefinition;                        // A definition from the DmsModule Module - (MetaDSDHelper.java:129)
import org.dmd.dms.server.extended.AttributeDefinition;                     // A definition from the DmsModule Module - (MetaDSDHelper.java:129)
import org.dmd.dms.server.extended.ClassDefinition;                         // A definition from the DmsModule Module - (MetaDSDHelper.java:129)
import org.dmd.dms.server.extended.ComplexTypeDefinition;                   // A definition from the DmsModule Module - (MetaDSDHelper.java:129)
import org.dmd.dms.server.extended.DSDefinitionModule;                      // A definition from the DmsModule Module - (MetaDSDHelper.java:129)
import org.dmd.dms.server.extended.Dependency;                              // A definition from the DmsModule Module - (MetaDSDHelper.java:129)
import org.dmd.dms.server.extended.DependencyImplementation;                // A definition from the DmsModule Module - (MetaDSDHelper.java:129)
import org.dmd.dms.server.extended.DmsDefinition;                           // A definition from the DmsModule Module - (MetaDSDHelper.java:120)
import org.dmd.dms.server.extended.DmsModule;                               // A definition from the DmsModule Module - (MetaDSDHelper.java:129)
import org.dmd.dms.server.extended.EnumDefinition;                          // A definition from the DmsModule Module - (MetaDSDHelper.java:129)
import org.dmd.dms.server.extended.ExtendedReferenceTypeDefinition;         // A definition from the DmsModule Module - (MetaDSDHelper.java:129)
import org.dmd.dms.server.extended.RuleCategory;                            // A definition from the DmsModule Module - (MetaDSDHelper.java:129)
import org.dmd.dms.server.extended.RuleDefinition;                          // A definition from the DmsModule Module - (MetaDSDHelper.java:129)
import org.dmd.dms.server.extended.RunContext;                              // A definition from the DmsModule Module - (MetaDSDHelper.java:129)
import org.dmd.dms.server.extended.SchemaDefinition;                        // A definition from the DmsModule Module - (MetaDSDHelper.java:129)
import org.dmd.dms.server.extended.SliceDefinition;                         // A definition from the DmsModule Module - (MetaDSDHelper.java:129)
import org.dmd.dms.server.extended.TypeDefinition;                          // A definition from the DmsModule Module - (MetaDSDHelper.java:129)
import org.dmd.dms.shared.types.DotName;                                    // To support the find method for definitions - (MetaDSDHelper.java:118)

// Generated from: org.dmd.dms.tools.generation.meta.MetaDSDHelper.generateGlobalInterface(MetaDSDHelper.java:140)
/**
 * This interface is implemented by definition managers that store definitions from the DmsModule module.
 */
public interface DmsModuleGlobalInterface {

    public int getDmsDefinitionCount();
    public DmsDefinition getDmsDefinition(DotName name);
    public Iterator<DmsDefinition> getAllDmsDefinition();

    public void addActionDefinition(ActionDefinition def);
    public int getActionDefinitionCount();
    public ActionDefinition getActionDefinition(DotName name);
    public Iterator<ActionDefinition> getAllActionDefinition();

    public void addAttributeDefinition(AttributeDefinition def);
    public int getAttributeDefinitionCount();
    public AttributeDefinition getAttributeDefinition(DotName name);
    public Iterator<AttributeDefinition> getAllAttributeDefinition();

    public void addClassDefinition(ClassDefinition def);
    public int getClassDefinitionCount();
    public ClassDefinition getClassDefinition(DotName name);
    public Iterator<ClassDefinition> getAllClassDefinition();

    public void addComplexTypeDefinition(ComplexTypeDefinition def);
    public int getComplexTypeDefinitionCount();
    public ComplexTypeDefinition getComplexTypeDefinition(DotName name);
    public Iterator<ComplexTypeDefinition> getAllComplexTypeDefinition();

    public void addExtendedReferenceTypeDefinition(ExtendedReferenceTypeDefinition def);
    public int getExtendedReferenceTypeDefinitionCount();
    public ExtendedReferenceTypeDefinition getExtendedReferenceTypeDefinition(DotName name);
    public Iterator<ExtendedReferenceTypeDefinition> getAllExtendedReferenceTypeDefinition();

    public void addDSDefinitionModule(DSDefinitionModule def);
    public int getDSDefinitionModuleCount();
    public DSDefinitionModule getDSDefinitionModule(DotName name);
    public Iterator<DSDefinitionModule> getAllDSDefinitionModule();

    public void addDependency(Dependency def);
    public int getDependencyCount();
    public Dependency getDependency(DotName name);
    public Iterator<Dependency> getAllDependency();

    public void addDependencyImplementation(DependencyImplementation def);
    public int getDependencyImplementationCount();
    public DependencyImplementation getDependencyImplementation(DotName name);
    public Iterator<DependencyImplementation> getAllDependencyImplementation();

    public void addDmsModule(DmsModule def);
    public int getDmsModuleCount();
    public DmsModule getDmsModule(DotName name);
    public Iterator<DmsModule> getAllDmsModule();

    public void addEnumDefinition(EnumDefinition def);
    public int getEnumDefinitionCount();
    public EnumDefinition getEnumDefinition(DotName name);
    public Iterator<EnumDefinition> getAllEnumDefinition();

    public void addRuleCategory(RuleCategory def);
    public int getRuleCategoryCount();
    public RuleCategory getRuleCategory(DotName name);
    public Iterator<RuleCategory> getAllRuleCategory();

    public void addRuleDefinition(RuleDefinition def);
    public int getRuleDefinitionCount();
    public RuleDefinition getRuleDefinition(DotName name);
    public Iterator<RuleDefinition> getAllRuleDefinition();

    public void addRunContext(RunContext def);
    public int getRunContextCount();
    public RunContext getRunContext(DotName name);
    public Iterator<RunContext> getAllRunContext();

    public void addSchemaDefinition(SchemaDefinition def);
    public int getSchemaDefinitionCount();
    public SchemaDefinition getSchemaDefinition(DotName name);
    public Iterator<SchemaDefinition> getAllSchemaDefinition();

    public void addSliceDefinition(SliceDefinition def);
    public int getSliceDefinitionCount();
    public SliceDefinition getSliceDefinition(DotName name);
    public Iterator<SliceDefinition> getAllSliceDefinition();

    public void addTypeDefinition(TypeDefinition def);
    public int getTypeDefinitionCount();
    public TypeDefinition getTypeDefinition(DotName name);
    public Iterator<TypeDefinition> getAllTypeDefinition();


}


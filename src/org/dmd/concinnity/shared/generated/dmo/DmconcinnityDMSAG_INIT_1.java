//	---------------------------------------------------------------------------
//	dark-matter-data
//	Copyright (c) 2014 dark-matter-data committers
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
package org.dmd.concinnity.shared.generated.dmo;

// Generated from: org.dmd.util.codegen.ImportManager.getFormattedImports(ImportManager.java:82)
// Called from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchemaObjectInitializers(DmoCompactSchemaFormatter.java:527)
import org.dmd.concinnity.shared.generated.dmo.DmconcinnityDMSAG;         // Required attribute from DmconcinnityDMSAG - (DmoCompactSchemaFormatter.java:562)
import org.dmd.dms.generated.dmo.MetaDMSAG;                               // For Meta references - (DmoCompactSchemaFormatter.java:552)



// Generated from: org.dmd.dms.util.DmoCompactSchemaFormatter.dumpSchemaObjectInitializers(DmoCompactSchemaFormatter.java:531)
public class DmconcinnityDMSAG_INIT_1 {

    static protected void initDefinitions(){
    // 1 -- ConcinnityDefinition
        DmconcinnityDMSAG.__ConcinnityDefinition.addMust(DmconcinnityDMSAG.__definedInConcinnityModule);
        DmconcinnityDMSAG.__ConcinnityDefinition.addMust(MetaDMSAG.__dotName);
        DmconcinnityDMSAG.__ConcinnityDefinition.addMust(MetaDMSAG.__name);
        DmconcinnityDMSAG.__ConcinnityDefinition.addMay(MetaDMSAG.__comment);
        DmconcinnityDMSAG.__ConcinnityDefinition.addMay(MetaDMSAG.__definedIn);
        DmconcinnityDMSAG.__ConcinnityDefinition.addMay(MetaDMSAG.__description);
        DmconcinnityDMSAG.__ConcinnityDefinition.addMay(MetaDMSAG.__dmoFromModule);
        DmconcinnityDMSAG.__ConcinnityDefinition.addMay(MetaDMSAG.__dotName);
        DmconcinnityDMSAG.__ConcinnityDefinition.addMay(MetaDMSAG.__example);
        DmconcinnityDMSAG.__ConcinnityDefinition.addMay(MetaDMSAG.__file);
        DmconcinnityDMSAG.__ConcinnityDefinition.addMay(MetaDMSAG.__hint);
        DmconcinnityDMSAG.__ConcinnityDefinition.addMay(MetaDMSAG.__lineNumber);
        DmconcinnityDMSAG.__ConcinnityDefinition.addMay(MetaDMSAG.__nvp);
        DmconcinnityDMSAG.__ConcinnityDefinition.addMay(MetaDMSAG.__obsolete);
        DmconcinnityDMSAG.__ConcinnityDefinition.addMay(MetaDMSAG.__optimize);
        DmconcinnityDMSAG.__ConcinnityDefinition.addMay(MetaDMSAG.__question);
        DmconcinnityDMSAG.__ConcinnityDefinition.addMay(MetaDMSAG.__relationship);
        DmconcinnityDMSAG.__ConcinnityDefinition.addMay(MetaDMSAG.__searchable);
        DmconcinnityDMSAG.__ConcinnityDefinition.addMay(MetaDMSAG.__skip);
        DmconcinnityDMSAG.__ConcinnityDefinition.addMay(MetaDMSAG.__sortName);
        DmconcinnityDMSAG.__ConcinnityDefinition.addMay(MetaDMSAG.__tags);
        DmconcinnityDMSAG.__ConcinnityDefinition.addMay(MetaDMSAG.__version);
        DmconcinnityDMSAG.__ConcinnityDefinition.addMay(MetaDMSAG.__why);

    // 2 -- Concept
        DmconcinnityDMSAG.__Concept.addMust(DmconcinnityDMSAG.__definedInConcinnityModule);
        DmconcinnityDMSAG.__Concept.addMust(MetaDMSAG.__dotName);
        DmconcinnityDMSAG.__Concept.addMust(MetaDMSAG.__name);
        DmconcinnityDMSAG.__Concept.addMay(MetaDMSAG.__comment);
        DmconcinnityDMSAG.__Concept.addMay(MetaDMSAG.__definedIn);
        DmconcinnityDMSAG.__Concept.addMay(MetaDMSAG.__description);
        DmconcinnityDMSAG.__Concept.addMay(MetaDMSAG.__dmoFromModule);
        DmconcinnityDMSAG.__Concept.addMay(MetaDMSAG.__dotName);
        DmconcinnityDMSAG.__Concept.addMay(MetaDMSAG.__example);
        DmconcinnityDMSAG.__Concept.addMay(MetaDMSAG.__file);
        DmconcinnityDMSAG.__Concept.addMay(MetaDMSAG.__hint);
        DmconcinnityDMSAG.__Concept.addMay(DmconcinnityDMSAG.__is);
        DmconcinnityDMSAG.__Concept.addMay(DmconcinnityDMSAG.__isLike);
        DmconcinnityDMSAG.__Concept.addMay(DmconcinnityDMSAG.__isRelatedTo);
        DmconcinnityDMSAG.__Concept.addMay(MetaDMSAG.__lineNumber);
        DmconcinnityDMSAG.__Concept.addMay(MetaDMSAG.__nvp);
        DmconcinnityDMSAG.__Concept.addMay(MetaDMSAG.__obsolete);
        DmconcinnityDMSAG.__Concept.addMay(MetaDMSAG.__optimize);
        DmconcinnityDMSAG.__Concept.addMay(MetaDMSAG.__question);
        DmconcinnityDMSAG.__Concept.addMay(MetaDMSAG.__relationship);
        DmconcinnityDMSAG.__Concept.addMay(DmconcinnityDMSAG.__represents);
        DmconcinnityDMSAG.__Concept.addMay(MetaDMSAG.__searchable);
        DmconcinnityDMSAG.__Concept.addMay(MetaDMSAG.__skip);
        DmconcinnityDMSAG.__Concept.addMay(MetaDMSAG.__sortName);
        DmconcinnityDMSAG.__Concept.addMay(MetaDMSAG.__tags);
        DmconcinnityDMSAG.__Concept.addMay(MetaDMSAG.__version);
        DmconcinnityDMSAG.__Concept.addMay(MetaDMSAG.__why);

    // 3 -- ConcinnityModule
        DmconcinnityDMSAG.__ConcinnityModule.addMust(DmconcinnityDMSAG.__definedInConcinnityModule);
        DmconcinnityDMSAG.__ConcinnityModule.addMust(MetaDMSAG.__dotName);
        DmconcinnityDMSAG.__ConcinnityModule.addMust(MetaDMSAG.__name);
        DmconcinnityDMSAG.__ConcinnityModule.addMay(MetaDMSAG.__comment);
        DmconcinnityDMSAG.__ConcinnityModule.addMay(MetaDMSAG.__defFiles);
        DmconcinnityDMSAG.__ConcinnityModule.addMay(MetaDMSAG.__definedIn);
        DmconcinnityDMSAG.__ConcinnityModule.addMay(DmconcinnityDMSAG.__dependsOnConcinnityModule);
        DmconcinnityDMSAG.__ConcinnityModule.addMay(MetaDMSAG.__description);
        DmconcinnityDMSAG.__ConcinnityModule.addMay(MetaDMSAG.__dmoFromModule);
        DmconcinnityDMSAG.__ConcinnityModule.addMay(MetaDMSAG.__dotName);
        DmconcinnityDMSAG.__ConcinnityModule.addMay(MetaDMSAG.__example);
        DmconcinnityDMSAG.__ConcinnityModule.addMay(MetaDMSAG.__file);
        DmconcinnityDMSAG.__ConcinnityModule.addMay(MetaDMSAG.__hint);
        DmconcinnityDMSAG.__ConcinnityModule.addMay(MetaDMSAG.__lineNumber);
        DmconcinnityDMSAG.__ConcinnityModule.addMay(MetaDMSAG.__loadSchemaClass);
        DmconcinnityDMSAG.__ConcinnityModule.addMay(MetaDMSAG.__nvp);
        DmconcinnityDMSAG.__ConcinnityModule.addMay(MetaDMSAG.__obsolete);
        DmconcinnityDMSAG.__ConcinnityModule.addMay(MetaDMSAG.__optimize);
        DmconcinnityDMSAG.__ConcinnityModule.addMay(MetaDMSAG.__question);
        DmconcinnityDMSAG.__ConcinnityModule.addMay(MetaDMSAG.__relationship);
        DmconcinnityDMSAG.__ConcinnityModule.addMay(MetaDMSAG.__searchable);
        DmconcinnityDMSAG.__ConcinnityModule.addMay(MetaDMSAG.__skip);
        DmconcinnityDMSAG.__ConcinnityModule.addMay(MetaDMSAG.__sortName);
        DmconcinnityDMSAG.__ConcinnityModule.addMay(MetaDMSAG.__tags);
        DmconcinnityDMSAG.__ConcinnityModule.addMay(MetaDMSAG.__version);
        DmconcinnityDMSAG.__ConcinnityModule.addMay(MetaDMSAG.__why);


    }

}


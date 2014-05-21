package org.dmd.dms.tools.generation.meta;

import java.io.IOException;
import java.util.TreeMap;

import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.util.DMUncheckedObject;
import org.dmd.dms.tools.generation.util.MAPTypeFormatter;
import org.dmd.dms.tools.generation.util.MVTypeFormatter;
import org.dmd.dms.tools.generation.util.SETTypeFormatter;
import org.dmd.dms.tools.generation.util.SVTypeFormatter;
import org.dmd.util.parsing.DMUncheckedObjectManager;


public class DerivedTypeFormatter {
	
	final static String BASEPKG = "org.dmd.dms.shared";

	static TreeMap<String,DMUncheckedObject> ucoAttributeDefs;
	static TreeMap<String,DMUncheckedObject> ucoTypeDefs;
	static TreeMap<String,DMUncheckedObject> ucoEnumDefs;

	static public void dumpDerivedTypes(DMUncheckedObjectManager ucoManager, String typedir, String LGPL) throws DMFeedbackSet, IOException {
		ucoTypeDefs = ucoManager.getObjects("TypeDefinition");
		ucoEnumDefs = ucoManager.getObjects("EnumDefinition");
		ucoAttributeDefs 	= ucoManager.getObjects("AttributeDefinition");

		for (DMUncheckedObject typedef : ucoTypeDefs.values()) {
			String genericArgs = typedef.getSV("genericArgs");
			String keyClass = typedef.getSV("keyClass");
			String keyImport = typedef.getSV("keyImport");

			if (genericArgs == null)
				genericArgs = "";

			String nt = typedef.getSV("isNameType");
			String ft = typedef.getSV("isFilterType");
			boolean nameType = false;
			boolean filterType = false;

			if (nt != null)
				nameType = true;

			if (ft != null)
				filterType = true;

			if (typedef.getSV("isEnumType") != null) {
				String tmp = typedef.getSV("name");
//				int refPos = tmp.indexOf("REF");
//				String tn = tmp.substring(0, refPos);
				String tn = tmp;
				// dmotypedir basePackage baseTypeImport typeName
				// primitiveImport nameAttrImport nameAttr nameAttrID generic
				// isRef isNameType, isFilterType fileHeader progress
				SVTypeFormatter.dumpSVType(typedir, BASEPKG, null, tn,
						"org.dmd.dms.shared.generated.enums." + tn, null, null, null,
						genericArgs, false, nameType, false, LGPL,
						System.out);
				MVTypeFormatter.dumpMVType(typedir, BASEPKG, null, tn,
						"org.dmd.dms.shared.generated.enums." + tn, null, null,
						genericArgs, false, LGPL, System.out);
				SETTypeFormatter.dumpSETType(typedir, BASEPKG, null, tn,
						"org.dmd.dms.shared.generated.enums." + tn, null, null,
						genericArgs, false, LGPL, System.out);

				if (keyClass != null)
					MAPTypeFormatter.dumpMAPType(typedir, BASEPKG, null, tn,
							"org.dmd.dms.shared.generated.enums." + tn, null, null,
							genericArgs, keyClass, keyImport, LGPL,
							System.out);
			} else if (typedef.getSV("isRefType") != null) {
				String tn = typedef.getSV("originalClass") + "REF";

				// dmotypedir basePackage baseTypeImport typeName
				// primitiveImport nameAttrImport nameAttr nameAttrID generic
				// isRef isNameType isFilterType fileHeader progress
				SVTypeFormatter.dumpSVType(typedir, BASEPKG, null, tn, null,
						"org.dmd.dms.shared.types.DefinitionName", "DefinitionName", null,
						genericArgs, true, nameType, false, LGPL,
						System.out);
				MVTypeFormatter.dumpMVType(typedir, BASEPKG, null, tn, null,
						"org.dmd.dms.shared.types.DefinitionName", "DefinitionName",
						genericArgs, true, LGPL, System.out);
				SETTypeFormatter.dumpSETType(typedir, BASEPKG, null, tn, null,
						"org.dmd.dms.shared.types.DefinitionName", "DefinitionName",
						genericArgs, true, LGPL, System.out);
				if (keyClass != null)
					MAPTypeFormatter.dumpMAPType(typedir, BASEPKG, null, tn,
							null, "org.dmd.dms.shared.types.DefinitionName", "DefinitionName",
							genericArgs, keyClass, keyImport, LGPL,
							System.out);
			} else {
				String nameAttrID = null;
				String isNameType = typedef.getSV("isNameType");
				String isFilterType = typedef.getSV("isFilterType");

				if (isNameType != null) {
					String nameAttributeDef = typedef.getSV("nameAttributeDef");
					DMUncheckedObject attrDef = ucoAttributeDefs.get(nameAttributeDef);
					nameAttrID = attrDef.getSV("dmdID");
				}

				if (isFilterType != null) {
					String filterAttributeDef = typedef.getSV("filterAttributeDef");
					DMUncheckedObject attrDef = ucoAttributeDefs.get(filterAttributeDef);
					nameAttrID = attrDef.getSV("dmdID");
				}
				
				// dmotypedir basePackage baseTypeImport typeName dmcTypeImport
				// nameAttrImport nameAttr nameAttrID generic isRef isNameType
				// isFilterType fileHeader progress
				SVTypeFormatter.dumpSVType(typedir, BASEPKG,
						typedef.getSV("primitiveType"), typedef.getSV("name"),
						typedef.getSV("typeClassName"), null, null, nameAttrID,
						genericArgs, false, nameType, filterType,
						LGPL, System.out);
				MVTypeFormatter.dumpMVType(typedir, BASEPKG,
						typedef.getSV("primitiveType"), typedef.getSV("name"),
						typedef.getSV("typeClassName"), null, null,
						genericArgs, false, LGPL, System.out);
				SETTypeFormatter.dumpSETType(typedir, BASEPKG,
						typedef.getSV("primitiveType"), typedef.getSV("name"),
						typedef.getSV("typeClassName"), null, null,
						genericArgs, false, LGPL, System.out);

				if (keyClass != null)
					MAPTypeFormatter.dumpMAPType(typedir, BASEPKG,
							typedef.getSV("typeClassName"),
							typedef.getSV("name"),
							typedef.getSV("primitiveType"), null, null,
							genericArgs, keyClass, keyImport, LGPL,
							System.out);
			}
		}
	}

}

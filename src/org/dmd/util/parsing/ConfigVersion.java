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
package org.dmd.util.parsing;

import java.util.TreeMap;
import java.util.Map.Entry;

import org.dmd.util.exceptions.DebugInfo;
import org.dmd.util.exceptions.ResultException;

/**
 * The ConfigVersions class allows use to maintain a grouping of configurations
 * of the same name, but different versions. You can request a config of a particular
 * version or ask for the latest version.
 */
public class ConfigVersion {

	public final static String UNKNOWN = "unknown";

	TreeMap<String,ConfigLocation>	versions;
	
	// The name of the config
	String	name;
	
	public ConfigVersion(){
		versions = new TreeMap<String, ConfigLocation>();
	}
	
	public void addVersion(ConfigLocation newVersion) throws ResultException {
		if (name == null)
			name = newVersion.getConfigName();
		else if (!name.equals(newVersion.getConfigName())){
			ResultException ex = new ResultException("Name mismatch for ConfigVersion.");
			ex.result.lastResult().moreMessages(DebugInfo.getCurrentStack());
			throw(ex);
		}
		
		ConfigLocation existing = versions.get(newVersion.getVersion());
			
		if (existing == null){
			versions.put(newVersion.getVersion(),newVersion);
		}
		else{
			// We have a clashing version
			ResultException ex = new ResultException("Clashing versions for the " + name + " configuration file.");
			ex.result.lastResult().moreMessages("Originally from: " + existing.getFileName());
			ex.result.lastResult().moreMessages("Clashing version from: " + newVersion.getFileName());
			ex.result.lastResult().moreMessages(DebugInfo.getCurrentStack());
			throw(ex);
		}
	}
	
	/**
	 * @return The latest version of the configuration.
	 */
	@SuppressWarnings("unchecked")
	public ConfigLocation getLatestVersion(){
		Entry entry = versions.lastEntry();
		return(versions.get(entry.getKey()));
	}
}

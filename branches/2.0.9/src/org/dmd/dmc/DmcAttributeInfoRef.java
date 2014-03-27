package org.dmd.dmc;

/**
 * The DmcAttributeInfoRef maintains information about whether an attribute is mandatory or
 * optional in the context of a particular class.
 */
public class DmcAttributeInfoRef {

	public final boolean 			mandatory;
	
	public final DmcAttributeInfo	info;
	
	public DmcAttributeInfoRef(DmcAttributeInfo i, boolean m){
		mandatory 	= m;
		info		= i;
	}
}

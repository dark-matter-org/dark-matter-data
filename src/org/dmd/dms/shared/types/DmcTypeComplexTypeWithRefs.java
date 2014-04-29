package org.dmd.dms.shared.types;

import java.util.Iterator;

import org.dmd.core.DmcAttribute;
import org.dmd.core.DmcObject;
import org.dmd.core.feedback.DMFeedbackSet;
import org.dmd.core.interfaces.DmcNameClashResolverIF;
import org.dmd.core.interfaces.DmcNameResolverIF;
import org.dmd.core.interfaces.DmcNameResolverWithClashSupportIF;
import org.dmd.core.schema.DmcAttributeInfo;

/**
 * The DmcTypeComplexTypeWithRefs type is a marker type that allows for resolution of references
 * that are part of a ComplexTypeDefinition. For instance, the meta schema defines the Field complex
 * type which contains a TypeDefinitionREF. Well, in order for that reference to get resolved
 * when it's part of Field attribute, we have to know that the complex type contains references
 * and we do that by deriving the generated DmcType for the complex type from this class.
 */
@SuppressWarnings("serial")
abstract public class DmcTypeComplexTypeWithRefs<VALUE> extends DmcAttribute<VALUE> {
	
	protected DmcTypeComplexTypeWithRefs(){
		super();
	}
	
	protected DmcTypeComplexTypeWithRefs(DmcAttributeInfo ai){
		super(ai);
	}
	
	abstract public void resolveValue(DmcNameResolverIF resolver, VALUE value, String attrName) throws DMFeedbackSet;
	
	abstract public void resolveValue(DmcNameResolverWithClashSupportIF resolver, VALUE value, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DMFeedbackSet;
	
	public void resolve(DmcNameResolverIF resolver, String attrName) throws DMFeedbackSet {
		if (getMVSize() == 0){
			resolveValue(resolver, getSV(), attrName);
		}
		else{
			Iterator<VALUE> it = getMV();
			while(it.hasNext()){
				resolveValue(resolver, it.next(), attrName);
			}
		}
	}
	
	public void resolve(DmcNameResolverWithClashSupportIF resolver, DmcObject object, DmcNameClashResolverIF ncr, DmcAttributeInfo ai) throws DMFeedbackSet {
		if (getMVSize() == 0){
			resolveValue(resolver, getSV(), object, ncr, ai);
		}
		else{
			Iterator<VALUE> it = getMV();
			while(it.hasNext()){
				resolveValue(resolver, it.next(), object, ncr, ai);
			}
		}
	}
}

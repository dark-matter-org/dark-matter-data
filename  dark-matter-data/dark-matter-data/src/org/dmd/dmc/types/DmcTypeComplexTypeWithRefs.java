package org.dmd.dmc.types;

import java.util.Iterator;

import org.dmd.dmc.DmcAttribute;
import org.dmd.dmc.DmcAttributeInfo;
import org.dmd.dmc.DmcNameResolverIF;
import org.dmd.dmc.DmcValueException;

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
	
	abstract public void resolveValue(DmcNameResolverIF resolver, VALUE value, String attrName) throws DmcValueException;
	
	public void resolve(DmcNameResolverIF resolver, String attrName) throws DmcValueException {
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
}

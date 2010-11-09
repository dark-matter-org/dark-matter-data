package org.dmd.features.extgwt.client;

import java.util.ArrayList;
import java.util.List;

import org.dmd.dmc.DmcObject;

import com.extjs.gxt.ui.client.data.ChangeEvent;
import com.extjs.gxt.ui.client.data.ModelData;
import com.extjs.gxt.ui.client.data.TreeModel;

public class DmoExtGWTTreeNode<DMO extends DmcObject> extends DmoExtGWTWrapperBase<DMO> implements TreeModel {

	// Our parent.
	protected TreeModel parent;

	// Our children.
	protected List<ModelData> children;
	
	protected DmoExtGWTTreeNode(DmcObject obj){
		super(obj);
		children = new ArrayList<ModelData>();
	}

	////////////////////////////////////////////////////////////////////////////////
	// TreeModel implementation
	
	@Override
	public void add(ModelData child) {
	    insert(child, getChildCount());
	}

	@Override
	public ModelData getChild(int index) {
	    if ((index < 0) || (index >= children.size()))
	    	return null;
	    return children.get(index);
	}

	@Override
	public int getChildCount() {
		return children.size();
	}

	@Override
	public List<ModelData> getChildren() {
		return children;
	}

	@Override
	public TreeModel getParent() {
		return parent;
	}

	@Override
	public int indexOf(ModelData child) {
		return children.indexOf(child);
	}

	@Override
	public void insert(ModelData child, int index) {
	    adopt(child);
	    children.add(index, child);
	    ChangeEvent evt = new ChangeEvent(Add, this);
	    evt.setParent(this);
	    evt.setItem(child);
	    evt.setIndex(index);
	    notify(evt);
	}

	@Override
	public boolean isLeaf() {
		return children.size() == 0;
	}

	@Override
	public void remove(ModelData child) {
	    orphan(child);
	    children.remove(child);
	    ChangeEvent evt = new ChangeEvent(Remove, this);
	    evt.setParent(this);
	    evt.setItem(child);
	    notify(evt);
	}

	@Override
	public void removeAll() {
	    for (int i = children.size() - 1; i >= 0; i--) {
	        remove(getChild(i));
	      }
	}

	@Override
	public void setParent(TreeModel parent) {
		this.parent = parent;
	}

	////////////////////////////////////////////////////////////////////////////////
	// Borrowed from BaseTreeModel
	
	private void setParentInternal(ModelData child) {
		if (child instanceof TreeModel) {
			TreeModel treeChild = (TreeModel) child;
			treeChild.setParent(this);
		}
		else {
			child.set("gxt-parent", child);
		}
	}

	private TreeModel getParentInternal(ModelData child) {
		if (child instanceof TreeModel) {
			TreeModel treeChild = (TreeModel) child;
			return treeChild.getParent();
		}
		else {
			return (TreeModel) child.get("gxt-parent");
		}
	}

	private void adopt(ModelData child) {
		TreeModel p = getParentInternal(child);
		if (p != null && p != this) {
			p.remove(child);
		}
		setParentInternal(child);
	}

	private void orphan(ModelData child) {
		if (child instanceof TreeModel) {
			TreeModel treeChild = (TreeModel) child;
			treeChild.setParent(null);
		}
		else {
			child.remove("gxt-parent");
		}
	}

}

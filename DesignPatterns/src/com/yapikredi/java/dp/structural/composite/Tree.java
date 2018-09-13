package com.yapikredi.java.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Tree {
	private String name;

	private List<Tree> childs = new ArrayList<>();
	private Tree parent;

	public Tree(final String name) {
		super();
		this.setName(name);
	}

	public void addChild(final Tree tree) {
		this.childs.add(tree);
		tree.parent = this;
	}

	public Tree getParent() {
		return this.parent;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		String string = this.name + "\n\t";
		for (Tree tree : this.childs) {
			string += tree;
		}
		return string;
	}
}

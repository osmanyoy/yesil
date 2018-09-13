package com.yapikredi.java.dp.structural.composite;

public class CompositeMain {
	public static void main(final String[] args) {
		Tree tree = new Tree("First");
		Tree subtree = new Tree("sub10");
		tree.addChild(subtree);
		Tree subtree2 = new Tree("sub11");
		tree.addChild(subtree2);
		Tree subtree3 = new Tree("sub20");
		subtree2.addChild(subtree3);
		Tree subtree4 = new Tree("sub30");
		subtree3.addChild(subtree4);
		System.out.println(tree);
	}
}

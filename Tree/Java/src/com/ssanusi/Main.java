package com.ssanusi;

public class Main {

    public static void main(String[] args) {
	  Tree tree = new Tree();
	  tree.insert(7);
	  tree.insert(4);
	  tree.insert(9);
	  tree.insert(6);
	  tree.insert(8);
	  tree.insert(10);
	  tree.insert(1);

	  Tree tree2;
	  tree2 = new Tree();
	  tree2.insert(7);
	  tree2.insert(4);
	  tree2.insert(9);
	  tree2.insert(6);
	  tree2.insert(8);
	  tree2.insert(10);
	  tree2.insert(1);
	  System.out.println(tree);
	  System.out.println("**********traverse Level order *******");
	  tree.traverseLevelOrder();
	  System.out.println("**********validator*******");
	  System.out.println(tree.isBinarySearchTree());
	  System.out.println(tree.find(10));
	  System.out.println(tree.find(11));
	  System.out.println("************Equals***********");
	  System.out.println(tree.equals(tree2));
	  System.out.println("*******Pre order*******");
	  tree.traversePreOrder();
	  System.out.println("*******In order*******");
	  tree.transverseInOrder();
	  System.out.println("*******post order*******");
	  tree.traversePostOrder();
	  System.out.println("**********Height*********");
	  System.out.println(tree.height());
	  System.out.println("**********Min*********");
	  System.out.println(tree.min());
	  System.out.println("********Print K distance from Node********");
	  var nodes = tree.getNodesAtDistance(2);
	  for(var node: nodes)
		  System.out.println(node);
	  System.out.println("**********validator after swap*******");
	  tree.swap();
	  System.out.println(tree.isBinarySearchTree());
	  System.out.println("Done");


    }
}

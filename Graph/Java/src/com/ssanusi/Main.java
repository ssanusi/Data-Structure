package com.ssanusi;

public class Main {

    public static void main(String[] args) {
	var graph = new Graph();
	graph.addNode("A");
	graph.addNode("B");
	graph.addNode("C");
	graph.addNode("P");
	graph.addEdge("A", "B");
	graph.addEdge("B", "C");
	graph.addEdge("C", "A");
		System.out.println(graph.hasCycle());

    }
}

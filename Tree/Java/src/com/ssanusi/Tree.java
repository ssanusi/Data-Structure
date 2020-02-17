package com.ssanusi;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void insert(int value) {
        var newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }
        var current = root;
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = newNode;
                    break;
                }
                current = current.rightChild;

            }
        }

    }

    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if (value < current.value) {
                current = current.leftChild;
            } else if (value > current.value) {
                current = current.rightChild;
            } else {
                return true;
            }
        }
        return false;
    }

    public void traversePostOrder(){
        traversePostOrder(root);
    }


    private void traversePostOrder(Node root){
        if (root == null)
            return;

        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.println(root.value);
    }
    public void transverseInOrder(){
        traverseInOrder(root);
    }


    private void traverseInOrder(Node root) {
        if (root == null)
            return;

        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root) {
        if (root == null)
            return;

        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    public int height(){
        return height(root);
    }

    private int height(Node node){
        if(root == null)
            return -1;
        if(isLeaf(node))
            return 0;

        return 1 + Math.max(height(node.leftChild) , height(node.rightChild));
    }

    public int min(){
        return min(root);
    }

    private Boolean isLeaf(Node  node){
        return node.rightChild == null && node.leftChild == null;
    }

    private int min(Node node){
        if (isLeaf(node))
            return node.value;
        var left = min(node.leftChild);
        var right = min(node.rightChild);
        return Math.min(Math.min(right, left), node.value);
    }

    public int minBst(){
        if(root == null)
            throw new IllegalStateException();
        var current = root;
        var last = current;
        while(current != null){
            last = current;
            current = current.leftChild;
        }
        return last.value;
    }

    public boolean equals(Tree other){
        if(other == null)
            return false;
        return equals(root, other.root);
    }

    private boolean equals(Node first, Node second) {
        if (first == null && second == null)
            return true;

        if (first != null && second != null)
            return first.value == second.value
                    && equals(first.leftChild, second.leftChild)
                    && equals(first.rightChild, second.rightChild);

        return false;
    }

    public boolean isBinarySearchTree(){
      return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public ArrayList<Integer> getNodesAtDistance(int distance){

        var list = new ArrayList<Integer>();
        getNodesAtDistance(root, distance, list);
       return list;
    }

    public void traverseLevelOrder(){
        for (int i = 0; i <= height(); i++) {
            for (var value : getNodesAtDistance(i))
                System.out.println(value);

        }
    }

    private void getNodesAtDistance(Node node, int distance, ArrayList<Integer> list){
        if(node == null)
            return;

        if(distance == 0){
            list.add(node.value);
        }

        getNodesAtDistance(node.leftChild, distance - 1, list);
        getNodesAtDistance(node.rightChild, distance - 1, list);
    }

    private boolean isBinarySearchTree(Node node, int min, int max){
        if(node == null)
            return true;

        if(node.value < min || node.value > max)
            return false;

        return isBinarySearchTree(root.leftChild,min, node.value - 1)
                && isBinarySearchTree(root.rightChild, root.value + 1, max );
    }

    public void swap(){
        var temp =  root.rightChild;
        root.rightChild = root.leftChild;
        temp = root.leftChild;
    }



    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}

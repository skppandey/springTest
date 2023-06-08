package com.example.springTest.BST;

import java.util.SortedSet;
import java.util.TreeSet;

public class BinaryTree {
  Node root;
  public BinaryTree(){
    root = null;
  }

  void inOrder(Node node){
    if(node == null)
      return;
    inOrder(node.left);
    System.out.print(node.key);
    inOrder(node.right);
  }

  void preOrder(Node node){
    if(node == null)
      return;
    System.out.print(node.key);
    preOrder(node.left);
    preOrder(node.right);
  }
  void postOrder(Node node){
    if(node == null)
      return;
    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.key);
  }

  int countNodes(Node node){
    if(node == null)
      return 0;
    return 1 + countNodes(node.left) + countNodes(node.right);
  }


  public static void main(String args[]){
    BinaryTree tree = new BinaryTree();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    new BinaryTree().inOrder(tree.root);
    System.out.println();
    new BinaryTree().preOrder(tree.root);
    System.out.println();
    new BinaryTree().postOrder(tree.root);
    int count = new BinaryTree().countNodes(tree.root);
    System.out.println(count);

    SortedSet<Integer> set= new TreeSet<>();

  }
}

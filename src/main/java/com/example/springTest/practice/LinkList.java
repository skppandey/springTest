package com.example.springTest.practice;

public class LinkList {

  private static Node reverseLL(Node node){
    Node current  = node;
    Node next = null;
    Node prev = null;
    while(current != null){    //1 2 3 4
      next = current.next;   //2 3 4
      current.next =prev;  //1
      prev = current;    //1
      current = next;
    }
    node = prev;
    return node;
  }

  public static void main(String[] args) {
    Node node = new Node(5);
    node.next = new Node(3);
    node.next.next = new Node(8);
    node.next.next.next = new Node(1);
//    while(node != null){
//      System.out.println(node.val);
//      node = node.next;
//    }

    Node out = LinkList.reverseLL(node);
    while(out != null){
      System.out.println(out.val);
      out = out.next;
    }
  }

}
class Node{
  int val;
  Node next;

  public Node(int val) {
    this.val = val;
    this.next = null;
  }
}

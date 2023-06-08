package com.example.springTest.DSA;

public class LinkedList {
  static Node head;
  static class Node {
    int data;
    Node next;
    public Node(int val){
      data = val;
      next = null;
    }
  }

  private void reverse(Node node){  //8 6 7 4
    Node next = null;
    Node prev = null;
    Node current = node;
    while(current != null){
      next = current.next; // 6 7 4
      current.next = prev; // 8 null
      prev = current;
      current = next;
    }

  }

  public static void main(String args[]){
    LinkedList ll = new LinkedList();
    ll.head = new Node(8);
    ll.head.next = new Node(6);
    ll.head.next.next = new Node(7);
    ll.head.next.next.next = new Node(4);

    ll.reverse(head);

  }
}

package com.example.springTest.ThreadLearn;

import com.example.springTest.LinkedList;

public class SwapLinkedList {

  static Node swap(Node node){
    Node temp = node;
    while(temp !=null && temp.next !=null){  //1234
      int m = temp.data;
      temp.data = temp.next.data;
      temp.next.data = m;
      temp = temp.next.next;
    }
    while(node != null){
      System.out.println(node.data);
      node = node.next;
    }
    return node;
  }
  public static void main(String args[]){
    Node list = new Node(1);
    list.next = new Node(2);
    list.next.next = new Node(3);
    list.next.next.next = new Node(4);
    swap(list);
  }

}

class Node{
  int data;
  Node next;
  public Node(int v){
    data = v;
    next = null;
  }
}

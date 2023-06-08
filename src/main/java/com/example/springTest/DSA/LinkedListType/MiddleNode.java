package com.example.springTest.DSA.LinkedListType;

public class MiddleNode {

  static int middleNode(ListNode head){
    ListNode slow = head;
    ListNode fast = head;
    while(fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow.val;
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(6);

    System.out.println(middleNode(head));
  }
}

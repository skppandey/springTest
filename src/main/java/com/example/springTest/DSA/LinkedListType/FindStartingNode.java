package com.example.springTest.DSA.LinkedListType;

public class FindStartingNode {

  static ListNode findNodeOfCircular(ListNode node){
    ListNode pointer1 = node;
    ListNode pointer2 = node;
    int len = getLength(node);
      while (len > 0) {
        pointer1 = pointer1.next;
        len--;
      }
     while(pointer2 != pointer1){
       pointer2 = pointer2.next;
       pointer1 = pointer1.next;
     }
    return pointer2;
  }
  static int getLength(ListNode node){
    ListNode slow = node;
    ListNode fast = node;
    int length = 0;
    while(fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
      if (slow==fast){
        length = findLen(slow);
        break;
      }
    }
    return  length;
  }
  static int findLen(ListNode slow){
    int len = 0;
    ListNode current = slow;
    while(current.next!=null){
      len++;
      current=current.next;
      if(current == slow){
        return len;
      }
    }
    return len;
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(6);
    head.next.next.next.next.next.next = head.next.next;
    System.out.println(findNodeOfCircular(head).val);
  }
}

package com.example.springTest.DSA.LinkedListType;

public class LinkedListCycle {

static boolean hasCycle(ListNode head){
  ListNode slow = head;
  ListNode fast = head;
  while(fast != null && fast.next != null){
    fast = fast.next.next;
    slow = slow.next;
    if(slow == fast){
      return true;
    }
  }
  return false;
}

  static int getCycleLength(ListNode slow){
    ListNode current = slow;
    int length = 0;
    while(current.next != null){
      length++;
      current = current.next;
      if(current == slow){
        return length;
      }
    }
    return length;
  }

  static ListNode startNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    int len = 0;
    while (fast != null && fast.next != null) {
      fast = fast.next.next;
      slow = slow.next;
      if (slow == fast) {
        len = getCycleLength(slow);
      }
    }
    return getStartNode(head, len);

  }
  static ListNode getStartNode(ListNode head, int len){
  ListNode pointer1 = head;
  ListNode pointer2 = head;
  while(len > 0){
    pointer2 = pointer2.next;
    len--;
  }
  while(pointer1 != pointer2){
    pointer1 = pointer1.next;
    pointer2 = pointer2.next;
  }
  return pointer1;
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);
    head.next.next.next.next.next = new ListNode(6);
    System.out.println(hasCycle(head));

    head.next.next.next.next.next.next = head.next.next;
    System.out.println(hasCycle(head));

    head.next.next.next.next.next.next = head.next.next.next;
    System.out.println(hasCycle(head));
  }
}

package com.example.springTest.DSA.LinkedListType;

public class PallindromeLinkedList {

  static boolean isPalindrome(ListNode head){
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null){
      slow = slow.next;
      fast = fast.next.next;
    }
    ListNode secondHalf = reverse(slow.next);
    while (secondHalf !=null && secondHalf.next != null){
      if(head.val != secondHalf.val){
        return false;
      }
      secondHalf = secondHalf.next;
    }
    return true;
  }

  static ListNode reverse(ListNode head){
    ListNode current = head;
    ListNode next = null;
    ListNode prev = null;
    while(current != null){
      next = current.next;
      current.next = prev;
      prev = current;
      current = next;
    }
    return prev;
  }

  public static void main(String[] args) {
    ListNode head = new ListNode(2);
    head.next = new ListNode(4);
    head.next.next = new ListNode(6);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(2);
    System.out.println(isPalindrome(head));
  }
}

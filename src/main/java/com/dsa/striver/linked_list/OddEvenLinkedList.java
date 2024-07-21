package com.dsa.striver.linked_list;

import java.util.ArrayList;
import java.util.List;

public class OddEvenLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);
        /*
        head.next = node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;

         */
        /*ListNode head = new ListNode(2);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(4);
        ListNode node7 = new ListNode(7);
        */
        head.next = node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node6;
        node6.next=node7;
        node7.next=node8;
        ListNode resultLL = oddEvenListChatGPT(head);

        PrintLL ll = new PrintLL();
        ll.printLL(resultLL);
    }
    public static ListNode oddEvenListChatGPT(ListNode head) {
        if(head == null || head.next ==null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;

        while(even!=null && even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;
    }

    private static ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev = head;
        ListNode curr = head.next;

        ListNode headEven = null;
        ListNode headItr = null;
        ListNode temp = null;

        while (curr!=null){
            temp = curr;
            if(curr.next==null){
                if(headEven== null){
                    headEven = temp;
                    headItr = headEven;
                }
                else {
                    headItr.next = temp;
                    headItr=headItr.next;
                }
                prev.next=headEven;
                return head;
            }
            else{
                prev.next = curr.next;
                prev = prev.next;
                curr = prev.next;
                temp.next=null;
                if(headEven== null){
                    headEven = temp;
                    headItr = headEven;
                }
                else {
                    headItr.next = temp;
                    headItr=headItr.next;
                }
            }

        }
        prev.next=headEven;
        return head;
    }
}

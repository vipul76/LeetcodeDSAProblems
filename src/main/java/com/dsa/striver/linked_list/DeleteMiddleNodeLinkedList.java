package com.dsa.striver.linked_list;

public class DeleteMiddleNodeLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        head.next=node2;
        /*node2.next=node3;
        node3.next=node4;
        node4.next=node5;*/
        PrintLL ll = new PrintLL();
        ll.printLL(head);
        System.out.println();
        ListNode resultLL = deleteMiddle(head);
        ll.printLL(resultLL);
    }

    private static ListNode deleteMiddle(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = dummy;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            prev=prev.next;
        }
        prev.next=slow.next;
        return head;
    }

}

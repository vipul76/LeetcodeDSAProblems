package com.dsa.striver.linked_list;

public class PrintLL {
    public void printLinkedList(ListNode head){
        if(head==null) System.out.println("No Nodes present in the linked list");
        ListNode temp = head;
        while (temp.next!=null){
            if(temp.next.next!=null) System.out.print(temp.val+"->");
            else System.out.print(temp.val);
            temp=temp.next;
        }
    }
    public void printLL(ListNode head){
        while (head!=null){
            System.out.print(head.val+"->");
            head=head.next;
        }
    }
}

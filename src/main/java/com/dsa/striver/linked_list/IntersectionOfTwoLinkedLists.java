package com.dsa.striver.linked_list;

import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoLinkedLists {
    public static void main(String[] args) {
        ListNode head1 = new ListNode(4);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(8);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode head2 = new ListNode(5);
        ListNode node2_2 = new ListNode(6);
        ListNode node2_3 = new ListNode(1);
        head1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;

        head2.next=node2_2;
        node2_2.next=node2_3;
        node2_3.next=node3;

        PrintLL ll = new PrintLL();
        ll.printLL(head1);
        System.out.println();
        ll.printLL(head2);
        System.out.println();
        ListNode intersectionNode = getIntersectionNode(head1,head2);
        if (intersectionNode == null) {
            System.out.println("No intersection");
        } else {
            System.out.println(intersectionNode.val);
        }
    }

    private static ListNode getIntersectionNode(ListNode head1, ListNode head2) {
        Map<ListNode,Integer> map = new HashMap<>();
        ListNode temp = head1;
        while (temp!=null){
            map.put(temp,-1);
            temp=temp.next;
        }
        temp=head2;
        while (temp!=null){
            if(map.containsKey(temp)) return temp;
            temp=temp.next;
        }
        return null;
    }
}

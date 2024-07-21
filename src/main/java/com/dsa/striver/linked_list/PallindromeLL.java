package com.dsa.striver.linked_list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PallindromeLL {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(2);
        ListNode node5 = new ListNode(1);

        head.next = node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        boolean isPalindrome = isPalindrome(head);
        System.out.println(isPalindrome);
    }

    private static boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
        ListNode slow = head, fast = head;
        int count =1;
        Stack<ListNode> st = new Stack<>();
        while (fast!=null && fast.next!=null){
            st.add(slow);
            assert slow != null;
            slow=slow.next;
            fast = fast.next.next;
            if(fast==null) count++;
            else count=count+2;
        }
        if(count%2!=0){
            slow=slow.next;
        }
        while (slow!=null){
            ListNode node = st.pop();
            assert node != null;
            if(node.val!=slow.val){
                return false;
            }
            slow=slow.next;
        }
        return true;
    }
}

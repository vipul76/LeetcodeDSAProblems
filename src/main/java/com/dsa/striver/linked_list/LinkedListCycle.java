package com.dsa.striver.linked_list;

import java.util.HashMap;
import java.util.Map;

public class LinkedListCycle {
    //TC : O(N+2 map time complexity according to which map we used)
    //~ TC : O(N)+O(1)+O(1) ~ O(N)  SC : O(N)
    //Map insertion and searching tc: O(1) for hashmap
    public boolean hasCycle(ListNode head){
        if(head==null || head.next==null) return false;
        Map<ListNode,Integer> hasCyclicCheck = new HashMap<>();

        ListNode temp = head;
        while (temp.next!=null){
            if(hasCyclicCheck.containsKey(temp))
            {
                return true;
            }
            hasCyclicCheck.put(temp,-1);
            temp=temp.next;
        }
        return false;
    }

    public boolean hasCyclicFastSlowPointer(ListNode head){
        if(head==null || head.next==null) return false;
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}

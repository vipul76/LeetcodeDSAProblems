package com.dsa.striver.linked_list;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    //Using hashmap method
    public ListNode detectCycle(ListNode head){
        ListNode temp = head;
        if(temp==null && temp.next==null) return null;

        Map<ListNode,Integer> map = new HashMap<>();


        while (temp.next!=null){
            if(map.containsKey(temp)){
                return temp;
            }
            map.put(temp,-1);
            temp=temp.next;
        }
        return null;
    }

    public ListNode detectCycleFastSlowPointer(ListNode head) {
        ListNode slow=head, fast=head;

        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow.equals(fast)){
                slow=head;
                while (!slow.equals(fast)){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}

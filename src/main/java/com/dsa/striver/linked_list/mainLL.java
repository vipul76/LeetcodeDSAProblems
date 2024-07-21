package com.dsa.striver.linked_list;

public class mainLL {
    public static void main(String[] args) {
        PrintLL pl = new PrintLL();

        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        LinkedListCycle ll = new LinkedListCycle();

       // pl.printLinkedList(head);
        System.out.println();
        boolean isCyclic = ll.hasCycle(head);
        boolean isCyclicFastSLow = ll.hasCyclicFastSlowPointer(head);
        System.out.println("isCyclic : "+isCyclic);
        System.out.println("isCyclicFastSLow : "+isCyclicFastSLow);

        // Detect cycle and return node where cycle begins
        Solution solution = new Solution();

        ListNode cycleBegins = solution.detectCycle(head);
        System.out.println("cycleBegins : val ->"+cycleBegins.val);

        ListNode cycleBeginsFSP = solution.detectCycleFastSlowPointer(head);
        System.out.println("cycleBegins : val ->"+cycleBeginsFSP.val);
    }
}

package com.dsa.striver.linked_list;

public class RemoveNthNodeFromEnd {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        /*ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);*/
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
        /*node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;*/

        PrintLL ll = new PrintLL();
        ll.printLL(head);
        System.out.println();
        ListNode resultLL = removeNthFromEndIn1PASS(head, 2);
        ll.printLL(resultLL);
    }

    // ChatGpt with Optimize code
    private static ListNode removeNthFromEndIn1PASS(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode first = dummy;
        ListNode second = dummy;

        for(int i=0;i<=n;i++){
            first=first.next;
        }
        while (first!=null){
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;
        return dummy.next;
    }

    public static ListNode removeNthFromEnd(ListNode head,int n){
        if(head==null) return head;
        else if (head.next==null && n==1 ) {
            head=null;
            return head;
        }
        else {
            ListNode temp = head;
            int count = 1;
            while (temp.next!=null){
                temp=temp.next;
                count++;
            }
            if(count == n) {
                head=head.next;
                return head;
            }
            System.out.println(count);
            count=count-n;
            System.out.println(count);

            ListNode prev = head;
            while (count<1){
                count--;
                prev = prev.next;
            }

            ListNode curr = prev.next;
            prev.next=curr.next;
        }
        return head;
    }
}
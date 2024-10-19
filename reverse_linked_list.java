class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode prev=null;
        ListNode front;
            if(head==null || head.next==null){
                return head;
            }
            ListNode newhead=reverseList(head.next);
            front=head.next;
            front.next=head;
            head.next=null;
        return newhead;
     }
}

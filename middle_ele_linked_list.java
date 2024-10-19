class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=null;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow; 

        }
}

class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
        //if last node to be deleted
        if(node.next==null){
            node=null;
        }
        
    }
}

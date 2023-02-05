//Two pointer approach that we use in in-place reversal of linked list.

class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = null;
        ListNode curr = head;
        while (curr != null) {
            if(node!=null && node.val==curr.val){
                node.next=curr.next;
            }
            else{
                node=curr;
            }
            curr=curr.next;
        }
        return head;
    }
}

// https://leetcode.com/problems/reverse-linked-list/

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode output = null;
        
        while(head != null){
            ListNode tmp = head.next;
            head.next = output;
            output = head;
            head = tmp;
        }

        return output;
    }
}

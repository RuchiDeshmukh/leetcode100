// https://leetcode.com/problems/palindrome-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        ListNode slow = getMid(head);

        ListNode tmp = reverseList(slow);
        
        while(tmp != null && head != null){
            if(head.val != tmp.val){
                return false;
            }else{
                tmp = tmp.next;
                head= head.next;
            }
        }

        return true;

    }

    private ListNode getMid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

   private ListNode reverseList(ListNode head) {
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

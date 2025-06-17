/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
         ListNode first=head;
        ListNode last=head.next;
        while(first!=last){
            if(last==null || last.next==null){
                return false;
            }
            first=first.next;
            last=last.next.next;
        }
        return true;
    }
}

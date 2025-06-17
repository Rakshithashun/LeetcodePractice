import java.util.*;
/*class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}*/
public class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> values=new ArrayList<>();
        ListNode current=head;
        while(current!=null) {
            values.add(current.val);
            current=current.next;
        }
        int left=0,right=values.size()-1;
        while(left<right) {
            if(!values.get(left).equals(values.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

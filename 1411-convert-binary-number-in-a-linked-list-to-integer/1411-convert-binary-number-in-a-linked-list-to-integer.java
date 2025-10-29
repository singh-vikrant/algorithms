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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int n=-1;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        temp = head;
        int sum = 0;
        while(temp!=null){
            if(temp.val==1){
                sum+= Math.pow(2,n);
            }
            n--;
            temp=temp.next;
        }
        return sum;
    }
}
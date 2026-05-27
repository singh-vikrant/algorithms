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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<lists.length;i++){
            ListNode li = lists[i];
            while(li!= null){
                pq.offer(li.val);
                li=li.next;
            }
            
        }

        ListNode head = null;
        if(pq.size()==0){ 
             return head; 
             }
        else{
            head = new ListNode(pq.poll());
        }

        ListNode temp = head;

        while(pq.size()!=0){
            temp.next = new ListNode(pq.poll());
            temp = temp.next;
        }
        return head;
    }
}
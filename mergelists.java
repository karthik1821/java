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
class Solution {// from leettcode Q no 23
    public ListNode mergeKLists(ListNode[] list) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<list.length;i++)
        {
            while(list[i]!=null)
            {
                pq.add(list[i].val);
                list[i]=list[i].next;

            }
        }
       int size=pq.size();
        ListNode dummy=new ListNode();
        if(pq.size()>0)
        {
        ListNode head=new ListNode(pq.poll());
        
        dummy.next=head;
        for(int i=0;i<size&&pq.size()>0;i++)
        {
           ListNode help=new ListNode(pq.poll());
            head.next=help;
            head=head.next;
            
        }
        }
        return dummy.next ;
    }
}

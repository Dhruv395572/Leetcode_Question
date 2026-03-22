// Last updated: 3/22/2026, 12:33:15 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeElements(ListNode head, int val) {
13        if(head==null){
14            return head;
15        }
16        ListNode rev=new ListNode(0);
17        rev.next=head;
18        ListNode rem=rev;
19        while(rem.next!=null){
20            if(rem.next.val==val){
21                rem.next=rem.next.next;
22            }
23            else{
24            rem=rem.next;
25            }
26        }
27        return rev.next;
28    }
29}
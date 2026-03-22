// Last updated: 3/22/2026, 12:45:07 PM
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
12    public ListNode deleteDuplicates(ListNode head) {
13      ListNode list=head;
14      while(list!=null && list.next!=null){
15        if(list.val==list.next.val){
16            list.next=list.next.next;
17        }
18        else{
19        list=list.next;
20        }
21      }
22      return head;
23    }
24}
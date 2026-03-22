// Last updated: 3/22/2026, 9:58:56 AM
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
12    public ListNode reverseList(ListNode head) {
13        ListNode rev=null;
14        ListNode curr=head;
15        while(curr!=null){
16            ListNode temp=curr.next;
17            curr.next=rev;
18            rev=curr;
19            curr=temp;
20        }
21        head=rev;
22        return head;
23    }
24}
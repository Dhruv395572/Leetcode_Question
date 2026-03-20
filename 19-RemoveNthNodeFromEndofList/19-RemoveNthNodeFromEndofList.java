// Last updated: 3/20/2026, 3:10:12 PM
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
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13       ListNode temp=head;
14       int length=0;
15        while(temp!=null){
16            length++;
17            temp=temp.next;
18        }
19        if(n==length){
20            return head.next;
21        }
22       ListNode p1=head; 
23       ListNode p2=head;
24        for(int i=0;i<=n;i++){
25            p2=p2.next;
26        }
27        while(p2!=null){
28            p1=p1.next;
29            p2=p2.next;
30        }
31        p1.next=p1.next.next;
32        return head;
33    }
34}
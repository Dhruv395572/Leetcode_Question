// Last updated: 3/13/2026, 11:38:31 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        ListNode t1=headA;
15        ListNode t2=headB;
16        while(t1!=t2){
17            if(t1==t2){
18                return t1;
19            }
20            if(t1==null){
21                t1=headB;
22            }else{
23                t1=t1.next;
24            }
25            if(t2==null){
26                t2=headA;
27            }
28            else{
29                t2=t2.next;
30            }
31        }
32        return t1;
33    }
34}
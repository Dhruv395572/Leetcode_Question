// Last updated: 5/17/2026, 5:11:44 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public List<Integer> postorderTraversal(TreeNode root) {
18        List<Integer> list=new ArrayList<>();
19        postorder(root,list);
20        return list;
21    }
22    public static void postorder(TreeNode root,List<Integer> list){
23        if(root==null){
24            return;
25        }
26        postorder(root.left,list);
27        postorder(root.right,list);
28        list.add(root.val);
29    }
30}
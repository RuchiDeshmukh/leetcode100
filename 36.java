//https://leetcode.com/problems/find-largest-value-in-each-tree-row/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root,res,0);
        return res;
    }

    private void helper(TreeNode root, List<Integer> res, int level){
        if(root == null) return;

        if(res.size() == level){
            res.add(root.val);
            System.out.println("if res :"+res);
            System.out.println("if level :"+level);
        }else{
            res.set(level, Math.max(root.val,res.get(level)));
            System.out.println("else res :"+res);
            System.out.println("else level :"+level);
        }
        helper(root.left,res,level+1);
        helper(root.right,res,level+1);
    }
}

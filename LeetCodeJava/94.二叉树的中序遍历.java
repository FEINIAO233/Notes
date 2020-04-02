/*
 * @lc app=leetcode.cn id=94 lang=java
 *
 * [94] 二叉树的中序遍历
 *
 * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/description/
 *
 * algorithms
 * Medium (70.81%)
 * Likes:    442
 * Dislikes: 0
 * Total Accepted:    131.9K
 * Total Submissions: 186.2K
 * Testcase Example:  '[1,null,2,3]'
 *
 * 给定一个二叉树，返回它的中序 遍历。
 *
 * 示例:
 *
 * 输入: [1,null,2,3]
 * ⁠  1
 * ⁠   \
 * ⁠    2
 * ⁠   /
 * ⁠  3
 *
 * 输出: [1,3,2]
 *
 * 进阶: 递归算法很简单，你可以通过迭代算法完成吗？
 *
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    //递归算法
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<Integer>();
        }
        List<Integer> mid = new ArrayList<Integer>();
        return traversal(root,mid);
    }
    public List<Integer> traversal(TreeNode root,List<Integer> list){
        if(root.left != null){
            traversal(root.left,list);
        }
        if(root != null){
            list.add(root.val);
        }
        if(root.right != null){
            traversal(root.right,list);
        }
        return list;
    }
    //迭代算法
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }
}
// @lc code=end


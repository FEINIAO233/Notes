/*
 * @lc app=leetcode.cn id=98 lang=java
 *
 * [98] 验证二叉搜索树
 *
 * https://leetcode-cn.com/problems/validate-binary-search-tree/description/
 *
 * algorithms
 * Medium (29.59%)
 * Likes:    481
 * Dislikes: 0
 * Total Accepted:    86.2K
 * Total Submissions: 291.2K
 * Testcase Example:  '[2,1,3]'
 *
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 *
 * 假设一个二叉搜索树具有如下特征：
 *
 *
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 *
 *
 * 示例 1:
 *
 * 输入:
 * ⁠   2
 * ⁠  / \
 * ⁠ 1   3
 * 输出: true
 *
 *
 * 示例 2:
 *
 * 输入:
 * ⁠   5
 * ⁠  / \
 * ⁠ 1   4
 * / \
 * 3   6
 * 输出: false
 * 解释: 输入为: [5,1,4,null,null,3,6]。
 * 根节点的值为 5 ，但是其右子节点值为 4 。
 *
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
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        // if(root.left != null && root.left.val >= root.val){
        //     return false;
        // }
        // if(root.right != null && root.right.val <= root.val){
        //     return false;
        // }
        // boolean i = true;
        // boolean j = true;
        // if(root.left != null){
        //     i = isValidBST(root.left);
        // }
        // if(root.right != null){
        //     j = isValidBST(root.right);
        // }
        // if(i && j){
        //     return true;
        // }else{
        //     return false;
        // }
        List<Integer> tree = new ArrayList<Integer>();
        getpre(root,tree);
        Object[] treei = tree.toArray();
        for(int i = 0; i < treei.length; i++){
            for(int j = i+1;j < treei.length;j++){
                if((int)treei[i] >= (int)treei[j]){
                    return false;
                }
            }
        }
        return true;
    }
    public List<Integer> getpre(TreeNode root,List<Integer> tree){
        if(root.left != null){
            getpre(root.left,tree);
        }
        if(root != null){
            tree.add(root.val);
        }
        if(root.right != null){
            getpre(root.right,tree);
        }

        return tree;
    }
}
// @lc code=end


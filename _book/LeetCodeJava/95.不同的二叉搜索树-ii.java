import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=95 lang=java
 *
 * [95] 不同的二叉搜索树 II
 *
 * https://leetcode-cn.com/problems/unique-binary-search-trees-ii/description/
 *
 * algorithms
 * Medium (62.28%)
 * Likes:    335
 * Dislikes: 0
 * Total Accepted:    25.5K
 * Total Submissions: 41K
 * Testcase Example:  '3'
 *
 * 给定一个整数 n，生成所有由 1 ... n 为节点所组成的二叉搜索树。
 *
 * 示例:
 *
 * 输入: 3
 * 输出:
 * [
 * [1,null,3,2],
 * [3,2,null,1],
 * [3,1,null,null,2],
 * [2,1,3],
 * [1,null,2,null,3]
 * ]
 * 解释:
 * 以上的输出对应以下 5 种不同结构的二叉搜索树：
 *
 * ⁠  1         3     3      2      1
 * ⁠   \       /     /      / \      \
 * ⁠    3     2     1      1   3      2
 * ⁠   /     /       \                 \
 * ⁠  2     1         2                 3
 *
 *
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new ArrayList<TreeNode>();
        }
        return generateTreesHelper(1, n);
    }

    public List<TreeNode> generateTreesHelper(int start,int end){
        List<TreeNode> allTrees = new LinkedList<TreeNode>();
        if(start > end){
            allTrees.add(null);
            return allTrees;
        }
        for(int i = start;i<= end;i++){
            List<TreeNode> leftTrees =  generateTreesHelper(start,i - 1);
            List<TreeNode> rightTrees = generateTreesHelper(i + 1,end);
            for (TreeNode l : leftTrees) {
                for (TreeNode r : rightTrees) {
                    TreeNode curr = new TreeNode(i);
                    curr.left = l;
                    curr.right = r;
                    allTrees.add(curr);
                }
            }
        }
        return allTrees;
    }
}
// @lc code=end

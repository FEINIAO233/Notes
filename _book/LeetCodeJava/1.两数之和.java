/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //暴力破解
        var temp = new int[2];
        for(var i = 0;i<nums.length;i++){
            for(var j = 0;j<nums.length;j++){
                if(i != j){
                    if(nums[i] + nums[j] == target){
                        temp[0] = i;
                        temp[1] = j;
                        return temp;
                    }
                }
            }
        }
        return temp;
    }
}
// @lc code=end


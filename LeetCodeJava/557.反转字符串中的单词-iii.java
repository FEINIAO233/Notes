/*
 * @lc app=leetcode.cn id=557 lang=java
 *
 * [557] 反转字符串中的单词 III
 *
 * https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/description/
 *
 * algorithms
 * Easy (71.57%)
 * Likes:    229
 * Dislikes: 0
 * Total Accepted:    82.7K
 * Total Submissions: 113.8K
 * Testcase Example:  `"Let's take LeetCode contest"`
 *
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 *
 *
 * 示例：
 *
 * 输入："Let's take LeetCode contest"
 * 输出："s'teL ekat edoCteeL tsetnoc"
 *
 *
 *
 *
 * 提示：
 *
 *
 * 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 *
 *
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        if(s.length() == 0){
            return s;
        }
        String[] words = s.split(" ");
        StringBuffer result = new StringBuffer();
        for(int i = 0;i < words.length;i++){
            result.append(" ");
            result.append(reverse(words[i]));
        }
        result.deleteCharAt(0);
        return result.toString();
    }
    public String reverse(String word){
        StringBuffer reverseWord = new StringBuffer();
        for(int m = word.length()-1;m >= 0;m--){
            reverseWord.append(word.charAt(m));
        }
        return reverseWord.toString();
    }
}
// @lc code=end


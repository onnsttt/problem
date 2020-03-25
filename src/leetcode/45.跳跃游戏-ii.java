/*
 * @lc app=leetcode.cn id=45 lang=java
 *
 * [45] 跳跃游戏 II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        int localtion = 0,cnt = 0,end=0;
        while(end < nums.length-1){
            int max = localtion;
            for (int i = localtion; i <= end;i++) {
                if(nums[i]+i>max){
                    max = nums[i]+i;
                }
            }
            cnt++;
            localtion = end+1;
            end = max;
        }
        return cnt;
    }
}
// @lc code=end


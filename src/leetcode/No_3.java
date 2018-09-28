package leetcode;
/**
 *  思路：类似于一个滑动的窗口，每次拓展到有重复的时候，整个窗口在重新移动即可。
 */

import java.util.Arrays;

public class No_3 {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLongestSubstring("pwwkew"));
    }
    private static class Solution {
        public int lengthOfLongestSubstring(String s) {
            int array[] = new int[1000];
            int ans,tmp;
            ans = tmp = 0;
            for(int i = 0;i<s.length();i++){
                if (array[s.charAt(i)] !=0){
                    i = array[s.charAt(i)]-1;
                    if(ans<tmp)
                        ans = tmp;
                    tmp = 0;
                    Arrays.fill(array,0);
                }else {
                    array[s.charAt(i)] = i+1;
                    tmp++;
                }
            }
            if(tmp>ans)
                ans = tmp;
            return ans;
        }
    }
}


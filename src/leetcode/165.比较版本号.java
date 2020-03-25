import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=165 lang=java
 *
 * [165] 比较版本号
 */

// @lc code=start
class Solution {
    public int compareVersion(String version1, String version2) {
        List<String> strings1 = new ArrayList<>(Arrays.asList(version1.split("\\.")));
        List<String> strings2 = new ArrayList<>(Arrays.asList(version2.split("\\.")));
        if(strings1.size()<=strings2.size()){
            while(strings1.size()<strings2.size()){
                strings1.add("0");
            }
        }else {
            int len = strings2.size();
            for (int i = 0; i < strings1.size()-len; i++) {
                strings2.add("0");
            }
        }
        for (int i = 0; i < strings1.size(); i++) {
            int a = Integer.parseInt(strings1.get(i));
            int b = Integer.parseInt(strings2.get(i));
            if(a>b){
                return 1;
            }else if(a<b){
                return -1;
            }
        }
        return 0;
    }
}
// @lc code=end


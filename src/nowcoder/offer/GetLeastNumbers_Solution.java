package nowcoder.offer;

/**
 * 排序！
 */

import java.util.ArrayList;
import java.util.Arrays;

public class GetLeastNumbers_Solution {
    public static void main(String[] args) {
        new GetLeastNumbers_Solution().GetLeastNumbers_Solution(new int[]{4,5,1,6,2,7,3,8},4);
    }
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer>list = new ArrayList<>();
        Arrays.sort(input);
        if(k>input.length)
            return list;
        for(int i = 0;i<k;i++)
            list.add(input[i]);
        System.out.println(list);
        return list;
    }
}

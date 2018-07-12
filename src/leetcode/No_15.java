package leetcode;

import java.util.*;

public class No_15 {
    public static void main(String[] args) {
        int nums[] = {-1, 0, -1, 1, 2, -4};
        List<List<Integer>> ans = threeSum(nums);
        System.out.println(ans.size());
    }

    static public List<List<Integer>> threeSum(int[] nums) {
        Map<String, Integer> s = new HashMap<>();
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int targer = getNum(nums, j+1, nums.length - 1, nums[i] + nums[j]);
                if (targer != -1) {
                    String str = "" + nums[i] + nums[j] + nums[targer];
                    if (!s.containsKey(str)) {
                        s.put(str, 1);
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[targer]);
                        ans.add(list);
                    }
                }
            }
        }
        return ans;
    }

    static int getNum(int nums[], int left, int right, int targer) {
        int mid = (left + right) / 2;
        while (left <= right) {
            mid = (left+right)/2;
            if (nums[mid] + targer == 0)
                return mid;
            if (nums[mid] + targer < 0)
                left = mid + 1;
            else
                right = mid-1;
        }
        return -1;
    }
}

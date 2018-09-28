package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class No_47 {
    public static void main(String[] args) {
        new No_47().permuteUnique(new int[]{1,1,2});
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        permutations(nums,0,list,map);
        System.out.println(list);
        return list;
    }
    public void swap(int nums[],int x,int y){
        int t = nums[x];
        nums[x] = nums[y];
        nums[y] = t;
    }

    public void permutations(int array[],int index,List<List<Integer>> list,Map<String,Integer>map) {
        if (index >= array.length) {
            List<Integer> li = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                li.add(array[i]);
            }
            String str = li.toString();
            if(map.containsKey(str)){
                return;
            }else {
                list.add(li);
                map.put(str,1);
            }
            return;
        }

        for (int i = index; i < array.length; i++) {
            swap(array, i, index);
            permutations(array, index + 1, list,map);
            swap(array, i, index);
        }
    }
}

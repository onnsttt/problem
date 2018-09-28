package leetcode;

import java.util.ArrayList;
import java.util.List;

public class No_46 {
    public static void main(String[] args) {
        new No_46().permute(new int[]{1,2,3});
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        permutations(nums,0,list);
        System.out.println(list);
        return list;
    }

    public void swap(int nums[],int x,int y){
        int t = nums[x];
        nums[x] = nums[y];
        nums[y] = t;
    }

    public void permutations(int array[],int index,List<List<Integer>> list) {
        if (index >= array.length) {
            List<Integer> li = new ArrayList<>();
            for (int i = 0; i < array.length; i++) {
                li.add(array[i]);
            }
            list.add(li);
            return;
        }

        for (int i = index; i < array.length; i++) {
            swap(array, index, i);
            permutations(array, index + 1, list);
            swap(array, index, i);
        }
    }
}

package nowcoder.offer;

/**
 * 用一个数组来记录这个位置的最大值（指从左累加到这里的最大值）
 */
public class FindGreatestSumOfSubArray {
    public static void main(String[] args) {
        System.out.println(new FindGreatestSumOfSubArray().FindGreatestSumOfSubArray(new int[]{6,-3,-2,7,-15,1,2,2}));
    }
    public int FindGreatestSumOfSubArray(int[] array) {
        int sum[] = new int[100005];
        sum[0] = array[0];
        for(int i = 1;i<array.length;i++){
            sum[i] = sum[i-1]+array[i]>array[i]?sum[i-1]+array[i]:array[i];
        }
        int max = sum[0];
        for(int i = 0;i<array.length;i++){
            if(sum[i]>max)
                max = sum[i];
        }
        return max;
    }
}

package nowcoder.offer;

/**
 * 用一个数组来统计每个数组出现的次数即可
 * 两种选择：
 * 1.牺牲时间节约空间用map
 * 2.牺牲空间节约时间用array
 */
public class MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int s[] = new int[100005];
        for(int i = 0;i<array.length;i++){
            s[array[i]]++;
        }
        for (int i = 0; i < array.length; i++) {
            if(s[array[i]]>array.length/2){
                return array[i];
            }
        }
        return 0;
    }
}

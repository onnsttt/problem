package leetcode;

/**
 *很简单的题目，只是有大概半年多没做题目了，多多少少有一点点生疏
 * 虽然不在打比赛了，但是还是可以慢慢捡起来这个，慢慢学。
 * 思路:很简单，就是每一个点可以由前一个点或者上一个点到达，所以dp[i][j] = dp[i-1][j]+dp[i][j-1]
 */
public class No_62 {
    public static void main(String[] args) {
        System.out.println(new No_62().uniquePaths(3,2));
    }
    public int uniquePaths(int m, int n) {
        int array[][] = new int[105][105];
        for(int i = 1;i<101;i++)
            array[i][1] = array[1][i] = 1;
        for(int i = 2;i<=m;i++)
            for(int j = 2;j<=n;j++){
                array[i][j] = array[i-1][j]+array[i][j-1];
            }
        return array[m][n];
    }
}
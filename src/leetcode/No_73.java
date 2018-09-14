package leetcode;

import java.io.PrintWriter;

/**
 * 思路：类似于那个linux的chmod一样，1代表本行的全部为0,2代表本列的都要为0,3则代表这行这列的都要为0。这样的空间复杂度最低为o(n||m)
 */
public class No_73 {
    public static void main(String[] args) {
        new No_73().setZeroes(new int[][]{{1,1,1},{1,0,1},{1,1,1}});
    }
    public void setZeroes(int[][] matrix) {
        int n = matrix[0].length;
        int m = matrix.length;
        int array[] = new int[n>m?n:m];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(matrix[i][j]==0){
                    if (array[i]<3&&array[i]!=1){
                        array[i]++;
                    }
                    if(array[j]<3&&array[j]!=2){
                        array[j]+=2;
                    }
                }
            }
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(j!=0)
                    System.out.printf(" ");
                if(array[i]==3||array[i]==1||array[j]==2||array[j]==3){
                    System.out.printf("0");
                    matrix[i][j] = 0;
                }
                else
                    System.out.printf("%d",matrix[i][j]);
            }
            System.out.println();
        }
    }
}

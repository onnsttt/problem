import javax.sound.sampled.SourceDataLine;

/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

 // @lc code=start


//  class Main{
//     public static void main(String[] args){
//          Solution solution = new Solution();
//          int array[][]=solution.generateMatrix(5);
//          for (int i = 0; i < array.length; i++) {
//              for (int j = 0; j < array[i].length; j++) {
//                  System.out.printf("%d ",array[i][j]);
//              }
//              System.out.println();
//          }
//      }
//  }

// 这道题出现过了在2017年的ACM-ICPC青岛赛的比赛中
// 对这道题还是有很深的记忆的
// 那个时候我还是大二，参与过这场比赛，记得这道题目（不完全一致）是我和另一个队友写的
// 是采用模拟的方式去做的，但是由于对于代码的控制能力不足吧，导致了一致wa.
// 最后这个题还是靠另一个队友做出来的
// 最后我们也是三题水了一个铜奖。全都是靠队友带飞。
// 我这种菜鸡疯狂划水

class Solution {
    public int[][] generateMatrix(int n) {
        int array[][] = new int[n][n];
        int dir[][] = {{0,1},{1,0},{0,-1},{-1,0}};
        int cnt = 1;
        int x,y;
        x=y=0;
        while(cnt<=n*n){
            for(int i = 0;i<4;i++){
                while(x>=0&&x<n&&y>=0&&y<n){
                    if(array[x][y]==0){
                        array[x][y] = cnt++;
                    }
                    x+=dir[i][0];
                    y+=dir[i][1];
                    if(x>=0&&x<n&&y>=0&&y<n&&array[x][y]!=0){
                        break;
                    }
                }
                x-=dir[i][0];
                y-=dir[i][1];
            }
        }
        return array;
    }
}
// @lc code=end


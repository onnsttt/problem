package nowcoder.neteasy;
/**
 * 小易有一个古老的游戏机，上面有着经典的游戏俄罗斯方块。因为它比较古老，所以规则和一般的俄罗斯方块不同。
 * 荧幕上一共有 n 列，每次都会有一个 1 x 1 的方块随机落下，在同一列中，后落下的方块会叠在先前的方块之上，当一整行方块都被占满时，这一行会被消去，并得到1分。
 * 有一天，小易又开了一局游戏，当玩到第 m 个方块落下时他觉得太无聊就关掉了，小易希望你告诉他这局游戏他获得的分数。
 */

import java.util.Scanner;

/**
 * 计数即可。答案就是那个最小的值
 */
public class net_2018_cube {
    public static void main(String[] args) {
        int m, n, t;
        Scanner cin = new Scanner(System.in);
        int array[] = new int[10000];
        n = cin.nextInt();
        m = cin.nextInt();
        for (int i = 0; i < m; i++) {
            t = cin.nextInt();
            array[t]++;
        }
        int min = array[1];
        for (int i = 2; i <= n; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);
    }
}

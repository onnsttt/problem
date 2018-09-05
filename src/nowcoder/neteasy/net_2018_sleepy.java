package nowcoder.neteasy;
/**
 * 小易觉得高数课太无聊了，决定睡觉。不过他对课上的一些内容挺感兴趣，所以希望你在老师讲到有趣的部分的时候叫醒他一下。
 * 你知道了小易对一堂课每分钟知识点的感兴趣程度，并以分数量化，以及他在这堂课上每分钟是否会睡着，
 * 你可以叫醒他一次，这会使得他在接下来的k分钟内保持清醒。你需要选择一种方案最大化小易这堂课听到的知识点分值
 */

import java.util.Scanner;

/**
 * 水题，贪心即可，这个类似于模拟拥塞控制的发送端口
 */

public class net_2018_sleepy {
    public static void main(String[] args) {
        int n, k;
        int tmp, ans, ttt = 0;
        Scanner cin = new Scanner(System.in);
        int a[] = new int[100005];
        int t[] = new int[100004];
        n = cin.nextInt();
        k = cin.nextInt();
        for (int i = 1; i <= n; i++)
            a[i] = cin.nextInt();
        for (int i = 1; i <= n; i++) {
            t[i] = cin.nextInt();
            if (t[i] == 1)
                ttt += a[i];
        }
        tmp = ans = 0;
        for (int i = 1; i <= k && i <= n; i++)
            if (t[i] != 1)
                tmp += a[i];
        ans = tmp;
        for (int i = 2; i <= n - k + 1; i++) {
            if (t[i - 1] != 1)
                tmp -= a[i - 1];
            tmp += t[i + k - 1] == 0 ? a[i + k - 1] : 0;
            if (tmp > ans)
                ans = tmp;
        }
        System.out.println(ans + ttt);
    }
}

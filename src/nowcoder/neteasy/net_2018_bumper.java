package nowcoder.neteasy;
/**
 * 又到了丰收的季节，恰逢小易去牛牛的果园里游玩。
 * 牛牛常说他对整个果园的每个地方都了如指掌，小易不太相信，所以他想考考牛牛。
 * 在果园里有N堆苹果，每堆苹果的数量为ai，小易希望知道从左往右数第x个苹果是属于哪一堆的。
 * 牛牛觉得这个问题太简单，所以希望你来替他回答。
 */

import java.util.Scanner;

/**
 * 累加，然后二分查找
 */

public class net_2018_bumper {
    public static void main(String[] args) {
        int n, m, q;
        int array[] = new int[100005];
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        for (int i = 1; i <= n; i++) {
            q = cin.nextInt();
            array[i] += array[i - 1] + q;
        }
        m = cin.nextInt();
        for (int i = 1; i <= m; i++) {
            q = cin.nextInt();
            System.out.println(find(q, 1, n, array));
        }
    }

    public static int find(int q, int start, int end, int array[]) {
        int mid;
        while (end >= start) {
            mid = (start + end) / 2;
            if (array[mid] >= q && array[mid - 1] < q)
                return mid;
            if (array[mid] < q)
                start = mid + 1;
            else end = mid - 1;
        }
        return 0;
    }
}

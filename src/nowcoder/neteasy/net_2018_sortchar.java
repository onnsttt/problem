package nowcoder.neteasy;
/**
 * 小易在学校中学习了关于字符串的理论, 于是他基于此完成了一个字典的项目。
 * 小易的这个字典很奇特, 字典内的每个单词都包含n个'a'和m个'z', 并且所有单词按照字典序排列。
 * 小易现在希望你能帮他找出第k个单词是什么。
 * 输入描述:
 * 输入包括一行三个整数n, m, k(1 <= n, m <= 100, 1 <= k <= 109), 以空格分割。输出描述:
 * 输出第k个字典中的字符串，如果无解，输出-1。
 *
 * 输入例子1:
 * 2 2 6
 *
 * 输出例子1:
 * zzaa
 *
 * 例子说明1:
 * 字典中的字符串依次为aazz azaz azza zaaz zaza zzaa
 */


import java.util.Scanner;

/**
 * 这个题目还是很有想法的，虽然我看了其他人的思路
 * 其实也就是说每次先判断首字母，因为首字母如果确定了，后面的组合也就count（m+n-1，n-1）种组合
 * 然后每次按照这个算出首字母就OK了
 */
public class net_2018_sortchar {
    public static void main(String[] args) {
        int n, m, k;
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        m = cin.nextInt();
        k = cin.nextInt();
        System.out.println(deal(n, m, k));
    }

    public static String deal(int n, int m, int k) {
        String str = "";
        while (n > 0 && m > 0) {
            long count = 1;
            for (int i = 0; i < n - 1; i++) {
                count *= (n - 1 + m - i);
                count /= (i + 1);
                if (count > k)
                    break;
            }
            if (k <= count) {
                str += "a";
                n--;
            } else {
                str += "z";
                m--;
                k -= count;
            }
        }
        if (k != 1) {
            return "-1";
        }
        while ((n--) > 0)
            str += "a";
        while ((m--) > 0)
            str += "z";
        return str;
    }
}

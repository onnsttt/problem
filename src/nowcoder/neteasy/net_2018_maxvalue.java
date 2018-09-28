package nowcoder.neteasy;
/**
 * 今天上课，老师教了小易怎么计算加法和乘法，乘法的优先级大于加法，但是如果一个运算加了括号，那么它的优先级是最高的。例如：
 * 1+2*3=7
 * 1*(2+3)=5
 * 1*2*3=6
 * (1+2)*3=9
 * 现在小易希望你帮他计算给定3个数a，b，c，在它们中间添加"+"， "*"， "("， ")"符号，能够获得的最大值。
 */

import java.util.Scanner;

/**
 * 因为数是固定的，所以把每种情况列出即可
 */

public class net_2018_maxvalue {
    public static void main(String[] args) {
        int a, b, c;
        Scanner cin = new Scanner(System.in);
        a = cin.nextInt();
        b = cin.nextInt();
        c = cin.nextInt();
        System.out.println(getmax(a, b, c));
    }

    public static int getmax(int a, int b, int c) {
        int max = a + b + c;
        if (a * b + c > max) max = a * b + c;
        if (a * b * c > max) max = a * b * c;
        if ((a + b) * c > max) max = (a + b) * c;
        if (a * (b + c) > max) max = a * (b + c);
        return max;
    }

}

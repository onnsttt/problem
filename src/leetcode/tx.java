package leetcode;

import java.math.BigInteger;
import java.util.Scanner;

public class tx {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int k,a,b,x,y,tmp;
        k = cin.nextInt();
        a = cin.nextInt();
        x = cin.nextInt();
        b = cin.nextInt();
        y = cin.nextInt();
        int mod = 1000000007;
        BigInteger bigInteger = BigInteger.valueOf(mod);
        BigInteger ans = BigInteger.ZERO;
        for(int i = 0;i<=x;i++){
            tmp = k-i*a;
            if(tmp%b==0&&tmp/b<y&&tmp>=0){
                System.out.println("test");
                ans=ans.add(getnum(i,x,bigInteger).multiply(getnum(tmp/b,y,bigInteger))).mod(bigInteger);
            }
        }
        System.out.println(ans);
    }
    static BigInteger getnum(int x,int y,BigInteger mod){
        BigInteger numx = BigInteger.ONE;
        BigInteger numy = BigInteger.ONE;
        for(int i = 0;i<x;i++){
            numx = numx.multiply(BigInteger.valueOf(y-i));
            numy = numy.multiply(BigInteger.valueOf(x-i));
        }
        System.out.println(numx.divide(numy).mod(mod));
        return numx.divide(numy).mod(mod);
    }
}

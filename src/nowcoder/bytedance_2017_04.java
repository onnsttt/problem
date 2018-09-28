package nowcoder;

import java.math.BigInteger;
import java.util.Scanner;

public class bytedance_2017_04 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x,k;
        x = cin.nextInt();
        k = cin.nextInt();
        StringBuffer str = new StringBuffer(Integer.toBinaryString(x));
        for(int i = str.length()-1;i>=0;i--){
            if(str.charAt(i)=='0'&&k>0){
                k--;
                str.replace(i,i+1,"1");
                if(k==0){
                    str.substring(i,str.length());
                }
            }else {
                    str.replace(i,i+1,"0");
            }
        }
        if(k>0)
            str.insert(0,Integer.toBinaryString(k));
        System.out.println(str+":"+str.length());
        System.out.println(new BigInteger(String.valueOf(str),2));
    }
}

package nowcoder;

import java.util.Scanner;

public class java {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        StringBuffer string = new StringBuffer(cin.next());

        int n = cin.nextInt();
        int l,r;
        String tmp = "";
        for(int i = 0;i<n;i++){
            l = cin.nextInt();
            r = cin.nextInt();
            tmp ="";
            for(int j = r+l-1;j>=l;j--){
                tmp+=string.charAt(j);
            }
            string.insert(l+r,tmp);
        }
        System.out.println(string);
    }
}

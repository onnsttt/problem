package nowcoder;

import java.util.Scanner;

public class bytedance_2017_02 {
    public static void main(String[] args) {
        int n,s,l;
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        s = cin.nextInt();
        l = cin.nextInt();
        int ans = 0;
        int tmp = l;
        int cnt = 0;
        while((n--)>0){
            if(tmp==l){
                tmp-=s;
                cnt++;
            }
            else if(tmp>=(s+1)){
                tmp-=(s+1);
                cnt++;
                if(tmp<(s+1)&&cnt%13==0){
                    n++;
                    tmp = l;
                    ans++;
                    cnt = 0;
                }
            }else {
                ans++;
                cnt = 0;
                tmp = l;
                n++;
            }
        }
        if(tmp!=l){
            ans++;
        }
        if(ans==1&&cnt%13==0)
            ans++;
        System.out.println(ans);
    }
}
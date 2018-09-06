package nowcoder;
import java.util.Scanner;

public class java {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
       int a[] = new int[100005];
       int n,k,t;
       n = cin.nextInt();
       k = cin.nextInt();
       t = cin.nextInt();
       for(int i = 1;i<=n;i++){
           a[i] = cin.nextInt();
       }
       int ans = 0;
       int num[] = new int[100005];
       for(int i = 1;i<=k;i++){
            num[a[i]]++;
       }
       for(int i = 1;i<=k;i++){
           if(num[a[i]]>=t){
               ans++;
               break;
           }
       }
       for(int i = 2;i<=n+1-k;i++){
           num[a[i-1]]--;
           num[a[k+i-1]]++;
           for(int j = i;j<=k+i-1;j++){
               if(num[a[j]]>=t){
                   ans++;
                   break;
               }
           }
       }
        System.out.println(ans);
    }
}

package leetcode;

/**
 * 这个题用了两种解法
 * 1.暴力，暴力总是最简单的最直接的解法，不管行不行直接暴力，万一A了呢
 * 2.DP，这个是我在解答中看到的，是一种解决回文字符串的办法，因为回文肯定是从中间先两边推移
 *  很明显，这就是一个转移方程 dp[i][j]=(dp[i+1][j-1]&s[i]==s[j])
 *  然后枚举长度就ok
 *
 */
public class No_5 {
    public static void main(String[] args) {
        System.out.println(new DP().longestPalindrome("a"));
    }
}

class Force{
    public String longestPalindrome(String s) {
        String ans = "";
        for(int i = 0;i<s.length();i++){
            for(int j = s.length()-1;j>=i;j--){
                if(s.charAt(i)==s.charAt(j)){
                    if(judge(s,i,j)) {
                        if(j+1-i>ans.length()){
                            ans = s.substring(i,j+1);
                        }
                    }
                }
            }
        }
        return ans;
    }
    static boolean judge(String str,int x,int y){
        while (x<=y){
            if(str.charAt(x)==str.charAt(y)){
                x++;
                y--;
            }else
                break;
        }
        if(x<=y)
            return false;
        return true;
    }
}


class DP{
    public String longestPalindrome(String s){
        String ans = "";
        int dp[][] = new int[s.length()][s.length()];
        for(int i = 0;i<s.length();i++){
            dp[i][i] = 1;
            if(i+1<s.length()&&s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=1;
                ans = ""+s.charAt(i)+s.charAt(i+1);
            }
            if(ans.length()==0){
                ans = ""+s.charAt(i);
            }
        }
        for(int len = 3;len<=s.length();len++)
            for(int i =0;i+len-1<s.length();i++){
                int j = i+len-1;
                if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]==1){
                    dp[i][j] = 1;
                    if(len>ans.length())
                        ans = s.substring(i,j+1);
                }
            }
            return ans;
    }
}
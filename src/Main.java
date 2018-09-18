import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.println(n&(n-1));
    }
}

/*
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int array[] = new int[100000];
        int candy[] = new int[100000];
        String str = cin.nextLine();
        String[] string = str.split(" ");
        int m = string.length;
        for(int i = 0;i<m;i++){
            array[i] = Integer.parseInt(string[i]);
        }
        Arrays.sort(array,0,string.length);
        str = cin.nextLine();
        string = str.split(" ");
        int n = string.length;
        for(int i = 0;i<n;i++)
            candy[i] = Integer.parseInt(string[i]);
        Arrays.sort(candy,0,n);
        int ans = 0;
        n--;
        m--;
        while(n>=0&&m>=0){
            if(candy[n]>=array[m]){
                n--;
                m--;
                ans++;
            }else {
                m--;
            }
        }
        System.out.println(ans);
    }
}*/



/*
import java.util.*;

public class Main{
    public static void main(String[] args) {
        System.out.println(new Main().salaryfrequeny(6,new int[]{4,1,2,3,4,5}));
    }
    public int maxNumOfWeeks(int projectCount, int[] projectsModule) {
        Arrays.sort(projectsModule,0,projectCount);
        int ans = 0;
        projectCount--;
        for(int i = 0;i<projectCount;i++){
            if(projectsModule[projectCount]>projectsModule[i]){
                ans+=projectsModule[i]*2;
                projectsModule[projectCount]-=projectsModule[i];
            }else {
                ans+=projectsModule[projectCount]*2;
                projectsModule[i--]-=projectsModule[projectCount--];
            }
        }
        if(projectsModule[projectCount]>0||(projectCount>0&&projectsModule[projectCount-1]>0))
            ans++;
        return ans;
    }

    int sumOfPerformance(int num, int[] listPFR)
    {
       int max = 0;
       for(int i = 1;i<num;i++){
           if(listPFR[i]>listPFR[max])
               max = i;
       }
       if(max==num-1){
           return (num-1)*10+15;
       }
       return (num-1)*5+15;
    }
    List<Integer> salaryfrequeny(int num, int[] salaries)
    {
        List<List<Integer>> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int tmp = 0;
        for(int i = 0;i<num;i++){
            if(map.containsKey(salaries[i])){
                list.get(map.get(salaries[i])).add(salaries[i]);
            }else {
                map.put(salaries[i],tmp++);
                List<Integer> t = new ArrayList<>();
                t.add(salaries[i]);
                list.add(t);
            }
        }
        Collections.sort(list, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                return o2.size()-o1.size();
            }
        });
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<list.size();i++){
            for(int j = 0;j<list.get(i).size();j++)
                ans.add(list.get(i).get(j));
        }
        return ans;
    }
}
*/


/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str1,str2;
        str1 = cin.next();
        str2 = cin.next();
        String ans = "";
        for(int i = 0;i<str1.length();i++){
            if(str1.charAt(i)==str2.charAt(0)&&str1.length()-i<=str2.length()){
                ans = getAns(str1.substring(i),str2);
                if(ans.length()!=0){
                    break;
                }
            }
        }
        System.out.println(ans.length());
    }
    static String getAns(String str1,String str2){
        int flag = 0;
        for(int i = 0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                flag = 1;
                break;
            }
        }
        if(flag==1)
            return "";
        else
            return str1;
    }

}
*/

/*
import java.math.BigInteger;
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<BigInteger> list = new ArrayList<>();
        int n = cin.nextInt();
        list.add(BigInteger.ONE);
        getUglyNumber(list,n);
        Collections.sort(list);
       // System.out.println(list);
        System.out.println(list.get(n-1));
    }
    public static void getUglyNumber(ArrayList<BigInteger>list,int n){
        int len = list.size();
        Set<BigInteger> set = new HashSet<>();
        while(true){
            len = list.size();
            for(int i = 0;i<len;i++){
                BigInteger num = list.get(i);
                if(!set.contains(num.multiply(BigInteger.valueOf(2)))){
                    list.add(num.multiply(BigInteger.valueOf(2)));
                    set.add(num.multiply(BigInteger.valueOf(2)));
                }
                if(!set.contains(num.multiply(BigInteger.valueOf(3)))){
                    list.add(num.multiply(BigInteger.valueOf(3)));
                    set.add(num.multiply(BigInteger.valueOf(3)));
                }
                if(!set.contains(num.multiply(BigInteger.valueOf(5)))){
                    list.add(num.multiply(BigInteger.valueOf(5)));
                    set.add(num.multiply(BigInteger.valueOf(5)));
                }
            }
            if(list.size()>5000){
                return;
            }
        }
    }
}
*/

/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        int array[] = new int[1001];
        for(int i = 0;i<str.length();i++){
            array[str.charAt(i)]++;
        }
        int min = str.length();
        for(int i =0;i<str.length();i++ ){
            if(array[str.charAt(i)]<min)
                min = array[str.charAt(i)];
        }
        String ans = "";
        for(int i =0;i<str.length();i++){
            if(array[str.charAt(i)]!=min){
                ans+=str.charAt(i);
            }
        }
        System.out.println(ans);
    }
}*/


/**
 * 第四范式的笔试题
 */
/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        String ans = ""+str.charAt(0);
        for(int i = 0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                String tmp = getString(str,i);
                if(tmp.length()>ans.length())
                    ans = tmp;
                if(ans.length()==str.length())
                    break;
            }
        }
        System.out.println(ans);
    }
    static String getString(String str,int x){
        int i = x,j = x+1;
        while(i>0&&j<str.length()-1){
            if(str.charAt(i)==str.charAt(j)){
                i--;
                j++;
            }else {
                i++;
                j--;
                break;
            }
        }
        if(str.charAt(i)!=str.charAt(j)){
            i++;j--;
        }
        return str.substring(i,j+1);
    }
}
*/

/*

import java.math.BigInteger;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        BigInteger x = cin.nextBigInteger();
        BigInteger y = cin.nextBigInteger();
        System.out.println(x.multiply(y));
    }
}
*/



/**
 * 下面是2018今日头条的4道笔试题
 */
/*
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;


public class Main {
    static Queue<Point> queue = new ArrayBlockingQueue<Point>(1005*1005);
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m, ans;
        int array[][] = new int[1005][1005];
        m = cin.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                array[i][j] = cin.nextInt();
            }
        }
        ans = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                if (array[i][j] == 1) {
                    bfs(array, i, j, m);
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }

    static void bfs(int array[][], int x, int y, int m) {
        int dir[][] = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
        Point point = new Point(x, y);
        queue.add(point);
        while (!queue.isEmpty()) {
            point = queue.poll();
            array[point.getX()][point.getY()] = 0;
            for (int i = 0; i < 4; i++) {
                Point tmp = new Point(point.getX() + dir[i][0], point.getY() + dir[i][1]);
                if (tmp.getX() > 0 && tmp.getX() <= m && tmp.getY() > 0 && tmp.getY() <= m) {
                    if (array[tmp.getX()][tmp.getY()] == 1) {
                        queue.add(tmp);
                    }
                }
            }
        }
        return;
    }
}

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}*/


/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n;
        int array[] = new int[1000];
        n = cin.nextInt();
        int flag = 0;
        for (int i = 1; i <= n; i++) {
            array[i] = cin.nextInt();
            array[i] = array[i]&0xff;
            if(array[i]<0){
                flag++;
            }
        }
        if(flag>0){
            System.out.println(0);
            return;
        }
        if (n == 1) {
            if (array[1] < 128)
                System.out.println(1);
            else
                System.out.println(0);
        } else if (n == 2) {
            if (array[1] < 224&&array[1]>=192 && array[2] < 192&&array[2]>=128)
                System.out.println(1);
            else
                System.out.println(0);
        } else if (n == 3) {
            if (array[1] < 240 &&array[1]>=224&& array[2] < 192&&array[2]>=128 && array[3] < 192&&array[3]>=128)
                System.out.println(1);
            else
                System.out.println(0);
        } else if (n == 4) {
            if (array[1] < 248 &&array[1]>=240&& array[2] < 192&&array[2]>=128 && array[3] < 192&&array[2]>=128 && array[4] < 192&&array[2]>=128)
                System.out.println(1);
            else
                System.out.println(0);
        } else
            System.out.println(0);
    }

    static String getBinary(int x) {
        char str[] = new char[8];
        for (int i = 7; i >= 0; i--) {
            if ((x & 1) == 1) {
                str[i] = 1;
            } else {
                str[i] = 0;
            }
            x /= 2;
        }
        return new String(str);
    }
}
*/

/*import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int m, n, x, y;
        int cnt[] = new int[5 * 10000];
        ArrayList<Integer> array[] = new ArrayList[5 * 10005];
        n = cin.nextInt();
        m = cin.nextInt();
        for (int i = 1; i <= n; i++)
            array[i] = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            x = cin.nextInt();
            y = cin.nextInt();
            cnt[y]++;
            array[x].add(y);
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < array[i].size(); j++) {
                cnt[array[i].get(j)] += cnt[i];
            }
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            if (cnt[i] + 1 >= n)
                ans++;
        }
        System.out.println(ans);
    }
}
*/

/*
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        if(str.length()<4)
            System.out.println(0);
        int ans = dfs(str,0);
        System.out.println(ans);
    }

    static int dfs(String str,int dep){
        if(str.length()==0)
            return 0;
        if(dep==3){
            if(str.length()>3)
                return 0;
            if(str.charAt(0)=='0'&&str.length()>1)
                return 0;
            Integer num = Integer.parseInt(str);
            if(num>=0&&num<=255)
                return 1;
        }
        int ans = 0;
        for(int i = 0;i<3&&i<str.length();i++){
            if(i==0){
                ans+=dfs(str.substring(i+1),dep+1);
            }else if(i==1){
                Integer num = Integer.parseInt(str.substring(0,2));
                if(num>=10){
                    ans+=dfs(str.substring(i+1),dep+1);
                }
            }else if(i==2){
                Integer num = Integer.parseInt(str.substring(0,3));
                if(num>=100&&num<=255){
                    ans+=dfs(str.substring(i+1),dep+1);
                }
            }
        }
        return ans;
    }
}
*/






/*
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        int array[] = new int[1000];
        int ans, tmp;
        ans = tmp = 0;
        for (int i = 0; i < str.length(); i++) {
            if (array[str.charAt(i)]!=0){
                if(ans<tmp){
                    ans = tmp;
                }
                tmp = 0;
                i = array[str.charAt(i)]-1;
                Arrays.fill(array,0);
            }else {
                tmp++;
                array[str.charAt(i)]=i+1;
            }
        }
        if(ans<tmp)
            ans = tmp;
        System.out.println(ans);
    }
}
*/

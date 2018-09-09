




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

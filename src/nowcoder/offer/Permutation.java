package nowcoder.offer;

import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(new Permutation().Permutation("abcd"));
    }
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        if(str==null||str.equals(""))
            return list;
        dfs(str.toCharArray(),0,list,map);
        Collections.sort(list);
        return list;
    }

    public void swap(char str[],int x,int y){
        char t = str[x];
        str[x] = str[y];
        str[y] = t;
    }

    public void dfs(char str[], int index, List<String>list,Map<String,Integer>map){
        if(index==str.length){
            String string = new String(str);
            if(map.containsKey(string)){
                return;
            }else{
                map.put(string,1);
                list.add(string);
            }
            return;
        }
        for (int i = index; i < str.length; i++) {
            swap(str,i,index);
            dfs(str,index+1,list,map);
            swap(str,i,index);
        }
    }
}

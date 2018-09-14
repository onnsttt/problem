package leetcode;


/**
 * 思路：先把字符串排序后用map存起来，看看是不是之前存在了同意的字符串，如果是则在同一个list里面，否则新建一个list
 */

import java.util.*;

public class No_49 {
    public static void main(String[] args) {
        System.out.println(new No_49().groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        int i = 0;
        char st[] = new char[10000];
        for (String str : strs) {
            st = str.toCharArray();
            Arrays.sort(st,0,str.length());
            if(map.containsKey(new String(st))){
                list.get(map.get(new String(st))).add(str);
            }else{
                List<String> tmp = new ArrayList<>();
                tmp.add(str);
                map.put(new String(st),i++);
                list.add(tmp);
            }
        }
        for (List<String> stringList : list) {
            Collections.sort(stringList);
        }
        return list;
    }
}

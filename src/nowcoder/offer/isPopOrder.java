package nowcoder.offer;


import java.util.Stack;

/**
 * 思路：当前栈顶的元素与出栈的元素不一致则进栈，最后看出栈的元素出完了没有，即可知道顺序是否正确
 */
public class isPopOrder {
    public static void main(String[] args) {
        System.out.println(new isPopOrder().IsPopOrder(new int[]{1,2,3,4,5},new int[]{4,5,3,2,1}));
    }
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> s = new Stack<>();
        int i = 0,j = 0;
        while(i<=pushA.length&&j<popA.length){
            if(s.empty()||s.peek()!=popA[j]){
                if(i==pushA.length)
                    return false;
                s.push(pushA[i++]);
                continue;
            }
            if(s.peek()==popA[j]){
                s.pop();
                j++;
            }
        }
        if(j==popA.length)
            return true;
        return false;
    }
}

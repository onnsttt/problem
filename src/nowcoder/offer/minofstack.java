package nowcoder.offer;

/**
 * 在每次出栈和进栈的时候更新一下最小值即可
 */
public class minofstack {

    static int a[] = new int[100005];
    static int start=0,end=0,min=0x3fffffff;

    public void push(int node) {
        a[end++] = node;
        if(node<min)
            min = node;
    }

    public void pop() {
        end--;
        min = a[start];
        for(int i = start;i<end;i++)
            if(a[i]<min)
                min = a[i];
    }

    public int top() {
        return a[end];
    }

    public int min() {
        return min;
    }
}
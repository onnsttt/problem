package nowcoder.offer;

public class JumpFloorII {
    public static void main(String[] args) {

    }
    public int jumpFloorII(int target){
        int sum =1;
        for(int i = 0;i<target;i++)
            sum+=jumpFloorII(target-i);
        return sum;
    }
}

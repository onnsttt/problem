package nowcoder.offer;

public class Clone {
    public RandomListNode Clone(RandomListNode pHead){
       return pHead;
    }
}

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
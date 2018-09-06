package nowcoder.offer;

/**
 * 先找出这个链表的长度，然后倒数第k个点也就是前面第len-k个点。
 */
public class findKthToTail {
    public static void main(String[] args) {

    }
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode tmp = head;
        int len = 0;
        if(head==null)
            return head;
        while(tmp!=null){
            len++;
            tmp = tmp.next;
        }
        int i = 0;
        tmp = head;
        while(len-i!=k&&tmp!=null){
            i++;
            tmp = tmp.next;
        }
        return tmp;
    }
}

class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}
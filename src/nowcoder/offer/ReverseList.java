package nowcoder.offer;


/**
 * 反转链表的其实也就是用三个变量来标记，一个当前节点，一个前驱节点，以及后驱节点，然后每次把当前节点的next赋予前驱节点
 * 然后，当前节点替换到后驱节点，前驱节点变成当前节点，后驱节点变成后驱的后驱的后驱节点。
 */
public class ReverseList {
    public static void main(String[] args) {

    }
    public ListNode ReverseList(ListNode head) {
        ListNode back,front,now;
        if(head==null)
            return head;
        back = head;
        now = head.next;
        if(now==null)
            return head;
        front = now.next;
        back.next=null;
        while(front!=null&&now!=null){
            now.next = back;
            back = now;
            now = front;
            front = front.next;
        }
        now.next = back;
        return now;
    }

}

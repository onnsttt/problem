package leetcode;

public class No_2 {
    public static void main(String[] args) {
        new No_2().addTwoNumbers(new ListNode(0),new ListNode(0));
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long node1,node2;
        node1 = node2 = 0;
        while(l1!=null){
            node1*=10;
            node1+=l1.val;
            l1 = l1.next;
        }
        while (l2!=null){
            node2*=10;
            node2+=l2.val;
            l2 = l2.next;
        }
        node1+=node2;
        node1 = 18;
        ListNode ans = new ListNode((int) (node1%10));
        node1/=10;
        l1 = ans;
        while(node1!=0){
            node2 = node1%10;
            node1 = node1/10;
            l2 = new ListNode((int) node2);
            l1.next = l2;
            l1 = l1.next;
        }
        l1 = ans;
        while(l1!=null){
            System.out.println(l1.val);
            l1 = l1.next;
        }
        return ans;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
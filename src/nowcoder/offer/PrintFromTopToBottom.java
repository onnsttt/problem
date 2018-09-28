package nowcoder.offer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;


/**
 * 层次遍历，用一个队列即可实现，即BFS
 */
public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer>list = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        if(root==null)
            return list;
        queue.add(root);
        TreeNode tmp;
        while(!queue.isEmpty()){
            tmp = queue.poll();
            list.add(tmp.val);
            if(tmp.left!=null)
                queue.add(tmp.left);
            if(tmp.right!=null)
                queue.add(tmp.right);
        }
        return list;
    }
}

package nowcoder.offer;

/**
 * 递归分别左右交换
 */
public class mirror {
    public void Mirror(TreeNode root) {
        deal(root);
    }
    public void deal(TreeNode node){
        if(node==null)
            return;
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
        deal(node.left);
        deal(node.right);
    }
}

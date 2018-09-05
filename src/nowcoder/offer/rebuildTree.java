package nowcoder.offer;

public class rebuildTree {
    public static void main(String[] args) {

    }
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        return setPoint(0,0,pre.length-1,in.length-1,pre,in);
    }
    public TreeNode setPoint(int startx,int starty,int endx,int endy,int []pre,int []in){
        if(startx>endx||starty>endy)
            return null;
        TreeNode treeNode = new TreeNode(pre[startx]);
        for(int i = starty;i<=endy;i++){
            if(pre[startx]==in[i]){
                treeNode.left = setPoint(startx+1,starty,startx+i-starty,i-1,pre,in);
                treeNode.right = setPoint(i-starty+startx+1,i+1,endx,endy,pre,in);
            }
        }
        return treeNode;
    }
}


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

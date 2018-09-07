package leetcode;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class No_113 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5);
        treeNode.right = new TreeNode(4);
        treeNode.left = new TreeNode(3);
        System.out.println(new Solution().pathSum(treeNode, 9));
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {

    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(list, root, 0, new ArrayList<>(), sum);
        return list;
    }

    public static void dfs(List<List<Integer>> list, TreeNode tree, int sum, List<Integer> s, int ans) {
        if(tree==null)
            return;
        if (sum + tree.val == ans) {
            if (tree.left == null && tree.right == null) {
                s.add(tree.val);
                List<Integer> t = new ArrayList<>();
                for(int i = 0;i<s.size();i++)
                    t.add(s.get(i));
                list.add(t);
                s.remove(s.size() - 1);
                return;
            }
        }
        if (tree.left != null) {
            s.add(tree.val);
            dfs(list, tree.left, sum + tree.val, s, ans);
            s.remove(s.size() - 1);
        }
        if (tree.right != null) {
            s.add(tree.val);
            dfs(list, tree.right, sum + tree.val, s, ans);
            s.remove(s.size() - 1);
        }
        return;
    }
}
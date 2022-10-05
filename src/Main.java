import base.TreeNode;
import easy.p102_binary_tree_level_order_traversal.Solution;

public class Main {

    public static void main(String[] args) {
        new Solution().levelOrder(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))));
    }
}


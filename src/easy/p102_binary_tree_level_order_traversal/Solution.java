package easy.p102_binary_tree_level_order_traversal;

import base.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        result.add(List.of(root.val));

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Queue<TreeNode> tempQueue = new LinkedList<>();

            Queue<Integer> tempValues = new LinkedList<>();

            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();

                if (node.left != null) {
                    tempValues.add(node.left.val);
                    tempQueue.add(node.left);
                }

                if (node.right != null) {
                    tempValues.add(node.right.val);
                    tempQueue.add(node.right);
                }
            }

            queue = tempQueue;
        }

        return result;
    }
}


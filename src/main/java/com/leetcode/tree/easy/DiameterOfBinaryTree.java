package com.leetcode.tree.easy;

/**
 * 
 * @author mukesh
 * 
 *         Given the root of a binary tree, return the length of the diameter of
 *         the tree.
 * 
 *         The diameter of a binary tree is the length of the longest path
 *         between any two nodes in a tree. This path may or may not pass
 *         through the root.
 * 
 *         The length of a path between two nodes is represented by the number
 *         of edges between them.
 * 
 * 
 * 
 *         Example 1:
 * 
 * 
 *         Input: root = [1,2,3,4,5] Output: 3 Explanation: 3 is the length of
 *         the path [4,2,1,3] or [5,2,1,3]. Example 2:
 * 
 *         Input: root = [1,2] Output: 1
 * 
 * 
 *         Constraints:
 * 
 *         The number of nodes in the tree is in the range [1, 104]. -100 <=
 *         Node.val <= 100
 *
 */
public class DiameterOfBinaryTree {

	int max = 0;

	public static void main(String[] args) {
		DiameterOfBinaryTree ts = new DiameterOfBinaryTree();
		TreeNode n = new TreeNode();
		TreeNode t = new TreeNode(1);
		TreeNode t1 = new TreeNode(2);
		TreeNode t2 = new TreeNode(3);
		TreeNode t3 = new TreeNode(4);
		TreeNode t4 = new TreeNode(5);
		t.left = t1;
		t.right = t2;
		t1.left = t3;
		t1.right = t4;

		int diameter = ts.diameter(t);
		System.out.println("Diameter of Tree Node ::: " + diameter);
	}

	public int diameterOfBinaryTree(TreeNode root) {
		diameter(root);
		return max - 1;
	}

	public int diameter(TreeNode root) {
		if (root == null)
			return 0;
		int left = diameter(root.left) + 1;
		int right = diameter(root.right) + 1;
		max = Math.max(left + right - 1, max);
		return Math.max(left, right);
	}

}

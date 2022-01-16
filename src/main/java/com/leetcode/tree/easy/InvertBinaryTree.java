package com.leetcode.tree.easy;

/**
 * 
 * @author mukesh
 * 
 *         Given the root of a binary tree, invert the tree, and return its
 *         root.
 * 
 * 
 * 
 *         Example 1:
 * 
 * 
 *         Input: root = [4,2,7,1,3,6,9] Output: [4,7,2,9,6,3,1] Example 2:
 * 
 * 
 *         Input: root = [2,1,3] Output: [2,3,1] Example 3:
 * 
 *         Input: root = [] Output: []
 * 
 * 
 *         Constraints:
 * 
 *         The number of nodes in the tree is in the range [0, 100]. -100 <=
 *         Node.val <= 100
 *
 */

public class InvertBinaryTree {

	public static void main(String[] args) {
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

		n.printNode(t);

		System.out.println("\n");
		InvertBinaryTree ts = new InvertBinaryTree();
		TreeNode node = ts.invertTree(t);
		n.printNode(node);
	}

	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}
		TreeNode left = root.left;
		root.left = invertTree(root.right);
		root.right = invertTree(left);
		return root;

	}

	public TreeNode invertTree1(TreeNode root) {
		if (root == null) {
			return null;
		}
		// preorder
		// root swap left and right child node
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		// keep invert
		invertTree(root.left);
		invertTree(root.right);

		return root;
	}

}

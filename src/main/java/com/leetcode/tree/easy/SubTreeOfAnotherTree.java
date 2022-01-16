package com.leetcode.tree.easy;

/**
 * 
 * @author mukesh
 * 
 *         Given the roots of two binary trees root and subRoot, return true if
 *         there is a subtree of root with the same structure and node values of
 *         subRoot and false otherwise.
 * 
 *         A subtree of a binary tree tree is a tree that consists of a node in
 *         tree and all of this node's descendants. The tree tree could also be
 *         considered as a subtree of itself.
 * 
 * 
 * 
 *         Example 1:
 * 
 * 
 *         Input: root = [3,4,5,1,2], subRoot = [4,1,2] Output: true Example 2:
 * 
 * 
 *         Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
 *         Output: false
 * 
 * 
 *         Constraints:
 * 
 *         The number of nodes in the root tree is in the range [1, 2000]. The
 *         number of nodes in the subRoot tree is in the range [1, 1000]. -104
 *         <= root.val <= 104 -104 <= subRoot.val <= 104
 *
 */
public class SubTreeOfAnotherTree {

	public static void main(String[] args) {
		SubTreeOfAnotherTree st = new SubTreeOfAnotherTree();
		TreeNode t = new TreeNode();
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(4);
		TreeNode t3 = new TreeNode(5);
		TreeNode t4 = new TreeNode(1);
		TreeNode t5 = new TreeNode(2);

		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;

		TreeNode sub1 = new TreeNode(4);
		TreeNode sub2 = new TreeNode(1);
		TreeNode sub3 = new TreeNode(2);

		sub1.left = sub2;
		sub1.right = sub3;

		boolean isSubtree = st.isSubtree(t1, sub1);
		System.out.println("IsSubtree of another tree ::::" + isSubtree);

	}

	public boolean isSubtree(TreeNode root, TreeNode subRoot) {

		if (root == null) {
			return false;
		}
		if (root.val == subRoot.val) {
			if (isSame(root, subRoot)) {
				return true;
			}
		}
		return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
	}

	public boolean isSame(TreeNode root, TreeNode subRoot) {
		if (root == null && subRoot == null)
			return true;
		if (root == null || subRoot == null)
			return false;

		if (!(root.val == subRoot.val))
			return false;

		return isSame(root.left, subRoot.left) && isSame(root.right, subRoot.right);
	}

}

package com.leetcode.tree.easy;

/**
 * 
 * @author mukesh
 *
 *
 *         Given the root node of a binary search tree and two integers low and
 *         high, return the sum of values of all nodes with a value in the
 *         inclusive range [low, high].
 * 
 * 
 * 
 *         Example 1:
 * 
 * 
 *         Input: root = [10,5,15,3,7,null,18], low = 7, high = 15 Output: 32
 *         Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 +
 *         15 = 32. Example 2:
 * 
 * 
 *         Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
 *         Output: 23 Explanation: Nodes 6, 7, and 10 are in the range [6, 10].
 *         6 + 7 + 10 = 23.
 * 
 * 
 *         Constraints:
 * 
 *         The number of nodes in the tree is in the range [1, 2 * 104]. 1 <=
 *         Node.val <= 105 1 <= low <= high <= 105 All Node.val are unique.
 */
public class RangeSumOFBST {

	public static void main(String[] args) {
		RangeSumOFBST rs = new RangeSumOFBST();
		TreeNode t = new TreeNode(10);
		TreeNode t1 = new TreeNode(5);
		TreeNode t2 = new TreeNode(15);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(7);
		TreeNode t5 = new TreeNode(13);
		TreeNode t6 = new TreeNode(18);
		TreeNode t7 = new TreeNode(6);

		t.left = t1;
		t.right = t2;
		t1.left = t3;
		t1.right = t4;
		t2.right = t6;

		int p = rs.rangeSumBST(t, 7, 15);
		System.out.println("Range sum of the tree ::::: " + p);

	}

	public int rangeSumBST(TreeNode root, int low, int high) {

		int sum = 0;

		if (root != null) {
			if (root.val >= low && root.val <= high) {
				sum += root.val;
			}
			if (root.val > low) {
				sum += rangeSumBST(root.left, low, high);
			}
			if (root.val < high) {
				sum += rangeSumBST(root.right, low, high);
			}
		}

		return sum;
	}

}

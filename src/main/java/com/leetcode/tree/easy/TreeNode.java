package com.leetcode.tree.easy;

/**
 * Definition for a binary tree node.
 */
public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	public void printNode(TreeNode root) {
		if (root == null) {
			return;
		}
		System.out.println("Root ---> " + root.val);
		if (root.left != null) {
			System.out.println("Left ----> " + root.left.val);

		}
		if (root.right != null) {
			System.out.println("Right ---->" + root.right.val);
		}

		printNode(root.left);
		printNode(root.right);

	}

	public TreeNode construct(int[] arr) {
		if (arr.length == 0) {
			return null;
		}
		TreeNode n = new TreeNode(arr[0]);
		TreeNode temp = null;
		for (int i = 1; i < arr.length; i++) {

			TreeNode left = new TreeNode(arr[i]);
			TreeNode right = null;
			if (i + 1 < arr.length) {
				right = new TreeNode(arr[i + 1]);
			}

		}

		return n;
	}
}

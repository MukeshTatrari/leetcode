package com.leetcode.linkedlist.easy;

public class Node {
	Integer val;
	Node next;

	public Node(int val) {
		this.val = val;
		this.next = null;
	}

	public Node() {
		// TODO Auto-generated constructor stub
	}

	public void printNode(Node node) {

		while (node.next != null) {
			System.out.println("Node ::---> " + node.val);
			System.out.println("Next ::----> " + node.next.val);
			node = node.next;
		}
	}

	public Node createLinkedList(int arr[]) {
		if (arr != null) {
			Node head = new Node(arr[0]);
			for (int i = 1; i < arr.length; i++) {
				insertNodeAtEnd(head, arr[i]);
			}

			return head;
		}
		return null;

	}

	public void insertNodeAtEnd(Node node, int value) {
		Node n = new Node(value);
		while (node.next != null) {
			node = node.next;
		}
		node.next = n;
	}

}

package com.leetcode.linkedlist.easy;

/**
 * 
 * @author mukesh
 * 
 *         Given the head of a singly linked list, reverse the list, and return
 *         the reversed list.
 * 
 * 
 * 
 *         Example 1:
 * 
 * 
 *         Input: head = [1,2,3,4,5] Output: [5,4,3,2,1] Example 2:
 * 
 * 
 *         Input: head = [1,2] Output: [2,1] Example 3:
 * 
 *         Input: head = [] Output: []
 * 
 * 
 *         Constraints:
 * 
 *         The number of nodes in the list is the range [0, 5000]. -5000 <=
 *         Node.val <= 5000
 * 
 * 
 *         Follow up: A linked list can be reversed either iteratively or
 *         recursively. Could you implement both?
 *
 */
public class ReverseLinkedList {

	public static void main(String[] args) {
		Node n = new Node();
		Node head = n.createLinkedList(new int[] { 4, 5, 1, 9 });
		n.printNode(head);

		System.out.println(":::::::::::::::::: \n");
		ReverseLinkedList ls = new ReverseLinkedList();
		Node newHead = ls.reverseList(head);
		n.printNode(newHead);

	}

	public Node reverseList(Node head) {
		Node current = head;
		Node prevNode = null;
		Node nextNode = null;
		while (current != null) {
			nextNode = current.next;
			current.next = prevNode;
			prevNode = current;
			current = nextNode;

		}

		return prevNode;

	}
}

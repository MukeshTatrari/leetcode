package com.leetcode.linkedlist.easy;

/**
 * 
 * @author mukesh
 * 
 *         You are given the heads of two sorted linked lists list1 and list2.
 * 
 *         Merge the two lists in a one sorted list. The list should be made by
 *         splicing together the nodes of the first two lists.
 * 
 *         Return the head of the merged linked list.
 * 
 * 
 * 
 *         Example 1:
 * 
 * 
 *         Input: list1 = [1,2,4], list2 = [1,3,4] Output: [1,1,2,3,4,4] Example
 *         2:
 * 
 *         Input: list1 = [], list2 = [] Output: [] Example 3:
 * 
 *         Input: list1 = [], list2 = [0] Output: [0]
 * 
 * 
 *         Constraints:
 * 
 *         The number of nodes in both lists is in the range [0, 50]. -100 <=
 *         Node.val <= 100 Both list1 and list2 are sorted in non-decreasing
 *         order.
 *
 */
public class MergeTwoLinkedList {
	public static void main(String[] args) {
		Node node = new Node();
		Node head = node.createLinkedList(new int[] { 1, 2, 4 });
		node.printNode(head);

		System.out.println(" \n");
		Node head1 = node.createLinkedList(new int[] { 1, 3, 4 });
		node.printNode(head1);

		System.out.println(" \n");
		
		MergeTwoLinkedList ml = new MergeTwoLinkedList();
		Node n = ml.mergeTwoLists_1(head, head1);
		node.printNode(n);

	}

	public Node mergeTwoLists_1(Node list1, Node list2) {
		if (list1 == null)
			return list2;
		if (list2 == null)
			return list1;

		Node list = new Node();

		if (list1.val <= list2.val) {
			list = new Node(list1.val);
			list.next = mergeTwoLists_1(list1.next, list2);
		} else {
			list = new Node(list2.val);
			list.next = mergeTwoLists_1(list1, list2.next);
		}
		return list;
	}

	public Node mergeTwoLists(Node list1, Node list2) {
		if (list1 == null && list2 == null)
			return null;
		Node head = new Node();
		Node h = head;
		while (list1 != null && list2 != null) {
			if (list1.val <= list2.val) {
				head.val = list1.val;
				list1 = list1.next;
			} else {
				head.val = list2.val;
				list2 = list2.next;
			}
			head.next = new Node();
			head = head.next;
		}

		// Check if the first list is still not null
		while (list1 != null) {

			head.val = list1.val;

			if (list1.next != null) {
				head.next = new Node();
				head = head.next;
				list1 = list1.next;
			} else
				break;

		}
		// Check if the second list is still not null
		while (list2 != null) {

			head.val = list2.val;

			if (list2.next != null) {
				head.next = new Node();
				head = head.next;
				list2 = list2.next;
			} else
				break;
		}

		return h;
	}

}

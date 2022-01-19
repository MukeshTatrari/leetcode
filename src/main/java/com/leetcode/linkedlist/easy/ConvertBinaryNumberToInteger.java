package com.leetcode.linkedlist.easy;

/**
 * 
 * @author mukesh
 * 
 *         Given head which is a reference node to a singly-linked list. The
 *         value of each node in the linked list is either 0 or 1. The linked
 *         list holds the binary representation of a number.
 * 
 *         Return the decimal value of the number in the linked list.
 * 
 * 
 * 
 *         Example 1:
 * 
 * 
 *         Input: head = [1,0,1] Output: 5 Explanation: (101) in base 2 = (5) in
 *         base 10 Example 2:
 * 
 *         Input: head = [0] Output: 0
 * 
 * 
 *         Constraints:
 * 
 *         The Linked List is not empty. Number of nodes will not exceed 30.
 *         Each node's value is either 0 or 1.
 *
 */
public class ConvertBinaryNumberToInteger {

	public static void main(String[] args) {
		ConvertBinaryNumberToInteger cb = new ConvertBinaryNumberToInteger();
		Node node = new Node();
		Node head = node.createLinkedList(new int[] { 1,0,1,1, 0, 1 });
		node.printNode(head);
		int value = cb.getDecimalValue(head);
		System.out.println("Decimal Equivalent of Binary :::: " + value);

	}

	public int getDecimalValue(Node head) {

		StringBuilder s = new StringBuilder();
		while (head != null) {
			int val = head.val;
			s.append(val);
			head = head.next;
		}
		return Integer.parseInt(s.toString(), 2);

	}
}

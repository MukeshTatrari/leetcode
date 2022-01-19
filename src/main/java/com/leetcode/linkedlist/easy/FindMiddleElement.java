package com.leetcode.linkedlist.easy;

/**
 * 
 * @author mukesh
 * 
 *         Given the head of a singly linked list, return the middle node of the
 *         linked list.
 * 
 *         If there are two middle nodes, return the second middle node.
 * 
 * 
 * 
 *         Example 1:
 * 
 * 
 *         Input: head = [1,2,3,4,5] Output: [3,4,5] Explanation: The middle
 *         node of the list is node 3. Example 2:
 * 
 * 
 *         Input: head = [1,2,3,4,5,6] Output: [4,5,6] Explanation: Since the
 *         list has two middle nodes with values 3 and 4, we return the second
 *         one.
 * 
 * 
 *         Constraints:
 * 
 *         The number of nodes in the list is in the range [1, 100]. 1 <=
 *         Node.val <= 100
 *
 */
public class FindMiddleElement {

	public static void main(String[] args) {
		FindMiddleElement middle = new FindMiddleElement();
		Node node = new Node();
		Node head = node.createLinkedList(new int[] { 1,2,3,4,5,6 });
		Node value = middle.middleNode(head);
		System.out.println("Middle Element Of the Linked List is :::: " + value.val);
	}

	public Node middleNode(Node head) {
		Node fastPointer = head;
		Node slowPointer = head;
		while (fastPointer != null && fastPointer.next!= null) {
			fastPointer = fastPointer.next.next;
			slowPointer = slowPointer.next;
		}

		return slowPointer;

	}
}

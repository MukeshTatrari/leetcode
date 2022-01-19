package com.leetcode.linkedlist.easy;

/**
 * 
 * @author mukesh
 * 
 *         Design a HashSet without using any built-in hash table libraries.
 * 
 *         Implement MyHashSet class:
 * 
 *         void add(key) Inserts the value key into the HashSet. bool
 *         contains(key) Returns whether the value key exists in the HashSet or
 *         not. void remove(key) Removes the value key in the HashSet. If key
 *         does not exist in the HashSet, do nothing.
 * 
 * 
 *         Input ["MyHashSet", "add", "add", "contains", "contains", "add",
 *         "contains", "remove", "contains"] [[], [1], [2], [1], [3], [2], [2],
 *         [2], [2]] Output [null, null, null, true, false, null, true, null,
 *         false]
 * 
 *         Explanation MyHashSet myHashSet = new MyHashSet(); myHashSet.add(1);
 *         // set = [1] myHashSet.add(2); // set = [1, 2] myHashSet.contains(1);
 *         // return True myHashSet.contains(3); // return False, (not found)
 *         myHashSet.add(2); // set = [1, 2] myHashSet.contains(2); // return
 *         True myHashSet.remove(2); // set = [1] myHashSet.contains(2); //
 *         return False, (already removed)
 *
 */
public class MyHashSet {

	public static void main(String[] args) {
		MyHashSet set = new MyHashSet();
		set.add(1);
		set.add(2);
		System.out.println("set ::: " + set.contains(2));
	}

	Node head = null;

	public MyHashSet() {

	}

	public void add(int key) {
		if (head == null) {
			head = new Node(key);
		} else {
			if (!contains(key)) {
				addNewNode(key);
			}
		}

	}

	public void addNewNode(int key) {
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = new Node(key);
	}

	public void remove(int key) {

		Node temp = head;
		while (temp.next != null) {
			if (temp.val == key) {
				temp.val = temp.next.val;
				temp.next = temp.next.next;
			}
		}

		// check if last node has the same value // deletion at end
		if (head.val == key) {
			head.val = null;
		}

	}

	public boolean contains(int key) {
		Node temp = head;
		while (temp != null) {
			if (temp.val == key) {
				return true;

			}
			temp = temp.next;
		}
		if (temp.val == key) {
			return true;
		}

		return false;

	}

}

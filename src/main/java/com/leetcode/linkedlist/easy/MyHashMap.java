package com.leetcode.linkedlist.easy;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 
 * @author mukesh
 * 
 * Design a HashMap without using any built-in hash table libraries.

		Implement the MyHashMap class:
		
		MyHashMap() initializes the object with an empty map.
		void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map, update the corresponding value.
		int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.
		void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.
		 
		
		Example 1:
		
		Input
		["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
		[[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
		Output
		[null, null, null, 1, -1, null, 1, null, -1]
		
		Explanation
		MyHashMap myHashMap = new MyHashMap();
		myHashMap.put(1, 1); // The map is now [[1,1]]
		myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
		myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
		myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
		myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
		myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
		myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
		myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
		 
 *
 */
public class MyHashMap {

	private class Tuple {
		public final int key;
		public final int value;

		public Tuple(int key, int value) {
			this.key = key;
			this.value = value;
		}
	}

	Double loadFactor = 0.75;
	int currSize = 0;
	int capacity = 16;
	LinkedList<Tuple>[] buckets;

	public MyHashMap() {
		buckets = new LinkedList[capacity];
	}

	private int hash(int key) {
		return key % capacity;
	}

	public void put(int key, int value) {
		// re-hash
		if (loadFactor * currSize == capacity) {
			currSize = 0;
			capacity *= 2;

			LinkedList<Tuple>[] oldBuckets = buckets;
			buckets = new LinkedList[capacity];
			for (int i = 0; i < oldBuckets.length; i++) {
				LinkedList<Tuple> list = oldBuckets[i];
				if (list != null) {
					for (Tuple tuple : list) {
						this.put(tuple.key, tuple.value);
					}
				}
			}
		}

		int hashCode = this.hash(key);
		if (this.get(key) == -1) {
			if (buckets[hashCode] == null) {
				buckets[hashCode] = new LinkedList<>();
			}
			buckets[hashCode].add(new Tuple(key, value));
			currSize++;
		} else {
			this.remove(key);
			buckets[hashCode].add(new Tuple(key, value));
		}
	}

	public int get(int key) {
		int hashCode = this.hash(key);
		LinkedList<Tuple> linkedList = buckets[hashCode];
		if (linkedList != null) {
			Iterator<Tuple> itr = linkedList.iterator();
			while (itr.hasNext()) {
				Tuple nextElement = itr.next();
				if (nextElement.key == key) {
					return nextElement.value;
				}
			}
		}
		return -1;
	}

	public void remove(int key) {
		int hashCode = this.hash(key);
		LinkedList<Tuple> linkedList = buckets[hashCode];
		if (linkedList == null) {
			return;
		}
		Iterator<Tuple> itr = linkedList.iterator();
		while (itr.hasNext()) {
			Tuple nextElement = itr.next();
			if (nextElement.key == key) {
				itr.remove();
			}
		}
	}

}

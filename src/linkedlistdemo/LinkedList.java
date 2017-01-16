/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedlistdemo;

/**
 * LinkedList class.
 */
public class LinkedList {
	private Node head;
		
	
	/**
	 * constructor
	 * pre: none
	 * post: A linked list with a null item has been created.
	 */
	public LinkedList() {
		head = null;
	}

	
	/** 
	 * Adds a node to the linked list.
	 * pre: none
	 * post: The linked list has a new node at the head.
	 */
	public void addAtFront(String str) {
		Node newNode = new Node(str);
		newNode.setNext(head);
		head = newNode;
	}


	/** 
	 * Deletes a node in the linked list.
	 * pre: none
	 * post: The first node containing str has been deleted.
	 */
	public void remove(String str) {
		Node current = head;
		Node previous = head;

		if (current.getData().equals(str)) {
			head = current.getNext();
		} else {
			while (current.getNext() != null) {
				previous = current;
				current = current.getNext();
				if (current.getData().equals(str)) {
					previous.setNext(current.getNext());
				}
			}
		}
	}
	
	
	/** 
	 * Creates a string that lists the nodes of the linked list.
	 * pre: none
	 * post: The linked list has been written to a string.
	 */
	public String toString() {
		Node current = head;
		String listString;
		
		if (current != null) {
			listString = current.getData() + "\n";
			while (current.getNext() != null) {
				current = current.getNext();
				listString += current.getData() + "\n";
			}
			return(listString);
		} else {
			return("There are no items in list.");
		}
	}
	
	
	private class Node {
		private String data;
		private Node next;
		
	
		/**
	 	* constructor
	 	* pre: none
	 	* post: A node has been created.
	 	*/
		public Node(String newData) {
			data = newData;
			next = null;
		}
		
		
		/**
	 	* The node pointed to by next is returned
	 	* pre: none
	 	* post: A node has been returned.
	 	*/
		public Node getNext() {
			return(next);
		}
	
	
		/**
	 	* The node pointed to by next is changed to newNode
	 	* pre: none
	 	* post: next points to newNode.
	 	*/
		public void setNext(Node newNode) {
			next = newNode;
		}
		

		/**
	 	* The node pointed to by next is returned
	 	* pre: none
	 	* post: A node has been returned.
	 	*/
		public String getData() {
			return(data);
		}
	}
}

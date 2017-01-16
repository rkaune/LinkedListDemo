/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package linkedlistdemo;

/**
 *
 * @author rkaune
 */
 /**
  * The linked list data structure is tested.
  */
 public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.addAtFront("Sachar");
		list.addAtFront("Osborne");
		list.addAtFront("Suess");
		System.out.println(list);
		
		list.remove("Suess");
		list.remove("Sachar");
		list.remove("Osborne");
		System.out.println(list);
	}
}

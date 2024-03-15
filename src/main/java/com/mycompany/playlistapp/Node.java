/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.playlistapp;

/**
 *
 * @author cmuntean
 */
public class Node {
      private String element;
      private Node next;

      public Node(String e, Node n){
		element = e;
		next = n;
	}

	public Node getNext() {
		return next;
	}

      public void setNext(Node n) {
		next = n;
	}

	public String getElement() {
            return element;
      }

	public void setElement(String e) {
		element = e;
      }

      public String toString() {
           	return element.toString();
      }

    
}

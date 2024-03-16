/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.playlistapp;

/**
 *
 * @author cmuntean
 */
public interface LinearListInterface {
        public boolean isEmpty();
	public int size();
	public Node get(int index);
	public void remove(int index);
	public void add(int index, String theElement);
        public void add(String element);
	public void printList();   
}

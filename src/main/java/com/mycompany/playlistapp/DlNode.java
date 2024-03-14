/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.playlistapp;

/**
 *
 * @author Hamilton1
 */
public class DlNode {
        private String element;
	private DlNode next;
	private DlNode prev;

    public DlNode(String inElement, DlNode inNext, DlNode inPrevious){
	element = inElement;
	next = inNext;
        prev = inPrevious;
    }
    public DlNode getNext() {
	return next;
    }
    public void setNext(DlNode inNext) {
	next = inNext;
    }
    public DlNode getPrev() {
	return prev;
    }
    public void setPrev(DlNode inPrevious) {
	prev = inPrevious;
    }
    public String getElement() {
        return element;
    }

    public void setElement(String inElement) {
	element = inElement;
    }

}

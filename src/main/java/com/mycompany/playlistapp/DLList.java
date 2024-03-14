/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.playlistapp;

/**
 *
 * @author Hamilton1
 */
public class DLList implements LinearListInterface {

    private DlNode head;
    private DlNode last;
    private DlNode currNode;
    private int iSize;

    DLList() {
        head = null;
        last = null;
        iSize = 0;
        currNode = head;
    }

    public boolean isEmpty() {
        return (iSize == 0);
    }

    public int size() {
        return iSize;
    }

    public void add(int inIndex, String inElement) {
        DlNode newNode = new DlNode(inElement, null, null);
        if (iSize == 0) {
            //insert a new Node when the list is empty
            // write your code here
            head = newNode;
            last = newNode;
        } else {
            if (inIndex == 1) {
                // Insert a new Node at the head position
                // write your code here
                newNode.setNext(head);
                head.setPrev(newNode);
                head = newNode;
            } else if (inIndex == (iSize + 1)) {
                // Insert a new Node at the last position
                // write your code here
                newNode.setPrev(last);
                last.setNext(newNode);
                last = newNode;
            } else {
                // Insert a new node in the middle
                // write your code here
                setCurrent(inIndex);
                newNode.setNext(currNode);
                DlNode prev = currNode.getPrev();
                newNode.setPrev(prev);
                prev.setNext(newNode);
                currNode.setPrev(newNode);
            }
        }
        //don't forget to adjust the size of the DLL
        iSize++;
    }

    public void remove(int iIndex) {
        if (iSize > 0) {
            // If the first item (head) is to be removed, then head becomes the next node after currently first node
            if (iIndex == 1) {
                head = head.getNext();
                head.setPrev(null);
            } // If the item is the last node, then last becomes the previous node in relation to the currently last node
            else if (iIndex == iSize) {
                last = last.getPrev();
                last.setNext(null);
            } else {
                // If the item is not the last or the first node, then the element to be removed is in the middle
                setCurrent(iIndex);
                DlNode prev = currNode.getPrev();
                DlNode next = currNode.getNext();
                prev.setNext(next);
                next.setPrev(prev);
            }
            currNode = null;
            iSize--;
        } else {
            System.out.println("The list is empty. No Nodes to be removed");
        }
    }

    private void setCurrent(int inIndex) {
        currNode = head;
        for (int iCount = 1; iCount < inIndex; iCount++) {
            currNode = currNode.getNext();
        }
    }

    public DlNode get(int iIndex) {
        setCurrent(iIndex);
        return currNode;
    }
    //************************************************************/
    // Provide a printlist() method which will print out       */
    // the contents of the double linked list, starting with he first node                                */
    //************************************************************/

    public String printList() {
        String allItems = new String();
        for (DlNode aNode = head; aNode != null; aNode = aNode.getNext()) {
            String oneItem = (aNode.getElement()).toString();
            allItems = allItems + oneItem + ", ";
        }
        return allItems;
    }
    //************************************************************/
    // Provide a printListBwd() method which will print out
    // the information from the nodes starting from the last node
    //up to the first node
    //************************************************************/

    public String printListBwd() {
        String allItems = new String();
        for (DlNode aNode = last; aNode != null; aNode = aNode.getPrev()) {
            String oneItem = (aNode.getElement()).toString();
            allItems = allItems + oneItem + ", ";
        }
        return allItems;
    }
}

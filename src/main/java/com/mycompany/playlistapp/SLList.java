/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.playlistapp;

import java.util.ArrayList;

/**
 *
 * @author cmuntean
 */
//NOTE:  we count elements from position 1. First node from the list is on position 1.

public class SLList implements LinearListInterface
{
    private Node head;
    private int size;
    private Node curr;
    private Node prev;

    public SLList()
    {
      head = null;
      size = 0;
      curr = null;
      prev = null;
    }

    public boolean isEmpty()
    {
	 if (size ==0)
		return true;
	else
		return false;

    }

    public int size()
    {
	 return size;
    }

   // assume the index is in the correct range
   public void add(int index, String item)
   {
       // special case of adding at the head of the list ( on the first position)
       if (index == 1)
      {
     	    Node newNode = new Node(item,head);
            head = newNode;
      }
      else
      {
            setCurrent(index);
            Node newNode = new Node(item, curr);
            prev.setNext(newNode);
      }
      // as  a new one was added the size counter must be increased by 1
      size=size+1;
   }

   //add an elemenst at the end of the list (on the last position)
   public void add(String element)
   {
     Node newNode = new Node(element,null);
     if (head == null ) {
       	head = newNode;
        }
     else {
         setCurrent(size);
         curr.setNext(newNode);
     }
      size = size+1;
  }

    public Node get(int index) {
      setCurrent(index);
      return curr;
  }

  public void remove(int index){
  // special case for removing the head of the list / first node.
	if (index == 1){
            head = head.getNext();
	}
      else{
           // find the previous and current nodes
       	   setCurrent(index);
           prev.setNext(curr.getNext());
	}
     // as one node was removed the size counter must be decreased by 1
     size = size -1; 
  }

  private void setCurrent(int index){
      // sets curr to the node at position specified by index
      // sets prev to the node previous to curr
      int k;
      prev = null;
      curr = head;
      for (k  = 1; k < index; k++){
            prev = curr;
            curr = curr.getNext();
      }
   }

    // printlist() method prints out the content of the list                                  
    public void printList()
    {
        Node aNode = head;
        while (aNode != null) {
            System.out.println(aNode.toString());
            aNode = aNode.getNext();
        }
    }
    
    public int getIndexBySongName(String name)
    {
        Node aNode = head;
        int index = 1;
        while (aNode != null) {
            System.out.println(aNode.toString());
            if(aNode.toString().equals(name)){
                return index;
            }
            
            aNode = aNode.getNext();
            
            index++;
        }
        
        return -1;
    }
    
    public ArrayList<String> getSongsByName(String name)
    {
        ArrayList<String> songs = new ArrayList<String>();
        
        Node aNode = head;
        while (aNode != null) {
            System.out.println(aNode.toString());
            
            if(aNode.toString().contains(name)){
                songs.add(aNode.toString());
            }
            
            
            aNode = aNode.getNext();
        }
        
        return songs;
    }
}


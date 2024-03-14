/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.playlistapp;

/**
 *
 * @author Hamilton1
 */
public interface LinearListInterface {

    public boolean isEmpty();

    public int size();

    public DlNode get(int iIndex);

    public void remove(int iIndex);

    public void add(int iIndex, String element);

    public String printList();

    public String printListBwd();
}

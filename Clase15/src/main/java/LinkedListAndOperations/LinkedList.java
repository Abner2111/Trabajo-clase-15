/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListAndOperations;

/**
 *
 * @author abner
 */
public class LinkedList {
    private Node head;
    private int size;
    
    public LinkedList(){
        this.head = null;
        this.size = 0;
    }
    
    public boolean isEmpty(){
        return this.head == null;
    }
    
    public int size(){
        return this.size;
    }
}

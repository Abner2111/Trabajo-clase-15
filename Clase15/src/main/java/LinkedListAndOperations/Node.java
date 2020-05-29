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
public class Node {
    private Object data;
    private Node next;
    
    public Node(Object data){
        this.next = null;
        this.data = data;
    }
    
    public void setData(Object data) {
        this.data = data;
    }
    
    public Node getNext() {
        return next.next;
    }
    
    public void setNext(Node node) {
        this.next = node;
    }
}

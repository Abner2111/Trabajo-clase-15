/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LikedListAndOperations;

/**
 *
 * @author abner
 */
public class Node {
    private float data;
    private Node next;
    
    public Node(float data){
        this.next = null;
        this.data = data;
    }
    
    public void setData(float data) {
        this.data = data;
    }
    public float getData(){
        return this.data;
    }
    public Node getNext() {
        return next.next;
    }
    
    public void setNext(Node node) {
        this.next = node;
    }
}

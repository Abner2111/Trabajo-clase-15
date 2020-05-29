/*
* 1. Eliminar	los	nodos	de	la	lista	donde	el	valor	almacenado	en	el	nodo	sea	superior	al	promedio de	los	valores	de	todos	los	nodos	de	la	lista.
* 2. Devolver	 el	 resultado de	 la	 suma	 de	 los	 valores	 de	 los	 nodos	 en	 posiciones	 pares	 y	 la	multiplicación	de	los	valores	de	los	nodos	en	posiciones	impares.
* 3. Cada	dos	nodos	insertar	un	nodo	con	el	resultado	de la	suma	de	estos	dos	nodos	anteriores.
* 4. Devolver	el	nodo	con	mayor	valor	y	el	nodo	con	menor	valor	de	una	lista.
 */
package LinkedListAndOperations;

/**
 *
 * @author Abner Arroyo y Marco Picado
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
    
    public float average(){
        Node current = this.head;
        float average = 0;
        
        while (current!=null){
            average += current.getData();
            
            current = current.getNext();
        }
        
        return average;
    }
    
    public Node deleteGreaterThanAverage(){
        float average = average();
        
        Node curr = this.head;
        Node prev = this.head;
        
        while (curr != null){
            if (curr.getData() > average){
                if (curr==this.head){
                    this.head = head.getNext();
                } else{
                    prev.setNext(curr.getNext());
                }
            } else {
                prev = curr;
                curr = curr.getNext();
            }
        }
        return null;
    }
    
    public float[] sumaParmultImpar(){
        float pares = 0;
        float impares = 1;
        float[] result = new float[2];
        Node curr = this.head;
        
        boolean par = true;
        
        while (curr != null){
            if (par == true){
                pares += curr.getData();
            } else {
                impares *= curr.getData();
            }
            curr = curr.getNext();
            par = !par;
        }
        result[0] = pares;
        result[1] = impares;
        
        return result;
        
    }
}

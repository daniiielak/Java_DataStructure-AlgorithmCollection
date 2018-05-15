
package treasurehunt_sll;

/**
 * File: Node.java
 * @author Daniela Kepper
 * Date: 25.02.2018
 */

public class Node {
    
    private Object element;
    private Node next;
    
    //Constructor
    public Node(Object element, Node next) {
        this.element = element;
        this.next = next; 
    }
    
    //Setters
    public void setElement(Object element) {
        this.element = element; 
    }
    
    public void setNext(Node next) {
        this.next = next; 
    }
     
    //Getters
    public Object getElement(){
        return element;
    }
    
    public Node getNext(){
        return next; 
    }
    
    // DNC - class closing tag
}

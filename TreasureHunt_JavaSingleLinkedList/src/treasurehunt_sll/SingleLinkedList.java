
package treasurehunt_sll;

/**
 * File: SingleLinkedList.java
 * @author Daniela Kepper
 * Date: 25.02.2018
 */

public class SingleLinkedList implements SLL_Interface {
    
    //member variables
    private Node head; 
    private Node current;
    private Node previous;
    private int size;
    
    //Constructor
    public SingleLinkedList(){
        head = null; 
        current = null;
        previous = null;
        size = 0; 
    }
    
    //isEmpty() method with return type boolean
    public boolean isEmpty(){
        if (size == 0) {
            return true;
        }
        else {
            return false; 
        }
    } 
    
    //size() method with return type int
    public int size(){
        return size;
    }
    
    //add() method for within the SLL
    public void add(int index, Object item) {
        //add at the header
        if (index == 1) {
          Node newNode = new Node(item, head);
          head = newNode;
        } 
            
        //add at the end
        else if (index == size) {
            if (head == null) {
                Node newNode = new Node(item, head);
                head = newNode;
            }
            else {
            setCurrent(size);   
            Node newNode = new Node(item, null);
            current.setNext(newNode);
            } 
        }
        
       //add in the middle
        else {
            setCurrent(index);
            Node newNode = new Node (item, current);
            previous.setNext(newNode);
        }
        size++;
    }
    
    //remove() method to remove List items
    public void remove(int index) {
        //if removing the head node
        if (index == 1){
            head = head.getNext();
        }
        
        //if removing from any other position
        else {
            setCurrent(index);
            previous.setNext(current.getNext());
        }
        size--; 
    }
    
    //setCurrent() method
    public void setCurrent(int index){
        previous = null;
        current = head;
        for (int i = 1; i < index; i++) {
            previous = current; 
            current = current.getNext();
        }
    }
    
     //get() method to retrieve certain item from the list
    public Object get(int index){
        setCurrent(index);
        return current; 
    }
    
    // printCurent() method
    public void printCurrent(){
        System.out.println(head.getElement().toString());
    }
    
    //printList() method to print all items in the SLL
    public void printList() {
        Node newNode = head;
        for (int i = 1; i < size; i++) {
            System.out.println(newNode.getElement().toString());
            newNode = newNode.getNext();
        }
    } 
    // DNC - class closing tag
}

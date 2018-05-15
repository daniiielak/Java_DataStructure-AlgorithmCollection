/**
 * File: DLList.java
 * @author daniela kepper
 * Date: 13.05.2018
 */

package musicplayer_javadll;

public class DLList implements DLLInterface {
    
    // member variables
    private DLLNode head;
    private DLLNode last;
    private DLLNode current;
    private int size;
    
    //constructor
    public DLList(){
        head = null;
        last = null;
        current = head; 
        size = 0; 
    }
    
    // methods
    public boolean isEmpty(){
        if (size==0){
            return true;
        }
        else{
           return false;
        }
    }
    
    public int size(){
        return size;
    }
    
   public void setCurrent(int index){
       current = head; 
       for (int i = 1; i < index; i++){
           current = current.getNext();
       }
   } 
   
   public void add(int index, Object song){
       // if the list is empty so far
       if (size == 0){
           DLLNode newNode = new DLLNode(null, song, null);
           current = newNode;
           head = current;
           last = current;
           size++;
       }

       // all the other cases
       else{ 
           
            // if inserted at head position
           if (index == 1){
            setCurrent(index);
            DLLNode newNode = new DLLNode(null, song, current);
            current.setPrevious(newNode);
            head = newNode;
            size++;
           }
           
           // if inserted at the last position
           else if (index > size) {
            setCurrent(size);
            DLLNode newNode = new DLLNode(current, song, null);
            current.setNext(newNode);
            last = newNode;
            size++;
           }
           
           // if inserted in the middle
           else {
               setCurrent(index);
               DLLNode newNode = new DLLNode(current.getPrevious(), song, current);
               current.getPrevious().setNext(newNode);
               current.setPrevious(newNode);
               size++;
           }
        }  
    }
       
   public void remove(int index){
       // catch, if the list is empty and remove()is called
       if (size > 0){
           // if removed from header
           if (index == 0){
               setCurrent(index);
               head = current.getNext();
               head.setPrevious(null);
               size--;
           }
           
           // if removed from last
           else if (index == size){
               last = current.getPrevious();
               last.setNext(null);
               size--;
           }
           
           // if removed from middle
           else {
               setCurrent(index);
               DLLNode previous = current.getPrevious();
               DLLNode next = current.getNext();
               previous.setNext(next);
               next.setPrevious(previous);
               size--;               
           }
           current = null; 
       }
   }
   
   public Object get(int index){
       setCurrent(index);
       return current.getSong();
   }
   
   public void printForwards(){
       for (DLLNode theNode = head; theNode != null; theNode = theNode.getNext()){
           System.out.println(theNode.getSong());
       }
   }
   
   public void printBackwards(){
       for (DLLNode theNode = last; theNode != null; theNode = theNode.getPrevious()){
           System.out.println(theNode.getSong());
       }
   }
   
   public Object playPrevious(){
       DLLNode previous = current.getPrevious();
       current = previous;
       return current.getSong();
   }
   
   public Object playNext(){
       DLLNode next = current.getNext();
       current = next;
       return current.getSong(); 
   }
                
    // DNC - class closing
}

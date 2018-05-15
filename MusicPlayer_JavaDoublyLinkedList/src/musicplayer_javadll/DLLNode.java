/**
 * File: DLLNode.java
 * @author daniela kepper
 * Date: 13.05.2018
 */

package musicplayer_javadll;


public class DLLNode {
   
    // member variables
    private Object song;
    private DLLNode previous;
    private DLLNode next;
    
    // constructor
    public DLLNode(DLLNode previous, Object song, DLLNode next){
        this.previous = previous;
        this.song = song; 
        this.next = next;
    }
    
    // setters
    protected void setSong(Object song){
        this.song = song;
    } 
    
    protected void setPrevious(DLLNode previous){
        this.previous = previous;
    }
    
    protected void setNext(DLLNode next){
        this.next = next;
    }
    
    //getters
    protected Object getSong(){
        return song;
    }
    
    protected DLLNode getPrevious(){
        return previous;
    }
    
    protected DLLNode getNext(){
        return next;
    }
    
    // DNC - class closing 
}


package treasurehunt_sll;

/**
 * File: SLL_Interface.java
 * @author Daniela Kepper
 * Date: 25.02.2018
 */

public interface SLL_Interface {
    
    public boolean isEmpty();
    public int size();
    public void add(int index, Object item);
    public void remove(int index);
    public Object get(int index);
    public void printList();
    public void printCurrent();
    
    // DNC - class closing tag
}

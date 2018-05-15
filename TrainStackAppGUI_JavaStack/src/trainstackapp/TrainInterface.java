/*
 * Name: TrainInterface.java
 * @autor: Daniela Kepper
 * Date: 03.02.2018
 */
package trainstackapp;

/**
 *
 * @author dkepper
 */
public interface TrainInterface {
    public void push(Object newWagon);
    public int size();
    public String displayStack();
    public Object pop();
    public String top();
    public void emptyStack();
    public boolean isFull();
}

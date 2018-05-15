/*
 * Name: QueueInterface.java
 * @autor: Daniela Kepper
 * Date: 03.02.2018
 */
package mccarthymedicalcenter;

/**
 *
 * @author dkepper
 */
public interface QueueInterface {
    public int size();
    public boolean isEmpty();
    public void enqueue(Object name);
    public Object dequeue();
    public String front();
    public String displayAll();
}

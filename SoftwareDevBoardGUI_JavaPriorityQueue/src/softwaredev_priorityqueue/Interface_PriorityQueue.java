/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaredev_priorityqueue;

/**
 * File: Interface_PriorityQueue.java
 * @author Daniela Kepper
 * Date: 16.02.2018
 */
public interface Interface_PriorityQueue {
        
    public boolean isEmpty();
    public int size();
    public int findPosition(int position);
    public void enqueue(int priority, Object information);
    public Object dequeue();
    public Object showNext();
    public String printElements();
}

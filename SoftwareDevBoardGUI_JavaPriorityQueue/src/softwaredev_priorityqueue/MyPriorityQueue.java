/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaredev_priorityqueue;

/**
 * File: MyPriorityQueue.java
 * @author Daniela Kepper
 * Date: 16.02.2018
 */
import java.util.*;

public class MyPriorityQueue implements Interface_PriorityQueue {
   
    private ArrayList<PQElement> myPQueue;
    private int value;
    private Object information;
    private int size;
    
    public MyPriorityQueue(){
        myPQueue = new ArrayList<PQElement>();
    }
    
    public boolean isEmpty(){
        return myPQueue.isEmpty();
    }
    
    public int size(){
        return myPQueue.size();
    }
    
    public int findPosition(int newPosition){
        PQElement currentElement;
        boolean found = false;
        int position = 0; 
        while (position<myPQueue.size() && !found){
            currentElement = myPQueue.get(value);
            if (currentElement.getValue()<newPosition){
                position++; 
            } 
              else {
                 found = true;
              }
            }
        return position;
    }
    
    public void enqueue(int priority, Object information){
        PQElement newElement = new PQElement(priority, information);
        int position = findPosition(priority);
        
        if (position>myPQueue.size()){
            myPQueue.add(newElement);
        }
        
        else {
            myPQueue.add(position, newElement);
        }
    }
    
    public Object dequeue(){
        return myPQueue.remove(0);
    }
    
    public Object showNext(){
        PQElement next = myPQueue.get(0);
        String information = next.getInformation().toString();
        return information;
    }  
    
    public String printElements(){
         String fullQueue[] = new String[myPQueue.size()];
         for (int i = 0; i < myPQueue.size(); i++) {
          PQElement next = myPQueue.get(i);
          fullQueue[i] = next.getInformation().toString();
          } 
        return Arrays.toString(fullQueue); 
    }

    // DNC - closing tag
}

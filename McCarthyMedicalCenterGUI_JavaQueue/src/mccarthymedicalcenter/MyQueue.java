/*
 * Name: MyQueue.java
 * @autor: Daniela Kepper
 * Date: 03.02.2018
 */
package mccarthymedicalcenter;

import java.util.*;
/**
 *
 * @author dkepper
 */
public class MyQueue implements QueueInterface {
    
    private ArrayList<String> queueList;
    
    public MyQueue(){
        queueList = new ArrayList<String>();
    }
    
    public int size(){
        return queueList.size();
    }
    
    public void enqueue(Object name){
        if (isEmpty()){
          queueList.add(0, (String)name);  
        }
        else {
          int len = queueList.size();
          queueList.add(len, (String)name);
        }
    }
    
    public Object dequeue(){
        return queueList.remove(0);
    }
    
    public boolean isEmpty(){
        return queueList.isEmpty();
    }
    
    public String front(){
        return queueList.get(0);
    }
    
    public String displayAll(){
        return queueList.toString();
    }
    // DNC - closing tags
}

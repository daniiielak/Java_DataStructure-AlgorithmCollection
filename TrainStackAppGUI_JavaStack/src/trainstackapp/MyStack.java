/*
 * Name: MyStack.java
 * @autor: Daniela Kepper
 * Date: 03.02.2018
 */
package trainstackapp;

import java.util.*;
/**
 *
 * @author dkepper
 */
public class MyStack implements TrainInterface {
    
    private ArrayList<String> wagonList; 
    
   public MyStack(){ 
       wagonList = new ArrayList<String>();
   }
         
    public void push(Object newWagon){    
        wagonList.add(0, (String)newWagon);
    }
    
    public int size(){
        return wagonList.size();
     }
    
    public String displayStack(){
        return wagonList.toString();
    }
    
    public Object pop(){
        if (!(wagonList.isEmpty())) {
        return wagonList.remove(0);
        }
        else {
        return null; 
        }
    }
    
    public String top(){
        return wagonList.get(0);
    }
    
    public void emptyStack(){
       int length = wagonList.size();
       for (int i = 0; i < length; i++) {
           wagonList.remove(0);
       }
    }
    
    public boolean isFull(){
           if ((wagonList.size()) < 5) {
           return false;
       }
           else {
           return true;
           }
    }
// DNC - closing tags
}
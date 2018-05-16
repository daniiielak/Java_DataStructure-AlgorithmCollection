/**
 * File: BubbleSortCode.java
 * @author daniela kepper
 * Date: 16.05.2018
 */

package studentlist_javasortingalgorithm;

import java.util.*;

public class SortingCode<ElemType> extends ArrayList<ElemType> {
    
    // methods
    public void swap(int position1, int position2){
        ElemType object1 = get(position1); 
        ElemType object2 = get(position2); 
        
        remove(position1);
        add(position1, object2);
        remove(position2);
        add(position2, object1);  
    }
    
    public void bubbleSort(){
        for (int i = 0; i < size(); i++){
            for (int j = 0; j < size()-1-i; j++){
                Comparable element1 = (Comparable)get(j);
                Comparable element2 = (Comparable)get(j+1);
                if(element1.compareTo(element2)>0){
                    swap(j, j+1);
                    System.out.println("Swapped " + j + " and " + j+1);
                    System.out.println("Current List: " + toString());
                }
            }
        }  
    }
    
    public void simpleBubbleSort(){
        //int elementsInList = size();
        boolean moreSwaps = true; 
        while(moreSwaps){
            moreSwaps = false;
            for (int k = 0; k < size()-1; k++){
                Comparable element1 = (Comparable)get(k);
                Comparable element2 = (Comparable)get(k+1);
                if(element1.compareTo(element2)>0){
                    swap(k, k+1);
                    System.out.println("Swapped " + k + " and " + k+1);
                    System.out.println("Current List: " + toString());
                    moreSwaps = true; 
                }
            }
        }  
    }
    
    public void insertionSort(){
        for(int i = 0; i < size(); i++){
            ElemType keyElement = get(i);
            int position = i; 
            
            while(position > 0 && ((Comparable)get(position-1)).compareTo((Comparable)keyElement)>0){
                ElemType elementBefore = get(position-1);
                set(position, elementBefore);
                position = position -1; 
            }
            // insert element at the right position
            set(position, keyElement);
            System.out.println("Inserting Element at the right position: " + keyElement);
            System.out.println("Current list: " + toString());
        }
    }
    
    // class closing
}

/**
 * File: BubbleSortCode.java
 * @author daniela kepper
 * Date: 16.05.2018
 */

package studentlist_javabubblesort;

import java.util.*;

public class BubbleSortCode<ElemType> extends ArrayList<ElemType> {
    
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
    
    // class closing
}

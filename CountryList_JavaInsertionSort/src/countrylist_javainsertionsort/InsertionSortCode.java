/**
 * File: InsertionSortCode.java
 * @author daniela kepper
 * Date: 16.05.2018
 */

package countrylist_javainsertionsort;

import java.util.*;

public class InsertionSortCode<ElemType> extends ArrayList<ElemType> {
  
    // methods
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

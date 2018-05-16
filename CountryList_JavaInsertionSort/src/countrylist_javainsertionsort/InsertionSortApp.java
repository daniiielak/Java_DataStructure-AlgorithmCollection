/**
 * File: InsertionSortApp.java
 * @author daniela kepper
 * Date: 16.05.2018
 */

package countrylist_javainsertionsort;

import java.util.Collections;

public class InsertionSortApp {

    public static void main(String[] args) {
        
        // creating ArrayList list
        InsertionSortCode<String> list = new InsertionSortCode<String>();
        
        list.add("United States");
        list.add("Netherlands");
        list.add("France");
        list.add("Austria");
        list.add("Japan");
        list.add("Denmark");
        list.add("Russia");
        
        // print before sorting wiht bubbleSort()
        System.out.println("The current elements are in the list: " + list.toString());
        list.insertionSort();
        System.out.println("insertionSort() finished.");
        System.out.println("The current list after sort: " + list.toString());
        
        // main closing  
    }
   // class closing 
}

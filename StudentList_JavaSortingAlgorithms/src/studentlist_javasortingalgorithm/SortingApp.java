/**
 * File: BubbleSortApp.java
 * @author daniela kepper
 * Date: 16.05.2018
 */

package studentlist_javasortingalgorithm;

import java.util.*;

public class SortingApp {

    public static void main(String[] args) {
        
        // creating ArrayList list
        SortingCode<String> list = new SortingCode<String>();
        
        list.add("Ulrike");
        list.add("Nadine");
        list.add("Felix");
        list.add("Anna");
        list.add("Leila");
        list.add("Daniela");
        list.add("Romain");
        list.add("Brecht");
        
        // print before sorting wiht bubbleSort()
        System.out.println("Step 1: bubbleSort() Method.");
        System.out.println("The current elements are in the list: " + list.toString());
        list.bubbleSort();
        System.out.println("bubbleSort() finished.");
        System.out.println("The current list after sort: " + list.toString());
        
        // Reshuffeling list
        Collections.shuffle(list);
        
        // print before sorting with simpleBubblesort()
        System.out.println("Step 2: simpleBubbleSort() Method.");
        System.out.println("The current elements are in the list: " + list.toString());
        list.simpleBubbleSort();
        System.out.println("simpleBubbleSort() finished.");
        System.out.println("The current list after sort: " + list.toString());
        
        // Reshuffeling list
        Collections.shuffle(list);
        
        // print before sorting with insertionSort()
        System.out.println("Step 3: insertionSort() Method.");
        System.out.println("The current elements are in the list: " + list.toString());
        list.simpleBubbleSort();
        System.out.println("insertionSort() finished.");
        System.out.println("The current list after sort: " + list.toString());
        
        // main closing
    }
    // class closing
}

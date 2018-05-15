
package treasurehunt_sll;

/**
 * File: TreasureHunt_App.java
 * @author Daniela Kepper
 * Date: 25.02.2018
 */

public class TreasureHunt_App {

    public static void main(String[] args) {
        
        SLL_Interface program = new SingleLinkedList();
        
        System.out.println("Is the treasure hunt list currently empty?" + program.isEmpty());
        program.add(1, "Find the first clue on a stone, next to the river.");
        program.add(2, "Find the second clue next to the old tree in the woods.");
        program.add(3, "Find the thrid clue behind the barn.");
        program.add(4, "Find the fourth clue on the highest hill of the city.");
        program.add(5, "Find the fifth and last clue in the fridge in your kitchen.");
        
        // Checks and prints if the list is empty
        System.out.println("Is the treasure hunt list currently empty?"  + program.isEmpty());
        
        // Prints the current size of the list
        System.out.println("How many hints to find the treasure? " + program.size());
        
        // Print the next element in the list
        System.out.println("What is the next hint to find?");
        program.printCurrent();
        
        //First hint found
        System.out.println("First hint found. Show next hint: ");
        program.remove(1);
        program.printCurrent();
        
        // Prints all the elements from the list
        System.out.print("Which hints are left to find? \n");
        program.printList();
      
        if (program.size() == 0) {
            System.out.println("Congratulations, you've found the treasure!");
        }
        else {
            System.out.println("Keep on looking.");
        }
 
    // DNC -  closing tag
    }
}

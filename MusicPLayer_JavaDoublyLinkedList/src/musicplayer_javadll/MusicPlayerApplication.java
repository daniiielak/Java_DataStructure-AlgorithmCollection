/**
 * File: MusicPlayerApplication.java
 * @author daniela kepper
 * Date: 13.05.2018
 */

package musicplayer_javadll;

public class MusicPlayerApplication {

    public static void main(String[] args) {
        
        // create player
        DLLInterface player = new DLList();
        
        System.out.println("Is the playlist empty? " + player.isEmpty());
        
        // add music
        System.out.println("Adding music....");
        player.add(1, "George Szra - Budapest");
        player.add(2, "Jason Mraz - I'm yours");
        player.add(3, "Vance Joy - Riptide");
        player.add(4, "The Lumineers - Ho Hey");
        player.add(5, "Natasha Bedingfield - Pocketful of Sunshine");
        
        System.out.println("Songs in the playlist: " + player.size());
        
        System.out.println("Songs on the list forward: ");
        player.printForwards();
        
        System.out.println("Songs on the list backwards: ");
        player.printBackwards();
        
        System.out.println("Removing last song in the play list " + player.get(player.size()));
        player.remove(player.size());
        
        System.out.println("Playing song #3: " + player.get(3));
        System.out.println("Playing previous song #2: " + player.playPrevious());
        
        // DNC - main closing 
    }
  // DNC - class closing 
}

/**
 * File: DLLInterface.java
 * @author daniela kepper
 * Date: 13.05.2018
 */

package musicplayer_javadll;

public interface DLLInterface {
    public boolean isEmpty();
    public int size();
    public void setCurrent(int index);
    public void add(int index, Object song);
    public void remove(int index);
    public Object get(int index);
    public void printForwards();
    public void printBackwards();
    public Object playNext();
    public Object playPrevious();
    // DNC - class closing
}

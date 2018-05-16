/**
 * File: Edge.java
 * @author daniela kepper
 * Date: 16.05.2018
 */

package flightroutes_javadijkstraalgorithm;

public class Edge {
    
    // member variables
    private final String ID;
    private final Vertex SOURCE;
    private final Vertex DESTINATION;
    private final int WEIGHT;
    
    
    // constructors
    public Edge(String ID, Vertex SOURCE, Vertex DESTINATION, int WEIGHT){
        this.ID = ID;
        this.SOURCE = SOURCE;
        this.DESTINATION = DESTINATION;
        this.WEIGHT = WEIGHT;
    }
    
    // getters
    public String getID(){
        return ID;
    }
    
    public Vertex getSource(){
        return SOURCE;
    }
    
    public Vertex getDestination(){
        return DESTINATION;
    }
    
    public int getWeight(){
        return WEIGHT;
    }
    
    // methods
    @Override
    public String toString(){
        return "Source: " + SOURCE + " | Destination: " + DESTINATION; 
    }
    
    // class closing
}

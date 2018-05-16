/**
 * File: Graph.java
 * @author daniela kepper
 * Date: 16.05.2018
 */

package flightroutes_javadijkstraalgorithm;

import java.util.List;

public class Graph {
    
    // member variables
    private final List<Vertex> graphAirports;
    private final List<Edge> graphRoutes;
   
    // constructor
    public Graph(List<Vertex> a, List <Edge> r){
        graphAirports = a;
        graphRoutes = r; 
    }
    
    // getters
    public List<Vertex> getGraphAirports(){
        return graphAirports;
    }
    
    public List<Edge> getGraphRoutes(){
        return graphRoutes;
    }
    
    // class closing
}

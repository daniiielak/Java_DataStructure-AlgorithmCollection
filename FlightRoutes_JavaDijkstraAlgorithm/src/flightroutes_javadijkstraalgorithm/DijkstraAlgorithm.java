/**
 * File: DijkstraAlgorithm.java
 * @author daniela kepper
 * Date: 16.05.2018
 */

package flightroutes_javadijkstraalgorithm;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Collections;

public class DijkstraAlgorithm {
    
    // member variables
    private final List<Vertex> AIRPORTS;
    private final List<Edge> ROUTES;
    private Set<Vertex> visitedAirports;
    private Set<Vertex> unvisitedAirports;
    private Map<Vertex, Vertex> predecessors;
    private Map<Vertex, Integer> miles;

    // constructor
    public DijkstraAlgorithm(Graph graph){
        this.AIRPORTS = new ArrayList<Vertex>(graph.getGraphAirports());
        this.ROUTES = new ArrayList<Edge>(graph.getGraphRoutes());
    }
            
    // methods
    private boolean isVisited(Vertex airport) {
        return visitedAirports.contains(airport);
    }
    
    private Vertex getMinimum(Set<Vertex> airports){
        Vertex minimum = null;
        for (Vertex vertex : airports) {
            if (minimum == null){
                minimum = vertex; 
            }
            else {
                if (getShortestRoute(vertex) < getShortestRoute(minimum)){
                    minimum = vertex; 
                }
            }
        }
       return minimum;  
    }
    
    private int getShortestRoute(Vertex destinationAirport){
        Integer distance = miles.get(destinationAirport);
        if (distance == null) {
            return Integer.MAX_VALUE;
        }
        else {
            return distance; 
        }
    }
    
    private int getDistance(Vertex airport, Vertex destinationAirport){
        for (Edge route : ROUTES){
            if(route.getSource().equals(airport) && route.getDestination().equals(destinationAirport)){
                return route.getWeight();
            }
        }
        throw new RuntimeException("Should not go down here.");
    }
    
    public List<Vertex> getNeighbourAirports(Vertex newAirport){
        List<Vertex> neighbours = new ArrayList<Vertex>();
        for (Edge route : ROUTES){
            if(route.getSource().equals(newAirport) && !isVisited(route.getDestination())){
                neighbours.add(route.getDestination());
            }
        }
        return neighbours; 
    }
    
    public void findShortestRoute(Vertex newAirport){
        List<Vertex> adjacentAirports = getNeighbourAirports(newAirport);
        for (Vertex target : adjacentAirports){
            if(getShortestRoute(target)>(getShortestRoute(newAirport)) + getDistance(newAirport, target)){
                miles.put(target, getShortestRoute(newAirport) + getDistance(newAirport, target));
                predecessors.put(target, newAirport);
                unvisitedAirports.add(target);
            }
        }
    }
    
    public void runDijkstra(Vertex sourceAirport) {
        visitedAirports = new HashSet<Vertex>();
        unvisitedAirports =  new HashSet<Vertex>();
        predecessors = new HashMap<Vertex, Vertex>();
        miles = new HashMap<Vertex, Integer>();
        
        miles.put(sourceAirport, 0);
        unvisitedAirports.add(sourceAirport);
        
        while(unvisitedAirports.size()>0){
            Vertex nextAirport = getMinimum(unvisitedAirports);
            visitedAirports.add(nextAirport);
            unvisitedAirports.remove(nextAirport);
            findShortestRoute(nextAirport);
        }
    }
    
    public LinkedList<Vertex> getFinalRoute(Vertex destination){
        LinkedList<Vertex> finalRoute = new LinkedList<Vertex>();
        Vertex step = destination;
        //check if route exists
        if (predecessors.get(step) == null){
            return null;
        }
        finalRoute.add(step);
        while (predecessors.get(step) != null){
            step = predecessors.get(step);
            finalRoute.add(step);
        }
        // ordering the routes
        Collections.reverse(finalRoute);
        return finalRoute; 
    }
    
    // class closing
}

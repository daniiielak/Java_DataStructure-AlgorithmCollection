/**
 * File: FlightRoutesApplication.java
 * @author daniela kepper
 * Date: 16.05.2018
 */

package flightroutes_javadijkstraalgorithm;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList; 

public class FlightRoutesApplication {

    // member variables
    private List<Vertex> airports;
    private List<Edge> routes; 

    public static void main(String[] args) {

        FlightRoutesApplication app = new FlightRoutesApplication();
        app.letsDoThis();
     
     // main closing
    }
    
    // methods
    public void letsDoThis(){
        airports = new ArrayList<Vertex>();
        routes = new ArrayList<Edge>();
        
        // adding 5 airports
        System.out.println("Adding new airports to Flight Service Offer.");
        Vertex newAirport = new Vertex("0", "DUB - Dublin Airport (DUB)");
        airports.add(newAirport);
        System.out.println("New airport " + newAirport.getName() + " was added.");
        newAirport = new Vertex("1", "London Heathrow Airport (LHR)");
        airports.add(newAirport);
        System.out.println("New airport " + newAirport.getName() + " was added.");
        newAirport = new Vertex("2", "Frankfurt Airport (FRA)");
        airports.add(newAirport);
        System.out.println("New airport " + newAirport.getName() + " was added.");
        newAirport = new Vertex("3", "Vienna International Airport (VIE)");
        airports.add(newAirport);
        System.out.println("New airport " + newAirport.getName() + " was added.");
        newAirport = new Vertex("4", "Paris Charles de Gaulle Airport (CDG)");
        airports.add(newAirport);
        System.out.println("New airport " + newAirport.getName() + " was added.");
        
        // printing all airports
        System.out.println("List of all airports: " + airports.toString());
        
        // adding Routes between airports
        addRoute("DUB-LHR", 0, 1, 280);
        addRoute("DUB-FRA", 0, 2, 676);
        addRoute("FRA-VIE", 2, 3, 388);
        addRoute("VIE-FRA", 3, 2, 388);
        addRoute("LHR-CDG", 1, 4, 216);
        addRoute("CDG-VIE", 4, 3, 645);
        addRoute("VIE-DUB", 3, 0, 1061);
        
        // printing all routes
        System.out.println("List of all routes: " + routes.toString());
        
        //  creating the Graph
        Graph graph = new Graph(airports, routes);
        DijkstraAlgorithm dja = new DijkstraAlgorithm(graph);
        
        // trying to find Routes from Dublin to Paris
        System.out.print("Route from DUB to CDG: ");
        dja.runDijkstra(airports.get(0));
        LinkedList<Vertex> path = dja.getFinalRoute(airports.get(4));
        for (Vertex vertex : path) {
            System.out.print(vertex + " - ");
        }
        System.out.println();
        
        // trying to find Routes from Dublin to Vienna
        System.out.print("Route from DUB to VIE: ");
        dja.runDijkstra(airports.get(0));
        path = dja.getFinalRoute(airports.get(3));
        for (Vertex vertex : path) {
            System.out.print(vertex + " - ");
        }
        System.out.println();
    }
    
     private void addRoute(String routeID, int sourceLocNo, int destLocNo,
            int miles) {
        Edge route = new Edge(routeID, airports.get(sourceLocNo), airports.get(destLocNo), miles);
        routes.add(route);
    }
     
     // class closing
}

# FlightRoutes - Dijkstra Algorithm

## Objective
The objective is to develop a flight route calculator that inputs a set of Vertices (= airports) and Edges (= routes) to a Graph and allows the user to ask for the single shortest path between a source airport and a destination airport (eg.: Flight from DUB - VIE). The application was implemented by using the principles of the Dijkstra Algorithm as well as ADT ArrayList, HashMaps, HashSets and LinkedLists. The program was developed in Java.

## Methods:
  <pre>
  private boolean isVisited(Vertex airport)
  private Vertex getMinimum(Set<Vertex> airports)
  private int getShortestRoute(Vertex destinationAirport)
  private int getDistance(Vertex airport, Vertex destinationAirport)
  public List<Vertex> getNeighbourAirports(Vertex newAirport)
  public void findShortestRoute(Vertex newAirport)
  public void runDijkstra(Vertex sourceAirport)
  public LinkedList<Vertex> getFinalRoute(Vertex destination)
  private void addRoute(String routeID, int sourceLocNo, int destLocNo, int miles)
  private void letsDoThis()
  </pre>

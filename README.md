# Java Data Structure & Algorithm Collection
This Collection Repository includes work around individual Data Structure and Algorithms applications in Java. Below you can find a short overview of all included projects, more information can be found in the individual ReadMes.  

## BinarySearchTree_JavaBST
The program showcases code to create a binary search tree non-linear data structure in Java. The following functionalities are part of the BST and are captured within the BSTTree.java class:

   <pre>
   public BSTNode getRoot()
   public boolean isEmpty()
   public void insertNode(BSTNode startNode, BSTNode newNode)
   public BSTNode searchElement(BSTNode startNode, int theElement)
   public void inOrderTraversal(BSTNode startNode)
   public void preOrderTraversal(BSTNode startNode)
   public void postOrderTraversal(BSTNode startNode)
   public int countNodes(BSTNode startNode)
   public int height(BSTNode startNode)
   </pre>


## FlightRoutes_JavaDijkstraAlgorithm
The objective is to develop a flight route calculator that allows the user to ask for the single shortest path between a source airport and a destination airport (eg.: Flight from DUB - VIE). The application was implemented by using the principles of the Dijkstra Algorithm as well as ADTs ArrayList, HashMaps, HashSets and LinkedLists.

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


## McCarthyMedicalCenterGUI_JavaQueue
This program represents a patient registration form GUI for McCarthy's Medical Centre that allows customers to register with their patient input. The system then assigns them a number in the queue and processes patients step by step. The Patient form uses the functionality of the abstract data type Queue in an ArrayList, developed in Java. Available functionalities:

  <pre>
  public int size()
  public boolean isEmpty()
  public void enqueue(Object name)
  public Object dequeue()
  public String front()
  public String displayAll()
  </pre>


## MusicPlayer_JavaDoublyLinkedList
The objective of in this task is to develop a music player application by using the functionality of the abstract data type Doubly Linked List. DLL interface functionalities:

  <pre>
  public boolean isEmpty()
  public int size()
  public void setCurrent(int index)
  public void add(int index, Object song)
  public void remove(int index)
  public Object get(int index)
  public void printForwards()
  public void printBackwards()
  public Object playNext()
  public Object playPrevious()
  </pre>


## SoftwareDevBoardGUI_JavaPriorityQueue
The objective is to develop a software development request board form GUI that allows employees to register classified feature requests to the project owner. The board uses the functionality of the abstract data type Priority Queue in an ArrayList:

  <pre>
  public boolean isEmpty()
  public int size()
  public int findPosition(int position)
  public void enqueue(int priority, Object information)
  public Object dequeue()
  public Object showNext()
  public String printElements()
  </pre>


## TrainStackAppGUI_JavaStack
The objective is to develop train stack application GUI that allows the user to add a maximum of five wagons, loading different type of products, at the end of the train. The application uses the functionality of the abstract data type Stack in an ArrayList:

  <pre>
  public void push(Object newWagon)
  public int size()
  public String displayStack()
  public Object pop()
  public String top()
  public void emptyStack()
  public boolean isFull()
  </pre>


## TreasureHunt_JavaSingleLinkedLists
The objective of in this task is to develop an application that enables a treasure hunt, by storing the information of different hiding spots and revealing one after the other, until the final treasure is found. The Treasure Hunt program uses the functionality of the abstract data type Single Linked List in an ArrayList, developed in Java.

  <pre>
  public boolean isEmpty()
  public int size()
  public void add(int index, Object item)
  public void remove(int index)
  public Object get(int index)
  public void printList()
  public void printCurrent()
  </pre>

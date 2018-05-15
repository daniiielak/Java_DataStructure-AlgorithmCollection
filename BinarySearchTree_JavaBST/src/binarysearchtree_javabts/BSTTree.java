/**
 * File: BSTTree.java
 * @author daniela kepper
 * Date: 15.05.2018
 */

package binarysearchtree_javabts;

public class BSTTree {
    
    // member variables
    BSTNode root; 
    
    // constructors
    public BSTTree(){
        root = null; 
    }
    
    // getters
    public BSTNode getRoot(){
        return root; 
    }
    
    // methods
    public boolean isEmpty(){
        return(root==null);
    }
    
    public void insertNode(BSTNode startNode, BSTNode newNode){
        // Situation 1: tree is empty
        if (root==null){
            root = newNode;
            System.out.println("The new Node " + newNode.getElement() + " has been inserted at the root.");
        }
        // Situation 2: tree is not empty
        else{
            // if the element value < startNode
            if (newNode.getElement()<startNode.getElement()){
                //if there is no left child for the current position Node yet
                if(startNode.getLeft()==null){
                    startNode.setLeft(newNode);
                    System.out.println("The new Node " + newNode.getElement() + " has been inserted on the left side of the tree.");
                }
                // if there is already a left child
                else {
                    insertNode(startNode.getLeft(), newNode); 
                }
            }
            // if the elemnt value > startNode
            else if(newNode.getElement()>startNode.getElement()){
                // if there is no right child for the current position yet
                if(startNode.getRight()==null){
                    startNode.setRight(newNode);
                    System.out.println("The new Node " + newNode.getElement() + " has been inserted at the right side of the tree.");
                }
                // if there is already a right child
                else{
                    insertNode(startNode.getRight(), newNode);
                }
            }
            // if the element value == startNode
            else if(newNode.getElement()==startNode.getElement()){
                System.out.println("The new Node " + newNode.getElement() + " has already been inserted into the tree.");
            }   
        }
    }
    
    public BSTNode searchElement(BSTNode startNode, int theElement){
        // in case tree from start node on is empty
        if (startNode == null){
            return null;
        }
        else {
        // if it is the start node
            if (startNode.getElement()==theElement){
                return startNode; 
            }
            // if element < startNode
            else if (startNode.getElement()<theElement){
                return searchElement(startNode.getLeft(), theElement);
            }
            // if element > startNode
            else {
                return searchElement(startNode.getRight(), theElement);
            }
        }
    }
    
    public void inOrderTraversal(BSTNode startNode){
        if(startNode==null){
        }
        else {
            inOrderTraversal(startNode.getLeft());
            System.out.println("Node: " + startNode.getElement());
            inOrderTraversal(startNode.getRight());
        }
    }
    
    public void preOrderTraversal(BSTNode startNode){
        if(startNode==null){
        }
        else{
            System.out.println("Node: " + startNode.getElement());
            preOrderTraversal(startNode.getLeft());
            preOrderTraversal(startNode.getRight());
        }
    }
    
    public void postOrderTraversal(BSTNode startNode){
        if(startNode==null){
        }
        else{
            postOrderTraversal(startNode.getLeft());
            postOrderTraversal(startNode.getRight());
            System.out.println("Node: " + startNode.getElement());
        }
    }
    
    public int countNodes(BSTNode startNode){
        if(startNode == null){
            return 0; 
        }
        else {
            return 1 + countNodes(startNode.getLeft()) + countNodes(startNode.getRight());
        }
    }
    
    public int height(BSTNode startNode){
        if((startNode == null) || (startNode.isExternal())){
            return 0; 
        }
        else{
            int leftHeight = height(startNode.getLeft());
            int rightHeight = height(startNode.getRight());
            return 1 + Math.max(leftHeight, rightHeight);
        }
    }
    
    // class closing
}

package binarysearchtree_javabts;

/**
 * File: BSTNode.java
 * @author daniela kepper
 * Date: 15.05.2018
 */

public class BSTNode {
    
    // member variables
    private int element;
    private BSTNode left;
    private BSTNode right;
    
    //Constructor
    public BSTNode(int element){
        this.element = element;
        this.left = null;
        this.right = null;
    }
        
    // setters
    public void setLeft(BSTNode left){
        this.left = left;
    }
    
    public void setRight(BSTNode right){
        this.right = right;
    }
    
    // getters
    public int getElement(){
        return element;
    }
    
    public BSTNode getLeft(){
        return left;
    }
    
    public BSTNode getRight(){
        return right;
    }
    
    //methods
    public boolean isLeaf(){
        if ((left == null)&&(right ==null)){
            return true;
        }
        return false; 
    }
    
    public boolean isInternal(){
        return ((left!=null)||(right!=null));
    }
    
    // same as isLeaf but different expression
    public boolean isExternal(){
        return ((left==null)&&(right==null));
    }
//    
    // class closing
}

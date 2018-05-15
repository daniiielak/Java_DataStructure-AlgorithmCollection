/**
 * File: BSTExample.java
 * @author daniela kepper
 * Date: 15.05.2018
 */

package binarysearchtree_javabts;

public class BSTExample {


    public static void main(String[] args) {
        
        // create nodes
        BSTNode theNode1 = new BSTNode(50);
        BSTNode theNode2 = new BSTNode(25);
        BSTNode theNode3 = new BSTNode(75);
        BSTNode theNode4 = new BSTNode(15);
        BSTNode theNode5 = new BSTNode(33);
        BSTNode theNode6 = new BSTNode(60);
        BSTNode theNode7 = new BSTNode(81);
        BSTNode theNode8 = new BSTNode(23);
        BSTNode theNode9 = new BSTNode(44);
        BSTNode theNode10 = new BSTNode(1);
        BSTNode theNode11 = new BSTNode(29);
        BSTNode theNode12 = new BSTNode(49);
        
        //create binary tree and insert the nodes
        BSTTree tree = new BSTTree();
        tree.insertNode(tree.getRoot(), theNode1);
        tree.insertNode(tree.getRoot(), theNode2);
        tree.insertNode(tree.getRoot(), theNode3);
        tree.insertNode(tree.getRoot(), theNode4);
        tree.insertNode(tree.getRoot(), theNode5);
        tree.insertNode(tree.getRoot(), theNode6);
        tree.insertNode(tree.getRoot(), theNode7);
        tree.insertNode(tree.getRoot(), theNode8);
        tree.insertNode(tree.getRoot(), theNode9);
        tree.insertNode(tree.getRoot(), theNode10);
        tree.insertNode(tree.getRoot(), theNode11);
        tree.insertNode(tree.getRoot(), theNode12);
        
        // creating duplicate node and trying to insert it
        BSTNode theNode13 = new BSTNode(60);
        tree.insertNode(tree.getRoot(), theNode13);
        
        // height of Node and size of Tree
        System.out.println("The height of Node 5 is " + tree.height(theNode5));
        System.out.println("The size of the tree is " + tree.countNodes(tree.getRoot()));
        
        // search for a specific Node
        BSTNode node = tree.searchElement(tree.getRoot(), theNode5.getElement());
        if (node!=null){
            System.out.println("The node was found at height " + tree.height(theNode5));
        }
        else if(node==null) {
            System.out.println("The Node was not found in the tree.");
        }
        
        // trying all kinds of traversals
        tree.inOrderTraversal(tree.getRoot());
        System.out.println("Finished inOrderTraversal()");
        tree.preOrderTraversal(tree.getRoot());
        System.out.println("Finished preOrderTraversal()");
        tree.postOrderTraversal(tree.getRoot());
        System.out.println("Finished postOrderTraversal");
        
        // main closing
    }
    // class closing 
}

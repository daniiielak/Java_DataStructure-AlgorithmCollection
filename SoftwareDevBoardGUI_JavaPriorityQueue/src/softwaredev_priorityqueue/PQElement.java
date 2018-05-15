
package softwaredev_priorityqueue;

/**
 * File: PQElement.java
 * @author Daniela Kepper
 * Date: 16.02.2018
 */

public class PQElement {
    
    private int value;
    private Object information; 
    
    public PQElement(int value, Object information) {
        this.value = value;
        this.information = information; 
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public void setInformation(Object information) {
        this.information = information; 
    }
    
    public int getValue(){
        return value;
    }
    
    public Object getInformation(){
        return information;
    }
    
    // DNC - closing tag
}

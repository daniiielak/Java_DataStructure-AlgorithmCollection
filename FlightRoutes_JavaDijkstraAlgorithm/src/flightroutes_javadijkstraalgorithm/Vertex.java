/**
 * File: Vertex.java
 * @author daniela kepper
 * Date: 16.05.2018
 */

package flightroutes_javadijkstraalgorithm;

public class Vertex {
    
    // member variables
    private final String AIRPORTID;
    private final String AIRPORTNAME;
            
    // constructor
    public Vertex(String ID, String NAME){
        this.AIRPORTID = ID;
        this.AIRPORTNAME = NAME;
    }
    
    //getters
    public String getId(){
        return AIRPORTID;
    }
    
    public String getName(){
        return AIRPORTNAME;
    }
    
    // override methods
    @Override
    public String toString(){
        return AIRPORTNAME;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Vertex other = (Vertex) obj;
        if (AIRPORTID == null) {
            if (other.AIRPORTID != null){
                return false;
            }
        } 
        else if (!AIRPORTID.equals(other.AIRPORTID)){
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((AIRPORTID == null) ? 0 : AIRPORTID.hashCode());
        return result;
    }
    
    // class closing
}

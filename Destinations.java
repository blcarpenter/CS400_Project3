/**
 * // --== CS400 File Header Information ==--
 * // Name: Alexander Dudin
 * // Email: dudin@wisc.edu
 * // Team: Red
 * // Group: GG
 * // TA: Surabhi
 * // Lecturer: Gary Dahl
 * // Notes to Grader: n/a
 */
import java.util.List;

/**
 * This class implements the destinations interface and has A list of edges comming off of each of the
 * destinations. some functionality is geting the name and getting the destinations that leave in the form of the edges
 */
public class Destinations implements DestinationsInterface {
    public  List<Edge> destinationsLeaving;
    private String name;

    public Destinations(List<Edge> destinationsLeaving, String name) {
        this.destinationsLeaving = destinationsLeaving;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }



    @Override
    public List<Edge> destinationsLeaving() {
       return destinationsLeaving;
    }
    @Override
    public String toString(){
        return name+"\n";
    }


}

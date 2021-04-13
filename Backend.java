import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;

public class Backend {

    private CS400Graph<String> locationGraph;
    private ArrayList<DestinationsInterface> locList;

    // Constructor that stores location data obtained from command line arguments
    // in a CS400Graph
    Backend(String[] args) {

        this.locationGraph = new CS400Graph<>();
        CampusMapDataReader cmdr = new CampusMapDataReader();
        Reader r = null;

        try {
            r = new FileReader(args[0]);
        }  catch (Exception e){
            System.out.println("Error: file could not be read");
        }
        try {
            this.locList = cmdr.readDataSet(r);
        } catch (Exception e) {
            System.out.println("Error: locations could not be stored")
        }

        // Store vertices
        for (Destinations d : this.loclist.get(0)) {
            this.locationGraph.insertVertex(d.getName());
        }

        // Store edges
        for (Destinations d : this.loclist.get(0)) {
            for (Edge e : d.destinationsLeaving()) {
                this.locationGraph.insertEdge(d.getName(), e.target, e.weight);
            }
        }

    }

    // Method that returns a String array representing the path from the starting
    // location to the destination, with the total cost stored in the final element
    public String[] getRoute(String start, String end) {

        String[] route = new String[50];
        ArrayList<String> list = this.locationGraph.shortestPath(start, end);

        int count = 0;

        for (String s : list) {
            route[count] = s;
            count++;
        }

        // filler line for display purposes (optional)
        route[count++] = "";

        route[count] = "Total path cost: ";
        route[count].append(this.locationGraph.getPathCost(start, end).toString());

        return route;
    }
    
}

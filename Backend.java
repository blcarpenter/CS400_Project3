// --== CS400 File Header Information ==--
// Name: Ben Carpenter
// Email: blcarpenter@wisc.edu
// Team: GG
// TA: Surabhi
// Lecturer: Gary
// Notes to Grader:

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;

/**
 * The Backend class stores location data provided in the command line arguments
 * in a CS400Graph and calculates the shortest path between two locations using
 * the shortestPath method of the CS400Graph class
 */
public class Backend {

    private CS400Graph<String> locationGraph;
    public ArrayList<Destinations> locList;
    
    // Constructor that stores location data obtained from command line arguments
    // in a CS400Graph
    Backend(File file) {

        this.locationGraph = new CS400Graph<>();
        CampusMapDataReader cmdr = new CampusMapDataReader();
        FileReader r = null;

        try {
            r = new FileReader(file);
        }  catch (Exception e){
            System.out.println("Error: file could not be read");
        }
        try {
            this.locList = (ArrayList)cmdr.readDataSet(r);
        } catch (Exception e) {
            System.out.println("Error: locations could not be stored");
        }

        // Store vertices
        for (Destinations d : this.locList) {
            this.locationGraph.insertVertex(d.getName());
        }

        // Store edges
        for (Destinations d : this.locList) {
            for (Edge e : d.destinationsLeaving()) {
                this.locationGraph.insertEdge(d.getName(), e.target, e.weight);
            }
        }

    }

    // Method that returns a String array representing the path from the starting
    // location to the destination, with the total cost stored in the final element
    public String[] getRoute(String start, String end) {

        String[] route = new String[50];
        ArrayList<String> list = (ArrayList)this.locationGraph.shortestPath(start, end);

        int count = 0;

        for (String s : list) {
            route[count] = s;
            count++;
        }

        // filler line for display purposes (optional)
        route[count++] = "";

        Integer cost = this.locationGraph.getPathCost(start, end);
        route[count] = "Total path cost: " + cost.toString();

        return route;
    }
    
    public int getCost (String start, String end) {
      Integer cost = this.locationGraph.getPathCost(start, end);
      return cost;  
    }
    
    public ArrayList<String> adjacentNodes(String data) {
      ArrayList<String> list = new ArrayList<String>();
      Destinations currentNode = null;
      for(Destinations x: locList) {
        if (x.getName().equals(data)) {
          currentNode = x;
        }
      }
      if (currentNode!=null) {
        for (Edge x : currentNode.destinationsLeaving()) {
          list.add(x.target);
        }
      } 
     return list; 
   }
}

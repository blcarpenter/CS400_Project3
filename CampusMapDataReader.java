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
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * This class implements the CampusMapDataReaderInterface and makes the method to convert the csv file into use able code
 * @author alexdudin
 */
public class CampusMapDataReader implements CampusMapDataReaderInterface {
    /**
     *
     * @param inputFileReader a file reader with the csv file in it
     * @return a list of destinations
     * @throws FileNotFoundException
     * @throws IOException
     */
    @Override
    public List<DestinationsInterface> readDataSet(FileReader inputFileReader) throws FileNotFoundException, IOException {
        List<DestinationsInterface> helper = new ArrayList<DestinationsInterface>();
        String line = "";
        String split = ",";
        try {
            BufferedReader reader = new BufferedReader(inputFileReader);
            while ((line = reader.readLine()) != null) {
                String[] entireLine = line.replace("\"","").replace("\uFEFF","").split(split);
                for (int i=0;i<entireLine.length;i++){
                    entireLine[i] = entireLine[i].trim();
                }
                String name = entireLine[0];
               List<Edge> edgesLeaving= new ArrayList<>();
                for(int i =1; i < entireLine.length-1;i+=2) {
                    int distance = Integer.parseInt(entireLine[i]);
                    String nameVert = entireLine[i+1];
                    edgesLeaving.add(new Edge(nameVert,distance));
                }

                Destinations destinations = new Destinations(edgesLeaving,name);
                helper.add(destinations);
            }
            List<DestinationsInterface> helpe = helpLink(helper);

            return helpe;

            // catches the exceptions
        } catch (FileNotFoundException e) {
           throw new FileNotFoundException("Path could not be found");
        } catch (IOException e) {
            throw new IOException();
        }
    }

    /**
     * Links all the node into a map
     * @param helper a list of destinations
     * @return a list of linked destinations
     */
    private List<DestinationsInterface> helpLink(List<DestinationsInterface> helper){
        List<DestinationsInterface> destinations = new ArrayList<>();
        for (DestinationsInterface d:helper) {
            List<Edge> edges = new ArrayList<>();
            for(Edge e: d.destinationsLeaving()){
                Edge2 edgeConnected = new Edge2(e,helper);
                edges.add(edgeConnected);
            }
            d.setDestinationsLeaving(edges);
            destinations.add(d);
        }
        return destinations;
    }

    }


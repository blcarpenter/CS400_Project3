import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;

public class CampusMapDataReader implements CampusMapDataReaderInterface {
    @Override
    public List<DestinationsInterface> readDataSet(FileReader inputFileReader) throws FileNotFoundException, IOException, DataFormatException {
        // TODO Auto-generated method stub
        List<DestinationsInterface> helper = new ArrayList<DestinationsInterface>();
        String line = "";
        String split = ",";
        try {
            BufferedReader reader = new BufferedReader(inputFileReader);
            while ((line = reader.readLine()) != null) {
                String[] entireLine = line.replace("\"","").split(split);
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
            return helper;
            // catches the exceptions
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return helper;
    }
    }


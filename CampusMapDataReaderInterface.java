import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.zip.DataFormatException;

public interface CampusMapDataReaderInterface {

        public List<DestinationsInterface> readDataSet(FileReader inputFileReader) throws FileNotFoundException, IOException, DataFormatException;;

}

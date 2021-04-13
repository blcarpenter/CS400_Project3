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
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.zip.DataFormatException;

public interface CampusMapDataReaderInterface {

        public List<DestinationsInterface> readDataSet(FileReader inputFileReader) throws FileNotFoundException, IOException, DataFormatException;;

}

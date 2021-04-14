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
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
/**
 * this is the a class the uses junit to test the backend class
 */
public class DataWangglerTests {
        CampusMapDataReader reader;


        /**
         * sets up the instances of backend
         */
        @Before
        public void setup(){
            this.reader = new CampusMapDataReader();


        }
        @Test
        /**
         * checks to see if the reader method will populate and give a none empty list
         */
        public void testReader1(){
            CampusMapDataReader reader = new CampusMapDataReader();
            File f = new File("Madisonmap.csv");
            FileReader reader1 = null;
            try {
                reader1 = new FileReader(f);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            List<DestinationsInterface> list =null;
            try {
            list = reader.readDataSet(reader1);
            }catch (Exception e){
                e.printStackTrace();
            }
            assertTrue(!list.isEmpty());
        }

        /**
         * checks to see if the reader populates the correct destination
         */
        @Test
        public void testReader2() {
            CampusMapDataReader reader = new CampusMapDataReader();
            File f = new File("Madisonmap.csv");
            FileReader reader1 = null;
            try {
                reader1 = new FileReader(f);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            List<DestinationsInterface> list = null;
            try {
                list = reader.readDataSet(reader1);
            } catch (Exception e) {
                e.printStackTrace();
            }

            assertEquals("Buffalo wild wings",list.get(0).getName());
        }
            /**
         * checks to see if the reader will populate the correct destination adn they have paths comming from them
         */
        @Test
        public void testReader3(){
            CampusMapDataReader reader = new CampusMapDataReader();
            File f = new File("Madisonmap.csv");
            FileReader reader1 = null;
            try {
                reader1 = new FileReader(f);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            List<DestinationsInterface> list =null;
            try {
                list = reader.readDataSet(reader1);
            }catch (Exception e){
                e.printStackTrace();
            }
            Edge edge= list.get(0).destinationsLeaving().get(0);
            String name = edge.target;
            assertEquals("E.Campus mall and johnson",name);
        }


        @After
        public void cleanup(){
            reader = null;
        }
    }






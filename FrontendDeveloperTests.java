// --== CS400 File Header Information ==--
// Name: Junaid Ackroyd
// Email: jackroyd@wisc.edu
// Team: GG
// TA: Surabhi
// Lecturer: Florian
// Notes to Grader: None

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.File;
import java.util.Scanner;

/**
 * Tests the implementation of the Frontend class
 */
public class FrontendDeveloperTests {
  
  /**
   * Tests the functionality of loading the file and creating an instance of the backend
   * from the frontend class
   */
  public void FrontendTest1() {
    File file = new File("src/Madisonmap.csv");
    Backend backend = null;
    try {
      backend = new Backend(String[] args);
    }
    catch (Exception e){
      backend = new Backend(file);
    }
    // true if instance of backend is created and it is not null
    assertTrue(backend!=null);
  }
  
  /**
   * Tests the base functionality of the main two start and destination selection loops
   */
  public void FrontendTest2() {
    int menuInput = 30;
    int numLocations = 0;
    do {
    
     assertTrue(false);
     
    }  while(menuInput != 30 && numLocations == 0);
    
    menuInput = 0;
    numLocations = 1;
    do {
  
     assertTrue(false);
     } while (menuInput != 30 && numLocations == 1);
    // true if both the loops do not execute as defined by the parameters
    assertTrue(true);
  }
  
  /**
   * Tests the base functionality of the final loop of the Frontend
   */
  public void FrontendTest3() {
    int menuInput = 30;
    int numLocations = 1;
    do {
   
    assertTrue(false);
    } while (numLocations == 2);  
    // true if both the loops do not execute as defined by the parameters
    assertTrue(true);
  }
}
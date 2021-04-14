// --== CS400 File Header Information ==--
// Name: Junaid Ackroyd
// Email: jackroyd@wisc.edu
// Team: Red
// Group: GG
// TA: Surabhi
// Lecturer: Florian Heimerl
// Notes to Grader: n/a

import java.io.File;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Frontend {

    public static String getRoute(Backend backend, String start, String end) {
        return backend.getRoute(start, end);
    }

    public static int getCost(Backend backend, String start, String end) {
        return backend.getCost(start, end);
    }

    public static ArrayList<String> adjacentNodes(Backend backend, String data) {
        return backend.adjacentNodes(data);
    }

    public static void main(String[] args) throws IllegalArgumentException, NoSuchElementException {


        File file = new File("src/Madisonmap.csv");
        Backend backend = null;
        try {
            backend = new Backend(args);
        }catch (Exception e){
            backend = new Backend(file);
        }

        int menuInput = 0;
        int numLocations = 0;
        int start = 0;
        int end = 0;
        String strStart ="";
        String strEnd ="";

        do {
            System.out.println("Welcome to the Campus Map, Please select the starting location:");
            System.out.println("[1] Buffalo wild wings");
            System.out.println("[2] campus and randell");
            System.out.println("[3] Computer science building");
            System.out.println("[4] E.Campus mall and johnson");
            System.out.println("[5] Granger Hall");
            System.out.println("[6] Kohl center");
            System.out.println("[7] Lucky's");
            System.out.println("[8] N. charter and campus");
            System.out.println("[9] N. charter and Spring");
            System.out.println("[10] N. charter and W. Dayton");
            System.out.println("[11] N. mills and Regent");
            System.out.println("[12] N. orchard and campus");
            System.out.println("[13] N. orchard and Regent");
            System.out.println("[14] N. orchard and spring");
            System.out.println("[15] N.brooks and W. Dayton");
            System.out.println("[16] N.mills and campus");
            System.out.println("[17] N.mills and Spring");
            System.out.println("[18] N.mills and W.Dayton");
            System.out.println("[19] Nicholas rec center");
            System.out.println("[20] Ogg");
            System.out.println("[21] Qudoba");
            System.out.println("[22] randell and dayton");
            System.out.println("[23] regent and radell");
            System.out.println("[24] Sellery");
            System.out.println("[25] Spring Street and randell");
            System.out.println("[26] the red zone maddison");
            System.out.println("[27] union south");
            System.out.println("[28] Witte");
            System.out.println("[29] Gordens");
            System.out.println("[30] Exit the program \n");

            Scanner input = new Scanner(System.in);
            menuInput = input.nextInt();
            if (menuInput == 30) {
                System.exit(0);
            }

            if (menuInput > 30 || menuInput < 1) {
                System.out.println("The option you selected is out of range. Please select another");
            }

            if (menuInput != 0 && menuInput < 30 && menuInput > 0) {
                numLocations++;
                start = menuInput;
            }
        }  while(menuInput != 30 && numLocations == 0);


        do {
            System.out.println("Welcome to the Campus Map, Please select the starting location:");
            System.out.println("[1] Buffalo wild wings");
            System.out.println("[2] campus and randell");
            System.out.println("[3] Computer science building");
            System.out.println("[4] E.Campus mall and johnson");
            System.out.println("[5] Granger Hall");
            System.out.println("[6] Kohl center");
            System.out.println("[7] Lucky's");
            System.out.println("[8] N. charter and campus");
            System.out.println("[9] N. charter and Spring");
            System.out.println("[10] N. charter and W. Dayton");
            System.out.println("[11] N. mills and Regent");
            System.out.println("[12] N. orchard and campus");
            System.out.println("[13] N. orchard and Regent");
            System.out.println("[14] N. orchard and spring");
            System.out.println("[15] N.brooks and W. Dayton");
            System.out.println("[16] N.mills and campus");
            System.out.println("[17] N.mills and Spring");
            System.out.println("[18] N.mills and W.Dayton");
            System.out.println("[19] Nicholas rec center");
            System.out.println("[20] Ogg");
            System.out.println("[21] Qudoba");
            System.out.println("[22] randell and dayton");
            System.out.println("[23] regent and radell");
            System.out.println("[24] Sellery");
            System.out.println("[25] Spring Street and randell");
            System.out.println("[26] the red zone maddison");
            System.out.println("[27] union south");
            System.out.println("[28] Witte");
            System.out.println("[29] Gordens");
            System.out.println("[30] Exit the program \n");

            Scanner input = new Scanner(System.in);
            menuInput = input.nextInt();
            if (menuInput == 30) {
                System.exit(0);
            }

            if (menuInput > 30 || menuInput < 1) {
                System.out.println("The option you selected is out of range. Please select another");
            }

            if (menuInput != 0 && menuInput < 30 && menuInput > 0) {
                numLocations++;
                end = menuInput;
            }


        } while (menuInput != 30 && numLocations == 1);


        if (start == 1)
            strStart = "Buffalo wild wings";
        if (start == 2)
            strStart = "campus and randell ";
        if (start == 3)
            strStart = "Computer science building";
        if (start == 4)
            strStart = "E.Campus mall and johnson";
        if (start == 5)
            strStart = "Granger Hall";
        if (start == 6)
            strStart = "Kohl center";
        if (start == 7)
            strStart = "Lucky's";
        if (start == 8)
            strStart = "N. charter and campus";
        if (start == 9)
            strStart = "N. charter and Spring";
        if (start == 10)
            strStart = "N. charter and W. Dayton";
        if (start == 11)
            strStart = "N. mills and Regent";
        if (start == 12)
            strStart = "N. orchard and campus";
        if (start == 13)
            strStart = "N. orchard and Regent";
        if (start == 14)
            strStart = "N. orchard and spring";
        if (start == 15)
            strStart = "N.brooks and W. Dayton";
        if (start == 16)
            strStart = "N.Mills and campus";
        if (start == 17)
            strStart = "N.mills and Spring";
        if (start == 18)
            strStart = "N.mills and W.Dayton";
        if (start == 19)
            strStart = "Nicholas rec center";
        if (start == 20)
            strStart = "Ogg";
        if (start == 21)
            strStart = "Qudoba";
        if (start == 22)
            strStart = "randell and dayton";
        if (start == 23)
            strStart = "regent and radell";
        if (start == 24)
            strStart = "Sellery";
        if (start == 25)
            strStart = "Spring Street and randell";
        if (start == 26)
            strStart = "the red zone maddison";
        if (start == 27)
            strStart = "union south";
        if (start == 28)
            strStart = "Witte";
        if (start == 29)
            strStart = "Gordens";

        if (end == 1)
            strEnd = "Buffalo wild wings";
        if (end == 2)
            strEnd = "campus and randell";
        if (end == 3)
            strEnd = "Computer science building";
        if (end == 4)
            strEnd = "E.Campus mall and johnson";
        if (end == 5)
            strEnd = "Granger Hall";
        if (end == 6)
            strEnd = "Kohl center";
        if (end == 7)
            strEnd = "Lucky's";
        if (end == 8)
            strEnd = "N. charter and campus";
        if (end == 9)
            strEnd = "N. charter and Spring";
        if (end == 10)
            strEnd = "N. charter and W. Dayton";
        if (end == 11)
            strEnd = "N. mills and Regent";
        if (end == 12)
            strEnd = "N. orchard and campus";
        if (end == 13)
            strEnd = "N. orchard and Regent";
        if (end == 14)
            strEnd = "N. orchard and spring";
        if (end == 15)
            strEnd = "N.brooks and W. Dayton";
        if (end == 16)
            strEnd = "N.Mills and campus";
        if (end == 17)
            strEnd = "N.mills and Spring";
        if (end == 18)
            strEnd = "N.mills and dayton";
        if (end == 19)
            strEnd = "Nicholas rec center";
        if (end == 20)
            strEnd = "Ogg ";
        if (end == 21)
            strEnd = "Qudoba";
        if (end == 22)
            strEnd = "randell and dayton";
        if (end == 23)
            strEnd = "regent and radell";
        if (end == 24)
            strEnd = "Sellery";
        if (end == 25)
            strEnd = "Spring Street and randell";
        if (end == 26)
            strEnd = "the red zone maddison";
        if (end == 27)
            strEnd = "union south";
        if (end == 28)
            strEnd = "Witte";
        if (end == 29)
            strEnd = "Gordens";


        do {
            System.out.println("The Shortest Path from " + strStart + " to " + strEnd + " is:");
            System.out.println(getRoute(backend, strStart.trim(), strEnd.trim()));
            System.out.println("The cost of this Path is: " + getCost(backend, strStart, strEnd));
            System.out.println("The places adjacent to the current starting location are: ");
            System.out.println(adjacentNodes(backend, strStart));
            System.out.println("[1] Choose new locations");
            System.out.println("[2] Exit the program \n");

            Scanner input = new Scanner(System.in);
            menuInput = input.nextInt();

            if(menuInput == 1) {
                main(null);
            }
            if (menuInput == 2) {
                System.exit(0);
            }
        } while (numLocations == 2);

    }

}
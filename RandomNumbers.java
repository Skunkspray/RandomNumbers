// Jeff Blankenship
// CS-151
// Random Numbers

// This class shows random number generation
import java.util.Scanner;

public class RandomNumbers {

  public static void main(String[] args){
    
    //declare variables
    int number = 0;
    Scanner scan = new Scanner(System.in);
    String answer = "";
    final int MAX = 10;  //Randoms will be in range [1,MAX]
    
    boolean keepGoing = true;
    
    //Keep printing new randoms until user enters n
    while (keepGoing){
      System.out.print("Keep going? (y/n): ");
      answer = scan.nextLine();
      answer = answer.toLowerCase();
      if (answer.equals("y")){
        // Print a new random
        number = (int) (Math.random()*MAX +1);
        System.out.println("Next random number is: " + number);
      } else if (answer.equals("n")) {
        // exit the loop without printing anything
        keepGoing = false;
      } else {
        // ask for valid input
        System.out.println("You must enter y or n.");
      } //if (answer.equals("y")){
    }//while (keepGoing){
      
  } // end main
} // end RandomNumbers

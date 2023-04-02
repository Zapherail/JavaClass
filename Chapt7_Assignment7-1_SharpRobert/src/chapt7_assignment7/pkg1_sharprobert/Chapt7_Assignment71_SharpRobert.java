package chapt7_assignment7.pkg1_sharprobert;
import java.util.Scanner;
/**
 * Robert Sharp
 * March/25/2023
 * Programming 1
 * Professor Mitchell Frogge
 */
public class Chapt7_Assignment71_SharpRobert {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //bring scanner in
        Contact userInfo  = new Contact(); //creating userInfo and calling the class
        
      String choice = "y"; //string choice for while loop
      while (choice.equalsIgnoreCase("y")) { //staring while loop
        
        userInfo.getFirstName(); //getting user's first name sending it to Contact class line 18-21 zoom meating, slides, pg209
        userInfo.getLastName(); //getting user's last name sending it to Contact class
        userInfo.getEmail(); //getting user's email sending it to Contact class
        userInfo.getPhone(); //getting user's phone sending it to Contact class
        
        System.out.println("------------------------------"); //line 23-25 is display 
        System.out.println("----CurrentContact------------");
        System.out.println("------------------------------");
        
       userInfo.displayContact(); //printing results from Contact class pg 209, zoom meeting, slides
       
       System.out.println("---------------------"); // display
       
       System.out.print("Continue? (y/n): "); //asking user if they want to end while loop
      choice = sc.nextLine();//saving choice to be checked
       
      }// end of while loop
    }//End of main methodR
    
    
}//End of Chapt7_Assignment71_SharpRobert

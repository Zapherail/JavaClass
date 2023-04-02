package chapt7_assignment7.pkg1_sharprobert;
import java.util.Scanner; //Importing Scanner
public class Contact { //Creating new class named Contact
    private String firstName; //lines 4-7 setting instance variables pg 203, zoom, slides
    private String lastName;
    private String email;
    private String phone;
    
    public Contact() { // lines 9-20 setting constructors pg 205, zoom meeting, slides
        firstName = "";
        lastName = "";
        email = "";
        phone = "";
    } //end of Contact
    
    public Contact (String name, String email, String phone) {
        this.firstName = name;
        this.lastName = name;
        this.email = email;
        this.phone = phone;
    } //end of Contact
    
    Scanner sc = new Scanner(System.in); //Bring Scanner in
    
    public void setFirstName(String name) { // setting methods from assignment
        this.firstName = name; //setting name to firstName pg 207, zoom meeting, slides
    } //End of setFirstName

    public String getFirstName(){ // setting methods from assignment
        System.out.print("Enter first name: "); //asking user for data
        firstName = sc.nextLine(); //saving that data to firstName
        return firstName; // returning firstName with new data pg 207, zoom meeting, slides
    }// End of getFirstName

    public void setLastName(String name) { // setting methods from assignment
        this.lastName = name; //setting lastname to method name. pg 207, zoom meeting, slides
    }//End of setLastName

    public String getLastName() { // setting methods from assignment
        System.out.print("Enter last name: "); //asking user for data
        lastName = sc.nextLine(); // saving that data to lastName pg 207, zoom meeting, slides
        return lastName; //returning lastName with new data pg 207, zoom meeting, slides
    }//End of getLastName

    public void setEmail(String email) { // setting methods from assignment
        this.email = email; //this.email to method email pg 207, zoom meeting, slides
    }// End of setEmail

    public String getEmail() { // setting methods from assignment
        System.out.print("Enter email: "); //asking user for data
        email = sc.nextLine();// saving that data to email pg 207, zoom meeting, slides
        return email;//retuning email with new data pg 207, zoom meeting, slides
    }//End of getEmail

    public void setPhone(String phone) { // setting methods from assignment
        this.phone = phone; //setting this.phone to phone method pg 207, zoom meeting, slides
    }//End of setPhone

    public String getPhone() { // setting methods from assignment
        System.out.print("Enter phone: "); //asking user for data
        phone = sc.nextLine();// saving that data to phone pg 207, zoom meeting, slides
        return phone;//returing phone with new data pg 207, zoom meeting, slides
    }//End of getPhone

    public void displayContact() { // setting methods from assignment
       System.out.println("Name " + firstName + " " + lastName); // lines 66-68 displaying information pg 209, zoom meeting, slides
       System.out.println("Email Address: " + email);
       System.out.println("Phone Number: " + phone);
       
        
    }//End of displayContact
}//End of public class contact

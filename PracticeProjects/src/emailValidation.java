
import java.util.ArrayList;
import java.util.Scanner;

public class emailValidation {

	public static void main(String[] args) {
		String search;
	
         ArrayList<String> email_ID = new ArrayList<String>();
         
         Scanner input = new Scanner(System.in);
         
         
        email_ID.add("sarah@gmail.com");
        email_ID.add("abc34@gmail.com");
        email_ID.add("shuguy@yahoo.com");
        email_ID.add("hari@gmail.com");
        email_ID.add("vignesh@yahoo.com");
       
        
        System.out.println("Enter the EmailID to be search");
        search=input.nextLine();
   
        if(email_ID.contains(search))
        {
            System.out.println( "Email ID " + search + " found");
        }
        else
        {
        	System.out.println( "Email ID " + search + " not found");
        }
        
                
	}

}
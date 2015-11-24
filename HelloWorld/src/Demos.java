 
import java.io.*;
 
public class Demos {
 
    public static void main(String[] args) {
 
        // using InputStreamReader
     
        Console console = System.console();
        if (console == null) {
            System.out.println("No console: not in interactive mode!");
            System.exit(0);
        }
 
        System.out.print("Enter your username: ");
        String username = console.readLine();
         
        System.out.print("Enter your password: ");
        char[] password = console.readPassword();
 
        System.out.println("Thank you!");
        System.out.println("Your username is: " + username);
        System.out.println("Your password is: " + String.valueOf(password));
 
        // using Console with formatted prompt
        String job = console.readLine("Enter your job: ");
         
        String passport = console.readLine("Enter your %d (th) passport number: ", 2);
 
        System.out.println("Your job is: " + job);
        System.out.println("Your passport number is: " + passport);
    }  
}
// Personal Inforamtion - Java Practice 0 

import java.util.Scanner;

public class Project_0{

    static void clearConsole(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) throws InterruptedException
    {
       
    /*
     * Create a program that displays the following information: Name, address with city, state, and ZIP, phone number, and college major.
     * 
     */
        Scanner myObj = new Scanner(System.in); // Creates a scanner object

        System.out.print("Enter Name: ");
        String name = myObj.nextLine(); 
        
        System.out.print("Enter City: ");
        String city = myObj.nextLine();

        System.out.print("Enter State: ");
        String state = myObj.nextLine(); 
        
        System.out.print("Enter ZIP code: ");
        String zipCode = myObj.nextLine();

        System.out.print("Enter Phone Number: ");
        String phoneNumber = myObj.nextLine();
        
        System.out.print("Enter College Major: ");
        String collegeMajor = myObj.nextLine();

        clearConsole();

        String userInfo = String.format("Name: " + name + "\n" + "State: " + state + "\n" + "ZIP: " + zipCode + "\n" + "Phone Number: " + phoneNumber + "\n" + "College Major: " + collegeMajor );
        System.out.println("-Here is your info- \n" + userInfo);
    }
}
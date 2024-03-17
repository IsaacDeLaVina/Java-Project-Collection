// The Area of the Triangle - Java Practice 2

import java.util.Scanner;

public class Project_2 {

    static void clearConsole(){
        System.out.print("\003[H\033[2J");
        System.out.flush();
    }
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter side a: ");
        double length_a = userInput.nextDouble();

        System.out.print("Enter side b: ");
        double length_b = userInput.nextDouble();

        System.out.print("Enter side c: ");
        double length_c = userInput.nextDouble();

        
        double s = (length_a + length_b + length_c) /2; 
        double area = s * (s - length_a) * (s - length_b) * (s - length_c); 
        double areaSqrt = Math.sqrt(area);  // Learn about the math library. -_- 

        clearConsole();

        System.out.println("Side A: " + length_a + "\nSide B: " + length_b + "\nSide C: " + length_c);
        System.out.println("Area of the Triangle: " + areaSqrt);

        


        

    }
}
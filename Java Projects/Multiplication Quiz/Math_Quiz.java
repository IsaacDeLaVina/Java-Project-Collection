import javax.swing.JOptionPane;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

public class Math_Quiz{
      public static void main(String[] args){
        // User stores the number of questions in the strNumber variable. 
        String strNumber;
        int correctAnswers = 0; // Stores the amount of right attempts from the user. This is used as a tally variable.

        // Create a random object
        Random randNum = new Random();
        
        // Prompts the user for the number of math equations he/she likes to solve. 
        strNumber = JOptionPane.showInputDialog("How many questions would you like to solve?");
        int numOfEquations = Integer.valueOf(strNumber); // Converts the string to an integer. 
        

        // This for loop generates the number of math problems provided by the user.
        for(int counter = 1;counter <= numOfEquations; counter++){
                
                // Get a random int from the random object and assign it to num1 and num 2.
                int num1 = randNum.nextInt(20) + 1;
                int num2 = randNum.nextInt(20) + 1; // Add 1 is used to create a range between 1 and 20.

                // This stores the answer from the multiplication equation. 
                int answer = num1 * num2;
                
                // Converts the random generated numbers into string to JOption will read it.
                String num1String = Integer.toString(num1);
                String num2String = Integer.toString(num2);

                // Displays an equation that multiplies two random numbers and prompts the user for an answer to the equation.
                String userAnswerString = JOptionPane.showInputDialog(num1String + " * " + num2String + " = ?" );
                int userAnswerInt = Integer.parseInt(userAnswerString);

                // This notifies the user if he/she is correct or not. 
                if (userAnswerInt == answer){
                    JOptionPane.showMessageDialog(null, "Correct!");
                    correctAnswers++; // This tally variable keeps in track of correct answers from the user's attempt.
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect!");
                }
        }

        // Displays how many attempts were right out of the how many questions were given.
        JOptionPane.showMessageDialog(null, "You got " + correctAnswers + " out of " + numOfEquations + " correct. "); 

        // Shows the percentage of the questions that the user attempted correctly.
        DecimalFormat df = new DecimalFormat("#.#");  // Formats the decimal places by 1.
        double percentageOfQuestions = (double)correctAnswers / (double)numOfEquations * 100; // Calculates the user's average score. 
        df.setRoundingMode(RoundingMode.UP); // Rounds the decimal number by 1 
        JOptionPane.showMessageDialog(null, "Which is " + df.format(percentageOfQuestions) + "%"); // Displays the user's score.

        // Provides a certain message based on their average score.
        if (percentageOfQuestions >= 90){
            JOptionPane.showMessageDialog(null,"You did an outstanding job!");
        } else if (percentageOfQuestions >= 80 && percentageOfQuestions < 90){
            JOptionPane.showMessageDialog(null, "You performed very well!");
        } else if (percentageOfQuestions >= 70 && percentageOfQuestions < 80){
            JOptionPane.showMessageDialog(null, "You put good effort into this! Keep it up!");
        } else if (percentageOfQuestions < 70){
            JOptionPane.showMessageDialog(null,"You need to practice your multiplication. Don't give up and keep learning!");
        }
  


     

        // Exits this Program.
        System.exit(0);
    }
}





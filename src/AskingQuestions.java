import java.util.Scanner;

public class AskingQuestions
{
    public static void main( String[] args )
    {
        // Create a scanner object
        Scanner keyboard = new Scanner(System.in);

        // Declare variables
        double num1, num2;

        // Prompt the user for the first temperature and store it
        System.out.print( "First temperature? " );
        num1 = keyboard.nextDouble();

        // Prompt the user for the second temperature and store it
        System.out.print( "Second temperature? " );
        num2 = keyboard.nextDouble();

        // Display the average temperature to the user
        System.out.println("The average value is : " + (num1 + num2)/2);
    }
}
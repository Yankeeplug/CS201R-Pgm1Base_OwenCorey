import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    
    //create variables
    Scanner scanner = new Scanner(System.in);
    int inValue;

    //practice input
    System.out.println("Please enter your next value: ");
    inValue = scanner.nextInt();
    System.out.println("Why did you enter " + inValue + "?");

    //setting up other variable types
    char letter = 'A';
    String words = "The Words";

    //TASK 1:
    //add code to input a string that replaces the value in 'words'
    System.out.printf("%s Are: Apple, Banana, and Orange.\n", words);
    //print the string



    //TASK 2:
    //add code to input a new value for the variable 'letter'
    //'letter' is defined in line 18
    

    //TASK 3:
    //if the letter entered is A or B - print "You did GREAT!"
    //if the letter is C - print "You did GOOD!"
    //if the letter is D or F - print "Try again"
    //if the letter is something else, print "Incorrect value"


    //LECTURE 1 DEMO:
    //this is demonstrating different values
    String bigTheta = "\u0398";

    System.out.println(bigTheta + "    \u03B1" + "   " + 0b1111);
    

    //LECTURE 1 DEMO:
    //formatting values for output
    double value = 16.404674;
    System.out.printf("Value is $%4.2f", value);

    scanner.close();
  }

}

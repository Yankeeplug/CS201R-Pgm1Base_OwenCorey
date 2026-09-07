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
    words = "Some new words!";
    //print the string
    System.out.println(words);


    //TASK 2:
    //add code to input a new value for the variable 'letter'
    //'letter' is defined in line 18
    System.out.println("Please enter your grade.");
    String tempString = scanner.next();
    char tempLetter = tempString.charAt(0);
    letter = Character.toUpperCase(tempLetter);
    //System.out.println(letter);

    //TASK 3:

    char aGrade = 'A';
    char bGrade = 'B';
    char cGrade = 'C';
    char dGrade = 'D';
    char fGrade = 'F';

    //if the letter entered is A or B - print "You did GREAT!"
    if (letter == aGrade || letter == bGrade)
    {
        System.out.println("You did GREAT!");
    }
    //if the letter is C - print "You did GOOD!"
    else if (letter == cGrade)
    {
        System.out.println("You did GOOD!");
    }
    //if the letter is D or F - print "Try again"
    else if (letter == dGrade || letter == fGrade)
    {
        System.out.println("Try again");
    }
    //if the letter is something else, print "Incorrect value"
    else
    {
        System.out.println("Incorrect value");
    }

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

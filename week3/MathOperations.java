package week3;
import java.util.Scanner;


/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
public static void main (String[]arg){
    Scanner input= new Scanner (System.in);
    System.out.println("Enter the first number");
    double a= input.nextDouble();
    
    System.out.println("Enter the second number");
    double b= input.nextDouble();
    
    if (a>b) {
        System.out.println("The first number (" + a + ") is greater.");
    } else if (a<b){
        System.out.println("The second number (" + b + ") is greater.");
    } else {
        System.out.println("Both the numbers are equal.");
    }
        input.close ();
    }
    }
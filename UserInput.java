import java.util.Scanner;

/**
 * Write a description of class UserInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInput
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the firstNumber");
        int firstNumber=sc.nextInt();
        
        System.out.println("Enter the secondNumber");
        int secondNumber=sc.nextInt();
        int sum=firstNumber+secondNumber;
        int bigger=(firstNumber>secondNumber)?firstNumber:secondNumber;
        System.out.println("GreatestNumeber is"+bigger);
        
        System.out.println("sum of two number is"+sum);
    }
}
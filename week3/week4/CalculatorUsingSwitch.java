package week3.week4;
import java.util.Scanner;

/**
 * Write a description of class CalculatorUsingSwitch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalculatorUsingSwitch
{
    public static void main(String[]arg)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        System.out.println("Enter the operator as + - * /");
        char operator=sc.next().charAt(0);
        
        switch(operator)
        {
        case '+': System.out.println("addition is"+(num1+num2));
    break;
    case '-': System.out.println("substraction is"+(num1-num2));
    break;
    case '*': System.out.println("multiplication is"+(num1*num2));
    break;
    case '/': System.out.println("division is"+(num1/num2));
    }
    }
}
import java.util.Scanner;

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the first number:");
        double a= input.nextDouble();

        System.out.println("Enter the second number:");
        double b= input.nextDouble();
        
        double Sum =a+b;
        double Difference =a-b;
        double Product =a*b;
        double Quotient =a/b;
        double Remainder =a%b;

        
        System.out.println("The sum is=" +Sum);
        System.out.println("The difference is=" +Difference);
        System.out.println("The product is=" +Product);
        System.out.println("The quotient is=" +Quotient);
        System.out.println("The remainder is=" +Remainder);
        
         if (a > b) {
            System.out.println("The first number (" + a + ") is greater.");
        } else if (a < b ){
            System.out.println("The second number (" + b + ") is greater.");
        } else {
            System.out.println("Both numbers are equal.");
        }

        input.close();
    }
}



package week3.week4;
import java.util.Scanner;

/**
 * Write a description of class NestedExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NestedExample
{
    public static void main(String[]arg){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        if (number%3==0)
        {
            if (number%5==0)
            {
                System.out.println("Divided both by 3 and 5");
            } else 
            {
                System.out.println("Divided by 3 and not divided by 5");
            }
        }
    } 
} 
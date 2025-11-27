package week3.week4;
import java.util.Scanner;


/**
 * Write a description of class threefive here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class threefive
{
    public static void main(String[]arg){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        double number= sc.nextDouble();
        
        if(number%3==0 && number%5==0){
            System.out.println("The number is divisible by both 3 and 5");
        } 
        else 
        {
            System.out.println("The number is not divisible by both 3 and 5");
        }
        }
    }
package week3.week4;
import java.util.Scanner;

/**
 * Write a description of class ResultSystem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ResultSystem
{
    public static void main (String[]arg){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the percentage");
        int percentage=sc.nextInt();
        if(percentage<=100 && percentage >=95)
        {
            System.out.println("Distinction");
        }
        else if((percentage<=94 && percentage>=80)){
            System.out.println("FirstDivision");
        }
        else if((percentage<=79 && percentage>=68)){
            System.out.println("SecondDivision");
        }
        else if((percentage<=67 && percentage>=55)){
            System.out.println("ThirdDivision");
        }
        else 
        {
            System.out.println("Fail");
        }
    }
}
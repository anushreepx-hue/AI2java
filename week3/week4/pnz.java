package week3.week4;
import java.util.Scanner;

/**
 * Write a description of class pnz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pnz
{
    public static void main(String[] arg){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number");
        double number= sc.nextDouble();

        if(number>0)
        { 
            System.out.println("The numnber is positive");
        }
        else if (number<0)
        { 
            System.out.println("The number is negitive");
        }
        else { System.out.println("The number is zero");
        } 
    } 
}    
package week3;
import java.util.Scanner;


/**
 * Write a description of class second here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class second
{
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the total seconds: ");
        double totalseconds = input.nextDouble();
        
        double hours = totalseconds / 3600;
        double remainingseconds = totalseconds % 3600;
        
        double minutes = remainingseconds / 60;
        double seconds = remainingseconds % 60;
        
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
        
        input.close();
    }
} 
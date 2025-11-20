package week3;
import java.util.Scanner;


/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluator
{
    public static void main(String[] arg){
      Scanner input = new Scanner (System.in);  
      
      System.out.println("Enter your numeric grade");
      double grade = input.nextDouble();
      String result = (grade >= 40) ? "Pass" : "Fail";
      System.out.println("Result: " + result);
    }
}
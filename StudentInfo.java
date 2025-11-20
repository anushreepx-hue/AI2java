import java.util.Scanner;
/**
 * Write a description of class StudentInfo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentInfo
{
public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter student's name: ");
    String name = input.nextLine();
    
    System.out.println("Enter student's age: ");
    int age = input.nextInt();
    
    System.out.println("Enter student's GPA: ");
    double GPA =input.nextDouble();

    System.out.println("\n----STUDENT INFO----");
    System.out.println("Name: " + name);
    System.out.println("Age:" + age);
    System.out.printf("GPA: %.2f\n", GPA);
    
    input.close();
}
    }
    
    


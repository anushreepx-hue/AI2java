package week3.week4;
import java.util.Scanner;


/**
 * Write a description of class discount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class discount
{
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        float mp, discount=0;
        char category;
        
        System.out.println("Enter the mp");
        mp=sc.nextFloat();
        
        System.out.println("Enter the category A/B/C/D): ");
        category= sc.next().charAt(0);
        category = Character.toUpperCase(category);
        
        if (category=='A')
        { discount =60;}
        else if (category=='B')
        { discount = 40;}
        else if (category=='C')
        { discount = 20;}
        else if (category =='D')
        {discount = 10;}
        else { System.out.println("Invalid category");
            return;
        }
        float sp=mp-(mp*discount/100);
        System.out.println("Discount:" + discount + "%");
        System.out.println("Selling Price:" + sp);
    }
}

        
        
    
        
        
        
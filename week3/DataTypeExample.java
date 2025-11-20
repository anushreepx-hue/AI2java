package week3;

/**
 * Write a description of class DataTypeExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataTypeExample
{
    public static void main(String[]arg){
        System.out.println(Float.MAX_VALUE + "\n" + Float.MIN_VALUE + "\n" + Float.BYTES + "\n" + Float.SIZE);
        System.out.println("My name is \"Anushree\" ");
        
        byte b=12;
        byte d=13;
        byte e= (byte) (b+d);
        float f=233.3f;
        long l=200;
        
        int a=20;
        float g=2.33f;
        double h=2.334;
        
        int x=(int)(a+g+h);
        
        int c=50;
        System.out.println((char)c);
        
        int length=10;
        int breadth=20;
        int Area=(int) (length+breadth);
        int Perimeter= (int) (2*(length+breadth));
        System.out.println("The area of the rectangle is" + Area);
        System.out.println("The perimeter is" + Perimeter);
        
        int principle=500;
        int time=2;
        float rate=2.4f;
        
        int SI=(int) (principle*time*rate);
        System.out.println("The simple interset is" + SI);
        
        double amount = principle *Math.pow((1+rate/100),time);
        int CI=(int)(amount-principle);
        
        System.out.println("The compound interest is"+CI);
        
        
        
        
    
        
        
    } 
}
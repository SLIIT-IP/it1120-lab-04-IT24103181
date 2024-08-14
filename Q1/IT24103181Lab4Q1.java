import java.util.Scanner;

public class IT24103181Lab4Q1 {
   public static void main(String[]args)
{
     Scanner input =new
Scanner(System.in);
     System.out.print(" Enter a number");
       
     int number = input.nextInt();
   
String result = (number > 0)? "positive" :
(number <0) ? "Negative" : "zero";
               System.out.println("The number is "+ result+".");

      }
}
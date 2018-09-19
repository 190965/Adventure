import java.util.Scanner;
public class Adventure extends Variables
{
   public static void main(String[] args){
      
       Scanner input = new Scanner(System.in);
       
       System.out.println("Please enter your name: ");
       String name = input.next();
       
       System.out.println("Hi " + name + " let's begin");
       Variables.place1(name);
    }
}
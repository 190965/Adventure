import java.util.Scanner;
public class Variables 
{
    public static void place1(String name)
    {
       Scanner input = new Scanner(System.in);
    

       //question
       System.out.println("You have the ball with one second left on the clock\n");
       System.out.println("Do you 'shoot' the ball or 'pass' it?");
       System.out.println("--------------------------------");
       String s = input.next();
       
       if(s.equals("shoot"))
       {
           System.out.println("You shoot the ball for three and it goes in!\n you won the game!");
        }
       
       else if(s.equals("pass"))
       {
           System.out.println("You pass the ball and your teammate goes for the dunk but gets blocked\n you lose the game.");
        }
       else
       {
           System.out.println("Sorry, that was not an option, please try again");
           Variables.place1(name);
        }
      
      
    }
    
}

import java.util.ArrayList;
import java.util.Scanner;

public class ListMaker
{
   public static void main (String [] args)
   {
       Scanner in = new Scanner(System.in);
       ArrayList<String> myArrList = new ArrayList<>();
       String menuSelection = "";
       boolean done = false;
       do
       {
           System.out.println("\nMenu Options:");
           System.out.println("A - Add an item to the list");
           System.out.println("D - Delete an item from the list");
           System.out.println("I - Insert an item into the list");
           System.out.println("P - Print the list");
           System.out.println("Q - Quit the program");
           System.out.println("------------------------------");
           menuSelection = SafeInput.getRegExString(in, "\nEnter a menu selection [add, delete, insert, print, or quit]: ", "[AaDdIiPpQq]");
           switch (menuSelection.toUpperCase ())
           {
               case "A":
                   // Add an item
                   break;
               case "D":
                     // Delete an item
                   break;
               case "I":
                   // Insert an item
                   break;
               case "P":
                   // Print the list
                   break;
               case "Q":
                   // Quit the program
                   break;
           }
       } while (!done);

   }
}
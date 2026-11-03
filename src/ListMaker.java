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
           printList(myArrList);

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
                   addItem(in, myArrList);
                   break;
               case "D":
                   deleteItem(in, myArrList);
                   break;
               case "I":
                   insertItem(in, myArrList);
                   break;
               case "P":
                   printList(myArrList);
                   break;
               case "Q":
                   done = quitProgram(in);
                   break;
           }
       } while (!done);

   }
   public static void addItem(Scanner pipe, ArrayList<String>list)
   {
      String item = "";
      item = SafeInput.getNonZeroLenString(pipe, "Enter an item to add to the list: ");
      list.add(item);
      System.out.println("Item added.");
   }
   public static void deleteItem(Scanner pipe, ArrayList<String>list)
   {
       if (list.isEmpty())
       {
         System.out.println("The list is empty. There are no items to delete.");
       }
       else
       {
         printList(list);
         int itemNum = SafeInput.getRangedInt(pipe, "Enter the number of the item you want to delete: ", 1, list.size());
         itemNum = itemNum-1;
         list.remove(itemNum);
         System.out.println("Item deleted.");
       }
   }
   public static void insertItem(Scanner pipe, ArrayList<String>list)
   {
        int itemNum = SafeInput.getRangedInt(pipe, "Enter the location where you want to insert the item: ", 1, list.size() + 1);
        itemNum = itemNum-1;
        String item = SafeInput.getNonZeroLenString(pipe, "Enter the item you want to insert: ");
        list.add(itemNum, item);
        System.out.println("Item inserted.");
   }
   public static void printList(ArrayList<String>list)
   {
      if (list.isEmpty())
      {
         System.out.println("The list is empty. There are no items to print. ");
      }
      else {
          for (int i = 0; i < list.size(); i++)
          {
              System.out.println(i + 1 + ". " + list.get(i));
          }
      }
   }
   public static boolean quitProgram(Scanner pipe)
   {
       boolean confirm = SafeInput.getYNConfirm(pipe, "Are you sure you want to quit the program?");
       if (confirm)
       {
           System.out.println("Thank you for using the program. Goodbye!");
       }
       return confirm;
   }
}

package Conditionals;

import java.util.Scanner;

public class SwitchCase {
     public static void main(String[] args) {
          try (Scanner scan = new Scanner(System.in)) {
               // declare varible
               String TimeTable;
               
               /** ---------- Switch Statement ----------- */
               System.out.println("Your Day Name: ");
               TimeTable = scan.next();

               switch (TimeTable) {
                    case "sun":
                         System.out.println("Computer Networking");
                         break;
                    case "mon":
                         System.out.println("JavaDSA, Mern Stack");
                         break;
                    case "tue":
                         System.out.println("JavaDSA, Mern Stack");
                         break;
                    case "wed":
                         System.out.println("JavaDSA, Mern Stack");
                         break;
                    case "thu":
                         System.out.println("JavaDSA, Mern Stack");
                         break;
                    case "fri":
                         System.out.println("JavaDSA, Mern Stack");
                         break;
                    case "sat":
                         System.out.println("Computer Networking");
                         break;
                    default:
                         System.out.println("HoliDay !!");
               }
          }
     }
}

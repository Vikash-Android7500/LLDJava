package Methods;

import java.util.Scanner;

public class Practic {
     public static void main (String[] args) {
          try(Scanner scan = new Scanner(System.in)) {
               int Number;
               System.out.println("Enter the value of Name: ");
               Number = scan.nextInt();
               printName(Number);
          }
     }

     /* write a function to your Name "Number" Times */ 
     public static void printName (int name) {
          for (int col = 1; col <= name; col++) {
               System.out.println("vikash");
          }
     }
}

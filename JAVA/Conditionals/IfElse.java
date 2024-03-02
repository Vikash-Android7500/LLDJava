package Conditionals;

import java.util.Scanner;

public class IfElse {
     public static void main(String[] args) {
          try (Scanner scan = new Scanner(System.in)) {
               // declare varible
               int Age;
               int income;

               System.out.println("Your Age: ");
               Age = scan.nextInt();

               System.out.println("Your income: ");
               income = scan.nextInt();

               System.out.println();
               /** ---------- if else ----------- */

               if (Age <= 18) {
               System.out.println("Vote Nahi Dal sakte ho: " + Age);
               } else {
               System.out.println("vote Dal sakte Ho: " + Age);
               }

               if (income >= 150000) {
               System.out.println("Main Ameer Hu: " + income);
               } else {
               System.out.println("Main Ameer Nahi hu: " + income);
               }
          } 
     }
}

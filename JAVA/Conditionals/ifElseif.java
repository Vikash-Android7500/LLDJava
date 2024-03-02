package Conditionals;

import java.util.Scanner;

public class ifElseif {
     public static void main(String[] args) {
          try (Scanner scan = new Scanner(System.in)) {
               // declare varible
               int income;

               System.out.println("Your income: ");
               income = scan.nextInt();

               /** --------- if else if ------------- */
               if (income > 100000) {
               System.out.println("you are among top 5% indians : " + income);
               } else if (income > 90000) {
               System.out.println("You are among top 10% indians: " + income);
               } else if (income > 50000) {
               System.out.println("You are among top 20% indians: " + income);
               } else if (income > 30000) {
               System.out.println("You are among top 40% indians: " + income);
               } else if (income > 20000) {
               System.out.println("You are among top 50% indians: " + income);
               } else {
               System.out.println("Aap kahin toh aare ho: " + income);
               }
          }
     }
}

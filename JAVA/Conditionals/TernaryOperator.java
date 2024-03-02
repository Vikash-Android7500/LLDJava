package Conditionals;

import java.util.Scanner;

public class TernaryOperator {
     public static void main(String[] args) {
          try (Scanner scan = new Scanner(System.in)) {
               // declare varible
               int businessIncome;
               // /**--------- Ternary Operator ----------*/

               System.out.println("Ternary Operator \n\n" + "Your Business Income: ");
               businessIncome = scan.nextInt();
               System.out.println((businessIncome >= 500000) ? "Main Ameer Hu: " + businessIncome 
                              : "Main Ameer Nahi hu: " + businessIncome);
          }
     }
}
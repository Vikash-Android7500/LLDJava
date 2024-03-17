package Methods;

import java.util.Scanner;

public class PracticSecond {
     public static void main(String[] args) {
          try(Scanner scan = new Scanner(System.in)) {
               int item;
               System.out.println("Enter the value of Name: ");
               item = scan.nextInt();
               sumPrinting(item);
          }
     }

     /*write a function to print the sum from 1 to Number */
     public static void sumPrinting (int Number) {
          int sum = 0;

          for (int num = 1; num <= Number; num++) {
               sum = sum + num;
          }
          System.out.println("Print sum: " + sum);

     }
}

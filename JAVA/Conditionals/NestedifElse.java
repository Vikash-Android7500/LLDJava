package Conditionals;

import java.util.Scanner;

public class NestedifElse {
     public static void main(String[] args) {
          try (Scanner scan = new Scanner(System.in)) {
               // declare varible
               int Age;
               boolean knowDriving;

               /** ----------------- Nested if else -------------------- */
               System.out.println("Your Age: ");
               Age = scan.nextInt();
               
               System.out.println("Driving Aati hai Ya nahi : true, false");
               knowDriving = scan.nextBoolean();

               /** Bad Practice */
               if (Age > 18) {
               System.out.println("Your age is: " + Age);
               if (knowDriving) {
               System.out.println("You can get a license: ");
               } else {
               System.out.println("Pehle Driving seeko: ");
               }
               } else {
               System.out.println("Pehle bade ho to jao license ke liye: ");
               }

               /** Good Practice && dono condition sahi honi chahiye */
               // if (Age > 18 && knowDriving) {
               // System.out.println("You will get a license");
               // } else {
               // System.out.println("Either you are < 18 or you dont know how to drive: ");
               // }

               // /** Good Practice || dono condition me se ek sahi honi chahiye */
               // if (Age > 18 || knowDriving) {
               // System.out.println("You will get a license");
               // } else {
               // System.out.println("Either you are < 18 or you dont know how to drive: ");
               // }
          }
     }
}

package Arrays;

import java.util.Scanner;

public class practice {
     public static void main(String[] args) {
          // int arr[] = {10, 30, 20, 50, 40};
          // taking input in array
          try (Scanner scan = new Scanner(System.in)) {
               int size;
               System.out.println("Enter The Size of Array: ");
               size = scan.nextInt();
               int arr[] = new int[size];

               for (int count = 1; count <= size; count++) {
                    int index = count - 1;
                    System.out.println("Enter the value for index: " + index);
                    arr[index] = scan.nextInt();
               }

               // Array Printing
               for (int I : arr) {
                    System.out.println(I);
               }

               /* All input Sum */
               int sum = 0;
               for (int number : arr) {
                    sum = sum + number;
               }
               System.out.println("Total Sum: " + sum);

          }
     }
}
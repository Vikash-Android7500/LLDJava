package Arrays;

public class MimiNumber {
     public static void main(String[] args) {
          int arr[] = {100, 50, 20, 150, -5, 250, -50, 12, 16};
          int mini = Integer.MAX_VALUE;

          for(int num : arr) {
               if (num < mini) {
                    mini = num;
               }
          }
          System.out.println("MiniMum Number: " + mini);
     }
}

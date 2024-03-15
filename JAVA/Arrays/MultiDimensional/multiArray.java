package Arrays.MultiDimensional;

public class multiArray {
     public static void main(String[] args) {
          // int arr[][] = new int [4][5];

          int arr[][] = {
               {2, 4, 6, 20 },
               {1, 3, 5, 50 }, 
               {10, 20, 30, 60}
          };

          // printing for EachLoop
          for (int[] temp : arr) {
               for (int num : temp) {
                    System.out.print(num + " ");
               }
               System.out.println();
          }
     }
}

package Arrays.MultiDimensional;

public class forLoop {
     public static void main(String[] args) {
          // int arr[][] = new int [4][5];

          int arr[][] = {
                    { 2, 4, 6 },
                    { 1, 3, 5 },
                    { 10, 20, 30 }
          };

          int rowSize = arr.length;
          // int colSize = arr[0].length;

          for (int rowIndex = 0; rowIndex < rowSize; rowIndex++) {
               for (int colIndex = 0; colIndex < rowSize; colIndex++) {
                    System.out.print(arr[rowIndex][colIndex] + " ");
               }
               System.out.println();
          }
     }
}

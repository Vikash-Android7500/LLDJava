package Methods.FunctionAndArray;

public class FA1 {
     public static void main(String[] args) {
          int arr[] = {10,20,30,45,87,65};
          printArray(arr);
     }

     /* write to print the Array */
     public static void printArray (int arr[]) {
          for (int element : arr) {
               System.out.println(element);
          }
     }
}

package Methods.FunctionAndArray;

public class FA2 {
     public static void main(String[] args) {
          int arr[] = { 10, 20, 30, 40, 50, 60 };
          doubleArrayValues(arr);
     }

     /* write to double the value present inside the array */
     public static void doubleArrayValues (int arr[]) {
          for (int element : arr) {
               System.out.println((element * 2));
          }
     }
}
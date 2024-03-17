package Methods.FunctionAndArray;

public class FAreturn {
     public static void main(String[] args) {
          int arr[] = {10,20,30,40,50,60};
          int result  = getArray(arr);

          System.out.println(result);
     }

     /*write to return the value present inside the array */
     public static int getArray (int arr[]) {
          int sum = 0;
          for (int element : arr) {
               sum = sum + element;
          }
          return sum;
     }
}
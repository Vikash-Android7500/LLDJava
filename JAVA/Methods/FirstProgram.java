package Methods;

public class FirstProgram {
     public static void main (String[] args) {
         callMyName();
         int result = getSum(50, 60);
         String result2 = getSum("Vikas ", "Kushwaha");
         
         System.out.println("GetSum: " + result);
         System.out.println("GetSumString: " + result2);
     }

     // Method
     public static void callMyName () {
          int arr[][] = {
               {1,2,3,4},
               {1,2,3,4},
               {1,2,3,4}
          };

          for (int row[]: arr) {
               for (int col : row) {
                    System.out.print(col + " ");
               }
               System.out.println();
          }
     }

     // GetSum Method
     public static int getSum (int Number1, int Number2) {
          int Sum = Number1 + Number2;
          return Sum;
     }

     // GetSum Method String sam Name
     public static String getSum(String Fname, String Lname) {
          String Sum = Fname + Lname;
          return Sum;
     }
}
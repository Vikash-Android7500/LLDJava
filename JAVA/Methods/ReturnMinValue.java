package Methods;

public class ReturnMinValue {
     public static void main(String[] args) {
          int result = getMin(5, 8);
          System.out.println("MIN_Number: " + result);
     }

     /* write a return the minimum of 2 Numbers */
     public static int getMin (int Number1, int Number2) {
          if (Number1 < Number2) {
               return Number1;
          } else {
               return Number2;
          }
     }
}

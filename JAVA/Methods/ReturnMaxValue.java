package Methods;

public class ReturnMaxValue {
     public static void main(String[] args) {
          int result = getMax(10, 5);
          System.out.println("MAX_value: " + result);
     }

     /** Write to return the maximum of 2 Numbers */
     public static int getMax (int Number1, int Number2) {
          if (Number1 > Number2) {
               return Number1;
          } else {
               return Number2;
          }
     }
}

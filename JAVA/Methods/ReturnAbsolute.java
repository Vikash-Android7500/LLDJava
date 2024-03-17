package Methods;

public class ReturnAbsolute {
     public static void main(String[] args) {
          int result = getAbsolute(2);
          System.out.println("getAbsolute: " + result);
     }

     /** Write to return the absolute value of a Number */
     public static int getAbsolute (int Number) {
          if (Number >= 0) {
               return Number;
          } else {
               return (0 - Number);
          }
     }
}

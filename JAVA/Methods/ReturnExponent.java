package Methods;

public class ReturnExponent {
     public static void main(String[] args) {
          int result = getExponent(2, 5);
          System.out.println("2 ki power: " + result);
     }

     /* write to return the exponent of a number */
     public static int getExponent (int Number1, int Number2) {
          int ans = 1;
          for (int count = 1; count <= Number2; count++) {
               ans = ans * Number1;
          }
          return ans;
     }
}

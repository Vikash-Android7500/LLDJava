package Methods;

public class Returnfunction {
     public static void main (String[] args) {
          double result = getAvarage(5, 6);
          System.out.println("getAvarage: " + result);
     }

     /** Write to return the avarage of 2 Numbers */
     public static double getAvarage (int Number1, int Number2) {
          double avg = (Number1 + Number2) / 2;
          return avg;
     }
}

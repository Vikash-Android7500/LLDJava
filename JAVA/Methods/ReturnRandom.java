package Methods;

public class ReturnRandom {
     public static void main(String[] args) {
          double result = getRandom(5);
          System.out.println("Random Number: " + result);
     }

     /*Write to return a random value between 1 to Number */
     public static double getRandom (int Number) {
          return Math.random();
     }
}

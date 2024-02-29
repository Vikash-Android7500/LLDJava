public class DataType {
     public static void main(String[] args) {
          short number = 45;
          System.out.println("short Number: " + number);
          int number2 = number;
          System.out.println("int Number: " + number2);

          short item = (short) number2;
          System.out.println("int value to short covert: " + item);
     }
}
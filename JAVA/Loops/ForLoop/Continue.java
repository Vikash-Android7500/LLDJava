package Loops.ForLoop;

public class Continue {
     public static void main(String[] args) {
          for (int item = 1; item <= 10; item++) {

               if (item == 5) {
                    System.out.println("continue");
                    continue;
               } else {
                    System.out.println(item);
               } 
          }
     }
}

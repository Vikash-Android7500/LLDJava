package Loops.ForLoop;

public class Break {
     public static void main(String[] args) {
          byte[] marks = { 1, 2, 3, 4 };

          for (byte item = 0; item < marks.length; item++) {
               System.out.println(marks[item]);

               if (item == 2) {
                    System.out.println("Break");
                    break;
               }

          }
     }
}

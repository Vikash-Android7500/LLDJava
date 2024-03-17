package Arrays.MultiDimensional;

public class MultiArrayString {
     public static void main(String[] args) {
          String arr[][] = {
               {"vikash", "vk", "vicky"},
               {"Dell", "Shkod", "Nokia"},
               {"Ram", "Rama", "Ram Singh"},
               {"JavaScript", "Java", "python"},
          };

          // printing
          for (String[] col : arr) {
               System.out.println("_____________________");
               for (String Names : col) {
                    System.out.print( Names + " , ");
               }
               System.out.println("\n");
          }
     }
}

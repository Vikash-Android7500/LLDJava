import java.util.Scanner;

public class UserInput {
     public static void main(String[] args) {
          try (Scanner scan = new Scanner(System.in)) {
               System.out.println("Your Full Name: ");
               String Name = scan.nextLine();

               System.out.println("Your Age: ");
               int Age = scan.nextInt();

               System.out.println("Your Height: ");
               float Height = scan.nextFloat();

               System.out.println("Your Address: ");
               String address = scan.next();

               System.out.println("______________");

               System.out.println(
                         "My Name is:  "
                                   + Name + "\n"
                                   + "My Age:  " + Age + "\n"
                                   + "My Height:  " + Height + "\n"
                                   + "My Address:  " + address);
                     
               scan.close();                    

          }
     }
}

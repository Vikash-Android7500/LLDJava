public class Operators {
     public static void main(String[] args) {

          /**Arithmetric (+, -, /, %)
           * Relational  (>, <, >=, <=, ==, !=)
           * Logical     (&&, ||, !)
           * Bitwise     (will do later)
           * Assignment  (=, =+, -=, /=, %=)
           * Unary Incriment/Decriment (++, --)
           */

          // Arithmetric (+, -, /, %)
          int number = 10;
          int number2 = 4;
          System.out.println("Plus: " + (number + number2));
          System.out.println("Subtrction: " + (number - number2));
          System.out.println("Multiplay: " + (number * number2));
          System.out.println("Division: " + ((float) number / number2));
          System.out.println("Modulo: " + (number % number2));
          System.out.println("\n______________________");


          // Relational (>, <, >=, <=, ==, !=)
          int item1 = 10;
          int item2 = 20;
          System.out.println("LassThan: " + (item1 < item2));
          System.out.println("GraterThan: " + (item1 > item2));
          System.out.println("GraterThan Equl: " + (item1 >= item2));
          System.out.println("LessThen Equl: " + (item1 <= item2));
          System.out.println("Equl to: " + (item1 == item2));
          System.out.println("Not Equl: " + (item1 != item2));
          System.out.println("\n___________________");

          // Logical  (&&, ||, !)
          int button1 = 10;
          int button2 = 20;
          int button3 = 40;
          boolean covert1 = false;
          boolean covert2 = (button2 < button3);
          boolean covert3 = (button1 < button3);

          boolean answer1 = (covert1 && covert2 && covert3);
          boolean answer2 = (covert1 || covert2 || covert3);
          System.out.println("&& " + answer1);
          System.out.println("|| " + answer2);

          boolean answer3 = !covert1;
          System.out.println("Not !" + answer3);

          System.out.println("\n______________________");


          // * Bitwise     (will do later)   #TODO
          //  * Assignment  (=, +=, -=, /=, %=)
          int Age = 12;
          System.out.println("Plus Equl " + (Age += 2));
          System.out.println("Subtraction Equl " + (Age -= 3));
          System.out.println("Division Equl " + (Age /= 5));
          System.out.println("Mudulo " + (Age %= 4));
          System.out.println("\n_____________");



          // Unary Incriment/Decriment (++, --)
          int YourNumber = 5;
          System.out.println("Incriment Post: " + (YourNumber++));
          System.out.println("Incriment Pri: " + (++YourNumber));
          System.out.println("Decrimrnt");
          System.out.println("Decriment Post: " + (YourNumber--));
          System.out.println("Decriment Pri: " + (--YourNumber));


     }
}

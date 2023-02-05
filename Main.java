// functions
// Returntype Name() {

//} YOu can add parameters into the parenthesis
// access modifiers like public, private are used
// javac Main.java --> byte-code representation of the java file

// public class Main {
//     public static void main(String[] args){
//         System.out.println("Hello World");
//     }
// }


// public class Main {
//     public static void main(String[] args){
//         byte myAge = 30; // int
//         long viewsCount = 3_123_456_789L; //int   // underscores can be used to separate bigger values
//         float price = 10.99F; //double
//         char letter = 'A';  // always surround single characters with single quotes AND multiple characters with double quotes
//         boolean isEligible = false;
//     }
// }

// // import java.util.Date;

// public class Main {
//     public static void main(String[] args){
//         byte age = 30;
//         Date now = new Date();
//         System.out.println(now);  // you can type sout + tab as shortcut for System.out.println();

//     }
// }

//difference between premitive and reference variables
// primitive variables are independent of each other: changing one doesn't affect the other
// reference variables are dependent on each other: changing one affects the other

// //primitive

// public class Main{
//     public static void main(String[] args){
//         byte x = 1;
//         byte y = x;
//         x = 2;
//         System.out.println(y);  // we can verify in our console that changing x doesn't affect y
//     }
// }

// // reference

// import java.awt.*;
// public class Main{
//     public static void main(String[] args){
//         Point point1 = new Point(2,3);
//         Point point2 = point1;
//         point1.x = 5;
//         System.out.println(point2); // we can verify in our console that changing x in point1 affects the x in point2  
//     }
// }

// // strings in Java // NB: strings are reference types in Java
// public class Main{
//     public static void main(String[] args){
//         String message = "  Hello World" + "!! ";
//         //Boolean lam = message.endsWith("!!");
//         //Integer lam = message.length();
//         //Boolean lam = message.startsWith("!!");
//         //Integer lam = message.indexOf("orl");

//         // String lam = message.replace("!", "*"); // NB: original string is not modified. it just creates a new string
//         // System.out.println(message);
//         // String lam = message.toLowerCase();
//         // String lam = message.toUpperCase();
//         // String lam = message.trim();  // gets rid of whute spaces // test case: String message = "  Hello World" + "!! ";
//         System.out.println(lam); 
//     }
// }
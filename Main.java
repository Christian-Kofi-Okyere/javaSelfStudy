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

import java.util.Date;

public class Main {
    public static void main(String[] args){
        byte age = 30;
        Date now = new Date();
        System.out.println(now);  // you can type sout + tab as shortcut for System.out.println();
    }
}
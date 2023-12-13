import java.util.Scanner;

public class Methods {
    // 1. Method definition -- inert, doesn't do anything without a method call.
    // 2. Method definitions are always inside the `class` code block.
    // 3. Method definitions do not have to occur before a method call.

    public static String readRequiredString(String prompt) {
        // 4. Code from our original `main` method now lives here.
        Scanner console = new Scanner(System.in);
        String result;
        do {
            System.out.println(prompt);
            result = console.nextLine();
        } while (result.length() == 0);
        return result;
    }

    // DEFINE the method.
    // Always use "public static" for now
    public static String createHello(String value) {
        // The expression after the `return` keyword is the output.
        // It's type must match the declared output type.
        return "Hello, " + value;
    }

    public static int minimum(int a, int b, int c) {
        int min = Math.min(a, b);
        // The return expression is an `int`, which matches the output data type.
        return Math.min(c, min);
    }

    public static char randomLetter() {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        int index = (int) (Math.random() * 26);
        return letters.charAt(index);
    }

    // New keyword: `void`
    // Indicates that a method does NOT return a value.

    public static void reapeatPrintln(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }

    // Overloaded.
    // Signature: createFullName(String, String)
    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // Overloaded.
    // Signature: createFullName(String, String, String)
    public static String createFullName(String title, String firstName, String lastName) {
        // We can call the 3 argument version of createFullName
        // to reuse the logic
        return title + " " + createFullName(firstName, lastName);
    }

    public static void main(String[] args) {
//
//        // 5. Method call -- execute the method by providing a String argument.
//        // The method call is an expression which resolves to a String.
//        // We store the result in a String variable.
//        String firstName = readRequiredString("Enter your first name: ");
//        String lastName = readRequiredString("Enter your last name: ");
//        String favoriteFood = readRequiredString("What's your favorite food?: ");
//
//        System.out.println("First name   : " + firstName);
//        System.out.println("Last name    : " + lastName);
//        System.out.println("Favorite food: " + favoriteFood);
//
//        String name = "Guillermo";
//        // An argument can be a variable.
//        // Output can be stored in a variable.
//        String message = createHello(name);
//        System.out.println(message); // Hello, Guillermo
//
//        // An argument can be a literal.
//        message = createHello("Avivah");
//        System.out.println(message); // Hello, Avivah
//
//        String honorary = "Dr.";
//
//        // An argument can be any expression of the data type.
//        // Output can be used immediately as input to another method.
//        // Here, it's used as an input for the `println` method.
//        System.out.println(createHello(honorary + "Itch")); // Hello, Dr. Itch


//        int result = minimum(1, 2, 3);
//        System.out.println(result);                               // 1
//        System.out.println(minimum(1000, 0, -1000));    // -1000
//        System.out.println(minimum(255, 255, 255));       // 255

//        char letter = randomLetter();
//        System.out.println(letter);         //p (results vary because of randomness
//        System.out.println(randomLetter()); // k
//        System.out.println(randomLetter()); // r

//        System.out.println("Your garden:");
//        reapeatPrintln("hosta", 3);
//        reapeatPrintln("peony", 2);
//        reapeatPrintln("dandelion", 3);
//        reapeatPrintln("ghostflower", -9);

        // Pass 2 arguments
        String fullName = createFullName("Powell", "Tatters");
        System.out.println(fullName);                           // Powell Tatters

        String title = "Professor";
        String firstName = "Leisha";
        String lastName = "Yendle";

        // Pass 3 arguments.
        fullName = createFullName(title, firstName, lastName);
        System.out.println(fullName);                           // Professor Leisha Yendle

        // Pass 3 arguments.
        System.out.println(createFullName("Senator", "Ly", "De Lasci"));

    }
}

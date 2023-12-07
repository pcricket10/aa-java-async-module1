

public class Variables {                        // 1. A class
    public static void main(String[] args) {    // 2. The main method
        // we write our code here.        <--   // 3. Our code

        /* declaration statement
        [type name] [variable name];
         */
//====================================================================
//        int linesOfCode;    //declaration statement
//        linesOfCode = 227;  //assignment statement

//        int dogCount = 94;
//        int catCount = 112;
//        int petCount = dogCount + catCount;
//        System.out.println(petCount);   // 206
//====================================================================
//        int tacos = 12;
//        System.out.println(tacos); // 12
//
//        // no need to add `int` a second time.
//        tacos = 29;
//        System.out.println(tacos); // 29

// ====================================================================

//        int tacos = 17;
//        int hotdogs = 23;
//        int total = tacos + hotdogs;
//
//        System.out.println(total);  // 40
//
//        tacos = 22;
//        System.out.println(total);  // 40, total didn't change
//        System.out.println(tacos);  // 22, tacos changed
//
//        total = tacos + hotdogs;    // reassign to update the total
//        System.out.println(total);  // 45

// ====================================================================
//        byte b = 56;
//        short s = 1024;
//        int i = 314;
//
//        /* The following assignments fail
//        b = 1024;       // value is too big for a byte
//        s = 75000;      // too big for a short
//        i = 3000000000; // too big for an int
//         */

// ====================================================================

//        float f = 3.14f;
//        double d = 3.14;
//

// ====================================================================

//        // whole number types
//        byte b = 8;
//        short s = 16;
//        int i = 32;     // int literal
//        long lng = 64L; // long literal
//
//        // widening conversions (allowed)
//        s = b;      // a byte fits in a short
//        i = s;      // a short fits in an int
//        lng = i;    // an int fits in a long
//        lng = 32;   // `32` is an integer literal, it fits in a long
//
//         narrowing conversions (not allowed)
//         b = s; // compiler error: cannot convert from short to byte
//         s = i; //  compiler error: cannot convert from int to short
//         i = lng; //  compiler error: cannot convert from long to int
//
//        // floating-point types
//        float f = 32.0f;     // float literal
//        double d = 64.0;    // double literal
//
//        // widening conversion (allowed)
//        d = f;      // a float fits ihn a double
//        f = i;      // an int fits in a float
//        d = lng;    // a long fits in a double
//
//         narrowing conversions (not allowed)
//         i = f;   // compiler error: cannot convert from float to int
//         f = d;   // compiler error: cannot convert from double to float
//         lng = d; // compiler error: cannot convert from double to long

//====================================================================

//        float sum = 3.55f + 0.3f;   // sum is 3.85
//        float f = -0.33f;
//        float result = sum + f;     // result is 3.52
//
//        double value = 9.22 - 1.1;  // value is 8.12
//        double d = 3.32;
//        double result = value - d;  // result is 4.8
//        System.out.println(value);
//        System.out.println(result);
//
//        int product = 20 * 4;   // product is 80
//        int i = 3;
//        int result = product * i;   // result is 240
//
//        long value = 100L / 2L;     // value is 50
//        value = 100L / 3L;          //value is 33 without decimals
//                                    // whole number types `int` and `long` discard decimal results.
//                                    // the value is truncated.
//        long lng = 11;              // the literal `11` is an int but it fits in a long
//        long result = value / lng;  // result is 3

//        int remainder = 100 % 3;    // remainder is 1
//        remainder = 100 % 13;       // remainder is 9
//        int i = 3;
//        int result = remander % i;  // result is 0

//        int i = 25;
//        int result = 100 / (2 + 3) * i % (20 - 3);  // result is 7

//        int tacos; // Variable declaration is a statement.
//
//// We can't use the value of a declaration somewhere else
//// because a value isn't produced.
//// `int total = int tacos;` is a syntax error.
//
//        System.out.println("hello world"); // println is a method call that doesn't produce a value
//        // so it is a statement.
//        // Some methods _do_ produce a value, but println does not.
//
//// We can't use println's value somewhere else because a value isn't produced.
//// `int letterCount = System.out.println("hello world");`
//// is a complier error:
//// "Type mismatch: cannot convert void to int"

//        int teams = 8;                                               // assign the value 8 to the variable teams
//        int playersPerTeam = 12;                                     // assign the value 12 to the variable playersPerTeam
//        int coachesPerTeam = 2;                                      // assign the value 2 to the variable coachesPerTeam
//        int totalPeople = teams * (playersPerTeam + coachesPerTeam); // assign the value of the expression to totalPeople

//        int daysSinceAnAccident = 27;
//        daysSinceAnAccident++;
//        System.out.println(daysSinceAnAccident); // 28
//
//        int daysUntilHoliday = 64;
//        daysUntilHoliday--;
//        System.out.println(daysUntilHoliday); // 63
//        char a = 'a';
//        char x = 'X';
//        char one = '1'; // the character '1', not the value 1!

//        char singleQuote = '\''; // single quote
//        char newLine = '\n';     // the newline character (added by pressing Enter), not the letter n
//        char escape = '\\';      // the escape character must escape itself

//        boolean isFast = true;
//        boolean canFly = false;

//        boolean result = true && false; //result is false
//        result = false && false;         // result is false
//        result = false && true;         // result is false
//        result = true && true;          // result is true

//        boolean result = true || false;     // result is true
//        result = false || false;            // result is false
//        result = false || true;             // result is true
//        result = true || true;              // result is true

//        boolean result = !true; // result is false
//        result = !false;        // result is true

//        boolean yes = true;
//        boolean no = false;
//        boolean result = !(yes && no || (yes || true)); // result is false
//        result = !yes && no || (yes || true);           // result is true

//        int one = 1;
//        int negativeOne = -1;
//        boolean result = one == negativeOne;    // result is false
//        result = (one == 1);                    // result is true, grouping with parentheses is optional

//        boolean result = 1 < 25;    // result is true
//        result = 1 <= 0;            // result is false
//        result = 5 <= 5;            // result is true
//        result = 3.44 > 1.2;        // result is true
//        result = -5.55 >= -5.0;     // result is false
    }
}
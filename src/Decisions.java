import java.util.Scanner;

public class Decisions {
    public static void main(String[] args) {
//        if (true) {
//            System.out.println("It's true.");   // the expression is true so this runs
//        }
//        if (false) {
//            System.out.println("it's false.");  // the expression is false so this doesn't run
//        }
//        int milesPerHour = 67;
//        int speedLimit = 55;
//        boolean knowsOfficer = false;
//        if(milesPerHour > speedLimit) {
//            System.out.println("Officially, you're speeding");
//        }
//        if (milesPerHour > speedLimit + 5 && !knowsOfficer){
//            System.out.println("You get a speeding ticket.");
//        }
//        int milesPerHour = 67;
//        int speedLimit = 55;
//        if(milesPerHour > speedLimit) {
//            // the code block can be empty. it's not an error.
//            // an empty code block isn't that useful, though.
//        }
//        if (milesPerHour > speedLimit + 5){
//            System.out.println("Hmmmm...");
//            System.out.println("You get a speeding ticket.");
//            // we can declare new variables inside the block
//            int expensiveTicketThreshold = speedLimit + 15;

            // nested `if` statements are absolutely allowed.
            // this `if's` condition is only evaluated if its parent's condition is `true`
            // all code inside an `if's` code block is skipped if the condition is `false`.
//            if (milesPerHour > expensiveTicketThreshold) {
//                System.out.println("Worse, you get an expensive ticket.");
//                System.out.println("Better luck next time.");
//            }
//            boolean hasFeathers = true;
//            boolean likesCookies = true;
//
//            // BAD CODE
//            // Not accepted in this course
//            if (hasFeathers)
//                System.out.println("very stylish"); // single statement will execute if true
//
//            if (likesCookies)
//                System.out.println("yum"); // single statement, will execute if condition is true.
//            System.out.println("who doesn't like cookies?"); // this always executes because it's not officially part of the `if`
//            // only a single statement is allowed without curly braces.
//            // that's confusing.
//
//            // GOOD CODE
//            // meets the course coding standards.
//            if (hasFeathers) {
//                System.out.println("very stylish");
//            }
//            if (likesCookies) {
//                System.out.println("yum");
//            }
//            System.out.println("who doesn't like cookies?"); // it's now clear that this will always execute

//            int number = 17;
//
//            // without an else
//            // it works, but it is a little confusing
//            if (number % 2 == 0) {
//                System.out.println("even number");
//            }
//
//            if(number % 2 == 1) {
//                System.out.println("odd number");
//            }

        // with else
        // more clearly expresses the idea
//        int number = 17;
//
//        if (number % 2 == 0) {
//            System.out.println("even number");
//        } else {
//            System.out.println("odd number");
//        }
//        boolean canFly = true;
//        boolean hasFeathers = false;
//
//        if(canFly && hasFeathers) {
//            System.out.println("likely a bird");
//        } else {
//            System.out.println("may still fly or have feathers, but definitely not both");
//            if (canFly) {
//                System.out.println("a rocket?");
//                System.out.println("time?");
//            } else {
//                System.out.println("an ostrich?");
//                System.out.println("galoshes?");
//            }
//            if (hasFeathers) {
//                System.out.println("a penguin?");
//                System.out.println("a boa?");
//            }
//        }

//        double packageWeight = 0.55;
//
//        if (packageWeight > 100.0) {        // check first condition
//            System.out.println("too big for standard shipping");
//        } else if (packageWeight < 1.0) {   // check a second condition
//            System.out.println("too small. send a letter.");
//        } else {                            // the `else` clause executes if all other conditions are false.
//            System.out.println("can ship");
//        }
//        int place = 2;
//        String ribbonColor;
//        // 1. switch keyword, then an expression (often a variable) in parentheses
//        switch (place) {
//            case 1: // 2. case keyword, then a literal value, then colon.
//                    // if the switch's expression resolves to the case's value,
//                    // all code nested inside the case executes.
//                ribbonColor = "blue";
//                System.out.println("first place!");
//                break;  // 3. break keyword, immediately exits the switch's block
//            case 2:
//                ribbonColor = "red";
//                System.out.println("second place!");
//                break;
//            case 3:
//                ribbonColor = "white";
//                System.out.println("third place!");
//                break;
//            default:
//                ribbonColor = "unknown";
//        }
//        System.out.println(ribbonColor);
//        Scanner console = new Scanner(System.in);
//        System.out.println("Enter your patron level: ");
//        String patronLevel = console.nextLine()
//                .trim()
//                .toLowerCase();
        String color = "orange";
        switch (color) {
            case "red":
            case "yellow":
            case "blue":
                System.out.println("primary color");
                break;
            case "green":
            case "purple":
            case "orange":
                System.out.println("secondary color");
                break;
            default:
                System.out.println("regular color");
        }

    }


}


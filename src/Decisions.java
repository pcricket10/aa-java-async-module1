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
        int milesPerHour = 67;
        int speedLimit = 55;
        if(milesPerHour > speedLimit) {
            // the code block can be empty. it's not an error.
            // an empty code block isn't that useful, though.
        }
        if (milesPerHour > speedLimit + 5){
            System.out.println("Hmmmm...");
            System.out.println("You get a speeding ticket.");
            // we can declare new variables inside the block
            int expensiveTicketThreshold = speedLimit + 15;

            // nested `if` statements are absolutely allowed.
            // this `if's` condition is only evaluated if its parent's condition is `true`
            // all code inside an `if's` code block is skipped if the condition is `false`.
            if (milesPerHour > expensiveTicketThreshold) {
                System.out.println("Worse, you get an expensive ticket.");
                System.out.println("Better luck next time.");
            }

        }


    }
}

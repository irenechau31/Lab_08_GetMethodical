import java.util.Scanner;

import static java.lang.reflect.Array.getDouble;

public class CheckOut {
    public static void main(String[] args) {
        // Here (in main) is where we test our methods
        Scanner in = new Scanner(System.in);
        boolean hasmoreItems = true;
        double totalCost = 0.0;

        while (hasmoreItems) {
            double itemPrice = SafeInput.getRangedDouble(in, "Enter the price of the item ", 0.50, 10.00);
            totalCost += itemPrice;
            hasmoreItems = SafeInput.getYNConfirm(in, "Do you have more items? (Y/N): ");
        }
        //provides string formatting
        System.out.printf("Total cost of the item(S): $%.2f%n", totalCost);

    }
}
/*
        //PART E: METHOD TO READ DOUBLE IN RANGE
        public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
            double doubleInput = 0;
            String trash = "";
            boolean done = false;
            //Prompt to user
            do {
                System.out.println(prompt + "within [" + low + "-" + high + "]:");
                if (pipe.hasNextDouble()) // if user input integer
                {
                    doubleInput = pipe.nextDouble();//read input
                    // Check if the input in the given range
                    if (doubleInput >= low && doubleInput <=high) {
                        done = true;
                    }
                    else
                    {
                        System.out.println("You must enter a value in range [" + low + " - " + high + "]: " + doubleInput);
                    }
                } else {
                    trash = pipe.nextLine();
                    System.out.println("Enter a valid double, not: " + trash);
                }
            } while (!done);
            return doubleInput;
        }// End of getRangeDouble();

        // PART F: METHOD TO READ Y/N
        public static boolean getYNConfirm(Scanner pipe, String prompt){
            String input = "";
            boolean validInput;
            do {
                System.out.println(prompt);
                input = pipe.nextLine();
                validInput = input.equals("y") || input.equals("Y") || input.equals("n") || input.equals("N");
                if (!validInput) {
                    System.out.println("Invalid input. Please enter among y, Y, n, and N");
                }
            }
            while (!validInput) ;
            return input.equalsIgnoreCase("y");
        }
    }

 */



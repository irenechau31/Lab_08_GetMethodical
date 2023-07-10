import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        // Here (in main) is where we test our methods
        Scanner in = new Scanner(System.in);

        int favNum = SafeInput.getInt(in, "Enter your favorite integer");
        System.out.println("You said your favorite number is: " + favNum);
        double favDouble = SafeInput.getDouble(in, "Enter your favorite double");
        System.out.println("You said your favorite double is: " + favDouble);
    } // End of main
}
    /**
     * Get an integer value from the user with no constraints
     *
     *
     * @param pipe Scanner to use for input
     * @param prompt User prompt
     * @return an int value provided by the user
     */
    /*
    public static int getInt(Scanner pipe, String prompt)
    {
        int integerInput = 0;
        String trash = "";
        boolean done = false;
        //Prompt to user
        do {
            System.out.println(prompt);
            if (pipe.hasNextInt()) // if user input integer
            {
                integerInput = pipe.nextInt();//read input
                pipe.nextLine(); //clear the buffer
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("Enter a valid integer, not: " + trash);
            }
        } while (!done);
        return integerInput;
    }// end of getInt

    public static double getDouble(Scanner pipe, String prompt)
    {
        double doubleInput = 0.0;
        String trash = "";
        boolean done = false;
        //Prompt to user
        do {
            System.out.println(prompt);
            if (pipe.hasNextDouble()) // if user input double
            {
                doubleInput = pipe.nextDouble();//read input
                pipe.nextLine(); //clear the buffer
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Enter a valid double, not: " + trash);
            }
        } while (!done);
        return doubleInput;
    }//end of getDouble();
}

     */

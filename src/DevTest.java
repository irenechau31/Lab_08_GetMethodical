import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        // Here (in main) is where we test our methods
        Scanner in = new Scanner(System.in);

        String userName = SafeInput.getNonZeroLengthString(in, "Enter you user name");
        System.out.println("You said your name is: " + userName);

        int ageAny = SafeInput.getInt(in, "Enter your age");
        System.out.println("You said your age is: " + ageAny);

        int favNum = SafeInput.getRangedInt(in, "Enter your favorite number", 1, 10);
        System.out.println("You said your favorite number is: " + favNum);

        double favDouble = SafeInput.getDouble(in, "Enter your favorite double");
        System.out.println("You said your favorite double is: " + favDouble);

        double pickDouble = SafeInput.getRangedDouble(in, "Pick a double in range ", 0, 24);
        System.out.println("Picked double is: " + pickDouble);

        boolean answerTF = SafeInput.getYNConfirm(in, "Is this True");
        System.out.println("Answer: " + answerTF);

        String getSSN = SafeInput.getRegExString(in, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("SSN number: " + getSSN);
    }  // End of main
}


    // method definition go after main within the class

    /**   // <= this is a special javadoc comment block.  You need one before each method to document it
     * Gets a String from the user that has to be at least one character or more
     *
     * @param pipe Scanner to use for input set to the console with System.in
     * @param prompt the prompt for the user the methods adds the ": " and uses System.print
     * @return  After looping until the user enters something a non zero String...
     */
    /*
    // METHOD getNonZeroLenString
    public static String getNonZeroLengthString(Scanner pipe, String prompt) {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do {
            System.out.print(" " + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
            if(retString.length() == 0)
            {
                System.out.println("You must enter some characters!");
            }
        } while (retString.length() == 0);
        return retString;
    }

    /**
     * Get an integer value from the user with no constraints
     *
     *
     * @param pipe Scanner to use for input
     * @param prompt User prompt
     * @return an int value provided by the user
     */
    //METHOD getInt TO READ INTEGER FROM CONSOLE
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


    /**
     * Get an integer value from the user within a specified inclusive low - high range
     *
     *
     * @param pipe Scanner to use for input
     * @param prompt User prompt
     * @param low    low value for the range
     * @param high   high value for the range
     * @return an int value provided by the user within the specified range
     */
    //METHOD getRangedInt TO READ INT BETWEEN RANGE
    /*
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int input = 0;
        String trash = "";
        boolean done = false;
        //Prompt to user
        do {
            System.out.println(prompt + " as integer [" + low + "-" + high + "]:");
            if (pipe.hasNextInt()) // if user input integer
            {
                input = pipe.nextInt();//read input
                // Check if the input in the given range
                if (input >= low && input <= high) {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a value in range [" + low + " - " + high + "]: " + input);
                }
            }  else {
                trash = pipe.nextLine();
                System.out.println("Enter a valid integer, not: " + trash);
            }
        } while (!done);
        return input;
    }// End of getRangedInt();

    /**
     * Get an double value from the user with no constraints
     *
     *
     * @param pipe Scanner to use for input
     * @param prompt User prompt
     * @return a double value provided by the user
     */
    //METHOD TO READ DOUBLE
    /*
    public static double getDouble(Scanner pipe, String prompt) {
        double doubleInput = 0.0;
        String trash = "";
        boolean done = false;
        //Prompt to user
        do {
            System.out.println(prompt);
            if (pipe.hasNextDouble()) // if user input integer
            {
                doubleInput = pipe.nextDouble();//read input
                pipe.nextLine(); //clear the buffer
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("Enter a valid double, not: " + trash);
            }
        } while (!done);
        return doubleInput;
    }//end of getDouble();


    /**
     * Get an double value from the user within a speciied inclusive low - high range
     *
     *
     * @param pipe Scanner to use for input
     * @param prompt User prompt
     * @param low    low value for the range
     * @param high   high value for the range
     * @return an int value provided by the user within the specified range
     */
    //METHOD getRangedDouble TO READ DOUBLE IN RANGE
    /*
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double doubleInput = 0;
        String trash = "";
        boolean done = false;
        //Prompt to user
        do {
            System.out.println(prompt + "[" + low + "-" + high + "]:");
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

    // METHOD getYNConfirm TO READ Y/N
    public static boolean getYNConfirm(Scanner pipe, String prompt){
        String input = "";
        boolean validInput;
        do {
            System.out.println(prompt);
            input = pipe.nextLine();
            validInput = input.equals("y") || input.equals("Y")||input.equals("n")||input.equals("N");
            if (!validInput) {
                System.out.println("Invalid input. Please enter among y, Y, n, and N");
            }
        }
        while (!validInput) ;
        return input.equalsIgnoreCase("y");
    }


    // getRegExStringmethod to return String which matches to given regEx
    public static String getRegExString(Scanner pipe, String prompt, String regExPattern)
    {
        String value = "";
        boolean gotAValue = false;

        do
        {// show the prompt
            System.out.print(prompt + ": ");
            value = pipe.nextLine();  // input the data
            // test to see if it is correct
            if(value.matches(regExPattern))
            {// We have a match this String passes!
                gotAValue = true;
            }
            else
            {
                System.out.println("Invalid input: " + value);
            }
        }while(!gotAValue);
        return value;
    }
}

     */

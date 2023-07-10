import java.util.Scanner;
//Use the getRangedInt method to input the year (1950-2015),
// month (1-12), Day*, hours (1 – 24),
// Minutes (1-59) of a person’s birth.
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthYear = SafeInput.getRangedInt(in, "Enter your birth year", 1950, 2015);
        System.out.println("Your birth year: " + birthYear);
        int birthMonth = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);
        System.out.println("Your birth month: " + birthMonth);
        int birthDate = numberOfDays(birthMonth);
        System.out.println("You said your birth date is: " + birthDate);
        int birthHours = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);
        System.out.println("You said your birth hour is: " + birthHours);
        int birthMinutes = SafeInput.getRangedInt(in, "Enter your birth minute", 1, 59);
        System.out.println("You said your birth minute is: " + birthMinutes);
    }
    // End of main

    public static int numberOfDays(int month) {
        Scanner in = new Scanner(System.in);
        int day;
        switch (month) {
            case 2: // February
                day = SafeInput.getRangedInt(in, "Enter the day", 1, 29);
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                day = SafeInput.getRangedInt(in, "Enter the day", 1, 30);
                break;
            default:
                day = SafeInput.getRangedInt(in, "Enter the day", 1, 31);
                break;
        }
        return day;
    }
}


    /**
     * Get an integer value from the user within a specified inclusive low - high range
     *
     * @param pipe   Scanner to use for input
     * @param prompt User prompt
     * @param low    low value for the range
     * @param high   high value for the range
     * @return an int value provided by the user within the specified range
     */
/*
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int input = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.println(prompt + " as integer [" + low + "-" + high + "]:");
            if (pipe.hasNextInt())// if user input integer
            {
                input = pipe.nextInt();//read integer input
                // Check if the integer input in the given range
                if (input >= low && input <= high) {
                    done = true;
                } else {
                    System.out.println("You must enter a value in range [" + low + " - " + high + "]: " + input);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("Enter a valid integer, not: " + trash);
            }
        } while (!done);
        return input;
    }

 */

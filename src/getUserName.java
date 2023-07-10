import java.util.Scanner;

public class getUserName {
    public static void main(String[] args) {
        // Here (in main) is where we test our methods
        Scanner in = new Scanner(System.in);

        String userName = getNonZeroLengthString(in, "Enter you user name");
        System.out.println("You said your name is: " + userName);
    }
    /**   // <= this is a special javadoc comment block.  You need one before each method to document it
     * Gets a String from the user that has to be at least one character or more
     *
     * @param pipe Scanner to use for input set to the console with System.in
     * @param prompt the prompt for the user the methods adds the ": " and uses System.print
     * @return  After looping until the user enters something a non zero String...
     */
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
}

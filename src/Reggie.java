//Use your getRegExString method several times.
// get a SSN from the user using this pattern: ^\\d{3}-\\d{2}-\\d{4}$
// get a UC Student M number using this pattern ^(M|m)\\d{5}$
// get a menu choice using this pattern ^[OoSsVvQq]$
//**these letters are mnemonics for the menu choices Open Save View Quit
// Do several test runs FOR EACH PATTERN with strings that match and fail.
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
public class Reggie {
    static String menu = "O - Open  S - Save V - View Q - Quit";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String socialSecurityNumber = SafeInput.getRegExString(in, "Enter your SSN (XXX-XX-XXXX)", "\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN number: " + socialSecurityNumber);
        String studentID = SafeInput.getRegExString(in, "Enter your UC Student M number (MXXXXX)", "^(M|m)\\d{5}$");
        System.out.println("UC Student M number: " + studentID);
        System.out.println("Menu choices: " + menu);
        String menuChoice = SafeInput.getRegExString(in, "Enter menu choice (O, S, V, Q) ", "^[OoSsVvQq]$");
        System.out.println("Entered menu choice: " + menuChoice);

        boolean done = false;
        do
        {
            // display menu
            System.out.println(menu);
            // [HhMmFfQq] regex for this menu
            // INPUT the menu choice check withthe regex
            menuChoice = in.nextLine();
            menuChoice = menuChoice.toUpperCase();
            switch(menuChoice)
            {
                case "O":
                    openDisplay();
                    break;
                case "S":
                    System.out.println("Save Choices!");
                    break;
                case "V":
                    System.out.println(menu);
                    break;
                case "Q":
                    System.out.println("Goodbye!!!");
                    System.exit(0);
                    break;
            }
        }while(!done);
    }

    private static void openDisplay()
    {
        for(int h=1; h < 1000; h++)
        {
            System.out.println("OPEN!");
        }
    }
}
    /*
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

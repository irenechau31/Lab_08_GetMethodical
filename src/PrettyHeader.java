public class PrettyHeader {
    public static void main(String[] args) {
        SafeInput.prettyHeader("Message Centered Here");
    }
}
    /*
    public static void prettyHeader(String msg) {
        int totalWidth = 60;
        int msgLength = msg.length();
        int spaceCount = (totalWidth - msgLength - 6) / 2; // Calculate space for centering the message

        // Print the top line of stars
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();

        // Print the second line with centered message
        System.out.print("***");
        for (int i = 0; i < spaceCount; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < spaceCount; i++) {
            System.out.print(" ");
        }
        // If the message length is odd, add one more space for even padding
        if (msgLength % 2 != 0) {
            System.out.print(" ");
        }
        System.out.println("***");

        // Print the bottom line of stars
        for (int i = 0; i < totalWidth; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

     */

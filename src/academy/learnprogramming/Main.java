package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        // char primitive holds only one character
        // Occupies 16 bits (two bytes), a width of 16
        // Allows for storage of Unicode Characters (65535 characters)
        char myChar = 'D';
        char myUnicodeChar = '\u0044';  // Unicode

        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        char myCopyrightChar = '\u00A9';  // Unicode
        System.out.println(myCopyrightChar);


        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        // Variable nomenclature
        boolean isCustomerOverTwentyOne = true;

    }
}

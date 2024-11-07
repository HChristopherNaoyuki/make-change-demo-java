package Solution;

import static java.lang.System.out;

public class MakeChange
{
    public static void main(String[] args)
    {
        // Total amount in cents
        int total = 99;  // For example, 3444 cents equals $34.44

        // Calculate the number of quarters (25 cents)
        int quarters = total / 25;  // Integer division gives the number of quarters
        int whatsLeft = total % 25;  // Remainder after taking out quarters

        // Calculate the number of dimes (10 cents)
        int dimes = whatsLeft / 10;  // Integer division gives the number of dimes
        whatsLeft = whatsLeft % 10;  // Remainder after taking out dimes

        // Calculate the number of nickels (5 cents)
        int nickels = whatsLeft / 5;  // Integer division gives the number of nickels
        whatsLeft = whatsLeft % 5;  // Remainder after taking out nickels

        // The remaining amount is all in cents (1 cent)
        int cents = whatsLeft;  // What's left after quarters, dimes, and nickels are taken out

        // Print the result
        out.println(
                "From the total " + total + " cents, you have: \n" + 
                quarters + " quarters \n" + 
                dimes + " dimes \n" + 
                nickels + " nickels \n" + 
                cents + " cents"
        );
    }
}

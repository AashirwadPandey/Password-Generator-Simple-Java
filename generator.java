// Welcome to Simple Password Generator (Java) By Aashirwad Pandey
// First Started: November 6th, 2022
// Version: 0.00.1 BETA

// Importing Package
import java.util.Random;

public class PasswordGenerator 
{
    public static void main(String[] args)
    {
        int length = 10; // The Generated Password's Length
        System.out.println(generatePswd(length));
    }
    static char[] generatePswd(int len)
    {
        System.out.println("Your Generated Password is:");
        String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; // Capital Characters List      
        String chars = "abcdefghijklmnopqrstuvwxyz"; // Small Characters List
        String nums = "0123456789"; // Numbers List
        String symbols = "!@#$%^&*_=+-/€.?<>)"; // Symbols

        String passSymbols = charsCaps + chars + nums + symbols;
        Random rnd = new Random(); // Password Generation Algorithm
        
        char[] password = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) // loop to generate Password
        {
            password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length()));
            
        }
        return password; // Generated Password
    }
}

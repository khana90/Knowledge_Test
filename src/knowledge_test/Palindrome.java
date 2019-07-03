package knowledge_test;
import java.util.Scanner;


public class Palindrome
{
    public static void main(String args[])
    {
        String a, b = ""; //declration of a and b variables which is = to zero
        Scanner s = new Scanner(System.in);//read the next line of strings ..input
        System.out.print("Enter the string you want to check:");
        a = s.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        if(a.equalsIgnoreCase(b)) // if they are of the same length and corresponding characters in the two strings are equal ignoring case
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }
}
/**
 * Displays the users name
 * @author Alisha
 */

import java.util.Scanner;

public class StringManipulation
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String word= in.nextLine();
        System.out.println(word.charAt(0));

        int index=word.indexOf(" ");
        System.out.println(word.substring(0,index));

        System.out.println(word.substring(index+1,word.length()));
        System.out.println(word.substring(4,7));

    }
}
 
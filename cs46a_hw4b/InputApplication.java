
/**
 * Displays the users favorite dessert
 *
 * @author Alisha
 */

import java.util.Scanner;

public class InputApplication
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a your favorite dessert: ");
        String word = in.nextLine();
        System.out.println(word.charAt(word.length()-1));
        
        System.out.print("Enter a double: ");
        double number1 = in.nextDouble();
        
        System.out.print("Enter an integer: ");
        int number2 = in.nextInt();
        
        System.out.print("Product: ");
        System.out.println(number1 * number2);
  
        System.out.print("Integer portion: ");
        int product= (int)(number1 * number2);
        System.out.println(product);
        

    }
}


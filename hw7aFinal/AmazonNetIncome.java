import java.util.Scanner;
/**
 * Write a description of class AmazonNetIncome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AmazonNetIncome
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int income = 0;
        int low = 0;
        int counter = 0;
        double sum = 0;
        double average = 0;
        int profit = 0;
        System.out.print("Enter net income or Q to quit: ");
        if (in.hasNextInt())
        {
            while(in.hasNextInt())
            {
                income = in.nextInt();
                if (counter == 0)
                {
                    low = income;
                }
                if (income > 0)
                {
                    profit ++;
                }
                if (income < low)
                {
                    low = income;
                }
                counter++;
                sum += income;
                System.out.print("Enter net income or Q to quit: ");
            }
            average = sum/counter;
            System.out.println(profit);
            System.out.println(low);
            System.out.println(average);

        }
        else {
           System.out.println("No values entered");

    }
    }
}

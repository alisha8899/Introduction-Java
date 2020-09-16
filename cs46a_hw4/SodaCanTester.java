/**
 * Tester for SodaCan class
 * 
 * @author Kathleen O'Brien
 */
public class SodaCanTester
{
   public static void main(String[] args)
   {
       SodaCan pepsi = new SodaCan();
       System.out.println("Radius: " + pepsi.getRadius());
       System.out.println("Expected: 1.2109 "); 
       
       System.out.println("Height: " + pepsi.getHeight());
       System.out.println("Expected: 4.704"); 
    }
}
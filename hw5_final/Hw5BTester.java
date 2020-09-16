/**
 * Test the error checking in SodaCan amd ElectricCar
 *
 * @author (Kathleen O'Brien)
 */
public class Hw5BTester
{
    public static void main(String[] args)
    {
        //testing SodaCan
        SodaCan pepsi = new SodaCan(2, -6);
        System.out.println("Dimensions: " + pepsi.getRadius()
            + ", " + pepsi.getHeight());
        System.out.println("Expected: 1.2109,  4.704"); 

        SodaCan coke = new SodaCan(0, 6);
        System.out.println("Contents: " + coke.getContents());
        System.out.println("Expected: 12.006923229266999");     
        
        coke = new SodaCan(-2, 5);
        System.out.println("Contents: " + coke.getContents());
        System.out.println("Expected: 12.006923229266999");
        
        coke = new SodaCan(2, 0);
        System.out.println("Contents: " + coke.getContents());
        System.out.println("Expected: 12.006923229266999");

        SodaCan drPepper = new SodaCan(2, 6);         
        drPepper.drink(10);
        drPepper.drink(5.0);
        System.out.println("Contents: " + drPepper.getContents());
        System.out.println("Expected: 26.779102293798665");  
        
        coke = new SodaCan();
        System.out.println("Default contents: " + coke.getContents());
        System.out.println("Expected: 12.006923229266999");  
        
        //Testing ElectricCar
        ElectricCar leaf = new ElectricCar("Leaf", 0);
        System.out.println(leaf.getMake());
        System.out.println("Expected: Leaf");
        
        System.out.println(leaf.getMaxRange());
        System.out.println("Expected: 100");
        leaf.charge();
        leaf.drive(50);
        leaf.drive(25);
        System.out.println(leaf.getCurrentRange());
        System.out.println("Expected: 25");
        leaf.drive(30);
        System.out.println(leaf.getCurrentRange());
        System.out.println("Expected: 0");
        
        ElectricCar car = new ElectricCar("Tessla",350);
        System.out.println(car.getMake());
        System.out.println("Expected: Tesla");
        
        car = new ElectricCar("Bolt", 200);
        System.out.println(car.getMaxRange());
        System.out.println("Expected: 200");
        
    }
}
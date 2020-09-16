/**
 * Models an electric car which has a range and can be recharged
 */
public class ElectricCar
{
    private static final int DEFAULT_MAXRANGE = 100;
    private String make;
    private int maxRange;
    private int currentRange;
    
    
    /**
     * Constructs an Electric car having the given range
     * @param theMake the type of car
     * @param theMaxRange the number of miles the car can go on a full charge.
     * 
     */
    public ElectricCar(String theMake,int theMaxRange)
    {
        currentRange = 0;
        make = theMake;
        maxRange = DEFAULT_MAXRANGE;
        
        //error checking on the max range and make
        
        if (maxRange <= 0)
        {
            maxRange = DEFAULT_MAXRANGE;
        }
        if (make.equals("Tessla"))
        {
            make = "Tesla";
        }
    }

    /**
     * Charges the ElectricCar to its maximum range. It can not be charged above the maximum.
     */
    public void charge()
    {
        currentRange = maxRange;
    }

    /**
     * Drives the car the specified distance. This reduces the current range. 
     * @param miles the number of miles to drive
     */
    public void drive(int miles)
    {
        
        currentRange = currentRange - miles;
        if(miles > currentRange)
        {
            currentRange = 0;
        }
    }

    /**
     * Gets the make of this ElectricCare
     */
    public String getMake()
    {
        return make;
    }

    /**
     * Gets the number of miles the car can go on the current charge
     * @return the number of miles the car can go on the current charge
     * 
     */
    public int getCurrentRange() 
    {
        return currentRange;
    }

    /**
     * Gets the maximum number of miles the car can go when fully charged 
     * @return the maximum range
     */
    public int getMaxRange() 
    {
        return maxRange;
    }
}
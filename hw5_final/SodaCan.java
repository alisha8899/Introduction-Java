/**
 * Models a SodaCan 
 * 
 * @author Kathleen O'Brien
 */
public class SodaCan
{
    public static final double DEFAULT_RADIUS = 1.2109;
    public static final double DEFAULT_HEIGHT = 4.704;
    public static final double FLUID_OUNCES_PER_CUBIC_INCHES = 0.554112554;

    private double radius;
    private double height;
    private double fluid;
    private double contents;

    /**
     * Constructs a  SodaCan with the default radius  and default height
     */
    public SodaCan()
    {
        radius = DEFAULT_RADIUS;
        height = DEFAULT_HEIGHT;
        fluid = FLUID_OUNCES_PER_CUBIC_INCHES;
        contents = getCapacity();
        contents = Math.PI*radius*radius*height;
        contents = contents * FLUID_OUNCES_PER_CUBIC_INCHES;
    }

    /**
     * Constructs a SodaCan
     * @param r the radius of rhis can
     * @param h the height of this can
     */
    public SodaCan(double r, double h)
    {
        radius = r;
        height = h;
        if (radius >0 && height >0)
        {
            contents = getCapacity();
        }
        else 
        {
            radius = 1.2109;
            height = 4.704;
            contents = Math.PI * DEFAULT_RADIUS * DEFAULT_RADIUS * DEFAULT_HEIGHT* FLUID_OUNCES_PER_CUBIC_INCHES;
           
        }
    }

    //helper method to calculate the capacity
    private double getCapacity()
    {
        double volume = Math.PI * radius * radius * height;
        double volumeInFlOz = volume * FLUID_OUNCES_PER_CUBIC_INCHES;
        return volumeInFlOz;
    }

    /**
     * Gets the radius of this can
     * @return the radius
     */
    public double getRadius()
    {
        return radius;
    }

    /**
     * Gets the height of this can
     * @return the height of this SodaCan
     */
    public double getHeight()
    {
        return height;
    }

    /**
     * Gets the current contendts of the SodaCan
     * @return the amount left in the SodaCan
     */
    public double getContents()
    {
        return contents;
    }

    /**
     * Removes the specified number of ousce from the SodaCan
     * @param ounces the number of ounces to remove
     */
    public void drink(double ounces)
    {
        contents = contents - ounces;
    }
}
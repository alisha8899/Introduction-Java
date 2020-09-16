
/**
 * Models a SodaCan
 *
 * @author Alisha
 */
public class SodaCan
{
    // instance variables - replace the example below with your own
    public static final double DEFAULT_RADIUS = 1.2109;
    public static final double DEFAULT_HEIGHT = 4.704;
    public static final double FLUID_OUNCES_PER_CUBIC_INCHES = 0.554112554;
    
    private double radius;
    private double height;
    private double fluid;
    private double contents;

    /**
     * Makes a soda can with a radius and height 
     */
    public SodaCan()
    {
        // initialise instance variable  
        radius = 1.2109;
        height = 4.704;
        fluid = FLUID_OUNCES_PER_CUBIC_INCHES;
        
        contents = Math.PI*radius*radius*height*fluid;
        
    }
    /**
     * Makes a soda can with a radius and a height
     * @param radius is the radius of the soda can
     * @param height is the height of the soda can
     */
    public SodaCan(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
        fluid = FLUID_OUNCES_PER_CUBIC_INCHES;
        
        contents = Math.PI*radius*radius*height*fluid;
    }
    
    /**
     * Gets the radius of the can
     * @return the radius of the can 
     */
    public double getRadius()
    {
        return radius;
    }
    /** 
     * Gets the height of the can
     * @return the height of the can
     */
    public double getHeight()
    {
        return height;
    }
    public void drink(double FLUID_OUNCES_PER_CUBIC_INCHES)
    {
        contents = contents - FLUID_OUNCES_PER_CUBIC_INCHES;
    }
    public double getContents()
    {
        return contents;
    }
    
    

}

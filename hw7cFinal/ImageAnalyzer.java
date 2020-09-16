/**
 * Creating a constructor that analyzes a graphical image
 *
 * @Alisha

 */
public class ImageAnalyzer
{
    private Picture cat;

    public ImageAnalyzer(Picture pic)
    {
        cat = pic;

    }

    /**
     * Get the pixel count of the picture cat
     * @return the number of pixel count in the cat picture
     */
    public int pixelCount()
    {
        int pixelCount = cat.getWidth() * cat.getHeight();
        return pixelCount;

    }

    /**
     * Get the orientation of the picture cat whether it is portrait or landscape
     * @return the orientation of the picture
     */
    public String orientation()
    {
        int height = cat.getWidth();
        int width = cat.getHeight();

        if (height >= width)
        {
            return "landscape";
        }
        else 
        {
            return "portrait";

        }
    }

    public int redCount()
    {
        int redPixels = 0;
        for (int width = 0; width < cat.getWidth(); width++)
        {
            for (int height = 0; height < cat.getHeight(); height++)
            {
                Color atPixels = cat.getColorAt(width, height);
                if (atPixels.getRed()>200)
                {
                    redPixels++;
                }
            }
        }
        return redPixels;
    }

    public void makeHazy()
    {
        Color hazy = Color.WHITE;
        for (int width = 0; width < cat.getWidth(); width++)
        {
            for (int height = 0; height < cat.getHeight(); height++)
            {
                if (height%2 ==0)
                {
                    cat.setColorAt(width, height, hazy);
                }
            }
        }

    }
}
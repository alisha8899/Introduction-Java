import java.util.Random;
/**
 * An application drawing a night sky with stars and a moon
 */
public class NightSky
{
    public static void main(String[] args)
    {
        final int MAX_X = 400;
        final int MAX_Y = 300;
        final int MIN_X = 0;
        final int MIN_Y = 0;
        final int NUMBER_OF_STARS = 50;
        final int DIAMETER_OF_STAR = 3;
        final int DIAMETER_OF_MOON = 20;
        Random gen = new Random(98745678);

        Rectangle firstRectangle = new Rectangle(MIN_X, MIN_Y, MAX_X, MAX_Y);
        firstRectangle.setColor(Color.DARK_GRAY);
        firstRectangle.fill();
        
        Ellipse minStar = new Ellipse(0, MAX_Y, 0, 0);
        //int minStarX = minStar.getX();
        //int minStarY = minStar.getY();

        
        for (int i = 0; i < NUMBER_OF_STARS; i++)
        {
            int x = gen.nextInt(MAX_X);
            int y = gen.nextInt(MAX_Y);
            Ellipse ellipse1 = new Ellipse(x, y, DIAMETER_OF_STAR, DIAMETER_OF_STAR);
            ellipse1.setColor(Color.WHITE);
            ellipse1.fill();
            
            if (minStar.getY() > ellipse1.getY())
            {
                minStar = ellipse1;
            }
        }
        Ellipse moon = new Ellipse(minStar.getX(), minStar.getY(), DIAMETER_OF_MOON, DIAMETER_OF_MOON);
        moon.setColor(Color.LIGHT_GRAY);
        moon.fill();
    }
}

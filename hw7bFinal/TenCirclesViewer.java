/**
 * Draws multiple circles between two lines 
 *
 * @Alisha
 */
public class TenCirclesViewer
{
    public static void main(String [] args)
    {
        int x = 5;
        int y = 10;
        int r = 10;
        
        Line vertical = new Line(x, y, x, 200);
        vertical.setColor(Color.RED);
        vertical.draw();
        
        Line horizontal = new Line(x, y, 200, y);
        horizontal.setColor(Color.RED);
        horizontal.draw();
        
        for (int i = 1; i <= 10; i++)
        {
        Ellipse zero = new Ellipse(x, y, 2 * (r*i), 2 * (r*i));
        zero.setColor(Color.BLACK);
        zero.draw();
    }
    }
}
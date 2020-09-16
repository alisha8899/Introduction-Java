public class Crow
{
    public static void main(String[] args)
    {
        Picture crow = new Picture("crow.png");
        crow.grow(75,62);
        crow.translate(100,75);
        crow.draw();
    }
}
public class Rectangle{
    private double length,width;
    private String color;

    public Rectangle(String color, double length,double width)
    {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    public double getArea()
    {
        return length*width;
    }
}

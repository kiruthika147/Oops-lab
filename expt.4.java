import java.util.*;

abstract class Shape
{
    public int x, y;

    public abstract void printArea();
}

class Rectangle1 extends Shape
{
    public void printArea()
    {
        float area;
        area = x * y;
        System.out.println("Area of Rectangle is " + area);
    }
}

class Triangle extends Shape
{
    public void printArea()
    {
        float area;
        area = (x * y) / 2;
        System.out.println("Area of Triangle is " + area);
    }
}

class Circle extends Shape
{
    public void printArea()
    {
        float area;
        area = (22 * x * x) / 7;
        System.out.println("Area of Circle is " + area);
    }
}

public class Shapes
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter values : ");

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        Rectangle1 r = new Rectangle1();
        r.x = x1;
        r.y = y1;
        r.printArea();

        Triangle t = new Triangle();
        t.x = x1;
        t.y = y1;
        t.printArea();

        Circle c = new Circle();
        c.x = x1;
        c.printArea();
    }
}
Output:
D:\JavaPrograms>java Shapes

Enter values :
7
8

Area of Rectangle is 56.0
Area of Triangle is 28.0
Area of Circle is 154.0
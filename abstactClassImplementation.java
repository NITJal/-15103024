package assignment;

abstract class shape
{
	abstract void numberOfSides();
}
class Hexagon extends shape
{private int n=6;
	void numberOfSides()
	{
		System.out.println("no. of sides of hexagon =6 ");
	}
}

class Trapezoid extends shape
{private int n=4;
	void numberOfSides()
	{
		System.out.println("no. of sides of trapezoid= 4 ");
	}
}
class Triangle extends shape
{
	void numberOfSides()
	{
		System.out.println("no. of sides of triangle = 3");
	}
}
public class abstactClassImplementation{
public static void main(String as[])
{
	shape o=new Hexagon();
	o.numberOfSides();
	o=new Trapezoid();
	o.numberOfSides();
	o=new Triangle();
	o.numberOfSides();
	
}

}

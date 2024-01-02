import java.util.Scanner;

abstract class shape
{
	int a,b;
	abstract void printarea();
	abstract void input();
    Scanner s=new Scanner(System.in);
}
class rectangle extends shape
{
	void input()
  {
	System.out.println("Enter the length and breadth");
	a=s.nextInt();
 	b=s.nextInt();
  }

	void printarea()
  {
	System.out.println("The area of rectangle is:"+(a*b)+" "+"square units\n");
  }
}
class triangle extends shape
{
	void input()
  {
	System.out.println("Enter the base and height");
	a=s.nextInt();
 	b=s.nextInt();
  }

	void printarea()
  {
	System.out.println("The area of triangle is:"+((a*b)/2)+" "+"square units\n");
  }
}
class circle extends shape
{
	void input()
  {
	System.out.println("Enter the radius");
	a=s.nextInt();
  }

	void printarea()
  {
	System.out.println("The area of circle is:"+(3.14*a*a)+" "+"square units");
  }
}

class area
{
	public static void main(String args[])
    {
		rectangle r=new rectangle();
        r.input();
		r.printarea();
		
		triangle t=new triangle();
		t.input();
		t.printarea();

		circle c=new circle();
		c.input();
		c.printarea();
	}
}
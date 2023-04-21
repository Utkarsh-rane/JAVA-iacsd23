/*
 * 5. Create a class Point with data members as x,y.  Write 
getters and setters for all the data members. Also add the display function. Create the object of
 this class in main method and invoke all the methods in that class*/

package usr2;

public class Point {
	private double x,y;
	public void acceptPoints(double xx,double yy)
	{
		x=xx;
		y=yy;
	}
	public void  display()
	{
		System.out.println("X ="+x+" Y ="+y);
	}
	public void setX(double xx)
	{
		x=xx;
	}
	public double getx()
	{
		return x;
	}
	public void sety(double yy)
	{
		y=yy;
	}
	public double gety()
	{
		return y;
	}

}

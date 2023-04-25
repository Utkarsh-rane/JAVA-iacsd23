/*Task 1
Create a  class Point2D  , under package "com.cdac.geometry" for representing a point in x-y co-ordinate system.

1.1 Create a parameterized constructor to accept x & y co-ords.

1.2 Add public String show()) --to return point's x & y co-ords

1.3 Add isEqual method to Point2D class : boolean returning method : must return 
true if both points are having same x,y co-ords 
or false otherwise.

1.4 Add a method , calculateDistance , to calc distance between 2 points
Hint : use distance formula.

1.5  Create a driver  class(for UI)  , in the "tester" package "TestPoints" ,
 with main(..)

Ask user , how many points to plot? :
Create suitable array.

1.6  Accept x,y co-ordinates for all the points n store it suitably.
1.7  Display x,y co-ordinates of all the points plotted so far ,using for-each loop.
1.8  Accept 2 indices from user .
Find out if the points at these indices are same or different (Hint : isEqual)
Print the message accordingly. 
If points are not same , display distance between these 2 points.


*/
package com.cdac.geometry;
import java.lang.Math;

public class Point2D {
	private double x;

	private double y;
public Point2D()
{
	
}
	public Point2D(double x, double y) {
		this.x = x;
		this.y= y;

	}

	public String show() {
		return x + " " + y;
	}

	public boolean isEqual(Point2D p1,Point2D p2) {

		boolean b = false;
		if (p1.x == p2.x && p1.y==p2.y) {
			b = true;
			return b;
		} 
		else 
		{
			return b;
		}
	}

	public double calculateDistance(Point2D p1, Point2D p2) {

		double d = Math.sqrt(((p2.x - p1.x) * (p2.x - p1.x)) + ((p2.y - p1.y) * (p2.y - p1.y)));
		return d;
	}
}

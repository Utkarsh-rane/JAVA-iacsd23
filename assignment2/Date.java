/*1:Create Date class with members day,month ,year.
Write no argument and parameterised constructor .Create two objects and initialize them using no argument and parameterised constructor
respectively.Print date using display function.*/

package usr2;

public class Date {
  private int day;
  private int month;
  private int year;
  public Date() {
	  this.day = 0;
		this.month = 0;
		this.year = 0;
  }
  public Date(int day, int month, int year) {

	this.day = day;
	this.month = month;
	this.year = year;
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
  public void Display()
  {
	  System.out.println("date is "+this.day+"/"+this.month+"/"+this.year);
  }
  
}

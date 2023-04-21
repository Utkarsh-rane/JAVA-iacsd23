/*6. Create a class ComplexNumber with data members real, imaginary.  Write getters and 
 * setters for all the data members. Also add the display function. Create the object of 
 * this class in main method and invoke all the methods in that class.*/

package usr2;

public class complexNumber {
private int real,imaginary;
public void AcceptComlexNum(int re, int in)
{
	real=re;
	imaginary=in;
	
}
public void Display()
{
	System.out.println("complex number is:"+real+"+"+imaginary+"i");
}
public void setReal(int r)
{
	real=r;
}
public int getReal()
{
	return real;
}
public void setimaginary(int i)
{
	imaginary=i;
}
public int getimaginary()
{
	return imaginary;
}

}

/*4:  Create a class Book with data members as bname,id,author,price. Write getters and setters for all the data members. Also add the display function.  
Create the object of this class in main method and invoke all the methods in that class.*/
package usr2;

public class book {
private int id;
private String bname, author;
private double price;

public void acceptData(int i, String book, String aut, double pr)
{
	id=i;
	bname=book;
	author=aut;
	price=pr;
}
    public void display()
    {
    System.out.println("book id is :"+id);	
    System.out.println("book name is :"+bname);
    System.out.println("name of author is :"+author);
    System.out.println("price of book :"+price+"rs");
    }
    public void setname(String name)
    {
    	bname=name;
    }
    public String getname()
    {
    	return bname;
    }
    public void setprice(double price1)
    {
    	price=price1;
    }
    public double getprice()
    {
    	return price;
    }
    
}

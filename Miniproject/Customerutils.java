package utils;


import java.util.ArrayList;
import java.util.List;
//import  utils.CustomerValidationRule.*;
import static utils.CustomerValidationRule.ValidateAll;
import com.app.customer.Customer;



public class Customerutils {
	
    public static List<Customer> customer(){	
	//SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
    	try {
		List<Customer> cust= new ArrayList<>();
 
 
	 cust.add( ValidateAll("utkarsh","rane","utkarsh@gmail","utks",2000.00,"2001-03-02","gold",cust));
     cust.add(ValidateAll("ram","Girhe","ram@","ram",10000.00, "2001-02-17","platinum",cust));
     cust.add(ValidateAll("aniket","gonajare","aniket@","aniket",1000.00, "2000-12-12","silver",cust));
     cust.add(ValidateAll("darshan","patil","darshan@","darshan",10000.00,  "2001-02-12","platinum",cust));
     cust.add(ValidateAll("nikhil","bhosale","nikhil@","nikhil",2000.00, "2000-12-12","gold",cust));
     cust.add(ValidateAll("balaji","gaphat","balaji@","balaji",2000.00, "2000-05-14","gold",cust));
     return cust;
	}catch (Exception e) {
		e.printStackTrace();
	}
		return null;

}
    }
